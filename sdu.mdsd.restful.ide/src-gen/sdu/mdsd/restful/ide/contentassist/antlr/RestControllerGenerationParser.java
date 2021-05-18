/*
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import sdu.mdsd.restful.ide.contentassist.antlr.internal.InternalRestControllerGenerationParser;
import sdu.mdsd.restful.services.RestControllerGenerationGrammarAccess;

public class RestControllerGenerationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(RestControllerGenerationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, RestControllerGenerationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
			builder.put(grammarAccess.getEntityDeclarationAccess().getAlternatives(), "rule__EntityDeclaration__Alternatives");
			builder.put(grammarAccess.getAttributeAccess().getRequiresAlternatives_3_1_0(), "rule__Attribute__RequiresAlternatives_3_1_0");
			builder.put(grammarAccess.getAttributeTypeAccess().getAlternatives(), "rule__AttributeType__Alternatives");
			builder.put(grammarAccess.getRequirementAccess().getRequirementAlternatives_1_0(), "rule__Requirement__RequirementAlternatives_1_0");
			builder.put(grammarAccess.getRelationalOpAccess().getAlternatives(), "rule__RelationalOp__Alternatives");
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getPrimitiveAccess().getAlternatives(), "rule__Primitive__Alternatives");
			builder.put(grammarAccess.getMethodTypeAccess().getAlternatives(), "rule__MethodType__Alternatives");
			builder.put(grammarAccess.getEntityModelAccess().getGroup(), "rule__EntityModel__Group__0");
			builder.put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
			builder.put(grammarAccess.getExternalDefAccess().getGroup(), "rule__ExternalDef__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
			builder.put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
			builder.put(grammarAccess.getAttributeAccess().getGroup_3(), "rule__Attribute__Group_3__0");
			builder.put(grammarAccess.getAttributeTypeAccess().getGroup_0(), "rule__AttributeType__Group_0__0");
			builder.put(grammarAccess.getAttributeTypeAccess().getGroup_1(), "rule__AttributeType__Group_1__0");
			builder.put(grammarAccess.getAttributeTypeAccess().getGroup_2(), "rule__AttributeType__Group_2__0");
			builder.put(grammarAccess.getExternalUseOfAttributeAccess().getGroup(), "rule__ExternalUseOfAttribute__Group__0");
			builder.put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
			builder.put(grammarAccess.getLogicExpAccess().getGroup(), "rule__LogicExp__Group__0");
			builder.put(grammarAccess.getLogicExpAccess().getGroup_1(), "rule__LogicExp__Group_1__0");
			builder.put(grammarAccess.getConjunctionAccess().getGroup(), "rule__Conjunction__Group__0");
			builder.put(grammarAccess.getConjunctionAccess().getGroup_1(), "rule__Conjunction__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getRelationalOpAccess().getGroup_0(), "rule__RelationalOp__Group_0__0");
			builder.put(grammarAccess.getRelationalOpAccess().getGroup_1(), "rule__RelationalOp__Group_1__0");
			builder.put(grammarAccess.getRelationalOpAccess().getGroup_2(), "rule__RelationalOp__Group_2__0");
			builder.put(grammarAccess.getRelationalOpAccess().getGroup_3(), "rule__RelationalOp__Group_3__0");
			builder.put(grammarAccess.getRelationalOpAccess().getGroup_4(), "rule__RelationalOp__Group_4__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getPrimitiveAccess().getGroup_2(), "rule__Primitive__Group_2__0");
			builder.put(grammarAccess.getControllerAccess().getGroup(), "rule__Controller__Group__0");
			builder.put(grammarAccess.getControllerAccess().getGroup_2(), "rule__Controller__Group_2__0");
			builder.put(grammarAccess.getCreateMethodAccess().getGroup(), "rule__CreateMethod__Group__0");
			builder.put(grammarAccess.getCreateMethodWithAccess().getGroup(), "rule__CreateMethodWith__Group__0");
			builder.put(grammarAccess.getCreateMethodExcludeAccess().getGroup(), "rule__CreateMethodExclude__Group__0");
			builder.put(grammarAccess.getCreateMethodExcludeAccess().getGroup_2(), "rule__CreateMethodExclude__Group_2__0");
			builder.put(grammarAccess.getGetMethodAccess().getGroup(), "rule__GetMethod__Group__0");
			builder.put(grammarAccess.getListMethodAccess().getGroup(), "rule__ListMethod__Group__0");
			builder.put(grammarAccess.getUpdateMethodAccess().getGroup(), "rule__UpdateMethod__Group__0");
			builder.put(grammarAccess.getUpdateMethodAccess().getGroup_5(), "rule__UpdateMethod__Group_5__0");
			builder.put(grammarAccess.getDeleteMethodAccess().getGroup(), "rule__DeleteMethod__Group__0");
			builder.put(grammarAccess.getEntityModelAccess().getNameAssignment_1(), "rule__EntityModel__NameAssignment_1");
			builder.put(grammarAccess.getEntityModelAccess().getDeclarationsAssignment_2(), "rule__EntityModel__DeclarationsAssignment_2");
			builder.put(grammarAccess.getTypeAccess().getNameAssignment_1(), "rule__Type__NameAssignment_1");
			builder.put(grammarAccess.getExternalDefAccess().getNameAssignment_1(), "rule__ExternalDef__NameAssignment_1");
			builder.put(grammarAccess.getExternalDefAccess().getTypeAssignment_3(), "rule__ExternalDef__TypeAssignment_3");
			builder.put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
			builder.put(grammarAccess.getEntityAccess().getBaseAssignment_2_1(), "rule__Entity__BaseAssignment_2_1");
			builder.put(grammarAccess.getEntityAccess().getDeclarationsAssignment_4(), "rule__Entity__DeclarationsAssignment_4");
			builder.put(grammarAccess.getAttributeAccess().getNameAssignment_0(), "rule__Attribute__NameAssignment_0");
			builder.put(grammarAccess.getAttributeAccess().getTypeAssignment_2(), "rule__Attribute__TypeAssignment_2");
			builder.put(grammarAccess.getAttributeAccess().getRequiresAssignment_3_1(), "rule__Attribute__RequiresAssignment_3_1");
			builder.put(grammarAccess.getAttributeTypeAccess().getTypeAssignment_0_1(), "rule__AttributeType__TypeAssignment_0_1");
			builder.put(grammarAccess.getAttributeTypeAccess().getEntityAssignment_1_1(), "rule__AttributeType__EntityAssignment_1_1");
			builder.put(grammarAccess.getAttributeTypeAccess().getEntityAssignment_2_1(), "rule__AttributeType__EntityAssignment_2_1");
			builder.put(grammarAccess.getLogicRequirementAccess().getLogicAssignment(), "rule__LogicRequirement__LogicAssignment");
			builder.put(grammarAccess.getExternalUseAccess().getExternalAssignment(), "rule__ExternalUse__ExternalAssignment");
			builder.put(grammarAccess.getExternalUseOfAttributeAccess().getExternalAssignment_0(), "rule__ExternalUseOfAttribute__ExternalAssignment_0");
			builder.put(grammarAccess.getExternalUseOfAttributeAccess().getAttributeAssignment_2(), "rule__ExternalUseOfAttribute__AttributeAssignment_2");
			builder.put(grammarAccess.getRequirementAccess().getRequirementAssignment_1(), "rule__Requirement__RequirementAssignment_1");
			builder.put(grammarAccess.getLogicExpAccess().getRightAssignment_1_2(), "rule__LogicExp__RightAssignment_1_2");
			builder.put(grammarAccess.getConjunctionAccess().getRightAssignment_1_2(), "rule__Conjunction__RightAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getLeftAssignment_0(), "rule__Comparison__LeftAssignment_0");
			builder.put(grammarAccess.getComparisonAccess().getOpAssignment_1(), "rule__Comparison__OpAssignment_1");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_2(), "rule__Comparison__RightAssignment_2");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getNameAccess().getVarNameAssignment(), "rule__Name__VarNameAssignment");
			builder.put(grammarAccess.getIntExpAccess().getValueAssignment(), "rule__IntExp__ValueAssignment");
			builder.put(grammarAccess.getControllerAccess().getNameAssignment_1(), "rule__Controller__NameAssignment_1");
			builder.put(grammarAccess.getControllerAccess().getSuperAssignment_2_1(), "rule__Controller__SuperAssignment_2_1");
			builder.put(grammarAccess.getControllerAccess().getEntityAssignment_4(), "rule__Controller__EntityAssignment_4");
			builder.put(grammarAccess.getControllerAccess().getMethodsAssignment_6(), "rule__Controller__MethodsAssignment_6");
			builder.put(grammarAccess.getCreateMethodAccess().getWithEntityAssignment_2(), "rule__CreateMethod__WithEntityAssignment_2");
			builder.put(grammarAccess.getCreateMethodAccess().getExcludeAssignment_3(), "rule__CreateMethod__ExcludeAssignment_3");
			builder.put(grammarAccess.getCreateMethodWithAccess().getEntityAssignment_1(), "rule__CreateMethodWith__EntityAssignment_1");
			builder.put(grammarAccess.getCreateMethodWithAccess().getEntityIdAssignment_3(), "rule__CreateMethodWith__EntityIdAssignment_3");
			builder.put(grammarAccess.getCreateMethodExcludeAccess().getAttributesAssignment_1(), "rule__CreateMethodExclude__AttributesAssignment_1");
			builder.put(grammarAccess.getCreateMethodExcludeAccess().getAttributesAssignment_2_1(), "rule__CreateMethodExclude__AttributesAssignment_2_1");
			builder.put(grammarAccess.getGetMethodAccess().getEntityIdAssignment_2(), "rule__GetMethod__EntityIdAssignment_2");
			builder.put(grammarAccess.getUpdateMethodAccess().getEntityIdAssignment_2(), "rule__UpdateMethod__EntityIdAssignment_2");
			builder.put(grammarAccess.getUpdateMethodAccess().getAttributesAssignment_4(), "rule__UpdateMethod__AttributesAssignment_4");
			builder.put(grammarAccess.getUpdateMethodAccess().getAttributesAssignment_5_1(), "rule__UpdateMethod__AttributesAssignment_5_1");
			builder.put(grammarAccess.getDeleteMethodAccess().getEntityIdAssignment_2(), "rule__DeleteMethod__EntityIdAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private RestControllerGenerationGrammarAccess grammarAccess;

	@Override
	protected InternalRestControllerGenerationParser createParser() {
		InternalRestControllerGenerationParser result = new InternalRestControllerGenerationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public RestControllerGenerationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(RestControllerGenerationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
