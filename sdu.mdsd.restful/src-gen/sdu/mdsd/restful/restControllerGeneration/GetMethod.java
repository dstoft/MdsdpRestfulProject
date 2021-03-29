/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.GetMethod#getEntityId <em>Entity Id</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getGetMethod()
 * @model
 * @generated
 */
public interface GetMethod extends MethodType
{
  /**
   * Returns the value of the '<em><b>Entity Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Id</em>' reference.
   * @see #setEntityId(Attribute)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getGetMethod_EntityId()
   * @model
   * @generated
   */
  Attribute getEntityId();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.GetMethod#getEntityId <em>Entity Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Id</em>' reference.
   * @see #getEntityId()
   * @generated
   */
  void setEntityId(Attribute value);

} // GetMethod