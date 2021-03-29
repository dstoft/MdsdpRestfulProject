/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import sdu.mdsd.restful.restControllerGeneration.Attribute;
import sdu.mdsd.restful.restControllerGeneration.Name;
import sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.impl.NameImpl#getVarName <em>Var Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameImpl extends ExpressionImpl implements Name
{
  /**
   * The cached value of the '{@link #getVarName() <em>Var Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarName()
   * @generated
   * @ordered
   */
  protected Attribute varName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NameImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RestControllerGenerationPackage.Literals.NAME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute getVarName()
  {
    if (varName != null && varName.eIsProxy())
    {
      InternalEObject oldVarName = (InternalEObject)varName;
      varName = (Attribute)eResolveProxy(oldVarName);
      if (varName != oldVarName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RestControllerGenerationPackage.NAME__VAR_NAME, oldVarName, varName));
      }
    }
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetVarName()
  {
    return varName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarName(Attribute newVarName)
  {
    Attribute oldVarName = varName;
    varName = newVarName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestControllerGenerationPackage.NAME__VAR_NAME, oldVarName, varName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RestControllerGenerationPackage.NAME__VAR_NAME:
        if (resolve) return getVarName();
        return basicGetVarName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestControllerGenerationPackage.NAME__VAR_NAME:
        setVarName((Attribute)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RestControllerGenerationPackage.NAME__VAR_NAME:
        setVarName((Attribute)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RestControllerGenerationPackage.NAME__VAR_NAME:
        return varName != null;
    }
    return super.eIsSet(featureID);
  }

} //NameImpl
