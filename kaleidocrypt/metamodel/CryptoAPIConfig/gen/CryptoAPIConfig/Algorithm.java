/**
 */
package CryptoAPIConfig;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoAPIConfig.Algorithm#getName <em>Name</em>}</li>
 *   <li>{@link CryptoAPIConfig.Algorithm#getDescription <em>Description</em>}</li>
 *   <li>{@link CryptoAPIConfig.Algorithm#getSecurity <em>Security</em>}</li>
 *   <li>{@link CryptoAPIConfig.Algorithm#getPerformance <em>Performance</em>}</li>
 *   <li>{@link CryptoAPIConfig.Algorithm#getImports <em>Imports</em>}</li>
 *   <li>{@link CryptoAPIConfig.Algorithm#getIncludes <em>Includes</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getAlgorithm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.Algorithm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getAlgorithm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.Algorithm#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * The literals are from the enumeration {@link CryptoAPIConfig.SECURITY}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see CryptoAPIConfig.SECURITY
	 * @see #setSecurity(SECURITY)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getAlgorithm_Security()
	 * @model
	 * @generated
	 */
	SECURITY getSecurity();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.Algorithm#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see CryptoAPIConfig.SECURITY
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(SECURITY value);

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' attribute.
	 * The literals are from the enumeration {@link CryptoAPIConfig.PERFORMANCE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Performance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' attribute.
	 * @see CryptoAPIConfig.PERFORMANCE
	 * @see #setPerformance(PERFORMANCE)
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getAlgorithm_Performance()
	 * @model
	 * @generated
	 */
	PERFORMANCE getPerformance();

	/**
	 * Sets the value of the '{@link CryptoAPIConfig.Algorithm#getPerformance <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' attribute.
	 * @see CryptoAPIConfig.PERFORMANCE
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(PERFORMANCE value);

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoAPIConfig.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getAlgorithm_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Includes</b></em>' containment reference list.
	 * The list contents are of type {@link CryptoAPIConfig.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes</em>' containment reference list.
	 * @see CryptoAPIConfig.CryptoAPIConfigPackage#getAlgorithm_Includes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Algorithm> getIncludes();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Algorithm
