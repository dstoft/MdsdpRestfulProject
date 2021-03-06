/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Use Of Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute#getExternal <em>External</em>}</li>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getExternalUseOfAttribute()
 * @model
 * @generated
 */
public interface ExternalUseOfAttribute extends EObject
{
  /**
   * Returns the value of the '<em><b>External</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>External</em>' reference.
   * @see #setExternal(ExternalDef)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getExternalUseOfAttribute_External()
   * @model
   * @generated
   */
  ExternalDef getExternal();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute#getExternal <em>External</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External</em>' reference.
   * @see #getExternal()
   * @generated
   */
  void setExternal(ExternalDef value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(EObject)
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getExternalUseOfAttribute_Attribute()
   * @model containment="true"
   * @generated
   */
  EObject getAttribute();

  /**
   * Sets the value of the '{@link sdu.mdsd.restful.restControllerGeneration.ExternalUseOfAttribute#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(EObject value);

} // ExternalUseOfAttribute
