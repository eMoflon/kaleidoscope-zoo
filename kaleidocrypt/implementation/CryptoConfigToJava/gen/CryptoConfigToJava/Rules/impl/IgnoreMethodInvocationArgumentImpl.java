/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument;
import CryptoConfigToJava.Rules.RulesPackage;

import SimpleJava.JavaExpression;
import SimpleJava.JavaMethodInvocation;
import SimpleJava.JavaStatement;
import SimpleJava.SimpleJavaFactory;

import java.lang.Iterable;

import java.lang.reflect.InvocationTargetException;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;
import org.moflon.tgg.language.modelgenerator.RuleEntryList;

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.RuntimeFactory;
import org.moflon.tgg.runtime.TripleMatch;

import org.moflon.tgg.runtime.impl.AbstractRuleImpl;
// <-- [user defined imports]
import org.moflon.tgg.csp.*;
import CryptoConfigToJava.csp.constraints.*;
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
 * An implementation of the model object '<em><b>Ignore Method Invocation Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IgnoreMethodInvocationArgumentImpl extends AbstractRuleImpl implements IgnoreMethodInvocationArgument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IgnoreMethodInvocationArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getIgnoreMethodInvocationArgument();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match) {

		Object[] result1_black = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_0_1_initialbindings_blackBB(this, match);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_bindingAndBlackFBB(this, match);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_0_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_0_4_collectelementstobetranslated_blackB(match);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}

			Object[] result5_black = IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_0_5_collectcontextelements_blackB(match);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}
			// 
			IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_0_6_registerobjectstomatch_expressionBB(this, match);
			return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_0_7_expressionF();
		} else {
			return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {
		// [user code injected with eMoflon]

		// TODO: implement this method here but do not remove the injection marker 
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match) {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match) {// Create CSP
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
	public boolean checkTypes_FWD(Match match) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, JavaExpression argument, JavaMethodInvocation jmi) {

		Object[] result1_black = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_7_1_initialbindings_blackBBBB(this, match, argument, jmi);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[argument] = " + argument + ", " + "[jmi] = " + jmi + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_bindingAndBlackFBBBB(this, match, argument, jmi);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[argument] = " + argument + ", " + "[jmi] = " + jmi + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_7_3_CheckCSP_expressionFBB(this,
				csp)) {

			Object[] result4_black = IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_7_4_collectelementstobetranslated_blackBBB(match, argument,
							jmi);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[argument] = " + argument + ", " + "[jmi] = " + jmi + ".");
			}
			IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_7_4_collectelementstobetranslated_greenBBBF(match, argument,
							jmi);
			//nothing EMoflonEdge jmi__argument____arguments = (EMoflonEdge) result4_green[3];

			Object[] result5_black = IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_7_5_collectcontextelements_blackBBB(match, argument, jmi);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[argument] = " + argument + ", " + "[jmi] = " + jmi + ".");
			}
			IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_7_5_collectcontextelements_greenBB(match, jmi);

			// 
			IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_7_6_registerobjectstomatch_expressionBBBB(this, match,
							argument, jmi);
			return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_7_7_expressionF();
		} else {
			return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaExpression argument = (JavaExpression) result1_bindingAndBlack[0];
		JavaMethodInvocation jmi = (JavaMethodInvocation) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_black = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_8_2_collecttranslatedelements_blackB(argument);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[argument] = " + argument + ".");
		}
		Object[] result2_green = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_8_2_collecttranslatedelements_greenFB(argument);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_8_3_bookkeepingforedges_blackBBB(ruleresult, argument, jmi);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[argument] = " + argument + ", " + "[jmi] = " + jmi + ".");
		}
		IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_8_3_bookkeepingforedges_greenBBBF(ruleresult, argument, jmi);
		//nothing EMoflonEdge jmi__argument____arguments = (EMoflonEdge) result3_green[3];

		// 
		// 
		IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_8_5_registerobjects_expressionBBBB(
				this, ruleresult, argument, jmi);
		return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_9_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		JavaExpression argument = (JavaExpression) result2_binding[0];
		JavaMethodInvocation jmi = (JavaMethodInvocation) result2_binding[1];
		for (Object[] result2_black : IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_9_2_corematch_blackBBB(argument, jmi, match)) {
			// ForEach 
			for (Object[] result3_black : IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_9_3_findcontext_blackBB(argument, jmi)) {
				Object[] result3_green = IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_9_3_findcontext_greenBBFF(argument, jmi);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge jmi__argument____arguments = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_bindingAndBlackFBBBB(this,
								isApplicableMatch, argument, jmi);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[argument] = " + argument + ", "
							+ "[jmi] = " + jmi + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_9_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = IgnoreMethodInvocationArgumentImpl
							.pattern_IgnoreMethodInvocationArgument_9_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					IgnoreMethodInvocationArgumentImpl
							.pattern_IgnoreMethodInvocationArgument_9_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		match.registerObject("argument", argument);
		match.registerObject("jmi", jmi);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, JavaExpression argument, JavaMethodInvocation jmi) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaExpression argument,
			JavaMethodInvocation jmi) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("argument", argument);
		isApplicableMatch.registerObject("jmi", jmi);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject argument, EObject jmi) {
		ruleresult.registerObject("argument", argument);
		ruleresult.registerObject("jmi", jmi);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("argument").eClass())
				.equals("SimpleJava.JavaExpression.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_10(EMoflonEdge _edge_arguments) {

		Object[] result1_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_17_2_testcorematchandDECs_blackFFB(_edge_arguments)) {
			JavaExpression argument = (JavaExpression) result2_black[0];
			JavaMethodInvocation jmi = (JavaMethodInvocation) result2_black[1];
			Object[] result2_green = IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, argument, jmi)) {
				// 
				if (IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = IgnoreMethodInvocationArgumentImpl
							.pattern_IgnoreMethodInvocationArgument_17_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					IgnoreMethodInvocationArgumentImpl
							.pattern_IgnoreMethodInvocationArgument_17_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("IgnoreMethodInvocationArgument");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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
	public AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("IgnoreMethodInvocationArgument");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
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

		Object[] result1_black = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_20_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_20_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		JavaExpression argument = (JavaExpression) result2_bindingAndBlack[0];
		JavaMethodInvocation jmi = (JavaMethodInvocation) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_bindingAndBlackFBBBBB(this, argument, jmi,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[argument] = " + argument + ", " + "[jmi] = " + jmi + ", " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_20_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_20_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_20_5_matchcorrcontext_greenBBF(sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_20_6_createcorrespondence_blackBBB(argument, jmi,
								ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[argument] = " + argument
							+ ", " + "[jmi] = " + jmi + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_20_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_20_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_20_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(JavaExpression argument, JavaMethodInvocation jmi, Match sourceMatch,
			Match targetMatch) {// Create CSP
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
	public boolean isApplicable_checkCsp_CC(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_FWD() {// 
		return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_23_2_expressionF();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(JavaExpression argument, JavaMethodInvocation jmi) {// 
		Object[] result1_black = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_24_1_matchtggpattern_blackBB(argument, jmi);
		if (result1_black != null) {
			return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_24_2_expressionF();
		} else {
			return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaMethodInvocation jmiParameter) {

		Object[] result1_black = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_25_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_25_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : IgnoreMethodInvocationArgumentImpl
				.pattern_IgnoreMethodInvocationArgument_25_2_isapplicablecore_blackFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList jmiList = (RuleEntryList) result2_black[0];
			JavaMethodInvocation jmi = (JavaMethodInvocation) result2_black[1];

			Object[] result3_bindingAndBlack = IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch,
							jmi, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jmi] = " + jmi + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (IgnoreMethodInvocationArgumentImpl
					.pattern_IgnoreMethodInvocationArgument_25_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = IgnoreMethodInvocationArgumentImpl
						.pattern_IgnoreMethodInvocationArgument_25_5_checknacs_blackB(jmi);
				if (result5_black != null) {

					Object[] result6_black = IgnoreMethodInvocationArgumentImpl
							.pattern_IgnoreMethodInvocationArgument_25_6_perform_blackBB(jmi, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jmi] = " + jmi + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_25_6_perform_greenFBB(jmi,
							ruleResult);
					//nothing JavaExpression argument = (JavaExpression) result6_green[0];

				} else {
				}

			} else {
			}

		}
		return IgnoreMethodInvocationArgumentImpl.pattern_IgnoreMethodInvocationArgument_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaMethodInvocation jmi,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jmi", jmi);
		return csp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean generateModel_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_FWD__MATCH:
			return isAppropriate_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH:
			registerObjectsToMatch_FWD((Match) arguments.get(0));
			return null;
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_BWD__MATCH_JAVAEXPRESSION_JAVAMETHODINVOCATION:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaExpression) arguments.get(1),
					(JavaMethodInvocation) arguments.get(2));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAEXPRESSION_JAVAMETHODINVOCATION:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaExpression) arguments.get(1),
					(JavaMethodInvocation) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAEXPRESSION_JAVAMETHODINVOCATION:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaExpression) arguments.get(1),
					(JavaMethodInvocation) arguments.get(2));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAEXPRESSION_JAVAMETHODINVOCATION:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (JavaExpression) arguments.get(1),
					(JavaMethodInvocation) arguments.get(2));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_SOLVE_CSP_CC__JAVAEXPRESSION_JAVAMETHODINVOCATION_MATCH_MATCH:
			return isApplicable_solveCsp_CC((JavaExpression) arguments.get(0), (JavaMethodInvocation) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_DEC_FWD:
			return checkDEC_FWD();
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___CHECK_DEC_BWD__JAVAEXPRESSION_JAVAMETHODINVOCATION:
			return checkDEC_BWD((JavaExpression) arguments.get(0), (JavaMethodInvocation) arguments.get(1));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___GENERATE_MODEL__RULEENTRYCONTAINER_JAVAMETHODINVOCATION:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaMethodInvocation) arguments.get(1));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAMETHODINVOCATION_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaMethodInvocation) arguments.get(1), (ModelgeneratorRuleResult) arguments.get(2));
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_0_1_initialbindings_blackBB(
			IgnoreMethodInvocationArgument _this, Match match) {
		return new Object[] { _this, match };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_bindingFBB(
			IgnoreMethodInvocationArgument _this, Match match) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_bindingAndBlackFBB(
			IgnoreMethodInvocationArgument _this, Match match) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_binding = pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_bindingFBB(
				_this, match);
		if (result_pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_black = pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreMethodInvocationArgument_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_0_3_CheckCSP_expressionFBB(
			IgnoreMethodInvocationArgument _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_0_4_collectelementstobetranslated_blackB(
			Match match) {
		return new Object[] { match };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_0_5_collectcontextelements_blackB(Match match) {
		return new Object[] { match };
	}

	public static final void pattern_IgnoreMethodInvocationArgument_0_6_registerobjectstomatch_expressionBB(
			IgnoreMethodInvocationArgument _this, Match match) {
		_this.registerObjectsToMatch_FWD(match);

	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_1_initialbindings_blackBBBB(
			IgnoreMethodInvocationArgument _this, Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		if (!argument.equals(jmi)) {
			return new Object[] { _this, match, argument, jmi };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_bindingFBBBB(
			IgnoreMethodInvocationArgument _this, Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, argument, jmi);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, argument, jmi };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_bindingAndBlackFBBBB(
			IgnoreMethodInvocationArgument _this, Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_binding = pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_bindingFBBBB(
				_this, match, argument, jmi);
		if (result_pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_black = pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreMethodInvocationArgument_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, argument, jmi };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_7_3_CheckCSP_expressionFBB(
			IgnoreMethodInvocationArgument _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_4_collectelementstobetranslated_blackBBB(
			Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		if (!argument.equals(jmi)) {
			return new Object[] { match, argument, jmi };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_4_collectelementstobetranslated_greenBBBF(
			Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		EMoflonEdge jmi__argument____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(argument);
		String jmi__argument____arguments_name_prime = "arguments";
		jmi__argument____arguments.setSrc(jmi);
		jmi__argument____arguments.setTrg(argument);
		match.getToBeTranslatedEdges().add(jmi__argument____arguments);
		jmi__argument____arguments.setName(jmi__argument____arguments_name_prime);
		return new Object[] { match, argument, jmi, jmi__argument____arguments };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_5_collectcontextelements_blackBBB(Match match,
			JavaExpression argument, JavaMethodInvocation jmi) {
		if (!argument.equals(jmi)) {
			return new Object[] { match, argument, jmi };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_7_5_collectcontextelements_greenBB(Match match,
			JavaMethodInvocation jmi) {
		match.getContextNodes().add(jmi);
		return new Object[] { match, jmi };
	}

	public static final void pattern_IgnoreMethodInvocationArgument_7_6_registerobjectstomatch_expressionBBBB(
			IgnoreMethodInvocationArgument _this, Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		_this.registerObjectsToMatch_BWD(match, argument, jmi);

	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("argument");
		EObject _localVariable_1 = isApplicableMatch.getObject("jmi");
		EObject tmpArgument = _localVariable_0;
		EObject tmpJmi = _localVariable_1;
		if (tmpArgument instanceof JavaExpression) {
			JavaExpression argument = (JavaExpression) tmpArgument;
			if (tmpJmi instanceof JavaMethodInvocation) {
				JavaMethodInvocation jmi = (JavaMethodInvocation) tmpJmi;
				return new Object[] { argument, jmi, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_blackBBFBB(
			JavaExpression argument, JavaMethodInvocation jmi, IgnoreMethodInvocationArgument _this,
			IsApplicableMatch isApplicableMatch) {
		if (!argument.equals(jmi)) {
			for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
				if (tmpCsp instanceof CSP) {
					CSP csp = (CSP) tmpCsp;
					return new Object[] { argument, jmi, csp, _this, isApplicableMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_bindingAndBlackFFFBB(
			IgnoreMethodInvocationArgument _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_binding = pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_binding != null) {
			JavaExpression argument = (JavaExpression) result_pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_binding[0];
			JavaMethodInvocation jmi = (JavaMethodInvocation) result_pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_binding[1];

			Object[] result_pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_black = pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_blackBBFBB(
					argument, jmi, _this, isApplicableMatch);
			if (result_pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_IgnoreMethodInvocationArgument_8_1_performtransformation_black[2];

				return new Object[] { argument, jmi, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_8_2_collecttranslatedelements_blackB(
			JavaExpression argument) {
		return new Object[] { argument };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_8_2_collecttranslatedelements_greenFB(
			JavaExpression argument) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(argument);
		return new Object[] { ruleresult, argument };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_8_3_bookkeepingforedges_blackBBB(
			PerformRuleResult ruleresult, EObject argument, EObject jmi) {
		if (!argument.equals(jmi)) {
			return new Object[] { ruleresult, argument, jmi };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_8_3_bookkeepingforedges_greenBBBF(
			PerformRuleResult ruleresult, EObject argument, EObject jmi) {
		EMoflonEdge jmi__argument____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "IgnoreMethodInvocationArgument";
		String jmi__argument____arguments_name_prime = "arguments";
		jmi__argument____arguments.setSrc(jmi);
		jmi__argument____arguments.setTrg(argument);
		ruleresult.getTranslatedEdges().add(jmi__argument____arguments);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jmi__argument____arguments.setName(jmi__argument____arguments_name_prime);
		return new Object[] { ruleresult, argument, jmi, jmi__argument____arguments };
	}

	public static final void pattern_IgnoreMethodInvocationArgument_8_5_registerobjects_expressionBBBB(
			IgnoreMethodInvocationArgument _this, PerformRuleResult ruleresult, EObject argument, EObject jmi) {
		_this.registerObjects_BWD(ruleresult, argument, jmi);

	}

	public static final PerformRuleResult pattern_IgnoreMethodInvocationArgument_8_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_bindingFB(
			IgnoreMethodInvocationArgument _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_blackFBB(EClass eClass,
			IgnoreMethodInvocationArgument _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_bindingAndBlackFFB(
			IgnoreMethodInvocationArgument _this) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_binding = pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_black = pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "IgnoreMethodInvocationArgument";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("argument");
		EObject _localVariable_1 = match.getObject("jmi");
		EObject tmpArgument = _localVariable_0;
		EObject tmpJmi = _localVariable_1;
		if (tmpArgument instanceof JavaExpression) {
			JavaExpression argument = (JavaExpression) tmpArgument;
			if (tmpJmi instanceof JavaMethodInvocation) {
				JavaMethodInvocation jmi = (JavaMethodInvocation) tmpJmi;
				return new Object[] { argument, jmi, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreMethodInvocationArgument_9_2_corematch_blackBBB(
			JavaExpression argument, JavaMethodInvocation jmi, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!argument.equals(jmi)) {
			_result.add(new Object[] { argument, jmi, match });
		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreMethodInvocationArgument_9_3_findcontext_blackBB(
			JavaExpression argument, JavaMethodInvocation jmi) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!argument.equals(jmi)) {
			if (jmi.getArguments().contains(argument)) {
				_result.add(new Object[] { argument, jmi });
			}
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_3_findcontext_greenBBFF(
			JavaExpression argument, JavaMethodInvocation jmi) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jmi__argument____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jmi__argument____arguments_name_prime = "arguments";
		isApplicableMatch.getAllContextElements().add(argument);
		isApplicableMatch.getAllContextElements().add(jmi);
		jmi__argument____arguments.setSrc(jmi);
		jmi__argument____arguments.setTrg(argument);
		isApplicableMatch.getAllContextElements().add(jmi__argument____arguments);
		jmi__argument____arguments.setName(jmi__argument____arguments_name_prime);
		return new Object[] { argument, jmi, isApplicableMatch, jmi__argument____arguments };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_bindingFBBBB(
			IgnoreMethodInvocationArgument _this, IsApplicableMatch isApplicableMatch, JavaExpression argument,
			JavaMethodInvocation jmi) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, argument, jmi);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, argument, jmi };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_bindingAndBlackFBBBB(
			IgnoreMethodInvocationArgument _this, IsApplicableMatch isApplicableMatch, JavaExpression argument,
			JavaMethodInvocation jmi) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_binding = pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, argument, jmi);
		if (result_pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_binding[0];

			Object[] result_pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_black = pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreMethodInvocationArgument_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, argument, jmi };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_9_5_checkCSP_expressionFBB(
			IgnoreMethodInvocationArgument _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "IgnoreMethodInvocationArgument";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreMethodInvocationArgument_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_bindingFB(
			IgnoreMethodInvocationArgument _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_blackFBBF(
			EClass __eClass, IgnoreMethodInvocationArgument _this) {
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

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_bindingAndBlackFFBF(
			IgnoreMethodInvocationArgument _this) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_binding = pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_black = pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_2_testcorematchandDECs_black_nac_0B(
			JavaExpression argument) {
		for (JavaStatement __DEC_argument_expr_5891 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(argument, JavaStatement.class, "expr")) {
			return new Object[] { argument };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreMethodInvocationArgument_17_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_arguments) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJmi = _edge_arguments.getSrc();
		if (tmpJmi instanceof JavaMethodInvocation) {
			JavaMethodInvocation jmi = (JavaMethodInvocation) tmpJmi;
			EObject tmpArgument = _edge_arguments.getTrg();
			if (tmpArgument instanceof JavaExpression) {
				JavaExpression argument = (JavaExpression) tmpArgument;
				if (!argument.equals(jmi)) {
					if (jmi.getArguments().contains(argument)) {
						if (pattern_IgnoreMethodInvocationArgument_17_2_testcorematchandDECs_black_nac_0B(
								argument) == null) {
							_result.add(new Object[] { argument, jmi, _edge_arguments });
						}
					}
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			IgnoreMethodInvocationArgument _this, Match match, JavaExpression argument, JavaMethodInvocation jmi) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, argument, jmi);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			IgnoreMethodInvocationArgument _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_IgnoreMethodInvocationArgument_17_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_1_prepare_blackB(
			IgnoreMethodInvocationArgument _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_bindingFFB(
			Match targetMatch) {
		EObject _localVariable_0 = targetMatch.getObject("argument");
		EObject _localVariable_1 = targetMatch.getObject("jmi");
		EObject tmpArgument = _localVariable_0;
		EObject tmpJmi = _localVariable_1;
		if (tmpArgument instanceof JavaExpression) {
			JavaExpression argument = (JavaExpression) tmpArgument;
			if (tmpJmi instanceof JavaMethodInvocation) {
				JavaMethodInvocation jmi = (JavaMethodInvocation) tmpJmi;
				return new Object[] { argument, jmi, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_blackBBBB(
			JavaExpression argument, JavaMethodInvocation jmi, Match sourceMatch, Match targetMatch) {
		if (!argument.equals(jmi)) {
			if (!sourceMatch.equals(targetMatch)) {
				return new Object[] { argument, jmi, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_binding = pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_bindingFFB(
				targetMatch);
		if (result_pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_binding != null) {
			JavaExpression argument = (JavaExpression) result_pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_binding[0];
			JavaMethodInvocation jmi = (JavaMethodInvocation) result_pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_black = pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_blackBBBB(
					argument, jmi, sourceMatch, targetMatch);
			if (result_pattern_IgnoreMethodInvocationArgument_20_2_matchsrctrgcontext_black != null) {

				return new Object[] { argument, jmi, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_bindingFBBBBB(
			IgnoreMethodInvocationArgument _this, JavaExpression argument, JavaMethodInvocation jmi, Match sourceMatch,
			Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(argument, jmi, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, argument, jmi, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_bindingAndBlackFBBBBB(
			IgnoreMethodInvocationArgument _this, JavaExpression argument, JavaMethodInvocation jmi, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_binding = pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_bindingFBBBBB(
				_this, argument, jmi, sourceMatch, targetMatch);
		if (result_pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_binding[0];

			Object[] result_pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_black = pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_blackB(
					csp);
			if (result_pattern_IgnoreMethodInvocationArgument_20_3_solvecsp_black != null) {

				return new Object[] { csp, _this, argument, jmi, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_20_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreMethodInvocationArgument_20_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_5_matchcorrcontext_greenBBF(
			Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "IgnoreMethodInvocationArgument";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_6_createcorrespondence_blackBBB(
			JavaExpression argument, JavaMethodInvocation jmi, CCMatch ccMatch) {
		if (!argument.equals(jmi)) {
			return new Object[] { argument, jmi, ccMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_20_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "IgnoreMethodInvocationArgument";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreMethodInvocationArgument_20_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_23_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_23_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_24_1_matchtggpattern_black_nac_0B(
			JavaExpression argument) {
		for (JavaStatement __DEC_argument_expr_261094 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(argument, JavaStatement.class, "expr")) {
			return new Object[] { argument };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_24_1_matchtggpattern_blackBB(
			JavaExpression argument, JavaMethodInvocation jmi) {
		if (!argument.equals(jmi)) {
			if (jmi.getArguments().contains(argument)) {
				if (pattern_IgnoreMethodInvocationArgument_24_1_matchtggpattern_black_nac_0B(argument) == null) {
					return new Object[] { argument, jmi };
				}
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_1_createresult_blackB(
			IgnoreMethodInvocationArgument _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, JavaMethodInvocation jmi) {
		if (ruleResult.getTargetObjects().contains(jmi)) {
			return new Object[] { ruleResult, jmi };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreMethodInvocationArgument_25_2_isapplicablecore_blackFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jmiList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJmi : jmiList.getEntryObjects()) {
				if (tmpJmi instanceof JavaMethodInvocation) {
					JavaMethodInvocation jmi = (JavaMethodInvocation) tmpJmi;
					if (pattern_IgnoreMethodInvocationArgument_25_2_isapplicablecore_black_nac_0BB(ruleResult,
							jmi) == null) {
						_result.add(new Object[] { jmiList, jmi, ruleEntryContainer, ruleResult });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_bindingFBBBB(
			IgnoreMethodInvocationArgument _this, IsApplicableMatch isApplicableMatch, JavaMethodInvocation jmi,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jmi, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jmi, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_bindingAndBlackFBBBB(
			IgnoreMethodInvocationArgument _this, IsApplicableMatch isApplicableMatch, JavaMethodInvocation jmi,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_binding = pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, jmi, ruleResult);
		if (result_pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_binding[0];

			Object[] result_pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_black = pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreMethodInvocationArgument_25_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jmi, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreMethodInvocationArgument_25_4_checkCSP_expressionFBB(
			IgnoreMethodInvocationArgument _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_5_checknacs_blackB(
			JavaMethodInvocation jmi) {
		return new Object[] { jmi };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_6_perform_blackBB(JavaMethodInvocation jmi,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { jmi, ruleResult };
	}

	public static final Object[] pattern_IgnoreMethodInvocationArgument_25_6_perform_greenFBB(JavaMethodInvocation jmi,
			ModelgeneratorRuleResult ruleResult) {
		JavaExpression argument = SimpleJavaFactory.eINSTANCE.createJavaExpression();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		jmi.getArguments().add(argument);
		ruleResult.getTargetObjects().add(argument);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { argument, jmi, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_IgnoreMethodInvocationArgument_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //IgnoreMethodInvocationArgumentImpl
