/**
 */
package CryptoAPIConfig.impl;

import CryptoAPIConfig.CodeConfiguration;
import CryptoAPIConfig.CryptoAPIConfigPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CryptoAPIConfig.impl.CodeConfigurationImpl#getKeystore <em>Keystore</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.CodeConfigurationImpl#isServer <em>Server</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.CodeConfigurationImpl#getKeystorePassword <em>Keystore Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodeConfigurationImpl extends EObjectImpl implements CodeConfiguration {
	/**
	 * The default value of the '{@link #getKeystore() <em>Keystore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystore()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTORE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeystore() <em>Keystore</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystore()
	 * @generated
	 * @ordered
	 */
	protected String keystore = KEYSTORE_EDEFAULT;

	/**
	 * The default value of the '{@link #isServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SERVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isServer() <em>Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isServer()
	 * @generated
	 * @ordered
	 */
	protected boolean server = SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeystorePassword() <em>Keystore Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorePassword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYSTORE_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeystorePassword() <em>Keystore Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeystorePassword()
	 * @generated
	 * @ordered
	 */
	protected String keystorePassword = KEYSTORE_PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoAPIConfigPackage.Literals.CODE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystore() {
		return keystore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystore(String newKeystore) {
		String oldKeystore = keystore;
		keystore = newKeystore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE,
					oldKeystore, keystore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isServer() {
		return server;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServer(boolean newServer) {
		boolean oldServer = server;
		server = newServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.CODE_CONFIGURATION__SERVER,
					oldServer, server));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeystorePassword() {
		return keystorePassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeystorePassword(String newKeystorePassword) {
		String oldKeystorePassword = keystorePassword;
		keystorePassword = newKeystorePassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE_PASSWORD, oldKeystorePassword,
					keystorePassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE:
			return getKeystore();
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__SERVER:
			return isServer();
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE_PASSWORD:
			return getKeystorePassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE:
			setKeystore((String) newValue);
			return;
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__SERVER:
			setServer((Boolean) newValue);
			return;
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE_PASSWORD:
			setKeystorePassword((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE:
			setKeystore(KEYSTORE_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__SERVER:
			setServer(SERVER_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE_PASSWORD:
			setKeystorePassword(KEYSTORE_PASSWORD_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE:
			return KEYSTORE_EDEFAULT == null ? keystore != null : !KEYSTORE_EDEFAULT.equals(keystore);
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__SERVER:
			return server != SERVER_EDEFAULT;
		case CryptoAPIConfigPackage.CODE_CONFIGURATION__KEYSTORE_PASSWORD:
			return KEYSTORE_PASSWORD_EDEFAULT == null ? keystorePassword != null
					: !KEYSTORE_PASSWORD_EDEFAULT.equals(keystorePassword);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (keystore: ");
		result.append(keystore);
		result.append(", server: ");
		result.append(server);
		result.append(", keystorePassword: ");
		result.append(keystorePassword);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //CodeConfigurationImpl
