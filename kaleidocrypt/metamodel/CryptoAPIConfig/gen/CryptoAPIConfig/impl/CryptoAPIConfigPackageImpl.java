/**
 */
package CryptoAPIConfig.impl;

import CryptoAPIConfig.Algorithm;
import CryptoAPIConfig.CodeConfiguration;
import CryptoAPIConfig.CryptoAPIConfigFactory;
import CryptoAPIConfig.CryptoAPIConfigPackage;
import CryptoAPIConfig.Digest;
import CryptoAPIConfig.Import;
import CryptoAPIConfig.KeyDerivationAlgorithm;
import CryptoAPIConfig.SecureConnection;
import CryptoAPIConfig.SymmetricBlockCipher;
import CryptoAPIConfig.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoAPIConfigPackageImpl extends EPackageImpl implements CryptoAPIConfigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyDerivationAlgorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secureConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass digestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricBlockCipherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum performanceEEnum = null;

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
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CryptoAPIConfigPackageImpl() {
		super(eNS_URI, CryptoAPIConfigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CryptoAPIConfigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CryptoAPIConfigPackage init() {
		if (isInited)
			return (CryptoAPIConfigPackage) EPackage.Registry.INSTANCE.getEPackage(CryptoAPIConfigPackage.eNS_URI);

		// Obtain or create and register package
		CryptoAPIConfigPackageImpl theCryptoAPIConfigPackage = (CryptoAPIConfigPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CryptoAPIConfigPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CryptoAPIConfigPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCryptoAPIConfigPackage.createPackageContents();

		// Initialize created meta-data
		theCryptoAPIConfigPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCryptoAPIConfigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CryptoAPIConfigPackage.eNS_URI, theCryptoAPIConfigPackage);
		return theCryptoAPIConfigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Package() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Description() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Algorithms() {
		return (EReference) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeConfiguration() {
		return codeConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeConfiguration_Keystore() {
		return (EAttribute) codeConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeConfiguration_Server() {
		return (EAttribute) codeConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeConfiguration_KeystorePassword() {
		return (EAttribute) codeConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyDerivationAlgorithm() {
		return keyDerivationAlgorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyDerivationAlgorithm_Iterations() {
		return (EAttribute) keyDerivationAlgorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyDerivationAlgorithm_OutputSize() {
		return (EAttribute) keyDerivationAlgorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecureConnection() {
		return secureConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecureConnection_Config() {
		return (EReference) secureConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDigest() {
		return digestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDigest_OutputSize() {
		return (EAttribute) digestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricBlockCipher() {
		return symmetricBlockCipherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymmetricBlockCipher_Mode() {
		return (EAttribute) symmetricBlockCipherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymmetricBlockCipher_Padding() {
		return (EAttribute) symmetricBlockCipherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymmetricBlockCipher_KeySize() {
		return (EAttribute) symmetricBlockCipherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Value() {
		return (EAttribute) importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_Name() {
		return (EAttribute) algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_Description() {
		return (EAttribute) algorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_Security() {
		return (EAttribute) algorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_Performance() {
		return (EAttribute) algorithmEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Imports() {
		return (EReference) algorithmEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Includes() {
		return (EReference) algorithmEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSECURITY() {
		return securityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPERFORMANCE() {
		return performanceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoAPIConfigFactory getCryptoAPIConfigFactory() {
		return (CryptoAPIConfigFactory) getEFactoryInstance();
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
		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__PACKAGE);
		createEAttribute(taskEClass, TASK__DESCRIPTION);
		createEReference(taskEClass, TASK__ALGORITHMS);

		codeConfigurationEClass = createEClass(CODE_CONFIGURATION);
		createEAttribute(codeConfigurationEClass, CODE_CONFIGURATION__KEYSTORE);
		createEAttribute(codeConfigurationEClass, CODE_CONFIGURATION__SERVER);
		createEAttribute(codeConfigurationEClass, CODE_CONFIGURATION__KEYSTORE_PASSWORD);

		keyDerivationAlgorithmEClass = createEClass(KEY_DERIVATION_ALGORITHM);
		createEAttribute(keyDerivationAlgorithmEClass, KEY_DERIVATION_ALGORITHM__ITERATIONS);
		createEAttribute(keyDerivationAlgorithmEClass, KEY_DERIVATION_ALGORITHM__OUTPUT_SIZE);

		secureConnectionEClass = createEClass(SECURE_CONNECTION);
		createEReference(secureConnectionEClass, SECURE_CONNECTION__CONFIG);

		digestEClass = createEClass(DIGEST);
		createEAttribute(digestEClass, DIGEST__OUTPUT_SIZE);

		symmetricBlockCipherEClass = createEClass(SYMMETRIC_BLOCK_CIPHER);
		createEAttribute(symmetricBlockCipherEClass, SYMMETRIC_BLOCK_CIPHER__MODE);
		createEAttribute(symmetricBlockCipherEClass, SYMMETRIC_BLOCK_CIPHER__PADDING);
		createEAttribute(symmetricBlockCipherEClass, SYMMETRIC_BLOCK_CIPHER__KEY_SIZE);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__VALUE);

		algorithmEClass = createEClass(ALGORITHM);
		createEAttribute(algorithmEClass, ALGORITHM__NAME);
		createEAttribute(algorithmEClass, ALGORITHM__DESCRIPTION);
		createEAttribute(algorithmEClass, ALGORITHM__SECURITY);
		createEAttribute(algorithmEClass, ALGORITHM__PERFORMANCE);
		createEReference(algorithmEClass, ALGORITHM__IMPORTS);
		createEReference(algorithmEClass, ALGORITHM__INCLUDES);

		// Create enums
		securityEEnum = createEEnum(SECURITY);
		performanceEEnum = createEEnum(PERFORMANCE);
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
		keyDerivationAlgorithmEClass.getESuperTypes().add(this.getAlgorithm());
		secureConnectionEClass.getESuperTypes().add(this.getTask());
		digestEClass.getESuperTypes().add(this.getAlgorithm());
		symmetricBlockCipherEClass.getESuperTypes().add(this.getAlgorithm());

		// Initialize classes, features, and operations; add parameters
		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Package(), ecorePackage.getEString(), "package", null, 0, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Description(), ecorePackage.getEString(), "description", null, 0, 1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Algorithms(), this.getAlgorithm(), null, "algorithms", null, 0, -1, Task.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeConfigurationEClass, CodeConfiguration.class, "CodeConfiguration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeConfiguration_Keystore(), ecorePackage.getEString(), "keystore", null, 0, 1,
				CodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeConfiguration_Server(), ecorePackage.getEBoolean(), "server", null, 0, 1,
				CodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeConfiguration_KeystorePassword(), ecorePackage.getEString(), "keystorePassword", null, 0,
				1, CodeConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keyDerivationAlgorithmEClass, KeyDerivationAlgorithm.class, "KeyDerivationAlgorithm", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeyDerivationAlgorithm_Iterations(), ecorePackage.getEString(), "iterations", null, 0, 1,
				KeyDerivationAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKeyDerivationAlgorithm_OutputSize(), ecorePackage.getEString(), "outputSize", null, 0, 1,
				KeyDerivationAlgorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secureConnectionEClass, SecureConnection.class, "SecureConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecureConnection_Config(), this.getCodeConfiguration(), null, "config", null, 1, 1,
				SecureConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(digestEClass, Digest.class, "Digest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDigest_OutputSize(), ecorePackage.getEInt(), "outputSize", null, 0, 1, Digest.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(symmetricBlockCipherEClass, SymmetricBlockCipher.class, "SymmetricBlockCipher", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymmetricBlockCipher_Mode(), ecorePackage.getEString(), "mode", null, 0, 1,
				SymmetricBlockCipher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymmetricBlockCipher_Padding(), ecorePackage.getEString(), "padding", null, 0, 1,
				SymmetricBlockCipher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymmetricBlockCipher_KeySize(), ecorePackage.getEInt(), "keySize", null, 0, 1,
				SymmetricBlockCipher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_Value(), ecorePackage.getEString(), "value", null, 0, 1, Import.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(algorithmEClass, Algorithm.class, "Algorithm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Algorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithm_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithm_Security(), this.getSECURITY(), "security", null, 0, 1, Algorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAlgorithm_Performance(), this.getPERFORMANCE(), "performance", null, 0, 1, Algorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Imports(), this.getImport(), null, "imports", null, 0, -1, Algorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Includes(), this.getAlgorithm(), null, "includes", null, 0, -1, Algorithm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(securityEEnum, CryptoAPIConfig.SECURITY.class, "SECURITY");
		addEEnumLiteral(securityEEnum, CryptoAPIConfig.SECURITY.BROKEN);
		addEEnumLiteral(securityEEnum, CryptoAPIConfig.SECURITY.WEAK);
		addEEnumLiteral(securityEEnum, CryptoAPIConfig.SECURITY.MEDIUM);
		addEEnumLiteral(securityEEnum, CryptoAPIConfig.SECURITY.STRONG);

		initEEnum(performanceEEnum, CryptoAPIConfig.PERFORMANCE.class, "PERFORMANCE");
		addEEnumLiteral(performanceEEnum, CryptoAPIConfig.PERFORMANCE.VERY_SLOW);
		addEEnumLiteral(performanceEEnum, CryptoAPIConfig.PERFORMANCE.SLOW);
		addEEnumLiteral(performanceEEnum, CryptoAPIConfig.PERFORMANCE.MEDIUM);
		addEEnumLiteral(performanceEEnum, CryptoAPIConfig.PERFORMANCE.STRONG);

		// Create resource
		createResource(eNS_URI);
	}

} //CryptoAPIConfigPackageImpl
