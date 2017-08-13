/**
 */
package GridLanguage;

import org.eclipse.emf.ecore.EObject;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GridLanguage.Block#getXIndex <em>XIndex</em>}</li>
 *   <li>{@link GridLanguage.Block#getYIndex <em>YIndex</em>}</li>
 *   <li>{@link GridLanguage.Block#getS <em>S</em>}</li>
 *   <li>{@link GridLanguage.Block#getN <em>N</em>}</li>
 *   <li>{@link GridLanguage.Block#getE <em>E</em>}</li>
 *   <li>{@link GridLanguage.Block#getW <em>W</em>}</li>
 *   <li>{@link GridLanguage.Block#getNe <em>Ne</em>}</li>
 *   <li>{@link GridLanguage.Block#getSw <em>Sw</em>}</li>
 *   <li>{@link GridLanguage.Block#getNw <em>Nw</em>}</li>
 *   <li>{@link GridLanguage.Block#getSe <em>Se</em>}</li>
 *   <li>{@link GridLanguage.Block#getIsOccupiedBy <em>Is Occupied By</em>}</li>
 * </ul>
 * </p>
 *
 * @see GridLanguage.GridLanguagePackage#getBlock()
 * @model
 * @generated
 */
public interface Block extends EObject {
	/**
	 * Returns the value of the '<em><b>XIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XIndex</em>' attribute.
	 * @see #setXIndex(int)
	 * @see GridLanguage.GridLanguagePackage#getBlock_XIndex()
	 * @model
	 * @generated
	 */
	int getXIndex();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getXIndex <em>XIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XIndex</em>' attribute.
	 * @see #getXIndex()
	 * @generated
	 */
	void setXIndex(int value);

	/**
	 * Returns the value of the '<em><b>YIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YIndex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YIndex</em>' attribute.
	 * @see #setYIndex(int)
	 * @see GridLanguage.GridLanguagePackage#getBlock_YIndex()
	 * @model
	 * @generated
	 */
	int getYIndex();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getYIndex <em>YIndex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YIndex</em>' attribute.
	 * @see #getYIndex()
	 * @generated
	 */
	void setYIndex(int value);

	/**
	 * Returns the value of the '<em><b>S</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' reference.
	 * @see #setS(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_S()
	 * @see GridLanguage.Block#getN
	 * @model opposite="n"
	 * @generated
	 */
	Block getS();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getS <em>S</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' reference.
	 * @see #getS()
	 * @generated
	 */
	void setS(Block value);

	/**
	 * Returns the value of the '<em><b>N</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>N</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' reference.
	 * @see #setN(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_N()
	 * @see GridLanguage.Block#getS
	 * @model opposite="s"
	 * @generated
	 */
	Block getN();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getN <em>N</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' reference.
	 * @see #getN()
	 * @generated
	 */
	void setN(Block value);

	/**
	 * Returns the value of the '<em><b>E</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>E</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>E</em>' reference.
	 * @see #setE(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_E()
	 * @see GridLanguage.Block#getW
	 * @model opposite="w"
	 * @generated
	 */
	Block getE();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getE <em>E</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>E</em>' reference.
	 * @see #getE()
	 * @generated
	 */
	void setE(Block value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' reference.
	 * @see #setW(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_W()
	 * @see GridLanguage.Block#getE
	 * @model opposite="e"
	 * @generated
	 */
	Block getW();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getW <em>W</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' reference.
	 * @see #getW()
	 * @generated
	 */
	void setW(Block value);

	/**
	 * Returns the value of the '<em><b>Ne</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getSw <em>Sw</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ne</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ne</em>' reference.
	 * @see #setNe(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_Ne()
	 * @see GridLanguage.Block#getSw
	 * @model opposite="sw"
	 * @generated
	 */
	Block getNe();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getNe <em>Ne</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ne</em>' reference.
	 * @see #getNe()
	 * @generated
	 */
	void setNe(Block value);

	/**
	 * Returns the value of the '<em><b>Sw</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sw</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sw</em>' reference.
	 * @see #setSw(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_Sw()
	 * @see GridLanguage.Block#getNe
	 * @model opposite="ne"
	 * @generated
	 */
	Block getSw();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getSw <em>Sw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sw</em>' reference.
	 * @see #getSw()
	 * @generated
	 */
	void setSw(Block value);

	/**
	 * Returns the value of the '<em><b>Nw</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getSe <em>Se</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nw</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nw</em>' reference.
	 * @see #setNw(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_Nw()
	 * @see GridLanguage.Block#getSe
	 * @model opposite="se"
	 * @generated
	 */
	Block getNw();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getNw <em>Nw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nw</em>' reference.
	 * @see #getNw()
	 * @generated
	 */
	void setNw(Block value);

	/**
	 * Returns the value of the '<em><b>Se</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Block#getNw <em>Nw</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Se</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Se</em>' reference.
	 * @see #setSe(Block)
	 * @see GridLanguage.GridLanguagePackage#getBlock_Se()
	 * @see GridLanguage.Block#getNw
	 * @model opposite="nw"
	 * @generated
	 */
	Block getSe();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getSe <em>Se</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Se</em>' reference.
	 * @see #getSe()
	 * @generated
	 */
	void setSe(Block value);

	/**
	 * Returns the value of the '<em><b>Is Occupied By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GridLanguage.Group#getOccupies <em>Occupies</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Occupied By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Occupied By</em>' reference.
	 * @see #setIsOccupiedBy(Group)
	 * @see GridLanguage.GridLanguagePackage#getBlock_IsOccupiedBy()
	 * @see GridLanguage.Group#getOccupies
	 * @model opposite="occupies"
	 * @generated
	 */
	Group getIsOccupiedBy();

	/**
	 * Sets the value of the '{@link GridLanguage.Block#getIsOccupiedBy <em>Is Occupied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Occupied By</em>' reference.
	 * @see #getIsOccupiedBy()
	 * @generated
	 */
	void setIsOccupiedBy(Group value);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // Block
