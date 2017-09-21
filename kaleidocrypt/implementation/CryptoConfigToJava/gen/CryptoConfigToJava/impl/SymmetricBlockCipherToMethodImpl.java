/**
 */
package CryptoConfigToJava.impl;

import CryptoAPIConfig.SymmetricBlockCipher;

import CryptoConfigToJava.CryptoConfigToJavaPackage;
import CryptoConfigToJava.SymmetricBlockCipherToMethod;

import SimpleJava.JavaMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symmetric Block Cipher To Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CryptoConfigToJava.impl.SymmetricBlockCipherToMethodImpl#getSource <em>Source</em>}</li>
 *   <li>{@link CryptoConfigToJava.impl.SymmetricBlockCipherToMethodImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymmetricBlockCipherToMethodImpl extends AbstractCorrespondenceImpl
		implements SymmetricBlockCipherToMethod {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SymmetricBlockCipher source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected JavaMethod target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymmetricBlockCipherToMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoConfigToJavaPackage.Literals.SYMMETRIC_BLOCK_CIPHER_TO_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricBlockCipher getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (SymmetricBlockCipher) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricBlockCipher basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SymmetricBlockCipher newSource) {
		SymmetricBlockCipher oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMethod getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (JavaMethod) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaMethod basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(JavaMethod newTarget) {
		JavaMethod oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__TARGET:
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
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__SOURCE:
			setSource((SymmetricBlockCipher) newValue);
			return;
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__TARGET:
			setTarget((JavaMethod) newValue);
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
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__SOURCE:
			setSource((SymmetricBlockCipher) null);
			return;
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__TARGET:
			setTarget((JavaMethod) null);
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
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__SOURCE:
			return source != null;
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SymmetricBlockCipherToMethodImpl
