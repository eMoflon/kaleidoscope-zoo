/**
 */
package CryptoConfigToJava.impl;

import CryptoAPIConfig.KeyDerivationAlgorithm;

import CryptoConfigToJava.CryptoConfigToJavaPackage;
import CryptoConfigToJava.KeyDerivationAlgorithmToJcu;

import SimpleJava.JavaCompilationUnit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Derivation Algorithm To Jcu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CryptoConfigToJava.impl.KeyDerivationAlgorithmToJcuImpl#getSource <em>Source</em>}</li>
 *   <li>{@link CryptoConfigToJava.impl.KeyDerivationAlgorithmToJcuImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeyDerivationAlgorithmToJcuImpl extends AbstractCorrespondenceImpl implements KeyDerivationAlgorithmToJcu {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected KeyDerivationAlgorithm source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected JavaCompilationUnit target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyDerivationAlgorithmToJcuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoConfigToJavaPackage.Literals.KEY_DERIVATION_ALGORITHM_TO_JCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDerivationAlgorithm getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (KeyDerivationAlgorithm) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDerivationAlgorithm basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(KeyDerivationAlgorithm newSource) {
		KeyDerivationAlgorithm oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaCompilationUnit getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (JavaCompilationUnit) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaCompilationUnit basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(JavaCompilationUnit newTarget) {
		JavaCompilationUnit oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__SOURCE:
			setSource((KeyDerivationAlgorithm) newValue);
			return;
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__TARGET:
			setTarget((JavaCompilationUnit) newValue);
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
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__SOURCE:
			setSource((KeyDerivationAlgorithm) null);
			return;
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__TARGET:
			setTarget((JavaCompilationUnit) null);
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
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__SOURCE:
			return source != null;
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //KeyDerivationAlgorithmToJcuImpl
