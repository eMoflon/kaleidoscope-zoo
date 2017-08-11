/**
 */
package GridLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GridLanguage.Grid#getBlockSize <em>Block Size</em>}</li>
 *   <li>{@link GridLanguage.Grid#getGroups <em>Groups</em>}</li>
 *   <li>{@link GridLanguage.Grid#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see GridLanguage.GridLanguagePackage#getGrid()
 * @model
 * @generated
 */
public interface Grid extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Size</em>' attribute.
	 * @see #setBlockSize(double)
	 * @see GridLanguage.GridLanguagePackage#getGrid_BlockSize()
	 * @model
	 * @generated
	 */
	double getBlockSize();

	/**
	 * Sets the value of the '{@link GridLanguage.Grid#getBlockSize <em>Block Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Size</em>' attribute.
	 * @see #getBlockSize()
	 * @generated
	 */
	void setBlockSize(double value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link GridLanguage.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see GridLanguage.GridLanguagePackage#getGrid_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link GridLanguage.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see GridLanguage.GridLanguagePackage#getGrid_Blocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlocks();
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Grid
