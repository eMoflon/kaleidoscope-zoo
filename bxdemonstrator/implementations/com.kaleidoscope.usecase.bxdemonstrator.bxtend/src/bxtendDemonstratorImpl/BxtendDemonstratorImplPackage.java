/**
 */
package bxtendDemonstratorImpl;

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
 * @see bxtendDemonstratorImpl.BxtendDemonstratorImplFactory
 * @model kind="package"
 * @generated
 */
public interface BxtendDemonstratorImplPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bxtendDemonstratorImpl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bxtendDemonstratorImpl/correspondence.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bxtendDemonstratorImpl.correspondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BxtendDemonstratorImplPackage eINSTANCE = bxtendDemonstratorImpl.impl.BxtendDemonstratorImplPackageImpl.init();

	/**
	 * The meta object id for the '{@link bxtendDemonstratorImpl.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bxtendDemonstratorImpl.impl.TransformationImpl
	 * @see bxtendDemonstratorImpl.impl.BxtendDemonstratorImplPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__CORRESPONDENCES = 0;

	/**
	 * The feature id for the '<em><b>Source Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Target Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET_MODEL = 2;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bxtendDemonstratorImpl.impl.CorrImpl <em>Corr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bxtendDemonstratorImpl.impl.CorrImpl
	 * @see bxtendDemonstratorImpl.impl.BxtendDemonstratorImplPackageImpl#getCorr()
	 * @generated
	 */
	int CORR = 1;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR__SOURCE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR__TARGET_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR__DESC = 2;

	/**
	 * The number of structural features of the '<em>Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bxtendDemonstratorImpl.impl.BasicElemImpl <em>Basic Elem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bxtendDemonstratorImpl.impl.BasicElemImpl
	 * @see bxtendDemonstratorImpl.impl.BxtendDemonstratorImplPackageImpl#getBasicElem()
	 * @generated
	 */
	int BASIC_ELEM = 2;

	/**
	 * The feature id for the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEM__SOURCE_ELEMENT = CORR__SOURCE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEM__TARGET_ELEMENT = CORR__TARGET_ELEMENT;

	/**
	 * The feature id for the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEM__DESC = CORR__DESC;

	/**
	 * The number of structural features of the '<em>Basic Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEM_FEATURE_COUNT = CORR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Elem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_ELEM_OPERATION_COUNT = CORR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bxtendDemonstratorImpl.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see bxtendDemonstratorImpl.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link bxtendDemonstratorImpl.Transformation#getCorrespondences <em>Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correspondences</em>'.
	 * @see bxtendDemonstratorImpl.Transformation#getCorrespondences()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Correspondences();

	/**
	 * Returns the meta object for the reference '{@link bxtendDemonstratorImpl.Transformation#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Model</em>'.
	 * @see bxtendDemonstratorImpl.Transformation#getSourceModel()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_SourceModel();

	/**
	 * Returns the meta object for the reference '{@link bxtendDemonstratorImpl.Transformation#getTargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Model</em>'.
	 * @see bxtendDemonstratorImpl.Transformation#getTargetModel()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TargetModel();

	/**
	 * Returns the meta object for class '{@link bxtendDemonstratorImpl.Corr <em>Corr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corr</em>'.
	 * @see bxtendDemonstratorImpl.Corr
	 * @generated
	 */
	EClass getCorr();

	/**
	 * Returns the meta object for the reference '{@link bxtendDemonstratorImpl.Corr#getSourceElement <em>Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Element</em>'.
	 * @see bxtendDemonstratorImpl.Corr#getSourceElement()
	 * @see #getCorr()
	 * @generated
	 */
	EReference getCorr_SourceElement();

	/**
	 * Returns the meta object for the reference '{@link bxtendDemonstratorImpl.Corr#getTargetElement <em>Target Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Element</em>'.
	 * @see bxtendDemonstratorImpl.Corr#getTargetElement()
	 * @see #getCorr()
	 * @generated
	 */
	EReference getCorr_TargetElement();

	/**
	 * Returns the meta object for the attribute '{@link bxtendDemonstratorImpl.Corr#getDesc <em>Desc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Desc</em>'.
	 * @see bxtendDemonstratorImpl.Corr#getDesc()
	 * @see #getCorr()
	 * @generated
	 */
	EAttribute getCorr_Desc();

	/**
	 * Returns the meta object for class '{@link bxtendDemonstratorImpl.BasicElem <em>Basic Elem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Elem</em>'.
	 * @see bxtendDemonstratorImpl.BasicElem
	 * @generated
	 */
	EClass getBasicElem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BxtendDemonstratorImplFactory getBxtendDemonstratorImplFactory();

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
		 * The meta object literal for the '{@link bxtendDemonstratorImpl.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bxtendDemonstratorImpl.impl.TransformationImpl
		 * @see bxtendDemonstratorImpl.impl.BxtendDemonstratorImplPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__CORRESPONDENCES = eINSTANCE.getTransformation_Correspondences();

		/**
		 * The meta object literal for the '<em><b>Source Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__SOURCE_MODEL = eINSTANCE.getTransformation_SourceModel();

		/**
		 * The meta object literal for the '<em><b>Target Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TARGET_MODEL = eINSTANCE.getTransformation_TargetModel();

		/**
		 * The meta object literal for the '{@link bxtendDemonstratorImpl.impl.CorrImpl <em>Corr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bxtendDemonstratorImpl.impl.CorrImpl
		 * @see bxtendDemonstratorImpl.impl.BxtendDemonstratorImplPackageImpl#getCorr()
		 * @generated
		 */
		EClass CORR = eINSTANCE.getCorr();

		/**
		 * The meta object literal for the '<em><b>Source Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORR__SOURCE_ELEMENT = eINSTANCE.getCorr_SourceElement();

		/**
		 * The meta object literal for the '<em><b>Target Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORR__TARGET_ELEMENT = eINSTANCE.getCorr_TargetElement();

		/**
		 * The meta object literal for the '<em><b>Desc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORR__DESC = eINSTANCE.getCorr_Desc();

		/**
		 * The meta object literal for the '{@link bxtendDemonstratorImpl.impl.BasicElemImpl <em>Basic Elem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bxtendDemonstratorImpl.impl.BasicElemImpl
		 * @see bxtendDemonstratorImpl.impl.BxtendDemonstratorImplPackageImpl#getBasicElem()
		 * @generated
		 */
		EClass BASIC_ELEM = eINSTANCE.getBasicElem();

	}

} //BxtendDemonstratorImplPackage
