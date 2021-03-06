/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.AttributeUse#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getAttributeUse()
 * @model
 * @generated
 */
public interface AttributeUse extends EObject
{
  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' reference.
   * @see #setAttribute(Attribute)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getAttributeUse_Attribute()
   * @model
   * @generated
   */
  Attribute getAttribute();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.AttributeUse#getAttribute <em>Attribute</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(Attribute value);

} // AttributeUse
