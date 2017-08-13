/**
 */
package KitchenToGridLanguage.impl;

import KitchenToGridLanguage.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KitchenToGridLanguageFactoryImpl extends EFactoryImpl implements KitchenToGridLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KitchenToGridLanguageFactory init() {
		try {
			KitchenToGridLanguageFactory theKitchenToGridLanguageFactory = (KitchenToGridLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(KitchenToGridLanguagePackage.eNS_URI);
			if (theKitchenToGridLanguageFactory != null) {
				return theKitchenToGridLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KitchenToGridLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenToGridLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case KitchenToGridLanguagePackage.SOCKET_TO_GROUP_CORR:
			return createSocketToGroupCorr();
		case KitchenToGridLanguagePackage.KITCHEN_TO_GRID_CORR:
			return createKitchenToGridCorr();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocketToGroupCorr createSocketToGroupCorr() {
		SocketToGroupCorrImpl socketToGroupCorr = new SocketToGroupCorrImpl();
		return socketToGroupCorr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenToGridCorr createKitchenToGridCorr() {
		KitchenToGridCorrImpl kitchenToGridCorr = new KitchenToGridCorrImpl();
		return kitchenToGridCorr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenToGridLanguagePackage getKitchenToGridLanguagePackage() {
		return (KitchenToGridLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KitchenToGridLanguagePackage getPackage() {
		return KitchenToGridLanguagePackage.eINSTANCE;
	}

} //KitchenToGridLanguageFactoryImpl
