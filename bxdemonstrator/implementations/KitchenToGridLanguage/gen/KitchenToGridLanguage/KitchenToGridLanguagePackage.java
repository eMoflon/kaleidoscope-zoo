/**
 */
package KitchenToGridLanguage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.moflon.tgg.runtime.RuntimePackage;

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
 * @see KitchenToGridLanguage.KitchenToGridLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface KitchenToGridLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "KitchenToGridLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/KitchenToGridLanguage/model/KitchenToGridLanguage.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "KitchenToGridLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KitchenToGridLanguagePackage eINSTANCE = KitchenToGridLanguage.impl.KitchenToGridLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.impl.KitchenToGridCorrImpl <em>Kitchen To Grid Corr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.impl.KitchenToGridCorrImpl
	 * @see KitchenToGridLanguage.impl.KitchenToGridLanguagePackageImpl#getKitchenToGridCorr()
	 * @generated
	 */
	int KITCHEN_TO_GRID_CORR = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_CORR__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_CORR__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kitchen To Grid Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_CORR_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kitchen To Grid Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KITCHEN_TO_GRID_CORR_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link KitchenToGridLanguage.impl.SocketToGroupCorrImpl <em>Socket To Group Corr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see KitchenToGridLanguage.impl.SocketToGroupCorrImpl
	 * @see KitchenToGridLanguage.impl.KitchenToGridLanguagePackageImpl#getSocketToGroupCorr()
	 * @generated
	 */
	int SOCKET_TO_GROUP_CORR = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP_CORR__SOURCE = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP_CORR__TARGET = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Socket To Group Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP_CORR_FEATURE_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Socket To Group Corr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCKET_TO_GROUP_CORR_OPERATION_COUNT = RuntimePackage.ABSTRACT_CORRESPONDENCE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.KitchenToGridCorr <em>Kitchen To Grid Corr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kitchen To Grid Corr</em>'.
	 * @see KitchenToGridLanguage.KitchenToGridCorr
	 * @generated
	 */
	EClass getKitchenToGridCorr();

	/**
	 * Returns the meta object for the reference '{@link KitchenToGridLanguage.KitchenToGridCorr#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see KitchenToGridLanguage.KitchenToGridCorr#getSource()
	 * @see #getKitchenToGridCorr()
	 * @generated
	 */
	EReference getKitchenToGridCorr_Source();

	/**
	 * Returns the meta object for the reference '{@link KitchenToGridLanguage.KitchenToGridCorr#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see KitchenToGridLanguage.KitchenToGridCorr#getTarget()
	 * @see #getKitchenToGridCorr()
	 * @generated
	 */
	EReference getKitchenToGridCorr_Target();

	/**
	 * Returns the meta object for class '{@link KitchenToGridLanguage.SocketToGroupCorr <em>Socket To Group Corr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socket To Group Corr</em>'.
	 * @see KitchenToGridLanguage.SocketToGroupCorr
	 * @generated
	 */
	EClass getSocketToGroupCorr();

	/**
	 * Returns the meta object for the reference '{@link KitchenToGridLanguage.SocketToGroupCorr#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see KitchenToGridLanguage.SocketToGroupCorr#getSource()
	 * @see #getSocketToGroupCorr()
	 * @generated
	 */
	EReference getSocketToGroupCorr_Source();

	/**
	 * Returns the meta object for the reference '{@link KitchenToGridLanguage.SocketToGroupCorr#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see KitchenToGridLanguage.SocketToGroupCorr#getTarget()
	 * @see #getSocketToGroupCorr()
	 * @generated
	 */
	EReference getSocketToGroupCorr_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KitchenToGridLanguageFactory getKitchenToGridLanguageFactory();

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
		 * The meta object literal for the '{@link KitchenToGridLanguage.impl.KitchenToGridCorrImpl <em>Kitchen To Grid Corr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenToGridLanguage.impl.KitchenToGridCorrImpl
		 * @see KitchenToGridLanguage.impl.KitchenToGridLanguagePackageImpl#getKitchenToGridCorr()
		 * @generated
		 */
		EClass KITCHEN_TO_GRID_CORR = eINSTANCE.getKitchenToGridCorr();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN_TO_GRID_CORR__SOURCE = eINSTANCE.getKitchenToGridCorr_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KITCHEN_TO_GRID_CORR__TARGET = eINSTANCE.getKitchenToGridCorr_Target();

		/**
		 * The meta object literal for the '{@link KitchenToGridLanguage.impl.SocketToGroupCorrImpl <em>Socket To Group Corr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see KitchenToGridLanguage.impl.SocketToGroupCorrImpl
		 * @see KitchenToGridLanguage.impl.KitchenToGridLanguagePackageImpl#getSocketToGroupCorr()
		 * @generated
		 */
		EClass SOCKET_TO_GROUP_CORR = eINSTANCE.getSocketToGroupCorr();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCKET_TO_GROUP_CORR__SOURCE = eINSTANCE.getSocketToGroupCorr_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCKET_TO_GROUP_CORR__TARGET = eINSTANCE.getSocketToGroupCorr_Target();

	}

} //KitchenToGridLanguagePackage
