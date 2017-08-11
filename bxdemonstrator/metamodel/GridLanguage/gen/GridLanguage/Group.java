/**
 */
package GridLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GridLanguage.Group#getOccupies <em>Occupies</em>}</li>
 *   <li>{@link GridLanguage.Group#getFillColor <em>Fill Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see GridLanguage.GridLanguagePackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Occupies</b></em>' reference list.
	 * The list contents are of type {@link GridLanguage.Block}.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getIsOccupiedBy <em>Is Occupied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupies</em>' reference list.
	 * @see GridLanguage.GridLanguagePackage#getGroup_Occupies()
	 * @see GridLanguage.Block#getIsOccupiedBy
	 * @model opposite="isOccupiedBy" required="true"
	 * @generated
	 */
	EList<Block> getOccupies();

	/**
	 * Returns the value of the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Color</em>' attribute.
	 * @see #setFillColor(String)
	 * @see GridLanguage.GridLanguagePackage#getGroup_FillColor()
	 * @model
	 * @generated
	 */
	String getFillColor();

	/**
	 * Sets the value of the '{@link GridLanguage.Group#getFillColor <em>Fill Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill Color</em>' attribute.
	 * @see #getFillColor()
	 * @generated
	 */
	void setFillColor(String value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Group
