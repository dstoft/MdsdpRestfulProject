/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sdu.mdsd.restful.restControllerGeneration.CreateMethod;
import sdu.mdsd.restful.restControllerGeneration.CreateMethodExclude;
import sdu.mdsd.restful.restControllerGeneration.CreateMethodWith;
import sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.impl.CreateMethodImpl#getWithEntity <em>With Entity</em>}</li>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.impl.CreateMethodImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreateMethodImpl extends ControllerMethodImpl implements CreateMethod
{
  /**
   * The cached value of the '{@link #getWithEntity() <em>With Entity</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWithEntity()
   * @generated
   * @ordered
   */
  protected EList<CreateMethodWith> withEntity;

  /**
   * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclude()
   * @generated
   * @ordered
   */
  protected CreateMethodExclude exclude;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateMethodImpl()
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
    return RestControllerGenerationPackage.Literals.CREATE_METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<CreateMethodWith> getWithEntity()
  {
    if (withEntity == null)
    {
      withEntity = new EObjectContainmentEList<CreateMethodWith>(CreateMethodWith.class, this, RestControllerGenerationPackage.CREATE_METHOD__WITH_ENTITY);
    }
    return withEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CreateMethodExclude getExclude()
  {
    return exclude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExclude(CreateMethodExclude newExclude, NotificationChain msgs)
  {
    CreateMethodExclude oldExclude = exclude;
    exclude = newExclude;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE, oldExclude, newExclude);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExclude(CreateMethodExclude newExclude)
  {
    if (newExclude != exclude)
    {
      NotificationChain msgs = null;
      if (exclude != null)
        msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE, null, msgs);
      if (newExclude != null)
        msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE, null, msgs);
      msgs = basicSetExclude(newExclude, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE, newExclude, newExclude));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RestControllerGenerationPackage.CREATE_METHOD__WITH_ENTITY:
        return ((InternalEList<?>)getWithEntity()).basicRemove(otherEnd, msgs);
      case RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE:
        return basicSetExclude(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case RestControllerGenerationPackage.CREATE_METHOD__WITH_ENTITY:
        return getWithEntity();
      case RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE:
        return getExclude();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RestControllerGenerationPackage.CREATE_METHOD__WITH_ENTITY:
        getWithEntity().clear();
        getWithEntity().addAll((Collection<? extends CreateMethodWith>)newValue);
        return;
      case RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE:
        setExclude((CreateMethodExclude)newValue);
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
      case RestControllerGenerationPackage.CREATE_METHOD__WITH_ENTITY:
        getWithEntity().clear();
        return;
      case RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE:
        setExclude((CreateMethodExclude)null);
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
      case RestControllerGenerationPackage.CREATE_METHOD__WITH_ENTITY:
        return withEntity != null && !withEntity.isEmpty();
      case RestControllerGenerationPackage.CREATE_METHOD__EXCLUDE:
        return exclude != null;
    }
    return super.eIsSet(featureID);
  }

} //CreateMethodImpl
