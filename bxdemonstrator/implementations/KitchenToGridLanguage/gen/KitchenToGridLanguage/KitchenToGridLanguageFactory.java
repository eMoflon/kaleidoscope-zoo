/**
 */
package KitchenToGridLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage
 * @generated
 */
public interface KitchenToGridLanguageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KitchenToGridLanguageFactory eINSTANCE = KitchenToGridLanguage.impl.KitchenToGridLanguageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Kitchen To Grid Corr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Kitchen To Grid Corr</em>'.
	 * @generated
	 */
	KitchenToGridCorr createKitchenToGridCorr();

	/**
	 * Returns a new object of class '<em>Socket To Group Corr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Socket To Group Corr</em>'.
	 * @generated
	 */
	SocketToGroupCorr createSocketToGroupCorr();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	KitchenToGridLanguagePackage getKitchenToGridLanguagePackage();

} //KitchenToGridLanguageFactory
