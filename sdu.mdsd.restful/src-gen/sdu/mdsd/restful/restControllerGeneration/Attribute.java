/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.Attribute#getRequires <em>Requires</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EntityDeclaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AttributeType)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

  /**
   * Returns the value of the '<em><b>Requires</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requires</em>' containment reference.
   * @see #setRequires(EObject)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getAttribute_Requires()
   * @model containment="true"
   * @generated
   */
  EObject getRequires();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.Attribute#getRequires <em>Requires</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requires</em>' containment reference.
   * @see #getRequires()
   * @generated
   */
  void setRequires(EObject value);

} // Attribute
