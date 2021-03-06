/**
 * generated by Xtext 2.24.0
 */
package sdu.mdsd.restful.restControllerGeneration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Method Exclude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sdu.mdsd.restful.restControllerGeneration.CreateMethodExclude#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getCreateMethodExclude()
 * @model
 * @generated
 */
public interface CreateMethodExclude extends EObject
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' reference list.
   * The list contents are of type {@link sdu.mdsd.restful.restControllerGeneration.Attribute}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' reference list.
   * @see sdu.mdsd.restful.restControllerGeneration.RestControllerGenerationPackage#getCreateMethodExclude_Attributes()
   * @model
   * @generated
   */
  EList<Attribute> getAttributes();

} // CreateMethodExclude
