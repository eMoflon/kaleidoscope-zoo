/**
 */
package KitchenToGridLanguage;

import GridLanguage.Group;

import KitchenLanguage.ItemSocket;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Socket To Group Corr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KitchenToGridLanguage.SocketToGroupCorr#getSource <em>Source</em>}</li>
 *   <li>{@link KitchenToGridLanguage.SocketToGroupCorr#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage#getSocketToGroupCorr()
 * @model
 * @generated
 */
public interface SocketToGroupCorr extends EObject, AbstractCorrespondence {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Group)
	 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage#getSocketToGroupCorr_Source()
	 * @model required="true"
	 * @generated
	 */
	Group getSource();

	/**
	 * Sets the value of the '{@link KitchenToGridLanguage.SocketToGroupCorr#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Group value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ItemSocket)
	 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage#getSocketToGroupCorr_Target()
	 * @model required="true"
	 * @generated
	 */
	ItemSocket getTarget();

	/**
	 * Sets the value of the '{@link KitchenToGridLanguage.SocketToGroupCorr#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ItemSocket value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SocketToGroupCorr
