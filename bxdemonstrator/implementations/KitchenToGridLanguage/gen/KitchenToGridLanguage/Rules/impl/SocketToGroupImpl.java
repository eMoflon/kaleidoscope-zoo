/**
 */
package KitchenToGridLanguage.Rules.impl;

import GridLanguage.Grid;
import GridLanguage.GridLanguageFactory;
import GridLanguage.Group;

import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguageFactory;

import KitchenToGridLanguage.KitchenToGridCorr;
import KitchenToGridLanguage.KitchenToGridLanguageFactory;

import KitchenToGridLanguage.Rules.RulesPackage;
import KitchenToGridLanguage.Rules.SocketToGroup;

import KitchenToGridLanguage.SocketToGroupCorr;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import KitchenToGridLanguage.csp.constraints.*;
import org.moflon.tgg.csp.constraints.*;
import org.moflon.tgg.language.csp.*;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
import org.moflon.tgg.runtime.TripleMatchNodeMapping;
import java.util.Optional;
import org.moflon.tgg.algorithm.delta.attribute.CheckAttributeHelper;
import SDMLanguage.expressions.ComparingOperator;
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Socket To Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SocketToGroupImpl extends AbstractRuleImpl implements SocketToGroup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocketToGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSocketToGroup();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Group group, Grid grid) {

		Object[] result1_black = SocketToGroupImpl.pattern_SocketToGroup_0_1_initialbindings_blackBBBB(this, match,
				group, grid);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[group] = " + group + ", " + "[grid] = " + grid + ".");
		}

		Object[] result2_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, group, grid);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[group] = " + group + ", " + "[grid] = " + grid + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SocketToGroupImpl.pattern_SocketToGroup_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SocketToGroupImpl
					.pattern_SocketToGroup_0_4_collectelementstobetranslated_blackBBB(match, group, grid);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[group] = " + group + ", " + "[grid] = " + grid + ".");
			}
			SocketToGroupImpl.pattern_SocketToGroup_0_4_collectelementstobetranslated_greenBBBF(match, group, grid);
			//nothing EMoflonEdge grid__group____groups = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SocketToGroupImpl.pattern_SocketToGroup_0_5_collectcontextelements_blackBBB(match,
					group, grid);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[group] = " + group + ", " + "[grid] = " + grid + ".");
			}
			SocketToGroupImpl.pattern_SocketToGroup_0_5_collectcontextelements_greenBB(match, grid);

			// 
			SocketToGroupImpl.pattern_SocketToGroup_0_6_registerobjectstomatch_expressionBBBB(this, match, group, grid);
			return SocketToGroupImpl.pattern_SocketToGroup_0_7_expressionF();
		} else {
			return SocketToGroupImpl.pattern_SocketToGroup_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_1_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Group group = (Group) result1_bindingAndBlack[0];
		KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result1_bindingAndBlack[1];
		Grid grid = (Grid) result1_bindingAndBlack[2];
		Kitchen kitchen = (Kitchen) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SocketToGroupImpl.pattern_SocketToGroup_1_1_performtransformation_greenBFBFB(group,
				kitchen, csp);
		ItemSocket itemSocket = (ItemSocket) result1_green[1];
		SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result1_green[3];

		Object[] result2_black = SocketToGroupImpl.pattern_SocketToGroup_1_2_collecttranslatedelements_blackBBB(group,
				itemSocket, socketToGroup);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[group] = " + group + ", "
					+ "[itemSocket] = " + itemSocket + ", " + "[socketToGroup] = " + socketToGroup + ".");
		}
		Object[] result2_green = SocketToGroupImpl.pattern_SocketToGroup_1_2_collecttranslatedelements_greenFBBB(group,
				itemSocket, socketToGroup);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SocketToGroupImpl.pattern_SocketToGroup_1_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, group, kitchenToGrid, itemSocket, grid, kitchen, socketToGroup);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[group] = " + group + ", " + "[kitchenToGrid] = " + kitchenToGrid + ", "
					+ "[itemSocket] = " + itemSocket + ", " + "[grid] = " + grid + ", " + "[kitchen] = " + kitchen
					+ ", " + "[socketToGroup] = " + socketToGroup + ".");
		}
		SocketToGroupImpl.pattern_SocketToGroup_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, group, itemSocket,
				grid, kitchen, socketToGroup);
		//nothing EMoflonEdge kitchen__itemSocket____itemSockets = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge grid__group____groups = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge socketToGroup__itemSocket____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge socketToGroup__group____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		SocketToGroupImpl.pattern_SocketToGroup_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult, group,
				kitchenToGrid, itemSocket, grid, kitchen, socketToGroup);
		return SocketToGroupImpl.pattern_SocketToGroup_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SocketToGroupImpl
				.pattern_SocketToGroup_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SocketToGroupImpl.pattern_SocketToGroup_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Group group = (Group) result2_binding[0];
		Grid grid = (Grid) result2_binding[1];
		for (Object[] result2_black : SocketToGroupImpl.pattern_SocketToGroup_2_2_corematch_blackBFBFB(group, grid,
				match)) {
			KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result2_black[1];
			Kitchen kitchen = (Kitchen) result2_black[3];
			// ForEach 
			for (Object[] result3_black : SocketToGroupImpl.pattern_SocketToGroup_2_3_findcontext_blackBBBB(group,
					kitchenToGrid, grid, kitchen)) {
				Object[] result3_green = SocketToGroupImpl.pattern_SocketToGroup_2_3_findcontext_greenBBBBFFFF(group,
						kitchenToGrid, grid, kitchen);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge kitchenToGrid__grid____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge grid__group____groups = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge kitchenToGrid__kitchen____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = SocketToGroupImpl
						.pattern_SocketToGroup_2_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch, group,
								kitchenToGrid, grid, kitchen);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[group] = " + group + ", "
							+ "[kitchenToGrid] = " + kitchenToGrid + ", " + "[grid] = " + grid + ", " + "[kitchen] = "
							+ kitchen + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SocketToGroupImpl.pattern_SocketToGroup_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SocketToGroupImpl
							.pattern_SocketToGroup_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SocketToGroupImpl.pattern_SocketToGroup_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SocketToGroupImpl.pattern_SocketToGroup_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Group group, Grid grid) {
		match.registerObject("group", group);
		match.registerObject("grid", grid);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Group group, Grid grid) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Group group,
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_itemSocket_id = CSPFactoryHelper.eINSTANCE.createVariable("itemSocket.id", csp);
		var_itemSocket_id.setType("String");

		// Create constraints
		SetId setId = new SetId();

		csp.getConstraints().add(setId);

		// Solve CSP
		setId.setRuleName("NoRuleName");
		setId.solve(var_itemSocket_id);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("group", group);
		isApplicableMatch.registerObject("kitchenToGrid", kitchenToGrid);
		isApplicableMatch.registerObject("grid", grid);
		isApplicableMatch.registerObject("kitchen", kitchen);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_FWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject group, EObject kitchenToGrid,
			EObject itemSocket, EObject grid, EObject kitchen, EObject socketToGroup) {
		ruleresult.registerObject("group", group);
		ruleresult.registerObject("kitchenToGrid", kitchenToGrid);
		ruleresult.registerObject("itemSocket", itemSocket);
		ruleresult.registerObject("grid", grid);
		ruleresult.registerObject("kitchen", kitchen);
		ruleresult.registerObject("socketToGroup", socketToGroup);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("group").eClass())
				.equals("GridLanguage.Group.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, ItemSocket itemSocket, Kitchen kitchen) {

		Object[] result1_black = SocketToGroupImpl.pattern_SocketToGroup_10_1_initialbindings_blackBBBB(this, match,
				itemSocket, kitchen);
		if (result1_black == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[itemSocket] = " + itemSocket + ", " + "[kitchen] = " + kitchen + ".");
		}

		Object[] result2_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, itemSocket, kitchen);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException(
					"Pattern matching failed." + " Variables: " + "[this] = " + this + ", " + "[match] = " + match
							+ ", " + "[itemSocket] = " + itemSocket + ", " + "[kitchen] = " + kitchen + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SocketToGroupImpl.pattern_SocketToGroup_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SocketToGroupImpl
					.pattern_SocketToGroup_10_4_collectelementstobetranslated_blackBBB(match, itemSocket, kitchen);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[itemSocket] = " + itemSocket + ", " + "[kitchen] = " + kitchen + ".");
			}
			SocketToGroupImpl.pattern_SocketToGroup_10_4_collectelementstobetranslated_greenBBBF(match, itemSocket,
					kitchen);
			//nothing EMoflonEdge kitchen__itemSocket____itemSockets = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SocketToGroupImpl.pattern_SocketToGroup_10_5_collectcontextelements_blackBBB(match,
					itemSocket, kitchen);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[itemSocket] = " + itemSocket + ", " + "[kitchen] = " + kitchen + ".");
			}
			SocketToGroupImpl.pattern_SocketToGroup_10_5_collectcontextelements_greenBB(match, kitchen);

			// 
			SocketToGroupImpl.pattern_SocketToGroup_10_6_registerobjectstomatch_expressionBBBB(this, match, itemSocket,
					kitchen);
			return SocketToGroupImpl.pattern_SocketToGroup_10_7_expressionF();
		} else {
			return SocketToGroupImpl.pattern_SocketToGroup_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_11_1_performtransformation_bindingAndBlackFFFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result1_bindingAndBlack[0];
		ItemSocket itemSocket = (ItemSocket) result1_bindingAndBlack[1];
		Grid grid = (Grid) result1_bindingAndBlack[2];
		Kitchen kitchen = (Kitchen) result1_bindingAndBlack[3];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SocketToGroupImpl
				.pattern_SocketToGroup_11_1_performtransformation_greenFBBF(itemSocket, grid);
		Group group = (Group) result1_green[0];
		SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result1_green[3];

		Object[] result2_black = SocketToGroupImpl.pattern_SocketToGroup_11_2_collecttranslatedelements_blackBBB(group,
				itemSocket, socketToGroup);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[group] = " + group + ", "
					+ "[itemSocket] = " + itemSocket + ", " + "[socketToGroup] = " + socketToGroup + ".");
		}
		Object[] result2_green = SocketToGroupImpl.pattern_SocketToGroup_11_2_collecttranslatedelements_greenFBBB(group,
				itemSocket, socketToGroup);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SocketToGroupImpl.pattern_SocketToGroup_11_3_bookkeepingforedges_blackBBBBBBB(
				ruleresult, group, kitchenToGrid, itemSocket, grid, kitchen, socketToGroup);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[group] = " + group + ", " + "[kitchenToGrid] = " + kitchenToGrid + ", "
					+ "[itemSocket] = " + itemSocket + ", " + "[grid] = " + grid + ", " + "[kitchen] = " + kitchen
					+ ", " + "[socketToGroup] = " + socketToGroup + ".");
		}
		SocketToGroupImpl.pattern_SocketToGroup_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, group, itemSocket,
				grid, kitchen, socketToGroup);
		//nothing EMoflonEdge kitchen__itemSocket____itemSockets = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge grid__group____groups = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge socketToGroup__itemSocket____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge socketToGroup__group____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		SocketToGroupImpl.pattern_SocketToGroup_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult, group,
				kitchenToGrid, itemSocket, grid, kitchen, socketToGroup);
		return SocketToGroupImpl.pattern_SocketToGroup_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SocketToGroupImpl
				.pattern_SocketToGroup_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SocketToGroupImpl.pattern_SocketToGroup_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		ItemSocket itemSocket = (ItemSocket) result2_binding[0];
		Kitchen kitchen = (Kitchen) result2_binding[1];
		for (Object[] result2_black : SocketToGroupImpl.pattern_SocketToGroup_12_2_corematch_blackFBFBB(itemSocket,
				kitchen, match)) {
			KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result2_black[0];
			Grid grid = (Grid) result2_black[2];
			// ForEach 
			for (Object[] result3_black : SocketToGroupImpl
					.pattern_SocketToGroup_12_3_findcontext_blackBBBB(kitchenToGrid, itemSocket, grid, kitchen)) {
				Object[] result3_green = SocketToGroupImpl
						.pattern_SocketToGroup_12_3_findcontext_greenBBBBFFFF(kitchenToGrid, itemSocket, grid, kitchen);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge kitchenToGrid__grid____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge kitchen__itemSocket____itemSockets = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge kitchenToGrid__kitchen____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = SocketToGroupImpl
						.pattern_SocketToGroup_12_4_solveCSP_bindingAndBlackFBBBBBB(this, isApplicableMatch,
								kitchenToGrid, itemSocket, grid, kitchen);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[kitchenToGrid] = " + kitchenToGrid
							+ ", " + "[itemSocket] = " + itemSocket + ", " + "[grid] = " + grid + ", " + "[kitchen] = "
							+ kitchen + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SocketToGroupImpl.pattern_SocketToGroup_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SocketToGroupImpl
							.pattern_SocketToGroup_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SocketToGroupImpl.pattern_SocketToGroup_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SocketToGroupImpl.pattern_SocketToGroup_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, ItemSocket itemSocket, Kitchen kitchen) {
		match.registerObject("itemSocket", itemSocket);
		match.registerObject("kitchen", kitchen);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, ItemSocket itemSocket, Kitchen kitchen) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_itemSocket_id = CSPFactoryHelper.eINSTANCE.createVariable("itemSocket.id", true, csp);
		var_itemSocket_id.setValue(itemSocket.getId());
		var_itemSocket_id.setType("String");

		// Create unbound variables

		// Create constraints
		SetId setId = new SetId();

		csp.getConstraints().add(setId);

		// Solve CSP
		setId.setRuleName("NoRuleName");
		setId.solve(var_itemSocket_id);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, KitchenToGridCorr kitchenToGrid,
			ItemSocket itemSocket, Grid grid, Kitchen kitchen) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("kitchenToGrid", kitchenToGrid);
		isApplicableMatch.registerObject("itemSocket", itemSocket);
		isApplicableMatch.registerObject("grid", grid);
		isApplicableMatch.registerObject("kitchen", kitchen);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject group, EObject kitchenToGrid,
			EObject itemSocket, EObject grid, EObject kitchen, EObject socketToGroup) {
		ruleresult.registerObject("group", group);
		ruleresult.registerObject("kitchenToGrid", kitchenToGrid);
		ruleresult.registerObject("itemSocket", itemSocket);
		ruleresult.registerObject("grid", grid);
		ruleresult.registerObject("kitchen", kitchen);
		ruleresult.registerObject("socketToGroup", socketToGroup);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("itemSocket").eClass())
				.equals("KitchenLanguage.ItemSocket.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_4(EMoflonEdge _edge_groups) {

		Object[] result1_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SocketToGroupImpl.pattern_SocketToGroup_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SocketToGroupImpl
				.pattern_SocketToGroup_20_2_testcorematchandDECs_blackFFB(_edge_groups)) {
			Group group = (Group) result2_black[0];
			Grid grid = (Grid) result2_black[1];
			Object[] result2_green = SocketToGroupImpl
					.pattern_SocketToGroup_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SocketToGroupImpl.pattern_SocketToGroup_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, group, grid)) {
				// 
				if (SocketToGroupImpl
						.pattern_SocketToGroup_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = SocketToGroupImpl
							.pattern_SocketToGroup_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SocketToGroupImpl.pattern_SocketToGroup_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SocketToGroupImpl.pattern_SocketToGroup_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_4(EMoflonEdge _edge_itemSockets) {

		Object[] result1_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SocketToGroupImpl.pattern_SocketToGroup_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SocketToGroupImpl
				.pattern_SocketToGroup_21_2_testcorematchandDECs_blackFFB(_edge_itemSockets)) {
			ItemSocket itemSocket = (ItemSocket) result2_black[0];
			Kitchen kitchen = (Kitchen) result2_black[1];
			Object[] result2_green = SocketToGroupImpl
					.pattern_SocketToGroup_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SocketToGroupImpl.pattern_SocketToGroup_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
					this, match, itemSocket, kitchen)) {
				// 
				if (SocketToGroupImpl
						.pattern_SocketToGroup_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(this,
								match)) {

					Object[] result5_black = SocketToGroupImpl
							.pattern_SocketToGroup_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SocketToGroupImpl.pattern_SocketToGroup_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SocketToGroupImpl.pattern_SocketToGroup_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SocketToGroup");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_itemSocket_id = CSPFactoryHelper.eINSTANCE.createVariable("itemSocket", true, csp);
		var_itemSocket_id.setValue(__helper.getValue("itemSocket", "id"));
		var_itemSocket_id.setType("String");

		SetId setId0 = new SetId();
		csp.getConstraints().add(setId0);

		setId0.setRuleName("SocketToGroup");
		setId0.solve(var_itemSocket_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_itemSocket_id.setBound(false);
			setId0.solve(var_itemSocket_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("itemSocket", "id", var_itemSocket_id.getValue());
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SocketToGroup");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_itemSocket_id = CSPFactoryHelper.eINSTANCE.createVariable("itemSocket", true, csp);
		var_itemSocket_id.setValue(__helper.getValue("itemSocket", "id"));
		var_itemSocket_id.setType("String");

		SetId setId0 = new SetId();
		csp.getConstraints().add(setId0);

		setId0.setRuleName("SocketToGroup");
		setId0.solve(var_itemSocket_id);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			setId0.solve(var_itemSocket_id);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
			} else {
				ruleResult.setSuccess(false);
				return ruleResult;
			}
		}

		return ruleResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch) {

		Object[] result1_black = SocketToGroupImpl.pattern_SocketToGroup_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SocketToGroupImpl.pattern_SocketToGroup_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Group group = (Group) result2_bindingAndBlack[0];
		ItemSocket itemSocket = (ItemSocket) result2_bindingAndBlack[1];
		Grid grid = (Grid) result2_bindingAndBlack[2];
		Kitchen kitchen = (Kitchen) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = SocketToGroupImpl
				.pattern_SocketToGroup_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, group, itemSocket, grid, kitchen,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[group] = " + group + ", " + "[itemSocket] = " + itemSocket + ", " + "[grid] = " + grid + ", "
					+ "[kitchen] = " + kitchen + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SocketToGroupImpl.pattern_SocketToGroup_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SocketToGroupImpl.pattern_SocketToGroup_24_5_matchcorrcontext_blackFBBBB(grid,
					kitchen, sourceMatch, targetMatch)) {
				KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result5_black[0];
				Object[] result5_green = SocketToGroupImpl
						.pattern_SocketToGroup_24_5_matchcorrcontext_greenBBBF(kitchenToGrid, sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = SocketToGroupImpl.pattern_SocketToGroup_24_6_createcorrespondence_blackBBBBB(
						group, itemSocket, grid, kitchen, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[group] = " + group + ", "
							+ "[itemSocket] = " + itemSocket + ", " + "[grid] = " + grid + ", " + "[kitchen] = "
							+ kitchen + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SocketToGroupImpl.pattern_SocketToGroup_24_6_createcorrespondence_greenBBFB(group, itemSocket, ccMatch);
				//nothing SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result6_green[2];

				Object[] result7_black = SocketToGroupImpl
						.pattern_SocketToGroup_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SocketToGroupImpl.pattern_SocketToGroup_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return SocketToGroupImpl.pattern_SocketToGroup_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Group group, ItemSocket itemSocket, Grid grid, Kitchen kitchen,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_itemSocket_id = CSPFactoryHelper.eINSTANCE.createVariable("itemSocket.id", true, csp);
		var_itemSocket_id.setValue(itemSocket.getId());
		var_itemSocket_id.setType("String");

		// Create unbound variables

		// Create constraints
		SetId setId = new SetId();

		csp.getConstraints().add(setId);

		// Solve CSP
		setId.setRuleName("NoRuleName");
		setId.solve(var_itemSocket_id);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD(Group group, Grid grid) {// 
		Object[] result1_black = SocketToGroupImpl.pattern_SocketToGroup_27_1_matchtggpattern_blackBB(group, grid);
		if (result1_black != null) {
			return SocketToGroupImpl.pattern_SocketToGroup_27_2_expressionF();
		} else {
			return SocketToGroupImpl.pattern_SocketToGroup_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(ItemSocket itemSocket, Kitchen kitchen) {// 
		Object[] result1_black = SocketToGroupImpl.pattern_SocketToGroup_28_1_matchtggpattern_blackBB(itemSocket,
				kitchen);
		if (result1_black != null) {
			return SocketToGroupImpl.pattern_SocketToGroup_28_2_expressionF();
		} else {
			return SocketToGroupImpl.pattern_SocketToGroup_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_FWD__MATCH_GROUP_GRID:
			return isAppropriate_FWD((Match) arguments.get(0), (Group) arguments.get(1), (Grid) arguments.get(2));
		case RulesPackage.SOCKET_TO_GROUP___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GROUP_GRID:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Group) arguments.get(1), (Grid) arguments.get(2));
			return null;
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GROUP_GRID:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Group) arguments.get(1),
					(Grid) arguments.get(2));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GROUP_KITCHENTOGRIDCORR_GRID_KITCHEN:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Group) arguments.get(1),
					(KitchenToGridCorr) arguments.get(2), (Grid) arguments.get(3), (Kitchen) arguments.get(4));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SOCKET_TO_GROUP___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_BWD__MATCH_ITEMSOCKET_KITCHEN:
			return isAppropriate_BWD((Match) arguments.get(0), (ItemSocket) arguments.get(1),
					(Kitchen) arguments.get(2));
		case RulesPackage.SOCKET_TO_GROUP___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_ITEMSOCKET_KITCHEN:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (ItemSocket) arguments.get(1),
					(Kitchen) arguments.get(2));
			return null;
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_ITEMSOCKET_KITCHEN:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (ItemSocket) arguments.get(1),
					(Kitchen) arguments.get(2));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_KITCHENTOGRIDCORR_ITEMSOCKET_GRID_KITCHEN:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (KitchenToGridCorr) arguments.get(1),
					(ItemSocket) arguments.get(2), (Grid) arguments.get(3), (Kitchen) arguments.get(4));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SOCKET_TO_GROUP___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_FWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPROPRIATE_BWD_EMOFLON_EDGE_4__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_4((EMoflonEdge) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_SOLVE_CSP_CC__GROUP_ITEMSOCKET_GRID_KITCHEN_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Group) arguments.get(0), (ItemSocket) arguments.get(1),
					(Grid) arguments.get(2), (Kitchen) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.SOCKET_TO_GROUP___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SOCKET_TO_GROUP___CHECK_DEC_FWD__GROUP_GRID:
			return checkDEC_FWD((Group) arguments.get(0), (Grid) arguments.get(1));
		case RulesPackage.SOCKET_TO_GROUP___CHECK_DEC_BWD__ITEMSOCKET_KITCHEN:
			return checkDEC_BWD((ItemSocket) arguments.get(0), (Kitchen) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SocketToGroup_0_1_initialbindings_blackBBBB(SocketToGroup _this, Match match,
			Group group, Grid grid) {
		return new Object[] { _this, match, group, grid };
	}

	public static final Object[] pattern_SocketToGroup_0_2_SolveCSP_bindingFBBBB(SocketToGroup _this, Match match,
			Group group, Grid grid) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, group, grid);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, group, grid };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SocketToGroup_0_2_SolveCSP_bindingAndBlackFBBBB(SocketToGroup _this,
			Match match, Group group, Grid grid) {
		Object[] result_pattern_SocketToGroup_0_2_SolveCSP_binding = pattern_SocketToGroup_0_2_SolveCSP_bindingFBBBB(
				_this, match, group, grid);
		if (result_pattern_SocketToGroup_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SocketToGroup_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SocketToGroup_0_2_SolveCSP_black = pattern_SocketToGroup_0_2_SolveCSP_blackB(csp);
			if (result_pattern_SocketToGroup_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, group, grid };
			}
		}
		return null;
	}

	public static final boolean pattern_SocketToGroup_0_3_CheckCSP_expressionFBB(SocketToGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_0_4_collectelementstobetranslated_blackBBB(Match match,
			Group group, Grid grid) {
		return new Object[] { match, group, grid };
	}

	public static final Object[] pattern_SocketToGroup_0_4_collectelementstobetranslated_greenBBBF(Match match,
			Group group, Grid grid) {
		EMoflonEdge grid__group____groups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(group);
		String grid__group____groups_name_prime = "groups";
		grid__group____groups.setSrc(grid);
		grid__group____groups.setTrg(group);
		match.getToBeTranslatedEdges().add(grid__group____groups);
		grid__group____groups.setName(grid__group____groups_name_prime);
		return new Object[] { match, group, grid, grid__group____groups };
	}

	public static final Object[] pattern_SocketToGroup_0_5_collectcontextelements_blackBBB(Match match, Group group,
			Grid grid) {
		return new Object[] { match, group, grid };
	}

	public static final Object[] pattern_SocketToGroup_0_5_collectcontextelements_greenBB(Match match, Grid grid) {
		match.getContextNodes().add(grid);
		return new Object[] { match, grid };
	}

	public static final void pattern_SocketToGroup_0_6_registerobjectstomatch_expressionBBBB(SocketToGroup _this,
			Match match, Group group, Grid grid) {
		_this.registerObjectsToMatch_FWD(match, group, grid);

	}

	public static final boolean pattern_SocketToGroup_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SocketToGroup_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("group");
		EObject _localVariable_1 = isApplicableMatch.getObject("kitchenToGrid");
		EObject _localVariable_2 = isApplicableMatch.getObject("grid");
		EObject _localVariable_3 = isApplicableMatch.getObject("kitchen");
		EObject tmpGroup = _localVariable_0;
		EObject tmpKitchenToGrid = _localVariable_1;
		EObject tmpGrid = _localVariable_2;
		EObject tmpKitchen = _localVariable_3;
		if (tmpGroup instanceof Group) {
			Group group = (Group) tmpGroup;
			if (tmpKitchenToGrid instanceof KitchenToGridCorr) {
				KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) tmpKitchenToGrid;
				if (tmpGrid instanceof Grid) {
					Grid grid = (Grid) tmpGrid;
					if (tmpKitchen instanceof Kitchen) {
						Kitchen kitchen = (Kitchen) tmpKitchen;
						return new Object[] { group, kitchenToGrid, grid, kitchen, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_1_1_performtransformation_blackBBBBFBB(Group group,
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen, SocketToGroup _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { group, kitchenToGrid, grid, kitchen, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_1_1_performtransformation_bindingAndBlackFFFFFBB(
			SocketToGroup _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SocketToGroup_1_1_performtransformation_binding = pattern_SocketToGroup_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SocketToGroup_1_1_performtransformation_binding != null) {
			Group group = (Group) result_pattern_SocketToGroup_1_1_performtransformation_binding[0];
			KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result_pattern_SocketToGroup_1_1_performtransformation_binding[1];
			Grid grid = (Grid) result_pattern_SocketToGroup_1_1_performtransformation_binding[2];
			Kitchen kitchen = (Kitchen) result_pattern_SocketToGroup_1_1_performtransformation_binding[3];

			Object[] result_pattern_SocketToGroup_1_1_performtransformation_black = pattern_SocketToGroup_1_1_performtransformation_blackBBBBFBB(
					group, kitchenToGrid, grid, kitchen, _this, isApplicableMatch);
			if (result_pattern_SocketToGroup_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SocketToGroup_1_1_performtransformation_black[4];

				return new Object[] { group, kitchenToGrid, grid, kitchen, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_1_1_performtransformation_greenBFBFB(Group group,
			Kitchen kitchen, CSP csp) {
		ItemSocket itemSocket = KitchenLanguageFactory.eINSTANCE.createItemSocket();
		SocketToGroupCorr socketToGroup = KitchenToGridLanguageFactory.eINSTANCE.createSocketToGroupCorr();
		Object _localVariable_0 = csp.getValue("itemSocket", "id");
		kitchen.getItemSockets().add(itemSocket);
		socketToGroup.setTarget(itemSocket);
		socketToGroup.setSource(group);
		String itemSocket_id_prime = (String) _localVariable_0;
		itemSocket.setId(itemSocket_id_prime);
		return new Object[] { group, itemSocket, kitchen, socketToGroup, csp };
	}

	public static final Object[] pattern_SocketToGroup_1_2_collecttranslatedelements_blackBBB(Group group,
			ItemSocket itemSocket, SocketToGroupCorr socketToGroup) {
		return new Object[] { group, itemSocket, socketToGroup };
	}

	public static final Object[] pattern_SocketToGroup_1_2_collecttranslatedelements_greenFBBB(Group group,
			ItemSocket itemSocket, SocketToGroupCorr socketToGroup) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(group);
		ruleresult.getCreatedElements().add(itemSocket);
		ruleresult.getCreatedLinkElements().add(socketToGroup);
		return new Object[] { ruleresult, group, itemSocket, socketToGroup };
	}

	public static final Object[] pattern_SocketToGroup_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject group, EObject kitchenToGrid, EObject itemSocket, EObject grid,
			EObject kitchen, EObject socketToGroup) {
		if (!group.equals(kitchenToGrid)) {
			if (!group.equals(itemSocket)) {
				if (!group.equals(kitchen)) {
					if (!group.equals(socketToGroup)) {
						if (!kitchenToGrid.equals(socketToGroup)) {
							if (!itemSocket.equals(kitchenToGrid)) {
								if (!itemSocket.equals(kitchen)) {
									if (!itemSocket.equals(socketToGroup)) {
										if (!grid.equals(group)) {
											if (!grid.equals(kitchenToGrid)) {
												if (!grid.equals(itemSocket)) {
													if (!grid.equals(kitchen)) {
														if (!grid.equals(socketToGroup)) {
															if (!kitchen.equals(kitchenToGrid)) {
																if (!kitchen.equals(socketToGroup)) {
																	return new Object[] { ruleresult, group,
																			kitchenToGrid, itemSocket, grid, kitchen,
																			socketToGroup };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject group, EObject itemSocket, EObject grid, EObject kitchen,
			EObject socketToGroup) {
		EMoflonEdge kitchen__itemSocket____itemSockets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__group____groups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge socketToGroup__itemSocket____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge socketToGroup__group____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SocketToGroup";
		String kitchen__itemSocket____itemSockets_name_prime = "itemSockets";
		String grid__group____groups_name_prime = "groups";
		String socketToGroup__itemSocket____target_name_prime = "target";
		String socketToGroup__group____source_name_prime = "source";
		kitchen__itemSocket____itemSockets.setSrc(kitchen);
		kitchen__itemSocket____itemSockets.setTrg(itemSocket);
		ruleresult.getCreatedEdges().add(kitchen__itemSocket____itemSockets);
		grid__group____groups.setSrc(grid);
		grid__group____groups.setTrg(group);
		ruleresult.getTranslatedEdges().add(grid__group____groups);
		socketToGroup__itemSocket____target.setSrc(socketToGroup);
		socketToGroup__itemSocket____target.setTrg(itemSocket);
		ruleresult.getCreatedEdges().add(socketToGroup__itemSocket____target);
		socketToGroup__group____source.setSrc(socketToGroup);
		socketToGroup__group____source.setTrg(group);
		ruleresult.getCreatedEdges().add(socketToGroup__group____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		kitchen__itemSocket____itemSockets.setName(kitchen__itemSocket____itemSockets_name_prime);
		grid__group____groups.setName(grid__group____groups_name_prime);
		socketToGroup__itemSocket____target.setName(socketToGroup__itemSocket____target_name_prime);
		socketToGroup__group____source.setName(socketToGroup__group____source_name_prime);
		return new Object[] { ruleresult, group, itemSocket, grid, kitchen, socketToGroup,
				kitchen__itemSocket____itemSockets, grid__group____groups, socketToGroup__itemSocket____target,
				socketToGroup__group____source };
	}

	public static final void pattern_SocketToGroup_1_5_registerobjects_expressionBBBBBBBB(SocketToGroup _this,
			PerformRuleResult ruleresult, EObject group, EObject kitchenToGrid, EObject itemSocket, EObject grid,
			EObject kitchen, EObject socketToGroup) {
		_this.registerObjects_FWD(ruleresult, group, kitchenToGrid, itemSocket, grid, kitchen, socketToGroup);

	}

	public static final PerformRuleResult pattern_SocketToGroup_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_2_1_preparereturnvalue_bindingFB(SocketToGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SocketToGroup _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_2_1_preparereturnvalue_bindingAndBlackFFB(SocketToGroup _this) {
		Object[] result_pattern_SocketToGroup_2_1_preparereturnvalue_binding = pattern_SocketToGroup_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SocketToGroup_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SocketToGroup_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SocketToGroup_2_1_preparereturnvalue_black = pattern_SocketToGroup_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SocketToGroup_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SocketToGroup_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SocketToGroup";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SocketToGroup_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("group");
		EObject _localVariable_1 = match.getObject("grid");
		EObject tmpGroup = _localVariable_0;
		EObject tmpGrid = _localVariable_1;
		if (tmpGroup instanceof Group) {
			Group group = (Group) tmpGroup;
			if (tmpGrid instanceof Grid) {
				Grid grid = (Grid) tmpGrid;
				return new Object[] { group, grid, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SocketToGroup_2_2_corematch_blackBFBFB(Group group, Grid grid,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (KitchenToGridCorr kitchenToGrid : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(grid,
				KitchenToGridCorr.class, "source")) {
			Kitchen kitchen = kitchenToGrid.getTarget();
			if (kitchen != null) {
				_result.add(new Object[] { group, kitchenToGrid, grid, kitchen, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SocketToGroup_2_3_findcontext_blackBBBB(Group group,
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (grid.equals(kitchenToGrid.getSource())) {
			if (grid.getGroups().contains(group)) {
				if (kitchen.equals(kitchenToGrid.getTarget())) {
					_result.add(new Object[] { group, kitchenToGrid, grid, kitchen });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_2_3_findcontext_greenBBBBFFFF(Group group,
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge kitchenToGrid__grid____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__group____groups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge kitchenToGrid__kitchen____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String kitchenToGrid__grid____source_name_prime = "source";
		String grid__group____groups_name_prime = "groups";
		String kitchenToGrid__kitchen____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(group);
		isApplicableMatch.getAllContextElements().add(kitchenToGrid);
		isApplicableMatch.getAllContextElements().add(grid);
		isApplicableMatch.getAllContextElements().add(kitchen);
		kitchenToGrid__grid____source.setSrc(kitchenToGrid);
		kitchenToGrid__grid____source.setTrg(grid);
		isApplicableMatch.getAllContextElements().add(kitchenToGrid__grid____source);
		grid__group____groups.setSrc(grid);
		grid__group____groups.setTrg(group);
		isApplicableMatch.getAllContextElements().add(grid__group____groups);
		kitchenToGrid__kitchen____target.setSrc(kitchenToGrid);
		kitchenToGrid__kitchen____target.setTrg(kitchen);
		isApplicableMatch.getAllContextElements().add(kitchenToGrid__kitchen____target);
		kitchenToGrid__grid____source.setName(kitchenToGrid__grid____source_name_prime);
		grid__group____groups.setName(grid__group____groups_name_prime);
		kitchenToGrid__kitchen____target.setName(kitchenToGrid__kitchen____target_name_prime);
		return new Object[] { group, kitchenToGrid, grid, kitchen, isApplicableMatch, kitchenToGrid__grid____source,
				grid__group____groups, kitchenToGrid__kitchen____target };
	}

	public static final Object[] pattern_SocketToGroup_2_4_solveCSP_bindingFBBBBBB(SocketToGroup _this,
			IsApplicableMatch isApplicableMatch, Group group, KitchenToGridCorr kitchenToGrid, Grid grid,
			Kitchen kitchen) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, group, kitchenToGrid, grid, kitchen);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, group, kitchenToGrid, grid, kitchen };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SocketToGroup_2_4_solveCSP_bindingAndBlackFBBBBBB(SocketToGroup _this,
			IsApplicableMatch isApplicableMatch, Group group, KitchenToGridCorr kitchenToGrid, Grid grid,
			Kitchen kitchen) {
		Object[] result_pattern_SocketToGroup_2_4_solveCSP_binding = pattern_SocketToGroup_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, group, kitchenToGrid, grid, kitchen);
		if (result_pattern_SocketToGroup_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SocketToGroup_2_4_solveCSP_binding[0];

			Object[] result_pattern_SocketToGroup_2_4_solveCSP_black = pattern_SocketToGroup_2_4_solveCSP_blackB(csp);
			if (result_pattern_SocketToGroup_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, group, kitchenToGrid, grid, kitchen };
			}
		}
		return null;
	}

	public static final boolean pattern_SocketToGroup_2_5_checkCSP_expressionFBB(SocketToGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SocketToGroup_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SocketToGroup";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SocketToGroup_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_10_1_initialbindings_blackBBBB(SocketToGroup _this, Match match,
			ItemSocket itemSocket, Kitchen kitchen) {
		return new Object[] { _this, match, itemSocket, kitchen };
	}

	public static final Object[] pattern_SocketToGroup_10_2_SolveCSP_bindingFBBBB(SocketToGroup _this, Match match,
			ItemSocket itemSocket, Kitchen kitchen) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, itemSocket, kitchen);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, itemSocket, kitchen };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SocketToGroup_10_2_SolveCSP_bindingAndBlackFBBBB(SocketToGroup _this,
			Match match, ItemSocket itemSocket, Kitchen kitchen) {
		Object[] result_pattern_SocketToGroup_10_2_SolveCSP_binding = pattern_SocketToGroup_10_2_SolveCSP_bindingFBBBB(
				_this, match, itemSocket, kitchen);
		if (result_pattern_SocketToGroup_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SocketToGroup_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SocketToGroup_10_2_SolveCSP_black = pattern_SocketToGroup_10_2_SolveCSP_blackB(csp);
			if (result_pattern_SocketToGroup_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, itemSocket, kitchen };
			}
		}
		return null;
	}

	public static final boolean pattern_SocketToGroup_10_3_CheckCSP_expressionFBB(SocketToGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_10_4_collectelementstobetranslated_blackBBB(Match match,
			ItemSocket itemSocket, Kitchen kitchen) {
		return new Object[] { match, itemSocket, kitchen };
	}

	public static final Object[] pattern_SocketToGroup_10_4_collectelementstobetranslated_greenBBBF(Match match,
			ItemSocket itemSocket, Kitchen kitchen) {
		EMoflonEdge kitchen__itemSocket____itemSockets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(itemSocket);
		String kitchen__itemSocket____itemSockets_name_prime = "itemSockets";
		kitchen__itemSocket____itemSockets.setSrc(kitchen);
		kitchen__itemSocket____itemSockets.setTrg(itemSocket);
		match.getToBeTranslatedEdges().add(kitchen__itemSocket____itemSockets);
		kitchen__itemSocket____itemSockets.setName(kitchen__itemSocket____itemSockets_name_prime);
		return new Object[] { match, itemSocket, kitchen, kitchen__itemSocket____itemSockets };
	}

	public static final Object[] pattern_SocketToGroup_10_5_collectcontextelements_blackBBB(Match match,
			ItemSocket itemSocket, Kitchen kitchen) {
		return new Object[] { match, itemSocket, kitchen };
	}

	public static final Object[] pattern_SocketToGroup_10_5_collectcontextelements_greenBB(Match match,
			Kitchen kitchen) {
		match.getContextNodes().add(kitchen);
		return new Object[] { match, kitchen };
	}

	public static final void pattern_SocketToGroup_10_6_registerobjectstomatch_expressionBBBB(SocketToGroup _this,
			Match match, ItemSocket itemSocket, Kitchen kitchen) {
		_this.registerObjectsToMatch_BWD(match, itemSocket, kitchen);

	}

	public static final boolean pattern_SocketToGroup_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SocketToGroup_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("kitchenToGrid");
		EObject _localVariable_1 = isApplicableMatch.getObject("itemSocket");
		EObject _localVariable_2 = isApplicableMatch.getObject("grid");
		EObject _localVariable_3 = isApplicableMatch.getObject("kitchen");
		EObject tmpKitchenToGrid = _localVariable_0;
		EObject tmpItemSocket = _localVariable_1;
		EObject tmpGrid = _localVariable_2;
		EObject tmpKitchen = _localVariable_3;
		if (tmpKitchenToGrid instanceof KitchenToGridCorr) {
			KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) tmpKitchenToGrid;
			if (tmpItemSocket instanceof ItemSocket) {
				ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
				if (tmpGrid instanceof Grid) {
					Grid grid = (Grid) tmpGrid;
					if (tmpKitchen instanceof Kitchen) {
						Kitchen kitchen = (Kitchen) tmpKitchen;
						return new Object[] { kitchenToGrid, itemSocket, grid, kitchen, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_11_1_performtransformation_blackBBBBFBB(
			KitchenToGridCorr kitchenToGrid, ItemSocket itemSocket, Grid grid, Kitchen kitchen, SocketToGroup _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { kitchenToGrid, itemSocket, grid, kitchen, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_11_1_performtransformation_bindingAndBlackFFFFFBB(
			SocketToGroup _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SocketToGroup_11_1_performtransformation_binding = pattern_SocketToGroup_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SocketToGroup_11_1_performtransformation_binding != null) {
			KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result_pattern_SocketToGroup_11_1_performtransformation_binding[0];
			ItemSocket itemSocket = (ItemSocket) result_pattern_SocketToGroup_11_1_performtransformation_binding[1];
			Grid grid = (Grid) result_pattern_SocketToGroup_11_1_performtransformation_binding[2];
			Kitchen kitchen = (Kitchen) result_pattern_SocketToGroup_11_1_performtransformation_binding[3];

			Object[] result_pattern_SocketToGroup_11_1_performtransformation_black = pattern_SocketToGroup_11_1_performtransformation_blackBBBBFBB(
					kitchenToGrid, itemSocket, grid, kitchen, _this, isApplicableMatch);
			if (result_pattern_SocketToGroup_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SocketToGroup_11_1_performtransformation_black[4];

				return new Object[] { kitchenToGrid, itemSocket, grid, kitchen, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_11_1_performtransformation_greenFBBF(ItemSocket itemSocket,
			Grid grid) {
		Group group = GridLanguageFactory.eINSTANCE.createGroup();
		SocketToGroupCorr socketToGroup = KitchenToGridLanguageFactory.eINSTANCE.createSocketToGroupCorr();
		grid.getGroups().add(group);
		socketToGroup.setTarget(itemSocket);
		socketToGroup.setSource(group);
		return new Object[] { group, itemSocket, grid, socketToGroup };
	}

	public static final Object[] pattern_SocketToGroup_11_2_collecttranslatedelements_blackBBB(Group group,
			ItemSocket itemSocket, SocketToGroupCorr socketToGroup) {
		return new Object[] { group, itemSocket, socketToGroup };
	}

	public static final Object[] pattern_SocketToGroup_11_2_collecttranslatedelements_greenFBBB(Group group,
			ItemSocket itemSocket, SocketToGroupCorr socketToGroup) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(group);
		ruleresult.getTranslatedElements().add(itemSocket);
		ruleresult.getCreatedLinkElements().add(socketToGroup);
		return new Object[] { ruleresult, group, itemSocket, socketToGroup };
	}

	public static final Object[] pattern_SocketToGroup_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject group, EObject kitchenToGrid, EObject itemSocket, EObject grid,
			EObject kitchen, EObject socketToGroup) {
		if (!group.equals(kitchenToGrid)) {
			if (!group.equals(itemSocket)) {
				if (!group.equals(kitchen)) {
					if (!group.equals(socketToGroup)) {
						if (!kitchenToGrid.equals(socketToGroup)) {
							if (!itemSocket.equals(kitchenToGrid)) {
								if (!itemSocket.equals(kitchen)) {
									if (!itemSocket.equals(socketToGroup)) {
										if (!grid.equals(group)) {
											if (!grid.equals(kitchenToGrid)) {
												if (!grid.equals(itemSocket)) {
													if (!grid.equals(kitchen)) {
														if (!grid.equals(socketToGroup)) {
															if (!kitchen.equals(kitchenToGrid)) {
																if (!kitchen.equals(socketToGroup)) {
																	return new Object[] { ruleresult, group,
																			kitchenToGrid, itemSocket, grid, kitchen,
																			socketToGroup };
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject group, EObject itemSocket, EObject grid, EObject kitchen,
			EObject socketToGroup) {
		EMoflonEdge kitchen__itemSocket____itemSockets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__group____groups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge socketToGroup__itemSocket____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge socketToGroup__group____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SocketToGroup";
		String kitchen__itemSocket____itemSockets_name_prime = "itemSockets";
		String grid__group____groups_name_prime = "groups";
		String socketToGroup__itemSocket____target_name_prime = "target";
		String socketToGroup__group____source_name_prime = "source";
		kitchen__itemSocket____itemSockets.setSrc(kitchen);
		kitchen__itemSocket____itemSockets.setTrg(itemSocket);
		ruleresult.getTranslatedEdges().add(kitchen__itemSocket____itemSockets);
		grid__group____groups.setSrc(grid);
		grid__group____groups.setTrg(group);
		ruleresult.getCreatedEdges().add(grid__group____groups);
		socketToGroup__itemSocket____target.setSrc(socketToGroup);
		socketToGroup__itemSocket____target.setTrg(itemSocket);
		ruleresult.getCreatedEdges().add(socketToGroup__itemSocket____target);
		socketToGroup__group____source.setSrc(socketToGroup);
		socketToGroup__group____source.setTrg(group);
		ruleresult.getCreatedEdges().add(socketToGroup__group____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		kitchen__itemSocket____itemSockets.setName(kitchen__itemSocket____itemSockets_name_prime);
		grid__group____groups.setName(grid__group____groups_name_prime);
		socketToGroup__itemSocket____target.setName(socketToGroup__itemSocket____target_name_prime);
		socketToGroup__group____source.setName(socketToGroup__group____source_name_prime);
		return new Object[] { ruleresult, group, itemSocket, grid, kitchen, socketToGroup,
				kitchen__itemSocket____itemSockets, grid__group____groups, socketToGroup__itemSocket____target,
				socketToGroup__group____source };
	}

	public static final void pattern_SocketToGroup_11_5_registerobjects_expressionBBBBBBBB(SocketToGroup _this,
			PerformRuleResult ruleresult, EObject group, EObject kitchenToGrid, EObject itemSocket, EObject grid,
			EObject kitchen, EObject socketToGroup) {
		_this.registerObjects_BWD(ruleresult, group, kitchenToGrid, itemSocket, grid, kitchen, socketToGroup);

	}

	public static final PerformRuleResult pattern_SocketToGroup_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_12_1_preparereturnvalue_bindingFB(SocketToGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SocketToGroup _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_12_1_preparereturnvalue_bindingAndBlackFFB(SocketToGroup _this) {
		Object[] result_pattern_SocketToGroup_12_1_preparereturnvalue_binding = pattern_SocketToGroup_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SocketToGroup_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SocketToGroup_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SocketToGroup_12_1_preparereturnvalue_black = pattern_SocketToGroup_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SocketToGroup_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SocketToGroup_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_12_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SocketToGroup";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SocketToGroup_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("itemSocket");
		EObject _localVariable_1 = match.getObject("kitchen");
		EObject tmpItemSocket = _localVariable_0;
		EObject tmpKitchen = _localVariable_1;
		if (tmpItemSocket instanceof ItemSocket) {
			ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
			if (tmpKitchen instanceof Kitchen) {
				Kitchen kitchen = (Kitchen) tmpKitchen;
				return new Object[] { itemSocket, kitchen, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SocketToGroup_12_2_corematch_blackFBFBB(ItemSocket itemSocket,
			Kitchen kitchen, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (KitchenToGridCorr kitchenToGrid : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(kitchen, KitchenToGridCorr.class, "target")) {
			Grid grid = kitchenToGrid.getSource();
			if (grid != null) {
				_result.add(new Object[] { kitchenToGrid, itemSocket, grid, kitchen, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SocketToGroup_12_3_findcontext_blackBBBB(
			KitchenToGridCorr kitchenToGrid, ItemSocket itemSocket, Grid grid, Kitchen kitchen) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (grid.equals(kitchenToGrid.getSource())) {
			if (kitchen.getItemSockets().contains(itemSocket)) {
				if (kitchen.equals(kitchenToGrid.getTarget())) {
					_result.add(new Object[] { kitchenToGrid, itemSocket, grid, kitchen });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_12_3_findcontext_greenBBBBFFFF(KitchenToGridCorr kitchenToGrid,
			ItemSocket itemSocket, Grid grid, Kitchen kitchen) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge kitchenToGrid__grid____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge kitchen__itemSocket____itemSockets = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge kitchenToGrid__kitchen____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String kitchenToGrid__grid____source_name_prime = "source";
		String kitchen__itemSocket____itemSockets_name_prime = "itemSockets";
		String kitchenToGrid__kitchen____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(kitchenToGrid);
		isApplicableMatch.getAllContextElements().add(itemSocket);
		isApplicableMatch.getAllContextElements().add(grid);
		isApplicableMatch.getAllContextElements().add(kitchen);
		kitchenToGrid__grid____source.setSrc(kitchenToGrid);
		kitchenToGrid__grid____source.setTrg(grid);
		isApplicableMatch.getAllContextElements().add(kitchenToGrid__grid____source);
		kitchen__itemSocket____itemSockets.setSrc(kitchen);
		kitchen__itemSocket____itemSockets.setTrg(itemSocket);
		isApplicableMatch.getAllContextElements().add(kitchen__itemSocket____itemSockets);
		kitchenToGrid__kitchen____target.setSrc(kitchenToGrid);
		kitchenToGrid__kitchen____target.setTrg(kitchen);
		isApplicableMatch.getAllContextElements().add(kitchenToGrid__kitchen____target);
		kitchenToGrid__grid____source.setName(kitchenToGrid__grid____source_name_prime);
		kitchen__itemSocket____itemSockets.setName(kitchen__itemSocket____itemSockets_name_prime);
		kitchenToGrid__kitchen____target.setName(kitchenToGrid__kitchen____target_name_prime);
		return new Object[] { kitchenToGrid, itemSocket, grid, kitchen, isApplicableMatch,
				kitchenToGrid__grid____source, kitchen__itemSocket____itemSockets, kitchenToGrid__kitchen____target };
	}

	public static final Object[] pattern_SocketToGroup_12_4_solveCSP_bindingFBBBBBB(SocketToGroup _this,
			IsApplicableMatch isApplicableMatch, KitchenToGridCorr kitchenToGrid, ItemSocket itemSocket, Grid grid,
			Kitchen kitchen) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, kitchenToGrid, itemSocket, grid,
				kitchen);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, kitchenToGrid, itemSocket, grid, kitchen };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SocketToGroup_12_4_solveCSP_bindingAndBlackFBBBBBB(SocketToGroup _this,
			IsApplicableMatch isApplicableMatch, KitchenToGridCorr kitchenToGrid, ItemSocket itemSocket, Grid grid,
			Kitchen kitchen) {
		Object[] result_pattern_SocketToGroup_12_4_solveCSP_binding = pattern_SocketToGroup_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, kitchenToGrid, itemSocket, grid, kitchen);
		if (result_pattern_SocketToGroup_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SocketToGroup_12_4_solveCSP_binding[0];

			Object[] result_pattern_SocketToGroup_12_4_solveCSP_black = pattern_SocketToGroup_12_4_solveCSP_blackB(csp);
			if (result_pattern_SocketToGroup_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, kitchenToGrid, itemSocket, grid, kitchen };
			}
		}
		return null;
	}

	public static final boolean pattern_SocketToGroup_12_5_checkCSP_expressionFBB(SocketToGroup _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SocketToGroup_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SocketToGroup";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SocketToGroup_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_20_1_preparereturnvalue_bindingFB(SocketToGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SocketToGroup _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_FWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SocketToGroup _this) {
		Object[] result_pattern_SocketToGroup_20_1_preparereturnvalue_binding = pattern_SocketToGroup_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SocketToGroup_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SocketToGroup_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SocketToGroup_20_1_preparereturnvalue_black = pattern_SocketToGroup_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SocketToGroup_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SocketToGroup_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SocketToGroup_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SocketToGroup_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_groups) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGrid = _edge_groups.getSrc();
		if (tmpGrid instanceof Grid) {
			Grid grid = (Grid) tmpGrid;
			EObject tmpGroup = _edge_groups.getTrg();
			if (tmpGroup instanceof Group) {
				Group group = (Group) tmpGroup;
				if (grid.getGroups().contains(group)) {
					_result.add(new Object[] { group, grid, _edge_groups });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SocketToGroup_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SocketToGroup_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SocketToGroup _this, Match match, Group group, Grid grid) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, group, grid);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SocketToGroup_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SocketToGroup _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SocketToGroup_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_21_1_preparereturnvalue_bindingFB(SocketToGroup _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SocketToGroup _this) {
		for (EOperation __performOperation : __eClass.getEOperations()) {
			String __performOperation_name = __performOperation.getName();
			if (__performOperation_name.equals("isApplicable_BWD")) {
				for (EOperation isApplicableCC : __eClass.getEOperations()) {
					if (!__performOperation.equals(isApplicableCC)) {
						String isApplicableCC_name = isApplicableCC.getName();
						if (isApplicableCC_name.equals("isApplicable_CC")) {
							return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
						}

					}
				}
			}

		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SocketToGroup _this) {
		Object[] result_pattern_SocketToGroup_21_1_preparereturnvalue_binding = pattern_SocketToGroup_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SocketToGroup_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SocketToGroup_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SocketToGroup_21_1_preparereturnvalue_black = pattern_SocketToGroup_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SocketToGroup_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SocketToGroup_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SocketToGroup_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SocketToGroup_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_itemSockets) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpKitchen = _edge_itemSockets.getSrc();
		if (tmpKitchen instanceof Kitchen) {
			Kitchen kitchen = (Kitchen) tmpKitchen;
			EObject tmpItemSocket = _edge_itemSockets.getTrg();
			if (tmpItemSocket instanceof ItemSocket) {
				ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
				if (kitchen.getItemSockets().contains(itemSocket)) {
					_result.add(new Object[] { itemSocket, kitchen, _edge_itemSockets });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SocketToGroup_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SocketToGroup_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SocketToGroup _this, Match match, ItemSocket itemSocket, Kitchen kitchen) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, itemSocket, kitchen);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SocketToGroup_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SocketToGroup _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SocketToGroup_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_24_1_prepare_blackB(SocketToGroup _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SocketToGroup_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SocketToGroup_24_2_matchsrctrgcontext_bindingFFFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("group");
		EObject _localVariable_1 = targetMatch.getObject("itemSocket");
		EObject _localVariable_2 = sourceMatch.getObject("grid");
		EObject _localVariable_3 = targetMatch.getObject("kitchen");
		EObject tmpGroup = _localVariable_0;
		EObject tmpItemSocket = _localVariable_1;
		EObject tmpGrid = _localVariable_2;
		EObject tmpKitchen = _localVariable_3;
		if (tmpGroup instanceof Group) {
			Group group = (Group) tmpGroup;
			if (tmpItemSocket instanceof ItemSocket) {
				ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
				if (tmpGrid instanceof Grid) {
					Grid grid = (Grid) tmpGrid;
					if (tmpKitchen instanceof Kitchen) {
						Kitchen kitchen = (Kitchen) tmpKitchen;
						return new Object[] { group, itemSocket, grid, kitchen, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_24_2_matchsrctrgcontext_blackBBBBBB(Group group,
			ItemSocket itemSocket, Grid grid, Kitchen kitchen, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { group, itemSocket, grid, kitchen, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_SocketToGroup_24_2_matchsrctrgcontext_binding = pattern_SocketToGroup_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_SocketToGroup_24_2_matchsrctrgcontext_binding != null) {
			Group group = (Group) result_pattern_SocketToGroup_24_2_matchsrctrgcontext_binding[0];
			ItemSocket itemSocket = (ItemSocket) result_pattern_SocketToGroup_24_2_matchsrctrgcontext_binding[1];
			Grid grid = (Grid) result_pattern_SocketToGroup_24_2_matchsrctrgcontext_binding[2];
			Kitchen kitchen = (Kitchen) result_pattern_SocketToGroup_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_SocketToGroup_24_2_matchsrctrgcontext_black = pattern_SocketToGroup_24_2_matchsrctrgcontext_blackBBBBBB(
					group, itemSocket, grid, kitchen, sourceMatch, targetMatch);
			if (result_pattern_SocketToGroup_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { group, itemSocket, grid, kitchen, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_24_3_solvecsp_bindingFBBBBBBB(SocketToGroup _this, Group group,
			ItemSocket itemSocket, Grid grid, Kitchen kitchen, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(group, itemSocket, grid, kitchen, sourceMatch,
				targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, group, itemSocket, grid, kitchen, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SocketToGroup_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SocketToGroup_24_3_solvecsp_bindingAndBlackFBBBBBBB(SocketToGroup _this,
			Group group, ItemSocket itemSocket, Grid grid, Kitchen kitchen, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SocketToGroup_24_3_solvecsp_binding = pattern_SocketToGroup_24_3_solvecsp_bindingFBBBBBBB(
				_this, group, itemSocket, grid, kitchen, sourceMatch, targetMatch);
		if (result_pattern_SocketToGroup_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SocketToGroup_24_3_solvecsp_binding[0];

			Object[] result_pattern_SocketToGroup_24_3_solvecsp_black = pattern_SocketToGroup_24_3_solvecsp_blackB(csp);
			if (result_pattern_SocketToGroup_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, group, itemSocket, grid, kitchen, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SocketToGroup_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SocketToGroup_24_5_matchcorrcontext_blackFBBBB(Grid grid,
			Kitchen kitchen, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (KitchenToGridCorr kitchenToGrid : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(grid, KitchenToGridCorr.class, "source")) {
				if (kitchen.equals(kitchenToGrid.getTarget())) {
					_result.add(new Object[] { kitchenToGrid, grid, kitchen, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_24_5_matchcorrcontext_greenBBBF(KitchenToGridCorr kitchenToGrid,
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SocketToGroup";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(kitchenToGrid);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { kitchenToGrid, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SocketToGroup_24_6_createcorrespondence_blackBBBBB(Group group,
			ItemSocket itemSocket, Grid grid, Kitchen kitchen, CCMatch ccMatch) {
		return new Object[] { group, itemSocket, grid, kitchen, ccMatch };
	}

	public static final Object[] pattern_SocketToGroup_24_6_createcorrespondence_greenBBFB(Group group,
			ItemSocket itemSocket, CCMatch ccMatch) {
		SocketToGroupCorr socketToGroup = KitchenToGridLanguageFactory.eINSTANCE.createSocketToGroupCorr();
		socketToGroup.setTarget(itemSocket);
		socketToGroup.setSource(group);
		ccMatch.getCreateCorr().add(socketToGroup);
		return new Object[] { group, itemSocket, socketToGroup, ccMatch };
	}

	public static final Object[] pattern_SocketToGroup_24_7_addtoreturnedresult_blackBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SocketToGroup_24_7_addtoreturnedresult_greenBB(IsApplicableRuleResult result,
			CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SocketToGroup";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SocketToGroup_24_8_expressionFB(IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_27_1_matchtggpattern_blackBB(Group group, Grid grid) {
		if (grid.getGroups().contains(group)) {
			return new Object[] { group, grid };
		}
		return null;
	}

	public static final boolean pattern_SocketToGroup_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SocketToGroup_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SocketToGroup_28_1_matchtggpattern_blackBB(ItemSocket itemSocket,
			Kitchen kitchen) {
		if (kitchen.getItemSockets().contains(itemSocket)) {
			return new Object[] { itemSocket, kitchen };
		}
		return null;
	}

	public static final boolean pattern_SocketToGroup_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SocketToGroup_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SocketToGroupImpl
