/**
 */
package KitchenLanguage.impl;

import KitchenLanguage.Item;
import KitchenLanguage.ItemSocket;
import KitchenLanguage.KitchenLanguagePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Socket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KitchenLanguage.impl.ItemSocketImpl#getId <em>Id</em>}</li>
 *   <li>{@link KitchenLanguage.impl.ItemSocketImpl#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemSocketImpl extends EObjectImpl implements ItemSocket {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected Item item;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemSocketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KitchenLanguagePackage.Literals.ITEM_SOCKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KitchenLanguagePackage.ITEM_SOCKET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItem(Item newItem, NotificationChain msgs) {
		Item oldItem = item;
		item = newItem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					KitchenLanguagePackage.ITEM_SOCKET__ITEM, oldItem, newItem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(Item newItem) {
		if (newItem != item) {
			NotificationChain msgs = null;
			if (item != null)
				msgs = ((InternalEObject) item).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - KitchenLanguagePackage.ITEM_SOCKET__ITEM, null, msgs);
			if (newItem != null)
				msgs = ((InternalEObject) newItem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - KitchenLanguagePackage.ITEM_SOCKET__ITEM, null, msgs);
			msgs = basicSetItem(newItem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KitchenLanguagePackage.ITEM_SOCKET__ITEM, newItem,
					newItem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case KitchenLanguagePackage.ITEM_SOCKET__ITEM:
			return basicSetItem(null, msgs);
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
		case KitchenLanguagePackage.ITEM_SOCKET__ID:
			return getId();
		case KitchenLanguagePackage.ITEM_SOCKET__ITEM:
			return getItem();
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
		case KitchenLanguagePackage.ITEM_SOCKET__ID:
			setId((String) newValue);
			return;
		case KitchenLanguagePackage.ITEM_SOCKET__ITEM:
			setItem((Item) newValue);
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
		case KitchenLanguagePackage.ITEM_SOCKET__ID:
			setId(ID_EDEFAULT);
			return;
		case KitchenLanguagePackage.ITEM_SOCKET__ITEM:
			setItem((Item) null);
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
		case KitchenLanguagePackage.ITEM_SOCKET__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case KitchenLanguagePackage.ITEM_SOCKET__ITEM:
			return item != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //ItemSocketImpl
