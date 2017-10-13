/**
 */
package CryptoConfigToJava.Rules;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CryptoConfigToJava.Rules.RulesPackage
 * @generated
 */
public interface RulesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RulesFactory eINSTANCE = CryptoConfigToJava.Rules.impl.RulesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Secure Password Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Password Task</em>'.
	 * @generated
	 */
	SecurePasswordTask createSecurePasswordTask();

	/**
	 * Returns a new object of class '<em>Perform Get Key Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Get Key Method</em>'.
	 * @generated
	 */
	PerformGetKeyMethod createPerformGetKeyMethod();

	/**
	 * Returns a new object of class '<em>Symmetric Encryption Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symmetric Encryption Task</em>'.
	 * @generated
	 */
	SymmetricEncryptionTask createSymmetricEncryptionTask();

	/**
	 * Returns a new object of class '<em>Symmetric Block Cipher Import To Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symmetric Block Cipher Import To Import</em>'.
	 * @generated
	 */
	SymmetricBlockCipherImportToImport createSymmetricBlockCipherImportToImport();

	/**
	 * Returns a new object of class '<em>Ignore Method Invocation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Method Invocation Argument</em>'.
	 * @generated
	 */
	IgnoreMethodInvocationArgument createIgnoreMethodInvocationArgument();

	/**
	 * Returns a new object of class '<em>Ignore Opaque Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Opaque Method</em>'.
	 * @generated
	 */
	IgnoreOpaqueMethod createIgnoreOpaqueMethod();

	/**
	 * Returns a new object of class '<em>Key Derivation Algorithm Import To Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Derivation Algorithm Import To Import</em>'.
	 * @generated
	 */
	KeyDerivationAlgorithmImportToImport createKeyDerivationAlgorithmImportToImport();

	/**
	 * Returns a new object of class '<em>Ignore Parameter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ignore Parameter Rule</em>'.
	 * @generated
	 */
	IgnoreParameterRule createIgnoreParameterRule();

	/**
	 * Returns a new object of class '<em>Password Based Encryption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Password Based Encryption</em>'.
	 * @generated
	 */
	PasswordBasedEncryption createPasswordBasedEncryption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RulesPackage getRulesPackage();

} //RulesFactory
