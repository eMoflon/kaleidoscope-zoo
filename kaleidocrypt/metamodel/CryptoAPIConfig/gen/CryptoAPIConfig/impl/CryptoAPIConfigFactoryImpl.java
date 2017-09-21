/**
 */
package CryptoAPIConfig.impl;

import CryptoAPIConfig.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CryptoAPIConfigFactoryImpl extends EFactoryImpl implements CryptoAPIConfigFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CryptoAPIConfigFactory init() {
		try {
			CryptoAPIConfigFactory theCryptoAPIConfigFactory = (CryptoAPIConfigFactory) EPackage.Registry.INSTANCE
					.getEFactory(CryptoAPIConfigPackage.eNS_URI);
			if (theCryptoAPIConfigFactory != null) {
				return theCryptoAPIConfigFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CryptoAPIConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoAPIConfigFactoryImpl() {
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
		case CryptoAPIConfigPackage.TASK:
			return createTask();
		case CryptoAPIConfigPackage.CODE_CONFIGURATION:
			return createCodeConfiguration();
		case CryptoAPIConfigPackage.KEY_DERIVATION_ALGORITHM:
			return createKeyDerivationAlgorithm();
		case CryptoAPIConfigPackage.SECURE_CONNECTION:
			return createSecureConnection();
		case CryptoAPIConfigPackage.DIGEST:
			return createDigest();
		case CryptoAPIConfigPackage.SYMMETRIC_BLOCK_CIPHER:
			return createSymmetricBlockCipher();
		case CryptoAPIConfigPackage.IMPORT:
			return createImport();
		case CryptoAPIConfigPackage.ALGORITHM:
			return createAlgorithm();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CryptoAPIConfigPackage.SECURITY:
			return createSECURITYFromString(eDataType, initialValue);
		case CryptoAPIConfigPackage.PERFORMANCE:
			return createPERFORMANCEFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CryptoAPIConfigPackage.SECURITY:
			return convertSECURITYToString(eDataType, instanceValue);
		case CryptoAPIConfigPackage.PERFORMANCE:
			return convertPERFORMANCEToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeConfiguration createCodeConfiguration() {
		CodeConfigurationImpl codeConfiguration = new CodeConfigurationImpl();
		return codeConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDerivationAlgorithm createKeyDerivationAlgorithm() {
		KeyDerivationAlgorithmImpl keyDerivationAlgorithm = new KeyDerivationAlgorithmImpl();
		return keyDerivationAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecureConnection createSecureConnection() {
		SecureConnectionImpl secureConnection = new SecureConnectionImpl();
		return secureConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Digest createDigest() {
		DigestImpl digest = new DigestImpl();
		return digest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricBlockCipher createSymmetricBlockCipher() {
		SymmetricBlockCipherImpl symmetricBlockCipher = new SymmetricBlockCipherImpl();
		return symmetricBlockCipher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm createAlgorithm() {
		AlgorithmImpl algorithm = new AlgorithmImpl();
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SECURITY createSECURITYFromString(EDataType eDataType, String initialValue) {
		SECURITY result = SECURITY.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSECURITYToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PERFORMANCE createPERFORMANCEFromString(EDataType eDataType, String initialValue) {
		PERFORMANCE result = PERFORMANCE.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPERFORMANCEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoAPIConfigPackage getCryptoAPIConfigPackage() {
		return (CryptoAPIConfigPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CryptoAPIConfigPackage getPackage() {
		return CryptoAPIConfigPackage.eINSTANCE;
	}

} //CryptoAPIConfigFactoryImpl
