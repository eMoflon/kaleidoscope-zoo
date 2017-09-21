/**
 */
package CryptoConfigToJava;

import CryptoAPIConfig.SymmetricBlockCipher;

import SimpleJava.JavaMethod;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symmetric Block Cipher To Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoConfigToJava.SymmetricBlockCipherToMethod#getSource <em>Source</em>}</li>
 *   <li>{@link CryptoConfigToJava.SymmetricBlockCipherToMethod#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getSymmetricBlockCipherToMethod()
 * @model
 * @generated
 */
public interface SymmetricBlockCipherToMethod extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SymmetricBlockCipher)
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getSymmetricBlockCipherToMethod_Source()
	 * @model required="true"
	 * @generated
	 */
	SymmetricBlockCipher getSource();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.SymmetricBlockCipherToMethod#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SymmetricBlockCipher value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(JavaMethod)
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getSymmetricBlockCipherToMethod_Target()
	 * @model required="true"
	 * @generated
	 */
	JavaMethod getTarget();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.SymmetricBlockCipherToMethod#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JavaMethod value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SymmetricBlockCipherToMethod
