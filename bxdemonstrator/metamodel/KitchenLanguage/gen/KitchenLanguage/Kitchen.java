/**
 */
package KitchenLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KitchenLanguage.Kitchen#getXSize <em>XSize</em>}</li>
 *   <li>{@link KitchenLanguage.Kitchen#getYSize <em>YSize</em>}</li>
 *   <li>{@link KitchenLanguage.Kitchen#getItemSockets <em>Item Sockets</em>}</li>
 * </ul>
 * </p>
 *
 * @see KitchenLanguage.KitchenLanguagePackage#getKitchen()
 * @model
 * @generated
 */
public interface Kitchen extends EObject {
	/**
	 * Returns the value of the '<em><b>XSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSize</em>' attribute.
	 * @see #setXSize(double)
	 * @see KitchenLanguage.KitchenLanguagePackage#getKitchen_XSize()
	 * @model
	 * @generated
	 */
	double getXSize();

	/**
	 * Sets the value of the '{@link KitchenLanguage.Kitchen#getXSize <em>XSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XSize</em>' attribute.
	 * @see #getXSize()
	 * @generated
	 */
	void setXSize(double value);

	/**
	 * Returns the value of the '<em><b>YSize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YSize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YSize</em>' attribute.
	 * @see #setYSize(double)
	 * @see KitchenLanguage.KitchenLanguagePackage#getKitchen_YSize()
	 * @model
	 * @generated
	 */
	double getYSize();

	/**
	 * Sets the value of the '{@link KitchenLanguage.Kitchen#getYSize <em>YSize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YSize</em>' attribute.
	 * @see #getYSize()
	 * @generated
	 */
	void setYSize(double value);

	/**
	 * Returns the value of the '<em><b>Item Sockets</b></em>' containment reference list.
	 * The list contents are of type {@link KitchenLanguage.ItemSocket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item Sockets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Sockets</em>' containment reference list.
	 * @see KitchenLanguage.KitchenLanguagePackage#getKitchen_ItemSockets()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemSocket> getItemSockets();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Kitchen
