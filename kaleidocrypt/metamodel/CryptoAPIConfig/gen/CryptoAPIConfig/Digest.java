/**
 */
package CryptoAPIConfig;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoAPIConfig.Digest#getOutputSize <em>Output Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getDigest()
 * @model
 * @generated
 */
public interface Digest extends Algorithm {
	/**
	 * Returns the value of the '<em><b>Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Size</em>' attribute.
	 * @see #setOutputSize(int)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getDigest_OutputSize()
	 * @model
	 * @generated
	 */
	int getOutputSize();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.Digest#getOutputSize <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Size</em>' attribute.
	 * @see #getOutputSize()
	 * @generated
	 */
	void setOutputSize(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Digest
