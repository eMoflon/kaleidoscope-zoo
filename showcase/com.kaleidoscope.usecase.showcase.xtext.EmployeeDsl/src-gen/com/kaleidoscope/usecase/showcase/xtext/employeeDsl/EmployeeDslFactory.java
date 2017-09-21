/**
 * generated by Xtext 2.12.0
 */
package com.kaleidoscope.usecase.showcase.xtext.employeeDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeDslPackage
 * @generated
 */
public interface EmployeeDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EmployeeDslFactory eINSTANCE = com.kaleidoscope.usecase.showcase.xtext.employeeDsl.impl.EmployeeDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Employee Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Employee Container</em>'.
   * @generated
   */
  EmployeeContainer createEmployeeContainer();

  /**
   * Returns a new object of class '<em>Employee</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Employee</em>'.
   * @generated
   */
  Employee createEmployee();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EmployeeDslPackage getEmployeeDslPackage();

} //EmployeeDslFactory