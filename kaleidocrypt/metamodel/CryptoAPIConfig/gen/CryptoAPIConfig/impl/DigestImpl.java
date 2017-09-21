/**
 */
package CryptoAPIConfig.impl;

import CryptoAPIConfig.CryptoAPIConfigPackage;
import CryptoAPIConfig.Digest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CryptoAPIConfig.impl.DigestImpl#getOutputSize <em>Output Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DigestImpl extends AlgorithmImpl implements Digest {
	/**
	 * The default value of the '{@link #getOutputSize() <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSize()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputSize() <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSize()
	 * @generated
	 * @ordered
	 */
	protected int outputSize = OUTPUT_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DigestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoAPIConfigPackage.Literals.DIGEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOutputSize() {
		return outputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSize(int newOutputSize) {
		int oldOutputSize = outputSize;
		outputSize = newOutputSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.DIGEST__OUTPUT_SIZE,
					oldOutputSize, outputSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CryptoAPIConfigPackage.DIGEST__OUTPUT_SIZE:
			return getOutputSize();
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
		case CryptoAPIConfigPackage.DIGEST__OUTPUT_SIZE:
			setOutputSize((Integer) newValue);
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
		case CryptoAPIConfigPackage.DIGEST__OUTPUT_SIZE:
			setOutputSize(OUTPUT_SIZE_EDEFAULT);
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
		case CryptoAPIConfigPackage.DIGEST__OUTPUT_SIZE:
			return outputSize != OUTPUT_SIZE_EDEFAULT;
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
		result.append(" (outputSize: ");
		result.append(outputSize);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //DigestImpl
