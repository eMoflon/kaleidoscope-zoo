/**
 */
package KitchenLanguage.impl;

import KitchenLanguage.Item;
import KitchenLanguage.KitchenLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KitchenLanguage.impl.ItemImpl#getXPos <em>XPos</em>}</li>
 *   <li>{@link KitchenLanguage.impl.ItemImpl#getYPos <em>YPos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ItemImpl extends EObjectImpl implements Item {
	/**
	 * The default value of the '{@link #getXPos() <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPos()
	 * @generated
	 * @ordered
	 */
	protected static final double XPOS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getXPos() <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPos()
	 * @generated
	 * @ordered
	 */
	protected double xPos = XPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPos() <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPos()
	 * @generated
	 * @ordered
	 */
	protected static final double YPOS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYPos() <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPos()
	 * @generated
	 * @ordered
	 */
	protected double yPos = YPOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KitchenLanguagePackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getXPos() {
		return xPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPos(double newXPos) {
		double oldXPos = xPos;
		xPos = newXPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KitchenLanguagePackage.ITEM__XPOS, oldXPos, xPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYPos() {
		return yPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPos(double newYPos) {
		double oldYPos = yPos;
		yPos = newYPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KitchenLanguagePackage.ITEM__YPOS, oldYPos, yPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case KitchenLanguagePackage.ITEM__XPOS:
			return getXPos();
		case KitchenLanguagePackage.ITEM__YPOS:
			return getYPos();
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
		case KitchenLanguagePackage.ITEM__XPOS:
			setXPos((Double) newValue);
			return;
		case KitchenLanguagePackage.ITEM__YPOS:
			setYPos((Double) newValue);
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
		case KitchenLanguagePackage.ITEM__XPOS:
			setXPos(XPOS_EDEFAULT);
			return;
		case KitchenLanguagePackage.ITEM__YPOS:
			setYPos(YPOS_EDEFAULT);
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
		case KitchenLanguagePackage.ITEM__XPOS:
			return xPos != XPOS_EDEFAULT;
		case KitchenLanguagePackage.ITEM__YPOS:
			return yPos != YPOS_EDEFAULT;
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
		result.append(" (xPos: ");
		result.append(xPos);
		result.append(", yPos: ");
		result.append(yPos);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ItemImpl
