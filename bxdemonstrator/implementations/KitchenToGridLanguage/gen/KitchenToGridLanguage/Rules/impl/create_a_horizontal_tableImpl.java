/**
 */
package KitchenToGridLanguage.Rules.impl;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.Group;

import KitchenLanguage.ItemSocket;
import KitchenLanguage.KitchenLanguageFactory;
import KitchenLanguage.Table;

import KitchenToGridLanguage.Rules.RulesPackage;
import KitchenToGridLanguage.Rules.create_a_horizontal_table;

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
 * An implementation of the model object '<em><b>create ahorizontal table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class create_a_horizontal_tableImpl extends AbstractRuleImpl implements create_a_horizontal_table {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected create_a_horizontal_tableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getcreate_a_horizontal_table();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {

		Object[] result1_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_0_1_initialbindings_blackBBBBBB(this, match, firstBlock, grid,
						secondBlock, group);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[firstBlock] = " + firstBlock + ", " + "[grid] = " + grid + ", "
					+ "[secondBlock] = " + secondBlock + ", " + "[group] = " + group + ".");
		}

		Object[] result2_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_0_2_SolveCSP_bindingAndBlackFBBBBBB(this, match, firstBlock, grid,
						secondBlock, group);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[firstBlock] = " + firstBlock + ", " + "[grid] = " + grid + ", "
					+ "[secondBlock] = " + secondBlock + ", " + "[group] = " + group + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_0_4_collectelementstobetranslated_blackBBBBB(match, firstBlock,
							grid, secondBlock, group);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[firstBlock] = " + firstBlock + ", " + "[grid] = " + grid + ", " + "[secondBlock] = "
						+ secondBlock + ", " + "[group] = " + group + ".");
			}
			create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_0_4_collectelementstobetranslated_greenBBBBFFFF(match,
							firstBlock, secondBlock, group);
			//nothing EMoflonEdge group__secondBlock____occupies = (EMoflonEdge) result4_green[4];
			//nothing EMoflonEdge secondBlock__group____isOccupiedBy = (EMoflonEdge) result4_green[5];
			//nothing EMoflonEdge group__firstBlock____occupies = (EMoflonEdge) result4_green[6];
			//nothing EMoflonEdge firstBlock__group____isOccupiedBy = (EMoflonEdge) result4_green[7];

			Object[] result5_black = create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_0_5_collectcontextelements_blackBBBBB(match, firstBlock, grid,
							secondBlock, group);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[firstBlock] = " + firstBlock + ", " + "[grid] = " + grid + ", " + "[secondBlock] = "
						+ secondBlock + ", " + "[group] = " + group + ".");
			}
			create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_0_5_collectcontextelements_greenBBBBBFFFFF(
					match, firstBlock, grid, secondBlock, group);
			//nothing EMoflonEdge firstBlock__secondBlock____e = (EMoflonEdge) result5_green[5];
			//nothing EMoflonEdge secondBlock__firstBlock____w = (EMoflonEdge) result5_green[6];
			//nothing EMoflonEdge grid__group____groups = (EMoflonEdge) result5_green[7];
			//nothing EMoflonEdge grid__secondBlock____blocks = (EMoflonEdge) result5_green[8];
			//nothing EMoflonEdge grid__firstBlock____blocks = (EMoflonEdge) result5_green[9];

			// 
			create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_0_6_registerobjectstomatch_expressionBBBBBB(
					this, match, firstBlock, grid, secondBlock, group);
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_0_7_expressionF();
		} else {
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_1_1_performtransformation_bindingAndBlackFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result1_bindingAndBlack[0];
		Block firstBlock = (Block) result1_bindingAndBlack[1];
		Grid grid = (Grid) result1_bindingAndBlack[2];
		ItemSocket itemSocket = (ItemSocket) result1_bindingAndBlack[3];
		Block secondBlock = (Block) result1_bindingAndBlack[4];
		Group group = (Group) result1_bindingAndBlack[5];
		CSP csp = (CSP) result1_bindingAndBlack[6];
		Object[] result1_green = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_1_1_performtransformation_greenFBB(itemSocket, csp);
		Table item = (Table) result1_green[0];

		Object[] result2_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_1_2_collecttranslatedelements_blackB(item);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[item] = " + item + ".");
		}
		Object[] result2_green = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_1_2_collecttranslatedelements_greenFB(item);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_1_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, socketToGroup,
						item, firstBlock, grid, itemSocket, secondBlock, group);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[socketToGroup] = " + socketToGroup + ", " + "[item] = " + item + ", " + "[firstBlock] = "
					+ firstBlock + ", " + "[grid] = " + grid + ", " + "[itemSocket] = " + itemSocket + ", "
					+ "[secondBlock] = " + secondBlock + ", " + "[group] = " + group + ".");
		}
		create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, item, firstBlock, itemSocket, secondBlock, group);
		//nothing EMoflonEdge itemSocket__item____item = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge group__secondBlock____occupies = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge secondBlock__group____isOccupiedBy = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge group__firstBlock____occupies = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge firstBlock__group____isOccupiedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_1_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group);
		return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_2_2_corematch_bindingFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Block firstBlock = (Block) result2_binding[0];
		Grid grid = (Grid) result2_binding[1];
		Block secondBlock = (Block) result2_binding[2];
		Group group = (Group) result2_binding[3];
		for (Object[] result2_black : create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_2_2_corematch_blackFBBFBBB(firstBlock, grid, secondBlock, group,
						match)) {
			SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result2_black[0];
			ItemSocket itemSocket = (ItemSocket) result2_black[3];
			// ForEach 
			for (Object[] result3_black : create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_2_3_findcontext_blackBBBBBB(socketToGroup, firstBlock, grid,
							itemSocket, secondBlock, group)) {
				Object[] result3_green = create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_2_3_findcontext_greenBBBBBBFFFFFFFFFFFF(socketToGroup,
								firstBlock, grid, itemSocket, secondBlock, group);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[6];
				//nothing EMoflonEdge socketToGroup__group____source = (EMoflonEdge) result3_green[7];
				//nothing EMoflonEdge group__secondBlock____occupies = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge secondBlock__group____isOccupiedBy = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge firstBlock__secondBlock____e = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge secondBlock__firstBlock____w = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge grid__group____groups = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge grid__secondBlock____blocks = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge group__firstBlock____occupies = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge firstBlock__group____isOccupiedBy = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge socketToGroup__itemSocket____target = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge grid__firstBlock____blocks = (EMoflonEdge) result3_green[17];

				Object[] result4_bindingAndBlack = create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_2_4_solveCSP_bindingAndBlackFBBBBBBBB(this,
								isApplicableMatch, socketToGroup, firstBlock, grid, itemSocket, secondBlock, group);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[socketToGroup] = " + socketToGroup
							+ ", " + "[firstBlock] = " + firstBlock + ", " + "[grid] = " + grid + ", "
							+ "[itemSocket] = " + itemSocket + ", " + "[secondBlock] = " + secondBlock + ", "
							+ "[group] = " + group + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_2_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = create_a_horizontal_tableImpl
							.pattern_create_a_horizontal_table_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		match.registerObject("firstBlock", firstBlock);
		match.registerObject("grid", grid);
		match.registerObject("secondBlock", secondBlock);
		match.registerObject("group", group);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SocketToGroupCorr socketToGroup,
			Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid.blockSize", true, csp);
		var_grid_blockSize.setValue(grid.getBlockSize());
		var_grid_blockSize.setType("double");
		Variable var_firstBlock_yIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock.yIndex", true, csp);
		var_firstBlock_yIndex.setValue(firstBlock.getYIndex());
		var_firstBlock_yIndex.setType("int");
		Variable var_firstBlock_xIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock.xIndex", true, csp);
		var_firstBlock_xIndex.setValue(firstBlock.getXIndex());
		var_firstBlock_xIndex.setType("int");

		// Create unbound variables
		Variable var_item_yPos = CSPFactoryHelper.eINSTANCE.createVariable("item.yPos", csp);
		var_item_yPos.setType("double");
		Variable var_item_xPos = CSPFactoryHelper.eINSTANCE.createVariable("item.xPos", csp);
		var_item_xPos.setType("double");

		// Create constraints
		PosToIndex posToIndex = new PosToIndex();
		PosToIndex posToIndex_0 = new PosToIndex();

		csp.getConstraints().add(posToIndex);
		csp.getConstraints().add(posToIndex_0);

		// Solve CSP
		posToIndex.setRuleName("NoRuleName");
		posToIndex.solve(var_grid_blockSize, var_item_yPos, var_firstBlock_yIndex);
		posToIndex_0.setRuleName("NoRuleName");
		posToIndex_0.solve(var_grid_blockSize, var_item_xPos, var_firstBlock_xIndex);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("socketToGroup", socketToGroup);
		isApplicableMatch.registerObject("firstBlock", firstBlock);
		isApplicableMatch.registerObject("grid", grid);
		isApplicableMatch.registerObject("itemSocket", itemSocket);
		isApplicableMatch.registerObject("secondBlock", secondBlock);
		isApplicableMatch.registerObject("group", group);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject socketToGroup, EObject item,
			EObject firstBlock, EObject grid, EObject itemSocket, EObject secondBlock, EObject group) {
		ruleresult.registerObject("socketToGroup", socketToGroup);
		ruleresult.registerObject("item", item);
		ruleresult.registerObject("firstBlock", firstBlock);
		ruleresult.registerObject("grid", grid);
		ruleresult.registerObject("itemSocket", itemSocket);
		ruleresult.registerObject("secondBlock", secondBlock);
		ruleresult.registerObject("group", group);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, Table item, ItemSocket itemSocket) {

		Object[] result1_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_10_1_initialbindings_blackBBBB(this, match, item, itemSocket);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[item] = " + item + ", " + "[itemSocket] = " + itemSocket + ".");
		}

		Object[] result2_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, item, itemSocket);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[item] = " + item + ", " + "[itemSocket] = " + itemSocket + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_10_4_collectelementstobetranslated_blackBBB(match, item,
							itemSocket);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[item] = " + item + ", " + "[itemSocket] = " + itemSocket + ".");
			}
			create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_10_4_collectelementstobetranslated_greenBBBF(match, item,
							itemSocket);
			//nothing EMoflonEdge itemSocket__item____item = (EMoflonEdge) result4_green[3];

			Object[] result5_black = create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_10_5_collectcontextelements_blackBBB(match, item, itemSocket);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[item] = " + item + ", " + "[itemSocket] = " + itemSocket + ".");
			}
			create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_10_5_collectcontextelements_greenBB(match,
					itemSocket);

			// 
			create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_10_6_registerobjectstomatch_expressionBBBB(
					this, match, item, itemSocket);
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_10_7_expressionF();
		} else {
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result1_bindingAndBlack[0];
		Table item = (Table) result1_bindingAndBlack[1];
		Block firstBlock = (Block) result1_bindingAndBlack[2];
		Grid grid = (Grid) result1_bindingAndBlack[3];
		ItemSocket itemSocket = (ItemSocket) result1_bindingAndBlack[4];
		Block secondBlock = (Block) result1_bindingAndBlack[5];
		Group group = (Group) result1_bindingAndBlack[6];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[7];
		create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_11_1_performtransformation_greenBBB(firstBlock,
				secondBlock, group);

		Object[] result2_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_11_2_collecttranslatedelements_blackB(item);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[item] = " + item + ".");
		}
		Object[] result2_green = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_11_2_collecttranslatedelements_greenFB(item);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_11_3_bookkeepingforedges_blackBBBBBBBB(ruleresult, socketToGroup,
						item, firstBlock, grid, itemSocket, secondBlock, group);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[socketToGroup] = " + socketToGroup + ", " + "[item] = " + item + ", " + "[firstBlock] = "
					+ firstBlock + ", " + "[grid] = " + grid + ", " + "[itemSocket] = " + itemSocket + ", "
					+ "[secondBlock] = " + secondBlock + ", " + "[group] = " + group + ".");
		}
		create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
				ruleresult, item, firstBlock, itemSocket, secondBlock, group);
		//nothing EMoflonEdge itemSocket__item____item = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge group__secondBlock____occupies = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge secondBlock__group____isOccupiedBy = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge group__firstBlock____occupies = (EMoflonEdge) result3_green[9];
		//nothing EMoflonEdge firstBlock__group____isOccupiedBy = (EMoflonEdge) result3_green[10];

		// 
		// 
		create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_11_5_registerobjects_expressionBBBBBBBBB(this,
				ruleresult, socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group);
		return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Table item = (Table) result2_binding[0];
		ItemSocket itemSocket = (ItemSocket) result2_binding[1];
		for (Object[] result2_black : create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_12_2_corematch_blackFBBFB(item, itemSocket, match)) {
			SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result2_black[0];
			Group group = (Group) result2_black[3];
			// ForEach 
			for (Object[] result3_black : create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_12_3_findcontext_blackBBFFBFB(socketToGroup, item, itemSocket,
							group)) {
				Block firstBlock = (Block) result3_black[2];
				Grid grid = (Grid) result3_black[3];
				Block secondBlock = (Block) result3_black[5];
				Object[] result3_green = create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_12_3_findcontext_greenBBBBBBBFFFFFFFFF(socketToGroup, item,
								firstBlock, grid, itemSocket, secondBlock, group);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[7];
				//nothing EMoflonEdge itemSocket__item____item = (EMoflonEdge) result3_green[8];
				//nothing EMoflonEdge socketToGroup__group____source = (EMoflonEdge) result3_green[9];
				//nothing EMoflonEdge firstBlock__secondBlock____e = (EMoflonEdge) result3_green[10];
				//nothing EMoflonEdge secondBlock__firstBlock____w = (EMoflonEdge) result3_green[11];
				//nothing EMoflonEdge grid__group____groups = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge grid__secondBlock____blocks = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge socketToGroup__itemSocket____target = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge grid__firstBlock____blocks = (EMoflonEdge) result3_green[15];

				Object[] result4_bindingAndBlack = create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(this,
								isApplicableMatch, socketToGroup, item, firstBlock, grid, itemSocket, secondBlock,
								group);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[socketToGroup] = " + socketToGroup
							+ ", " + "[item] = " + item + ", " + "[firstBlock] = " + firstBlock + ", " + "[grid] = "
							+ grid + ", " + "[itemSocket] = " + itemSocket + ", " + "[secondBlock] = " + secondBlock
							+ ", " + "[group] = " + group + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = create_a_horizontal_tableImpl
							.pattern_create_a_horizontal_table_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, Table item, ItemSocket itemSocket) {
		match.registerObject("item", item);
		match.registerObject("itemSocket", itemSocket);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, Table item, ItemSocket itemSocket) {// Create CSP
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
	public boolean isAppropriate_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SocketToGroupCorr socketToGroup,
			Table item, Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid.blockSize", true, csp);
		var_grid_blockSize.setValue(grid.getBlockSize());
		var_grid_blockSize.setType("double");
		Variable var_item_yPos = CSPFactoryHelper.eINSTANCE.createVariable("item.yPos", true, csp);
		var_item_yPos.setValue(item.getYPos());
		var_item_yPos.setType("double");
		Variable var_firstBlock_yIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock.yIndex", true, csp);
		var_firstBlock_yIndex.setValue(firstBlock.getYIndex());
		var_firstBlock_yIndex.setType("int");
		Variable var_item_xPos = CSPFactoryHelper.eINSTANCE.createVariable("item.xPos", true, csp);
		var_item_xPos.setValue(item.getXPos());
		var_item_xPos.setType("double");
		Variable var_firstBlock_xIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock.xIndex", true, csp);
		var_firstBlock_xIndex.setValue(firstBlock.getXIndex());
		var_firstBlock_xIndex.setType("int");

		// Create unbound variables

		// Create constraints
		PosToIndex posToIndex = new PosToIndex();
		PosToIndex posToIndex_0 = new PosToIndex();

		csp.getConstraints().add(posToIndex);
		csp.getConstraints().add(posToIndex_0);

		// Solve CSP
		posToIndex.setRuleName("NoRuleName");
		posToIndex.solve(var_grid_blockSize, var_item_yPos, var_firstBlock_yIndex);
		posToIndex_0.setRuleName("NoRuleName");
		posToIndex_0.solve(var_grid_blockSize, var_item_xPos, var_firstBlock_xIndex);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("socketToGroup", socketToGroup);
		isApplicableMatch.registerObject("item", item);
		isApplicableMatch.registerObject("firstBlock", firstBlock);
		isApplicableMatch.registerObject("grid", grid);
		isApplicableMatch.registerObject("itemSocket", itemSocket);
		isApplicableMatch.registerObject("secondBlock", secondBlock);
		isApplicableMatch.registerObject("group", group);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject socketToGroup, EObject item,
			EObject firstBlock, EObject grid, EObject itemSocket, EObject secondBlock, EObject group) {
		ruleresult.registerObject("socketToGroup", socketToGroup);
		ruleresult.registerObject("item", item);
		ruleresult.registerObject("firstBlock", firstBlock);
		ruleresult.registerObject("grid", grid);
		ruleresult.registerObject("itemSocket", itemSocket);
		ruleresult.registerObject("secondBlock", secondBlock);
		ruleresult.registerObject("group", group);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("item").eClass())
				.equals("KitchenLanguage.Table.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_3(EMoflonEdge _edge_occupies) {

		Object[] result1_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_20_2_testcorematchandDECs_blackFFFFB(_edge_occupies)) {
			Block firstBlock = (Block) result2_black[0];
			Grid grid = (Grid) result2_black[1];
			Block secondBlock = (Block) result2_black[2];
			Group group = (Group) result2_black[3];
			Object[] result2_green = create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
							this, match, firstBlock, grid, secondBlock, group)) {
				// 
				if (create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = create_a_horizontal_tableImpl
							.pattern_create_a_horizontal_table_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_3(EMoflonEdge _edge_item) {

		Object[] result1_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_21_2_testcorematchandDECs_blackFFB(_edge_item)) {
			Table item = (Table) result2_black[0];
			ItemSocket itemSocket = (ItemSocket) result2_black[1];
			Object[] result2_green = create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, item, itemSocket)) {
				// 
				if (create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = create_a_horizontal_tableImpl
							.pattern_create_a_horizontal_table_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("create_a_horizontal_table");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_firstBlock_yIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock", true, csp);
		var_firstBlock_yIndex.setValue(__helper.getValue("firstBlock", "yIndex"));
		var_firstBlock_yIndex.setType("int");

		Variable var_item_yPos = CSPFactoryHelper.eINSTANCE.createVariable("item", true, csp);
		var_item_yPos.setValue(__helper.getValue("item", "yPos"));
		var_item_yPos.setType("double");

		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid", true, csp);
		var_grid_blockSize.setValue(__helper.getValue("grid", "blockSize"));
		var_grid_blockSize.setType("double");

		Variable var_firstBlock_xIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock", true, csp);
		var_firstBlock_xIndex.setValue(__helper.getValue("firstBlock", "xIndex"));
		var_firstBlock_xIndex.setType("int");

		Variable var_item_xPos = CSPFactoryHelper.eINSTANCE.createVariable("item", true, csp);
		var_item_xPos.setValue(__helper.getValue("item", "xPos"));
		var_item_xPos.setType("double");

		PosToIndex posToIndex0 = new PosToIndex();
		csp.getConstraints().add(posToIndex0);

		PosToIndex posToIndex1 = new PosToIndex();
		csp.getConstraints().add(posToIndex1);

		posToIndex0.setRuleName("create_a_horizontal_table");
		posToIndex0.solve(var_grid_blockSize, var_item_yPos, var_firstBlock_yIndex);

		posToIndex1.setRuleName("create_a_horizontal_table");
		posToIndex1.solve(var_grid_blockSize, var_item_xPos, var_firstBlock_xIndex);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_item_yPos.setBound(false);
			var_item_xPos.setBound(false);
			posToIndex0.solve(var_grid_blockSize, var_item_yPos, var_firstBlock_yIndex);
			posToIndex1.solve(var_grid_blockSize, var_item_xPos, var_firstBlock_xIndex);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("item", "yPos", var_item_yPos.getValue());
				__helper.setValue("item", "xPos", var_item_xPos.getValue());
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
		ruleResult.setRule("create_a_horizontal_table");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_firstBlock_yIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock", true, csp);
		var_firstBlock_yIndex.setValue(__helper.getValue("firstBlock", "yIndex"));
		var_firstBlock_yIndex.setType("int");

		Variable var_item_yPos = CSPFactoryHelper.eINSTANCE.createVariable("item", true, csp);
		var_item_yPos.setValue(__helper.getValue("item", "yPos"));
		var_item_yPos.setType("double");

		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid", true, csp);
		var_grid_blockSize.setValue(__helper.getValue("grid", "blockSize"));
		var_grid_blockSize.setType("double");

		Variable var_firstBlock_xIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock", true, csp);
		var_firstBlock_xIndex.setValue(__helper.getValue("firstBlock", "xIndex"));
		var_firstBlock_xIndex.setType("int");

		Variable var_item_xPos = CSPFactoryHelper.eINSTANCE.createVariable("item", true, csp);
		var_item_xPos.setValue(__helper.getValue("item", "xPos"));
		var_item_xPos.setType("double");

		PosToIndex posToIndex0 = new PosToIndex();
		csp.getConstraints().add(posToIndex0);

		PosToIndex posToIndex1 = new PosToIndex();
		csp.getConstraints().add(posToIndex1);

		posToIndex0.setRuleName("create_a_horizontal_table");
		posToIndex0.solve(var_grid_blockSize, var_item_yPos, var_firstBlock_yIndex);

		posToIndex1.setRuleName("create_a_horizontal_table");
		posToIndex1.solve(var_grid_blockSize, var_item_xPos, var_firstBlock_xIndex);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			posToIndex0.solve(var_grid_blockSize, var_item_yPos, var_firstBlock_yIndex);
			posToIndex1.solve(var_grid_blockSize, var_item_xPos, var_firstBlock_xIndex);
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

		Object[] result1_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Table item = (Table) result2_bindingAndBlack[0];
		Block firstBlock = (Block) result2_bindingAndBlack[1];
		Grid grid = (Grid) result2_bindingAndBlack[2];
		ItemSocket itemSocket = (ItemSocket) result2_bindingAndBlack[3];
		Block secondBlock = (Block) result2_bindingAndBlack[4];
		Group group = (Group) result2_bindingAndBlack[5];

		Object[] result3_bindingAndBlack = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(this, item, firstBlock, grid,
						itemSocket, secondBlock, group, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[item] = " + item + ", " + "[firstBlock] = " + firstBlock + ", " + "[grid] = " + grid + ", "
					+ "[itemSocket] = " + itemSocket + ", " + "[secondBlock] = " + secondBlock + ", " + "[group] = "
					+ group + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : create_a_horizontal_tableImpl
					.pattern_create_a_horizontal_table_24_5_matchcorrcontext_blackFBBBB(itemSocket, group, sourceMatch,
							targetMatch)) {
				SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result5_black[0];
				Object[] result5_green = create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_24_5_matchcorrcontext_greenBBBF(socketToGroup, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_24_6_createcorrespondence_blackBBBBBBB(item, firstBlock,
								grid, itemSocket, secondBlock, group, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[item] = " + item + ", "
							+ "[firstBlock] = " + firstBlock + ", " + "[grid] = " + grid + ", " + "[itemSocket] = "
							+ itemSocket + ", " + "[secondBlock] = " + secondBlock + ", " + "[group] = " + group + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = create_a_horizontal_tableImpl
						.pattern_create_a_horizontal_table_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Table item, Block firstBlock, Grid grid, ItemSocket itemSocket,
			Block secondBlock, Group group, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_grid_blockSize = CSPFactoryHelper.eINSTANCE.createVariable("grid.blockSize", true, csp);
		var_grid_blockSize.setValue(grid.getBlockSize());
		var_grid_blockSize.setType("double");
		Variable var_item_yPos = CSPFactoryHelper.eINSTANCE.createVariable("item.yPos", true, csp);
		var_item_yPos.setValue(item.getYPos());
		var_item_yPos.setType("double");
		Variable var_firstBlock_yIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock.yIndex", true, csp);
		var_firstBlock_yIndex.setValue(firstBlock.getYIndex());
		var_firstBlock_yIndex.setType("int");
		Variable var_item_xPos = CSPFactoryHelper.eINSTANCE.createVariable("item.xPos", true, csp);
		var_item_xPos.setValue(item.getXPos());
		var_item_xPos.setType("double");
		Variable var_firstBlock_xIndex = CSPFactoryHelper.eINSTANCE.createVariable("firstBlock.xIndex", true, csp);
		var_firstBlock_xIndex.setValue(firstBlock.getXIndex());
		var_firstBlock_xIndex.setType("int");

		// Create unbound variables

		// Create constraints
		PosToIndex posToIndex = new PosToIndex();
		PosToIndex posToIndex_0 = new PosToIndex();

		csp.getConstraints().add(posToIndex);
		csp.getConstraints().add(posToIndex_0);

		// Solve CSP
		posToIndex.setRuleName("NoRuleName");
		posToIndex.solve(var_grid_blockSize, var_item_yPos, var_firstBlock_yIndex);
		posToIndex_0.setRuleName("NoRuleName");
		posToIndex_0.solve(var_grid_blockSize, var_item_xPos, var_firstBlock_xIndex);
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
	public boolean checkDEC_FWD(Block firstBlock, Grid grid, Block secondBlock, Group group) {// 
		Object[] result1_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_27_1_matchtggpattern_blackBBBB(firstBlock, grid, secondBlock, group);
		if (result1_black != null) {
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_27_2_expressionF();
		} else {
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(Table item, ItemSocket itemSocket) {// 
		Object[] result1_black = create_a_horizontal_tableImpl
				.pattern_create_a_horizontal_table_28_1_matchtggpattern_blackBB(item, itemSocket);
		if (result1_black != null) {
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_28_2_expressionF();
		} else {
			return create_a_horizontal_tableImpl.pattern_create_a_horizontal_table_28_3_expressionF();
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
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP:
			return isAppropriate_FWD((Match) arguments.get(0), (Block) arguments.get(1), (Grid) arguments.get(2),
					(Block) arguments.get(3), (Group) arguments.get(4));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Block) arguments.get(1), (Grid) arguments.get(2),
					(Block) arguments.get(3), (Group) arguments.get(4));
			return null;
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_BLOCK_GRID_BLOCK_GROUP:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Block) arguments.get(1),
					(Grid) arguments.get(2), (Block) arguments.get(3), (Group) arguments.get(4));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (SocketToGroupCorr) arguments.get(1),
					(Block) arguments.get(2), (Grid) arguments.get(3), (ItemSocket) arguments.get(4),
					(Block) arguments.get(5), (Group) arguments.get(6));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_BWD__MATCH_TABLE_ITEMSOCKET:
			return isAppropriate_BWD((Match) arguments.get(0), (Table) arguments.get(1), (ItemSocket) arguments.get(2));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_TABLE_ITEMSOCKET:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (Table) arguments.get(1),
					(ItemSocket) arguments.get(2));
			return null;
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_TABLE_ITEMSOCKET:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (Table) arguments.get(1),
					(ItemSocket) arguments.get(2));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SOCKETTOGROUPCORR_TABLE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (SocketToGroupCorr) arguments.get(1),
					(Table) arguments.get(2), (Block) arguments.get(3), (Grid) arguments.get(4),
					(ItemSocket) arguments.get(5), (Block) arguments.get(6), (Group) arguments.get(7));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7));
			return null;
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_FWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPROPRIATE_BWD_EMOFLON_EDGE_3__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_3((EMoflonEdge) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_SOLVE_CSP_CC__TABLE_BLOCK_GRID_ITEMSOCKET_BLOCK_GROUP_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Table) arguments.get(0), (Block) arguments.get(1), (Grid) arguments.get(2),
					(ItemSocket) arguments.get(3), (Block) arguments.get(4), (Group) arguments.get(5),
					(Match) arguments.get(6), (Match) arguments.get(7));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___CHECK_DEC_FWD__BLOCK_GRID_BLOCK_GROUP:
			return checkDEC_FWD((Block) arguments.get(0), (Grid) arguments.get(1), (Block) arguments.get(2),
					(Group) arguments.get(3));
		case RulesPackage.CREATE_AHORIZONTAL_TABLE___CHECK_DEC_BWD__TABLE_ITEMSOCKET:
			return checkDEC_BWD((Table) arguments.get(0), (ItemSocket) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_create_a_horizontal_table_0_1_initialbindings_blackBBBBBB(
			create_a_horizontal_table _this, Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		if (!firstBlock.equals(secondBlock)) {
			return new Object[] { _this, match, firstBlock, grid, secondBlock, group };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_0_2_SolveCSP_bindingFBBBBBB(
			create_a_horizontal_table _this, Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, firstBlock, grid, secondBlock, group);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, firstBlock, grid, secondBlock, group };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_create_a_horizontal_table_0_2_SolveCSP_bindingAndBlackFBBBBBB(
			create_a_horizontal_table _this, Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		Object[] result_pattern_create_a_horizontal_table_0_2_SolveCSP_binding = pattern_create_a_horizontal_table_0_2_SolveCSP_bindingFBBBBBB(
				_this, match, firstBlock, grid, secondBlock, group);
		if (result_pattern_create_a_horizontal_table_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_create_a_horizontal_table_0_2_SolveCSP_binding[0];

			Object[] result_pattern_create_a_horizontal_table_0_2_SolveCSP_black = pattern_create_a_horizontal_table_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_create_a_horizontal_table_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, firstBlock, grid, secondBlock, group };
			}
		}
		return null;
	}

	public static final boolean pattern_create_a_horizontal_table_0_3_CheckCSP_expressionFBB(
			create_a_horizontal_table _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_0_4_collectelementstobetranslated_blackBBBBB(
			Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		if (!firstBlock.equals(secondBlock)) {
			return new Object[] { match, firstBlock, grid, secondBlock, group };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_0_4_collectelementstobetranslated_greenBBBBFFFF(
			Match match, Block firstBlock, Block secondBlock, Group group) {
		EMoflonEdge group__secondBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge secondBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__firstBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge firstBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String group__secondBlock____occupies_name_prime = "occupies";
		String secondBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		String group__firstBlock____occupies_name_prime = "occupies";
		String firstBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		group__secondBlock____occupies.setSrc(group);
		group__secondBlock____occupies.setTrg(secondBlock);
		match.getToBeTranslatedEdges().add(group__secondBlock____occupies);
		secondBlock__group____isOccupiedBy.setSrc(secondBlock);
		secondBlock__group____isOccupiedBy.setTrg(group);
		match.getToBeTranslatedEdges().add(secondBlock__group____isOccupiedBy);
		group__firstBlock____occupies.setSrc(group);
		group__firstBlock____occupies.setTrg(firstBlock);
		match.getToBeTranslatedEdges().add(group__firstBlock____occupies);
		firstBlock__group____isOccupiedBy.setSrc(firstBlock);
		firstBlock__group____isOccupiedBy.setTrg(group);
		match.getToBeTranslatedEdges().add(firstBlock__group____isOccupiedBy);
		group__secondBlock____occupies.setName(group__secondBlock____occupies_name_prime);
		secondBlock__group____isOccupiedBy.setName(secondBlock__group____isOccupiedBy_name_prime);
		group__firstBlock____occupies.setName(group__firstBlock____occupies_name_prime);
		firstBlock__group____isOccupiedBy.setName(firstBlock__group____isOccupiedBy_name_prime);
		return new Object[] { match, firstBlock, secondBlock, group, group__secondBlock____occupies,
				secondBlock__group____isOccupiedBy, group__firstBlock____occupies, firstBlock__group____isOccupiedBy };
	}

	public static final Object[] pattern_create_a_horizontal_table_0_5_collectcontextelements_blackBBBBB(Match match,
			Block firstBlock, Grid grid, Block secondBlock, Group group) {
		if (!firstBlock.equals(secondBlock)) {
			return new Object[] { match, firstBlock, grid, secondBlock, group };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_0_5_collectcontextelements_greenBBBBBFFFFF(
			Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		EMoflonEdge firstBlock__secondBlock____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge secondBlock__firstBlock____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__group____groups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__secondBlock____blocks = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__firstBlock____blocks = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getContextNodes().add(firstBlock);
		match.getContextNodes().add(grid);
		match.getContextNodes().add(secondBlock);
		match.getContextNodes().add(group);
		String firstBlock__secondBlock____e_name_prime = "e";
		String secondBlock__firstBlock____w_name_prime = "w";
		String grid__group____groups_name_prime = "groups";
		String grid__secondBlock____blocks_name_prime = "blocks";
		String grid__firstBlock____blocks_name_prime = "blocks";
		firstBlock__secondBlock____e.setSrc(firstBlock);
		firstBlock__secondBlock____e.setTrg(secondBlock);
		match.getContextEdges().add(firstBlock__secondBlock____e);
		secondBlock__firstBlock____w.setSrc(secondBlock);
		secondBlock__firstBlock____w.setTrg(firstBlock);
		match.getContextEdges().add(secondBlock__firstBlock____w);
		grid__group____groups.setSrc(grid);
		grid__group____groups.setTrg(group);
		match.getContextEdges().add(grid__group____groups);
		grid__secondBlock____blocks.setSrc(grid);
		grid__secondBlock____blocks.setTrg(secondBlock);
		match.getContextEdges().add(grid__secondBlock____blocks);
		grid__firstBlock____blocks.setSrc(grid);
		grid__firstBlock____blocks.setTrg(firstBlock);
		match.getContextEdges().add(grid__firstBlock____blocks);
		firstBlock__secondBlock____e.setName(firstBlock__secondBlock____e_name_prime);
		secondBlock__firstBlock____w.setName(secondBlock__firstBlock____w_name_prime);
		grid__group____groups.setName(grid__group____groups_name_prime);
		grid__secondBlock____blocks.setName(grid__secondBlock____blocks_name_prime);
		grid__firstBlock____blocks.setName(grid__firstBlock____blocks_name_prime);
		return new Object[] { match, firstBlock, grid, secondBlock, group, firstBlock__secondBlock____e,
				secondBlock__firstBlock____w, grid__group____groups, grid__secondBlock____blocks,
				grid__firstBlock____blocks };
	}

	public static final void pattern_create_a_horizontal_table_0_6_registerobjectstomatch_expressionBBBBBB(
			create_a_horizontal_table _this, Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		_this.registerObjectsToMatch_FWD(match, firstBlock, grid, secondBlock, group);

	}

	public static final boolean pattern_create_a_horizontal_table_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_create_a_horizontal_table_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_1_1_performtransformation_bindingFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("socketToGroup");
		EObject _localVariable_1 = isApplicableMatch.getObject("firstBlock");
		EObject _localVariable_2 = isApplicableMatch.getObject("grid");
		EObject _localVariable_3 = isApplicableMatch.getObject("itemSocket");
		EObject _localVariable_4 = isApplicableMatch.getObject("secondBlock");
		EObject _localVariable_5 = isApplicableMatch.getObject("group");
		EObject tmpSocketToGroup = _localVariable_0;
		EObject tmpFirstBlock = _localVariable_1;
		EObject tmpGrid = _localVariable_2;
		EObject tmpItemSocket = _localVariable_3;
		EObject tmpSecondBlock = _localVariable_4;
		EObject tmpGroup = _localVariable_5;
		if (tmpSocketToGroup instanceof SocketToGroupCorr) {
			SocketToGroupCorr socketToGroup = (SocketToGroupCorr) tmpSocketToGroup;
			if (tmpFirstBlock instanceof Block) {
				Block firstBlock = (Block) tmpFirstBlock;
				if (tmpGrid instanceof Grid) {
					Grid grid = (Grid) tmpGrid;
					if (tmpItemSocket instanceof ItemSocket) {
						ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
						if (tmpSecondBlock instanceof Block) {
							Block secondBlock = (Block) tmpSecondBlock;
							if (tmpGroup instanceof Group) {
								Group group = (Group) tmpGroup;
								return new Object[] { socketToGroup, firstBlock, grid, itemSocket, secondBlock, group,
										isApplicableMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_1_1_performtransformation_blackBBBBBBFBB(
			SocketToGroupCorr socketToGroup, Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock,
			Group group, create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch) {
		if (!firstBlock.equals(secondBlock)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { socketToGroup, firstBlock, grid, itemSocket, secondBlock, group, csp, _this,
							isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_1_1_performtransformation_bindingAndBlackFFFFFFFBB(
			create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_create_a_horizontal_table_1_1_performtransformation_binding = pattern_create_a_horizontal_table_1_1_performtransformation_bindingFFFFFFB(
				isApplicableMatch);
		if (result_pattern_create_a_horizontal_table_1_1_performtransformation_binding != null) {
			SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result_pattern_create_a_horizontal_table_1_1_performtransformation_binding[0];
			Block firstBlock = (Block) result_pattern_create_a_horizontal_table_1_1_performtransformation_binding[1];
			Grid grid = (Grid) result_pattern_create_a_horizontal_table_1_1_performtransformation_binding[2];
			ItemSocket itemSocket = (ItemSocket) result_pattern_create_a_horizontal_table_1_1_performtransformation_binding[3];
			Block secondBlock = (Block) result_pattern_create_a_horizontal_table_1_1_performtransformation_binding[4];
			Group group = (Group) result_pattern_create_a_horizontal_table_1_1_performtransformation_binding[5];

			Object[] result_pattern_create_a_horizontal_table_1_1_performtransformation_black = pattern_create_a_horizontal_table_1_1_performtransformation_blackBBBBBBFBB(
					socketToGroup, firstBlock, grid, itemSocket, secondBlock, group, _this, isApplicableMatch);
			if (result_pattern_create_a_horizontal_table_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_create_a_horizontal_table_1_1_performtransformation_black[6];

				return new Object[] { socketToGroup, firstBlock, grid, itemSocket, secondBlock, group, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_1_1_performtransformation_greenFBB(
			ItemSocket itemSocket, CSP csp) {
		Table item = KitchenLanguageFactory.eINSTANCE.createTable();
		Object _localVariable_0 = csp.getValue("item", "yPos");
		Object _localVariable_1 = csp.getValue("item", "xPos");
		itemSocket.setItem(item);
		double item_yPos_prime = (double) _localVariable_0;
		double item_xPos_prime = (double) _localVariable_1;
		item.setYPos(Double.valueOf(item_yPos_prime));
		item.setXPos(Double.valueOf(item_xPos_prime));
		return new Object[] { item, itemSocket, csp };
	}

	public static final Object[] pattern_create_a_horizontal_table_1_2_collecttranslatedelements_blackB(Table item) {
		return new Object[] { item };
	}

	public static final Object[] pattern_create_a_horizontal_table_1_2_collecttranslatedelements_greenFB(Table item) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(item);
		return new Object[] { ruleresult, item };
	}

	public static final Object[] pattern_create_a_horizontal_table_1_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject socketToGroup, EObject item, EObject firstBlock, EObject grid,
			EObject itemSocket, EObject secondBlock, EObject group) {
		if (!item.equals(socketToGroup)) {
			if (!item.equals(itemSocket)) {
				if (!item.equals(secondBlock)) {
					if (!firstBlock.equals(socketToGroup)) {
						if (!firstBlock.equals(item)) {
							if (!firstBlock.equals(grid)) {
								if (!firstBlock.equals(itemSocket)) {
									if (!firstBlock.equals(secondBlock)) {
										if (!firstBlock.equals(group)) {
											if (!grid.equals(socketToGroup)) {
												if (!grid.equals(item)) {
													if (!grid.equals(itemSocket)) {
														if (!grid.equals(secondBlock)) {
															if (!grid.equals(group)) {
																if (!itemSocket.equals(socketToGroup)) {
																	if (!itemSocket.equals(secondBlock)) {
																		if (!secondBlock.equals(socketToGroup)) {
																			if (!group.equals(socketToGroup)) {
																				if (!group.equals(item)) {
																					if (!group.equals(itemSocket)) {
																						if (!group
																								.equals(secondBlock)) {
																							return new Object[] {
																									ruleresult,
																									socketToGroup, item,
																									firstBlock, grid,
																									itemSocket,
																									secondBlock,
																									group };
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_1_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject item, EObject firstBlock, EObject itemSocket, EObject secondBlock,
			EObject group) {
		EMoflonEdge itemSocket__item____item = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__secondBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge secondBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__firstBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge firstBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "create_a_horizontal_table";
		String itemSocket__item____item_name_prime = "item";
		String group__secondBlock____occupies_name_prime = "occupies";
		String secondBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		String group__firstBlock____occupies_name_prime = "occupies";
		String firstBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		itemSocket__item____item.setSrc(itemSocket);
		itemSocket__item____item.setTrg(item);
		ruleresult.getCreatedEdges().add(itemSocket__item____item);
		group__secondBlock____occupies.setSrc(group);
		group__secondBlock____occupies.setTrg(secondBlock);
		ruleresult.getTranslatedEdges().add(group__secondBlock____occupies);
		secondBlock__group____isOccupiedBy.setSrc(secondBlock);
		secondBlock__group____isOccupiedBy.setTrg(group);
		ruleresult.getTranslatedEdges().add(secondBlock__group____isOccupiedBy);
		group__firstBlock____occupies.setSrc(group);
		group__firstBlock____occupies.setTrg(firstBlock);
		ruleresult.getTranslatedEdges().add(group__firstBlock____occupies);
		firstBlock__group____isOccupiedBy.setSrc(firstBlock);
		firstBlock__group____isOccupiedBy.setTrg(group);
		ruleresult.getTranslatedEdges().add(firstBlock__group____isOccupiedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		itemSocket__item____item.setName(itemSocket__item____item_name_prime);
		group__secondBlock____occupies.setName(group__secondBlock____occupies_name_prime);
		secondBlock__group____isOccupiedBy.setName(secondBlock__group____isOccupiedBy_name_prime);
		group__firstBlock____occupies.setName(group__firstBlock____occupies_name_prime);
		firstBlock__group____isOccupiedBy.setName(firstBlock__group____isOccupiedBy_name_prime);
		return new Object[] { ruleresult, item, firstBlock, itemSocket, secondBlock, group, itemSocket__item____item,
				group__secondBlock____occupies, secondBlock__group____isOccupiedBy, group__firstBlock____occupies,
				firstBlock__group____isOccupiedBy };
	}

	public static final void pattern_create_a_horizontal_table_1_5_registerobjects_expressionBBBBBBBBB(
			create_a_horizontal_table _this, PerformRuleResult ruleresult, EObject socketToGroup, EObject item,
			EObject firstBlock, EObject grid, EObject itemSocket, EObject secondBlock, EObject group) {
		_this.registerObjects_FWD(ruleresult, socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group);

	}

	public static final PerformRuleResult pattern_create_a_horizontal_table_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_2_1_preparereturnvalue_bindingFB(
			create_a_horizontal_table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_2_1_preparereturnvalue_blackFBB(EClass eClass,
			create_a_horizontal_table _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_2_1_preparereturnvalue_bindingAndBlackFFB(
			create_a_horizontal_table _this) {
		Object[] result_pattern_create_a_horizontal_table_2_1_preparereturnvalue_binding = pattern_create_a_horizontal_table_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_create_a_horizontal_table_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_create_a_horizontal_table_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_create_a_horizontal_table_2_1_preparereturnvalue_black = pattern_create_a_horizontal_table_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_create_a_horizontal_table_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_create_a_horizontal_table_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "create_a_horizontal_table";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_create_a_horizontal_table_2_2_corematch_bindingFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("firstBlock");
		EObject _localVariable_1 = match.getObject("grid");
		EObject _localVariable_2 = match.getObject("secondBlock");
		EObject _localVariable_3 = match.getObject("group");
		EObject tmpFirstBlock = _localVariable_0;
		EObject tmpGrid = _localVariable_1;
		EObject tmpSecondBlock = _localVariable_2;
		EObject tmpGroup = _localVariable_3;
		if (tmpFirstBlock instanceof Block) {
			Block firstBlock = (Block) tmpFirstBlock;
			if (tmpGrid instanceof Grid) {
				Grid grid = (Grid) tmpGrid;
				if (tmpSecondBlock instanceof Block) {
					Block secondBlock = (Block) tmpSecondBlock;
					if (tmpGroup instanceof Group) {
						Group group = (Group) tmpGroup;
						return new Object[] { firstBlock, grid, secondBlock, group, match };
					}
				}
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_create_a_horizontal_table_2_2_corematch_blackFBBFBBB(
			Block firstBlock, Grid grid, Block secondBlock, Group group, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!firstBlock.equals(secondBlock)) {
			for (SocketToGroupCorr socketToGroup : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(group, SocketToGroupCorr.class, "source")) {
				ItemSocket itemSocket = socketToGroup.getTarget();
				if (itemSocket != null) {
					_result.add(
							new Object[] { socketToGroup, firstBlock, grid, itemSocket, secondBlock, group, match });
				}

			}
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_create_a_horizontal_table_2_3_findcontext_blackBBBBBB(
			SocketToGroupCorr socketToGroup, Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock,
			Group group) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!firstBlock.equals(secondBlock)) {
			if (group.equals(socketToGroup.getSource())) {
				if (group.getOccupies().contains(secondBlock)) {
					if (secondBlock.equals(firstBlock.getE())) {
						if (grid.getGroups().contains(group)) {
							if (grid.getBlocks().contains(secondBlock)) {
								if (group.getOccupies().contains(firstBlock)) {
									if (itemSocket.equals(socketToGroup.getTarget())) {
										if (grid.getBlocks().contains(firstBlock)) {
											_result.add(new Object[] { socketToGroup, firstBlock, grid, itemSocket,
													secondBlock, group });
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_2_3_findcontext_greenBBBBBBFFFFFFFFFFFF(
			SocketToGroupCorr socketToGroup, Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock,
			Group group) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge socketToGroup__group____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__secondBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge secondBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge firstBlock__secondBlock____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge secondBlock__firstBlock____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__group____groups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__secondBlock____blocks = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__firstBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge firstBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge socketToGroup__itemSocket____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__firstBlock____blocks = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String socketToGroup__group____source_name_prime = "source";
		String group__secondBlock____occupies_name_prime = "occupies";
		String secondBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		String firstBlock__secondBlock____e_name_prime = "e";
		String secondBlock__firstBlock____w_name_prime = "w";
		String grid__group____groups_name_prime = "groups";
		String grid__secondBlock____blocks_name_prime = "blocks";
		String group__firstBlock____occupies_name_prime = "occupies";
		String firstBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		String socketToGroup__itemSocket____target_name_prime = "target";
		String grid__firstBlock____blocks_name_prime = "blocks";
		isApplicableMatch.getAllContextElements().add(socketToGroup);
		isApplicableMatch.getAllContextElements().add(firstBlock);
		isApplicableMatch.getAllContextElements().add(grid);
		isApplicableMatch.getAllContextElements().add(itemSocket);
		isApplicableMatch.getAllContextElements().add(secondBlock);
		isApplicableMatch.getAllContextElements().add(group);
		socketToGroup__group____source.setSrc(socketToGroup);
		socketToGroup__group____source.setTrg(group);
		isApplicableMatch.getAllContextElements().add(socketToGroup__group____source);
		group__secondBlock____occupies.setSrc(group);
		group__secondBlock____occupies.setTrg(secondBlock);
		isApplicableMatch.getAllContextElements().add(group__secondBlock____occupies);
		secondBlock__group____isOccupiedBy.setSrc(secondBlock);
		secondBlock__group____isOccupiedBy.setTrg(group);
		isApplicableMatch.getAllContextElements().add(secondBlock__group____isOccupiedBy);
		firstBlock__secondBlock____e.setSrc(firstBlock);
		firstBlock__secondBlock____e.setTrg(secondBlock);
		isApplicableMatch.getAllContextElements().add(firstBlock__secondBlock____e);
		secondBlock__firstBlock____w.setSrc(secondBlock);
		secondBlock__firstBlock____w.setTrg(firstBlock);
		isApplicableMatch.getAllContextElements().add(secondBlock__firstBlock____w);
		grid__group____groups.setSrc(grid);
		grid__group____groups.setTrg(group);
		isApplicableMatch.getAllContextElements().add(grid__group____groups);
		grid__secondBlock____blocks.setSrc(grid);
		grid__secondBlock____blocks.setTrg(secondBlock);
		isApplicableMatch.getAllContextElements().add(grid__secondBlock____blocks);
		group__firstBlock____occupies.setSrc(group);
		group__firstBlock____occupies.setTrg(firstBlock);
		isApplicableMatch.getAllContextElements().add(group__firstBlock____occupies);
		firstBlock__group____isOccupiedBy.setSrc(firstBlock);
		firstBlock__group____isOccupiedBy.setTrg(group);
		isApplicableMatch.getAllContextElements().add(firstBlock__group____isOccupiedBy);
		socketToGroup__itemSocket____target.setSrc(socketToGroup);
		socketToGroup__itemSocket____target.setTrg(itemSocket);
		isApplicableMatch.getAllContextElements().add(socketToGroup__itemSocket____target);
		grid__firstBlock____blocks.setSrc(grid);
		grid__firstBlock____blocks.setTrg(firstBlock);
		isApplicableMatch.getAllContextElements().add(grid__firstBlock____blocks);
		socketToGroup__group____source.setName(socketToGroup__group____source_name_prime);
		group__secondBlock____occupies.setName(group__secondBlock____occupies_name_prime);
		secondBlock__group____isOccupiedBy.setName(secondBlock__group____isOccupiedBy_name_prime);
		firstBlock__secondBlock____e.setName(firstBlock__secondBlock____e_name_prime);
		secondBlock__firstBlock____w.setName(secondBlock__firstBlock____w_name_prime);
		grid__group____groups.setName(grid__group____groups_name_prime);
		grid__secondBlock____blocks.setName(grid__secondBlock____blocks_name_prime);
		group__firstBlock____occupies.setName(group__firstBlock____occupies_name_prime);
		firstBlock__group____isOccupiedBy.setName(firstBlock__group____isOccupiedBy_name_prime);
		socketToGroup__itemSocket____target.setName(socketToGroup__itemSocket____target_name_prime);
		grid__firstBlock____blocks.setName(grid__firstBlock____blocks_name_prime);
		return new Object[] { socketToGroup, firstBlock, grid, itemSocket, secondBlock, group, isApplicableMatch,
				socketToGroup__group____source, group__secondBlock____occupies, secondBlock__group____isOccupiedBy,
				firstBlock__secondBlock____e, secondBlock__firstBlock____w, grid__group____groups,
				grid__secondBlock____blocks, group__firstBlock____occupies, firstBlock__group____isOccupiedBy,
				socketToGroup__itemSocket____target, grid__firstBlock____blocks };
	}

	public static final Object[] pattern_create_a_horizontal_table_2_4_solveCSP_bindingFBBBBBBBB(
			create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch, SocketToGroupCorr socketToGroup,
			Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, socketToGroup, firstBlock, grid,
				itemSocket, secondBlock, group);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, socketToGroup, firstBlock, grid, itemSocket,
					secondBlock, group };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_create_a_horizontal_table_2_4_solveCSP_bindingAndBlackFBBBBBBBB(
			create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch, SocketToGroupCorr socketToGroup,
			Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group) {
		Object[] result_pattern_create_a_horizontal_table_2_4_solveCSP_binding = pattern_create_a_horizontal_table_2_4_solveCSP_bindingFBBBBBBBB(
				_this, isApplicableMatch, socketToGroup, firstBlock, grid, itemSocket, secondBlock, group);
		if (result_pattern_create_a_horizontal_table_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_create_a_horizontal_table_2_4_solveCSP_binding[0];

			Object[] result_pattern_create_a_horizontal_table_2_4_solveCSP_black = pattern_create_a_horizontal_table_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_create_a_horizontal_table_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, socketToGroup, firstBlock, grid, itemSocket,
						secondBlock, group };
			}
		}
		return null;
	}

	public static final boolean pattern_create_a_horizontal_table_2_5_checkCSP_expressionFBB(
			create_a_horizontal_table _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_create_a_horizontal_table_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "create_a_horizontal_table";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_create_a_horizontal_table_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_10_1_initialbindings_blackBBBB(
			create_a_horizontal_table _this, Match match, Table item, ItemSocket itemSocket) {
		return new Object[] { _this, match, item, itemSocket };
	}

	public static final Object[] pattern_create_a_horizontal_table_10_2_SolveCSP_bindingFBBBB(
			create_a_horizontal_table _this, Match match, Table item, ItemSocket itemSocket) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, item, itemSocket);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, item, itemSocket };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_create_a_horizontal_table_10_2_SolveCSP_bindingAndBlackFBBBB(
			create_a_horizontal_table _this, Match match, Table item, ItemSocket itemSocket) {
		Object[] result_pattern_create_a_horizontal_table_10_2_SolveCSP_binding = pattern_create_a_horizontal_table_10_2_SolveCSP_bindingFBBBB(
				_this, match, item, itemSocket);
		if (result_pattern_create_a_horizontal_table_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_create_a_horizontal_table_10_2_SolveCSP_binding[0];

			Object[] result_pattern_create_a_horizontal_table_10_2_SolveCSP_black = pattern_create_a_horizontal_table_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_create_a_horizontal_table_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, item, itemSocket };
			}
		}
		return null;
	}

	public static final boolean pattern_create_a_horizontal_table_10_3_CheckCSP_expressionFBB(
			create_a_horizontal_table _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_10_4_collectelementstobetranslated_blackBBB(
			Match match, Table item, ItemSocket itemSocket) {
		return new Object[] { match, item, itemSocket };
	}

	public static final Object[] pattern_create_a_horizontal_table_10_4_collectelementstobetranslated_greenBBBF(
			Match match, Table item, ItemSocket itemSocket) {
		EMoflonEdge itemSocket__item____item = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(item);
		String itemSocket__item____item_name_prime = "item";
		itemSocket__item____item.setSrc(itemSocket);
		itemSocket__item____item.setTrg(item);
		match.getToBeTranslatedEdges().add(itemSocket__item____item);
		itemSocket__item____item.setName(itemSocket__item____item_name_prime);
		return new Object[] { match, item, itemSocket, itemSocket__item____item };
	}

	public static final Object[] pattern_create_a_horizontal_table_10_5_collectcontextelements_blackBBB(Match match,
			Table item, ItemSocket itemSocket) {
		return new Object[] { match, item, itemSocket };
	}

	public static final Object[] pattern_create_a_horizontal_table_10_5_collectcontextelements_greenBB(Match match,
			ItemSocket itemSocket) {
		match.getContextNodes().add(itemSocket);
		return new Object[] { match, itemSocket };
	}

	public static final void pattern_create_a_horizontal_table_10_6_registerobjectstomatch_expressionBBBB(
			create_a_horizontal_table _this, Match match, Table item, ItemSocket itemSocket) {
		_this.registerObjectsToMatch_BWD(match, item, itemSocket);

	}

	public static final boolean pattern_create_a_horizontal_table_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_create_a_horizontal_table_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_11_1_performtransformation_bindingFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("socketToGroup");
		EObject _localVariable_1 = isApplicableMatch.getObject("item");
		EObject _localVariable_2 = isApplicableMatch.getObject("firstBlock");
		EObject _localVariable_3 = isApplicableMatch.getObject("grid");
		EObject _localVariable_4 = isApplicableMatch.getObject("itemSocket");
		EObject _localVariable_5 = isApplicableMatch.getObject("secondBlock");
		EObject _localVariable_6 = isApplicableMatch.getObject("group");
		EObject tmpSocketToGroup = _localVariable_0;
		EObject tmpItem = _localVariable_1;
		EObject tmpFirstBlock = _localVariable_2;
		EObject tmpGrid = _localVariable_3;
		EObject tmpItemSocket = _localVariable_4;
		EObject tmpSecondBlock = _localVariable_5;
		EObject tmpGroup = _localVariable_6;
		if (tmpSocketToGroup instanceof SocketToGroupCorr) {
			SocketToGroupCorr socketToGroup = (SocketToGroupCorr) tmpSocketToGroup;
			if (tmpItem instanceof Table) {
				Table item = (Table) tmpItem;
				if (tmpFirstBlock instanceof Block) {
					Block firstBlock = (Block) tmpFirstBlock;
					if (tmpGrid instanceof Grid) {
						Grid grid = (Grid) tmpGrid;
						if (tmpItemSocket instanceof ItemSocket) {
							ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
							if (tmpSecondBlock instanceof Block) {
								Block secondBlock = (Block) tmpSecondBlock;
								if (tmpGroup instanceof Group) {
									Group group = (Group) tmpGroup;
									return new Object[] { socketToGroup, item, firstBlock, grid, itemSocket,
											secondBlock, group, isApplicableMatch };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_11_1_performtransformation_blackBBBBBBBFBB(
			SocketToGroupCorr socketToGroup, Table item, Block firstBlock, Grid grid, ItemSocket itemSocket,
			Block secondBlock, Group group, create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch) {
		if (!firstBlock.equals(secondBlock)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group, csp,
							_this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_11_1_performtransformation_bindingAndBlackFFFFFFFFBB(
			create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_create_a_horizontal_table_11_1_performtransformation_binding = pattern_create_a_horizontal_table_11_1_performtransformation_bindingFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_create_a_horizontal_table_11_1_performtransformation_binding != null) {
			SocketToGroupCorr socketToGroup = (SocketToGroupCorr) result_pattern_create_a_horizontal_table_11_1_performtransformation_binding[0];
			Table item = (Table) result_pattern_create_a_horizontal_table_11_1_performtransformation_binding[1];
			Block firstBlock = (Block) result_pattern_create_a_horizontal_table_11_1_performtransformation_binding[2];
			Grid grid = (Grid) result_pattern_create_a_horizontal_table_11_1_performtransformation_binding[3];
			ItemSocket itemSocket = (ItemSocket) result_pattern_create_a_horizontal_table_11_1_performtransformation_binding[4];
			Block secondBlock = (Block) result_pattern_create_a_horizontal_table_11_1_performtransformation_binding[5];
			Group group = (Group) result_pattern_create_a_horizontal_table_11_1_performtransformation_binding[6];

			Object[] result_pattern_create_a_horizontal_table_11_1_performtransformation_black = pattern_create_a_horizontal_table_11_1_performtransformation_blackBBBBBBBFBB(
					socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group, _this, isApplicableMatch);
			if (result_pattern_create_a_horizontal_table_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_create_a_horizontal_table_11_1_performtransformation_black[7];

				return new Object[] { socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group, csp, _this,
						isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_11_1_performtransformation_greenBBB(Block firstBlock,
			Block secondBlock, Group group) {
		group.getOccupies().add(secondBlock);
		group.getOccupies().add(firstBlock);
		return new Object[] { firstBlock, secondBlock, group };
	}

	public static final Object[] pattern_create_a_horizontal_table_11_2_collecttranslatedelements_blackB(Table item) {
		return new Object[] { item };
	}

	public static final Object[] pattern_create_a_horizontal_table_11_2_collecttranslatedelements_greenFB(Table item) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(item);
		return new Object[] { ruleresult, item };
	}

	public static final Object[] pattern_create_a_horizontal_table_11_3_bookkeepingforedges_blackBBBBBBBB(
			PerformRuleResult ruleresult, EObject socketToGroup, EObject item, EObject firstBlock, EObject grid,
			EObject itemSocket, EObject secondBlock, EObject group) {
		if (!item.equals(socketToGroup)) {
			if (!item.equals(itemSocket)) {
				if (!item.equals(secondBlock)) {
					if (!firstBlock.equals(socketToGroup)) {
						if (!firstBlock.equals(item)) {
							if (!firstBlock.equals(grid)) {
								if (!firstBlock.equals(itemSocket)) {
									if (!firstBlock.equals(secondBlock)) {
										if (!firstBlock.equals(group)) {
											if (!grid.equals(socketToGroup)) {
												if (!grid.equals(item)) {
													if (!grid.equals(itemSocket)) {
														if (!grid.equals(secondBlock)) {
															if (!grid.equals(group)) {
																if (!itemSocket.equals(socketToGroup)) {
																	if (!itemSocket.equals(secondBlock)) {
																		if (!secondBlock.equals(socketToGroup)) {
																			if (!group.equals(socketToGroup)) {
																				if (!group.equals(item)) {
																					if (!group.equals(itemSocket)) {
																						if (!group
																								.equals(secondBlock)) {
																							return new Object[] {
																									ruleresult,
																									socketToGroup, item,
																									firstBlock, grid,
																									itemSocket,
																									secondBlock,
																									group };
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
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_11_3_bookkeepingforedges_greenBBBBBBFFFFF(
			PerformRuleResult ruleresult, EObject item, EObject firstBlock, EObject itemSocket, EObject secondBlock,
			EObject group) {
		EMoflonEdge itemSocket__item____item = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__secondBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge secondBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge group__firstBlock____occupies = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge firstBlock__group____isOccupiedBy = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "create_a_horizontal_table";
		String itemSocket__item____item_name_prime = "item";
		String group__secondBlock____occupies_name_prime = "occupies";
		String secondBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		String group__firstBlock____occupies_name_prime = "occupies";
		String firstBlock__group____isOccupiedBy_name_prime = "isOccupiedBy";
		itemSocket__item____item.setSrc(itemSocket);
		itemSocket__item____item.setTrg(item);
		ruleresult.getTranslatedEdges().add(itemSocket__item____item);
		group__secondBlock____occupies.setSrc(group);
		group__secondBlock____occupies.setTrg(secondBlock);
		ruleresult.getCreatedEdges().add(group__secondBlock____occupies);
		secondBlock__group____isOccupiedBy.setSrc(secondBlock);
		secondBlock__group____isOccupiedBy.setTrg(group);
		ruleresult.getCreatedEdges().add(secondBlock__group____isOccupiedBy);
		group__firstBlock____occupies.setSrc(group);
		group__firstBlock____occupies.setTrg(firstBlock);
		ruleresult.getCreatedEdges().add(group__firstBlock____occupies);
		firstBlock__group____isOccupiedBy.setSrc(firstBlock);
		firstBlock__group____isOccupiedBy.setTrg(group);
		ruleresult.getCreatedEdges().add(firstBlock__group____isOccupiedBy);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		itemSocket__item____item.setName(itemSocket__item____item_name_prime);
		group__secondBlock____occupies.setName(group__secondBlock____occupies_name_prime);
		secondBlock__group____isOccupiedBy.setName(secondBlock__group____isOccupiedBy_name_prime);
		group__firstBlock____occupies.setName(group__firstBlock____occupies_name_prime);
		firstBlock__group____isOccupiedBy.setName(firstBlock__group____isOccupiedBy_name_prime);
		return new Object[] { ruleresult, item, firstBlock, itemSocket, secondBlock, group, itemSocket__item____item,
				group__secondBlock____occupies, secondBlock__group____isOccupiedBy, group__firstBlock____occupies,
				firstBlock__group____isOccupiedBy };
	}

	public static final void pattern_create_a_horizontal_table_11_5_registerobjects_expressionBBBBBBBBB(
			create_a_horizontal_table _this, PerformRuleResult ruleresult, EObject socketToGroup, EObject item,
			EObject firstBlock, EObject grid, EObject itemSocket, EObject secondBlock, EObject group) {
		_this.registerObjects_BWD(ruleresult, socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group);

	}

	public static final PerformRuleResult pattern_create_a_horizontal_table_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_1_preparereturnvalue_bindingFB(
			create_a_horizontal_table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_1_preparereturnvalue_blackFBB(EClass eClass,
			create_a_horizontal_table _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_1_preparereturnvalue_bindingAndBlackFFB(
			create_a_horizontal_table _this) {
		Object[] result_pattern_create_a_horizontal_table_12_1_preparereturnvalue_binding = pattern_create_a_horizontal_table_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_create_a_horizontal_table_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_create_a_horizontal_table_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_create_a_horizontal_table_12_1_preparereturnvalue_black = pattern_create_a_horizontal_table_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_create_a_horizontal_table_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_create_a_horizontal_table_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "create_a_horizontal_table";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_create_a_horizontal_table_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("item");
		EObject _localVariable_1 = match.getObject("itemSocket");
		EObject tmpItem = _localVariable_0;
		EObject tmpItemSocket = _localVariable_1;
		if (tmpItem instanceof Table) {
			Table item = (Table) tmpItem;
			if (tmpItemSocket instanceof ItemSocket) {
				ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
				return new Object[] { item, itemSocket, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_create_a_horizontal_table_12_2_corematch_blackFBBFB(Table item,
			ItemSocket itemSocket, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SocketToGroupCorr socketToGroup : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(itemSocket, SocketToGroupCorr.class, "target")) {
			Group group = socketToGroup.getSource();
			if (group != null) {
				_result.add(new Object[] { socketToGroup, item, itemSocket, group, match });
			}

		}
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_3_findcontext_black_nac_0BB(Block secondBlock,
			Group group) {
		Group noGroup2 = secondBlock.getIsOccupiedBy();
		if (noGroup2 != null) {
			if (!group.equals(noGroup2)) {
				return new Object[] { secondBlock, group };
			}
		}

		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_3_findcontext_black_nac_1BB(Block firstBlock,
			Group group) {
		Group noGroup1 = firstBlock.getIsOccupiedBy();
		if (noGroup1 != null) {
			if (!group.equals(noGroup1)) {
				return new Object[] { firstBlock, group };
			}
		}

		return null;
	}

	public static final Iterable<Object[]> pattern_create_a_horizontal_table_12_3_findcontext_blackBBFFBFB(
			SocketToGroupCorr socketToGroup, Table item, ItemSocket itemSocket, Group group) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (item.equals(itemSocket.getItem())) {
			if (group.equals(socketToGroup.getSource())) {
				if (itemSocket.equals(socketToGroup.getTarget())) {
					for (Grid grid : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(group,
							Grid.class, "groups")) {
						for (Block secondBlock : grid.getBlocks()) {
							Block firstBlock = secondBlock.getW();
							if (firstBlock != null) {
								if (!firstBlock.equals(secondBlock)) {
									if (grid.getBlocks().contains(firstBlock)) {
										if (pattern_create_a_horizontal_table_12_3_findcontext_black_nac_0BB(
												secondBlock, group) == null) {
											if (pattern_create_a_horizontal_table_12_3_findcontext_black_nac_1BB(
													firstBlock, group) == null) {
												_result.add(new Object[] { socketToGroup, item, firstBlock, grid,
														itemSocket, secondBlock, group });
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
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_3_findcontext_greenBBBBBBBFFFFFFFFF(
			SocketToGroupCorr socketToGroup, Table item, Block firstBlock, Grid grid, ItemSocket itemSocket,
			Block secondBlock, Group group) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge itemSocket__item____item = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge socketToGroup__group____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge firstBlock__secondBlock____e = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge secondBlock__firstBlock____w = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__group____groups = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__secondBlock____blocks = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge socketToGroup__itemSocket____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge grid__firstBlock____blocks = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String itemSocket__item____item_name_prime = "item";
		String socketToGroup__group____source_name_prime = "source";
		String firstBlock__secondBlock____e_name_prime = "e";
		String secondBlock__firstBlock____w_name_prime = "w";
		String grid__group____groups_name_prime = "groups";
		String grid__secondBlock____blocks_name_prime = "blocks";
		String socketToGroup__itemSocket____target_name_prime = "target";
		String grid__firstBlock____blocks_name_prime = "blocks";
		isApplicableMatch.getAllContextElements().add(socketToGroup);
		isApplicableMatch.getAllContextElements().add(item);
		isApplicableMatch.getAllContextElements().add(firstBlock);
		isApplicableMatch.getAllContextElements().add(grid);
		isApplicableMatch.getAllContextElements().add(itemSocket);
		isApplicableMatch.getAllContextElements().add(secondBlock);
		isApplicableMatch.getAllContextElements().add(group);
		itemSocket__item____item.setSrc(itemSocket);
		itemSocket__item____item.setTrg(item);
		isApplicableMatch.getAllContextElements().add(itemSocket__item____item);
		socketToGroup__group____source.setSrc(socketToGroup);
		socketToGroup__group____source.setTrg(group);
		isApplicableMatch.getAllContextElements().add(socketToGroup__group____source);
		firstBlock__secondBlock____e.setSrc(firstBlock);
		firstBlock__secondBlock____e.setTrg(secondBlock);
		isApplicableMatch.getAllContextElements().add(firstBlock__secondBlock____e);
		secondBlock__firstBlock____w.setSrc(secondBlock);
		secondBlock__firstBlock____w.setTrg(firstBlock);
		isApplicableMatch.getAllContextElements().add(secondBlock__firstBlock____w);
		grid__group____groups.setSrc(grid);
		grid__group____groups.setTrg(group);
		isApplicableMatch.getAllContextElements().add(grid__group____groups);
		grid__secondBlock____blocks.setSrc(grid);
		grid__secondBlock____blocks.setTrg(secondBlock);
		isApplicableMatch.getAllContextElements().add(grid__secondBlock____blocks);
		socketToGroup__itemSocket____target.setSrc(socketToGroup);
		socketToGroup__itemSocket____target.setTrg(itemSocket);
		isApplicableMatch.getAllContextElements().add(socketToGroup__itemSocket____target);
		grid__firstBlock____blocks.setSrc(grid);
		grid__firstBlock____blocks.setTrg(firstBlock);
		isApplicableMatch.getAllContextElements().add(grid__firstBlock____blocks);
		itemSocket__item____item.setName(itemSocket__item____item_name_prime);
		socketToGroup__group____source.setName(socketToGroup__group____source_name_prime);
		firstBlock__secondBlock____e.setName(firstBlock__secondBlock____e_name_prime);
		secondBlock__firstBlock____w.setName(secondBlock__firstBlock____w_name_prime);
		grid__group____groups.setName(grid__group____groups_name_prime);
		grid__secondBlock____blocks.setName(grid__secondBlock____blocks_name_prime);
		socketToGroup__itemSocket____target.setName(socketToGroup__itemSocket____target_name_prime);
		grid__firstBlock____blocks.setName(grid__firstBlock____blocks_name_prime);
		return new Object[] { socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group, isApplicableMatch,
				itemSocket__item____item, socketToGroup__group____source, firstBlock__secondBlock____e,
				secondBlock__firstBlock____w, grid__group____groups, grid__secondBlock____blocks,
				socketToGroup__itemSocket____target, grid__firstBlock____blocks };
	}

	public static final Object[] pattern_create_a_horizontal_table_12_4_solveCSP_bindingFBBBBBBBBB(
			create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch, SocketToGroupCorr socketToGroup,
			Table item, Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, socketToGroup, item, firstBlock, grid,
				itemSocket, secondBlock, group);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, socketToGroup, item, firstBlock, grid, itemSocket,
					secondBlock, group };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_create_a_horizontal_table_12_4_solveCSP_bindingAndBlackFBBBBBBBBB(
			create_a_horizontal_table _this, IsApplicableMatch isApplicableMatch, SocketToGroupCorr socketToGroup,
			Table item, Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group) {
		Object[] result_pattern_create_a_horizontal_table_12_4_solveCSP_binding = pattern_create_a_horizontal_table_12_4_solveCSP_bindingFBBBBBBBBB(
				_this, isApplicableMatch, socketToGroup, item, firstBlock, grid, itemSocket, secondBlock, group);
		if (result_pattern_create_a_horizontal_table_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_create_a_horizontal_table_12_4_solveCSP_binding[0];

			Object[] result_pattern_create_a_horizontal_table_12_4_solveCSP_black = pattern_create_a_horizontal_table_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_create_a_horizontal_table_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, socketToGroup, item, firstBlock, grid, itemSocket,
						secondBlock, group };
			}
		}
		return null;
	}

	public static final boolean pattern_create_a_horizontal_table_12_5_checkCSP_expressionFBB(
			create_a_horizontal_table _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_create_a_horizontal_table_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "create_a_horizontal_table";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_create_a_horizontal_table_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_20_1_preparereturnvalue_bindingFB(
			create_a_horizontal_table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			create_a_horizontal_table _this) {
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

	public static final Object[] pattern_create_a_horizontal_table_20_1_preparereturnvalue_bindingAndBlackFFBF(
			create_a_horizontal_table _this) {
		Object[] result_pattern_create_a_horizontal_table_20_1_preparereturnvalue_binding = pattern_create_a_horizontal_table_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_create_a_horizontal_table_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_create_a_horizontal_table_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_create_a_horizontal_table_20_1_preparereturnvalue_black = pattern_create_a_horizontal_table_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_create_a_horizontal_table_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_create_a_horizontal_table_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_create_a_horizontal_table_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_create_a_horizontal_table_20_2_testcorematchandDECs_blackFFFFB(
			EMoflonEdge _edge_occupies) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpGroup = _edge_occupies.getSrc();
		if (tmpGroup instanceof Group) {
			Group group = (Group) tmpGroup;
			EObject tmpSecondBlock = _edge_occupies.getTrg();
			if (tmpSecondBlock instanceof Block) {
				Block secondBlock = (Block) tmpSecondBlock;
				if (group.getOccupies().contains(secondBlock)) {
					Block firstBlock = secondBlock.getW();
					if (firstBlock != null) {
						if (!firstBlock.equals(secondBlock)) {
							if (group.getOccupies().contains(firstBlock)) {
								for (Grid grid : org.moflon.core.utilities.eMoflonEMFUtil
										.getOppositeReferenceTyped(group, Grid.class, "groups")) {
									if (grid.getBlocks().contains(secondBlock)) {
										if (grid.getBlocks().contains(firstBlock)) {
											_result.add(new Object[] { firstBlock, grid, secondBlock, group,
													_edge_occupies });
										}
									}
								}
							}
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_create_a_horizontal_table_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBB(
			create_a_horizontal_table _this, Match match, Block firstBlock, Grid grid, Block secondBlock, Group group) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, firstBlock, grid, secondBlock, group);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_create_a_horizontal_table_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			create_a_horizontal_table _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_create_a_horizontal_table_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_21_1_preparereturnvalue_bindingFB(
			create_a_horizontal_table _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			create_a_horizontal_table _this) {
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

	public static final Object[] pattern_create_a_horizontal_table_21_1_preparereturnvalue_bindingAndBlackFFBF(
			create_a_horizontal_table _this) {
		Object[] result_pattern_create_a_horizontal_table_21_1_preparereturnvalue_binding = pattern_create_a_horizontal_table_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_create_a_horizontal_table_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_create_a_horizontal_table_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_create_a_horizontal_table_21_1_preparereturnvalue_black = pattern_create_a_horizontal_table_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_create_a_horizontal_table_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_create_a_horizontal_table_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_create_a_horizontal_table_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_create_a_horizontal_table_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_item) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpItemSocket = _edge_item.getSrc();
		if (tmpItemSocket instanceof ItemSocket) {
			ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
			EObject tmpItem = _edge_item.getTrg();
			if (tmpItem instanceof Table) {
				Table item = (Table) tmpItem;
				if (item.equals(itemSocket.getItem())) {
					_result.add(new Object[] { item, itemSocket, _edge_item });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_create_a_horizontal_table_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			create_a_horizontal_table _this, Match match, Table item, ItemSocket itemSocket) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, item, itemSocket);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_create_a_horizontal_table_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			create_a_horizontal_table _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_create_a_horizontal_table_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_24_1_prepare_blackB(
			create_a_horizontal_table _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_create_a_horizontal_table_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_bindingFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("item");
		EObject _localVariable_1 = sourceMatch.getObject("firstBlock");
		EObject _localVariable_2 = sourceMatch.getObject("grid");
		EObject _localVariable_3 = targetMatch.getObject("itemSocket");
		EObject _localVariable_4 = sourceMatch.getObject("secondBlock");
		EObject _localVariable_5 = sourceMatch.getObject("group");
		EObject tmpItem = _localVariable_0;
		EObject tmpFirstBlock = _localVariable_1;
		EObject tmpGrid = _localVariable_2;
		EObject tmpItemSocket = _localVariable_3;
		EObject tmpSecondBlock = _localVariable_4;
		EObject tmpGroup = _localVariable_5;
		if (tmpItem instanceof Table) {
			Table item = (Table) tmpItem;
			if (tmpFirstBlock instanceof Block) {
				Block firstBlock = (Block) tmpFirstBlock;
				if (tmpGrid instanceof Grid) {
					Grid grid = (Grid) tmpGrid;
					if (tmpItemSocket instanceof ItemSocket) {
						ItemSocket itemSocket = (ItemSocket) tmpItemSocket;
						if (tmpSecondBlock instanceof Block) {
							Block secondBlock = (Block) tmpSecondBlock;
							if (tmpGroup instanceof Group) {
								Group group = (Group) tmpGroup;
								return new Object[] { item, firstBlock, grid, itemSocket, secondBlock, group,
										targetMatch, sourceMatch };
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_blackBBBBBBBB(Table item,
			Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group, Match sourceMatch,
			Match targetMatch) {
		if (!firstBlock.equals(secondBlock)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { item, firstBlock, grid, itemSocket, secondBlock, group, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding = pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_bindingFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding != null) {
			Table item = (Table) result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding[0];
			Block firstBlock = (Block) result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding[1];
			Grid grid = (Grid) result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding[2];
			ItemSocket itemSocket = (ItemSocket) result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding[3];
			Block secondBlock = (Block) result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding[4];
			Group group = (Group) result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_binding[5];

			Object[] result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_black = pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_blackBBBBBBBB(
					item, firstBlock, grid, itemSocket, secondBlock, group, sourceMatch, targetMatch);
			if (result_pattern_create_a_horizontal_table_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { item, firstBlock, grid, itemSocket, secondBlock, group, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_24_3_solvecsp_bindingFBBBBBBBBB(
			create_a_horizontal_table _this, Table item, Block firstBlock, Grid grid, ItemSocket itemSocket,
			Block secondBlock, Group group, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_6 = _this.isApplicable_solveCsp_CC(item, firstBlock, grid, itemSocket, secondBlock, group,
				sourceMatch, targetMatch);
		CSP csp = _localVariable_6;
		if (csp != null) {
			return new Object[] { csp, _this, item, firstBlock, grid, itemSocket, secondBlock, group, sourceMatch,
					targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_create_a_horizontal_table_24_3_solvecsp_bindingAndBlackFBBBBBBBBB(
			create_a_horizontal_table _this, Table item, Block firstBlock, Grid grid, ItemSocket itemSocket,
			Block secondBlock, Group group, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_create_a_horizontal_table_24_3_solvecsp_binding = pattern_create_a_horizontal_table_24_3_solvecsp_bindingFBBBBBBBBB(
				_this, item, firstBlock, grid, itemSocket, secondBlock, group, sourceMatch, targetMatch);
		if (result_pattern_create_a_horizontal_table_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_create_a_horizontal_table_24_3_solvecsp_binding[0];

			Object[] result_pattern_create_a_horizontal_table_24_3_solvecsp_black = pattern_create_a_horizontal_table_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_create_a_horizontal_table_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, item, firstBlock, grid, itemSocket, secondBlock, group, sourceMatch,
						targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_create_a_horizontal_table_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_create_a_horizontal_table_24_5_matchcorrcontext_blackFBBBB(
			ItemSocket itemSocket, Group group, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (SocketToGroupCorr socketToGroup : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(group, SocketToGroupCorr.class, "source")) {
				if (itemSocket.equals(socketToGroup.getTarget())) {
					_result.add(new Object[] { socketToGroup, itemSocket, group, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_24_5_matchcorrcontext_greenBBBF(
			SocketToGroupCorr socketToGroup, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "create_a_horizontal_table";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(socketToGroup);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { socketToGroup, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_create_a_horizontal_table_24_6_createcorrespondence_blackBBBBBBB(Table item,
			Block firstBlock, Grid grid, ItemSocket itemSocket, Block secondBlock, Group group, CCMatch ccMatch) {
		if (!firstBlock.equals(secondBlock)) {
			return new Object[] { item, firstBlock, grid, itemSocket, secondBlock, group, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_create_a_horizontal_table_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_create_a_horizontal_table_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "create_a_horizontal_table";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_create_a_horizontal_table_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_27_1_matchtggpattern_blackBBBB(Block firstBlock,
			Grid grid, Block secondBlock, Group group) {
		if (!firstBlock.equals(secondBlock)) {
			if (group.getOccupies().contains(secondBlock)) {
				if (secondBlock.equals(firstBlock.getE())) {
					if (grid.getGroups().contains(group)) {
						if (grid.getBlocks().contains(secondBlock)) {
							if (group.getOccupies().contains(firstBlock)) {
								if (grid.getBlocks().contains(firstBlock)) {
									return new Object[] { firstBlock, grid, secondBlock, group };
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final boolean pattern_create_a_horizontal_table_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_create_a_horizontal_table_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_create_a_horizontal_table_28_1_matchtggpattern_blackBB(Table item,
			ItemSocket itemSocket) {
		if (item.equals(itemSocket.getItem())) {
			return new Object[] { item, itemSocket };
		}
		return null;
	}

	public static final boolean pattern_create_a_horizontal_table_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_create_a_horizontal_table_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //create_a_horizontal_tableImpl
