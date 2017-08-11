/**
 */
package KitchenLanguage.util;

import KitchenLanguage.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see KitchenLanguage.KitchenLanguagePackage
 * @generated
 */
public class KitchenLanguageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static KitchenLanguagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenLanguageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = KitchenLanguagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitchenLanguageSwitch<Adapter> modelSwitch = new KitchenLanguageSwitch<Adapter>() {
		@Override
		public Adapter caseKitchen(Kitchen object) {
			return createKitchenAdapter();
		}

		@Override
		public Adapter caseItem(Item object) {
			return createItemAdapter();
		}

		@Override
		public Adapter caseSink(Sink object) {
			return createSinkAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseItemSocket(ItemSocket object) {
			return createItemSocketAdapter();
		}

		@Override
		public Adapter caseFridge(Fridge object) {
			return createFridgeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenLanguage.Kitchen <em>Kitchen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenLanguage.Kitchen
	 * @generated
	 */
	public Adapter createKitchenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenLanguage.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenLanguage.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenLanguage.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenLanguage.Sink
	 * @generated
	 */
	public Adapter createSinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenLanguage.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenLanguage.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenLanguage.ItemSocket <em>Item Socket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenLanguage.ItemSocket
	 * @generated
	 */
	public Adapter createItemSocketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenLanguage.Fridge <em>Fridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenLanguage.Fridge
	 * @generated
	 */
	public Adapter createFridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //KitchenLanguageAdapterFactory
