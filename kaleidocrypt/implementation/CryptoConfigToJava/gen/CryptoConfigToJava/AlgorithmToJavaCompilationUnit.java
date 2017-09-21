/**
 */
package CryptoConfigToJava;

import CryptoAPIConfig.Algorithm;

import SimpleJava.JavaCompilationUnit;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm To Java Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoConfigToJava.AlgorithmToJavaCompilationUnit#getSource <em>Source</em>}</li>
 *   <li>{@link CryptoConfigToJava.AlgorithmToJavaCompilationUnit#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getAlgorithmToJavaCompilationUnit()
 * @model
 * @generated
 */
public interface AlgorithmToJavaCompilationUnit extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Algorithm)
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getAlgorithmToJavaCompilationUnit_Source()
	 * @model required="true"
	 * @generated
	 */
	Algorithm getSource();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.AlgorithmToJavaCompilationUnit#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(JavaCompilationUnit)
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getAlgorithmToJavaCompilationUnit_Target()
	 * @model required="true"
	 * @generated
	 */
	JavaCompilationUnit getTarget();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.AlgorithmToJavaCompilationUnit#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JavaCompilationUnit value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // AlgorithmToJavaCompilationUnit
