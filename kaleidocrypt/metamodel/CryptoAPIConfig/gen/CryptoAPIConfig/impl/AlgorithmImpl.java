/**
 */
package CryptoAPIConfig.impl;

import CryptoAPIConfig.Algorithm;
import CryptoAPIConfig.CryptoAPIConfigPackage;
import CryptoAPIConfig.Import;
import CryptoAPIConfig.PERFORMANCE;
import CryptoAPIConfig.SECURITY;

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
 * An implementation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CryptoAPIConfig.impl.AlgorithmImpl#getName <em>Name</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.AlgorithmImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.AlgorithmImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.AlgorithmImpl#getPerformance <em>Performance</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.AlgorithmImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link CryptoAPIConfig.impl.AlgorithmImpl#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlgorithmImpl extends EObjectImpl implements Algorithm {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final SECURITY SECURITY_EDEFAULT = SECURITY.BROKEN;

	/**
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected SECURITY security = SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final PERFORMANCE PERFORMANCE_EDEFAULT = PERFORMANCE.VERY_SLOW;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected PERFORMANCE performance = PERFORMANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> imports;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithm> includes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CryptoAPIConfigPackage.Literals.ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.ALGORITHM__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.ALGORITHM__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SECURITY getSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(SECURITY newSecurity) {
		SECURITY oldSecurity = security;
		security = newSecurity == null ? SECURITY_EDEFAULT : newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.ALGORITHM__SECURITY,
					oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERFORMANCE getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformance(PERFORMANCE newPerformance) {
		PERFORMANCE oldPerformance = performance;
		performance = newPerformance == null ? PERFORMANCE_EDEFAULT : newPerformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CryptoAPIConfigPackage.ALGORITHM__PERFORMANCE,
					oldPerformance, performance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getImports() {
		if (imports == null) {
			imports = new EObjectContainmentEList<Import>(Import.class, this,
					CryptoAPIConfigPackage.ALGORITHM__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Algorithm> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<Algorithm>(Algorithm.class, this,
					CryptoAPIConfigPackage.ALGORITHM__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CryptoAPIConfigPackage.ALGORITHM__IMPORTS:
			return ((InternalEList<?>) getImports()).basicRemove(otherEnd, msgs);
		case CryptoAPIConfigPackage.ALGORITHM__INCLUDES:
			return ((InternalEList<?>) getIncludes()).basicRemove(otherEnd, msgs);
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
		case CryptoAPIConfigPackage.ALGORITHM__NAME:
			return getName();
		case CryptoAPIConfigPackage.ALGORITHM__DESCRIPTION:
			return getDescription();
		case CryptoAPIConfigPackage.ALGORITHM__SECURITY:
			return getSecurity();
		case CryptoAPIConfigPackage.ALGORITHM__PERFORMANCE:
			return getPerformance();
		case CryptoAPIConfigPackage.ALGORITHM__IMPORTS:
			return getImports();
		case CryptoAPIConfigPackage.ALGORITHM__INCLUDES:
			return getIncludes();
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
		case CryptoAPIConfigPackage.ALGORITHM__NAME:
			setName((String) newValue);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__SECURITY:
			setSecurity((SECURITY) newValue);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__PERFORMANCE:
			setPerformance((PERFORMANCE) newValue);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends Import>) newValue);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__INCLUDES:
			getIncludes().clear();
			getIncludes().addAll((Collection<? extends Algorithm>) newValue);
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
		case CryptoAPIConfigPackage.ALGORITHM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__SECURITY:
			setSecurity(SECURITY_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__PERFORMANCE:
			setPerformance(PERFORMANCE_EDEFAULT);
			return;
		case CryptoAPIConfigPackage.ALGORITHM__IMPORTS:
			getImports().clear();
			return;
		case CryptoAPIConfigPackage.ALGORITHM__INCLUDES:
			getIncludes().clear();
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
		case CryptoAPIConfigPackage.ALGORITHM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CryptoAPIConfigPackage.ALGORITHM__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case CryptoAPIConfigPackage.ALGORITHM__SECURITY:
			return security != SECURITY_EDEFAULT;
		case CryptoAPIConfigPackage.ALGORITHM__PERFORMANCE:
			return performance != PERFORMANCE_EDEFAULT;
		case CryptoAPIConfigPackage.ALGORITHM__IMPORTS:
			return imports != null && !imports.isEmpty();
		case CryptoAPIConfigPackage.ALGORITHM__INCLUDES:
			return includes != null && !includes.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", security: ");
		result.append(security);
		result.append(", performance: ");
		result.append(performance);
		result.append(')');
		return result.toString();
	}
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //AlgorithmImpl
