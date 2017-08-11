/**
 */
package KitchenToGridLanguage.impl;

import GridLanguage.Grid;

import KitchenLanguage.Kitchen;

import KitchenToGridLanguage.KitchenToGridCorr;
import KitchenToGridLanguage.KitchenToGridLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.moflon.tgg.runtime.impl.AbstractCorrespondenceImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kitchen To Grid Corr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KitchenToGridLanguage.impl.KitchenToGridCorrImpl#getSource <em>Source</em>}</li>
 *   <li>{@link KitchenToGridLanguage.impl.KitchenToGridCorrImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KitchenToGridCorrImpl extends AbstractCorrespondenceImpl implements KitchenToGridCorr {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Grid source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Kitchen target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitchenToGridCorrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KitchenToGridLanguagePackage.Literals.KITCHEN_TO_GRID_CORR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Grid) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Grid newSource) {
		Grid oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kitchen getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Kitchen) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kitchen basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Kitchen newTarget) {
		Kitchen oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__TARGET:
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
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__SOURCE:
			setSource((Grid) newValue);
			return;
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__TARGET:
			setTarget((Kitchen) newValue);
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
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__SOURCE:
			setSource((Grid) null);
			return;
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__TARGET:
			setTarget((Kitchen) null);
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
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__SOURCE:
			return source != null;
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //KitchenToGridCorrImpl
