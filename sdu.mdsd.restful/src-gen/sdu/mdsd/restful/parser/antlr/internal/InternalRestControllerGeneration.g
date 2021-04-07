/*
 * generated by Xtext 2.24.0
 */
grammar InternalRestControllerGeneration;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package sdu.mdsd.restful.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package sdu.mdsd.restful.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import sdu.mdsd.restful.services.RestControllerGenerationGrammarAccess;

}

@parser::members {

 	private RestControllerGenerationGrammarAccess grammarAccess;

    public InternalRestControllerGenerationParser(TokenStream input, RestControllerGenerationGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EntityModel";
   	}

   	@Override
   	protected RestControllerGenerationGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEntityModel
entryRuleEntityModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityModelRule()); }
	iv_ruleEntityModel=ruleEntityModel
	{ $current=$iv_ruleEntityModel.current; }
	EOF;

// Rule EntityModel
ruleEntityModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityModelAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityModelAccess().getDeclarationsDeclarationParserRuleCall_2_0());
				}
				lv_declarations_2_0=ruleDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityModelRule());
					}
					add(
						$current,
						"declarations",
						lv_declarations_2_0,
						"sdu.mdsd.restful.RestControllerGeneration.Declaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleDeclaration
entryRuleDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclarationRule()); }
	iv_ruleDeclaration=ruleDeclaration
	{ $current=$iv_ruleDeclaration.current; }
	EOF;

// Rule Declaration
ruleDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getTypeParserRuleCall_0());
		}
		this_Type_0=ruleType
		{
			$current = $this_Type_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getEntityParserRuleCall_1());
		}
		this_Entity_1=ruleEntity
		{
			$current = $this_Entity_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getControllerParserRuleCall_2());
		}
		this_Controller_2=ruleController
		{
			$current = $this_Controller_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDeclarationAccess().getExternalDefParserRuleCall_3());
		}
		this_ExternalDef_3=ruleExternalDef
		{
			$current = $this_ExternalDef_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleExternalDef
entryRuleExternalDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalDefRule()); }
	iv_ruleExternalDef=ruleExternalDef
	{ $current=$iv_ruleExternalDef.current; }
	EOF;

// Rule ExternalDef
ruleExternalDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='external'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalDefAccess().getExternalKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExternalDefAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalDefRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='using'
		{
			newLeafNode(otherlv_2, grammarAccess.getExternalDefAccess().getUsingKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalDefRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getExternalDefAccess().getTypeTypeCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperEntityCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_4_0());
				}
				lv_attributes_5_0=ruleAttribute
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityRule());
					}
					add(
						$current,
						"attributes",
						lv_attributes_5_0,
						"sdu.mdsd.restful.RestControllerGeneration.Attribute");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getTypeTypeCrossReference_2_0());
				}
			)
		)
		(
			otherlv_3='require'
			{
				newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getRequireKeyword_3_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getAttributeAccess().getRequirementAttributeRequirementParserRuleCall_3_1_0_0());
						}
						lv_requirement_4_1=ruleAttributeRequirement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAttributeRule());
							}
							set(
								$current,
								"requirement",
								lv_requirement_4_1,
								"sdu.mdsd.restful.RestControllerGeneration.AttributeRequirement");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getAttributeAccess().getRequirementExternalUseParserRuleCall_3_1_0_1());
						}
						lv_requirement_4_2=ruleExternalUse
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAttributeRule());
							}
							set(
								$current,
								"requirement",
								lv_requirement_4_2,
								"sdu.mdsd.restful.RestControllerGeneration.ExternalUse");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)?
	)
;

// Entry rule entryRuleAttributeRequirement
entryRuleAttributeRequirement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRequirementRule()); }
	iv_ruleAttributeRequirement=ruleAttributeRequirement
	{ $current=$iv_ruleAttributeRequirement.current; }
	EOF;

// Rule AttributeRequirement
ruleAttributeRequirement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAttributeRequirementAccess().getLogicLogicExpParserRuleCall_0());
			}
			lv_logic_0_0=ruleLogicExp
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAttributeRequirementRule());
				}
				set(
					$current,
					"logic",
					lv_logic_0_0,
					"sdu.mdsd.restful.RestControllerGeneration.LogicExp");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleExternalUse
entryRuleExternalUse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalUseRule()); }
	iv_ruleExternalUse=ruleExternalUse
	{ $current=$iv_ruleExternalUse.current; }
	EOF;

