/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.CreateMethod#getWithEntity <em>With Entity</em>}</li>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.CreateMethod#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getCreateMethod()
 * @model
 * @generated
 */
public interface CreateMethod extends MethodType
{
  /**
   * Returns the value of the '<em><b>With Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>With Entity</em>' containment reference.
   * @see #setWithEntity(CreateMethodWith)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getCreateMethod_WithEntity()
   * @model containment="true"
   * @generated
   */
  CreateMethodWith getWithEntity();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.CreateMethod#getWithEntity <em>With Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>With Entity</em>' containment reference.
   * @see #getWithEntity()
   * @generated
   */
  void setWithEntity(CreateMethodWith value);

  /**
   * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exclude</em>' containment reference.
   * @see #setExclude(CreateMethodExclude)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getCreateMethod_Exclude()
   * @model containment="true"
   * @generated
   */
  CreateMethodExclude getExclude();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.CreateMethod#getExclude <em>Exclude</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exclude</em>' containment reference.
   * @see #getExclude()
   * @generated
   */
  void setExclude(CreateMethodExclude value);

} // CreateMethod