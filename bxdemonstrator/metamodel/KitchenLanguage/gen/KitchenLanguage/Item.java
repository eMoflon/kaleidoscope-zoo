/**
 */
package KitchenLanguage;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KitchenLanguage.Item#getXPos <em>XPos</em>}</li>
 *   <li>{@link KitchenLanguage.Item#getYPos <em>YPos</em>}</li>
 * </ul>
 * </p>
 *
 * @see KitchenLanguage.KitchenLanguagePackage#getItem()
 * @model abstract="true"
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>XPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPos</em>' attribute.
	 * @see #setXPos(double)
	 * @see KitchenLanguage.KitchenLanguagePackage#getItem_XPos()
	 * @model
	 * @generated
	 */
	double getXPos();

	/**
	 * Sets the value of the '{@link KitchenLanguage.Item#getXPos <em>XPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPos</em>' attribute.
	 * @see #getXPos()
	 * @generated
	 */
	void setXPos(double value);

	/**
	 * Returns the value of the '<em><b>YPos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPos</em>' attribute.
	 * @see #setYPos(double)
	 * @see KitchenLanguage.KitchenLanguagePackage#getItem_YPos()
	 * @model
	 * @generated
	 */
	double getYPos();

	/**
	 * Sets the value of the '{@link KitchenLanguage.Item#getYPos <em>YPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPos</em>' attribute.
	 * @see #getYPos()
	 * @generated
	 */
	void setYPos(double value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Item
