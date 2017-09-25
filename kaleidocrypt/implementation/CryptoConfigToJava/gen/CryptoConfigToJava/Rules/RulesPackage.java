/**
 */
package CryptoConfigToJava.Rules;

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
 * @see CryptoConfigToJava.Rules.RulesFactory
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
	String eNS_URI = "platform:/plugin/CryptoConfigToJava/model/CryptoConfigToJava.ecore#//Rules";

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
	RulesPackage eINSTANCE = CryptoConfigToJava.Rules.impl.RulesPackageImpl.init();

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.IgnoreMethodInvocationArgumentImpl <em>Ignore Method Invocation Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.IgnoreMethodInvocationArgumentImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getIgnoreMethodInvocationArgument()
	 * @generated
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT = 0;

	/**
	 * The number of structural features of the '<em>Ignore Method Invocation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_BWD__MATCH_JAVAMETHODINVOCATION_JAVAEXPRESSION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAMETHODINVOCATION_JAVAEXPRESSION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAMETHODINVOCATION_JAVAEXPRESSION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMETHODINVOCATION_JAVAEXPRESSION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_SOLVE_CSP_CC__JAVAMETHODINVOCATION_JAVAEXPRESSION_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_DEC_FWD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_DEC_BWD__JAVAMETHODINVOCATION_JAVAEXPRESSION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMETHODINVOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMETHODINVOCATION_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The number of operations of the '<em>Ignore Method Invocation Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_METHOD_INVOCATION_ARGUMENT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.SecurePasswordTaskImpl <em>Secure Password Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.SecurePasswordTaskImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getSecurePasswordTask()
	 * @generated
	 */
	int SECURE_PASSWORD_TASK = 1;

	/**
	 * The number of structural features of the '<em>Secure Password Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_KEYDERIVATIONALGORITHM_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_BWD__MATCH_JAVAPACKAGE_JAVALITERAL_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAPACKAGE_JAVALITERAL_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAPACKAGE_JAVALITERAL_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAPACKAGE_JAVALITERAL_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_5__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_6__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_SOLVE_CSP_CC__JAVAPACKAGE_JAVALITERAL_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_KEYDERIVATIONALGORITHM_JAVAOPAQUEMETHOD_JAVALITERAL_TASK_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___CHECK_DEC_FWD__KEYDERIVATIONALGORITHM_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___CHECK_DEC_BWD__JAVAPACKAGE_JAVALITERAL_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 31;

	/**
	 * The number of operations of the '<em>Secure Password Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_PASSWORD_TASK_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.IgnoreParameterRuleImpl <em>Ignore Parameter Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.IgnoreParameterRuleImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getIgnoreParameterRule()
	 * @generated
	 */
	int IGNORE_PARAMETER_RULE = 2;

	/**
	 * The number of structural features of the '<em>Ignore Parameter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPROPRIATE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPROPRIATE_BWD__MATCH_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPLICABLE_SOLVE_CSP_CC__JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___CHECK_DEC_FWD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___CHECK_DEC_BWD__JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAWORKFLOWMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAWORKFLOWMETHOD_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Ignore Parameter Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_PARAMETER_RULE_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.PasswordBasedEncryptionImpl <em>Password Based Encryption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.PasswordBasedEncryptionImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getPasswordBasedEncryption()
	 * @generated
	 */
	int PASSWORD_BASED_ENCRYPTION = 3;

	/**
	 * The number of structural features of the '<em>Password Based Encryption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK_SYMMETRICBLOCKCIPHER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK_SYMMETRICBLOCKCIPHER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK_SYMMETRICBLOCKCIPHER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_KEYDERIVATIONALGORITHM_TASK_SYMMETRICBLOCKCIPHER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_BWD__MATCH_JAVALITERAL_JAVAPACKAGE_JAVAMETHODINVOCATION_JAVALITERAL_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_JAVACOMPILATIONUNIT_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVAWORKFLOWMETHOD_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVALITERAL_JAVAWORKFLOWMETHOD_JAVANAME_JAVANAME_JAVAMETHODINVOCATION_JAVASTATEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVALITERAL_JAVAPACKAGE_JAVAMETHODINVOCATION_JAVALITERAL_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_JAVACOMPILATIONUNIT_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVAWORKFLOWMETHOD_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVALITERAL_JAVAWORKFLOWMETHOD_JAVANAME_JAVANAME_JAVAMETHODINVOCATION_JAVASTATEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVALITERAL_JAVAPACKAGE_JAVAMETHODINVOCATION_JAVALITERAL_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_JAVACOMPILATIONUNIT_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVAWORKFLOWMETHOD_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVALITERAL_JAVAWORKFLOWMETHOD_JAVANAME_JAVANAME_JAVAMETHODINVOCATION_JAVASTATEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVALITERAL_JAVAPACKAGE_JAVAMETHODINVOCATION_JAVALITERAL_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_JAVACOMPILATIONUNIT_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVAWORKFLOWMETHOD_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVALITERAL_JAVAWORKFLOWMETHOD_JAVANAME_JAVANAME_JAVAMETHODINVOCATION_JAVASTATEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_FWD_EMOFLON_EDGE_6__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_SOLVE_CSP_CC__JAVALITERAL_JAVAPACKAGE_JAVAMETHODINVOCATION_JAVALITERAL_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_JAVACOMPILATIONUNIT_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVAWORKFLOWMETHOD_JAVALITERAL_JAVAVARIABLEDECLARATION_KEYDERIVATIONALGORITHM_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVALITERAL_JAVAWORKFLOWMETHOD_TASK_JAVANAME_SYMMETRICBLOCKCIPHER_JAVANAME_JAVAMETHODINVOCATION_JAVASTATEMENT_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___CHECK_DEC_FWD__KEYDERIVATIONALGORITHM_TASK_SYMMETRICBLOCKCIPHER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___CHECK_DEC_BWD__JAVALITERAL_JAVAPACKAGE_JAVAMETHODINVOCATION_JAVALITERAL_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_JAVACOMPILATIONUNIT_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVAWORKFLOWMETHOD_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVALITERAL_JAVAWORKFLOWMETHOD_JAVANAME_JAVANAME_JAVAMETHODINVOCATION_JAVASTATEMENT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Password Based Encryption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_BASED_ENCRYPTION_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.PerformGetKeyMethodImpl <em>Perform Get Key Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.PerformGetKeyMethodImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getPerformGetKeyMethod()
	 * @generated
	 */
	int PERFORM_GET_KEY_METHOD = 4;

	/**
	 * The number of structural features of the '<em>Perform Get Key Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_BWD__MATCH_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD Java Opaque Method 0</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_BWD_JAVA_OPAQUE_METHOD_0__JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPLICABLE_SOLVE_CSP_CC__JAVAOPAQUEMETHOD_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___CHECK_DEC_FWD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___CHECK_DEC_BWD__JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Perform Get Key Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_GET_KEY_METHOD_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.SymmetricEncryptionTaskImpl <em>Symmetric Encryption Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.SymmetricEncryptionTaskImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getSymmetricEncryptionTask()
	 * @generated
	 */
	int SYMMETRIC_ENCRYPTION_TASK = 5;

	/**
	 * The number of structural features of the '<em>Symmetric Encryption Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_FWD__MATCH_SYMMETRICBLOCKCIPHER_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SYMMETRICBLOCKCIPHER_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SYMMETRICBLOCKCIPHER_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHER_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_BWD__MATCH_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVACOMPILATIONUNIT_JAVAWORKFLOWMETHOD_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVANAME_JAVAPACKAGE_JAVALITERAL_JAVAMETHODINVOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVACOMPILATIONUNIT_JAVAWORKFLOWMETHOD_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVANAME_JAVAPACKAGE_JAVALITERAL_JAVAMETHODINVOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVACOMPILATIONUNIT_JAVAWORKFLOWMETHOD_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVANAME_JAVAPACKAGE_JAVALITERAL_JAVAMETHODINVOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVACOMPILATIONUNIT_JAVAWORKFLOWMETHOD_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVANAME_JAVAPACKAGE_JAVALITERAL_JAVAMETHODINVOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_SOLVE_CSP_CC__JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVACOMPILATIONUNIT_JAVAWORKFLOWMETHOD_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVANAME_JAVAPACKAGE_SYMMETRICBLOCKCIPHER_TASK_JAVALITERAL_JAVAMETHODINVOCATION_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___CHECK_DEC_FWD__SYMMETRICBLOCKCIPHER_TASK = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___CHECK_DEC_BWD__JAVAVARIABLEDECLARATION_JAVAVARIABLEDECLARATION_JAVACOMPILATIONUNIT_JAVAWORKFLOWMETHOD_JAVAOPAQUEMETHOD_JAVASTATEMENT_JAVANAME_JAVANAME_JAVAPACKAGE_JAVALITERAL_JAVAMETHODINVOCATION = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___GENERATE_MODEL__RULEENTRYCONTAINER = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Symmetric Encryption Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_ENCRYPTION_TASK_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.SymmetricBlockCipherImportToImportImpl <em>Symmetric Block Cipher Import To Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.SymmetricBlockCipherImportToImportImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getSymmetricBlockCipherImportToImport()
	 * @generated
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT = 6;

	/**
	 * The number of structural features of the '<em>Symmetric Block Cipher Import To Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD__MATCH_SYMMETRICBLOCKCIPHER_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SYMMETRICBLOCKCIPHER_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SYMMETRICBLOCKCIPHER_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHER_SYMMETRICBLOCKCIPHERTOJCU_JAVACOMPILATIONUNIT_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD__MATCH_JAVAIMPORT_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAIMPORT_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAIMPORT_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAIMPORT_SYMMETRICBLOCKCIPHER_SYMMETRICBLOCKCIPHERTOJCU_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_CC__JAVAIMPORT_SYMMETRICBLOCKCIPHER_JAVACOMPILATIONUNIT_IMPORT_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_DEC_FWD__SYMMETRICBLOCKCIPHER_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_DEC_BWD__JAVAIMPORT_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL__RULEENTRYCONTAINER_SYMMETRICBLOCKCIPHERTOJCU = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHER_SYMMETRICBLOCKCIPHERTOJCU_JAVACOMPILATIONUNIT_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Symmetric Block Cipher Import To Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.KeyDerivationAlgorithmImportToImportImpl <em>Key Derivation Algorithm Import To Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.KeyDerivationAlgorithmImportToImportImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getKeyDerivationAlgorithmImportToImport()
	 * @generated
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT = 7;

	/**
	 * The number of structural features of the '<em>Key Derivation Algorithm Import To Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD__MATCH_KEYDERIVATIONALGORITHM_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_KEYDERIVATIONALGORITHM_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_KEYDERIVATIONALGORITHM_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 5;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM_KEYDERIVATIONALGORITHMTOJCU_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 6;

	/**
	 * The operation id for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Register Objects FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 8;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 9;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 12;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 14;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM_KEYDERIVATIONALGORITHMTOJCU_JAVAIMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 16;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 18;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 19;

	/**
	 * The operation id for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 20;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_11__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 22;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 23;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_CC__JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM_IMPORT_JAVAIMPORT_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_DEC_FWD__KEYDERIVATIONALGORITHM_IMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 27;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_DEC_BWD__JAVACOMPILATIONUNIT_JAVAIMPORT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 28;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___GENERATE_MODEL__RULEENTRYCONTAINER_KEYDERIVATIONALGORITHMTOJCU = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 29;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM_KEYDERIVATIONALGORITHMTOJCU_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 30;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 31;

	/**
	 * The number of operations of the '<em>Key Derivation Algorithm Import To Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 32;

	/**
	 * The meta object id for the '{@link CryptoConfigToJava.Rules.impl.IgnoreOpaqueMethodImpl <em>Ignore Opaque Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoConfigToJava.Rules.impl.IgnoreOpaqueMethodImpl
	 * @see CryptoConfigToJava.Rules.impl.RulesPackageImpl#getIgnoreOpaqueMethod()
	 * @generated
	 */
	int IGNORE_OPAQUE_METHOD = 8;

	/**
	 * The number of structural features of the '<em>Ignore Opaque Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD_FEATURE_COUNT = RuntimePackage.ABSTRACT_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Appropriate FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Perform FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___PERFORM_FWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Applicable FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPLICABLE_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Register Objects To Match FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Check Types FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___CHECK_TYPES_FWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Appropriate BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 7;

	/**
	 * The operation id for the '<em>Perform BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___PERFORM_BWD__ISAPPLICABLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Applicable BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPLICABLE_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Register Objects To Match BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 10;

	/**
	 * The operation id for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 11;

	/**
	 * The operation id for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 13;

	/**
	 * The operation id for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPLICABLE_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Register Objects BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 15;

	/**
	 * The operation id for the '<em>Check Types BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___CHECK_TYPES_BWD__MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 17;

	/**
	 * The operation id for the '<em>Check Attributes FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Check Attributes BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Applicable CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPLICABLE_CC__MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPLICABLE_SOLVE_CSP_CC__JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_MATCH_MATCH = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 21;

	/**
	 * The operation id for the '<em>Is Applicable check Csp CC</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___IS_APPLICABLE_CHECK_CSP_CC__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Check DEC FWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___CHECK_DEC_FWD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Check DEC BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___CHECK_DEC_BWD__JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 24;

	/**
	 * The operation id for the '<em>Generate Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___GENERATE_MODEL__RULEENTRYCONTAINER_JAVACOMPILATIONUNIT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 25;

	/**
	 * The operation id for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVACOMPILATIONUNIT_MODELGENERATORRULERESULT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT
			+ 26;

	/**
	 * The operation id for the '<em>Generate Model check Csp BWD</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD___GENERATE_MODEL_CHECK_CSP_BWD__CSP = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 27;

	/**
	 * The number of operations of the '<em>Ignore Opaque Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGNORE_OPAQUE_METHOD_OPERATION_COUNT = RuntimePackage.ABSTRACT_RULE_OPERATION_COUNT + 28;

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument <em>Ignore Method Invocation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Method Invocation Argument</em>'.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument
	 * @generated
	 */
	EClass getIgnoreMethodInvocationArgument();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsAppropriate_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__RegisterObjectsToMatch_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsAppropriate_solveCsp_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsAppropriate_BWD__Match_JavaMethodInvocation_JavaExpression();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__RegisterObjectsToMatch_BWD__Match_JavaMethodInvocation_JavaExpression();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsAppropriate_solveCsp_BWD__Match_JavaMethodInvocation_JavaExpression();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaMethodInvocation_JavaExpression();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__RegisterObjects_BWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_BWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 5</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isAppropriate_BWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsAppropriate_BWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_solveCsp_CC(SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_solveCsp_CC(SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsApplicable_solveCsp_CC__JavaMethodInvocation_JavaExpression_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkDEC_FWD() <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkDEC_FWD()
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__CheckDEC_FWD();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkDEC_BWD(SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#checkDEC_BWD(SimpleJava.JavaMethodInvocation, SimpleJava.JavaExpression)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__CheckDEC_BWD__JavaMethodInvocation_JavaExpression();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, SimpleJava.JavaMethodInvocation) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, SimpleJava.JavaMethodInvocation)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__GenerateModel__RuleEntryContainer_JavaMethodInvocation();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaMethodInvocation, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaMethodInvocation, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaMethodInvocation_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreMethodInvocationArgument__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.SecurePasswordTask <em>Secure Password Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Password Task</em>'.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask
	 * @generated
	 */
	EClass getSecurePasswordTask();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_FWD__Match_KeyDerivationAlgorithm_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSecurePasswordTask__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSecurePasswordTask__RegisterObjectsToMatch_FWD__Match_KeyDerivationAlgorithm_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_solveCsp_FWD__Match_KeyDerivationAlgorithm_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_solveCsp_FWD__IsApplicableMatch_KeyDerivationAlgorithm_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSecurePasswordTask__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSecurePasswordTask__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_BWD__Match_JavaPackage_JavaLiteral_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSecurePasswordTask__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSecurePasswordTask__RegisterObjectsToMatch_BWD__Match_JavaPackage_JavaLiteral_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_solveCsp_BWD__Match_JavaPackage_JavaLiteral_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaPackage_JavaLiteral_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSecurePasswordTask__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSecurePasswordTask__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_FWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 5</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 5</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_FWD_EMoflonEdge_5(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_FWD_EMoflonEdge_5__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_BWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 6</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isAppropriate_BWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsAppropriate_BWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSecurePasswordTask__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSecurePasswordTask__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_solveCsp_CC(SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, CryptoAPIConfig.KeyDerivationAlgorithm, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, CryptoAPIConfig.Task, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_solveCsp_CC(SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, CryptoAPIConfig.KeyDerivationAlgorithm, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, CryptoAPIConfig.Task, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_solveCsp_CC__JavaPackage_JavaLiteral_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_KeyDerivationAlgorithm_JavaOpaqueMethod_JavaLiteral_Task_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSecurePasswordTask__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#checkDEC_FWD(CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#checkDEC_FWD(CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSecurePasswordTask__CheckDEC_FWD__KeyDerivationAlgorithm_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#checkDEC_BWD(SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#checkDEC_BWD(SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaMethodInvocation, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaLiteral, SimpleJava.JavaName, SimpleJava.JavaStatement, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSecurePasswordTask__CheckDEC_BWD__JavaPackage_JavaLiteral_JavaLiteral_JavaVariableDeclaration_JavaMethodInvocation_JavaOpaqueMethod_JavaLiteral_JavaName_JavaStatement_JavaWorkflowMethod_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getSecurePasswordTask__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSecurePasswordTask__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SecurePasswordTask#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSecurePasswordTask__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.IgnoreParameterRule <em>Ignore Parameter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Parameter Rule</em>'.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule
	 * @generated
	 */
	EClass getIgnoreParameterRule();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsAppropriate_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__RegisterObjectsToMatch_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsAppropriate_solveCsp_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsAppropriate_BWD__Match_JavaWorkflowMethod_JavaVariableDeclaration();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__RegisterObjectsToMatch_BWD__Match_JavaWorkflowMethod_JavaVariableDeclaration();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsAppropriate_solveCsp_BWD__Match_JavaWorkflowMethod_JavaVariableDeclaration();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaWorkflowMethod_JavaVariableDeclaration();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__RegisterObjects_BWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_BWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 7</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isAppropriate_BWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsAppropriate_BWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_solveCsp_CC(SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_solveCsp_CC(SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsApplicable_solveCsp_CC__JavaWorkflowMethod_JavaVariableDeclaration_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#checkDEC_FWD() <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#checkDEC_FWD()
	 * @generated
	 */
	EOperation getIgnoreParameterRule__CheckDEC_FWD();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#checkDEC_BWD(SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#checkDEC_BWD(SimpleJava.JavaWorkflowMethod, SimpleJava.JavaVariableDeclaration)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__CheckDEC_BWD__JavaWorkflowMethod_JavaVariableDeclaration();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, SimpleJava.JavaWorkflowMethod) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, SimpleJava.JavaWorkflowMethod)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__GenerateModel__RuleEntryContainer_JavaWorkflowMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaWorkflowMethod, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaWorkflowMethod, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaWorkflowMethod_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreParameterRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreParameterRule__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption <em>Password Based Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Based Encryption</em>'.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption
	 * @generated
	 */
	EClass getPasswordBasedEncryption();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_FWD__Match_KeyDerivationAlgorithm_Task_SymmetricBlockCipher();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__RegisterObjectsToMatch_FWD__Match_KeyDerivationAlgorithm_Task_SymmetricBlockCipher();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_solveCsp_FWD__Match_KeyDerivationAlgorithm_Task_SymmetricBlockCipher();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_solveCsp_FWD__IsApplicableMatch_KeyDerivationAlgorithm_Task_SymmetricBlockCipher();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_BWD__Match_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__RegisterObjectsToMatch_BWD__Match_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_solveCsp_BWD__Match_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_FWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 6</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 6</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_FWD_EMoflonEdge_6(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_FWD_EMoflonEdge_6__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_BWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 8</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isAppropriate_BWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsAppropriate_BWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_solveCsp_CC(SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, CryptoAPIConfig.KeyDerivationAlgorithm, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, CryptoAPIConfig.Task, SimpleJava.JavaName, CryptoAPIConfig.SymmetricBlockCipher, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_solveCsp_CC(SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, CryptoAPIConfig.KeyDerivationAlgorithm, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, CryptoAPIConfig.Task, SimpleJava.JavaName, CryptoAPIConfig.SymmetricBlockCipher, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_solveCsp_CC__JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_KeyDerivationAlgorithm_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_Task_JavaName_SymmetricBlockCipher_JavaName_JavaMethodInvocation_JavaStatement_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#checkDEC_FWD(CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#checkDEC_FWD(CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Task, CryptoAPIConfig.SymmetricBlockCipher)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__CheckDEC_FWD__KeyDerivationAlgorithm_Task_SymmetricBlockCipher();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#checkDEC_BWD(SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#checkDEC_BWD(SimpleJava.JavaLiteral, SimpleJava.JavaPackage, SimpleJava.JavaMethodInvocation, SimpleJava.JavaLiteral, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaCompilationUnit, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaLiteral, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaLiteral, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaMethodInvocation, SimpleJava.JavaStatement)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__CheckDEC_BWD__JavaLiteral_JavaPackage_JavaMethodInvocation_JavaLiteral_JavaCompilationUnit_JavaOpaqueMethod_JavaCompilationUnit_JavaVariableDeclaration_JavaVariableDeclaration_JavaWorkflowMethod_JavaLiteral_JavaVariableDeclaration_JavaOpaqueMethod_JavaStatement_JavaName_JavaLiteral_JavaWorkflowMethod_JavaName_JavaName_JavaMethodInvocation_JavaStatement();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPasswordBasedEncryption__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod <em>Perform Get Key Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Get Key Method</em>'.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod
	 * @generated
	 */
	EClass getPerformGetKeyMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsAppropriate_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__RegisterObjectsToMatch_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsAppropriate_solveCsp_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaOpaqueMethod) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsAppropriate_BWD__Match_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaOpaqueMethod) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__RegisterObjectsToMatch_BWD__Match_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaOpaqueMethod) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsAppropriate_solveCsp_BWD__Match_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaOpaqueMethod) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__RegisterObjects_BWD__PerformRuleResult_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_BWD_JavaOpaqueMethod_0(SimpleJava.JavaOpaqueMethod) <em>Is Appropriate BWD Java Opaque Method 0</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD Java Opaque Method 0</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isAppropriate_BWD_JavaOpaqueMethod_0(SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsAppropriate_BWD_JavaOpaqueMethod_0__JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_solveCsp_CC(SimpleJava.JavaOpaqueMethod, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_solveCsp_CC(SimpleJava.JavaOpaqueMethod, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsApplicable_solveCsp_CC__JavaOpaqueMethod_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#checkDEC_FWD() <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#checkDEC_FWD()
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__CheckDEC_FWD();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#checkDEC_BWD(SimpleJava.JavaOpaqueMethod) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#checkDEC_BWD(SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__CheckDEC_BWD__JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getPerformGetKeyMethod__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask <em>Symmetric Encryption Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric Encryption Task</em>'.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask
	 * @generated
	 */
	EClass getSymmetricEncryptionTask();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_FWD__Match_SymmetricBlockCipher_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__RegisterObjectsToMatch_FWD__Match_SymmetricBlockCipher_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_solveCsp_FWD__Match_SymmetricBlockCipher_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_solveCsp_FWD__IsApplicableMatch_SymmetricBlockCipher_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_BWD__Match_JavaVariableDeclaration_JavaVariableDeclaration_JavaCompilationUnit_JavaWorkflowMethod_JavaOpaqueMethod_JavaStatement_JavaName_JavaName_JavaPackage_JavaLiteral_JavaMethodInvocation();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__RegisterObjectsToMatch_BWD__Match_JavaVariableDeclaration_JavaVariableDeclaration_JavaCompilationUnit_JavaWorkflowMethod_JavaOpaqueMethod_JavaStatement_JavaName_JavaName_JavaPackage_JavaLiteral_JavaMethodInvocation();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_solveCsp_BWD__Match_JavaVariableDeclaration_JavaVariableDeclaration_JavaCompilationUnit_JavaWorkflowMethod_JavaOpaqueMethod_JavaStatement_JavaName_JavaName_JavaPackage_JavaLiteral_JavaMethodInvocation();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaVariableDeclaration_JavaVariableDeclaration_JavaCompilationUnit_JavaWorkflowMethod_JavaOpaqueMethod_JavaStatement_JavaName_JavaName_JavaPackage_JavaLiteral_JavaMethodInvocation();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_FWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 7</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 7</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_FWD_EMoflonEdge_7(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_FWD_EMoflonEdge_7__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_BWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 9</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isAppropriate_BWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsAppropriate_BWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_solveCsp_CC(SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_solveCsp_CC(SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_solveCsp_CC__JavaVariableDeclaration_JavaVariableDeclaration_JavaCompilationUnit_JavaWorkflowMethod_JavaOpaqueMethod_JavaStatement_JavaName_JavaName_JavaPackage_SymmetricBlockCipher_Task_JavaLiteral_JavaMethodInvocation_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkDEC_FWD(CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkDEC_FWD(CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Task)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__CheckDEC_FWD__SymmetricBlockCipher_Task();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkDEC_BWD(SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#checkDEC_BWD(SimpleJava.JavaVariableDeclaration, SimpleJava.JavaVariableDeclaration, SimpleJava.JavaCompilationUnit, SimpleJava.JavaWorkflowMethod, SimpleJava.JavaOpaqueMethod, SimpleJava.JavaStatement, SimpleJava.JavaName, SimpleJava.JavaName, SimpleJava.JavaPackage, SimpleJava.JavaLiteral, SimpleJava.JavaMethodInvocation)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__CheckDEC_BWD__JavaVariableDeclaration_JavaVariableDeclaration_JavaCompilationUnit_JavaWorkflowMethod_JavaOpaqueMethod_JavaStatement_JavaName_JavaName_JavaPackage_JavaLiteral_JavaMethodInvocation();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__GenerateModel__RuleEntryContainer();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__GenerateModel_solveCsp_BWD__IsApplicableMatch_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricEncryptionTask__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport <em>Symmetric Block Cipher Import To Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric Block Cipher Import To Import</em>'.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport
	 * @generated
	 */
	EClass getSymmetricBlockCipherImportToImport();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_FWD__Match_SymmetricBlockCipher_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__RegisterObjectsToMatch_FWD__Match_SymmetricBlockCipher_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_solveCsp_FWD__Match_SymmetricBlockCipher_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.SymmetricBlockCipher, CryptoConfigToJava.SymmetricBlockCipherToJcu, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.Import) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.SymmetricBlockCipher, CryptoConfigToJava.SymmetricBlockCipherToJcu, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_solveCsp_FWD__IsApplicableMatch_SymmetricBlockCipher_SymmetricBlockCipherToJcu_JavaCompilationUnit_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_BWD__Match_JavaImport_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__RegisterObjectsToMatch_BWD__Match_JavaImport_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_solveCsp_BWD__Match_JavaImport_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaImport, CryptoAPIConfig.SymmetricBlockCipher, CryptoConfigToJava.SymmetricBlockCipherToJcu, SimpleJava.JavaCompilationUnit) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaImport, CryptoAPIConfig.SymmetricBlockCipher, CryptoConfigToJava.SymmetricBlockCipherToJcu, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaImport_SymmetricBlockCipher_SymmetricBlockCipherToJcu_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_FWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 8</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 8</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_FWD_EMoflonEdge_8(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_FWD_EMoflonEdge_8__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_BWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 10</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 10</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isAppropriate_BWD_EMoflonEdge_10(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsAppropriate_BWD_EMoflonEdge_10__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_solveCsp_CC(SimpleJava.JavaImport, CryptoAPIConfig.SymmetricBlockCipher, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.Import, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_solveCsp_CC(SimpleJava.JavaImport, CryptoAPIConfig.SymmetricBlockCipher, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.Import, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_solveCsp_CC__JavaImport_SymmetricBlockCipher_JavaCompilationUnit_Import_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkDEC_FWD(CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkDEC_FWD(CryptoAPIConfig.SymmetricBlockCipher, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__CheckDEC_FWD__SymmetricBlockCipher_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkDEC_BWD(SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#checkDEC_BWD(SimpleJava.JavaImport, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__CheckDEC_BWD__JavaImport_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, CryptoConfigToJava.SymmetricBlockCipherToJcu) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, CryptoConfigToJava.SymmetricBlockCipherToJcu)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__GenerateModel__RuleEntryContainer_SymmetricBlockCipherToJcu();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.SymmetricBlockCipher, CryptoConfigToJava.SymmetricBlockCipherToJcu, SimpleJava.JavaCompilationUnit, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, CryptoAPIConfig.SymmetricBlockCipher, CryptoConfigToJava.SymmetricBlockCipherToJcu, SimpleJava.JavaCompilationUnit, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__GenerateModel_solveCsp_BWD__IsApplicableMatch_SymmetricBlockCipher_SymmetricBlockCipherToJcu_JavaCompilationUnit_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getSymmetricBlockCipherImportToImport__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport <em>Key Derivation Algorithm Import To Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Derivation Algorithm Import To Import</em>'.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport
	 * @generated
	 */
	EClass getKeyDerivationAlgorithmImportToImport();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_FWD__Match_KeyDerivationAlgorithm_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjectsToMatch_FWD__Match_KeyDerivationAlgorithm_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_solveCsp_FWD__Match_KeyDerivationAlgorithm_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoConfigToJava.KeyDerivationAlgorithmToJcu, CryptoAPIConfig.Import) <em>Is Applicable solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_solveCsp_FWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoConfigToJava.KeyDerivationAlgorithmToJcu, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_solveCsp_FWD__IsApplicableMatch_JavaCompilationUnit_KeyDerivationAlgorithm_KeyDerivationAlgorithmToJcu_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjects_FWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjects_FWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_BWD__Match_JavaCompilationUnit_JavaImport();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjectsToMatch_BWD__Match_JavaCompilationUnit_JavaImport();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_solveCsp_BWD__Match_JavaCompilationUnit_JavaImport();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoConfigToJava.KeyDerivationAlgorithmToJcu, SimpleJava.JavaImport) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoConfigToJava.KeyDerivationAlgorithmToJcu, SimpleJava.JavaImport)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaCompilationUnit_KeyDerivationAlgorithm_KeyDerivationAlgorithmToJcu_JavaImport();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__RegisterObjects_BWD__PerformRuleResult_EObject_EObject_EObject_EObject_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_FWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate FWD EMoflon Edge 9</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD EMoflon Edge 9</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_FWD_EMoflonEdge_9(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_FWD_EMoflonEdge_9__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_BWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 11</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 11</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isAppropriate_BWD_EMoflonEdge_11(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsAppropriate_BWD_EMoflonEdge_11__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_solveCsp_CC(SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import, SimpleJava.JavaImport, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_solveCsp_CC(SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import, SimpleJava.JavaImport, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_solveCsp_CC__JavaCompilationUnit_KeyDerivationAlgorithm_Import_JavaImport_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkDEC_FWD(CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import) <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkDEC_FWD(CryptoAPIConfig.KeyDerivationAlgorithm, CryptoAPIConfig.Import)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__CheckDEC_FWD__KeyDerivationAlgorithm_Import();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkDEC_BWD(SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#checkDEC_BWD(SimpleJava.JavaCompilationUnit, SimpleJava.JavaImport)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__CheckDEC_BWD__JavaCompilationUnit_JavaImport();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, CryptoConfigToJava.KeyDerivationAlgorithmToJcu) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, CryptoConfigToJava.KeyDerivationAlgorithmToJcu)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__GenerateModel__RuleEntryContainer_KeyDerivationAlgorithmToJcu();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoConfigToJava.KeyDerivationAlgorithmToJcu, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, CryptoAPIConfig.KeyDerivationAlgorithm, CryptoConfigToJava.KeyDerivationAlgorithmToJcu, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaCompilationUnit_KeyDerivationAlgorithm_KeyDerivationAlgorithmToJcu_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getKeyDerivationAlgorithmImportToImport__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for class '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod <em>Ignore Opaque Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ignore Opaque Method</em>'.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod
	 * @generated
	 */
	EClass getIgnoreOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsAppropriate_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#perform_FWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__Perform_FWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_FWD(org.moflon.tgg.runtime.Match) <em>Is Applicable FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsApplicable_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match) <em>Register Objects To Match FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#registerObjectsToMatch_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__RegisterObjectsToMatch_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match) <em>Is Appropriate solve Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_solveCsp_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsAppropriate_solveCsp_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_checkCsp_FWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsAppropriate_checkCsp_FWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkTypes_FWD(org.moflon.tgg.runtime.Match) <em>Check Types FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkTypes_FWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__CheckTypes_FWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod) <em>Is Appropriate BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsAppropriate_BWD__Match_JavaCompilationUnit_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch) <em>Perform BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Perform BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#perform_BWD(org.moflon.tgg.runtime.IsApplicableMatch)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__Perform_BWD__IsApplicableMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_BWD(org.moflon.tgg.runtime.Match) <em>Is Applicable BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsApplicable_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod) <em>Register Objects To Match BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects To Match BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#registerObjectsToMatch_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__RegisterObjectsToMatch_BWD__Match_JavaCompilationUnit_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod) <em>Is Appropriate solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_solveCsp_BWD(org.moflon.tgg.runtime.Match, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsAppropriate_solveCsp_BWD__Match_JavaCompilationUnit_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Appropriate check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsAppropriate_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod) <em>Is Applicable solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsApplicable_solveCsp_BWD__IsApplicableMatch_JavaCompilationUnit_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsApplicable_checkCsp_BWD__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Register Objects BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Objects BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#registerObjects_BWD(org.moflon.tgg.runtime.PerformRuleResult, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__RegisterObjects_BWD__PerformRuleResult_EObject_EObject();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkTypes_BWD(org.moflon.tgg.runtime.Match) <em>Check Types BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Types BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkTypes_BWD(org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__CheckTypes_BWD__Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_BWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge) <em>Is Appropriate BWD EMoflon Edge 12</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Appropriate BWD EMoflon Edge 12</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isAppropriate_BWD_EMoflonEdge_12(org.moflon.tgg.runtime.EMoflonEdge)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsAppropriate_BWD_EMoflonEdge_12__EMoflonEdge();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkAttributes_FWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__CheckAttributes_FWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch) <em>Check Attributes BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Attributes BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkAttributes_BWD(org.moflon.tgg.runtime.TripleMatch)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__CheckAttributes_BWD__TripleMatch();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_CC(org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsApplicable_CC__Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_solveCsp_CC(SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match) <em>Is Applicable solve Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable solve Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_solveCsp_CC(SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod, org.moflon.tgg.runtime.Match, org.moflon.tgg.runtime.Match)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsApplicable_solveCsp_CC__JavaCompilationUnit_JavaOpaqueMethod_Match_Match();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP) <em>Is Applicable check Csp CC</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Applicable check Csp CC</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#isApplicable_checkCsp_CC(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__IsApplicable_checkCsp_CC__CSP();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkDEC_FWD() <em>Check DEC FWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC FWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkDEC_FWD()
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__CheckDEC_FWD();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkDEC_BWD(SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod) <em>Check DEC BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check DEC BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#checkDEC_BWD(SimpleJava.JavaCompilationUnit, SimpleJava.JavaOpaqueMethod)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__CheckDEC_BWD__JavaCompilationUnit_JavaOpaqueMethod();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, SimpleJava.JavaCompilationUnit) <em>Generate Model</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#generateModel(org.moflon.tgg.language.modelgenerator.RuleEntryContainer, SimpleJava.JavaCompilationUnit)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__GenerateModel__RuleEntryContainer_JavaCompilationUnit();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, org.moflon.tgg.runtime.ModelgeneratorRuleResult) <em>Generate Model solve Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model solve Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#generateModel_solveCsp_BWD(org.moflon.tgg.runtime.IsApplicableMatch, SimpleJava.JavaCompilationUnit, org.moflon.tgg.runtime.ModelgeneratorRuleResult)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__GenerateModel_solveCsp_BWD__IsApplicableMatch_JavaCompilationUnit_ModelgeneratorRuleResult();

	/**
	 * Returns the meta object for the '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP) <em>Generate Model check Csp BWD</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Model check Csp BWD</em>' operation.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod#generateModel_checkCsp_BWD(org.moflon.tgg.language.csp.CSP)
	 * @generated
	 */
	EOperation getIgnoreOpaqueMethod__GenerateModel_checkCsp_BWD__CSP();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RulesFactory getRulesFactory();

} //RulesPackage