// Rule ExternalUse
ruleExternalUse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getExternalUseRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getExternalUseAccess().getExternalExternalDefCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleLogicExp
entryRuleLogicExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLogicExpRule()); }
	iv_ruleLogicExp=ruleLogicExp
	{ $current=$iv_ruleLogicExp.current; }
	EOF;

// Rule LogicExp
ruleLogicExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLogicExpAccess().getConjunctionParserRuleCall_0());
		}
		this_Conjunction_0=ruleConjunction
		{
			$current = $this_Conjunction_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_1='||'
			{
				newLeafNode(otherlv_1, grammarAccess.getLogicExpAccess().getVerticalLineVerticalLineKeyword_1_0());
			}
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getLogicExpAccess().getDisjunctionLeftAction_1_1(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getLogicExpAccess().getRightConjunctionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleConjunction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLogicExpRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"sdu.mdsd.restful.RestControllerGeneration.Conjunction");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleConjunction
entryRuleConjunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConjunctionRule()); }
	iv_ruleConjunction=ruleConjunction
	{ $current=$iv_ruleConjunction.current; }
	EOF;

// Rule Conjunction
ruleConjunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0());
		}
		this_Comparison_0=ruleComparison
		{
			$current = $this_Comparison_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			otherlv_1='&&'
			{
				newLeafNode(otherlv_1, grammarAccess.getConjunctionAccess().getAmpersandAmpersandKeyword_1_0());
			}
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_1(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleComparison
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConjunctionRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"sdu.mdsd.restful.RestControllerGeneration.Comparison");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getLeftExpParserRuleCall_0_0());
				}
				lv_left_0_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"left",
						lv_left_0_0,
						"sdu.mdsd.restful.RestControllerGeneration.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getOpRelationalOpParserRuleCall_1_0());
				}
				lv_op_1_0=ruleRelationalOp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"sdu.mdsd.restful.RestControllerGeneration.RelationalOp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getComparisonAccess().getRightExpParserRuleCall_2_0());
				}
				lv_right_2_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getComparisonRule());
					}
					set(
						$current,
						"right",
						lv_right_2_0,
						"sdu.mdsd.restful.RestControllerGeneration.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRelationalOp
entryRuleRelationalOp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRelationalOpRule()); }
	iv_ruleRelationalOp=ruleRelationalOp
	{ $current=$iv_ruleRelationalOp.current; }
	EOF;

// Rule RelationalOp
ruleRelationalOp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getRelationalOpAccess().getRelEQAction_0_0(),
						$current);
				}
			)
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getRelationalOpAccess().getEqualsSignKeyword_0_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getRelationalOpAccess().getRelLTAction_1_0(),
						$current);
				}
			)
			otherlv_3='<'
			{
				newLeafNode(otherlv_3, grammarAccess.getRelationalOpAccess().getLessThanSignKeyword_1_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getRelationalOpAccess().getRelGTAction_2_0(),
						$current);
				}
			)
			otherlv_5='>'
			{
				newLeafNode(otherlv_5, grammarAccess.getRelationalOpAccess().getGreaterThanSignKeyword_2_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getRelationalOpAccess().getRelLTEAction_3_0(),
						$current);
				}
			)
			otherlv_7='<='
			{
				newLeafNode(otherlv_7, grammarAccess.getRelationalOpAccess().getLessThanSignEqualsSignKeyword_3_1());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getRelationalOpAccess().getRelGTEAction_4_0(),
						$current);
				}
			)
			otherlv_9='>='
			{
				newLeafNode(otherlv_9, grammarAccess.getRelationalOpAccess().getGreaterThanSignEqualsSignKeyword_4_1());
			}
		)
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
		}
		this_Factor_0=ruleFactor
		{
			$current = $this_Factor_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='+'
					{
						newLeafNode(otherlv_1, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getAddLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='-'
					{
						newLeafNode(otherlv_3, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getExpAccess().getSubLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
					}
					lv_right_5_0=ruleFactor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExpRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"sdu.mdsd.restful.RestControllerGeneration.Factor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleFactor
entryRuleFactor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFactorRule()); }
	iv_ruleFactor=ruleFactor
	{ $current=$iv_ruleFactor.current; }
	EOF;

// Rule Factor
ruleFactor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFactorAccess().getPrimitiveParserRuleCall_0());
		}
		this_Primitive_0=rulePrimitive
		{
			$current = $this_Primitive_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					otherlv_1='*'
					{
						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getFactorAccess().getMulLeftAction_1_0_0_1(),
								$current);
						}
					)
				)
				    |
				(
					otherlv_3='/'
					{
						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
					}
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
								$current);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimitiveParserRuleCall_1_1_0());
					}
					lv_right_5_0=rulePrimitive
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFactorRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"sdu.mdsd.restful.RestControllerGeneration.Primitive");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimitive
entryRulePrimitive returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveRule()); }
	iv_rulePrimitive=rulePrimitive
	{ $current=$iv_rulePrimitive.current; }
	EOF;

