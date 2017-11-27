/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoConfigToJava.Rules.IgnoreOpaqueMethod;
import CryptoConfigToJava.Rules.RulesPackage;

import SimpleJava.JavaCompilationUnit;
import SimpleJava.JavaOpaqueMethod;
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
 * An implementation of the model object '<em><b>Ignore Opaque Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class IgnoreOpaqueMethodImpl extends AbstractRuleImpl implements IgnoreOpaqueMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IgnoreOpaqueMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getIgnoreOpaqueMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match) {

		Object[] result1_black = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_0_1_initialbindings_blackBB(this,
				match);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_0_2_SolveCSP_bindingAndBlackFBB(this, match);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_0_4_collectelementstobetranslated_blackB(match);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}

			Object[] result5_black = IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_0_5_collectcontextelements_blackB(match);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}
			// 
			IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_0_6_registerobjectstomatch_expressionBB(this, match);
			return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_0_7_expressionF();
		} else {
			return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_0_8_expressionF();
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
	public boolean isAppropriate_BWD(Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {

		Object[] result1_black = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_7_1_initialbindings_blackBBBB(this,
				match, jcu, method);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jcu] = " + jcu + ", " + "[method] = " + method + ".");
		}

		Object[] result2_bindingAndBlack = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_7_2_SolveCSP_bindingAndBlackFBBBB(this, match, jcu, method);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jcu] = " + jcu + ", " + "[method] = " + method + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_7_4_collectelementstobetranslated_blackBBB(match, jcu, method);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jcu] = " + jcu + ", " + "[method] = " + method + ".");
			}
			IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_7_4_collectelementstobetranslated_greenBBBF(match, jcu,
					method);
			//nothing EMoflonEdge jcu__method____methods = (EMoflonEdge) result4_green[3];

			Object[] result5_black = IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_7_5_collectcontextelements_blackBBB(match, jcu, method);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jcu] = " + jcu + ", " + "[method] = " + method + ".");
			}
			IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_7_5_collectcontextelements_greenBB(match, jcu);

			// 
			IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_7_6_registerobjectstomatch_expressionBBBB(this, match,
					jcu, method);
			return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_7_7_expressionF();
		} else {
			return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_8_1_performtransformation_bindingAndBlackFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaCompilationUnit jcu = (JavaCompilationUnit) result1_bindingAndBlack[0];
		JavaOpaqueMethod method = (JavaOpaqueMethod) result1_bindingAndBlack[1];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[2];

		Object[] result2_black = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_8_2_collecttranslatedelements_blackB(method);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[method] = " + method + ".");
		}
		Object[] result2_green = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_8_2_collecttranslatedelements_greenFB(method);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_8_3_bookkeepingforedges_blackBBB(ruleresult, jcu, method);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jcu] = " + jcu + ", " + "[method] = " + method + ".");
		}
		IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_8_3_bookkeepingforedges_greenBBBF(ruleresult, jcu, method);
		//nothing EMoflonEdge jcu__method____methods = (EMoflonEdge) result3_green[3];

		// 
		// 
		IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_8_5_registerobjects_expressionBBBB(this, ruleresult, jcu,
				method);
		return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_9_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		JavaCompilationUnit jcu = (JavaCompilationUnit) result2_binding[0];
		JavaOpaqueMethod method = (JavaOpaqueMethod) result2_binding[1];
		for (Object[] result2_black : IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_9_2_corematch_blackBBB(jcu,
				method, match)) {
			// ForEach 
			for (Object[] result3_black : IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_9_3_findcontext_blackBB(jcu,
					method)) {
				Object[] result3_green = IgnoreOpaqueMethodImpl
						.pattern_IgnoreOpaqueMethod_9_3_findcontext_greenBBFF(jcu, method);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge jcu__method____methods = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = IgnoreOpaqueMethodImpl
						.pattern_IgnoreOpaqueMethod_9_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch, jcu,
								method);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jcu] = " + jcu + ", "
							+ "[method] = " + method + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_9_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = IgnoreOpaqueMethodImpl
							.pattern_IgnoreOpaqueMethod_9_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_9_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		match.registerObject("jcu", jcu);
		match.registerObject("method", method);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaCompilationUnit jcu,
			JavaOpaqueMethod method) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jcu", jcu);
		isApplicableMatch.registerObject("method", method);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject jcu, EObject method) {
		ruleresult.registerObject("jcu", jcu);
		ruleresult.registerObject("method", method);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("method").eClass())
				.equals("SimpleJava.JavaOpaqueMethod.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_9(EMoflonEdge _edge_methods) {

		Object[] result1_bindingAndBlack = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_17_2_testcorematchandDECs_blackFFB(_edge_methods)) {
			JavaCompilationUnit jcu = (JavaCompilationUnit) result2_black[0];
			JavaOpaqueMethod method = (JavaOpaqueMethod) result2_black[1];
			Object[] result2_green = IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, jcu, method)) {
				// 
				if (IgnoreOpaqueMethodImpl
						.pattern_IgnoreOpaqueMethod_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = IgnoreOpaqueMethodImpl
							.pattern_IgnoreOpaqueMethod_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("IgnoreOpaqueMethod");
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
		ruleResult.setRule("IgnoreOpaqueMethod");
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

		Object[] result1_black = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_20_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_20_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_bindingAndBlackFFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		JavaCompilationUnit jcu = (JavaCompilationUnit) result2_bindingAndBlack[0];
		JavaOpaqueMethod method = (JavaOpaqueMethod) result2_bindingAndBlack[1];

		Object[] result3_bindingAndBlack = IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_20_3_solvecsp_bindingAndBlackFBBBBB(this, jcu, method, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[jcu] = " + jcu + ", " + "[method] = " + method + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_20_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_20_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = IgnoreOpaqueMethodImpl
						.pattern_IgnoreOpaqueMethod_20_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = IgnoreOpaqueMethodImpl
						.pattern_IgnoreOpaqueMethod_20_6_createcorrespondence_blackBBB(jcu, method, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jcu] = " + jcu + ", "
							+ "[method] = " + method + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = IgnoreOpaqueMethodImpl
						.pattern_IgnoreOpaqueMethod_20_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_20_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_20_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(JavaCompilationUnit jcu, JavaOpaqueMethod method, Match sourceMatch,
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
		return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_23_2_expressionF();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(JavaCompilationUnit jcu, JavaOpaqueMethod method) {// 
		Object[] result1_black = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_24_1_matchtggpattern_blackBB(jcu,
				method);
		if (result1_black != null) {
			return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_24_2_expressionF();
		} else {
			return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			JavaCompilationUnit jcuParameter) {

		Object[] result1_black = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_25_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_25_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : IgnoreOpaqueMethodImpl
				.pattern_IgnoreOpaqueMethod_25_2_isapplicablecore_blackFFBB(ruleEntryContainer, ruleResult)) {
			//nothing RuleEntryList jcuList = (RuleEntryList) result2_black[0];
			JavaCompilationUnit jcu = (JavaCompilationUnit) result2_black[1];

			Object[] result3_bindingAndBlack = IgnoreOpaqueMethodImpl
					.pattern_IgnoreOpaqueMethod_25_3_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch, jcu,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jcu] = " + jcu + ", "
						+ "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_25_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_25_5_checknacs_blackB(jcu);
				if (result5_black != null) {

					Object[] result6_black = IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_25_6_perform_blackBB(jcu,
							ruleResult);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jcu] = " + jcu + ", "
								+ "[ruleResult] = " + ruleResult + ".");
					}
					IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_25_6_perform_greenBFB(jcu, ruleResult);
					//nothing JavaOpaqueMethod method = (JavaOpaqueMethod) result6_green[1];

				} else {
				}

			} else {
			}

		}
		return IgnoreOpaqueMethodImpl.pattern_IgnoreOpaqueMethod_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaCompilationUnit jcu,
			ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("jcu", jcu);
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
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_FWD__MATCH:
			return isAppropriate_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH:
			registerObjectsToMatch_FWD((Match) arguments.get(0));
			return null;
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaOpaqueMethod) arguments.get(2));
		case RulesPackage.IGNORE_OPAQUE_METHOD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaOpaqueMethod) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaOpaqueMethod) arguments.get(2));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaCompilationUnit) arguments.get(1), (JavaOpaqueMethod) arguments.get(2));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2));
			return null;
		case RulesPackage.IGNORE_OPAQUE_METHOD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPROPRIATE_BWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPLICABLE_SOLVE_CSP_CC__JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD_MATCH_MATCH:
			return isApplicable_solveCsp_CC((JavaCompilationUnit) arguments.get(0), (JavaOpaqueMethod) arguments.get(1),
					(Match) arguments.get(2), (Match) arguments.get(3));
		case RulesPackage.IGNORE_OPAQUE_METHOD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.IGNORE_OPAQUE_METHOD___CHECK_DEC_FWD:
			return checkDEC_FWD();
		case RulesPackage.IGNORE_OPAQUE_METHOD___CHECK_DEC_BWD__JAVACOMPILATIONUNIT_JAVAOPAQUEMETHOD:
			return checkDEC_BWD((JavaCompilationUnit) arguments.get(0), (JavaOpaqueMethod) arguments.get(1));
		case RulesPackage.IGNORE_OPAQUE_METHOD___GENERATE_MODEL__RULEENTRYCONTAINER_JAVACOMPILATIONUNIT:
			return generateModel((RuleEntryContainer) arguments.get(0), (JavaCompilationUnit) arguments.get(1));
		case RulesPackage.IGNORE_OPAQUE_METHOD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVACOMPILATIONUNIT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(JavaCompilationUnit) arguments.get(1), (ModelgeneratorRuleResult) arguments.get(2));
		case RulesPackage.IGNORE_OPAQUE_METHOD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_0_1_initialbindings_blackBB(IgnoreOpaqueMethod _this,
			Match match) {
		return new Object[] { _this, match };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_0_2_SolveCSP_bindingFBB(IgnoreOpaqueMethod _this,
			Match match) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_0_2_SolveCSP_bindingAndBlackFBB(IgnoreOpaqueMethod _this,
			Match match) {
		Object[] result_pattern_IgnoreOpaqueMethod_0_2_SolveCSP_binding = pattern_IgnoreOpaqueMethod_0_2_SolveCSP_bindingFBB(
				_this, match);
		if (result_pattern_IgnoreOpaqueMethod_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOpaqueMethod_0_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreOpaqueMethod_0_2_SolveCSP_black = pattern_IgnoreOpaqueMethod_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOpaqueMethod_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_0_3_CheckCSP_expressionFBB(IgnoreOpaqueMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_0_4_collectelementstobetranslated_blackB(Match match) {
		return new Object[] { match };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_0_5_collectcontextelements_blackB(Match match) {
		return new Object[] { match };
	}

	public static final void pattern_IgnoreOpaqueMethod_0_6_registerobjectstomatch_expressionBB(
			IgnoreOpaqueMethod _this, Match match) {
		_this.registerObjectsToMatch_FWD(match);

	}

	public static final boolean pattern_IgnoreOpaqueMethod_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_1_initialbindings_blackBBBB(IgnoreOpaqueMethod _this,
			Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		return new Object[] { _this, match, jcu, method };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_2_SolveCSP_bindingFBBBB(IgnoreOpaqueMethod _this,
			Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, jcu, method);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jcu, method };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_2_SolveCSP_bindingAndBlackFBBBB(IgnoreOpaqueMethod _this,
			Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		Object[] result_pattern_IgnoreOpaqueMethod_7_2_SolveCSP_binding = pattern_IgnoreOpaqueMethod_7_2_SolveCSP_bindingFBBBB(
				_this, match, jcu, method);
		if (result_pattern_IgnoreOpaqueMethod_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOpaqueMethod_7_2_SolveCSP_binding[0];

			Object[] result_pattern_IgnoreOpaqueMethod_7_2_SolveCSP_black = pattern_IgnoreOpaqueMethod_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOpaqueMethod_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jcu, method };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_7_3_CheckCSP_expressionFBB(IgnoreOpaqueMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_4_collectelementstobetranslated_blackBBB(Match match,
			JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		return new Object[] { match, jcu, method };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_4_collectelementstobetranslated_greenBBBF(Match match,
			JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		EMoflonEdge jcu__method____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(method);
		String jcu__method____methods_name_prime = "methods";
		jcu__method____methods.setSrc(jcu);
		jcu__method____methods.setTrg(method);
		match.getToBeTranslatedEdges().add(jcu__method____methods);
		jcu__method____methods.setName(jcu__method____methods_name_prime);
		return new Object[] { match, jcu, method, jcu__method____methods };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_5_collectcontextelements_blackBBB(Match match,
			JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		return new Object[] { match, jcu, method };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_7_5_collectcontextelements_greenBB(Match match,
			JavaCompilationUnit jcu) {
		match.getContextNodes().add(jcu);
		return new Object[] { match, jcu };
	}

	public static final void pattern_IgnoreOpaqueMethod_7_6_registerobjectstomatch_expressionBBBB(
			IgnoreOpaqueMethod _this, Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		_this.registerObjectsToMatch_BWD(match, jcu, method);

	}

	public static final boolean pattern_IgnoreOpaqueMethod_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_8_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jcu");
		EObject _localVariable_1 = isApplicableMatch.getObject("method");
		EObject tmpJcu = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		if (tmpJcu instanceof JavaCompilationUnit) {
			JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
			if (tmpMethod instanceof JavaOpaqueMethod) {
				JavaOpaqueMethod method = (JavaOpaqueMethod) tmpMethod;
				return new Object[] { jcu, method, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_8_1_performtransformation_blackBBFBB(
			JavaCompilationUnit jcu, JavaOpaqueMethod method, IgnoreOpaqueMethod _this,
			IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jcu, method, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_8_1_performtransformation_bindingAndBlackFFFBB(
			IgnoreOpaqueMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_IgnoreOpaqueMethod_8_1_performtransformation_binding = pattern_IgnoreOpaqueMethod_8_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_IgnoreOpaqueMethod_8_1_performtransformation_binding != null) {
			JavaCompilationUnit jcu = (JavaCompilationUnit) result_pattern_IgnoreOpaqueMethod_8_1_performtransformation_binding[0];
			JavaOpaqueMethod method = (JavaOpaqueMethod) result_pattern_IgnoreOpaqueMethod_8_1_performtransformation_binding[1];

			Object[] result_pattern_IgnoreOpaqueMethod_8_1_performtransformation_black = pattern_IgnoreOpaqueMethod_8_1_performtransformation_blackBBFBB(
					jcu, method, _this, isApplicableMatch);
			if (result_pattern_IgnoreOpaqueMethod_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_IgnoreOpaqueMethod_8_1_performtransformation_black[2];

				return new Object[] { jcu, method, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_8_2_collecttranslatedelements_blackB(
			JavaOpaqueMethod method) {
		return new Object[] { method };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_8_2_collecttranslatedelements_greenFB(
			JavaOpaqueMethod method) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(method);
		return new Object[] { ruleresult, method };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_8_3_bookkeepingforedges_blackBBB(
			PerformRuleResult ruleresult, EObject jcu, EObject method) {
		if (!jcu.equals(method)) {
			return new Object[] { ruleresult, jcu, method };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_8_3_bookkeepingforedges_greenBBBF(
			PerformRuleResult ruleresult, EObject jcu, EObject method) {
		EMoflonEdge jcu__method____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "IgnoreOpaqueMethod";
		String jcu__method____methods_name_prime = "methods";
		jcu__method____methods.setSrc(jcu);
		jcu__method____methods.setTrg(method);
		ruleresult.getTranslatedEdges().add(jcu__method____methods);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		jcu__method____methods.setName(jcu__method____methods_name_prime);
		return new Object[] { ruleresult, jcu, method, jcu__method____methods };
	}

	public static final void pattern_IgnoreOpaqueMethod_8_5_registerobjects_expressionBBBB(IgnoreOpaqueMethod _this,
			PerformRuleResult ruleresult, EObject jcu, EObject method) {
		_this.registerObjects_BWD(ruleresult, jcu, method);

	}

	public static final PerformRuleResult pattern_IgnoreOpaqueMethod_8_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_bindingFB(IgnoreOpaqueMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_blackFBB(EClass eClass,
			IgnoreOpaqueMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_bindingAndBlackFFB(
			IgnoreOpaqueMethod _this) {
		Object[] result_pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_binding = pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_black = pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "IgnoreOpaqueMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jcu");
		EObject _localVariable_1 = match.getObject("method");
		EObject tmpJcu = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		if (tmpJcu instanceof JavaCompilationUnit) {
			JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
			if (tmpMethod instanceof JavaOpaqueMethod) {
				JavaOpaqueMethod method = (JavaOpaqueMethod) tmpMethod;
				return new Object[] { jcu, method, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreOpaqueMethod_9_2_corematch_blackBBB(JavaCompilationUnit jcu,
			JavaOpaqueMethod method, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		_result.add(new Object[] { jcu, method, match });
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreOpaqueMethod_9_3_findcontext_blackBB(JavaCompilationUnit jcu,
			JavaOpaqueMethod method) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (jcu.getMethods().contains(method)) {
			_result.add(new Object[] { jcu, method });
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_3_findcontext_greenBBFF(JavaCompilationUnit jcu,
			JavaOpaqueMethod method) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge jcu__method____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String jcu__method____methods_name_prime = "methods";
		isApplicableMatch.getAllContextElements().add(jcu);
		isApplicableMatch.getAllContextElements().add(method);
		jcu__method____methods.setSrc(jcu);
		jcu__method____methods.setTrg(method);
		isApplicableMatch.getAllContextElements().add(jcu__method____methods);
		jcu__method____methods.setName(jcu__method____methods_name_prime);
		return new Object[] { jcu, method, isApplicableMatch, jcu__method____methods };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_4_solveCSP_bindingFBBBB(IgnoreOpaqueMethod _this,
			IsApplicableMatch isApplicableMatch, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, jcu, method);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jcu, method };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_4_solveCSP_bindingAndBlackFBBBB(IgnoreOpaqueMethod _this,
			IsApplicableMatch isApplicableMatch, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		Object[] result_pattern_IgnoreOpaqueMethod_9_4_solveCSP_binding = pattern_IgnoreOpaqueMethod_9_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, jcu, method);
		if (result_pattern_IgnoreOpaqueMethod_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOpaqueMethod_9_4_solveCSP_binding[0];

			Object[] result_pattern_IgnoreOpaqueMethod_9_4_solveCSP_black = pattern_IgnoreOpaqueMethod_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOpaqueMethod_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jcu, method };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_9_5_checkCSP_expressionFBB(IgnoreOpaqueMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "IgnoreOpaqueMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreOpaqueMethod_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_bindingFB(
			IgnoreOpaqueMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			IgnoreOpaqueMethod _this) {
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

	public static final Object[] pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_bindingAndBlackFFBF(
			IgnoreOpaqueMethod _this) {
		Object[] result_pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_binding = pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_black = pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_IgnoreOpaqueMethod_17_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_methods) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJcu = _edge_methods.getSrc();
		if (tmpJcu instanceof JavaCompilationUnit) {
			JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
			EObject tmpMethod = _edge_methods.getTrg();
			if (tmpMethod instanceof JavaOpaqueMethod) {
				JavaOpaqueMethod method = (JavaOpaqueMethod) tmpMethod;
				if (jcu.getMethods().contains(method)) {
					_result.add(new Object[] { jcu, method, _edge_methods });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_IgnoreOpaqueMethod_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			IgnoreOpaqueMethod _this, Match match, JavaCompilationUnit jcu, JavaOpaqueMethod method) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, jcu, method);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			IgnoreOpaqueMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_IgnoreOpaqueMethod_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_1_prepare_blackB(IgnoreOpaqueMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_bindingFFB(Match targetMatch) {
		EObject _localVariable_0 = targetMatch.getObject("jcu");
		EObject _localVariable_1 = targetMatch.getObject("method");
		EObject tmpJcu = _localVariable_0;
		EObject tmpMethod = _localVariable_1;
		if (tmpJcu instanceof JavaCompilationUnit) {
			JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
			if (tmpMethod instanceof JavaOpaqueMethod) {
				JavaOpaqueMethod method = (JavaOpaqueMethod) tmpMethod;
				return new Object[] { jcu, method, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_blackBBBB(JavaCompilationUnit jcu,
			JavaOpaqueMethod method, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { jcu, method, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_bindingAndBlackFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_binding = pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_bindingFFB(
				targetMatch);
		if (result_pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_binding != null) {
			JavaCompilationUnit jcu = (JavaCompilationUnit) result_pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_binding[0];
			JavaOpaqueMethod method = (JavaOpaqueMethod) result_pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_binding[1];

			Object[] result_pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_black = pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_blackBBBB(
					jcu, method, sourceMatch, targetMatch);
			if (result_pattern_IgnoreOpaqueMethod_20_2_matchsrctrgcontext_black != null) {

				return new Object[] { jcu, method, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_3_solvecsp_bindingFBBBBB(IgnoreOpaqueMethod _this,
			JavaCompilationUnit jcu, JavaOpaqueMethod method, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_2 = _this.isApplicable_solveCsp_CC(jcu, method, sourceMatch, targetMatch);
		CSP csp = _localVariable_2;
		if (csp != null) {
			return new Object[] { csp, _this, jcu, method, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_3_solvecsp_bindingAndBlackFBBBBB(
			IgnoreOpaqueMethod _this, JavaCompilationUnit jcu, JavaOpaqueMethod method, Match sourceMatch,
			Match targetMatch) {
		Object[] result_pattern_IgnoreOpaqueMethod_20_3_solvecsp_binding = pattern_IgnoreOpaqueMethod_20_3_solvecsp_bindingFBBBBB(
				_this, jcu, method, sourceMatch, targetMatch);
		if (result_pattern_IgnoreOpaqueMethod_20_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOpaqueMethod_20_3_solvecsp_binding[0];

			Object[] result_pattern_IgnoreOpaqueMethod_20_3_solvecsp_black = pattern_IgnoreOpaqueMethod_20_3_solvecsp_blackB(
					csp);
			if (result_pattern_IgnoreOpaqueMethod_20_3_solvecsp_black != null) {

				return new Object[] { csp, _this, jcu, method, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_20_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_IgnoreOpaqueMethod_20_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "IgnoreOpaqueMethod";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_6_createcorrespondence_blackBBB(JavaCompilationUnit jcu,
			JavaOpaqueMethod method, CCMatch ccMatch) {
		return new Object[] { jcu, method, ccMatch };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_20_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "IgnoreOpaqueMethod";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_IgnoreOpaqueMethod_20_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_23_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_23_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_24_1_matchtggpattern_blackBB(JavaCompilationUnit jcu,
			JavaOpaqueMethod method) {
		if (jcu.getMethods().contains(method)) {
			return new Object[] { jcu, method };
		}
		return null;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_1_createresult_blackB(IgnoreOpaqueMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, JavaCompilationUnit jcu) {
		if (ruleResult.getTargetObjects().contains(jcu)) {
			return new Object[] { ruleResult, jcu };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_IgnoreOpaqueMethod_25_2_isapplicablecore_blackFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList jcuList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpJcu : jcuList.getEntryObjects()) {
				if (tmpJcu instanceof JavaCompilationUnit) {
					JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
					if (pattern_IgnoreOpaqueMethod_25_2_isapplicablecore_black_nac_0BB(ruleResult, jcu) == null) {
						_result.add(new Object[] { jcuList, jcu, ruleEntryContainer, ruleResult });
					}
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_3_solveCSP_bindingFBBBB(IgnoreOpaqueMethod _this,
			IsApplicableMatch isApplicableMatch, JavaCompilationUnit jcu, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, jcu, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jcu, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_3_solveCSP_bindingAndBlackFBBBB(IgnoreOpaqueMethod _this,
			IsApplicableMatch isApplicableMatch, JavaCompilationUnit jcu, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_IgnoreOpaqueMethod_25_3_solveCSP_binding = pattern_IgnoreOpaqueMethod_25_3_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, jcu, ruleResult);
		if (result_pattern_IgnoreOpaqueMethod_25_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_IgnoreOpaqueMethod_25_3_solveCSP_binding[0];

			Object[] result_pattern_IgnoreOpaqueMethod_25_3_solveCSP_black = pattern_IgnoreOpaqueMethod_25_3_solveCSP_blackB(
					csp);
			if (result_pattern_IgnoreOpaqueMethod_25_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jcu, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_IgnoreOpaqueMethod_25_4_checkCSP_expressionFBB(IgnoreOpaqueMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_5_checknacs_blackB(JavaCompilationUnit jcu) {
		return new Object[] { jcu };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_6_perform_blackBB(JavaCompilationUnit jcu,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { jcu, ruleResult };
	}

	public static final Object[] pattern_IgnoreOpaqueMethod_25_6_perform_greenBFB(JavaCompilationUnit jcu,
			ModelgeneratorRuleResult ruleResult) {
		JavaOpaqueMethod method = SimpleJavaFactory.eINSTANCE.createJavaOpaqueMethod();
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_0 = ruleResult.getIncrementedPerformCount();
		jcu.getMethods().add(method);
		ruleResult.getTargetObjects().add(method);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_0);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { jcu, method, ruleResult };
	}

	public static final ModelgeneratorRuleResult pattern_IgnoreOpaqueMethod_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //IgnoreOpaqueMethodImpl
