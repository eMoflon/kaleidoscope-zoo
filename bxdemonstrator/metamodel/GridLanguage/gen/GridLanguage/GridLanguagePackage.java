/**
 */
package GridLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GridLanguage.GridLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface GridLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GridLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/GridLanguage/model/GridLanguage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GridLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GridLanguagePackage eINSTANCE = GridLanguage.impl.GridLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link GridLanguage.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GridLanguage.impl.GridImpl
	 * @see GridLanguage.impl.GridLanguagePackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 0;

	/**
	 * The feature id for the '<em><b>Block Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__BLOCK_SIZE = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__BLOCKS = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GridLanguage.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GridLanguage.impl.GroupImpl
	 * @see GridLanguage.impl.GridLanguagePackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 1;

	/**
	 * The feature id for the '<em><b>Occupies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__OCCUPIES = 0;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FILL_COLOR = 1;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GridLanguage.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GridLanguage.impl.BlockImpl
	 * @see GridLanguage.impl.GridLanguagePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>XIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__XINDEX = 0;

	/**
	 * The feature id for the '<em><b>YIndex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__YINDEX = 1;

	/**
	 * The feature id for the '<em><b>S</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__S = 2;

	/**
	 * The feature id for the '<em><b>N</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__N = 3;

	/**
	 * The feature id for the '<em><b>E</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__E = 4;

	/**
	 * The feature id for the '<em><b>W</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__W = 5;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NE = 6;

	/**
	 * The feature id for the '<em><b>Sw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SW = 7;

	/**
	 * The feature id for the '<em><b>Nw</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NW = 8;

	/**
	 * The feature id for the '<em><b>Se</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__SE = 9;

	/**
	 * The feature id for the '<em><b>Is Occupied By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__IS_OCCUPIED_BY = 10;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link GridLanguage.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see GridLanguage.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link GridLanguage.Grid#getBlockSize <em>Block Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Size</em>'.
	 * @see GridLanguage.Grid#getBlockSize()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_BlockSize();

	/**
	 * Returns the meta object for the containment reference list '{@link GridLanguage.Grid#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see GridLanguage.Grid#getGroups()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link GridLanguage.Grid#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see GridLanguage.Grid#getBlocks()
	 * @see #getGrid()
	 * @generated
	 */
	EReference getGrid_Blocks();

	/**
	 * Returns the meta object for class '{@link GridLanguage.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see GridLanguage.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the reference list '{@link GridLanguage.Group#getOccupies <em>Occupies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Occupies</em>'.
	 * @see GridLanguage.Group#getOccupies()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Occupies();

	/**
	 * Returns the meta object for the attribute '{@link GridLanguage.Group#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see GridLanguage.Group#getFillColor()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_FillColor();

	/**
	 * Returns the meta object for class '{@link GridLanguage.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see GridLanguage.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute '{@link GridLanguage.Block#getXIndex <em>XIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>XIndex</em>'.
	 * @see GridLanguage.Block#getXIndex()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_XIndex();

	/**
	 * Returns the meta object for the attribute '{@link GridLanguage.Block#getYIndex <em>YIndex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>YIndex</em>'.
	 * @see GridLanguage.Block#getYIndex()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_YIndex();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>S</em>'.
	 * @see GridLanguage.Block#getS()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_S();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getN <em>N</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>N</em>'.
	 * @see GridLanguage.Block#getN()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_N();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getE <em>E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>E</em>'.
	 * @see GridLanguage.Block#getE()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_E();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>W</em>'.
	 * @see GridLanguage.Block#getW()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_W();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ne</em>'.
	 * @see GridLanguage.Block#getNe()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ne();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getSw <em>Sw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sw</em>'.
	 * @see GridLanguage.Block#getSw()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Sw();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getNw <em>Nw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Nw</em>'.
	 * @see GridLanguage.Block#getNw()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Nw();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getSe <em>Se</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Se</em>'.
	 * @see GridLanguage.Block#getSe()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Se();

	/**
	 * Returns the meta object for the reference '{@link GridLanguage.Block#getIsOccupiedBy <em>Is Occupied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Occupied By</em>'.
	 * @see GridLanguage.Block#getIsOccupiedBy()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_IsOccupiedBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GridLanguageFactory getGridLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GridLanguage.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GridLanguage.impl.GridImpl
		 * @see GridLanguage.impl.GridLanguagePackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Block Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__BLOCK_SIZE = eINSTANCE.getGrid_BlockSize();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__GROUPS = eINSTANCE.getGrid_Groups();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRID__BLOCKS = eINSTANCE.getGrid_Blocks();

		/**
		 * The meta object literal for the '{@link GridLanguage.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GridLanguage.impl.GroupImpl
		 * @see GridLanguage.impl.GridLanguagePackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Occupies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__OCCUPIES = eINSTANCE.getGroup_Occupies();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__FILL_COLOR = eINSTANCE.getGroup_FillColor();

		/**
		 * The meta object literal for the '{@link GridLanguage.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GridLanguage.impl.BlockImpl
		 * @see GridLanguage.impl.GridLanguagePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>XIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__XINDEX = eINSTANCE.getBlock_XIndex();

		/**
		 * The meta object literal for the '<em><b>YIndex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__YINDEX = eINSTANCE.getBlock_YIndex();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__S = eINSTANCE.getBlock_S();

		/**
		 * The meta object literal for the '<em><b>N</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__N = eINSTANCE.getBlock_N();

		/**
		 * The meta object literal for the '<em><b>E</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__E = eINSTANCE.getBlock_E();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__W = eINSTANCE.getBlock_W();

		/**
		 * The meta object literal for the '<em><b>Ne</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__NE = eINSTANCE.getBlock_Ne();

		/**
		 * The meta object literal for the '<em><b>Sw</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__SW = eINSTANCE.getBlock_Sw();

		/**
		 * The meta object literal for the '<em><b>Nw</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__NW = eINSTANCE.getBlock_Nw();

		/**
		 * The meta object literal for the '<em><b>Se</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__SE = eINSTANCE.getBlock_Se();

		/**
		 * The meta object literal for the '<em><b>Is Occupied By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__IS_OCCUPIED_BY = eINSTANCE.getBlock_IsOccupiedBy();

	}

} //GridLanguagePackage
