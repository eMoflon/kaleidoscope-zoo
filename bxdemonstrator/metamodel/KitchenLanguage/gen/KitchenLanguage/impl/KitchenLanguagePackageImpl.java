/**
 */
package KitchenLanguage.impl;

import KitchenLanguage.Fridge;
import KitchenLanguage.Item;
import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguageFactory;
import KitchenLanguage.KitchenLanguagePackage;
import KitchenLanguage.Sink;
import KitchenLanguage.Table;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KitchenLanguagePackageImpl extends EPackageImpl implements KitchenLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitchenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemSocketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fridgeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see KitchenLanguage.KitchenLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KitchenLanguagePackageImpl() {
		super(eNS_URI, KitchenLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link KitchenLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KitchenLanguagePackage init() {
		if (isInited)
			return (KitchenLanguagePackage) EPackage.Registry.INSTANCE.getEPackage(KitchenLanguagePackage.eNS_URI);

		// Obtain or create and register package
		KitchenLanguagePackageImpl theKitchenLanguagePackage = (KitchenLanguagePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof KitchenLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new KitchenLanguagePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theKitchenLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theKitchenLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKitchenLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KitchenLanguagePackage.eNS_URI, theKitchenLanguagePackage);
		return theKitchenLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKitchen() {
		return kitchenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKitchen_XSize() {
		return (EAttribute) kitchenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKitchen_YSize() {
		return (EAttribute) kitchenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKitchen_ItemSockets() {
		return (EReference) kitchenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_XPos() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_YPos() {
		return (EAttribute) itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSink() {
		return sinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemSocket() {
		return itemSocketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemSocket_Id() {
		return (EAttribute) itemSocketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemSocket_Item() {
		return (EReference) itemSocketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFridge() {
		return fridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenLanguageFactory getKitchenLanguageFactory() {
		return (KitchenLanguageFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		kitchenEClass = createEClass(KITCHEN);
		createEAttribute(kitchenEClass, KITCHEN__XSIZE);
		createEAttribute(kitchenEClass, KITCHEN__YSIZE);
		createEReference(kitchenEClass, KITCHEN__ITEM_SOCKETS);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__XPOS);
		createEAttribute(itemEClass, ITEM__YPOS);

		sinkEClass = createEClass(SINK);

		tableEClass = createEClass(TABLE);

		itemSocketEClass = createEClass(ITEM_SOCKET);
		createEAttribute(itemSocketEClass, ITEM_SOCKET__ID);
		createEReference(itemSocketEClass, ITEM_SOCKET__ITEM);

		fridgeEClass = createEClass(FRIDGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sinkEClass.getESuperTypes().add(this.getItem());
		tableEClass.getESuperTypes().add(this.getItem());
		fridgeEClass.getESuperTypes().add(this.getItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(kitchenEClass, Kitchen.class, "Kitchen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKitchen_XSize(), ecorePackage.getEDouble(), "xSize", null, 0, 1, Kitchen.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKitchen_YSize(), ecorePackage.getEDouble(), "ySize", null, 0, 1, Kitchen.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKitchen_ItemSockets(), this.getItemSocket(), null, "itemSockets", null, 0, -1, Kitchen.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_XPos(), ecorePackage.getEDouble(), "xPos", null, 0, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_YPos(), ecorePackage.getEDouble(), "yPos", null, 0, 1, Item.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sinkEClass, Sink.class, "Sink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemSocketEClass, ItemSocket.class, "ItemSocket", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemSocket_Id(), ecorePackage.getEString(), "id", "", 0, 1, ItemSocket.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemSocket_Item(), this.getItem(), null, "item", null, 1, 1, ItemSocket.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(fridgeEClass, Fridge.class, "Fridge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //KitchenLanguagePackageImpl
