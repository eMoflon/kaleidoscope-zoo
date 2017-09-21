/**
 */
package CryptoAPIConfig;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secure Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoAPIConfig.SecureConnection#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getSecureConnection()
 * @model
 * @generated
 */
public interface SecureConnection extends Task {
	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(CodeConfiguration)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getSecureConnection_Config()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CodeConfiguration getConfig();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.SecureConnection#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(CodeConfiguration value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SecureConnection
