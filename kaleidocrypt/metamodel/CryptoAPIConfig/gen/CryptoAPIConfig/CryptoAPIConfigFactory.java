/**
 */
package CryptoAPIConfig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see CryptoAPIConfig.CryptoAPIConfigPackage
 * @generated
 */
public interface CryptoAPIConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CryptoAPIConfigFactory eINSTANCE = CryptoAPIConfig.impl.CryptoAPIConfigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Code Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Configuration</em>'.
	 * @generated
	 */
	CodeConfiguration createCodeConfiguration();

	/**
	 * Returns a new object of class '<em>Key Derivation Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Derivation Algorithm</em>'.
	 * @generated
	 */
	KeyDerivationAlgorithm createKeyDerivationAlgorithm();

	/**
	 * Returns a new object of class '<em>Secure Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secure Connection</em>'.
	 * @generated
	 */
	SecureConnection createSecureConnection();

	/**
	 * Returns a new object of class '<em>Digest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digest</em>'.
	 * @generated
	 */
	Digest createDigest();

	/**
	 * Returns a new object of class '<em>Symmetric Block Cipher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Symmetric Block Cipher</em>'.
	 * @generated
	 */
	SymmetricBlockCipher createSymmetricBlockCipher();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algorithm</em>'.
	 * @generated
	 */
	Algorithm createAlgorithm();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CryptoAPIConfigPackage getCryptoAPIConfigPackage();

} //CryptoAPIConfigFactory
