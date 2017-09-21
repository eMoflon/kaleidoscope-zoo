/**
 */
package CryptoAPIConfig.impl;

import CryptoAPIConfig.CryptoAPIConfigPackage;
import CryptoAPIConfig.SymmetricBlockCipher;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symmetric Block Cipher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CryptoAPIConfig.impl.SymmetricBlockCipherImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.SymmetricBlockCipherImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.SymmetricBlockCipherImpl#getKeySize <em>Key Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymmetricBlockCipherImpl extends AlgorithmImpl implements SymmetricBlockCipher {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final String PADDING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected String padding = PADDING_EDEFAULT;

	/**
	 * The default value of the '{@link #getKeySize() <em>Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySize()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKeySize() <em>Key Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeySize()
	 * @generated
	 * @ordered
	 */
	protected int keySize = KEY_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymmetricBlockCipherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoAPIConfigPackage.Literals.SYMMETRIC_BLOCK_CIPHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__MODE,
					oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPadding() {
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPadding(String newPadding) {
		String oldPadding = padding;
		padding = newPadding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__PADDING, oldPadding, padding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKeySize() {
		return keySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeySize(int newKeySize) {
		int oldKeySize = keySize;
		keySize = newKeySize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__KEY_SIZE, oldKeySize, keySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__MODE:
			return getMode();
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__PADDING:
			return getPadding();
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__KEY_SIZE:
			return getKeySize();
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
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__MODE:
			setMode((String) newValue);
			return;
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__PADDING:
			setPadding((String) newValue);
			return;
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__KEY_SIZE:
			setKeySize((Integer) newValue);
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
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__MODE:
			setMode(MODE_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__PADDING:
			setPadding(PADDING_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__KEY_SIZE:
			setKeySize(KEY_SIZE_EDEFAULT);
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
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__MODE:
			return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__PADDING:
			return PADDING_EDEFAULT == null ? padding != null : !PADDING_EDEFAULT.equals(padding);
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER__KEY_SIZE:
			return keySize != KEY_SIZE_EDEFAULT;
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(", padding: ");
		result.append(padding);
		result.append(", keySize: ");
		result.append(keySize);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SymmetricBlockCipherImpl
