/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import sdu.mdsd.restful.restControllerGeneration.Add;
import sdu.mdsd.restful.restControllerGeneration.Attribute;
import sdu.mdsd.restful.restControllerGeneration.AttributeRequirement;
import sdu.mdsd.restful.restControllerGeneration.Comparison;
import sdu.mdsd.restful.restControllerGeneration.Conjunction;
import sdu.mdsd.restful.restControllerGeneration.Controller;
import sdu.mdsd.restful.restControllerGeneration.CreateMethod;
import sdu.mdsd.restful.restControllerGeneration.CreateMethodExclude;
import sdu.mdsd.restful.restControllerGeneration.CreateMethodWith;
import sdu.mdsd.restful.restControllerGeneration.DeleteMethod;
import sdu.mdsd.restful.restControllerGeneration.Disjunction;
import sdu.mdsd.restful.restControllerGeneration.Div;
import sdu.mdsd.restful.restControllerGeneration.Entity;
import sdu.mdsd.restful.restControllerGeneration.EntityModel;
import sdu.mdsd.restful.restControllerGeneration.ExternalFunction;
import sdu.mdsd.restful.restControllerGeneration.GetMethod;
import sdu.mdsd.restful.restControllerGeneration.IntExp;
import sdu.mdsd.restful.restControllerGeneration.ListMethod;
import sdu.mdsd.restful.restControllerGeneration.Mul;
import sdu.mdsd.restful.restControllerGeneration.Name;
import sdu.mdsd.restful.restControllerGeneration.RelEQ;
import sdu.mdsd.restful.restControllerGeneration.RelGT;
import sdu.mdsd.restful.restControllerGeneration.RelGTE;
import sdu.mdsd.restful.restControllerGeneration.RelLT;
import sdu.mdsd.restful.restControllerGeneration.RelLTE;
import sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage;
import sdu.mdsd.restful.restControllerGeneration.Sub;
import sdu.mdsd.restful.restControllerGeneration.Type;
import sdu.mdsd.restful.restControllerGeneration.UpdateMethod;
import sdu.mdsd.restful.services.RestControllerGenerationGrammarAccess;

