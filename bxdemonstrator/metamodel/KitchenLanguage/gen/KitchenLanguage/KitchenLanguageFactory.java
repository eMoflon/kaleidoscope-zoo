/**
 */
package KitchenLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see KitchenLanguage.KitchenLanguagePackage
 * @generated
 */
public interface KitchenLanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KitchenLanguageFactory eINSTANCE = KitchenLanguage.impl.KitchenLanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kitchen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitchen</em>'.
	 * @generated
	 */
	Kitchen createKitchen();

	/**
	 * Returns a new object of class '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink</em>'.
	 * @generated
	 */
	Sink createSink();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Item Socket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Socket</em>'.
	 * @generated
	 */
	ItemSocket createItemSocket();

	/**
	 * Returns a new object of class '<em>Fridge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fridge</em>'.
	 * @generated
	 */
	Fridge createFridge();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KitchenLanguagePackage getKitchenLanguagePackage();

} //KitchenLanguageFactory
