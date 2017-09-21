/**
 */
package CryptoAPIConfig.impl;

import CryptoAPIConfig.CryptoAPIConfigPackage;
import CryptoAPIConfig.KeyDerivationAlgorithm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Derivation Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CryptoAPIConfig.impl.KeyDerivationAlgorithmImpl#getIterations <em>Iterations</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.KeyDerivationAlgorithmImpl#getOutputSize <em>Output Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyDerivationAlgorithmImpl extends AlgorithmImpl implements KeyDerivationAlgorithm {
	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected String iterations = ITERATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputSize() <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSize()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputSize() <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputSize()
	 * @generated
	 * @ordered
	 */
	protected String outputSize = OUTPUT_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyDerivationAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoAPIConfigPackage.Literals.KEY_DERIVATION_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(String newIterations) {
		String oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__ITERATIONS, oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputSize() {
		return outputSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputSize(String newOutputSize) {
		String oldOutputSize = outputSize;
		outputSize = newOutputSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE, oldOutputSize, outputSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__ITERATIONS:
			return getIterations();
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE:
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
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__ITERATIONS:
			setIterations((String) newValue);
			return;
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE:
			setOutputSize((String) newValue);
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
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__ITERATIONS:
			setIterations(ITERATIONS_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE:
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
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__ITERATIONS:
			return ITERATIONS_EDEFAULT == null ? iterations != null : !ITERATIONS_EDEFAULT.equals(iterations);
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE:
			return OUTPUT_SIZE_EDEFAULT == null ? outputSize != null : !OUTPUT_SIZE_EDEFAULT.equals(outputSize);
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
		result.append(" (iterations: ");
		result.append(iterations);
		result.append(", outputSize: ");
		result.append(outputSize);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //KeyDerivationAlgorithmImpl
