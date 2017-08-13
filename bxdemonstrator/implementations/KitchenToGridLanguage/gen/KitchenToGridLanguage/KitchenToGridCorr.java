/**
 */
package KitchenToGridLanguage;

import GridLanguage.Grid;

import KitchenLanguage.Kitchen;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kitchen To Grid Corr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KitchenToGridLanguage.KitchenToGridCorr#getSource <em>Source</em>}</li>
 *   <li>{@link KitchenToGridLanguage.KitchenToGridCorr#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage#getKitchenToGridCorr()
 * @model
 * @generated
 */
public interface KitchenToGridCorr extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Grid)
	 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage#getKitchenToGridCorr_Source()
	 * @model required="true"
	 * @generated
	 */
	Grid getSource();

	/**
	 * Sets the value of the '{@link KitchenToGridLanguage.KitchenToGridCorr#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Grid value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Kitchen)
	 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage#getKitchenToGridCorr_Target()
	 * @model required="true"
	 * @generated
	 */
	Kitchen getTarget();

	/**
	 * Sets the value of the '{@link KitchenToGridLanguage.KitchenToGridCorr#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Kitchen value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // KitchenToGridCorr
