/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.generator

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import sdu.mdsd.restful.restControllerGeneration.Add
import sdu.mdsd.restful.restControllerGeneration.Attribute
import sdu.mdsd.restful.restControllerGeneration.Comparison
import sdu.mdsd.restful.restControllerGeneration.Conjunction
import sdu.mdsd.restful.restControllerGeneration.Disjunction
import sdu.mdsd.restful.restControllerGeneration.Div
import sdu.mdsd.restful.restControllerGeneration.Entity
import sdu.mdsd.restful.restControllerGeneration.EntityModel
import sdu.mdsd.restful.restControllerGeneration.ExternalDef
import sdu.mdsd.restful.restControllerGeneration.ExternalUse
import sdu.mdsd.restful.restControllerGeneration.IntExp
import sdu.mdsd.restful.restControllerGeneration.Mul
import sdu.mdsd.restful.restControllerGeneration.Name
import sdu.mdsd.restful.restControllerGeneration.RelEQ
import sdu.mdsd.restful.restControllerGeneration.RelGT
import sdu.mdsd.restful.restControllerGeneration.RelGTE
import sdu.mdsd.restful.restControllerGeneration.RelLT
import sdu.mdsd.restful.restControllerGeneration.RelLTE
import sdu.mdsd.restful.restControllerGeneration.RelationalOp
import sdu.mdsd.restful.restControllerGeneration.Sub
import sdu.mdsd.restful.services.RestControllerGenerationGrammarAccess.LogicExpElements
import sdu.mdsd.restful.restControllerGeneration.Controller
import sdu.mdsd.restful.restControllerGeneration.CreateMethod
import sdu.mdsd.restful.restControllerGeneration.GetMethod
import sdu.mdsd.restful.restControllerGeneration.ListMethod
import sdu.mdsd.restful.restControllerGeneration.UpdateMethod
import sdu.mdsd.restful.restControllerGeneration.DeleteMethod
import java.util.ArrayList
import sdu.mdsd.restful.restControllerGeneration.LogicRequirement
import sdu.mdsd.restful.restControllerGeneration.Requirement
import sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class RestControllerGenerationGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
		val em = resource.allContents.filter(EntityModel).next
		System::out.println("Model:")
		em.display
		em.generateExternalInterface(fsa)
		em.generateModelFiles(fsa)
		em.generateControllerFiles(fsa)
		em.generateEntityApplicationInterfaces(fsa)
	}
	
	def display(EObject model) {
  		val res = new XMLResourceImpl
  		res.contents.add(EcoreUtil::copy(model))
  		System::out.println("Dump of model:")
  		res.save(System.out, null);
	}
	
	// ***************************
	// ***** Generate models *****
	def generateModelFiles(EntityModel model, IFileSystemAccess2 fsa) {
		model.declarations.filter(Entity).forEach[generateEntity(fsa)]
	}
	def generateEntity(Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		fsa.generateFile(model.name+ "/Models/" + entity.name + ".cs", '''
		using System;
		
		namespace «model.name».Models {
			public class «entity.name» «IF entity.base !== null»: «entity.base.name» «ENDIF»{
				«entity.generateConstructor»
				«entity.generateAttributes»
				«entity.generateAttributeRequirements»
			}
		}
		''')
	}
	
	def generateAttributes(Entity entity) '''
		«IF entity.base === null»
		protected readonly IExternalCode ExternalCode;
		«ENDIF»
		«FOR x:entity.declarations.filter(Attribute)»
			«x.generateAttribute»
		«ENDFOR»
	'''
	def generateAttribute(Attribute attribute) '''
		public «attribute.type.name» «attribute.name» { get; }
	'''
	
	def generateConstructor(Entity entity) '''
		public «entity.name»(«entity.generateConstructorParameters») «IF entity.base !== null»: base(«entity.base.generateConstructorParametersWithoutType») «ENDIF» {
			«IF entity.base === null»
			ExternalCode = externalCode;
			«ENDIF»
			«FOR x:entity.declarations.filter(Attribute)»
				«x.generateConstructorSet»
			«ENDFOR»
			CheckRequirements();
		}
	'''
	def generateConstructorParameters(Entity entity) '''«entity.externCodeCtorParameter»«FOR x:entity.allAttributes SEPARATOR ', '»«x.generateConstructorParameter»«ENDFOR»'''
	def generateConstructorParametersWithoutType(Entity entity) '''«entity.externCodeCtorParameterWithoutType»«FOR x:entity.allAttributes SEPARATOR ', '»«x.generateConstructorParameterWithoutType»«ENDFOR»'''
	def externCodeCtorParameter(Entity entity) '''IExternalCode externalCode«IF entity.allAttributes.size > 0», «ENDIF»'''
	def externCodeCtorParameterWithoutType(Entity entity) '''externalCode«IF entity.allAttributes.size > 0», «ENDIF»'''
	def generateConstructorParameter(Attribute attribute) '''«attribute.type.name» «attribute.name.toFirstLower»'''
	def generateConstructorParameterWithoutType(Attribute attribute) '''«attribute.name.toFirstLower»'''
	def generateConstructorSet(Attribute attribute) '''
		this.«attribute.name» = «attribute.name.toFirstLower»;
	'''
	
	// *******************************************
	// ***** Generate attribute requirements *****
	def generateAttributeRequirements(Entity entity) '''
		public void CheckRequirements() {
			«FOR x:entity.declarations.filter(Attribute).filter[a | a.requires !== null]»
				if(!(«x.requires.generateAttributeRequirement(x)»)) throw new Exception("Requirement not fulfilled");
			«ENDFOR»
			«FOR x:entity.declarations.filter(Requirement)»
				if(!(«x.requirement.generateRequirement()»)) throw new Exception("Requirement not fulfilled");
			«ENDFOR»
		}
	'''
	def dispatch generateAttributeRequirement(ExternalUse requirement, Attribute attribute) '''ExternalCode.«requirement.external.name»(«attribute.name»)'''
	def dispatch generateAttributeRequirement(LogicRequirement requirement, Attribute attribute) '''«requirement.logic.generateLogic»'''
	
	def dispatch generateRequirement(LogicRequirement requirement) '''«requirement.logic.generateLogic»'''
	def dispatch generateRequirement(ExternalUseOfAttribute requirement) '''ExternalCode.«requirement.external.name»(«requirement.attribute.name»)'''
	
	def dispatch CharSequence generateLogic(Disjunction x) '''(«x.left.generateLogic»||«x.right.generateLogic»)'''
	def dispatch CharSequence generateLogic(Conjunction x) '''(«x.left.generateLogic»&&«x.right.generateLogic»)'''
	def dispatch CharSequence generateLogic(Comparison x) '''(«x.left.generateExp»«x.op.generateOp»«x.right.generateExp»)'''
	
	def generateOp(RelationalOp op) {
		switch op {	RelEQ: '==' RelLT: '<' RelGT: '>' RelLTE: '<=' RelGTE: '>=' }
	}
	
	def dispatch CharSequence generateExp(Add x) '''(«x.left.generateExp»+«x.right.generateExp»)'''
	def dispatch CharSequence generateExp(Sub x) '''(«x.left.generateExp»-«x.right.generateExp»)'''
	def dispatch CharSequence generateExp(Mul x) '''(«x.left.generateExp»*«x.right.generateExp»)'''
	def dispatch CharSequence generateExp(Div x) '''(«x.left.generateExp»/«x.right.generateExp»)'''
	def dispatch CharSequence generateExp(Name x) { x.varName.name }	
	def dispatch CharSequence generateExp(IntExp x) { Integer.toString(x.value) }
	
	// ******************************************************
	// ***** Generate external interface for validation *****
	def generateExternalInterface(EntityModel em, IFileSystemAccess2 fsa) {
		fsa.generateFile(em.name + "/IExternalCode.cs", '''
			namespace «em.name» {
				public interface IExternalCode {
					«FOR x:em.declarations.filter(ExternalDef)»
						public bool «x.name»(«x.type.name» parameter);
					«ENDFOR»
				}
			}
		''')
	}
	
	// ********************************
	// ***** Generate controllers *****
	def generateControllerFiles(EntityModel em, IFileSystemAccess2 fsa) {
		em.declarations.filter(Controller).forEach[generateController(fsa)]
	}
	def generateController(Controller controller, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(controller, EntityModel)
		fsa.generateFile(model.name+ "/Controllers/" + controller.name + ".cs", '''
		using EmTest.Models;
		using EmTest.Application.Interfaces;
		using EmTest.Application.Parameters;
		using Microsoft.AspNetCore.Http;
		using Microsoft.AspNetCore.Mvc;
		using System.Collections.Generic;
		using System.Net;
		
		namespace «model.name».Controllers {
			[Route("api/[controller]")]
		    [Produces("application/json")]
		    [Consumes("application/json")]
			public class «controller.name» : ControllerBase {
				«controller.generateControllerConstructor»
				«FOR x:controller.methods»
					«x.generateControllerMethod(controller.entity)»
				«ENDFOR»
			}
		}
		''')
	}
	
	def generateControllerConstructor(Controller controller) '''
		private readonly I«controller.entity.name»Service Service;
		
		public «controller.name»(I«controller.entity.name»Service service)
		{
		    Service = service;
		}
	'''
	
	// ***************************************
	// ***** Generate controller methods *****
	def dispatch generateControllerMethod(CreateMethod method, Entity entity) '''
		[HttpPost]
		[ProducesResponseType(StatusCodes.Status201Created)]
		public ActionResult<«entity.name»> Create(Create«entity.name»Parameters parameters)
		{
			return Created("", Service.Create(parameters));
		}
	'''
	def dispatch generateControllerMethod(GetMethod method, Entity entity) '''
		[HttpGet("{«method.entityId.name.toFirstLower»}")]
		[ProducesResponseType(typeof(«entity.name»), (int) HttpStatusCode.OK)]
		public ActionResult<«entity.name»> Get(«method.entityId.type.name» «method.entityId.name.toFirstLower»)
		{
		    return Ok(Service.Get(new Get«entity.name»Parameters
		    {
		    	«method.entityId.name» = «method.entityId.name.toFirstLower»
			}));
		}
	'''
	def dispatch generateControllerMethod(ListMethod method, Entity entity) '''
		[HttpGet]
		[ProducesResponseType(typeof(«entity.name»[]), (int) HttpStatusCode.OK)]
		public ActionResult<IList<«entity.name»>> List()
		{
		    return Ok(Service.List(new List«entity.name»Parameters()));
		}
	'''
	def dispatch generateControllerMethod(UpdateMethod method, Entity entity) '''
		[HttpPut("{«method.entityId.name.toFirstLower»}")]
		[ProducesResponseType(typeof(«entity.name»), (int) HttpStatusCode.OK)]
		public ActionResult<«entity.name»> Update(«method.entityId.type.name» «method.entityId.name.toFirstLower», Update«entity.name»Parameters parameters)
		{
			return Ok(Service.Update(new Update«entity.name»ParametersWithId
			{
				«method.entityId.name» = «method.entityId.name.toFirstLower»,
				Parameters = parameters
			}));
		}
	'''
	def dispatch generateControllerMethod(DeleteMethod method, Entity entity) '''
		[HttpDelete("{«method.entityId.name.toFirstLower»}")]
		[ProducesResponseType((int) HttpStatusCode.OK)]
		public ActionResult Delete(«method.entityId.type.name» «method.entityId.name.toFirstLower»)
		{
		    return Ok(Service.Delete(new Delete«entity.name»Parameters
		    {
		    	«method.entityId.name» = «method.entityId.name.toFirstLower»
			}));
		}
	'''
	
	// ********************************************
	// ***** Generation application interface *****
	def generateEntityApplicationInterfaces(EntityModel em, IFileSystemAccess2 fsa) {
		em.declarations.filter(Entity).forEach[generateEntityApplicationInterface(fsa)]
		em.declarations.filter(Entity).forEach[generateEntityApplicationParameters(fsa)]
	}
	def generateEntityApplicationInterface(Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		val Controller controller = model.declarations.filter(Controller).findFirst[c | c.entity === entity]
		
		if(controller === null) {
			return
		}
		
		fsa.generateFile(model.name + "/Application/Interfaces/I" + entity.name + "Service.cs", '''
			using System.Collections.Generic;
			using EmTest.Application.Parameters;
			using EmTest.Models;
			
			namespace «model.name».Application.Interfaces {
				public interface I«entity.name»Service {
					«FOR x:controller.methods»
						«x.generateServiceMethod(entity)»
					«ENDFOR»
				}
			}
		''')
	}
	def dispatch generateServiceMethod(CreateMethod method, Entity entity) '''
		public «entity.name» Create(Create«entity.name»Parameters parameters);
	'''
	def dispatch generateServiceMethod(GetMethod method, Entity entity) '''
		public «entity.name» Get(Get«entity.name»Parameters parameters);
	'''
	def dispatch generateServiceMethod(ListMethod method, Entity entity) '''
		public IList<«entity.name»> List(List«entity.name»Parameters parameters);
	'''
	def dispatch generateServiceMethod(UpdateMethod method, Entity entity) '''
		public «entity.name» Update(Update«entity.name»ParametersWithId parameters);
	'''
	def dispatch generateServiceMethod(DeleteMethod method, Entity entity) '''
		public void Delete(Delete«entity.name»Parameters parameters);
	'''
	
	// *******************************************
	// ***** Generate application parameters *****
	def generateEntityApplicationParameters(Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		val Controller controller = model.declarations.filter(Controller).findFirst[c | c.entity === entity]
		
		if(controller === null) {
			return
		}
		
		controller.methods.forEach[generateControllerParameters(entity, fsa)]
	}
	def dispatch generateControllerParameters(CreateMethod method, Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		fsa.generateFile(model.name + "/Application/Parameters/Create" + entity.name + "Parameters.cs", '''
			namespace «model.name».Application.Parameters {
				public class Create«entity.name»Parameters {
					«FOR x:entity.allAttributes»
					«IF !method.exclude.attributes.contains(x)»
					public «x.type.name» «x.name» { get; set; }
					«ENDIF»
					«ENDFOR»
				}
			}
		''')
	}
	def dispatch generateControllerParameters(GetMethod method, Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		fsa.generateFile(model.name + "/Application/Parameters/Get" + entity.name + "Parameters.cs", '''
			namespace «model.name».Application.Parameters {
				public class Get«entity.name»Parameters {
					public «method.entityId.type.name» «method.entityId.name» { get; set; }
				}
			}
		''')
	}
	def dispatch generateControllerParameters(ListMethod method, Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		fsa.generateFile(model.name + "/Application/Parameters/List" + entity.name + "Parameters.cs", '''
			namespace «model.name».Application.Parameters {
				public class List«entity.name»Parameters {
				}
			}
		''')
	}
	def dispatch generateControllerParameters(UpdateMethod method, Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		fsa.generateFile(model.name + "/Application/Parameters/Update" + entity.name + "Parameters.cs", '''
			namespace «model.name».Application.Parameters {
				public class Update«entity.name»ParametersWithId {
					public «method.entityId.type.name» «method.entityId.name» { get; set; }
					public Update«entity.name»Parameters Parameters { get; set; }
				}
				public class Update«entity.name»Parameters {
					«FOR x:entity.declarations.filter(Attribute)»
					«IF x !== method.entityId»
					public «x.type.name» «x.name» { get; set; }
					«ENDIF»
					«ENDFOR»
				}
			}
		''')
	}
	def dispatch generateControllerParameters(DeleteMethod method, Entity entity, IFileSystemAccess2 fsa) {
		val EntityModel model = EcoreUtil2.getContainerOfType(entity, EntityModel)
		fsa.generateFile(model.name + "/Application/Parameters/Delete" + entity.name + "Parameters.cs", '''
			namespace «model.name».Application.Parameters {
				public class Delete«entity.name»Parameters {
					public «method.entityId.type.name» «method.entityId.name» { get; set; }
				}
			}
		''')
	}
	
	// *******************************
	// ***** Inheritance methods *****
	def getAllAttributes(Entity entity) {
		val attributes = new ArrayList<Attribute>
		var currentBase = entity
		while(currentBase !== null) {
			attributes.addAll(currentBase.declarations.filter(Attribute))
			currentBase = currentBase.base
		}
		return attributes
	}
	
	def static getAllAttributesStatic(Entity entity) {
		return (new RestControllerGenerationGenerator).getAllAttributes(entity)
	}
}
