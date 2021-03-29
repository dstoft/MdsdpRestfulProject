/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sdu.mdsd.restful.restControllerGeneration.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage
 * @generated
 */
public class RestControllerGenerationSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RestControllerGenerationPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RestControllerGenerationSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RestControllerGenerationPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case RestControllerGenerationPackage.ENTITY_MODEL:
      {
        EntityModel entityModel = (EntityModel)theEObject;
        T result = caseEntityModel(entityModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseDeclaration(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.EXTERNAL_DEF:
      {
        ExternalDef externalDef = (ExternalDef)theEObject;
        T result = caseExternalDef(externalDef);
        if (result == null) result = caseDeclaration(externalDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = caseDeclaration(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.ATTRIBUTE_REQUIREMENT:
      {
        AttributeRequirement attributeRequirement = (AttributeRequirement)theEObject;
        T result = caseAttributeRequirement(attributeRequirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.EXTERNAL_USE:
      {
        ExternalUse externalUse = (ExternalUse)theEObject;
        T result = caseExternalUse(externalUse);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.PROPOSITION:
      {
        Proposition proposition = (Proposition)theEObject;
        T result = caseProposition(proposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = caseProposition(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.RELATIONAL_OP:
      {
        RelationalOp relationalOp = (RelationalOp)theEObject;
        T result = caseRelationalOp(relationalOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseExpression(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.INT_EXP:
      {
        IntExp intExp = (IntExp)theEObject;
        T result = caseIntExp(intExp);
        if (result == null) result = caseExpression(intExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.CONTROLLER:
      {
        Controller controller = (Controller)theEObject;
        T result = caseController(controller);
        if (result == null) result = caseDeclaration(controller);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.METHOD_DEF:
      {
        MethodDef methodDef = (MethodDef)theEObject;
        T result = caseMethodDef(methodDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.METHOD_TYPE:
      {
        MethodType methodType = (MethodType)theEObject;
        T result = caseMethodType(methodType);
        if (result == null) result = caseMethodDef(methodType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.CREATE_METHOD:
      {
        CreateMethod createMethod = (CreateMethod)theEObject;
        T result = caseCreateMethod(createMethod);
        if (result == null) result = caseMethodType(createMethod);
        if (result == null) result = caseMethodDef(createMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.CREATE_METHOD_WITH:
      {
        CreateMethodWith createMethodWith = (CreateMethodWith)theEObject;
        T result = caseCreateMethodWith(createMethodWith);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.CREATE_METHOD_EXCLUDE:
      {
        CreateMethodExclude createMethodExclude = (CreateMethodExclude)theEObject;
        T result = caseCreateMethodExclude(createMethodExclude);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.GET_METHOD:
      {
        GetMethod getMethod = (GetMethod)theEObject;
        T result = caseGetMethod(getMethod);
        if (result == null) result = caseMethodType(getMethod);
        if (result == null) result = caseMethodDef(getMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.LIST_METHOD:
      {
        ListMethod listMethod = (ListMethod)theEObject;
        T result = caseListMethod(listMethod);
        if (result == null) result = caseMethodType(listMethod);
        if (result == null) result = caseMethodDef(listMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.UPDATE_METHOD:
      {
        UpdateMethod updateMethod = (UpdateMethod)theEObject;
        T result = caseUpdateMethod(updateMethod);
        if (result == null) result = caseMethodType(updateMethod);
        if (result == null) result = caseMethodDef(updateMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.DELETE_METHOD:
      {
        DeleteMethod deleteMethod = (DeleteMethod)theEObject;
        T result = caseDeleteMethod(deleteMethod);
        if (result == null) result = caseMethodType(deleteMethod);
        if (result == null) result = caseMethodDef(deleteMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.DISJUNCTION:
      {
        Disjunction disjunction = (Disjunction)theEObject;
        T result = caseDisjunction(disjunction);
        if (result == null) result = caseProposition(disjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.CONJUNCTION:
      {
        Conjunction conjunction = (Conjunction)theEObject;
        T result = caseConjunction(conjunction);
        if (result == null) result = caseProposition(conjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.REL_EQ:
      {
        RelEQ relEQ = (RelEQ)theEObject;
        T result = caseRelEQ(relEQ);
        if (result == null) result = caseRelationalOp(relEQ);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.REL_LT:
      {
        RelLT relLT = (RelLT)theEObject;
        T result = caseRelLT(relLT);
        if (result == null) result = caseRelationalOp(relLT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.REL_GT:
      {
        RelGT relGT = (RelGT)theEObject;
        T result = caseRelGT(relGT);
        if (result == null) result = caseRelationalOp(relGT);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.REL_LTE:
      {
        RelLTE relLTE = (RelLTE)theEObject;
        T result = caseRelLTE(relLTE);
        if (result == null) result = caseRelationalOp(relLTE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.REL_GTE:
      {
        RelGTE relGTE = (RelGTE)theEObject;
        T result = caseRelGTE(relGTE);
        if (result == null) result = caseRelationalOp(relGTE);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.ADD:
      {
        Add add = (Add)theEObject;
        T result = caseAdd(add);
        if (result == null) result = caseExpression(add);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.SUB:
      {
        Sub sub = (Sub)theEObject;
        T result = caseSub(sub);
        if (result == null) result = caseExpression(sub);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.MUL:
      {
        Mul mul = (Mul)theEObject;
        T result = caseMul(mul);
        if (result == null) result = caseExpression(mul);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RestControllerGenerationPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityModel(EntityModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalDef(ExternalDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeRequirement(AttributeRequirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Use</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Use</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalUse(ExternalUse object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProposition(Proposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relational Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relational Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationalOp(RelationalOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntExp(IntExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseController(Controller object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodDef(MethodDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodType(MethodType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateMethod(CreateMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Method With</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Method With</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateMethodWith(CreateMethodWith object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Method Exclude</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Method Exclude</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateMethodExclude(CreateMethodExclude object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetMethod(GetMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListMethod(ListMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Update Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Update Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpdateMethod(UpdateMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Delete Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Delete Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeleteMethod(DeleteMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjunction(Disjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunction(Conjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel EQ</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel EQ</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelEQ(RelEQ object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel LT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel LT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelLT(RelLT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel GT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel GT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelGT(RelGT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel LTE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel LTE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelLTE(RelLTE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel GTE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel GTE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelGTE(RelGTE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Add</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdd(Add object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSub(Sub object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMul(Mul object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //RestControllerGenerationSwitch
