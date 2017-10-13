/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoConfigToJava.Rules.*;

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
		case RulesPackage.SECURE_PASSWORD_TASK:
			return createSecurePasswordTask();
		case RulesPackage.PERFORM_GET_KEY_METHOD:
			return createPerformGetKeyMethod();
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK:
			return createSymmetricEncryptionTask();
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT:
			return createSymmetricBlockCipherImportToImport();
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT:
			return createIgnoreMethodInvocationArgument();
		case RulesPackage.IGNORE_OPAQUE_METHOD:
			return createIgnoreOpaqueMethod();
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT:
			return createKeyDerivationAlgorithmImportToImport();
		case RulesPackage.IGNORE_PARAMETER_RULE:
			return createIgnoreParameterRule();
		case RulesPackage.PASSWORD_BASED_ENCRYPTION:
			return createPasswordBasedEncryption();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurePasswordTask createSecurePasswordTask() {
		SecurePasswordTaskImpl securePasswordTask = new SecurePasswordTaskImpl();
		return securePasswordTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformGetKeyMethod createPerformGetKeyMethod() {
		PerformGetKeyMethodImpl performGetKeyMethod = new PerformGetKeyMethodImpl();
		return performGetKeyMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricEncryptionTask createSymmetricEncryptionTask() {
		SymmetricEncryptionTaskImpl symmetricEncryptionTask = new SymmetricEncryptionTaskImpl();
		return symmetricEncryptionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricBlockCipherImportToImport createSymmetricBlockCipherImportToImport() {
		SymmetricBlockCipherImportToImportImpl symmetricBlockCipherImportToImport = new SymmetricBlockCipherImportToImportImpl();
		return symmetricBlockCipherImportToImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreMethodInvocationArgument createIgnoreMethodInvocationArgument() {
		IgnoreMethodInvocationArgumentImpl ignoreMethodInvocationArgument = new IgnoreMethodInvocationArgumentImpl();
		return ignoreMethodInvocationArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreOpaqueMethod createIgnoreOpaqueMethod() {
		IgnoreOpaqueMethodImpl ignoreOpaqueMethod = new IgnoreOpaqueMethodImpl();
		return ignoreOpaqueMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDerivationAlgorithmImportToImport createKeyDerivationAlgorithmImportToImport() {
		KeyDerivationAlgorithmImportToImportImpl keyDerivationAlgorithmImportToImport = new KeyDerivationAlgorithmImportToImportImpl();
		return keyDerivationAlgorithmImportToImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IgnoreParameterRule createIgnoreParameterRule() {
		IgnoreParameterRuleImpl ignoreParameterRule = new IgnoreParameterRuleImpl();
		return ignoreParameterRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordBasedEncryption createPasswordBasedEncryption() {
		PasswordBasedEncryptionImpl passwordBasedEncryption = new PasswordBasedEncryptionImpl();
		return passwordBasedEncryption;
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
