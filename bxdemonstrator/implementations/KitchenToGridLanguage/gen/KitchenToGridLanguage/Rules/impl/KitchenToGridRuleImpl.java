/**
 */
package KitchenToGridLanguage.Rules.impl;

import GridLanguage.Grid;
import GridLanguage.GridLanguageFactory;

import KitchenLanguage.Kitchen;
import KitchenLanguage.KitchenLanguageFactory;

import KitchenToGridLanguage.KitchenToGridCorr;
import KitchenToGridLanguage.KitchenToGridLanguageFactory;

import KitchenToGridLanguage.Rules.KitchenToGridRule;
import KitchenToGridLanguage.Rules.RulesPackage;

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
 * An implementation of the model object '<em><b>Kitchen To Grid Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class KitchenToGridRuleImpl extends AbstractRuleImpl implements KitchenToGridRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitchenToGridRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getKitchenToGridRule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Grid grid) {

		Object[] result1_black = KitchenToGridRuleImpl.pattern_KitchenToGridRule_0_1_initialbindings_blackBBB(this,
				match, grid);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[grid] = " + grid + ".");
		}

		Object[] result2_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_0_2_SolveCSP_bindingAndBlackFBBB(this, match, grid);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[grid] = " + grid + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (KitchenToGridRuleImpl.pattern_KitchenToGridRule_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_0_4_collectelementstobetranslated_blackBB(match, grid);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[grid] = " + grid + ".");
			}
			KitchenToGridRuleImpl.pattern_KitchenToGridRule_0_4_collectelementstobetranslated_greenBB(match, grid);

			Object[] result5_black = KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_0_5_collectcontextelements_blackBB(match, grid);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[grid] = " + grid + ".");
			}
			// 
			KitchenToGridRuleImpl.pattern_KitchenToGridRule_0_6_registerobjectstomatch_expressionBBB(this, match, grid);
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_0_7_expressionF();
		} else {
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_1_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Grid grid = (Grid) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_1_1_performtransformation_greenFBFB(grid, csp);
		KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result1_green[0];
		Kitchen kitchen = (Kitchen) result1_green[2];

		Object[] result2_black = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_1_2_collecttranslatedelements_blackBBB(kitchenToGrid, grid, kitchen);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[kitchenToGrid] = "
					+ kitchenToGrid + ", " + "[grid] = " + grid + ", " + "[kitchen] = " + kitchen + ".");
		}
		Object[] result2_green = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_1_2_collecttranslatedelements_greenFBBB(kitchenToGrid, grid, kitchen);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_1_3_bookkeepingforedges_blackBBBB(ruleresult, kitchenToGrid, grid, kitchen);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[kitchenToGrid] = " + kitchenToGrid + ", " + "[grid] = " + grid + ", " + "[kitchen] = "
					+ kitchen + ".");
		}
		KitchenToGridRuleImpl.pattern_KitchenToGridRule_1_3_bookkeepingforedges_greenBBBBFF(ruleresult, kitchenToGrid,
				grid, kitchen);
		//nothing EMoflonEdge kitchenToGrid__kitchen____target = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge kitchenToGrid__grid____source = (EMoflonEdge) result3_green[5];

		// 
		// 
		KitchenToGridRuleImpl.pattern_KitchenToGridRule_1_5_registerobjects_expressionBBBBB(this, ruleresult,
				kitchenToGrid, grid, kitchen);
		return KitchenToGridRuleImpl.pattern_KitchenToGridRule_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = KitchenToGridRuleImpl.pattern_KitchenToGridRule_2_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Grid grid = (Grid) result2_binding[0];
		for (Object[] result2_black : KitchenToGridRuleImpl.pattern_KitchenToGridRule_2_2_corematch_blackBB(grid,
				match)) {
			// ForEach 
			for (Object[] result3_black : KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_2_3_findcontext_blackB(grid)) {
				Object[] result3_green = KitchenToGridRuleImpl.pattern_KitchenToGridRule_2_3_findcontext_greenBF(grid);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_2_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, grid);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[grid] = " + grid + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (KitchenToGridRuleImpl.pattern_KitchenToGridRule_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = KitchenToGridRuleImpl
							.pattern_KitchenToGridRule_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					KitchenToGridRuleImpl.pattern_KitchenToGridRule_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return KitchenToGridRuleImpl.pattern_KitchenToGridRule_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Grid grid) {
		match.registerObject("grid", grid);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Grid grid) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(100);
		literal0.setType("");

		// Create attribute variables
		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid.blockSize", true, csp);
		var_grid_blockSize.setValue(grid.getBlockSize());
		var_grid_blockSize.setType("double");

		// Create unbound variables

		// Create constraints
		SetDefaultNumber setDefaultNumber = new SetDefaultNumber();

		csp.getConstraints().add(setDefaultNumber);

		// Solve CSP
		setDefaultNumber.setRuleName("NoRuleName");
		setDefaultNumber.solve(var_grid_blockSize, literal0);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Grid grid) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(500);
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_kitchen_xSize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen.xSize", csp);
		var_kitchen_xSize.setType("double");
		Variable var_kitchen_ySize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen.ySize", csp);
		var_kitchen_ySize.setType("double");

		// Create constraints
		SetDefaultNumber setDefaultNumber = new SetDefaultNumber();
		SetDefaultNumber setDefaultNumber_0 = new SetDefaultNumber();

		csp.getConstraints().add(setDefaultNumber);
		csp.getConstraints().add(setDefaultNumber_0);

		// Solve CSP
		setDefaultNumber.setRuleName("NoRuleName");
		setDefaultNumber.solve(var_kitchen_xSize, literal0);
		setDefaultNumber_0.setRuleName("NoRuleName");
		setDefaultNumber_0.solve(var_kitchen_ySize, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("grid", grid);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid,
			EObject kitchen) {
		ruleresult.registerObject("kitchenToGrid", kitchenToGrid);
		ruleresult.registerObject("grid", grid);
		ruleresult.registerObject("kitchen", kitchen);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("grid").eClass()).equals("GridLanguage.Grid.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Kitchen kitchen) {

		Object[] result1_black = KitchenToGridRuleImpl.pattern_KitchenToGridRule_10_1_initialbindings_blackBBB(this,
				match, kitchen);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[kitchen] = " + kitchen + ".");
		}

		Object[] result2_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_10_2_SolveCSP_bindingAndBlackFBBB(this, match, kitchen);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[kitchen] = " + kitchen + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (KitchenToGridRuleImpl.pattern_KitchenToGridRule_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_10_4_collectelementstobetranslated_blackBB(match, kitchen);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[kitchen] = " + kitchen + ".");
			}
			KitchenToGridRuleImpl.pattern_KitchenToGridRule_10_4_collectelementstobetranslated_greenBB(match, kitchen);

			Object[] result5_black = KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_10_5_collectcontextelements_blackBB(match, kitchen);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[kitchen] = " + kitchen + ".");
			}
			// 
			KitchenToGridRuleImpl.pattern_KitchenToGridRule_10_6_registerobjectstomatch_expressionBBB(this, match,
					kitchen);
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_10_7_expressionF();
		} else {
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_11_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Kitchen kitchen = (Kitchen) result1_bindingAndBlack[0];
		CSP csp = (CSP) result1_bindingAndBlack[1];
		Object[] result1_green = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_11_1_performtransformation_greenFFBB(kitchen, csp);
		KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result1_green[0];
		Grid grid = (Grid) result1_green[1];

		Object[] result2_black = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_11_2_collecttranslatedelements_blackBBB(kitchenToGrid, grid, kitchen);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[kitchenToGrid] = "
					+ kitchenToGrid + ", " + "[grid] = " + grid + ", " + "[kitchen] = " + kitchen + ".");
		}
		Object[] result2_green = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_11_2_collecttranslatedelements_greenFBBB(kitchenToGrid, grid, kitchen);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_11_3_bookkeepingforedges_blackBBBB(ruleresult, kitchenToGrid, grid, kitchen);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[kitchenToGrid] = " + kitchenToGrid + ", " + "[grid] = " + grid + ", " + "[kitchen] = "
					+ kitchen + ".");
		}
		KitchenToGridRuleImpl.pattern_KitchenToGridRule_11_3_bookkeepingforedges_greenBBBBFF(ruleresult, kitchenToGrid,
				grid, kitchen);
		//nothing EMoflonEdge kitchenToGrid__kitchen____target = (EMoflonEdge) result3_green[4];
		//nothing EMoflonEdge kitchenToGrid__grid____source = (EMoflonEdge) result3_green[5];

		// 
		// 
		KitchenToGridRuleImpl.pattern_KitchenToGridRule_11_5_registerobjects_expressionBBBBB(this, ruleresult,
				kitchenToGrid, grid, kitchen);
		return KitchenToGridRuleImpl.pattern_KitchenToGridRule_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = KitchenToGridRuleImpl.pattern_KitchenToGridRule_12_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Kitchen kitchen = (Kitchen) result2_binding[0];
		for (Object[] result2_black : KitchenToGridRuleImpl.pattern_KitchenToGridRule_12_2_corematch_blackBB(kitchen,
				match)) {
			// ForEach 
			for (Object[] result3_black : KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_12_3_findcontext_blackB(kitchen)) {
				Object[] result3_green = KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_12_3_findcontext_greenBF(kitchen);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_12_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, kitchen);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[kitchen] = " + kitchen + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (KitchenToGridRuleImpl.pattern_KitchenToGridRule_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = KitchenToGridRuleImpl
							.pattern_KitchenToGridRule_12_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					KitchenToGridRuleImpl.pattern_KitchenToGridRule_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return KitchenToGridRuleImpl.pattern_KitchenToGridRule_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Kitchen kitchen) {
		match.registerObject("kitchen", kitchen);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Kitchen kitchen) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(500);
		literal0.setType("");

		// Create attribute variables
		Variable var_kitchen_xSize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen.xSize", true, csp);
		var_kitchen_xSize.setValue(kitchen.getXSize());
		var_kitchen_xSize.setType("double");
		Variable var_kitchen_ySize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen.ySize", true, csp);
		var_kitchen_ySize.setValue(kitchen.getYSize());
		var_kitchen_ySize.setType("double");

		// Create unbound variables

		// Create constraints
		SetDefaultNumber setDefaultNumber = new SetDefaultNumber();
		SetDefaultNumber setDefaultNumber_0 = new SetDefaultNumber();

		csp.getConstraints().add(setDefaultNumber);
		csp.getConstraints().add(setDefaultNumber_0);

		// Solve CSP
		setDefaultNumber.setRuleName("NoRuleName");
		setDefaultNumber.solve(var_kitchen_xSize, literal0);
		setDefaultNumber_0.setRuleName("NoRuleName");
		setDefaultNumber_0.solve(var_kitchen_ySize, literal0);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, Kitchen kitchen) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(100);
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid.blockSize", csp);
		var_grid_blockSize.setType("double");

		// Create constraints
		SetDefaultNumber setDefaultNumber = new SetDefaultNumber();

		csp.getConstraints().add(setDefaultNumber);

		// Solve CSP
		setDefaultNumber.setRuleName("NoRuleName");
		setDefaultNumber.solve(var_grid_blockSize, literal0);

		// Snapshot pattern match on which CSP is solved
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid,
			EObject kitchen) {
		ruleresult.registerObject("kitchenToGrid", kitchenToGrid);
		ruleresult.registerObject("grid", grid);
		ruleresult.registerObject("kitchen", kitchen);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("kitchen").eClass())
				.equals("KitchenLanguage.Kitchen.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_Grid_0(Grid grid) {

		Object[] result1_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = KitchenToGridRuleImpl.pattern_KitchenToGridRule_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_20_2_testcorematchandDECs_blackB(grid)) {
			Object[] result2_green = KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, grid)) {
				// 
				if (KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = KitchenToGridRuleImpl
							.pattern_KitchenToGridRule_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					KitchenToGridRuleImpl.pattern_KitchenToGridRule_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return KitchenToGridRuleImpl.pattern_KitchenToGridRule_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_Kitchen_0(Kitchen kitchen) {

		Object[] result1_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = KitchenToGridRuleImpl.pattern_KitchenToGridRule_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_21_2_testcorematchandDECs_blackB(kitchen)) {
			Object[] result2_green = KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, kitchen)) {
				// 
				if (KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = KitchenToGridRuleImpl
							.pattern_KitchenToGridRule_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					KitchenToGridRuleImpl.pattern_KitchenToGridRule_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return KitchenToGridRuleImpl.pattern_KitchenToGridRule_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("KitchenToGridRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid", true, csp);
		var_grid_blockSize.setValue(__helper.getValue("grid", "blockSize"));
		var_grid_blockSize.setType("double");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(100);
		var_literal0.setType("");

		Variable var_kitchen_xSize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen", true, csp);
		var_kitchen_xSize.setValue(__helper.getValue("kitchen", "xSize"));
		var_kitchen_xSize.setType("double");

		Variable var_literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal1.setValue(500);
		var_literal1.setType("");

		Variable var_kitchen_ySize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen", true, csp);
		var_kitchen_ySize.setValue(__helper.getValue("kitchen", "ySize"));
		var_kitchen_ySize.setType("double");

		SetDefaultNumber setDefaultNumber0 = new SetDefaultNumber();
		csp.getConstraints().add(setDefaultNumber0);

		SetDefaultNumber setDefaultNumber1 = new SetDefaultNumber();
		csp.getConstraints().add(setDefaultNumber1);

		SetDefaultNumber setDefaultNumber2 = new SetDefaultNumber();
		csp.getConstraints().add(setDefaultNumber2);

		setDefaultNumber0.setRuleName("KitchenToGridRule");
		setDefaultNumber0.solve(var_grid_blockSize, var_literal0);

		setDefaultNumber1.setRuleName("KitchenToGridRule");
		setDefaultNumber1.solve(var_kitchen_xSize, var_literal1);

		setDefaultNumber2.setRuleName("KitchenToGridRule");
		setDefaultNumber2.solve(var_kitchen_ySize, var_literal1);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_kitchen_xSize.setBound(false);
			var_kitchen_ySize.setBound(false);
			setDefaultNumber0.solve(var_grid_blockSize, var_literal0);
			setDefaultNumber1.solve(var_kitchen_xSize, var_literal1);
			setDefaultNumber2.solve(var_kitchen_ySize, var_literal1);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("kitchen", "xSize", var_kitchen_xSize.getValue());
				__helper.setValue("kitchen", "ySize", var_kitchen_ySize.getValue());
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
		ruleResult.setRule("KitchenToGridRule");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid", true, csp);
		var_grid_blockSize.setValue(__helper.getValue("grid", "blockSize"));
		var_grid_blockSize.setType("double");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(100);
		var_literal0.setType("");

		Variable var_kitchen_xSize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen", true, csp);
		var_kitchen_xSize.setValue(__helper.getValue("kitchen", "xSize"));
		var_kitchen_xSize.setType("double");

		Variable var_literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal1.setValue(500);
		var_literal1.setType("");

		Variable var_kitchen_ySize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen", true, csp);
		var_kitchen_ySize.setValue(__helper.getValue("kitchen", "ySize"));
		var_kitchen_ySize.setType("double");

		SetDefaultNumber setDefaultNumber0 = new SetDefaultNumber();
		csp.getConstraints().add(setDefaultNumber0);

		SetDefaultNumber setDefaultNumber1 = new SetDefaultNumber();
		csp.getConstraints().add(setDefaultNumber1);

		SetDefaultNumber setDefaultNumber2 = new SetDefaultNumber();
		csp.getConstraints().add(setDefaultNumber2);

		setDefaultNumber0.setRuleName("KitchenToGridRule");
		setDefaultNumber0.solve(var_kitchen_xSize, var_literal1);

		setDefaultNumber1.setRuleName("KitchenToGridRule");
		setDefaultNumber1.solve(var_kitchen_ySize, var_literal1);

		setDefaultNumber2.setRuleName("KitchenToGridRule");
		setDefaultNumber2.solve(var_grid_blockSize, var_literal0);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_grid_blockSize.setBound(false);
			setDefaultNumber0.solve(var_kitchen_xSize, var_literal1);
			setDefaultNumber1.solve(var_kitchen_ySize, var_literal1);
			setDefaultNumber2.solve(var_grid_blockSize, var_literal0);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("grid", "blockSize", var_grid_blockSize.getValue());
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

		Object[] result1_black = KitchenToGridRuleImpl.pattern_KitchenToGridRule_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = KitchenToGridRuleImpl.pattern_KitchenToGridRule_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_24_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Grid grid = (Grid) result2_bindingAndBlack[0];
		Kitchen kitchen = (Kitchen) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = KitchenToGridRuleImpl
				.pattern_KitchenToGridRule_24_3_solvecsp_bindingAndBlackFBBBBB(this, grid, kitchen, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[grid] = " + grid + ", " + "[kitchen] = " + kitchen + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (KitchenToGridRuleImpl.pattern_KitchenToGridRule_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : KitchenToGridRuleImpl
					.pattern_KitchenToGridRule_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_24_6_createcorrespondence_blackBBB(grid, kitchen, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[grid] = " + grid + ", "
							+ "[kitchen] = " + kitchen + ", " + "[ccMatch] = " + ccMatch + ".");
				}
				KitchenToGridRuleImpl.pattern_KitchenToGridRule_24_6_createcorrespondence_greenFBBB(grid, kitchen,
						ccMatch);
				//nothing KitchenToGridCorr kitchenToGrid = (KitchenToGridCorr) result6_green[0];

				Object[] result7_black = KitchenToGridRuleImpl
						.pattern_KitchenToGridRule_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				KitchenToGridRuleImpl.pattern_KitchenToGridRule_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return KitchenToGridRuleImpl.pattern_KitchenToGridRule_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Grid grid, Kitchen kitchen, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue(500);
		literal0.setType("");

		// Create attribute variables
		Variable var_kitchen_xSize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen.xSize", true, csp);
		var_kitchen_xSize.setValue(kitchen.getXSize());
		var_kitchen_xSize.setType("double");
		Variable var_kitchen_ySize = CSPFactoryHelper.eINSTANCE.createVariable("kitchen.ySize", true, csp);
		var_kitchen_ySize.setValue(kitchen.getYSize());
		var_kitchen_ySize.setType("double");

		// Create unbound variables

		// Create constraints
		SetDefaultNumber setDefaultNumber = new SetDefaultNumber();
		SetDefaultNumber setDefaultNumber_0 = new SetDefaultNumber();

		csp.getConstraints().add(setDefaultNumber);
		csp.getConstraints().add(setDefaultNumber_0);

		// Solve CSP
		setDefaultNumber.setRuleName("NoRuleName");
		setDefaultNumber.solve(var_kitchen_xSize, literal0);
		setDefaultNumber_0.setRuleName("NoRuleName");
		setDefaultNumber_0.solve(var_kitchen_ySize, literal0);
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
	public boolean checkDEC_FWD(Grid grid) {// 
		Object[] result1_black = KitchenToGridRuleImpl.pattern_KitchenToGridRule_27_1_matchtggpattern_blackB(grid);
		if (result1_black != null) {
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_27_2_expressionF();
		} else {
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Kitchen kitchen) {// 
		Object[] result1_black = KitchenToGridRuleImpl.pattern_KitchenToGridRule_28_1_matchtggpattern_blackB(kitchen);
		if (result1_black != null) {
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_28_2_expressionF();
		} else {
			return KitchenToGridRuleImpl.pattern_KitchenToGridRule_28_3_expressionF();
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
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_FWD__MATCH_GRID:
			return isAppropriate_FWD((Match) arguments.get(0), (Grid) arguments.get(1));
		case RulesPackage.KITCHEN_TO_GRID_RULE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_GRID:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Grid) arguments.get(1));
			return null;
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_GRID:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Grid) arguments.get(1));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_GRID:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Grid) arguments.get(1));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.KITCHEN_TO_GRID_RULE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_BWD__MATCH_KITCHEN:
			return isAppropriate_BWD((Match) arguments.get(0), (Kitchen) arguments.get(1));
		case RulesPackage.KITCHEN_TO_GRID_RULE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_KITCHEN:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Kitchen) arguments.get(1));
			return null;
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_KITCHEN:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Kitchen) arguments.get(1));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_KITCHEN:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (Kitchen) arguments.get(1));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3));
			return null;
		case RulesPackage.KITCHEN_TO_GRID_RULE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_FWD_GRID_0__GRID:
			return isAppropriate_FWD_Grid_0((Grid) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPROPRIATE_BWD_KITCHEN_0__KITCHEN:
			return isAppropriate_BWD_Kitchen_0((Kitchen) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_SOLVE_CSP_CC__GRID_KITCHEN_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Grid) arguments.get(0), (Kitchen) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.KITCHEN_TO_GRID_RULE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___CHECK_DEC_FWD__GRID:
			return checkDEC_FWD((Grid) arguments.get(0));
		case RulesPackage.KITCHEN_TO_GRID_RULE___CHECK_DEC_BWD__KITCHEN:
			return checkDEC_BWD((Kitchen) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_KitchenToGridRule_0_1_initialbindings_blackBBB(KitchenToGridRule _this,
			Match match, Grid grid) {
		return new Object[] { _this, match, grid };
	}

	public static final Object[] pattern_KitchenToGridRule_0_2_SolveCSP_bindingFBBB(KitchenToGridRule _this,
			Match match, Grid grid) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, grid);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, grid };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KitchenToGridRule_0_2_SolveCSP_bindingAndBlackFBBB(KitchenToGridRule _this,
			Match match, Grid grid) {
		Object[] result_pattern_KitchenToGridRule_0_2_SolveCSP_binding = pattern_KitchenToGridRule_0_2_SolveCSP_bindingFBBB(
				_this, match, grid);
		if (result_pattern_KitchenToGridRule_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KitchenToGridRule_0_2_SolveCSP_binding[0];

			Object[] result_pattern_KitchenToGridRule_0_2_SolveCSP_black = pattern_KitchenToGridRule_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_KitchenToGridRule_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, grid };
			}
		}
		return null;
	}

	public static final boolean pattern_KitchenToGridRule_0_3_CheckCSP_expressionFBB(KitchenToGridRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_0_4_collectelementstobetranslated_blackBB(Match match,
			Grid grid) {
		return new Object[] { match, grid };
	}

	public static final Object[] pattern_KitchenToGridRule_0_4_collectelementstobetranslated_greenBB(Match match,
			Grid grid) {
		match.getToBeTranslatedNodes().add(grid);
		return new Object[] { match, grid };
	}

	public static final Object[] pattern_KitchenToGridRule_0_5_collectcontextelements_blackBB(Match match, Grid grid) {
		return new Object[] { match, grid };
	}

	public static final void pattern_KitchenToGridRule_0_6_registerobjectstomatch_expressionBBB(KitchenToGridRule _this,
			Match match, Grid grid) {
		_this.registerObjectsToMatch_FWD(match, grid);

	}

	public static final boolean pattern_KitchenToGridRule_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KitchenToGridRule_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_1_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("grid");
		EObject tmpGrid = _localVariable_0;
		if (tmpGrid instanceof Grid) {
			Grid grid = (Grid) tmpGrid;
			return new Object[] { grid, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_1_1_performtransformation_blackBFBB(Grid grid,
			KitchenToGridRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { grid, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_1_1_performtransformation_bindingAndBlackFFBB(
			KitchenToGridRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_KitchenToGridRule_1_1_performtransformation_binding = pattern_KitchenToGridRule_1_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_KitchenToGridRule_1_1_performtransformation_binding != null) {
			Grid grid = (Grid) result_pattern_KitchenToGridRule_1_1_performtransformation_binding[0];

			Object[] result_pattern_KitchenToGridRule_1_1_performtransformation_black = pattern_KitchenToGridRule_1_1_performtransformation_blackBFBB(
					grid, _this, isApplicableMatch);
			if (result_pattern_KitchenToGridRule_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_KitchenToGridRule_1_1_performtransformation_black[1];

				return new Object[] { grid, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_1_1_performtransformation_greenFBFB(Grid grid, CSP csp) {
		KitchenToGridCorr kitchenToGrid = KitchenToGridLanguageFactory.eINSTANCE.createKitchenToGridCorr();
		Kitchen kitchen = KitchenLanguageFactory.eINSTANCE.createKitchen();
		Object _localVariable_0 = csp.getValue("kitchen", "xSize");
		Object _localVariable_1 = csp.getValue("kitchen", "ySize");
		kitchenToGrid.setSource(grid);
		kitchenToGrid.setTarget(kitchen);
		double kitchen_xSize_prime = (double) _localVariable_0;
		double kitchen_ySize_prime = (double) _localVariable_1;
		kitchen.setXSize(Double.valueOf(kitchen_xSize_prime));
		kitchen.setYSize(Double.valueOf(kitchen_ySize_prime));
		return new Object[] { kitchenToGrid, grid, kitchen, csp };
	}

	public static final Object[] pattern_KitchenToGridRule_1_2_collecttranslatedelements_blackBBB(
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen) {
		return new Object[] { kitchenToGrid, grid, kitchen };
	}

	public static final Object[] pattern_KitchenToGridRule_1_2_collecttranslatedelements_greenFBBB(
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(kitchenToGrid);
		ruleresult.getTranslatedElements().add(grid);
		ruleresult.getCreatedElements().add(kitchen);
		return new Object[] { ruleresult, kitchenToGrid, grid, kitchen };
	}

	public static final Object[] pattern_KitchenToGridRule_1_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid, EObject kitchen) {
		if (!grid.equals(kitchenToGrid)) {
			if (!grid.equals(kitchen)) {
				if (!kitchen.equals(kitchenToGrid)) {
					return new Object[] { ruleresult, kitchenToGrid, grid, kitchen };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_1_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid, EObject kitchen) {
		EMoflonEdge kitchenToGrid__kitchen____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge kitchenToGrid__grid____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "KitchenToGridRule";
		String kitchenToGrid__kitchen____target_name_prime = "target";
		String kitchenToGrid__grid____source_name_prime = "source";
		kitchenToGrid__kitchen____target.setSrc(kitchenToGrid);
		kitchenToGrid__kitchen____target.setTrg(kitchen);
		ruleresult.getCreatedEdges().add(kitchenToGrid__kitchen____target);
		kitchenToGrid__grid____source.setSrc(kitchenToGrid);
		kitchenToGrid__grid____source.setTrg(grid);
		ruleresult.getCreatedEdges().add(kitchenToGrid__grid____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		kitchenToGrid__kitchen____target.setName(kitchenToGrid__kitchen____target_name_prime);
		kitchenToGrid__grid____source.setName(kitchenToGrid__grid____source_name_prime);
		return new Object[] { ruleresult, kitchenToGrid, grid, kitchen, kitchenToGrid__kitchen____target,
				kitchenToGrid__grid____source };
	}

	public static final void pattern_KitchenToGridRule_1_5_registerobjects_expressionBBBBB(KitchenToGridRule _this,
			PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid, EObject kitchen) {
		_this.registerObjects_FWD(ruleresult, kitchenToGrid, grid, kitchen);

	}

	public static final PerformRuleResult pattern_KitchenToGridRule_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_2_1_preparereturnvalue_bindingFB(KitchenToGridRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_2_1_preparereturnvalue_blackFBB(EClass eClass,
			KitchenToGridRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_2_1_preparereturnvalue_bindingAndBlackFFB(
			KitchenToGridRule _this) {
		Object[] result_pattern_KitchenToGridRule_2_1_preparereturnvalue_binding = pattern_KitchenToGridRule_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KitchenToGridRule_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_KitchenToGridRule_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KitchenToGridRule_2_1_preparereturnvalue_black = pattern_KitchenToGridRule_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_KitchenToGridRule_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_KitchenToGridRule_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_2_1_preparereturnvalue_greenBF(EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "KitchenToGridRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_KitchenToGridRule_2_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("grid");
		EObject tmpGrid = _localVariable_0;
		if (tmpGrid instanceof Grid) {
			Grid grid = (Grid) tmpGrid;
			return new Object[] { grid, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_KitchenToGridRule_2_2_corematch_blackBB(Grid grid, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { grid, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_KitchenToGridRule_2_3_findcontext_blackB(Grid grid) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { grid });
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_2_3_findcontext_greenBF(Grid grid) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(grid);
		return new Object[] { grid, isApplicableMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_2_4_solveCSP_bindingFBBB(KitchenToGridRule _this,
			IsApplicableMatch isApplicableMatch, Grid grid) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, grid);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, grid };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KitchenToGridRule_2_4_solveCSP_bindingAndBlackFBBB(KitchenToGridRule _this,
			IsApplicableMatch isApplicableMatch, Grid grid) {
		Object[] result_pattern_KitchenToGridRule_2_4_solveCSP_binding = pattern_KitchenToGridRule_2_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, grid);
		if (result_pattern_KitchenToGridRule_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KitchenToGridRule_2_4_solveCSP_binding[0];

			Object[] result_pattern_KitchenToGridRule_2_4_solveCSP_black = pattern_KitchenToGridRule_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_KitchenToGridRule_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, grid };
			}
		}
		return null;
	}

	public static final boolean pattern_KitchenToGridRule_2_5_checkCSP_expressionFBB(KitchenToGridRule _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "KitchenToGridRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_KitchenToGridRule_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_10_1_initialbindings_blackBBB(KitchenToGridRule _this,
			Match match, Kitchen kitchen) {
		return new Object[] { _this, match, kitchen };
	}

	public static final Object[] pattern_KitchenToGridRule_10_2_SolveCSP_bindingFBBB(KitchenToGridRule _this,
			Match match, Kitchen kitchen) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, kitchen);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, kitchen };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KitchenToGridRule_10_2_SolveCSP_bindingAndBlackFBBB(KitchenToGridRule _this,
			Match match, Kitchen kitchen) {
		Object[] result_pattern_KitchenToGridRule_10_2_SolveCSP_binding = pattern_KitchenToGridRule_10_2_SolveCSP_bindingFBBB(
				_this, match, kitchen);
		if (result_pattern_KitchenToGridRule_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KitchenToGridRule_10_2_SolveCSP_binding[0];

			Object[] result_pattern_KitchenToGridRule_10_2_SolveCSP_black = pattern_KitchenToGridRule_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_KitchenToGridRule_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, kitchen };
			}
		}
		return null;
	}

	public static final boolean pattern_KitchenToGridRule_10_3_CheckCSP_expressionFBB(KitchenToGridRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_10_4_collectelementstobetranslated_blackBB(Match match,
			Kitchen kitchen) {
		return new Object[] { match, kitchen };
	}

	public static final Object[] pattern_KitchenToGridRule_10_4_collectelementstobetranslated_greenBB(Match match,
			Kitchen kitchen) {
		match.getToBeTranslatedNodes().add(kitchen);
		return new Object[] { match, kitchen };
	}

	public static final Object[] pattern_KitchenToGridRule_10_5_collectcontextelements_blackBB(Match match,
			Kitchen kitchen) {
		return new Object[] { match, kitchen };
	}

	public static final void pattern_KitchenToGridRule_10_6_registerobjectstomatch_expressionBBB(
			KitchenToGridRule _this, Match match, Kitchen kitchen) {
		_this.registerObjectsToMatch_BWD(match, kitchen);

	}

	public static final boolean pattern_KitchenToGridRule_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KitchenToGridRule_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_11_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("kitchen");
		EObject tmpKitchen = _localVariable_0;
		if (tmpKitchen instanceof Kitchen) {
			Kitchen kitchen = (Kitchen) tmpKitchen;
			return new Object[] { kitchen, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_11_1_performtransformation_blackBFBB(Kitchen kitchen,
			KitchenToGridRule _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { kitchen, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_11_1_performtransformation_bindingAndBlackFFBB(
			KitchenToGridRule _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_KitchenToGridRule_11_1_performtransformation_binding = pattern_KitchenToGridRule_11_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_KitchenToGridRule_11_1_performtransformation_binding != null) {
			Kitchen kitchen = (Kitchen) result_pattern_KitchenToGridRule_11_1_performtransformation_binding[0];

			Object[] result_pattern_KitchenToGridRule_11_1_performtransformation_black = pattern_KitchenToGridRule_11_1_performtransformation_blackBFBB(
					kitchen, _this, isApplicableMatch);
			if (result_pattern_KitchenToGridRule_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_KitchenToGridRule_11_1_performtransformation_black[1];

				return new Object[] { kitchen, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_11_1_performtransformation_greenFFBB(Kitchen kitchen,
			CSP csp) {
		KitchenToGridCorr kitchenToGrid = KitchenToGridLanguageFactory.eINSTANCE.createKitchenToGridCorr();
		Grid grid = GridLanguageFactory.eINSTANCE.createGrid();
		Object _localVariable_0 = csp.getValue("grid", "blockSize");
		kitchenToGrid.setTarget(kitchen);
		kitchenToGrid.setSource(grid);
		double grid_blockSize_prime = (double) _localVariable_0;
		grid.setBlockSize(Double.valueOf(grid_blockSize_prime));
		return new Object[] { kitchenToGrid, grid, kitchen, csp };
	}

	public static final Object[] pattern_KitchenToGridRule_11_2_collecttranslatedelements_blackBBB(
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen) {
		return new Object[] { kitchenToGrid, grid, kitchen };
	}

	public static final Object[] pattern_KitchenToGridRule_11_2_collecttranslatedelements_greenFBBB(
			KitchenToGridCorr kitchenToGrid, Grid grid, Kitchen kitchen) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedLinkElements().add(kitchenToGrid);
		ruleresult.getCreatedElements().add(grid);
		ruleresult.getTranslatedElements().add(kitchen);
		return new Object[] { ruleresult, kitchenToGrid, grid, kitchen };
	}

	public static final Object[] pattern_KitchenToGridRule_11_3_bookkeepingforedges_blackBBBB(
			PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid, EObject kitchen) {
		if (!grid.equals(kitchenToGrid)) {
			if (!grid.equals(kitchen)) {
				if (!kitchen.equals(kitchenToGrid)) {
					return new Object[] { ruleresult, kitchenToGrid, grid, kitchen };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_11_3_bookkeepingforedges_greenBBBBFF(
			PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid, EObject kitchen) {
		EMoflonEdge kitchenToGrid__kitchen____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge kitchenToGrid__grid____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "KitchenToGridRule";
		String kitchenToGrid__kitchen____target_name_prime = "target";
		String kitchenToGrid__grid____source_name_prime = "source";
		kitchenToGrid__kitchen____target.setSrc(kitchenToGrid);
		kitchenToGrid__kitchen____target.setTrg(kitchen);
		ruleresult.getCreatedEdges().add(kitchenToGrid__kitchen____target);
		kitchenToGrid__grid____source.setSrc(kitchenToGrid);
		kitchenToGrid__grid____source.setTrg(grid);
		ruleresult.getCreatedEdges().add(kitchenToGrid__grid____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		kitchenToGrid__kitchen____target.setName(kitchenToGrid__kitchen____target_name_prime);
		kitchenToGrid__grid____source.setName(kitchenToGrid__grid____source_name_prime);
		return new Object[] { ruleresult, kitchenToGrid, grid, kitchen, kitchenToGrid__kitchen____target,
				kitchenToGrid__grid____source };
	}

	public static final void pattern_KitchenToGridRule_11_5_registerobjects_expressionBBBBB(KitchenToGridRule _this,
			PerformRuleResult ruleresult, EObject kitchenToGrid, EObject grid, EObject kitchen) {
		_this.registerObjects_BWD(ruleresult, kitchenToGrid, grid, kitchen);

	}

	public static final PerformRuleResult pattern_KitchenToGridRule_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_12_1_preparereturnvalue_bindingFB(KitchenToGridRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_12_1_preparereturnvalue_blackFBB(EClass eClass,
			KitchenToGridRule _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_12_1_preparereturnvalue_bindingAndBlackFFB(
			KitchenToGridRule _this) {
		Object[] result_pattern_KitchenToGridRule_12_1_preparereturnvalue_binding = pattern_KitchenToGridRule_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KitchenToGridRule_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_KitchenToGridRule_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KitchenToGridRule_12_1_preparereturnvalue_black = pattern_KitchenToGridRule_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_KitchenToGridRule_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_KitchenToGridRule_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "KitchenToGridRule";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_KitchenToGridRule_12_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("kitchen");
		EObject tmpKitchen = _localVariable_0;
		if (tmpKitchen instanceof Kitchen) {
			Kitchen kitchen = (Kitchen) tmpKitchen;
			return new Object[] { kitchen, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_KitchenToGridRule_12_2_corematch_blackBB(Kitchen kitchen,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { kitchen, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_KitchenToGridRule_12_3_findcontext_blackB(Kitchen kitchen) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { kitchen });
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_12_3_findcontext_greenBF(Kitchen kitchen) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(kitchen);
		return new Object[] { kitchen, isApplicableMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_12_4_solveCSP_bindingFBBB(KitchenToGridRule _this,
			IsApplicableMatch isApplicableMatch, Kitchen kitchen) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, kitchen);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, kitchen };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KitchenToGridRule_12_4_solveCSP_bindingAndBlackFBBB(KitchenToGridRule _this,
			IsApplicableMatch isApplicableMatch, Kitchen kitchen) {
		Object[] result_pattern_KitchenToGridRule_12_4_solveCSP_binding = pattern_KitchenToGridRule_12_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, kitchen);
		if (result_pattern_KitchenToGridRule_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KitchenToGridRule_12_4_solveCSP_binding[0];

			Object[] result_pattern_KitchenToGridRule_12_4_solveCSP_black = pattern_KitchenToGridRule_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_KitchenToGridRule_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, kitchen };
			}
		}
		return null;
	}

	public static final boolean pattern_KitchenToGridRule_12_5_checkCSP_expressionFBB(KitchenToGridRule _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "KitchenToGridRule";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_KitchenToGridRule_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_20_1_preparereturnvalue_bindingFB(KitchenToGridRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			KitchenToGridRule _this) {
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

	public static final Object[] pattern_KitchenToGridRule_20_1_preparereturnvalue_bindingAndBlackFFBF(
			KitchenToGridRule _this) {
		Object[] result_pattern_KitchenToGridRule_20_1_preparereturnvalue_binding = pattern_KitchenToGridRule_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KitchenToGridRule_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_KitchenToGridRule_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KitchenToGridRule_20_1_preparereturnvalue_black = pattern_KitchenToGridRule_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_KitchenToGridRule_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_KitchenToGridRule_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_KitchenToGridRule_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_KitchenToGridRule_20_2_testcorematchandDECs_blackB(Grid grid) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { grid });
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_KitchenToGridRule_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			KitchenToGridRule _this, Match match, Grid grid) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, grid);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_KitchenToGridRule_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			KitchenToGridRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_KitchenToGridRule_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_21_1_preparereturnvalue_bindingFB(KitchenToGridRule _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			KitchenToGridRule _this) {
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

	public static final Object[] pattern_KitchenToGridRule_21_1_preparereturnvalue_bindingAndBlackFFBF(
			KitchenToGridRule _this) {
		Object[] result_pattern_KitchenToGridRule_21_1_preparereturnvalue_binding = pattern_KitchenToGridRule_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KitchenToGridRule_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_KitchenToGridRule_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KitchenToGridRule_21_1_preparereturnvalue_black = pattern_KitchenToGridRule_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_KitchenToGridRule_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_KitchenToGridRule_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_KitchenToGridRule_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_KitchenToGridRule_21_2_testcorematchandDECs_blackB(Kitchen kitchen) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { kitchen });
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_KitchenToGridRule_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			KitchenToGridRule _this, Match match, Kitchen kitchen) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, kitchen);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_KitchenToGridRule_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			KitchenToGridRule _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_KitchenToGridRule_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_24_1_prepare_blackB(KitchenToGridRule _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_KitchenToGridRule_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_KitchenToGridRule_24_2_matchsrctrgcontext_bindingFFBB(Match sourceMatch,
			Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("grid");
		EObject _localVariable_1 = targetMatch.getObject("kitchen");
		EObject tmpGrid = _localVariable_0;
		EObject tmpKitchen = _localVariable_1;
		if (tmpGrid instanceof Grid) {
			Grid grid = (Grid) tmpGrid;
			if (tmpKitchen instanceof Kitchen) {
				Kitchen kitchen = (Kitchen) tmpKitchen;
				return new Object[] { grid, kitchen, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_24_2_matchsrctrgcontext_blackBBBB(Grid grid, Kitchen kitchen,
			Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { grid, kitchen, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_24_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_KitchenToGridRule_24_2_matchsrctrgcontext_binding = pattern_KitchenToGridRule_24_2_matchsrctrgcontext_bindingFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_KitchenToGridRule_24_2_matchsrctrgcontext_binding != null) {
			Grid grid = (Grid) result_pattern_KitchenToGridRule_24_2_matchsrctrgcontext_binding[0];
			Kitchen kitchen = (Kitchen) result_pattern_KitchenToGridRule_24_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_KitchenToGridRule_24_2_matchsrctrgcontext_black = pattern_KitchenToGridRule_24_2_matchsrctrgcontext_blackBBBB(
					grid, kitchen, sourceMatch, targetMatch);
			if (result_pattern_KitchenToGridRule_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { grid, kitchen, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_24_3_solvecsp_bindingFBBBBB(KitchenToGridRule _this,
			Grid grid, Kitchen kitchen, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(grid, kitchen, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, grid, kitchen, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_KitchenToGridRule_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KitchenToGridRule_24_3_solvecsp_bindingAndBlackFBBBBB(KitchenToGridRule _this,
			Grid grid, Kitchen kitchen, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_KitchenToGridRule_24_3_solvecsp_binding = pattern_KitchenToGridRule_24_3_solvecsp_bindingFBBBBB(
				_this, grid, kitchen, sourceMatch, targetMatch);
		if (result_pattern_KitchenToGridRule_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_KitchenToGridRule_24_3_solvecsp_binding[0];

			Object[] result_pattern_KitchenToGridRule_24_3_solvecsp_black = pattern_KitchenToGridRule_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_KitchenToGridRule_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, grid, kitchen, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_KitchenToGridRule_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_KitchenToGridRule_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "KitchenToGridRule";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_24_6_createcorrespondence_blackBBB(Grid grid,
			Kitchen kitchen, CCMatch ccMatch) {
		return new Object[] { grid, kitchen, ccMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_24_6_createcorrespondence_greenFBBB(Grid grid,
			Kitchen kitchen, CCMatch ccMatch) {
		KitchenToGridCorr kitchenToGrid = KitchenToGridLanguageFactory.eINSTANCE.createKitchenToGridCorr();
		kitchenToGrid.setTarget(kitchen);
		kitchenToGrid.setSource(grid);
		ccMatch.getCreateCorr().add(kitchenToGrid);
		return new Object[] { kitchenToGrid, grid, kitchen, ccMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_KitchenToGridRule_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "KitchenToGridRule";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_KitchenToGridRule_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_27_1_matchtggpattern_blackB(Grid grid) {
		return new Object[] { grid };
	}

	public static final boolean pattern_KitchenToGridRule_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KitchenToGridRule_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_KitchenToGridRule_28_1_matchtggpattern_blackB(Kitchen kitchen) {
		return new Object[] { kitchen };
	}

	public static final boolean pattern_KitchenToGridRule_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KitchenToGridRule_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //KitchenToGridRuleImpl