// Rule Primitive
rulePrimitive returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getNameParserRuleCall_0());
		}
		this_Name_0=ruleName
		{
			$current = $this_Name_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimitiveAccess().getIntExpParserRuleCall_1());
		}
		this_IntExp_1=ruleIntExp
		{
			$current = $this_IntExp_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimitiveAccess().getLeftParenthesisKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimitiveAccess().getExpParserRuleCall_2_1());
			}
			this_Exp_3=ruleExp
			{
				$current = $this_Exp_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimitiveAccess().getRightParenthesisKeyword_2_2());
			}
		)
	)
;

// Entry rule entryRuleName
entryRuleName returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameRule()); }
	iv_ruleName=ruleName
	{ $current=$iv_ruleName.current; }
	EOF;

// Rule Name
ruleName returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNameRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getNameAccess().getVarNameAttributeCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleIntExp
entryRuleIntExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntExpRule()); }
	iv_ruleIntExp=ruleIntExp
	{ $current=$iv_ruleIntExp.current; }
	EOF;

// Rule IntExp
ruleIntExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getIntExpAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntExpRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleController
entryRuleController returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getControllerRule()); }
	iv_ruleController=ruleController
	{ $current=$iv_ruleController.current; }
	EOF;

// Rule Controller
ruleController returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='controller'
		{
			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getControllerAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getControllerRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getColonKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getControllerRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getSuperControllerCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='uses'
		{
			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getUsesKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getControllerRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getEntityEntityCrossReference_4_0());
				}
			)
		)
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getControllerAccess().getMethodsMethodDefParserRuleCall_6_0());
				}
				lv_methods_7_0=ruleMethodDef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getControllerRule());
					}
					add(
						$current,
						"methods",
						lv_methods_7_0,
						"sdu.mdsd.restful.RestControllerGeneration.MethodDef");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleMethodDef
entryRuleMethodDef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodDefRule()); }
	iv_ruleMethodDef=ruleMethodDef
	{ $current=$iv_ruleMethodDef.current; }
	EOF;

// Rule MethodDef
ruleMethodDef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getMethodDefAccess().getMethodTypeParserRuleCall());
	}
	this_MethodType_0=ruleMethodType
	{
		$current = $this_MethodType_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleMethodType
entryRuleMethodType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethodTypeRule()); }
	iv_ruleMethodType=ruleMethodType
	{ $current=$iv_ruleMethodType.current; }
	EOF;

// Rule MethodType
ruleMethodType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMethodTypeAccess().getCreateMethodParserRuleCall_0());
		}
		this_CreateMethod_0=ruleCreateMethod
		{
			$current = $this_CreateMethod_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMethodTypeAccess().getGetMethodParserRuleCall_1());
		}
		this_GetMethod_1=ruleGetMethod
		{
			$current = $this_GetMethod_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMethodTypeAccess().getListMethodParserRuleCall_2());
		}
		this_ListMethod_2=ruleListMethod
		{
			$current = $this_ListMethod_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMethodTypeAccess().getUpdateMethodParserRuleCall_3());
		}
		this_UpdateMethod_3=ruleUpdateMethod
		{
			$current = $this_UpdateMethod_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getMethodTypeAccess().getDeleteMethodParserRuleCall_4());
		}
		this_DeleteMethod_4=ruleDeleteMethod
		{
			$current = $this_DeleteMethod_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCreateMethod
entryRuleCreateMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateMethodRule()); }
	iv_ruleCreateMethod=ruleCreateMethod
	{ $current=$iv_ruleCreateMethod.current; }
	EOF;

// Rule CreateMethod
ruleCreateMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getCreateMethodAccess().getCreateMethodAction_0(),
					$current);
			}
		)
		otherlv_1='CREATE'
		{
			newLeafNode(otherlv_1, grammarAccess.getCreateMethodAccess().getCREATEKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateMethodAccess().getWithEntityCreateMethodWithParserRuleCall_2_0());
				}
				lv_withEntity_2_0=ruleCreateMethodWith
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateMethodRule());
					}
					set(
						$current,
						"withEntity",
						lv_withEntity_2_0,
						"sdu.mdsd.restful.RestControllerGeneration.CreateMethodWith");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getCreateMethodAccess().getExcludeCreateMethodExcludeParserRuleCall_3_0());
				}
				lv_exclude_3_0=ruleCreateMethodExclude
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCreateMethodRule());
					}
					set(
						$current,
						"exclude",
						lv_exclude_3_0,
						"sdu.mdsd.restful.RestControllerGeneration.CreateMethodExclude");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleCreateMethodWith
