/**
 */
package KitchenToGridLanguage.Rules;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see KitchenToGridLanguage.Rules.RulesFactory
 * @model kind="package"
 * @generated
 */
public interface RulesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Rules";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/KitchenToGridLanguage/model/KitchenToGridLanguage.ecore#//Rules";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Rules";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesPackage eINSTANCE = KitchenToGridLanguage.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.CreateVerticalItemImpl <em>Create Vertical Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.CreateVerticalItemImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getCreateVerticalItem()
	 * @generated
	 */
	int CREATE_VERTICAL_ITEM = 0;

	/**
	 * The number of structural features of the '<em>Create Vertical Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VERTICAL_ITEM_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Vertical Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_VERTICAL_ITEM_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.CreateHorizontalItemImpl <em>Create Horizontal Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.CreateHorizontalItemImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getCreateHorizontalItem()
	 * @generated
	 */
	int CREATE_HORIZONTAL_ITEM = 1;

	/**
	 * The number of structural features of the '<em>Create Horizontal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HORIZONTAL_ITEM_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Horizontal Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_HORIZONTAL_ITEM_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.create_a_vertical_tableImpl <em>create avertical table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.create_a_vertical_tableImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getcreate_a_vertical_table()
	 * @generated
	 */
	int CREATE_AVERTICAL_TABLE = 2;

	/**
	 * The number of structural features of the '<em>create avertical table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_BWD__MATCH_TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_TABLE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_0__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_0__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___CHECK_DEC_FWD__BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE___CHECK_DEC_BWD__TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>create avertical table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AVERTICAL_TABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.SocketToGroupImpl <em>Socket To Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.SocketToGroupImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getSocketToGroup()
	 * @generated
	 */
	int SOCKET_TO_GROUP = 3;

	/**
	 * The number of structural features of the '<em>Socket To Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_FWD__MATCH_GRID_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GRID_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GRID_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_KITCHEN_GRID_GROUP_KITCHENTOGRIDCORR = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_BWD__MATCH_KITCHEN_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_KITCHEN_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_KITCHEN_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_KITCHEN_GRID_KITCHENTOGRIDCORR_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_FWD_EMOFLON_EDGE_1__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPROPRIATE_BWD_EMOFLON_EDGE_1__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_SOLVE_CSP_CC__KITCHEN_GRID_GROUP_ITEMSOCKET_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___CHECK_DEC_FWD__GRID_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP___CHECK_DEC_BWD__KITCHEN_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Socket To Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.create_a_sinkImpl <em>create asink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.create_a_sinkImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getcreate_a_sink()
	 * @generated
	 */
	int CREATE_ASINK = 4;

	/**
	 * The number of structural features of the '<em>create asink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_BWD__MATCH_SINK_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_SINK_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_SINK_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_SINK_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_2__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_SOLVE_CSP_CC__SINK_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___CHECK_DEC_FWD__BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK___CHECK_DEC_BWD__SINK_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>create asink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ASINK_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.create_a_fridgeImpl <em>create afridge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.create_a_fridgeImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getcreate_a_fridge()
	 * @generated
	 */
	int CREATE_AFRIDGE = 5;

	/**
	 * The number of structural features of the '<em>create afridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_BWD__MATCH_FRIDGE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_FRIDGE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_FRIDGE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_FRIDGE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_SOLVE_CSP_CC__FRIDGE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___CHECK_DEC_FWD__BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE___CHECK_DEC_BWD__FRIDGE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>create afridge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AFRIDGE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.create_a_horizontal_tableImpl <em>create ahorizontal table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.create_a_horizontal_tableImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getcreate_a_horizontal_table()
	 * @generated
	 */
	int CREATE_AHORIZONTAL_TABLE = 6;

	/**
	 * The number of structural features of the '<em>create ahorizontal table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_BWD__MATCH_TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_TABLE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___CHECK_DEC_FWD__BLOCK_GRID_BLOCK_GROUP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE___CHECK_DEC_BWD__TABLE_ITEMSOCKET = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>create ahorizontal table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_AHORIZONTAL_TABLE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.KitchenToGridRuleImpl <em>Kitchen To Grid Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.KitchenToGridRuleImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getKitchenToGridRule()
	 * @generated
	 */
	int KITCHEN_TO_GRID_RULE = 7;

	/**
	 * The number of structural features of the '<em>Kitchen To Grid Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_FWD__MATCH_GRID = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GRID = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GRID = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GRID = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_BWD__MATCH_KITCHEN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_KITCHEN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_KITCHEN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_KITCHEN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD Grid 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_FWD_GRID_0__GRID = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Kitchen 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_BWD_KITCHEN_0__KITCHEN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_SOLVE_CSP_CC__KITCHEN_GRID_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___CHECK_DEC_FWD__GRID = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE___CHECK_DEC_BWD__KITCHEN = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The number of operations of the '<em>Kitchen To Grid Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.Rules.impl.CreateItemWithTwoBlocksImpl <em>Create Item With Two Blocks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.Rules.impl.CreateItemWithTwoBlocksImpl
	 * @see KitchenToGridLanguage.Rules.impl.RulesPackageImpl#getCreateItemWithTwoBlocks()
	 * @generated
	 */
	int CREATE_ITEM_WITH_TWO_BLOCKS = 8;

	/**
	 * The number of structural features of the '<em>Create Item With Two Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ITEM_WITH_TWO_BLOCKS_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create Item With Two Blocks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_ITEM_WITH_TWO_BLOCKS_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.CreateVerticalItem <em>Create Vertical Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Vertical Item</em>'.
	 * @see KitchenToGridLanguage.Rules.CreateVerticalItem
	 * @generated
	 */
	EClass getCreateVerticalItem();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.CreateHorizontalItem <em>Create Horizontal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Horizontal Item</em>'.
	 * @see KitchenToGridLanguage.Rules.CreateHorizontalItem
	 * @generated
	 */
	EClass getCreateHorizontalItem();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.create_a_vertical_table <em>create avertical table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>create avertical table</em>'.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table
	 * @generated
	 */
	EClass getcreate_a_vertical_table();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_BWD__Match_Table_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__RegisterObjectsToMatch_BWD__Match_Table_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_solveCsp_BWD__Match_Table_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Table_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 0</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_FWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_BWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 0</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isAppropriate_BWD_EMoflonEdge_0(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_solveCsp_CC(KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_solveCsp_CC(KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_solveCsp_CC__Table_Block_Grid_ItemSocket_Block_Group_Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__CheckDEC_FWD__Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_vertical_table#checkDEC_BWD(KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table#checkDEC_BWD(KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_vertical_table__CheckDEC_BWD__Table_ItemSocket();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.SocketToGroup <em>Socket To Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socket To Group</em>'.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup
	 * @generated
	 */
	EClass getSocketToGroup();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid, GridLanguage.Group) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid, GridLanguage.Group)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_FWD__Match_Grid_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSocketToGroup__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid, GridLanguage.Group) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid, GridLanguage.Group)
	 * @generated
	 */
	EOperation getSocketToGroup__RegisterObjectsToMatch_FWD__Match_Grid_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid, GridLanguage.Group) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid, GridLanguage.Group)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_solveCsp_FWD__Match_Grid_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenLanguage.Kitchen, GridLanguage.Grid, GridLanguage.Group, KitchenToGridLanguage.KitchenToGridCorr) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenLanguage.Kitchen, GridLanguage.Grid, GridLanguage.Group, KitchenToGridLanguage.KitchenToGridCorr)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_solveCsp_FWD__IsApplicableMatch_Kitchen_Grid_Group_KitchenToGridCorr();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSocketToGroup__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSocketToGroup__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_BWD__Match_Kitchen_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSocketToGroup__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getSocketToGroup__RegisterObjectsToMatch_BWD__Match_Kitchen_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_solveCsp_BWD__Match_Kitchen_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenLanguage.Kitchen, GridLanguage.Grid, KitchenToGridLanguage.KitchenToGridCorr, KitchenLanguage.ItemSocket) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenLanguage.Kitchen, GridLanguage.Grid, KitchenToGridLanguage.KitchenToGridCorr, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_solveCsp_BWD__IsApplicableMatch_Kitchen_Grid_KitchenToGridCorr_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSocketToGroup__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSocketToGroup__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_FWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 1</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_FWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_BWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 1</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isAppropriate_BWD_EMoflonEdge_1(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSocketToGroup__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSocketToGroup__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSocketToGroup__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_solveCsp_CC(KitchenLanguage.Kitchen, GridLanguage.Grid, GridLanguage.Group, KitchenLanguage.ItemSocket, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_solveCsp_CC(KitchenLanguage.Kitchen, GridLanguage.Grid, GridLanguage.Group, KitchenLanguage.ItemSocket, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_solveCsp_CC__Kitchen_Grid_Group_ItemSocket_Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSocketToGroup__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#checkDEC_FWD(GridLanguage.Grid, GridLanguage.Group) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#checkDEC_FWD(GridLanguage.Grid, GridLanguage.Group)
	 * @generated
	 */
	EOperation getSocketToGroup__CheckDEC_FWD__Grid_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.SocketToGroup#checkDEC_BWD(KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup#checkDEC_BWD(KitchenLanguage.Kitchen, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getSocketToGroup__CheckDEC_BWD__Kitchen_ItemSocket();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.create_a_sink <em>create asink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>create asink</em>'.
	 * @see KitchenToGridLanguage.Rules.create_a_sink
	 * @generated
	 */
	EClass getcreate_a_sink();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_sink__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_sink__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_sink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_sink__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Sink, KitchenLanguage.ItemSocket) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Sink, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_BWD__Match_Sink_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_sink__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Sink, KitchenLanguage.ItemSocket) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Sink, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_sink__RegisterObjectsToMatch_BWD__Match_Sink_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Sink, KitchenLanguage.ItemSocket) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Sink, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_solveCsp_BWD__Match_Sink_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Sink, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Sink, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Sink_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_sink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_sink__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_FWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 2</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_FWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_BWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 2</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isAppropriate_BWD_EMoflonEdge_2(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_sink__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_sink__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_solveCsp_CC(KitchenLanguage.Sink, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_solveCsp_CC(KitchenLanguage.Sink, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_solveCsp_CC__Sink_Block_Grid_ItemSocket_Block_Group_Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_sink__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_sink__CheckDEC_FWD__Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_sink#checkDEC_BWD(KitchenLanguage.Sink, KitchenLanguage.ItemSocket) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_sink#checkDEC_BWD(KitchenLanguage.Sink, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_sink__CheckDEC_BWD__Sink_ItemSocket();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.create_a_fridge <em>create afridge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>create afridge</em>'.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge
	 * @generated
	 */
	EClass getcreate_a_fridge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_fridge__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_fridge__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_fridge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_fridge__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Fridge, KitchenLanguage.ItemSocket) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Fridge, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_BWD__Match_Fridge_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_fridge__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Fridge, KitchenLanguage.ItemSocket) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Fridge, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_fridge__RegisterObjectsToMatch_BWD__Match_Fridge_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Fridge, KitchenLanguage.ItemSocket) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Fridge, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_solveCsp_BWD__Match_Fridge_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Fridge, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Fridge, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Fridge_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_fridge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_fridge__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_FWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 3</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_FWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_BWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 3</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 3</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isAppropriate_BWD_EMoflonEdge_3(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_fridge__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_fridge__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_solveCsp_CC(KitchenLanguage.Fridge, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_solveCsp_CC(KitchenLanguage.Fridge, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_solveCsp_CC__Fridge_Block_Grid_ItemSocket_Block_Group_Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_fridge__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_fridge__CheckDEC_FWD__Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_fridge#checkDEC_BWD(KitchenLanguage.Fridge, KitchenLanguage.ItemSocket) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge#checkDEC_BWD(KitchenLanguage.Fridge, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_fridge__CheckDEC_BWD__Fridge_ItemSocket();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table <em>create ahorizontal table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>create ahorizontal table</em>'.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table
	 * @generated
	 */
	EClass getcreate_a_horizontal_table();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_BWD__Match_Table_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__RegisterObjectsToMatch_BWD__Match_Table_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_solveCsp_BWD__Match_Table_ItemSocket();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenToGridLanguage.SocketToGroupCorr, KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Table_Block_Grid_ItemSocket_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_FWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 4</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_FWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_BWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 4</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 4</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isAppropriate_BWD_EMoflonEdge_4(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_solveCsp_CC(KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_solveCsp_CC(KitchenLanguage.Table, GridLanguage.Block, GridLanguage.Grid, KitchenLanguage.ItemSocket, GridLanguage.Block, GridLanguage.Group, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_solveCsp_CC__Table_Block_Grid_ItemSocket_Block_Group_Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#checkDEC_FWD(GridLanguage.Block, GridLanguage.Grid, GridLanguage.Block, GridLanguage.Group)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__CheckDEC_FWD__Block_Grid_Block_Group();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table#checkDEC_BWD(KitchenLanguage.Table, KitchenLanguage.ItemSocket) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table#checkDEC_BWD(KitchenLanguage.Table, KitchenLanguage.ItemSocket)
	 * @generated
	 */
	EOperation getcreate_a_horizontal_table__CheckDEC_BWD__Table_ItemSocket();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.KitchenToGridRule <em>Kitchen To Grid Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen To Grid Rule</em>'.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule
	 * @generated
	 */
	EClass getKitchenToGridRule();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_FWD__Match_Grid();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getKitchenToGridRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid)
	 * @generated
	 */
	EOperation getKitchenToGridRule__RegisterObjectsToMatch_FWD__Match_Grid();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, GridLanguage.Grid)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_solveCsp_FWD__Match_Grid();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, GridLanguage.Grid) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, GridLanguage.Grid)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Grid();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getKitchenToGridRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKitchenToGridRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_BWD__Match_Kitchen();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getKitchenToGridRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen)
	 * @generated
	 */
	EOperation getKitchenToGridRule__RegisterObjectsToMatch_BWD__Match_Kitchen();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, KitchenLanguage.Kitchen)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_solveCsp_BWD__Match_Kitchen();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenLanguage.Kitchen) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, KitchenLanguage.Kitchen)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Kitchen();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getKitchenToGridRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKitchenToGridRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_FWD_Grid_0(GridLanguage.Grid) <em>Is Appropriate FWD Grid 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD Grid 0</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_FWD_Grid_0(GridLanguage.Grid)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_FWD_Grid_0__Grid();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_BWD_Kitchen_0(KitchenLanguage.Kitchen) <em>Is Appropriate BWD Kitchen 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Kitchen 0</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isAppropriate_BWD_Kitchen_0(KitchenLanguage.Kitchen)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsAppropriate_BWD_Kitchen_0__Kitchen();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getKitchenToGridRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getKitchenToGridRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_solveCsp_CC(KitchenLanguage.Kitchen, GridLanguage.Grid, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_solveCsp_CC(KitchenLanguage.Kitchen, GridLanguage.Grid, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_solveCsp_CC__Kitchen_Grid_Match_Match();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKitchenToGridRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#checkDEC_FWD(GridLanguage.Grid) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#checkDEC_FWD(GridLanguage.Grid)
	 * @generated
	 */
	EOperation getKitchenToGridRule__CheckDEC_FWD__Grid();

	/**
	 * Returns the meta object for the '{@link KitchenToGridLanguage.Rules.KitchenToGridRule#checkDEC_BWD(KitchenLanguage.Kitchen) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule#checkDEC_BWD(KitchenLanguage.Kitchen)
	 * @generated
	 */
	EOperation getKitchenToGridRule__CheckDEC_BWD__Kitchen();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.Rules.CreateItemWithTwoBlocks <em>Create Item With Two Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Item With Two Blocks</em>'.
	 * @see KitchenToGridLanguage.Rules.CreateItemWithTwoBlocks
	 * @generated
	 */
	EClass getCreateItemWithTwoBlocks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
