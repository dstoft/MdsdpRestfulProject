/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.validation

import sdu.mdsd.restful.restControllerGeneration.Entity
import sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage.Literals
import java.util.HashSet
import java.util.Set
import org.eclipse.xtext.validation.Check
import static sdu.mdsd.restful.generator.RestControllerGenerationGenerator.getAllAttributesStatic
import sdu.mdsd.restful.restControllerGeneration.Attribute
import org.eclipse.xtext.EcoreUtil2
import sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RestControllerGenerationValidator extends AbstractRestControllerGenerationValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					RestControllerGenerationPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkEntityNoCyclicBase(Entity entity) {
		val seen = new HashSet<String>
		seen.add(entity.name)
		if(entity.base.selfInherits(seen)) {
			error('Cyclic base relation',Literals.ENTITY__BASE,"cyclicInheritance")
		}
	}
	
	def boolean selfInherits(Entity next, Set<String> seen) {
		if(next===null) false
		else if(seen.contains(next.name)) true
		else { seen.add(next.name) next.base.selfInherits(seen) }
	}
	
	@Check
	def checkNoDuplicateAttribute(Attribute attribute) {
		val entity = EcoreUtil2.getContainerOfType(attribute, Entity)
		val baseAttributes = getAllAttributesStatic(entity.base)
		if(baseAttributes.exists[name == attribute.name]) {
			error('Duplicate attribute name from base',Literals.ATTRIBUTE__NAME,"duplicateName")
		}
	}
	
	@Check
	def checkRequirementType(ExternalUseOfAttribute requirement) {
		if(requirement.external.type !== requirement.attribute.type) {
			error('Type mismatch between external function and attribute', Literals.EXTERNAL_USE_OF_ATTRIBUTE__ATTRIBUTE, 'typeMismatch')
		}
	}
	
}
