/**
 */
package KitchenLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see KitchenLanguage.KitchenLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface KitchenLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KitchenLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/KitchenLanguage/model/KitchenLanguage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "KitchenLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KitchenLanguagePackage eINSTANCE = KitchenLanguage.impl.KitchenLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link KitchenLanguage.impl.KitchenImpl <em>Kitchen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenLanguage.impl.KitchenImpl
	 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getKitchen()
	 * @generated
	 */
	int KITCHEN = 0;

	/**
	 * The feature id for the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__XSIZE = 0;

	/**
	 * The feature id for the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__YSIZE = 1;

	/**
	 * The feature id for the '<em><b>Item Sockets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN__ITEM_SOCKETS = 2;

	/**
	 * The number of structural features of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Kitchen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link KitchenLanguage.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenLanguage.impl.ItemImpl
	 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__XPOS = 0;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__YPOS = 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link KitchenLanguage.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenLanguage.impl.SinkImpl
	 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getSink()
	 * @generated
	 */
	int SINK = 2;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__XPOS = ITEM__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__YPOS = ITEM__YPOS;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KitchenLanguage.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenLanguage.impl.TableImpl
	 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 3;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__XPOS = ITEM__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__YPOS = ITEM__YPOS;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KitchenLanguage.impl.ItemSocketImpl <em>Item Socket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenLanguage.impl.ItemSocketImpl
	 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getItemSocket()
	 * @generated
	 */
	int ITEM_SOCKET = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SOCKET__ID = 0;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SOCKET__ITEM = 1;

	/**
	 * The number of structural features of the '<em>Item Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SOCKET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Socket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_SOCKET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link KitchenLanguage.impl.FridgeImpl <em>Fridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenLanguage.impl.FridgeImpl
	 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getFridge()
	 * @generated
	 */
	int FRIDGE = 5;

	/**
	 * The feature id for the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIDGE__XPOS = ITEM__XPOS;

	/**
	 * The feature id for the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIDGE__YPOS = ITEM__YPOS;

	/**
	 * The number of structural features of the '<em>Fridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIDGE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIDGE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link KitchenLanguage.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen</em>'.
	 * @see KitchenLanguage.Kitchen
	 * @generated
	 */
	EClass getKitchen();

	/**
	 * Returns the meta object for the attribute '{@link KitchenLanguage.Kitchen#getXSize <em>XSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XSize</em>'.
	 * @see KitchenLanguage.Kitchen#getXSize()
	 * @see #getKitchen()
	 * @generated
	 */
	EAttribute getKitchen_XSize();

	/**
	 * Returns the meta object for the attribute '{@link KitchenLanguage.Kitchen#getYSize <em>YSize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YSize</em>'.
	 * @see KitchenLanguage.Kitchen#getYSize()
	 * @see #getKitchen()
	 * @generated
	 */
	EAttribute getKitchen_YSize();

	/**
	 * Returns the meta object for the containment reference list '{@link KitchenLanguage.Kitchen#getItemSockets <em>Item Sockets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Sockets</em>'.
	 * @see KitchenLanguage.Kitchen#getItemSockets()
	 * @see #getKitchen()
	 * @generated
	 */
	EReference getKitchen_ItemSockets();

	/**
	 * Returns the meta object for class '{@link KitchenLanguage.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see KitchenLanguage.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link KitchenLanguage.Item#getXPos <em>XPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XPos</em>'.
	 * @see KitchenLanguage.Item#getXPos()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_XPos();

	/**
	 * Returns the meta object for the attribute '{@link KitchenLanguage.Item#getYPos <em>YPos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YPos</em>'.
	 * @see KitchenLanguage.Item#getYPos()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_YPos();

	/**
	 * Returns the meta object for class '{@link KitchenLanguage.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see KitchenLanguage.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for class '{@link KitchenLanguage.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see KitchenLanguage.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for class '{@link KitchenLanguage.ItemSocket <em>Item Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Socket</em>'.
	 * @see KitchenLanguage.ItemSocket
	 * @generated
	 */
	EClass getItemSocket();

	/**
	 * Returns the meta object for the attribute '{@link KitchenLanguage.ItemSocket#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see KitchenLanguage.ItemSocket#getId()
	 * @see #getItemSocket()
	 * @generated
	 */
	EAttribute getItemSocket_Id();

	/**
	 * Returns the meta object for the containment reference '{@link KitchenLanguage.ItemSocket#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item</em>'.
	 * @see KitchenLanguage.ItemSocket#getItem()
	 * @see #getItemSocket()
	 * @generated
	 */
	EReference getItemSocket_Item();

	/**
	 * Returns the meta object for class '{@link KitchenLanguage.Fridge <em>Fridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fridge</em>'.
	 * @see KitchenLanguage.Fridge
	 * @generated
	 */
	EClass getFridge();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KitchenLanguageFactory getKitchenLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link KitchenLanguage.impl.KitchenImpl <em>Kitchen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenLanguage.impl.KitchenImpl
		 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getKitchen()
		 * @generated
		 */
		EClass KITCHEN = eINSTANCE.getKitchen();

		/**
		 * The meta object literal for the '<em><b>XSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITCHEN__XSIZE = eINSTANCE.getKitchen_XSize();

		/**
		 * The meta object literal for the '<em><b>YSize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KITCHEN__YSIZE = eINSTANCE.getKitchen_YSize();

		/**
		 * The meta object literal for the '<em><b>Item Sockets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN__ITEM_SOCKETS = eINSTANCE.getKitchen_ItemSockets();

		/**
		 * The meta object literal for the '{@link KitchenLanguage.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenLanguage.impl.ItemImpl
		 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>XPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__XPOS = eINSTANCE.getItem_XPos();

		/**
		 * The meta object literal for the '<em><b>YPos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__YPOS = eINSTANCE.getItem_YPos();

		/**
		 * The meta object literal for the '{@link KitchenLanguage.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenLanguage.impl.SinkImpl
		 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '{@link KitchenLanguage.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenLanguage.impl.TableImpl
		 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '{@link KitchenLanguage.impl.ItemSocketImpl <em>Item Socket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenLanguage.impl.ItemSocketImpl
		 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getItemSocket()
		 * @generated
		 */
		EClass ITEM_SOCKET = eINSTANCE.getItemSocket();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_SOCKET__ID = eINSTANCE.getItemSocket_Id();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_SOCKET__ITEM = eINSTANCE.getItemSocket_Item();

		/**
		 * The meta object literal for the '{@link KitchenLanguage.impl.FridgeImpl <em>Fridge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenLanguage.impl.FridgeImpl
		 * @see KitchenLanguage.impl.KitchenLanguagePackageImpl#getFridge()
		 * @generated
		 */
		EClass FRIDGE = eINSTANCE.getFridge();

	}

} //KitchenLanguagePackage
