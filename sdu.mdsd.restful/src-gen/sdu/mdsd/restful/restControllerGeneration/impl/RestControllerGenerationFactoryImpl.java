/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sdu.mdsd.restful.restControllerGeneration.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestControllerGenerationFactoryImpl extends EFactoryImpl implements RestControllerGenerationFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RestControllerGenerationFactory init()
  {
    try
    {
      RestControllerGenerationFactory theRestControllerGenerationFactory = (RestControllerGenerationFactory)EPackage.Registry.INSTANCE.getEFactory(RestControllerGenerationPackage.eNS_URI);
      if (theRestControllerGenerationFactory != null)
      {
        return theRestControllerGenerationFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RestControllerGenerationFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestControllerGenerationFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RestControllerGenerationPackage.ENTITY_MODEL: return createEntityModel();
      case RestControllerGenerationPackage.DECLARATION: return createDeclaration();
      case RestControllerGenerationPackage.TYPE: return createType();
      case RestControllerGenerationPackage.EXTERNAL_DEF: return createExternalDef();
      case RestControllerGenerationPackage.ENTITY: return createEntity();
      case RestControllerGenerationPackage.ENTITY_DECLARATION: return createEntityDeclaration();
      case RestControllerGenerationPackage.ATTRIBUTE: return createAttribute();
      case RestControllerGenerationPackage.ATTRIBUTE_TYPE: return createAttributeType();
      case RestControllerGenerationPackage.LOGIC_REQUIREMENT: return createLogicRequirement();
      case RestControllerGenerationPackage.EXTERNAL_USE: return createExternalUse();
      case RestControllerGenerationPackage.EXTERNAL_USE_OF_ATTRIBUTE: return createExternalUseOfAttribute();
      case RestControllerGenerationPackage.REQUIREMENT: return createRequirement();
      case RestControllerGenerationPackage.PROPOSITION: return createProposition();
      case RestControllerGenerationPackage.COMPARISON: return createComparison();
      case RestControllerGenerationPackage.RELATIONAL_OP: return createRelationalOp();
      case RestControllerGenerationPackage.EXPRESSION: return createExpression();
      case RestControllerGenerationPackage.NAME: return createName();
      case RestControllerGenerationPackage.INT_EXP: return createIntExp();
      case RestControllerGenerationPackage.CONTROLLER: return createController();
      case RestControllerGenerationPackage.CONTROLLER_METHOD: return createControllerMethod();
      case RestControllerGenerationPackage.CREATE_METHOD: return createCreateMethod();
      case RestControllerGenerationPackage.CREATE_METHOD_WITH: return createCreateMethodWith();
      case RestControllerGenerationPackage.CREATE_METHOD_EXCLUDE: return createCreateMethodExclude();
      case RestControllerGenerationPackage.GET_METHOD: return createGetMethod();
      case RestControllerGenerationPackage.LIST_METHOD: return createListMethod();
      case RestControllerGenerationPackage.UPDATE_METHOD: return createUpdateMethod();
      case RestControllerGenerationPackage.DELETE_METHOD: return createDeleteMethod();
      case RestControllerGenerationPackage.DISJUNCTION: return createDisjunction();
      case RestControllerGenerationPackage.CONJUNCTION: return createConjunction();
      case RestControllerGenerationPackage.REL_EQ: return createRelEQ();
      case RestControllerGenerationPackage.REL_LT: return createRelLT();
      case RestControllerGenerationPackage.REL_GT: return createRelGT();
      case RestControllerGenerationPackage.REL_LTE: return createRelLTE();
      case RestControllerGenerationPackage.REL_GTE: return createRelGTE();
      case RestControllerGenerationPackage.ADD: return createAdd();
      case RestControllerGenerationPackage.SUB: return createSub();
      case RestControllerGenerationPackage.MUL: return createMul();
      case RestControllerGenerationPackage.DIV: return createDiv();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityModel createEntityModel()
  {
    EntityModelImpl entityModel = new EntityModelImpl();
    return entityModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalDef createExternalDef()
  {
    ExternalDefImpl externalDef = new ExternalDefImpl();
    return externalDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityDeclaration createEntityDeclaration()
  {
    EntityDeclarationImpl entityDeclaration = new EntityDeclarationImpl();
    return entityDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeType createAttributeType()
  {
    AttributeTypeImpl attributeType = new AttributeTypeImpl();
    return attributeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicRequirement createLogicRequirement()
  {
    LogicRequirementImpl logicRequirement = new LogicRequirementImpl();
    return logicRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalUse createExternalUse()
  {
    ExternalUseImpl externalUse = new ExternalUseImpl();
    return externalUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalUseOfAttribute createExternalUseOfAttribute()
  {
    ExternalUseOfAttributeImpl externalUseOfAttribute = new ExternalUseOfAttributeImpl();
    return externalUseOfAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Proposition createProposition()
  {
    PropositionImpl proposition = new PropositionImpl();
    return proposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelationalOp createRelationalOp()
  {
    RelationalOpImpl relationalOp = new RelationalOpImpl();
    return relationalOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntExp createIntExp()
  {
    IntExpImpl intExp = new IntExpImpl();
    return intExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Controller createController()
  {
    ControllerImpl controller = new ControllerImpl();
    return controller;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ControllerMethod createControllerMethod()
  {
    ControllerMethodImpl controllerMethod = new ControllerMethodImpl();
    return controllerMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateMethod createCreateMethod()
  {
    CreateMethodImpl createMethod = new CreateMethodImpl();
    return createMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateMethodWith createCreateMethodWith()
  {
    CreateMethodWithImpl createMethodWith = new CreateMethodWithImpl();
    return createMethodWith;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateMethodExclude createCreateMethodExclude()
  {
    CreateMethodExcludeImpl createMethodExclude = new CreateMethodExcludeImpl();
    return createMethodExclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetMethod createGetMethod()
  {
    GetMethodImpl getMethod = new GetMethodImpl();
    return getMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ListMethod createListMethod()
  {
    ListMethodImpl listMethod = new ListMethodImpl();
    return listMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpdateMethod createUpdateMethod()
  {
    UpdateMethodImpl updateMethod = new UpdateMethodImpl();
    return updateMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DeleteMethod createDeleteMethod()
  {
    DeleteMethodImpl deleteMethod = new DeleteMethodImpl();
    return deleteMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Disjunction createDisjunction()
  {
    DisjunctionImpl disjunction = new DisjunctionImpl();
    return disjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelEQ createRelEQ()
  {
    RelEQImpl relEQ = new RelEQImpl();
    return relEQ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelLT createRelLT()
  {
    RelLTImpl relLT = new RelLTImpl();
    return relLT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelGT createRelGT()
  {
    RelGTImpl relGT = new RelGTImpl();
    return relGT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelLTE createRelLTE()
  {
    RelLTEImpl relLTE = new RelLTEImpl();
    return relLTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RelGTE createRelGTE()
  {
    RelGTEImpl relGTE = new RelGTEImpl();
    return relGTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sub createSub()
  {
    SubImpl sub = new SubImpl();
    return sub;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RestControllerGenerationPackage getRestControllerGenerationPackage()
  {
    return (RestControllerGenerationPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RestControllerGenerationPackage getPackage()
  {
    return RestControllerGenerationPackage.eINSTANCE;
  }

} //RestControllerGenerationFactoryImpl
