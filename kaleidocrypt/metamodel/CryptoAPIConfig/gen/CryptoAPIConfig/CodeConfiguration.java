/**
 */
package CryptoAPIConfig;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoAPIConfig.CodeConfiguration#getKeystore <em>Keystore</em>}</li>
 *   <li>{@link CryptoAPIConfig.CodeConfiguration#isServer <em>Server</em>}</li>
 *   <li>{@link CryptoAPIConfig.CodeConfiguration#getKeystorePassword <em>Keystore Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getCodeConfiguration()
 * @model
 * @generated
 */
public interface CodeConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Keystore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keystore</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keystore</em>' attribute.
	 * @see #setKeystore(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getCodeConfiguration_Keystore()
	 * @model
	 * @generated
	 */
	String getKeystore();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.CodeConfiguration#getKeystore <em>Keystore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keystore</em>' attribute.
	 * @see #getKeystore()
	 * @generated
	 */
	void setKeystore(String value);

	/**
	 * Returns the value of the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server</em>' attribute.
	 * @see #setServer(boolean)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getCodeConfiguration_Server()
	 * @model
	 * @generated
	 */
	boolean isServer();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.CodeConfiguration#isServer <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server</em>' attribute.
	 * @see #isServer()
	 * @generated
	 */
	void setServer(boolean value);

	/**
	 * Returns the value of the '<em><b>Keystore Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keystore Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keystore Password</em>' attribute.
	 * @see #setKeystorePassword(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getCodeConfiguration_KeystorePassword()
	 * @model
	 * @generated
	 */
	String getKeystorePassword();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.CodeConfiguration#getKeystorePassword <em>Keystore Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keystore Password</em>' attribute.
	 * @see #getKeystorePassword()
	 * @generated
	 */
	void setKeystorePassword(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // CodeConfiguration
