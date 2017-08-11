/**
 */
package GridLanguage.impl;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.GridLanguagePackage;
import GridLanguage.Group;

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
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GridLanguage.impl.GridImpl#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link GridLanguage.impl.GridImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link GridLanguage.impl.GridImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GridImpl extends EObjectImpl implements Grid {
	/**
	 * The default value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected static final double BLOCK_SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getBlockSize() <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSize()
	 * @generated
	 * @ordered
	 */
	protected double blockSize = BLOCK_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

	/**
	 * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Block> blocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GridLanguagePackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBlockSize() {
		return blockSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockSize(double newBlockSize) {
		double oldBlockSize = blockSize;
		blockSize = newBlockSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GridLanguagePackage.GRID__BLOCK_SIZE, oldBlockSize,
					blockSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, GridLanguagePackage.GRID__GROUPS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Block> getBlocks() {
		if (blocks == null) {
			blocks = new EObjectContainmentEList<Block>(Block.class, this, GridLanguagePackage.GRID__BLOCKS);
		}
		return blocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GridLanguagePackage.GRID__GROUPS:
			return ((InternalEList<?>) getGroups()).basicRemove(otherEnd, msgs);
		case GridLanguagePackage.GRID__BLOCKS:
			return ((InternalEList<?>) getBlocks()).basicRemove(otherEnd, msgs);
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
		case GridLanguagePackage.GRID__BLOCK_SIZE:
			return getBlockSize();
		case GridLanguagePackage.GRID__GROUPS:
			return getGroups();
		case GridLanguagePackage.GRID__BLOCKS:
			return getBlocks();
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
		case GridLanguagePackage.GRID__BLOCK_SIZE:
			setBlockSize((Double) newValue);
			return;
		case GridLanguagePackage.GRID__GROUPS:
			getGroups().clear();
			getGroups().addAll((Collection<? extends Group>) newValue);
			return;
		case GridLanguagePackage.GRID__BLOCKS:
			getBlocks().clear();
			getBlocks().addAll((Collection<? extends Block>) newValue);
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
		case GridLanguagePackage.GRID__BLOCK_SIZE:
			setBlockSize(BLOCK_SIZE_EDEFAULT);
			return;
		case GridLanguagePackage.GRID__GROUPS:
			getGroups().clear();
			return;
		case GridLanguagePackage.GRID__BLOCKS:
			getBlocks().clear();
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
		case GridLanguagePackage.GRID__BLOCK_SIZE:
			return blockSize != BLOCK_SIZE_EDEFAULT;
		case GridLanguagePackage.GRID__GROUPS:
			return groups != null && !groups.isEmpty();
		case GridLanguagePackage.GRID__BLOCKS:
			return blocks != null && !blocks.isEmpty();
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
		result.append(" (blockSize: ");
		result.append(blockSize);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //GridImpl