@SuppressWarnings("all")
public class RestControllerGenerationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RestControllerGenerationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RestControllerGenerationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RestControllerGenerationPackage.ADD:
				sequence_Exp(context, (Add) semanticObject); 
				return; 
			case RestControllerGenerationPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case RestControllerGenerationPackage.ATTRIBUTE_REQUIREMENT:
				sequence_AttributeRequirement(context, (AttributeRequirement) semanticObject); 
				return; 
			case RestControllerGenerationPackage.COMPARISON:
				sequence_Comparison(context, (Comparison) semanticObject); 
				return; 
			case RestControllerGenerationPackage.CONJUNCTION:
				sequence_Conjunction(context, (Conjunction) semanticObject); 
				return; 
			case RestControllerGenerationPackage.CONTROLLER:
				sequence_Controller(context, (Controller) semanticObject); 
				return; 
			case RestControllerGenerationPackage.CREATE_METHOD:
				sequence_CreateMethod(context, (CreateMethod) semanticObject); 
				return; 
			case RestControllerGenerationPackage.CREATE_METHOD_EXCLUDE:
				sequence_CreateMethodExclude(context, (CreateMethodExclude) semanticObject); 
				return; 
			case RestControllerGenerationPackage.CREATE_METHOD_WITH:
				sequence_CreateMethodWith(context, (CreateMethodWith) semanticObject); 
				return; 
			case RestControllerGenerationPackage.DELETE_METHOD:
				sequence_DeleteMethod(context, (DeleteMethod) semanticObject); 
				return; 
			case RestControllerGenerationPackage.DISJUNCTION:
				sequence_LogicExp(context, (Disjunction) semanticObject); 
				return; 
			case RestControllerGenerationPackage.DIV:
				sequence_Factor(context, (Div) semanticObject); 
				return; 
			case RestControllerGenerationPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case RestControllerGenerationPackage.ENTITY_MODEL:
				sequence_EntityModel(context, (EntityModel) semanticObject); 
				return; 
			case RestControllerGenerationPackage.EXTERNAL_FUNCTION:
				sequence_ExternalFunction(context, (ExternalFunction) semanticObject); 
				return; 
			case RestControllerGenerationPackage.GET_METHOD:
				sequence_GetMethod(context, (GetMethod) semanticObject); 
				return; 
			case RestControllerGenerationPackage.INT_EXP:
				sequence_IntExp(context, (IntExp) semanticObject); 
				return; 
			case RestControllerGenerationPackage.LIST_METHOD:
				sequence_ListMethod(context, (ListMethod) semanticObject); 
				return; 
			case RestControllerGenerationPackage.MUL:
				sequence_Factor(context, (Mul) semanticObject); 
				return; 
			case RestControllerGenerationPackage.NAME:
				sequence_Name(context, (Name) semanticObject); 
				return; 
			case RestControllerGenerationPackage.REL_EQ:
				sequence_RelationalOp(context, (RelEQ) semanticObject); 
				return; 
			case RestControllerGenerationPackage.REL_GT:
				sequence_RelationalOp(context, (RelGT) semanticObject); 
				return; 
			case RestControllerGenerationPackage.REL_GTE:
				sequence_RelationalOp(context, (RelGTE) semanticObject); 
				return; 
			case RestControllerGenerationPackage.REL_LT:
				sequence_RelationalOp(context, (RelLT) semanticObject); 
				return; 
			case RestControllerGenerationPackage.REL_LTE:
				sequence_RelationalOp(context, (RelLTE) semanticObject); 
				return; 
			case RestControllerGenerationPackage.SUB:
				sequence_Exp(context, (Sub) semanticObject); 
				return; 
			case RestControllerGenerationPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			case RestControllerGenerationPackage.UPDATE_METHOD:
				sequence_UpdateMethod(context, (UpdateMethod) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AttributeRequirement returns AttributeRequirement
	 *
	 * Constraint:
	 *     logic=LogicExp
	 */
	protected void sequence_AttributeRequirement(ISerializationContext context, AttributeRequirement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.ATTRIBUTE_REQUIREMENT__LOGIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.ATTRIBUTE_REQUIREMENT__LOGIC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeRequirementAccess().getLogicLogicExpParserRuleCall_1_0(), semanticObject.getLogic());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=[Type|ID] (requirement=AttributeRequirement | requirement=ExternalFunction)?)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicExp returns Comparison
	 *     LogicExp.Disjunction_1_1 returns Comparison
	 *     Conjunction returns Comparison
	 *     Conjunction.Conjunction_1_1 returns Comparison
	 *     Comparison returns Comparison
	 *
	 * Constraint:
	 *     (left=Exp op=RelationalOp right=Exp)
	 */
	protected void sequence_Comparison(ISerializationContext context, Comparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.COMPARISON__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.COMPARISON__LEFT));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.COMPARISON__OP));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.COMPARISON__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.COMPARISON__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getComparisonAccess().getOpRelationalOpParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getComparisonAccess().getRightExpParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LogicExp returns Conjunction
	 *     LogicExp.Disjunction_1_1 returns Conjunction
	 *     Conjunction returns Conjunction
	 *     Conjunction.Conjunction_1_1 returns Conjunction
	 *
	 * Constraint:
	 *     (left=Conjunction_Conjunction_1_1 right=Comparison)
	 */
	protected void sequence_Conjunction(ISerializationContext context, Conjunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.CONJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.CONJUNCTION__LEFT));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.CONJUNCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.CONJUNCTION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Controller
	 *     Controller returns Controller
	 *
	 * Constraint:
	 *     (name=ID super=[Controller|ID]? entity=[Entity|ID] methods+=MethodDef*)
	 */
	protected void sequence_Controller(ISerializationContext context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CreateMethodExclude returns CreateMethodExclude
	 *
	 * Constraint:
	 *     attribute=[Attribute|ID]
	 */
	protected void sequence_CreateMethodExclude(ISerializationContext context, CreateMethodExclude semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.CREATE_METHOD_EXCLUDE__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.CREATE_METHOD_EXCLUDE__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCreateMethodExcludeAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RestControllerGenerationPackage.Literals.CREATE_METHOD_EXCLUDE__ATTRIBUTE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CreateMethodWith returns CreateMethodWith
	 *
	 * Constraint:
	 *     (entity=[Entity|ID] entityId=[Attribute|ID])
	 */
	protected void sequence_CreateMethodWith(ISerializationContext context, CreateMethodWith semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.CREATE_METHOD_WITH__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.CREATE_METHOD_WITH__ENTITY));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.CREATE_METHOD_WITH__ENTITY_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.CREATE_METHOD_WITH__ENTITY_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCreateMethodWithAccess().getEntityEntityIDTerminalRuleCall_1_0_1(), semanticObject.eGet(RestControllerGenerationPackage.Literals.CREATE_METHOD_WITH__ENTITY, false));
		feeder.accept(grammarAccess.getCreateMethodWithAccess().getEntityIdAttributeIDTerminalRuleCall_3_0_1(), semanticObject.eGet(RestControllerGenerationPackage.Literals.CREATE_METHOD_WITH__ENTITY_ID, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodDef returns CreateMethod
	 *     MethodType returns CreateMethod
	 *     CreateMethod returns CreateMethod
	 *
	 * Constraint:
	 *     (withEntity=CreateMethodWith? exclude=CreateMethodExclude?)
	 */
	protected void sequence_CreateMethod(ISerializationContext context, CreateMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MethodDef returns DeleteMethod
	 *     MethodType returns DeleteMethod
	 *     DeleteMethod returns DeleteMethod
	 *
	 * Constraint:
	 *     entityId=[Attribute|ID]
	 */
	protected void sequence_DeleteMethod(ISerializationContext context, DeleteMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.DELETE_METHOD__ENTITY_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.DELETE_METHOD__ENTITY_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDeleteMethodAccess().getEntityIdAttributeIDTerminalRuleCall_2_0_1(), semanticObject.eGet(RestControllerGenerationPackage.Literals.DELETE_METHOD__ENTITY_ID, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EntityModel returns EntityModel
	 *
	 * Constraint:
	 *     declarations+=Declaration+
	 */
	protected void sequence_EntityModel(ISerializationContext context, EntityModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID super=[Entity|ID]? attributes+=Attribute*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Add
	 *     Exp.Add_1_0_0_1 returns Add
	 *     Exp.Sub_1_0_1_1 returns Add
	 *     Factor returns Add
	 *     Factor.Mul_1_0_0_1 returns Add
	 *     Factor.Div_1_0_1_1 returns Add
	 *     Primitive returns Add
	 *
	 * Constraint:
	 *     (left=Exp_Add_1_0_0_1 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Add semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.ADD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.ADD__LEFT));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.ADD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.ADD__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getAddLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Sub
	 *     Exp.Add_1_0_0_1 returns Sub
	 *     Exp.Sub_1_0_1_1 returns Sub
	 *     Factor returns Sub
	 *     Factor.Mul_1_0_0_1 returns Sub
	 *     Factor.Div_1_0_1_1 returns Sub
	 *     Primitive returns Sub
	 *
	 * Constraint:
	 *     (left=Exp_Sub_1_0_1_1 right=Factor)
	 */
	protected void sequence_Exp(ISerializationContext context, Sub semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.SUB__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.SUB__LEFT));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.SUB__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.SUB__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExpAccess().getSubLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExternalFunction returns ExternalFunction
	 *
	 * Constraint:
	 *     externalFunc=ID
	 */
	protected void sequence_ExternalFunction(ISerializationContext context, ExternalFunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.EXTERNAL_FUNCTION__EXTERNAL_FUNC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.EXTERNAL_FUNCTION__EXTERNAL_FUNC));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExternalFunctionAccess().getExternalFuncIDTerminalRuleCall_1_0(), semanticObject.getExternalFunc());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Div
	 *     Exp.Add_1_0_0_1 returns Div
	 *     Exp.Sub_1_0_1_1 returns Div
	 *     Factor returns Div
	 *     Factor.Mul_1_0_0_1 returns Div
	 *     Factor.Div_1_0_1_1 returns Div
	 *     Primitive returns Div
	 *
	 * Constraint:
	 *     (left=Factor_Div_1_0_1_1 right=Primitive)
	 */
	protected void sequence_Factor(ISerializationContext context, Div semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.DIV__LEFT));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.DIV__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Mul
	 *     Exp.Add_1_0_0_1 returns Mul
	 *     Exp.Sub_1_0_1_1 returns Mul
	 *     Factor returns Mul
	 *     Factor.Mul_1_0_0_1 returns Mul
	 *     Factor.Div_1_0_1_1 returns Mul
	 *     Primitive returns Mul
	 *
	 * Constraint:
	 *     (left=Factor_Mul_1_0_0_1 right=Primitive)
	 */
	protected void sequence_Factor(ISerializationContext context, Mul semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.MUL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.MUL__LEFT));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.MUL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.MUL__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFactorAccess().getMulLeftAction_1_0_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodDef returns GetMethod
	 *     MethodType returns GetMethod
	 *     GetMethod returns GetMethod
	 *
	 * Constraint:
	 *     entityId=[Attribute|ID]
	 */
	protected void sequence_GetMethod(ISerializationContext context, GetMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.GET_METHOD__ENTITY_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.GET_METHOD__ENTITY_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGetMethodAccess().getEntityIdAttributeIDTerminalRuleCall_2_0_1(), semanticObject.eGet(RestControllerGenerationPackage.Literals.GET_METHOD__ENTITY_ID, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns IntExp
	 *     Exp.Add_1_0_0_1 returns IntExp
	 *     Exp.Sub_1_0_1_1 returns IntExp
	 *     Factor returns IntExp
	 *     Factor.Mul_1_0_0_1 returns IntExp
	 *     Factor.Div_1_0_1_1 returns IntExp
	 *     Primitive returns IntExp
	 *     IntExp returns IntExp
	 *
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntExp(ISerializationContext context, IntExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.INT_EXP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.INT_EXP__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntExpAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodDef returns ListMethod
	 *     MethodType returns ListMethod
	 *     ListMethod returns ListMethod
	 *
	 * Constraint:
	 *     {ListMethod}
	 */
	protected void sequence_ListMethod(ISerializationContext context, ListMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LogicExp returns Disjunction
	 *     LogicExp.Disjunction_1_1 returns Disjunction
	 *
	 * Constraint:
	 *     (left=LogicExp_Disjunction_1_1 right=Conjunction)
	 */
	protected void sequence_LogicExp(ISerializationContext context, Disjunction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.DISJUNCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.DISJUNCTION__LEFT));
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.DISJUNCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.DISJUNCTION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLogicExpAccess().getDisjunctionLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getLogicExpAccess().getRightConjunctionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Exp returns Name
	 *     Exp.Add_1_0_0_1 returns Name
	 *     Exp.Sub_1_0_1_1 returns Name
	 *     Factor returns Name
	 *     Factor.Mul_1_0_0_1 returns Name
	 *     Factor.Div_1_0_1_1 returns Name
	 *     Primitive returns Name
	 *     Name returns Name
	 *
	 * Constraint:
	 *     varName=[Attribute|ID]
	 */
	protected void sequence_Name(ISerializationContext context, Name semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.NAME__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.NAME__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameAccess().getVarNameAttributeIDTerminalRuleCall_0_1(), semanticObject.eGet(RestControllerGenerationPackage.Literals.NAME__VAR_NAME, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RelationalOp returns RelEQ
	 *
	 * Constraint:
	 *     {RelEQ}
	 */
	protected void sequence_RelationalOp(ISerializationContext context, RelEQ semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalOp returns RelGT
	 *
	 * Constraint:
	 *     {RelGT}
	 */
	protected void sequence_RelationalOp(ISerializationContext context, RelGT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalOp returns RelGTE
	 *
	 * Constraint:
	 *     {RelGTE}
	 */
	protected void sequence_RelationalOp(ISerializationContext context, RelGTE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalOp returns RelLT
	 *
	 * Constraint:
	 *     {RelLT}
	 */
	protected void sequence_RelationalOp(ISerializationContext context, RelLT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationalOp returns RelLTE
	 *
	 * Constraint:
	 *     {RelLTE}
	 */
	protected void sequence_RelationalOp(ISerializationContext context, RelLTE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Declaration returns Type
	 *     Type returns Type
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RestControllerGenerationPackage.Literals.DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RestControllerGenerationPackage.Literals.DECLARATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     MethodDef returns UpdateMethod
	 *     MethodType returns UpdateMethod
	 *     UpdateMethod returns UpdateMethod
	 *
	 * Constraint:
	 *     (attributes+=[Attribute|ID] attributes+=[Attribute|ID]*)
	 */
	protected void sequence_UpdateMethod(ISerializationContext context, UpdateMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
