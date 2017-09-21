/**
 */
package KitchenToGridLanguage.Rules.util;

import KitchenToGridLanguage.Rules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see KitchenToGridLanguage.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.CREATE_AHORIZONTAL_TABLE: {
			create_a_horizontal_table create_a_horizontal_table = (create_a_horizontal_table) theEObject;
			T result = casecreate_a_horizontal_table(create_a_horizontal_table);
			if (result == null)
				result = caseAbstractRule(create_a_horizontal_table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CREATE_HORIZONTAL_ITEM: {
			CreateHorizontalItem createHorizontalItem = (CreateHorizontalItem) theEObject;
			T result = caseCreateHorizontalItem(createHorizontalItem);
			if (result == null)
				result = caseAbstractRule(createHorizontalItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SOCKET_TO_GROUP: {
			SocketToGroup socketToGroup = (SocketToGroup) theEObject;
			T result = caseSocketToGroup(socketToGroup);
			if (result == null)
				result = caseAbstractRule(socketToGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CREATE_AVERTICAL_TABLE: {
			create_a_vertical_table create_a_vertical_table = (create_a_vertical_table) theEObject;
			T result = casecreate_a_vertical_table(create_a_vertical_table);
			if (result == null)
				result = caseAbstractRule(create_a_vertical_table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CREATE_ASINK: {
			create_a_sink create_a_sink = (create_a_sink) theEObject;
			T result = casecreate_a_sink(create_a_sink);
			if (result == null)
				result = caseAbstractRule(create_a_sink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CREATE_ITEM_WITH_TWO_BLOCKS: {
			CreateItemWithTwoBlocks createItemWithTwoBlocks = (CreateItemWithTwoBlocks) theEObject;
			T result = caseCreateItemWithTwoBlocks(createItemWithTwoBlocks);
			if (result == null)
				result = caseAbstractRule(createItemWithTwoBlocks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CREATE_VERTICAL_ITEM: {
			CreateVerticalItem createVerticalItem = (CreateVerticalItem) theEObject;
			T result = caseCreateVerticalItem(createVerticalItem);
			if (result == null)
				result = caseAbstractRule(createVerticalItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.KITCHEN_TO_GRID_RULE: {
			KitchenToGridRule kitchenToGridRule = (KitchenToGridRule) theEObject;
			T result = caseKitchenToGridRule(kitchenToGridRule);
			if (result == null)
				result = caseAbstractRule(kitchenToGridRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.CREATE_AFRIDGE: {
			create_a_fridge create_a_fridge = (create_a_fridge) theEObject;
			T result = casecreate_a_fridge(create_a_fridge);
			if (result == null)
				result = caseAbstractRule(create_a_fridge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>create ahorizontal table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>create ahorizontal table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecreate_a_horizontal_table(create_a_horizontal_table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Horizontal Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Horizontal Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateHorizontalItem(CreateHorizontalItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Socket To Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Socket To Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocketToGroup(SocketToGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>create avertical table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>create avertical table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecreate_a_vertical_table(create_a_vertical_table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>create asink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>create asink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecreate_a_sink(create_a_sink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Item With Two Blocks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Item With Two Blocks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateItemWithTwoBlocks(CreateItemWithTwoBlocks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Vertical Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Vertical Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreateVerticalItem(CreateVerticalItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kitchen To Grid Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kitchen To Grid Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKitchenToGridRule(KitchenToGridRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>create afridge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>create afridge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecreate_a_fridge(create_a_fridge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
