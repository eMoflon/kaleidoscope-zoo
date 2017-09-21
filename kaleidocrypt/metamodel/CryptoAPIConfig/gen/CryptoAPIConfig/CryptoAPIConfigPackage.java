/**
 */
package CryptoAPIConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CryptoAPIConfig.CryptoAPIConfigFactory
 * @model kind="package"
 * @generated
 */
public interface CryptoAPIConfigPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CryptoAPIConfig";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/CryptoAPIConfig/model/CryptoAPIConfig.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CryptoAPIConfig";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CryptoAPIConfigPackage eINSTANCE = CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl.init();

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.TaskImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ALGORITHMS = 2;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.CodeConfigurationImpl <em>Code Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.CodeConfigurationImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getCodeConfiguration()
	 * @generated
	 */
	int CODE_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Keystore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONFIGURATION__KEYSTORE = 0;

	/**
	 * The feature id for the '<em><b>Server</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONFIGURATION__SERVER = 1;

	/**
	 * The feature id for the '<em><b>Keystore Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONFIGURATION__KEYSTORE_PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Code Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONFIGURATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Code Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.AlgorithmImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__SECURITY = 2;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__PERFORMANCE = 3;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__IMPORTS = 4;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__INCLUDES = 5;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.KeyDerivationAlgorithmImpl <em>Key Derivation Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.KeyDerivationAlgorithmImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getKeyDerivationAlgorithm()
	 * @generated
	 */
	int KEY_DERIVATION_ALGORITHM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__NAME = ALGORITHM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__DESCRIPTION = ALGORITHM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__SECURITY = ALGORITHM__SECURITY;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__PERFORMANCE = ALGORITHM__PERFORMANCE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__IMPORTS = ALGORITHM__IMPORTS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__INCLUDES = ALGORITHM__INCLUDES;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__ITERATIONS = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE = ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Key Derivation Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Key Derivation Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DERIVATION_ALGORITHM_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.SecureConnectionImpl <em>Secure Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.SecureConnectionImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getSecureConnection()
	 * @generated
	 */
	int SECURE_CONNECTION = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONNECTION__PACKAGE = TASK__PACKAGE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONNECTION__DESCRIPTION = TASK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Algorithms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONNECTION__ALGORITHMS = TASK__ALGORITHMS;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONNECTION__CONFIG = TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Secure Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONNECTION_FEATURE_COUNT = TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Secure Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURE_CONNECTION_OPERATION_COUNT = TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.DigestImpl <em>Digest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.DigestImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getDigest()
	 * @generated
	 */
	int DIGEST = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST__NAME = ALGORITHM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST__DESCRIPTION = ALGORITHM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST__SECURITY = ALGORITHM__SECURITY;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST__PERFORMANCE = ALGORITHM__PERFORMANCE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST__IMPORTS = ALGORITHM__IMPORTS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST__INCLUDES = ALGORITHM__INCLUDES;

	/**
	 * The feature id for the '<em><b>Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST__OUTPUT_SIZE = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Digest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Digest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIGEST_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.SymmetricBlockCipherImpl <em>Symmetric Block Cipher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.SymmetricBlockCipherImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getSymmetricBlockCipher()
	 * @generated
	 */
	int SYMMETRIC_BLOCK_CIPHER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__NAME = ALGORITHM__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__DESCRIPTION = ALGORITHM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__SECURITY = ALGORITHM__SECURITY;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__PERFORMANCE = ALGORITHM__PERFORMANCE;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__IMPORTS = ALGORITHM__IMPORTS;

	/**
	 * The feature id for the '<em><b>Includes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__INCLUDES = ALGORITHM__INCLUDES;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__MODE = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__PADDING = ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER__KEY_SIZE = ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Symmetric Block Cipher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Symmetric Block Cipher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_BLOCK_CIPHER_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.impl.ImportImpl
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.SECURITY <em>SECURITY</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.SECURITY
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getSECURITY()
	 * @generated
	 */
	int SECURITY = 8;

	/**
	 * The meta object id for the '{@link CryptoAPIConfig.PERFORMANCE <em>PERFORMANCE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CryptoAPIConfig.PERFORMANCE
	 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getPERFORMANCE()
	 * @generated
	 */
	int PERFORMANCE = 9;

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see CryptoAPIConfig.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Task#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see CryptoAPIConfig.Task#getPackage()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Package();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Task#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CryptoAPIConfig.Task#getDescription()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoAPIConfig.Task#getAlgorithms <em>Algorithms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Algorithms</em>'.
	 * @see CryptoAPIConfig.Task#getAlgorithms()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Algorithms();

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.CodeConfiguration <em>Code Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Configuration</em>'.
	 * @see CryptoAPIConfig.CodeConfiguration
	 * @generated
	 */
	EClass getCodeConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.CodeConfiguration#getKeystore <em>Keystore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystore</em>'.
	 * @see CryptoAPIConfig.CodeConfiguration#getKeystore()
	 * @see #getCodeConfiguration()
	 * @generated
	 */
	EAttribute getCodeConfiguration_Keystore();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.CodeConfiguration#isServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server</em>'.
	 * @see CryptoAPIConfig.CodeConfiguration#isServer()
	 * @see #getCodeConfiguration()
	 * @generated
	 */
	EAttribute getCodeConfiguration_Server();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.CodeConfiguration#getKeystorePassword <em>Keystore Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keystore Password</em>'.
	 * @see CryptoAPIConfig.CodeConfiguration#getKeystorePassword()
	 * @see #getCodeConfiguration()
	 * @generated
	 */
	EAttribute getCodeConfiguration_KeystorePassword();

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.KeyDerivationAlgorithm <em>Key Derivation Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Derivation Algorithm</em>'.
	 * @see CryptoAPIConfig.KeyDerivationAlgorithm
	 * @generated
	 */
	EClass getKeyDerivationAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.KeyDerivationAlgorithm#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see CryptoAPIConfig.KeyDerivationAlgorithm#getIterations()
	 * @see #getKeyDerivationAlgorithm()
	 * @generated
	 */
	EAttribute getKeyDerivationAlgorithm_Iterations();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.KeyDerivationAlgorithm#getOutputSize <em>Output Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Size</em>'.
	 * @see CryptoAPIConfig.KeyDerivationAlgorithm#getOutputSize()
	 * @see #getKeyDerivationAlgorithm()
	 * @generated
	 */
	EAttribute getKeyDerivationAlgorithm_OutputSize();

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.SecureConnection <em>Secure Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secure Connection</em>'.
	 * @see CryptoAPIConfig.SecureConnection
	 * @generated
	 */
	EClass getSecureConnection();

	/**
	 * Returns the meta object for the containment reference '{@link CryptoAPIConfig.SecureConnection#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config</em>'.
	 * @see CryptoAPIConfig.SecureConnection#getConfig()
	 * @see #getSecureConnection()
	 * @generated
	 */
	EReference getSecureConnection_Config();

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.Digest <em>Digest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digest</em>'.
	 * @see CryptoAPIConfig.Digest
	 * @generated
	 */
	EClass getDigest();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Digest#getOutputSize <em>Output Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Size</em>'.
	 * @see CryptoAPIConfig.Digest#getOutputSize()
	 * @see #getDigest()
	 * @generated
	 */
	EAttribute getDigest_OutputSize();

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.SymmetricBlockCipher <em>Symmetric Block Cipher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symmetric Block Cipher</em>'.
	 * @see CryptoAPIConfig.SymmetricBlockCipher
	 * @generated
	 */
	EClass getSymmetricBlockCipher();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.SymmetricBlockCipher#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see CryptoAPIConfig.SymmetricBlockCipher#getMode()
	 * @see #getSymmetricBlockCipher()
	 * @generated
	 */
	EAttribute getSymmetricBlockCipher_Mode();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.SymmetricBlockCipher#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see CryptoAPIConfig.SymmetricBlockCipher#getPadding()
	 * @see #getSymmetricBlockCipher()
	 * @generated
	 */
	EAttribute getSymmetricBlockCipher_Padding();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.SymmetricBlockCipher#getKeySize <em>Key Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key Size</em>'.
	 * @see CryptoAPIConfig.SymmetricBlockCipher#getKeySize()
	 * @see #getSymmetricBlockCipher()
	 * @generated
	 */
	EAttribute getSymmetricBlockCipher_KeySize();

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see CryptoAPIConfig.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Import#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CryptoAPIConfig.Import#getValue()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_Value();

	/**
	 * Returns the meta object for class '{@link CryptoAPIConfig.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see CryptoAPIConfig.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Algorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CryptoAPIConfig.Algorithm#getName()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Name();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Algorithm#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see CryptoAPIConfig.Algorithm#getDescription()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Description();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Algorithm#getSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see CryptoAPIConfig.Algorithm#getSecurity()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Security();

	/**
	 * Returns the meta object for the attribute '{@link CryptoAPIConfig.Algorithm#getPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance</em>'.
	 * @see CryptoAPIConfig.Algorithm#getPerformance()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Performance();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoAPIConfig.Algorithm#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see CryptoAPIConfig.Algorithm#getImports()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link CryptoAPIConfig.Algorithm#getIncludes <em>Includes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Includes</em>'.
	 * @see CryptoAPIConfig.Algorithm#getIncludes()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Includes();

	/**
	 * Returns the meta object for enum '{@link CryptoAPIConfig.SECURITY <em>SECURITY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SECURITY</em>'.
	 * @see CryptoAPIConfig.SECURITY
	 * @generated
	 */
	EEnum getSECURITY();

	/**
	 * Returns the meta object for enum '{@link CryptoAPIConfig.PERFORMANCE <em>PERFORMANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>PERFORMANCE</em>'.
	 * @see CryptoAPIConfig.PERFORMANCE
	 * @generated
	 */
	EEnum getPERFORMANCE();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CryptoAPIConfigFactory getCryptoAPIConfigFactory();

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
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.TaskImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PACKAGE = eINSTANCE.getTask_Package();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DESCRIPTION = eINSTANCE.getTask_Description();

		/**
		 * The meta object literal for the '<em><b>Algorithms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__ALGORITHMS = eINSTANCE.getTask_Algorithms();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.CodeConfigurationImpl <em>Code Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.CodeConfigurationImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getCodeConfiguration()
		 * @generated
		 */
		EClass CODE_CONFIGURATION = eINSTANCE.getCodeConfiguration();

		/**
		 * The meta object literal for the '<em><b>Keystore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CONFIGURATION__KEYSTORE = eINSTANCE.getCodeConfiguration_Keystore();

		/**
		 * The meta object literal for the '<em><b>Server</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CONFIGURATION__SERVER = eINSTANCE.getCodeConfiguration_Server();

		/**
		 * The meta object literal for the '<em><b>Keystore Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CONFIGURATION__KEYSTORE_PASSWORD = eINSTANCE.getCodeConfiguration_KeystorePassword();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.KeyDerivationAlgorithmImpl <em>Key Derivation Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.KeyDerivationAlgorithmImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getKeyDerivationAlgorithm()
		 * @generated
		 */
		EClass KEY_DERIVATION_ALGORITHM = eINSTANCE.getKeyDerivationAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_DERIVATION_ALGORITHM__ITERATIONS = eINSTANCE.getKeyDerivationAlgorithm_Iterations();

		/**
		 * The meta object literal for the '<em><b>Output Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE = eINSTANCE.getKeyDerivationAlgorithm_OutputSize();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.SecureConnectionImpl <em>Secure Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.SecureConnectionImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getSecureConnection()
		 * @generated
		 */
		EClass SECURE_CONNECTION = eINSTANCE.getSecureConnection();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURE_CONNECTION__CONFIG = eINSTANCE.getSecureConnection_Config();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.DigestImpl <em>Digest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.DigestImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getDigest()
		 * @generated
		 */
		EClass DIGEST = eINSTANCE.getDigest();

		/**
		 * The meta object literal for the '<em><b>Output Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIGEST__OUTPUT_SIZE = eINSTANCE.getDigest_OutputSize();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.SymmetricBlockCipherImpl <em>Symmetric Block Cipher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.SymmetricBlockCipherImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getSymmetricBlockCipher()
		 * @generated
		 */
		EClass SYMMETRIC_BLOCK_CIPHER = eINSTANCE.getSymmetricBlockCipher();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMMETRIC_BLOCK_CIPHER__MODE = eINSTANCE.getSymmetricBlockCipher_Mode();

		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMMETRIC_BLOCK_CIPHER__PADDING = eINSTANCE.getSymmetricBlockCipher_Padding();

		/**
		 * The meta object literal for the '<em><b>Key Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMMETRIC_BLOCK_CIPHER__KEY_SIZE = eINSTANCE.getSymmetricBlockCipher_KeySize();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.ImportImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__VALUE = eINSTANCE.getImport_Value();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.impl.AlgorithmImpl
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__NAME = eINSTANCE.getAlgorithm_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__DESCRIPTION = eINSTANCE.getAlgorithm_Description();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__SECURITY = eINSTANCE.getAlgorithm_Security();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__PERFORMANCE = eINSTANCE.getAlgorithm_Performance();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__IMPORTS = eINSTANCE.getAlgorithm_Imports();

		/**
		 * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__INCLUDES = eINSTANCE.getAlgorithm_Includes();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.SECURITY <em>SECURITY</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.SECURITY
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getSECURITY()
		 * @generated
		 */
		EEnum SECURITY = eINSTANCE.getSECURITY();

		/**
		 * The meta object literal for the '{@link CryptoAPIConfig.PERFORMANCE <em>PERFORMANCE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CryptoAPIConfig.PERFORMANCE
		 * @see CryptoAPIConfig.impl.CryptoAPIConfigPackageImpl#getPERFORMANCE()
		 * @generated
		 */
		EEnum PERFORMANCE = eINSTANCE.getPERFORMANCE();

	}

} //CryptoAPIConfigPackage
