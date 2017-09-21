/**
 */
package CryptoAPIConfig;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symmetric Block Cipher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoAPIConfig.SymmetricBlockCipher#getMode <em>Mode</em>}</li>
 *   <li>{@link CryptoAPIConfig.SymmetricBlockCipher#getPadding <em>Padding</em>}</li>
 *   <li>{@link CryptoAPIConfig.SymmetricBlockCipher#getKeySize <em>Key Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getSymmetricBlockCipher()
 * @model
 * @generated
 */
public interface SymmetricBlockCipher extends Algorithm {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getSymmetricBlockCipher_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.SymmetricBlockCipher#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getSymmetricBlockCipher_Padding()
	 * @model
	 * @generated
	 */
	String getPadding();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.SymmetricBlockCipher#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(String value);

	/**
	 * Returns the value of the '<em><b>Key Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Size</em>' attribute.
	 * @see #setKeySize(int)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getSymmetricBlockCipher_KeySize()
	 * @model
	 * @generated
	 */
	int getKeySize();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.SymmetricBlockCipher#getKeySize <em>Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Size</em>' attribute.
	 * @see #getKeySize()
	 * @generated
	 */
	void setKeySize(int value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SymmetricBlockCipher
