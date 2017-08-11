/**
 */
package KitchenLanguage.impl;

import KitchenLanguage.*;

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
public class KitchenLanguageFactoryImpl extends EFactoryImpl implements KitchenLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KitchenLanguageFactory init() {
		try {
			KitchenLanguageFactory theKitchenLanguageFactory = (KitchenLanguageFactory) EPackage.Registry.INSTANCE
					.getEFactory(KitchenLanguagePackage.eNS_URI);
			if (theKitchenLanguageFactory != null) {
				return theKitchenLanguageFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KitchenLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenLanguageFactoryImpl() {
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
		case KitchenLanguagePackage.KITCHEN:
			return createKitchen();
		case KitchenLanguagePackage.SINK:
			return createSink();
		case KitchenLanguagePackage.TABLE:
			return createTable();
		case KitchenLanguagePackage.ITEM_SOCKET:
			return createItemSocket();
		case KitchenLanguagePackage.FRIDGE:
			return createFridge();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kitchen createKitchen() {
		KitchenImpl kitchen = new KitchenImpl();
		return kitchen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sink createSink() {
		SinkImpl sink = new SinkImpl();
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemSocket createItemSocket() {
		ItemSocketImpl itemSocket = new ItemSocketImpl();
		return itemSocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fridge createFridge() {
		FridgeImpl fridge = new FridgeImpl();
		return fridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenLanguagePackage getKitchenLanguagePackage() {
		return (KitchenLanguagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KitchenLanguagePackage getPackage() {
		return KitchenLanguagePackage.eINSTANCE;
	}

} //KitchenLanguageFactoryImpl
