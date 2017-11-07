/**
 */
package CryptoConfigToJava.impl;

import CryptoConfigToJava.*;

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
public class CryptoConfigToJavaFactoryImpl extends EFactoryImpl implements CryptoConfigToJavaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CryptoConfigToJavaFactory init() {
		try {
			CryptoConfigToJavaFactory theCryptoConfigToJavaFactory = (CryptoConfigToJavaFactory) EPackage.Registry.INSTANCE
					.getEFactory(CryptoConfigToJavaPackage.eNS_URI);
			if (theCryptoConfigToJavaFactory != null) {
				return theCryptoConfigToJavaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CryptoConfigToJavaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoConfigToJavaFactoryImpl() {
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
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU:
			return createKeyDerivationAlgorithmToJcu();
		case CryptoConfigToJavaPackage.ALGORITHM_TO_JAVA_COMPILATION_UNIT:
			return createAlgorithmToJavaCompilationUnit();
		case CryptoConfigToJavaPackage.TASK_TO_JAVA_PACKAGE:
			return createTaskToJavaPackage();
		case CryptoConfigToJavaPackage.ALGORITHM_TO_JCU:
			return createAlgorithmToJcu();
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD:
			return createSymmetricBlockCipherToMethod();
		case CryptoConfigToJavaPackage.IMPORT_TO_IMPORT:
			return createImportToImport();
		case CryptoConfigToJavaPackage.TASK_TO_JAVA_COMPILATION_UNIT:
			return createTaskToJavaCompilationUnit();
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_METHOD:
			return createKeyDerivationAlgorithmToMethod();
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_JCU:
			return createSymmetricBlockCipherToJcu();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDerivationAlgorithmToJcu createKeyDerivationAlgorithmToJcu() {
		KeyDerivationAlgorithmToJcuImpl keyDerivationAlgorithmToJcu = new KeyDerivationAlgorithmToJcuImpl();
		return keyDerivationAlgorithmToJcu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmToJavaCompilationUnit createAlgorithmToJavaCompilationUnit() {
		AlgorithmToJavaCompilationUnitImpl algorithmToJavaCompilationUnit = new AlgorithmToJavaCompilationUnitImpl();
		return algorithmToJavaCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskToJavaPackage createTaskToJavaPackage() {
		TaskToJavaPackageImpl taskToJavaPackage = new TaskToJavaPackageImpl();
		return taskToJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmToJcu createAlgorithmToJcu() {
		AlgorithmToJcuImpl algorithmToJcu = new AlgorithmToJcuImpl();
		return algorithmToJcu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricBlockCipherToMethod createSymmetricBlockCipherToMethod() {
		SymmetricBlockCipherToMethodImpl symmetricBlockCipherToMethod = new SymmetricBlockCipherToMethodImpl();
		return symmetricBlockCipherToMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportToImport createImportToImport() {
		ImportToImportImpl importToImport = new ImportToImportImpl();
		return importToImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskToJavaCompilationUnit createTaskToJavaCompilationUnit() {
		TaskToJavaCompilationUnitImpl taskToJavaCompilationUnit = new TaskToJavaCompilationUnitImpl();
		return taskToJavaCompilationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDerivationAlgorithmToMethod createKeyDerivationAlgorithmToMethod() {
		KeyDerivationAlgorithmToMethodImpl keyDerivationAlgorithmToMethod = new KeyDerivationAlgorithmToMethodImpl();
		return keyDerivationAlgorithmToMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricBlockCipherToJcu createSymmetricBlockCipherToJcu() {
		SymmetricBlockCipherToJcuImpl symmetricBlockCipherToJcu = new SymmetricBlockCipherToJcuImpl();
		return symmetricBlockCipherToJcu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoConfigToJavaPackage getCryptoConfigToJavaPackage() {
		return (CryptoConfigToJavaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CryptoConfigToJavaPackage getPackage() {
		return CryptoConfigToJavaPackage.eINSTANCE;
	}

} //CryptoConfigToJavaFactoryImpl
