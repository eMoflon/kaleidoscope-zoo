/**
 */
package CryptoConfigToJava;

import CryptoAPIConfig.KeyDerivationAlgorithm;

import SimpleJava.JavaCompilationUnit;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Derivation Algorithm To Jcu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoConfigToJava.KeyDerivationAlgorithmToJcu#getSource <em>Source</em>}</li>
 *   <li>{@link CryptoConfigToJava.KeyDerivationAlgorithmToJcu#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getKeyDerivationAlgorithmToJcu()
 * @model
 * @generated
 */
public interface KeyDerivationAlgorithmToJcu extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(KeyDerivationAlgorithm)
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getKeyDerivationAlgorithmToJcu_Source()
	 * @model required="true"
	 * @generated
	 */
	KeyDerivationAlgorithm getSource();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.KeyDerivationAlgorithmToJcu#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(KeyDerivationAlgorithm value);

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
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getKeyDerivationAlgorithmToJcu_Target()
	 * @model required="true"
	 * @generated
	 */
	JavaCompilationUnit getTarget();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.KeyDerivationAlgorithmToJcu#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JavaCompilationUnit value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // KeyDerivationAlgorithmToJcu
