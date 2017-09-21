/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoAPIConfig.CryptoAPIConfigPackage;

import CryptoConfigToJava.CryptoConfigToJavaPackage;

import CryptoConfigToJava.Rules.RulesFactory;
import CryptoConfigToJava.Rules.RulesPackage;

import CryptoConfigToJava.impl.CryptoConfigToJavaPackageImpl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import SimpleJava.SimpleJavaPackage;

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
	private EClass symmetricEncryptionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performGetKeyMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyDerivationAlgorithmImportToImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securePasswordTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricBlockCipherImportToImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreParameterRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreMethodInvocationArgumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ignoreOpaqueMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordBasedEncryptionEClass = null;

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
	 * @see CryptoConfigToJava.Rules.RulesPackage#eNS_URI
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
		CryptoAPIConfigPackage.eINSTANCE.eClass();
		SimpleJavaPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CryptoConfigToJavaPackageImpl theCryptoConfigToJavaPackage = (CryptoConfigToJavaPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(CryptoConfigToJavaPackage.eNS_URI) instanceof CryptoConfigToJavaPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(CryptoConfigToJavaPackage.eNS_URI)
						: CryptoConfigToJavaPackage.eINSTANCE);

		// Load packages
		theCryptoConfigToJavaPackage.loadPackage();

		// Fix loaded packages
		theRulesPackage.fixPackageContents();
		theCryptoConfigToJavaPackage.fixPackageContents();

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
	public EClass getSymmetricEncryptionTask() {
		if (symmetricEncryptionTaskEClass == null) {
			symmetricEncryptionTaskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return symmetricEncryptionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_FWD__Match_Task_SymmetricBlockCipher() {
		return getSymmetricEncryptionTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__Perform_FWD__IsApplicableMatch() {
		return getSymmetricEncryptionTask().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_FWD__Match() {
		return getSymmetricEncryptionTask().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__RegisterObjectsToMatch_FWD__Match_Task_SymmetricBlockCipher() {
		return getSymmetricEncryptionTask().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_solveCsp_FWD__Match_Task_SymmetricBlockCipher() {
		return getSymmetricEncryptionTask().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_checkCsp_FWD__CSP() {
		return getSymmetricEncryptionTask().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_solveCsp_FWD__IsApplicableMatch_Task_SymmetricBlockCipher() {
		return getSymmetricEncryptionTask().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_checkCsp_FWD__CSP() {
		return getSymmetricEncryptionTask().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSymmetricEncryptionTask().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__CheckTypes_FWD__Match() {
		return getSymmetricEncryptionTask().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_BWD__Match_JavaVariableDeclaration_JavaWorkflowMethod_JavaName_JavaName_JavaStatement_JavaOpaqueMethod_JavaMethodInvocation_JavaVariableDeclaration_JavaPackage_JavaLiteral_JavaCompilationUnit() {
		return getSymmetricEncryptionTask().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__Perform_BWD__IsApplicableMatch() {
		return getSymmetricEncryptionTask().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_BWD__Match() {
		return getSymmetricEncryptionTask().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__RegisterObjectsToMatch_BWD__Match_JavaVariableDeclaration_JavaWorkflowMethod_JavaName_JavaName_JavaStatement_JavaOpaqueMethod_JavaMethodInvocation_JavaVariableDeclaration_JavaPackage_JavaLiteral_JavaCompilationUnit() {
		return getSymmetricEncryptionTask().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_solveCsp_BWD__Match_JavaVariableDeclaration_JavaWorkflowMethod_JavaName_JavaName_JavaStatement_JavaOpaqueMethod_JavaMethodInvocation_JavaVariableDeclaration_JavaPackage_JavaLiteral_JavaCompilationUnit() {
		return getSymmetricEncryptionTask().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_checkCsp_BWD__CSP() {
		return getSymmetricEncryptionTask().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaVariableDeclaration_JavaWorkflowMethod_JavaName_JavaName_JavaStatement_JavaOpaqueMethod_JavaMethodInvocation_JavaVariableDeclaration_JavaPackage_JavaLiteral_JavaCompilationUnit() {
		return getSymmetricEncryptionTask().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_checkCsp_BWD__CSP() {
		return getSymmetricEncryptionTask().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSymmetricEncryptionTask().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__CheckTypes_BWD__Match() {
		return getSymmetricEncryptionTask().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge() {
		return getSymmetricEncryptionTask().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge() {
		return getSymmetricEncryptionTask().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__CheckAttributes_FWD__TripleMatch() {
		return getSymmetricEncryptionTask().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__CheckAttributes_BWD__TripleMatch() {
		return getSymmetricEncryptionTask().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_CC__Match_Match() {
		return getSymmetricEncryptionTask().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_solveCsp_CC__Task_JavaVariableDeclaration_SymmetricBlockCipher_JavaWorkflowMethod_JavaName_JavaName_JavaStatement_JavaOpaqueMethod_JavaMethodInvocation_JavaVariableDeclaration_JavaPackage_JavaLiteral_JavaCompilationUnit_Match_Match() {
		return getSymmetricEncryptionTask().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__IsApplicable_checkCsp_CC__CSP() {
		return getSymmetricEncryptionTask().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__CheckDEC_FWD__Task_SymmetricBlockCipher() {
		return getSymmetricEncryptionTask().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__CheckDEC_BWD__JavaVariableDeclaration_JavaWorkflowMethod_JavaName_JavaName_JavaStatement_JavaOpaqueMethod_JavaMethodInvocation_JavaVariableDeclaration_JavaPackage_JavaLiteral_JavaCompilationUnit() {
		return getSymmetricEncryptionTask().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__GenerateModel__RuleEntryContainer() {
		return getSymmetricEncryptionTask().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getSymmetricEncryptionTask().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricEncryptionTask__GenerateModel_checkCsp_BWD__CSP() {
		return getSymmetricEncryptionTask().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformGetKeyMethod() {
		if (performGetKeyMethodEClass == null) {
			performGetKeyMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(1);
		}
		return performGetKeyMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsAppropriate_FWD__Match() {
		return getPerformGetKeyMethod().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__Perform_FWD__IsApplicableMatch() {
		return getPerformGetKeyMethod().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsApplicable_FWD__Match() {
		return getPerformGetKeyMethod().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__RegisterObjectsToMatch_FWD__Match() {
		return getPerformGetKeyMethod().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsAppropriate_solveCsp_FWD__Match() {
		return getPerformGetKeyMethod().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsAppropriate_checkCsp_FWD__CSP() {
		return getPerformGetKeyMethod().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__CheckTypes_FWD__Match() {
		return getPerformGetKeyMethod().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsAppropriate_BWD__Match_JavaOpaqueMethod() {
		return getPerformGetKeyMethod().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__Perform_BWD__IsApplicableMatch() {
		return getPerformGetKeyMethod().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsApplicable_BWD__Match() {
		return getPerformGetKeyMethod().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__RegisterObjectsToMatch_BWD__Match_JavaOpaqueMethod() {
		return getPerformGetKeyMethod().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsAppropriate_solveCsp_BWD__Match_JavaOpaqueMethod() {
		return getPerformGetKeyMethod().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsAppropriate_checkCsp_BWD__CSP() {
		return getPerformGetKeyMethod().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaOpaqueMethod() {
		return getPerformGetKeyMethod().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsApplicable_checkCsp_BWD__CSP() {
		return getPerformGetKeyMethod().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__RegisterObjects_BWD__PerformRuleResult_EObject() {
		return getPerformGetKeyMethod().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__CheckTypes_BWD__Match() {
		return getPerformGetKeyMethod().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsAppropriate_BWD_JavaOpaqueMethod_0__JavaOpaqueMethod() {
		return getPerformGetKeyMethod().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__CheckAttributes_FWD__TripleMatch() {
		return getPerformGetKeyMethod().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__CheckAttributes_BWD__TripleMatch() {
		return getPerformGetKeyMethod().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsApplicable_CC__Match_Match() {
		return getPerformGetKeyMethod().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsApplicable_solveCsp_CC__JavaOpaqueMethod_Match_Match() {
		return getPerformGetKeyMethod().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__IsApplicable_checkCsp_CC__CSP() {
		return getPerformGetKeyMethod().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__CheckDEC_FWD() {
		return getPerformGetKeyMethod().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__CheckDEC_BWD__JavaOpaqueMethod() {
		return getPerformGetKeyMethod().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__GenerateModel__RuleEntryContainer() {
		return getPerformGetKeyMethod().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPerformGetKeyMethod().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPerformGetKeyMethod__GenerateModel_checkCsp_BWD__CSP() {
		return getPerformGetKeyMethod().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyDerivationAlgorithmImportToImport() {
		if (keyDerivationAlgorithmImportToImportEClass == null) {
			keyDerivationAlgorithmImportToImportEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(2);
		}
		return keyDerivationAlgorithmImportToImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_FWD__Match_Import_KeyDerivationAlgorithm() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__Perform_FWD__IsApplicableMatch() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_FWD__Match() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjectsToMatch_FWD__Match_Import_KeyDerivationAlgorithm() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_solveCsp_FWD__Match_Import_KeyDerivationAlgorithm() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_checkCsp_FWD__CSP() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_solveCsp_FWD__IsApplicableMatch_Import_JavaCompilationUnit_KeyDerivationAlgorithm_KeyDerivationAlgorithmToJcu() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_checkCsp_FWD__CSP() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__CheckTypes_FWD__Match() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_BWD__Match_JavaImport_JavaCompilationUnit() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__Perform_BWD__IsApplicableMatch() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_BWD__Match() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjectsToMatch_BWD__Match_JavaImport_JavaCompilationUnit() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_solveCsp_BWD__Match_JavaImport_JavaCompilationUnit() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_checkCsp_BWD__CSP() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaImport_JavaCompilationUnit_KeyDerivationAlgorithm_KeyDerivationAlgorithmToJcu() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_checkCsp_BWD__CSP() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__CheckTypes_BWD__Match() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__CheckAttributes_FWD__TripleMatch() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__CheckAttributes_BWD__TripleMatch() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_CC__Match_Match() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_solveCsp_CC__Import_JavaImport_JavaCompilationUnit_KeyDerivationAlgorithm_Match_Match() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_checkCsp_CC__CSP() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__CheckDEC_FWD__Import_KeyDerivationAlgorithm() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__CheckDEC_BWD__JavaImport_JavaCompilationUnit() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__GenerateModel__RuleEntryContainer_KeyDerivationAlgorithmToJcu() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaCompilationUnit_KeyDerivationAlgorithm_KeyDerivationAlgorithmToJcu_ModelgeneratorRuleResult() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getKeyDerivationAlgorithmImportToImport__GenerateModel_checkCsp_BWD__CSP() {
		return getKeyDerivationAlgorithmImportToImport().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurePasswordTask() {
		if (securePasswordTaskEClass == null) {
			securePasswordTaskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(3);
		}
		return securePasswordTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_FWD__Match_KeyDerivationAlgorithm_Task() {
		return getSecurePasswordTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__Perform_FWD__IsApplicableMatch() {
		return getSecurePasswordTask().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_FWD__Match() {
		return getSecurePasswordTask().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__RegisterObjectsToMatch_FWD__Match_KeyDerivationAlgorithm_Task() {
		return getSecurePasswordTask().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_solveCsp_FWD__Match_KeyDerivationAlgorithm_Task() {
		return getSecurePasswordTask().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_checkCsp_FWD__CSP() {
		return getSecurePasswordTask().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_solveCsp_FWD__IsApplicableMatch_KeyDerivationAlgorithm_Task() {
		return getSecurePasswordTask().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_checkCsp_FWD__CSP() {
		return getSecurePasswordTask().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSecurePasswordTask().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__CheckTypes_FWD__Match() {
		return getSecurePasswordTask().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_BWD__Match_JavaLiteral_JavaPackage_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit() {
		return getSecurePasswordTask().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__Perform_BWD__IsApplicableMatch() {
		return getSecurePasswordTask().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_BWD__Match() {
		return getSecurePasswordTask().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__RegisterObjectsToMatch_BWD__Match_JavaLiteral_JavaPackage_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit() {
		return getSecurePasswordTask().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_solveCsp_BWD__Match_JavaLiteral_JavaPackage_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit() {
		return getSecurePasswordTask().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_checkCsp_BWD__CSP() {
		return getSecurePasswordTask().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaLiteral_JavaPackage_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit() {
		return getSecurePasswordTask().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_checkCsp_BWD__CSP() {
		return getSecurePasswordTask().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSecurePasswordTask().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__CheckTypes_BWD__Match() {
		return getSecurePasswordTask().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge() {
		return getSecurePasswordTask().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge() {
		return getSecurePasswordTask().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__CheckAttributes_FWD__TripleMatch() {
		return getSecurePasswordTask().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__CheckAttributes_BWD__TripleMatch() {
		return getSecurePasswordTask().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_CC__Match_Match() {
		return getSecurePasswordTask().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_solveCsp_CC__JavaLiteral_JavaPackage_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_KeyDerivationAlgorithm_JavaOpaqueMethod_JavaLiteral_Task_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit_Match_Match() {
		return getSecurePasswordTask().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__IsApplicable_checkCsp_CC__CSP() {
		return getSecurePasswordTask().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__CheckDEC_FWD__KeyDerivationAlgorithm_Task() {
		return getSecurePasswordTask().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__CheckDEC_BWD__JavaLiteral_JavaPackage_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit() {
		return getSecurePasswordTask().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__GenerateModel__RuleEntryContainer() {
		return getSecurePasswordTask().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getSecurePasswordTask().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSecurePasswordTask__GenerateModel_checkCsp_BWD__CSP() {
		return getSecurePasswordTask().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricBlockCipherImportToImport() {
		if (symmetricBlockCipherImportToImportEClass == null) {
			symmetricBlockCipherImportToImportEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(RulesPackage.eNS_URI).getEClassifiers().get(4);
		}
		return symmetricBlockCipherImportToImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_FWD__Match_Import_SymmetricBlockCipher() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__Perform_FWD__IsApplicableMatch() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_FWD__Match() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__RegisterObjectsToMatch_FWD__Match_Import_SymmetricBlockCipher() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_solveCsp_FWD__Match_Import_SymmetricBlockCipher() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_checkCsp_FWD__CSP() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_solveCsp_FWD__IsApplicableMatch_Import_SymmetricBlockCipherToJcu_SymmetricBlockCipher_JavaCompilationUnit() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_checkCsp_FWD__CSP() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__CheckTypes_FWD__Match() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_BWD__Match_JavaCompilationUnit_JavaImport() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__Perform_BWD__IsApplicableMatch() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_BWD__Match() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__RegisterObjectsToMatch_BWD__Match_JavaCompilationUnit_JavaImport() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_solveCsp_BWD__Match_JavaCompilationUnit_JavaImport() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_checkCsp_BWD__CSP() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_solveCsp_BWD__IsApplicableMatch_SymmetricBlockCipherToJcu_SymmetricBlockCipher_JavaCompilationUnit_JavaImport() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_checkCsp_BWD__CSP() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__CheckTypes_BWD__Match() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__CheckAttributes_FWD__TripleMatch() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__CheckAttributes_BWD__TripleMatch() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_CC__Match_Match() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_solveCsp_CC__Import_SymmetricBlockCipher_JavaCompilationUnit_JavaImport_Match_Match() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__IsApplicable_checkCsp_CC__CSP() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__CheckDEC_FWD__Import_SymmetricBlockCipher() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__CheckDEC_BWD__JavaCompilationUnit_JavaImport() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__GenerateModel__RuleEntryContainer_SymmetricBlockCipherToJcu() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__GenerateModel_solveCsp_BWD__IsApplicableMatch_SymmetricBlockCipherToJcu_SymmetricBlockCipher_JavaCompilationUnit_ModelgeneratorRuleResult() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymmetricBlockCipherImportToImport__GenerateModel_checkCsp_BWD__CSP() {
		return getSymmetricBlockCipherImportToImport().getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreParameterRule() {
		if (ignoreParameterRuleEClass == null) {
			ignoreParameterRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return ignoreParameterRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsAppropriate_FWD__Match() {
		return getIgnoreParameterRule().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__Perform_FWD__IsApplicableMatch() {
		return getIgnoreParameterRule().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsApplicable_FWD__Match() {
		return getIgnoreParameterRule().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__RegisterObjectsToMatch_FWD__Match() {
		return getIgnoreParameterRule().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsAppropriate_solveCsp_FWD__Match() {
		return getIgnoreParameterRule().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsAppropriate_checkCsp_FWD__CSP() {
		return getIgnoreParameterRule().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__CheckTypes_FWD__Match() {
		return getIgnoreParameterRule().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsAppropriate_BWD__Match_JavaVariableDeclaration_JavaWorkflowMethod() {
		return getIgnoreParameterRule().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__Perform_BWD__IsApplicableMatch() {
		return getIgnoreParameterRule().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsApplicable_BWD__Match() {
		return getIgnoreParameterRule().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__RegisterObjectsToMatch_BWD__Match_JavaVariableDeclaration_JavaWorkflowMethod() {
		return getIgnoreParameterRule().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsAppropriate_solveCsp_BWD__Match_JavaVariableDeclaration_JavaWorkflowMethod() {
		return getIgnoreParameterRule().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsAppropriate_checkCsp_BWD__CSP() {
		return getIgnoreParameterRule().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaVariableDeclaration_JavaWorkflowMethod() {
		return getIgnoreParameterRule().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsApplicable_checkCsp_BWD__CSP() {
		return getIgnoreParameterRule().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject() {
		return getIgnoreParameterRule().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__CheckTypes_BWD__Match() {
		return getIgnoreParameterRule().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge() {
		return getIgnoreParameterRule().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__CheckAttributes_FWD__TripleMatch() {
		return getIgnoreParameterRule().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__CheckAttributes_BWD__TripleMatch() {
		return getIgnoreParameterRule().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsApplicable_CC__Match_Match() {
		return getIgnoreParameterRule().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsApplicable_solveCsp_CC__JavaVariableDeclaration_JavaWorkflowMethod_Match_Match() {
		return getIgnoreParameterRule().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__IsApplicable_checkCsp_CC__CSP() {
		return getIgnoreParameterRule().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__CheckDEC_FWD() {
		return getIgnoreParameterRule().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__CheckDEC_BWD__JavaVariableDeclaration_JavaWorkflowMethod() {
		return getIgnoreParameterRule().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__GenerateModel__RuleEntryContainer_JavaWorkflowMethod() {
		return getIgnoreParameterRule().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaWorkflowMethod_ModelgeneratorRuleResult() {
		return getIgnoreParameterRule().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreParameterRule__GenerateModel_checkCsp_BWD__CSP() {
		return getIgnoreParameterRule().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreMethodInvocationArgument() {
		if (ignoreMethodInvocationArgumentEClass == null) {
			ignoreMethodInvocationArgumentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(6);
		}
		return ignoreMethodInvocationArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsAppropriate_FWD__Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__Perform_FWD__IsApplicableMatch() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsApplicable_FWD__Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__RegisterObjectsToMatch_FWD__Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsAppropriate_solveCsp_FWD__Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsAppropriate_checkCsp_FWD__CSP() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__CheckTypes_FWD__Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsAppropriate_BWD__Match_JavaExpression_JavaMethodInvocation() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__Perform_BWD__IsApplicableMatch() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsApplicable_BWD__Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__RegisterObjectsToMatch_BWD__Match_JavaExpression_JavaMethodInvocation() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsAppropriate_solveCsp_BWD__Match_JavaExpression_JavaMethodInvocation() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsAppropriate_checkCsp_BWD__CSP() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaExpression_JavaMethodInvocation() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsApplicable_checkCsp_BWD__CSP() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__RegisterObjects_BWD__PerformRuleResult_EObject_EObject() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__CheckTypes_BWD__Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__CheckAttributes_FWD__TripleMatch() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__CheckAttributes_BWD__TripleMatch() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsApplicable_CC__Match_Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsApplicable_solveCsp_CC__JavaExpression_JavaMethodInvocation_Match_Match() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__IsApplicable_checkCsp_CC__CSP() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__CheckDEC_FWD() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__CheckDEC_BWD__JavaExpression_JavaMethodInvocation() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__GenerateModel__RuleEntryContainer_JavaMethodInvocation() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaMethodInvocation_ModelgeneratorRuleResult() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreMethodInvocationArgument__GenerateModel_checkCsp_BWD__CSP() {
		return getIgnoreMethodInvocationArgument().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIgnoreOpaqueMethod() {
		if (ignoreOpaqueMethodEClass == null) {
			ignoreOpaqueMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(7);
		}
		return ignoreOpaqueMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsAppropriate_FWD__Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__Perform_FWD__IsApplicableMatch() {
		return getIgnoreOpaqueMethod().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsApplicable_FWD__Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__RegisterObjectsToMatch_FWD__Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsAppropriate_solveCsp_FWD__Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsAppropriate_checkCsp_FWD__CSP() {
		return getIgnoreOpaqueMethod().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__CheckTypes_FWD__Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsAppropriate_BWD__Match_JavaCompilationUnit_JavaOpaqueMethod() {
		return getIgnoreOpaqueMethod().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__Perform_BWD__IsApplicableMatch() {
		return getIgnoreOpaqueMethod().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsApplicable_BWD__Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__RegisterObjectsToMatch_BWD__Match_JavaCompilationUnit_JavaOpaqueMethod() {
		return getIgnoreOpaqueMethod().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsAppropriate_solveCsp_BWD__Match_JavaCompilationUnit_JavaOpaqueMethod() {
		return getIgnoreOpaqueMethod().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsAppropriate_checkCsp_BWD__CSP() {
		return getIgnoreOpaqueMethod().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaCompilationUnit_JavaOpaqueMethod() {
		return getIgnoreOpaqueMethod().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsApplicable_checkCsp_BWD__CSP() {
		return getIgnoreOpaqueMethod().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__RegisterObjects_BWD__PerformRuleResult_EObject_EObject() {
		return getIgnoreOpaqueMethod().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__CheckTypes_BWD__Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge() {
		return getIgnoreOpaqueMethod().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__CheckAttributes_FWD__TripleMatch() {
		return getIgnoreOpaqueMethod().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__CheckAttributes_BWD__TripleMatch() {
		return getIgnoreOpaqueMethod().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsApplicable_CC__Match_Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsApplicable_solveCsp_CC__JavaCompilationUnit_JavaOpaqueMethod_Match_Match() {
		return getIgnoreOpaqueMethod().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__IsApplicable_checkCsp_CC__CSP() {
		return getIgnoreOpaqueMethod().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__CheckDEC_FWD() {
		return getIgnoreOpaqueMethod().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__CheckDEC_BWD__JavaCompilationUnit_JavaOpaqueMethod() {
		return getIgnoreOpaqueMethod().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__GenerateModel__RuleEntryContainer_JavaCompilationUnit() {
		return getIgnoreOpaqueMethod().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaCompilationUnit_ModelgeneratorRuleResult() {
		return getIgnoreOpaqueMethod().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIgnoreOpaqueMethod__GenerateModel_checkCsp_BWD__CSP() {
		return getIgnoreOpaqueMethod().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPasswordBasedEncryption() {
		if (passwordBasedEncryptionEClass == null) {
			passwordBasedEncryptionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
					.getEClassifiers().get(8);
		}
		return passwordBasedEncryptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_FWD__Match_KeyDerivationAlgorithm_Task_SymmetricBlockCipher() {
		return getPasswordBasedEncryption().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__Perform_FWD__IsApplicableMatch() {
		return getPasswordBasedEncryption().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_FWD__Match() {
		return getPasswordBasedEncryption().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__RegisterObjectsToMatch_FWD__Match_KeyDerivationAlgorithm_Task_SymmetricBlockCipher() {
		return getPasswordBasedEncryption().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_solveCsp_FWD__Match_KeyDerivationAlgorithm_Task_SymmetricBlockCipher() {
		return getPasswordBasedEncryption().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_checkCsp_FWD__CSP() {
		return getPasswordBasedEncryption().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_solveCsp_FWD__IsApplicableMatch_KeyDerivationAlgorithm_Task_SymmetricBlockCipher() {
		return getPasswordBasedEncryption().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_checkCsp_FWD__CSP() {
		return getPasswordBasedEncryption().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPasswordBasedEncryption().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__CheckTypes_FWD__Match() {
		return getPasswordBasedEncryption().getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_BWD__Match_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement() {
		return getPasswordBasedEncryption().getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__Perform_BWD__IsApplicableMatch() {
		return getPasswordBasedEncryption().getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_BWD__Match() {
		return getPasswordBasedEncryption().getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__RegisterObjectsToMatch_BWD__Match_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement() {
		return getPasswordBasedEncryption().getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_solveCsp_BWD__Match_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement() {
		return getPasswordBasedEncryption().getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_checkCsp_BWD__CSP() {
		return getPasswordBasedEncryption().getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement() {
		return getPasswordBasedEncryption().getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_checkCsp_BWD__CSP() {
		return getPasswordBasedEncryption().getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject() {
		return getPasswordBasedEncryption().getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__CheckTypes_BWD__Match() {
		return getPasswordBasedEncryption().getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge() {
		return getPasswordBasedEncryption().getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge() {
		return getPasswordBasedEncryption().getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__CheckAttributes_FWD__TripleMatch() {
		return getPasswordBasedEncryption().getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__CheckAttributes_BWD__TripleMatch() {
		return getPasswordBasedEncryption().getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_CC__Match_Match() {
		return getPasswordBasedEncryption().getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_solveCsp_CC__JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_KeyDerivationAlgorithm_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_Task_JavaName_SymmetricBlockCipher_JavaName_JavaMethodInvocation_JavaStatement_Match_Match() {
		return getPasswordBasedEncryption().getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__IsApplicable_checkCsp_CC__CSP() {
		return getPasswordBasedEncryption().getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__CheckDEC_FWD__KeyDerivationAlgorithm_Task_SymmetricBlockCipher() {
		return getPasswordBasedEncryption().getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__CheckDEC_BWD__JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement() {
		return getPasswordBasedEncryption().getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__GenerateModel__RuleEntryContainer() {
		return getPasswordBasedEncryption().getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult() {
		return getPasswordBasedEncryption().getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPasswordBasedEncryption__GenerateModel_checkCsp_BWD__CSP() {
		return getPasswordBasedEncryption().getEOperations().get(31);
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
			eClassifier.setInstanceClassName("CryptoConfigToJava.Rules." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //RulesPackageImpl
