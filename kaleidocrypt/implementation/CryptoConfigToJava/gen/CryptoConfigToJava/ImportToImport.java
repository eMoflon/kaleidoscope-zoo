/**
 */
package CryptoConfigToJava;

import CryptoAPIConfig.Import;

import SimpleJava.JavaImport;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import To Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CryptoConfigToJava.ImportToImport#getSource <em>Source</em>}</li>
 *   <li>{@link CryptoConfigToJava.ImportToImport#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getImportToImport()
 * @model
 * @generated
 */
public interface ImportToImport extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Import)
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getImportToImport_Source()
	 * @model required="true"
	 * @generated
	 */
	Import getSource();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.ImportToImport#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Import value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(JavaImport)
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#getImportToImport_Target()
	 * @model required="true"
	 * @generated
	 */
	JavaImport getTarget();

	/**
	 * Sets the value of the '{@link CryptoConfigToJava.ImportToImport#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JavaImport value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ImportToImport
