/**
 */
package KitchenToGridLanguage.Rules.util;

import KitchenToGridLanguage.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see KitchenToGridLanguage.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
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
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter casecreate_a_horizontal_table(create_a_horizontal_table object) {
			return createcreate_a_horizontal_tableAdapter();
		}

		@Override
		public Adapter caseCreateHorizontalItem(CreateHorizontalItem object) {
			return createCreateHorizontalItemAdapter();
		}

		@Override
		public Adapter caseSocketToGroup(SocketToGroup object) {
			return createSocketToGroupAdapter();
		}

		@Override
		public Adapter casecreate_a_vertical_table(create_a_vertical_table object) {
			return createcreate_a_vertical_tableAdapter();
		}

		@Override
		public Adapter casecreate_a_sink(create_a_sink object) {
			return createcreate_a_sinkAdapter();
		}

		@Override
		public Adapter caseCreateItemWithTwoBlocks(CreateItemWithTwoBlocks object) {
			return createCreateItemWithTwoBlocksAdapter();
		}

		@Override
		public Adapter caseCreateVerticalItem(CreateVerticalItem object) {
			return createCreateVerticalItemAdapter();
		}

		@Override
		public Adapter caseKitchenToGridRule(KitchenToGridRule object) {
			return createKitchenToGridRuleAdapter();
		}

		@Override
		public Adapter casecreate_a_fridge(create_a_fridge object) {
			return createcreate_a_fridgeAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.create_a_horizontal_table <em>create ahorizontal table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.create_a_horizontal_table
	 * @generated
	 */
	public Adapter createcreate_a_horizontal_tableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.CreateHorizontalItem <em>Create Horizontal Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.CreateHorizontalItem
	 * @generated
	 */
	public Adapter createCreateHorizontalItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.SocketToGroup <em>Socket To Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.SocketToGroup
	 * @generated
	 */
	public Adapter createSocketToGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.create_a_vertical_table <em>create avertical table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.create_a_vertical_table
	 * @generated
	 */
	public Adapter createcreate_a_vertical_tableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.create_a_sink <em>create asink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.create_a_sink
	 * @generated
	 */
	public Adapter createcreate_a_sinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.CreateItemWithTwoBlocks <em>Create Item With Two Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.CreateItemWithTwoBlocks
	 * @generated
	 */
	public Adapter createCreateItemWithTwoBlocksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.CreateVerticalItem <em>Create Vertical Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.CreateVerticalItem
	 * @generated
	 */
	public Adapter createCreateVerticalItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.KitchenToGridRule <em>Kitchen To Grid Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.KitchenToGridRule
	 * @generated
	 */
	public Adapter createKitchenToGridRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link KitchenToGridLanguage.Rules.create_a_fridge <em>create afridge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see KitchenToGridLanguage.Rules.create_a_fridge
	 * @generated
	 */
	public Adapter createcreate_a_fridgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
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

} //RulesAdapterFactory
