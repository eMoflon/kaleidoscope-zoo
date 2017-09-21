/**
 */
package KitchenToGridLanguage.Rules.impl;

import GridLanguage.GridLanguagePackage;

import KitchenLanguage.KitchenLanguagePackage;

import KitchenToGridLanguage.KitchenToGridLanguagePackage;

import KitchenToGridLanguage.Rules.RulesFactory;
import KitchenToGridLanguage.Rules.RulesPackage;

import KitchenToGridLanguage.impl.KitchenToGridLanguagePackageImpl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RulesPackageImpl extends EPackageImpl implements RulesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass create_a_horizontal_tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createHorizontalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socketToGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass create_a_vertical_tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass create_a_sinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createItemWithTwoBlocksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createVerticalItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitchenToGridRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass create_a_fridgeEClass = null;

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
	 * @see KitchenToGridLanguage.Rules.RulesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RulesPackageImpl() {
		super(eNS_URI, RulesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RulesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static RulesPackage init() {
		if (isInited)
			return (RulesPackage) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI);

		// Obtain or create and register package
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof RulesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new RulesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		GridLanguagePackage.eINSTANCE.eClass();
		KitchenLanguagePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		KitchenToGridLanguagePackageImpl theKitchenToGridLanguagePackage = (KitchenToGridLanguagePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(KitchenToGridLanguagePackage.eNS_URI) instanceof KitchenToGridLanguagePackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(KitchenToGridLanguagePackage.eNS_URI)
						: KitchenToGridLanguagePackage.eINSTANCE);

		// Load packages
		theKitchenToGridLanguagePackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theKitchenToGridLanguagePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theRulesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RulesPackage.eNS_URI, theRulesPackage);
		return theRulesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcreate_a_horizontal_table() {
		if (create_a_horizontal_tableEClass == null) {
			create_a_horizontal_tableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return create_a_horizontal_tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_horizontal_table().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__Perform_FWD__IsApplicableMatch() {
		return getcreate_a_horizontal_table().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_FWD__Match() {
		return getcreate_a_horizontal_table().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_horizontal_table().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_horizontal_table().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_checkCsp_FWD__CSP() {
		return getcreate_a_horizontal_table().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_horizontal_table().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_checkCsp_FWD__CSP() {
		return getcreate_a_horizontal_table().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_horizontal_table().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__CheckTypes_FWD__Match() {
		return getcreate_a_horizontal_table().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_BWD__Match_Table_ItemSocket() {
		return getcreate_a_horizontal_table().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__Perform_BWD__IsApplicableMatch() {
		return getcreate_a_horizontal_table().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_BWD__Match() {
		return getcreate_a_horizontal_table().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__RegisterObjectsToMatch_BWD__Match_Table_ItemSocket() {
		return getcreate_a_horizontal_table().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_solveCsp_BWD__Match_Table_ItemSocket() {
		return getcreate_a_horizontal_table().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_checkCsp_BWD__CSP() {
		return getcreate_a_horizontal_table().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Table_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_horizontal_table().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_checkCsp_BWD__CSP() {
		return getcreate_a_horizontal_table().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_horizontal_table().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__CheckTypes_BWD__Match() {
		return getcreate_a_horizontal_table().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_FWD_EMoflonEdge_0__EMoflonEdge() {
		return getcreate_a_horizontal_table().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsAppropriate_BWD_EMoflonEdge_0__EMoflonEdge() {
		return getcreate_a_horizontal_table().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__CheckAttributes_FWD__TripleMatch() {
		return getcreate_a_horizontal_table().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__CheckAttributes_BWD__TripleMatch() {
		return getcreate_a_horizontal_table().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_CC__Match_Match() {
		return getcreate_a_horizontal_table().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_solveCsp_CC__Table_Block_Grid_ItemSocket_Block_Group_Match_Match() {
		return getcreate_a_horizontal_table().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__IsApplicable_checkCsp_CC__CSP() {
		return getcreate_a_horizontal_table().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__CheckDEC_FWD__Block_Grid_Block_Group() {
		return getcreate_a_horizontal_table().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_horizontal_table__CheckDEC_BWD__Table_ItemSocket() {
		return getcreate_a_horizontal_table().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateHorizontalItem() {
		if (createHorizontalItemEClass == null) {
			createHorizontalItemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return createHorizontalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocketToGroup() {
		if (socketToGroupEClass == null) {
			socketToGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return socketToGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_FWD__Match_Grid_Group() {
		return getSocketToGroup().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__Perform_FWD__IsApplicableMatch() {
		return getSocketToGroup().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_FWD__Match() {
		return getSocketToGroup().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__RegisterObjectsToMatch_FWD__Match_Grid_Group() {
		return getSocketToGroup().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_solveCsp_FWD__Match_Grid_Group() {
		return getSocketToGroup().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_checkCsp_FWD__CSP() {
		return getSocketToGroup().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_solveCsp_FWD__IsApplicableMatch_Grid_Kitchen_KitchenToGridCorr_Group() {
		return getSocketToGroup().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_checkCsp_FWD__CSP() {
		return getSocketToGroup().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSocketToGroup().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__CheckTypes_FWD__Match() {
		return getSocketToGroup().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_BWD__Match_Kitchen_ItemSocket() {
		return getSocketToGroup().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__Perform_BWD__IsApplicableMatch() {
		return getSocketToGroup().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_BWD__Match() {
		return getSocketToGroup().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__RegisterObjectsToMatch_BWD__Match_Kitchen_ItemSocket() {
		return getSocketToGroup().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_solveCsp_BWD__Match_Kitchen_ItemSocket() {
		return getSocketToGroup().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_checkCsp_BWD__CSP() {
		return getSocketToGroup().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_solveCsp_BWD__IsApplicableMatch_Grid_Kitchen_KitchenToGridCorr_ItemSocket() {
		return getSocketToGroup().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_checkCsp_BWD__CSP() {
		return getSocketToGroup().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSocketToGroup().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__CheckTypes_BWD__Match() {
		return getSocketToGroup().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_FWD_EMoflonEdge_1__EMoflonEdge() {
		return getSocketToGroup().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsAppropriate_BWD_EMoflonEdge_1__EMoflonEdge() {
		return getSocketToGroup().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__CheckAttributes_FWD__TripleMatch() {
		return getSocketToGroup().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__CheckAttributes_BWD__TripleMatch() {
		return getSocketToGroup().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_CC__Match_Match() {
		return getSocketToGroup().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_solveCsp_CC__Grid_Kitchen_ItemSocket_Group_Match_Match() {
		return getSocketToGroup().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__IsApplicable_checkCsp_CC__CSP() {
		return getSocketToGroup().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__CheckDEC_FWD__Grid_Group() {
		return getSocketToGroup().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSocketToGroup__CheckDEC_BWD__Kitchen_ItemSocket() {
		return getSocketToGroup().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcreate_a_vertical_table() {
		if (create_a_vertical_tableEClass == null) {
			create_a_vertical_tableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return create_a_vertical_tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_vertical_table().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__Perform_FWD__IsApplicableMatch() {
		return getcreate_a_vertical_table().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_FWD__Match() {
		return getcreate_a_vertical_table().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_vertical_table().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_vertical_table().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_checkCsp_FWD__CSP() {
		return getcreate_a_vertical_table().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_vertical_table().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_checkCsp_FWD__CSP() {
		return getcreate_a_vertical_table().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_vertical_table().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__CheckTypes_FWD__Match() {
		return getcreate_a_vertical_table().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_BWD__Match_Table_ItemSocket() {
		return getcreate_a_vertical_table().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__Perform_BWD__IsApplicableMatch() {
		return getcreate_a_vertical_table().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_BWD__Match() {
		return getcreate_a_vertical_table().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__RegisterObjectsToMatch_BWD__Match_Table_ItemSocket() {
		return getcreate_a_vertical_table().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_solveCsp_BWD__Match_Table_ItemSocket() {
		return getcreate_a_vertical_table().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_checkCsp_BWD__CSP() {
		return getcreate_a_vertical_table().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Table_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_vertical_table().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_checkCsp_BWD__CSP() {
		return getcreate_a_vertical_table().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_vertical_table().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__CheckTypes_BWD__Match() {
		return getcreate_a_vertical_table().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_FWD_EMoflonEdge_2__EMoflonEdge() {
		return getcreate_a_vertical_table().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsAppropriate_BWD_EMoflonEdge_2__EMoflonEdge() {
		return getcreate_a_vertical_table().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__CheckAttributes_FWD__TripleMatch() {
		return getcreate_a_vertical_table().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__CheckAttributes_BWD__TripleMatch() {
		return getcreate_a_vertical_table().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_CC__Match_Match() {
		return getcreate_a_vertical_table().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_solveCsp_CC__Table_Block_Grid_ItemSocket_Block_Group_Match_Match() {
		return getcreate_a_vertical_table().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__IsApplicable_checkCsp_CC__CSP() {
		return getcreate_a_vertical_table().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__CheckDEC_FWD__Block_Grid_Block_Group() {
		return getcreate_a_vertical_table().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_vertical_table__CheckDEC_BWD__Table_ItemSocket() {
		return getcreate_a_vertical_table().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcreate_a_sink() {
		if (create_a_sinkEClass == null) {
			create_a_sinkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(4);
		}
		return create_a_sinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_sink().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__Perform_FWD__IsApplicableMatch() {
		return getcreate_a_sink().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_FWD__Match() {
		return getcreate_a_sink().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_sink().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_sink().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_checkCsp_FWD__CSP() {
		return getcreate_a_sink().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_sink().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_checkCsp_FWD__CSP() {
		return getcreate_a_sink().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_sink().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__CheckTypes_FWD__Match() {
		return getcreate_a_sink().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_BWD__Match_Sink_ItemSocket() {
		return getcreate_a_sink().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__Perform_BWD__IsApplicableMatch() {
		return getcreate_a_sink().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_BWD__Match() {
		return getcreate_a_sink().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__RegisterObjectsToMatch_BWD__Match_Sink_ItemSocket() {
		return getcreate_a_sink().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_solveCsp_BWD__Match_Sink_ItemSocket() {
		return getcreate_a_sink().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_checkCsp_BWD__CSP() {
		return getcreate_a_sink().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Sink_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_sink().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_checkCsp_BWD__CSP() {
		return getcreate_a_sink().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_sink().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__CheckTypes_BWD__Match() {
		return getcreate_a_sink().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_FWD_EMoflonEdge_3__EMoflonEdge() {
		return getcreate_a_sink().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsAppropriate_BWD_EMoflonEdge_3__EMoflonEdge() {
		return getcreate_a_sink().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__CheckAttributes_FWD__TripleMatch() {
		return getcreate_a_sink().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__CheckAttributes_BWD__TripleMatch() {
		return getcreate_a_sink().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_CC__Match_Match() {
		return getcreate_a_sink().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_solveCsp_CC__Sink_Block_Grid_ItemSocket_Block_Group_Match_Match() {
		return getcreate_a_sink().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__IsApplicable_checkCsp_CC__CSP() {
		return getcreate_a_sink().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__CheckDEC_FWD__Block_Grid_Block_Group() {
		return getcreate_a_sink().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_sink__CheckDEC_BWD__Sink_ItemSocket() {
		return getcreate_a_sink().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateItemWithTwoBlocks() {
		if (createItemWithTwoBlocksEClass == null) {
			createItemWithTwoBlocksEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return createItemWithTwoBlocksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateVerticalItem() {
		if (createVerticalItemEClass == null) {
			createVerticalItemEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return createVerticalItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKitchenToGridRule() {
		if (kitchenToGridRuleEClass == null) {
			kitchenToGridRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return kitchenToGridRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_FWD__Match_Grid() {
		return getKitchenToGridRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__Perform_FWD__IsApplicableMatch() {
		return getKitchenToGridRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_FWD__Match() {
		return getKitchenToGridRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__RegisterObjectsToMatch_FWD__Match_Grid() {
		return getKitchenToGridRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_solveCsp_FWD__Match_Grid() {
		return getKitchenToGridRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getKitchenToGridRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_solveCsp_FWD__IsApplicableMatch_Grid() {
		return getKitchenToGridRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_checkCsp_FWD__CSP() {
		return getKitchenToGridRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject() {
		return getKitchenToGridRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__CheckTypes_FWD__Match() {
		return getKitchenToGridRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_BWD__Match_Kitchen() {
		return getKitchenToGridRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__Perform_BWD__IsApplicableMatch() {
		return getKitchenToGridRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_BWD__Match() {
		return getKitchenToGridRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__RegisterObjectsToMatch_BWD__Match_Kitchen() {
		return getKitchenToGridRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_solveCsp_BWD__Match_Kitchen() {
		return getKitchenToGridRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getKitchenToGridRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_Kitchen() {
		return getKitchenToGridRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_checkCsp_BWD__CSP() {
		return getKitchenToGridRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject() {
		return getKitchenToGridRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__CheckTypes_BWD__Match() {
		return getKitchenToGridRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_FWD_Grid_0__Grid() {
		return getKitchenToGridRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsAppropriate_BWD_Kitchen_0__Kitchen() {
		return getKitchenToGridRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__CheckAttributes_FWD__TripleMatch() {
		return getKitchenToGridRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__CheckAttributes_BWD__TripleMatch() {
		return getKitchenToGridRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_CC__Match_Match() {
		return getKitchenToGridRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_solveCsp_CC__Grid_Kitchen_Match_Match() {
		return getKitchenToGridRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__IsApplicable_checkCsp_CC__CSP() {
		return getKitchenToGridRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__CheckDEC_FWD__Grid() {
		return getKitchenToGridRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKitchenToGridRule__CheckDEC_BWD__Kitchen() {
		return getKitchenToGridRule().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcreate_a_fridge() {
		if (create_a_fridgeEClass == null) {
			create_a_fridgeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return create_a_fridgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_fridge().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__Perform_FWD__IsApplicableMatch() {
		return getcreate_a_fridge().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_FWD__Match() {
		return getcreate_a_fridge().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__RegisterObjectsToMatch_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_fridge().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_solveCsp_FWD__Match_Block_Grid_Block_Group() {
		return getcreate_a_fridge().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_checkCsp_FWD__CSP() {
		return getcreate_a_fridge().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_solveCsp_FWD__IsApplicableMatch_SocketToGroupCorr_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_fridge().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_checkCsp_FWD__CSP() {
		return getcreate_a_fridge().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_fridge().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__CheckTypes_FWD__Match() {
		return getcreate_a_fridge().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_BWD__Match_Fridge_ItemSocket() {
		return getcreate_a_fridge().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__Perform_BWD__IsApplicableMatch() {
		return getcreate_a_fridge().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_BWD__Match() {
		return getcreate_a_fridge().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__RegisterObjectsToMatch_BWD__Match_Fridge_ItemSocket() {
		return getcreate_a_fridge().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_solveCsp_BWD__Match_Fridge_ItemSocket() {
		return getcreate_a_fridge().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_checkCsp_BWD__CSP() {
		return getcreate_a_fridge().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_solveCsp_BWD__IsApplicableMatch_SocketToGroupCorr_Fridge_Block_Grid_ItemSocket_Block_Group() {
		return getcreate_a_fridge().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_checkCsp_BWD__CSP() {
		return getcreate_a_fridge().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getcreate_a_fridge().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__CheckTypes_BWD__Match() {
		return getcreate_a_fridge().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_FWD_EMoflonEdge_4__EMoflonEdge() {
		return getcreate_a_fridge().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsAppropriate_BWD_EMoflonEdge_4__EMoflonEdge() {
		return getcreate_a_fridge().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__CheckAttributes_FWD__TripleMatch() {
		return getcreate_a_fridge().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__CheckAttributes_BWD__TripleMatch() {
		return getcreate_a_fridge().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_CC__Match_Match() {
		return getcreate_a_fridge().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_solveCsp_CC__Fridge_Block_Grid_ItemSocket_Block_Group_Match_Match() {
		return getcreate_a_fridge().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__IsApplicable_checkCsp_CC__CSP() {
		return getcreate_a_fridge().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__CheckDEC_FWD__Block_Grid_Block_Group() {
		return getcreate_a_fridge().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getcreate_a_fridge__CheckDEC_BWD__Fridge_ItemSocket() {
		return getcreate_a_fridge().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesFactory getRulesFactory() {
		return (RulesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("KitchenToGridLanguage.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
