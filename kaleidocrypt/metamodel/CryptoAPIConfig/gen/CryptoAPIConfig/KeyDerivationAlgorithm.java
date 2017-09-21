/**
 */
package CryptoAPIConfig;

// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Derivation Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoAPIConfig.KeyDerivationAlgorithm#getIterations <em>Iterations</em>}</li>
 *   <li>{@link CryptoAPIConfig.KeyDerivationAlgorithm#getOutputSize <em>Output Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getKeyDerivationAlgorithm()
 * @model
 * @generated
 */
public interface KeyDerivationAlgorithm extends Algorithm {
	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterations</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getKeyDerivationAlgorithm_Iterations()
	 * @model
	 * @generated
	 */
	String getIterations();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.KeyDerivationAlgorithm#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(String value);

	/**
	 * Returns the value of the '<em><b>Output Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Size</em>' attribute.
	 * @see #setOutputSize(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getKeyDerivationAlgorithm_OutputSize()
	 * @model
	 * @generated
	 */
	String getOutputSize();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.KeyDerivationAlgorithm#getOutputSize <em>Output Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Size</em>' attribute.
	 * @see #getOutputSize()
	 * @generated
	 */
	void setOutputSize(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // KeyDerivationAlgorithm
