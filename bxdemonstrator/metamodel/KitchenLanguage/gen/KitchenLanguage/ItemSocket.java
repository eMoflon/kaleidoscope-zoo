/**
 */
package KitchenLanguage;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Socket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KitchenLanguage.ItemSocket#getId <em>Id</em>}</li>
 *   <li>{@link KitchenLanguage.ItemSocket#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see KitchenLanguage.KitchenLanguagePackage#getItemSocket()
 * @model
 * @generated
 */
public interface ItemSocket extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see KitchenLanguage.KitchenLanguagePackage#getItemSocket_Id()
	 * @model default="" id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link KitchenLanguage.ItemSocket#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(Item)
	 * @see KitchenLanguage.KitchenLanguagePackage#getItemSocket_Item()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Item getItem();

	/**
	 * Sets the value of the '{@link KitchenLanguage.ItemSocket#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(Item value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // ItemSocket
