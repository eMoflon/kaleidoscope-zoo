/**
 */
package KitchenLanguage.impl;

import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KitchenLanguage.impl.KitchenImpl#getXSize <em>XSize</em>}</li>
 *   <li>{@link KitchenLanguage.impl.KitchenImpl#getYSize <em>YSize</em>}</li>
 *   <li>{@link KitchenLanguage.impl.KitchenImpl#getItemSockets <em>Item Sockets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KitchenImpl extends EObjectImpl implements Kitchen {
	/**
	 * The default value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected static final double XSIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXSize() <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSize()
	 * @generated
	 * @ordered
	 */
	protected double xSize = XSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected static final double YSIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYSize() <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSize()
	 * @generated
	 * @ordered
	 */
	protected double ySize = YSIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItemSockets() <em>Item Sockets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemSockets()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemSocket> itemSockets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitchenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KitchenLanguagePackage.Literals.KITCHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXSize() {
		return xSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXSize(double newXSize) {
		double oldXSize = xSize;
		xSize = newXSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KitchenLanguagePackage.KITCHEN__XSIZE, oldXSize,
					xSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYSize() {
		return ySize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYSize(double newYSize) {
		double oldYSize = ySize;
		ySize = newYSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KitchenLanguagePackage.KITCHEN__YSIZE, oldYSize,
					ySize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemSocket> getItemSockets() {
		if (itemSockets == null) {
			itemSockets = new EObjectContainmentEList<ItemSocket>(ItemSocket.class, this,
					KitchenLanguagePackage.KITCHEN__ITEM_SOCKETS);
		}
		return itemSockets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KitchenLanguagePackage.KITCHEN__ITEM_SOCKETS:
			return ((InternalEList<?>) getItemSockets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KitchenLanguagePackage.KITCHEN__XSIZE:
			return getXSize();
		case KitchenLanguagePackage.KITCHEN__YSIZE:
			return getYSize();
		case KitchenLanguagePackage.KITCHEN__ITEM_SOCKETS:
			return getItemSockets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case KitchenLanguagePackage.KITCHEN__XSIZE:
			setXSize((Double) newValue);
			return;
		case KitchenLanguagePackage.KITCHEN__YSIZE:
			setYSize((Double) newValue);
			return;
		case KitchenLanguagePackage.KITCHEN__ITEM_SOCKETS:
			getItemSockets().clear();
			getItemSockets().addAll((Collection<? extends ItemSocket>) newValue);
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
		case KitchenLanguagePackage.KITCHEN__XSIZE:
			setXSize(XSIZE_EDEFAULT);
			return;
		case KitchenLanguagePackage.KITCHEN__YSIZE:
			setYSize(YSIZE_EDEFAULT);
			return;
		case KitchenLanguagePackage.KITCHEN__ITEM_SOCKETS:
			getItemSockets().clear();
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
		case KitchenLanguagePackage.KITCHEN__XSIZE:
			return xSize != XSIZE_EDEFAULT;
		case KitchenLanguagePackage.KITCHEN__YSIZE:
			return ySize != YSIZE_EDEFAULT;
		case KitchenLanguagePackage.KITCHEN__ITEM_SOCKETS:
			return itemSockets != null && !itemSockets.isEmpty();
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
		result.append(" (xSize: ");
		result.append(xSize);
		result.append(", ySize: ");
		result.append(ySize);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //KitchenImpl