entryRuleCreateMethodWith returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateMethodWithRule()); }
	iv_ruleCreateMethodWith=ruleCreateMethodWith
	{ $current=$iv_ruleCreateMethodWith.current; }
	EOF;

// Rule CreateMethodWith
ruleCreateMethodWith returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='with'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreateMethodWithAccess().getWithKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreateMethodWithRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getCreateMethodWithAccess().getEntityEntityCrossReference_1_0());
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getCreateMethodWithAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreateMethodWithRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getCreateMethodWithAccess().getEntityIdAttributeCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleCreateMethodExclude
entryRuleCreateMethodExclude returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCreateMethodExcludeRule()); }
	iv_ruleCreateMethodExclude=ruleCreateMethodExclude
	{ $current=$iv_ruleCreateMethodExclude.current; }
	EOF;

// Rule CreateMethodExclude
ruleCreateMethodExclude returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='exclude'
		{
			newLeafNode(otherlv_0, grammarAccess.getCreateMethodExcludeAccess().getExcludeKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCreateMethodExcludeRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getCreateMethodExcludeAccess().getAttributesAttributeCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getCreateMethodExcludeAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCreateMethodExcludeRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getCreateMethodExcludeAccess().getAttributesAttributeCrossReference_2_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleGetMethod
entryRuleGetMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGetMethodRule()); }
	iv_ruleGetMethod=ruleGetMethod
	{ $current=$iv_ruleGetMethod.current; }
	EOF;

// Rule GetMethod
ruleGetMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='GET'
		{
			newLeafNode(otherlv_0, grammarAccess.getGetMethodAccess().getGETKeyword_0());
		}
		otherlv_1='on'
		{
			newLeafNode(otherlv_1, grammarAccess.getGetMethodAccess().getOnKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGetMethodRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getGetMethodAccess().getEntityIdAttributeCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleListMethod
entryRuleListMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListMethodRule()); }
	iv_ruleListMethod=ruleListMethod
	{ $current=$iv_ruleListMethod.current; }
	EOF;

// Rule ListMethod
ruleListMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getListMethodAccess().getListMethodAction_0(),
					$current);
			}
		)
		otherlv_1='LIST'
		{
			newLeafNode(otherlv_1, grammarAccess.getListMethodAccess().getLISTKeyword_1());
		}
	)
;

// Entry rule entryRuleUpdateMethod
entryRuleUpdateMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUpdateMethodRule()); }
	iv_ruleUpdateMethod=ruleUpdateMethod
	{ $current=$iv_ruleUpdateMethod.current; }
	EOF;

// Rule UpdateMethod
ruleUpdateMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='UPDATE'
		{
			newLeafNode(otherlv_0, grammarAccess.getUpdateMethodAccess().getUPDATEKeyword_0());
		}
		otherlv_1='on'
		{
			newLeafNode(otherlv_1, grammarAccess.getUpdateMethodAccess().getOnKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUpdateMethodRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getUpdateMethodAccess().getEntityIdAttributeCrossReference_2_0());
				}
			)
		)
		otherlv_3='with'
		{
			newLeafNode(otherlv_3, grammarAccess.getUpdateMethodAccess().getWithKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUpdateMethodRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5=','
			{
				newLeafNode(otherlv_5, grammarAccess.getUpdateMethodAccess().getCommaKeyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getUpdateMethodRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getUpdateMethodAccess().getAttributesAttributeCrossReference_5_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDeleteMethod
entryRuleDeleteMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeleteMethodRule()); }
	iv_ruleDeleteMethod=ruleDeleteMethod
	{ $current=$iv_ruleDeleteMethod.current; }
	EOF;

// Rule DeleteMethod
ruleDeleteMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DELETE'
		{
			newLeafNode(otherlv_0, grammarAccess.getDeleteMethodAccess().getDELETEKeyword_0());
		}
		otherlv_1='on'
		{
			newLeafNode(otherlv_1, grammarAccess.getDeleteMethodAccess().getOnKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeleteMethodRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getDeleteMethodAccess().getEntityIdAttributeCrossReference_2_0());
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
