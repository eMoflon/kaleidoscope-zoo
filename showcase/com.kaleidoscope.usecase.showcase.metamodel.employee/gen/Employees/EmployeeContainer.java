/**
 */
package Employees;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employee Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Employees.EmployeeContainer#getEmployees <em>Employees</em>}</li>
 * </ul>
 * </p>
 *
 * @see Employees.EmployeesPackage#getEmployeeContainer()
 * @model
 * @generated
 */
public interface EmployeeContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
	 * The list contents are of type {@link Employees.Employee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employees</em>' containment reference list.
	 * @see Employees.EmployeesPackage#getEmployeeContainer_Employees()
	 * @model containment="true"
	 * @generated
	 */
	EList<Employee> getEmployees();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // EmployeeContainer
