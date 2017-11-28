/**
 */
package Persons;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Persons.PersonContainer#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see Persons.PersonsPackage#getPersonContainer()
 * @model
 * @generated
 */
public interface PersonContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link Persons.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see Persons.PersonsPackage#getPersonContainer_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // PersonContainer
