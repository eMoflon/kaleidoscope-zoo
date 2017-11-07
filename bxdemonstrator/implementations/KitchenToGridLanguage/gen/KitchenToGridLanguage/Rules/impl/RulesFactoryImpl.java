/**
 */
package KitchenToGridLanguage.Rules.impl;

import KitchenToGridLanguage.Rules.*;

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
public class RulesFactoryImpl extends EFactoryImpl implements RulesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RulesFactory init() {
		try {
			RulesFactory theRulesFactory = (RulesFactory) EPackage.Registry.INSTANCE.getEFactory(RulesPackage.eNS_URI);
			if (theRulesFactory != null) {
				return theRulesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RulesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactoryImpl() {
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
		case RulesPackage.CREATE_ASINK:
			return createcreate_a_sink();
		case RulesPackage.CREATE_AHORIZONTAL_TABLE:
			return createcreate_a_horizontal_table();
		case RulesPackage.CREATE_AFRIDGE:
			return createcreate_a_fridge();
		case RulesPackage.KITCHEN_TO_GRID_RULE:
			return createKitchenToGridRule();
		case RulesPackage.CREATE_AVERTICAL_TABLE:
			return createcreate_a_vertical_table();
		case RulesPackage.CREATE_VERTICAL_ITEM:
			return createCreateVerticalItem();
		case RulesPackage.SOCKET_TO_GROUP:
			return createSocketToGroup();
		case RulesPackage.CREATE_HORIZONTAL_ITEM:
			return createCreateHorizontalItem();
		case RulesPackage.CREATE_ITEM_WITH_TWO_BLOCKS:
			return createCreateItemWithTwoBlocks();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public create_a_sink createcreate_a_sink() {
		create_a_sinkImpl create_a_sink = new create_a_sinkImpl();
		return create_a_sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public create_a_horizontal_table createcreate_a_horizontal_table() {
		create_a_horizontal_tableImpl create_a_horizontal_table = new create_a_horizontal_tableImpl();
		return create_a_horizontal_table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public create_a_fridge createcreate_a_fridge() {
		create_a_fridgeImpl create_a_fridge = new create_a_fridgeImpl();
		return create_a_fridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenToGridRule createKitchenToGridRule() {
		KitchenToGridRuleImpl kitchenToGridRule = new KitchenToGridRuleImpl();
		return kitchenToGridRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public create_a_vertical_table createcreate_a_vertical_table() {
		create_a_vertical_tableImpl create_a_vertical_table = new create_a_vertical_tableImpl();
		return create_a_vertical_table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateVerticalItem createCreateVerticalItem() {
		CreateVerticalItemImpl createVerticalItem = new CreateVerticalItemImpl();
		return createVerticalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocketToGroup createSocketToGroup() {
		SocketToGroupImpl socketToGroup = new SocketToGroupImpl();
		return socketToGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateHorizontalItem createCreateHorizontalItem() {
		CreateHorizontalItemImpl createHorizontalItem = new CreateHorizontalItemImpl();
		return createHorizontalItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateItemWithTwoBlocks createCreateItemWithTwoBlocks() {
		CreateItemWithTwoBlocksImpl createItemWithTwoBlocks = new CreateItemWithTwoBlocksImpl();
		return createItemWithTwoBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesPackage getRulesPackage() {
		return (RulesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RulesPackage getPackage() {
		return RulesPackage.eINSTANCE;
	}

} //RulesFactoryImpl
