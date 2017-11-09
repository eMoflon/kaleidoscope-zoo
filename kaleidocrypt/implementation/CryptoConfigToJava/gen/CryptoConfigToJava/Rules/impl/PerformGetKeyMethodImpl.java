/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoConfigToJava.Rules.PerformGetKeyMethod;
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

import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.CCMatch;
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
 * An implementation of the model object '<em><b>Perform Get Key Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PerformGetKeyMethodImpl extends AbstractRuleImpl implements PerformGetKeyMethod {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformGetKeyMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getPerformGetKeyMethod();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match) {

		Object[] result1_black = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_0_1_initialbindings_blackBB(this,
				match);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}

		Object[] result2_bindingAndBlack = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_0_2_SolveCSP_bindingAndBlackFBB(this, match);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_0_4_collectelementstobetranslated_blackB(match);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}

			Object[] result5_black = PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_0_5_collectcontextelements_blackB(match);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ".");
			}
			// 
			PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_0_6_registerobjectstomatch_expressionBB(this, match);
			return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_0_7_expressionF();
		} else {
			return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_0_8_expressionF();
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
	public boolean isAppropriate_BWD(Match match, JavaOpaqueMethod methodPerformGetKey) {

		Object[] result1_black = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_7_1_initialbindings_blackBBB(this,
				match, methodPerformGetKey);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[methodPerformGetKey] = " + methodPerformGetKey + ".");
		}

		Object[] result2_bindingAndBlack = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_7_2_SolveCSP_bindingAndBlackFBBB(this, match, methodPerformGetKey);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[methodPerformGetKey] = " + methodPerformGetKey + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_7_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_7_4_collectelementstobetranslated_blackBB(match, methodPerformGetKey);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[methodPerformGetKey] = " + methodPerformGetKey + ".");
			}
			PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_7_4_collectelementstobetranslated_greenBB(match,
					methodPerformGetKey);

			Object[] result5_black = PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_7_5_collectcontextelements_blackBB(match, methodPerformGetKey);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[methodPerformGetKey] = " + methodPerformGetKey + ".");
			}
			// 
			PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_7_6_registerobjectstomatch_expressionBBB(this, match,
					methodPerformGetKey);
			return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_7_7_expressionF();
		} else {
			return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_7_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_8_1_performtransformation_bindingAndBlackFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result1_bindingAndBlack[0];
		//nothing CSP csp = (CSP) result1_bindingAndBlack[1];

		Object[] result2_black = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_8_2_collecttranslatedelements_blackB(methodPerformGetKey);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[methodPerformGetKey] = "
					+ methodPerformGetKey + ".");
		}
		Object[] result2_green = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_8_2_collecttranslatedelements_greenFB(methodPerformGetKey);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_8_3_bookkeepingforedges_blackBB(ruleresult, methodPerformGetKey);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[methodPerformGetKey] = " + methodPerformGetKey + ".");
		}
		PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_8_3_bookkeepingforedges_greenB(ruleresult);

		// 
		// 
		PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_8_5_registerobjects_expressionBBB(this, ruleresult,
				methodPerformGetKey);
		return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_8_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_9_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_9_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_9_2_corematch_bindingFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result2_binding[0];
		for (Object[] result2_black : PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_9_2_corematch_blackBB(methodPerformGetKey, match)) {
			// ForEach 
			for (Object[] result3_black : PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_9_3_findcontext_blackB(methodPerformGetKey)) {
				Object[] result3_green = PerformGetKeyMethodImpl
						.pattern_PerformGetKeyMethod_9_3_findcontext_greenBF(methodPerformGetKey);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[1];

				Object[] result4_bindingAndBlack = PerformGetKeyMethodImpl
						.pattern_PerformGetKeyMethod_9_4_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
								methodPerformGetKey);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[methodPerformGetKey] = "
							+ methodPerformGetKey + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_9_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = PerformGetKeyMethodImpl
							.pattern_PerformGetKeyMethod_9_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_9_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_9_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, JavaOpaqueMethod methodPerformGetKey) {
		match.registerObject("methodPerformGetKey", methodPerformGetKey);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, JavaOpaqueMethod methodPerformGetKey) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("char [] pwd,String algName,int iterations,int outputSize");
		literal0.setType("");

		// Create attribute variables
		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.parameters", true, csp);
		var_methodPerformGetKey_parameters.setValue(methodPerformGetKey.getParameters());
		var_methodPerformGetKey_parameters.setType("String");

		// Create unbound variables

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();

		csp.getConstraints().add(setDefaultStringIfNull);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_methodPerformGetKey_parameters, literal0);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaOpaqueMethod methodPerformGetKey) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables

		// Create constraints

		// Solve CSP

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("methodPerformGetKey", methodPerformGetKey);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject methodPerformGetKey) {
		ruleresult.registerObject("methodPerformGetKey", methodPerformGetKey);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("methodPerformGetKey").eClass())
				.equals("SimpleJava.JavaOpaqueMethod.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_JavaOpaqueMethod_0(JavaOpaqueMethod methodPerformGetKey) {

		Object[] result1_bindingAndBlack = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_17_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_17_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_17_2_testcorematchandDECs_blackB(methodPerformGetKey)) {
			Object[] result2_green = PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_17_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(this,
							match, methodPerformGetKey)) {
				// 
				if (PerformGetKeyMethodImpl
						.pattern_PerformGetKeyMethod_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = PerformGetKeyMethodImpl
							.pattern_PerformGetKeyMethod_17_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_17_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_17_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("PerformGetKeyMethod");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("methodPerformGetKey", "name", "performGetKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "modifier", "private", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "type", "SecretKey ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("char [] pwd,String algName,int iterations,int outputSize");
		var_literal0.setType("");

		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey",
				true, csp);
		var_methodPerformGetKey_parameters.setValue(__helper.getValue("methodPerformGetKey", "parameters"));
		var_methodPerformGetKey_parameters.setType("String");

		SetDefaultStringIfNull setDefaultStringIfNull0 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull0);

		setDefaultStringIfNull0.setRuleName("PerformGetKeyMethod");
		setDefaultStringIfNull0.solve(var_methodPerformGetKey_parameters, var_literal0);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_methodPerformGetKey_parameters.setBound(false);
			setDefaultStringIfNull0.solve(var_methodPerformGetKey_parameters, var_literal0);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("methodPerformGetKey", "parameters", var_methodPerformGetKey_parameters.getValue());
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
		ruleResult.setRule("PerformGetKeyMethod");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("methodPerformGetKey", "name", "performGetKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "modifier", "private", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "type", "SecretKey ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("char [] pwd,String algName,int iterations,int outputSize");
		var_literal0.setType("");

		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey",
				true, csp);
		var_methodPerformGetKey_parameters.setValue(__helper.getValue("methodPerformGetKey", "parameters"));
		var_methodPerformGetKey_parameters.setType("String");

		SetDefaultStringIfNull setDefaultStringIfNull0 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull0);

		setDefaultStringIfNull0.setRuleName("PerformGetKeyMethod");
		setDefaultStringIfNull0.solve(var_methodPerformGetKey_parameters, var_literal0);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			setDefaultStringIfNull0.solve(var_methodPerformGetKey_parameters, var_literal0);
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

		Object[] result1_black = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_20_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_20_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_bindingAndBlackFBB(sourceMatch, targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result2_bindingAndBlack[0];

		Object[] result3_bindingAndBlack = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_20_3_solvecsp_bindingAndBlackFBBBB(this, methodPerformGetKey, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_20_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_20_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = PerformGetKeyMethodImpl
						.pattern_PerformGetKeyMethod_20_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = PerformGetKeyMethodImpl
						.pattern_PerformGetKeyMethod_20_6_createcorrespondence_blackBB(methodPerformGetKey, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[methodPerformGetKey] = "
							+ methodPerformGetKey + ", " + "[ccMatch] = " + ccMatch + ".");
				}

				Object[] result7_black = PerformGetKeyMethodImpl
						.pattern_PerformGetKeyMethod_20_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_20_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_20_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(JavaOpaqueMethod methodPerformGetKey, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("char [] pwd,String algName,int iterations,int outputSize");
		literal0.setType("");

		// Create attribute variables
		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.parameters", true, csp);
		var_methodPerformGetKey_parameters.setValue(methodPerformGetKey.getParameters());
		var_methodPerformGetKey_parameters.setType("String");

		// Create unbound variables

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();

		csp.getConstraints().add(setDefaultStringIfNull);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_methodPerformGetKey_parameters, literal0);
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
		return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_23_2_expressionF();

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(JavaOpaqueMethod methodPerformGetKey) {// 
		Object[] result1_black = PerformGetKeyMethodImpl
				.pattern_PerformGetKeyMethod_24_1_matchtggpattern_blackB(methodPerformGetKey);
		if (result1_black != null) {
			PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_24_1_matchtggpattern_greenB(methodPerformGetKey);

			return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_24_2_expressionF();
		} else {
			return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_24_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_25_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_25_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_25_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = PerformGetKeyMethodImpl
					.pattern_PerformGetKeyMethod_25_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_25_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = PerformGetKeyMethodImpl
						.pattern_PerformGetKeyMethod_25_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_25_6_perform_greenFBB(ruleResult, csp);
				//nothing JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result6_green[0];

			} else {
			}

		} else {
		}
		return PerformGetKeyMethodImpl.pattern_PerformGetKeyMethod_25_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("char [] pwd,String algName,int iterations,int outputSize");
		literal0.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.parameters", csp);
		var_methodPerformGetKey_parameters.setType("String");

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();

		csp.getConstraints().add(setDefaultStringIfNull);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_methodPerformGetKey_parameters, literal0);

		// Snapshot pattern match on which CSP is solved
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
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_FWD__MATCH:
			return isAppropriate_FWD((Match) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH:
			registerObjectsToMatch_FWD((Match) arguments.get(0));
			return null;
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_BWD__MATCH_JAVAOPAQUEMETHOD:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaOpaqueMethod) arguments.get(1));
		case RulesPackage.PERFORM_GET_KEY_METHOD___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAOPAQUEMETHOD:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaOpaqueMethod) arguments.get(1));
			return null;
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAOPAQUEMETHOD:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaOpaqueMethod) arguments.get(1));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAOPAQUEMETHOD:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (JavaOpaqueMethod) arguments.get(1));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1));
			return null;
		case RulesPackage.PERFORM_GET_KEY_METHOD___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPROPRIATE_BWD_JAVA_OPAQUE_METHOD_0__JAVAOPAQUEMETHOD:
			return isAppropriate_BWD_JavaOpaqueMethod_0((JavaOpaqueMethod) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPLICABLE_SOLVE_CSP_CC__JAVAOPAQUEMETHOD_MATCH_MATCH:
			return isApplicable_solveCsp_CC((JavaOpaqueMethod) arguments.get(0), (Match) arguments.get(1),
					(Match) arguments.get(2));
		case RulesPackage.PERFORM_GET_KEY_METHOD___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___CHECK_DEC_FWD:
			return checkDEC_FWD();
		case RulesPackage.PERFORM_GET_KEY_METHOD___CHECK_DEC_BWD__JAVAOPAQUEMETHOD:
			return checkDEC_BWD((JavaOpaqueMethod) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.PERFORM_GET_KEY_METHOD___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.PERFORM_GET_KEY_METHOD___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_PerformGetKeyMethod_0_1_initialbindings_blackBB(PerformGetKeyMethod _this,
			Match match) {
		return new Object[] { _this, match };
	}

	public static final Object[] pattern_PerformGetKeyMethod_0_2_SolveCSP_bindingFBB(PerformGetKeyMethod _this,
			Match match) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PerformGetKeyMethod_0_2_SolveCSP_bindingAndBlackFBB(PerformGetKeyMethod _this,
			Match match) {
		Object[] result_pattern_PerformGetKeyMethod_0_2_SolveCSP_binding = pattern_PerformGetKeyMethod_0_2_SolveCSP_bindingFBB(
				_this, match);
		if (result_pattern_PerformGetKeyMethod_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PerformGetKeyMethod_0_2_SolveCSP_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_0_2_SolveCSP_black = pattern_PerformGetKeyMethod_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PerformGetKeyMethod_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match };
			}
		}
		return null;
	}

	public static final boolean pattern_PerformGetKeyMethod_0_3_CheckCSP_expressionFBB(PerformGetKeyMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_0_4_collectelementstobetranslated_blackB(Match match) {
		return new Object[] { match };
	}

	public static final Object[] pattern_PerformGetKeyMethod_0_5_collectcontextelements_blackB(Match match) {
		return new Object[] { match };
	}

	public static final void pattern_PerformGetKeyMethod_0_6_registerobjectstomatch_expressionBB(
			PerformGetKeyMethod _this, Match match) {
		_this.registerObjectsToMatch_FWD(match);

	}

	public static final boolean pattern_PerformGetKeyMethod_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PerformGetKeyMethod_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_7_1_initialbindings_blackBBB(PerformGetKeyMethod _this,
			Match match, JavaOpaqueMethod methodPerformGetKey) {
		return new Object[] { _this, match, methodPerformGetKey };
	}

	public static final Object[] pattern_PerformGetKeyMethod_7_2_SolveCSP_bindingFBBB(PerformGetKeyMethod _this,
			Match match, JavaOpaqueMethod methodPerformGetKey) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, methodPerformGetKey);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, methodPerformGetKey };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_7_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PerformGetKeyMethod_7_2_SolveCSP_bindingAndBlackFBBB(PerformGetKeyMethod _this,
			Match match, JavaOpaqueMethod methodPerformGetKey) {
		Object[] result_pattern_PerformGetKeyMethod_7_2_SolveCSP_binding = pattern_PerformGetKeyMethod_7_2_SolveCSP_bindingFBBB(
				_this, match, methodPerformGetKey);
		if (result_pattern_PerformGetKeyMethod_7_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PerformGetKeyMethod_7_2_SolveCSP_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_7_2_SolveCSP_black = pattern_PerformGetKeyMethod_7_2_SolveCSP_blackB(
					csp);
			if (result_pattern_PerformGetKeyMethod_7_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, methodPerformGetKey };
			}
		}
		return null;
	}

	public static final boolean pattern_PerformGetKeyMethod_7_3_CheckCSP_expressionFBB(PerformGetKeyMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_7_4_collectelementstobetranslated_blackBB(Match match,
			JavaOpaqueMethod methodPerformGetKey) {
		return new Object[] { match, methodPerformGetKey };
	}

	public static final Object[] pattern_PerformGetKeyMethod_7_4_collectelementstobetranslated_greenBB(Match match,
			JavaOpaqueMethod methodPerformGetKey) {
		match.getToBeTranslatedNodes().add(methodPerformGetKey);
		return new Object[] { match, methodPerformGetKey };
	}

	public static final Object[] pattern_PerformGetKeyMethod_7_5_collectcontextelements_blackBB(Match match,
			JavaOpaqueMethod methodPerformGetKey) {
		return new Object[] { match, methodPerformGetKey };
	}

	public static final void pattern_PerformGetKeyMethod_7_6_registerobjectstomatch_expressionBBB(
			PerformGetKeyMethod _this, Match match, JavaOpaqueMethod methodPerformGetKey) {
		_this.registerObjectsToMatch_BWD(match, methodPerformGetKey);

	}

	public static final boolean pattern_PerformGetKeyMethod_7_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PerformGetKeyMethod_7_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_8_1_performtransformation_bindingFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("methodPerformGetKey");
		EObject tmpMethodPerformGetKey = _localVariable_0;
		if (tmpMethodPerformGetKey instanceof JavaOpaqueMethod) {
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) tmpMethodPerformGetKey;
			return new Object[] { methodPerformGetKey, isApplicableMatch };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_8_1_performtransformation_blackBFBB(
			JavaOpaqueMethod methodPerformGetKey, PerformGetKeyMethod _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { methodPerformGetKey, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_8_1_performtransformation_bindingAndBlackFFBB(
			PerformGetKeyMethod _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_PerformGetKeyMethod_8_1_performtransformation_binding = pattern_PerformGetKeyMethod_8_1_performtransformation_bindingFB(
				isApplicableMatch);
		if (result_pattern_PerformGetKeyMethod_8_1_performtransformation_binding != null) {
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result_pattern_PerformGetKeyMethod_8_1_performtransformation_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_8_1_performtransformation_black = pattern_PerformGetKeyMethod_8_1_performtransformation_blackBFBB(
					methodPerformGetKey, _this, isApplicableMatch);
			if (result_pattern_PerformGetKeyMethod_8_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_PerformGetKeyMethod_8_1_performtransformation_black[1];

				return new Object[] { methodPerformGetKey, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_8_2_collecttranslatedelements_blackB(
			JavaOpaqueMethod methodPerformGetKey) {
		return new Object[] { methodPerformGetKey };
	}

	public static final Object[] pattern_PerformGetKeyMethod_8_2_collecttranslatedelements_greenFB(
			JavaOpaqueMethod methodPerformGetKey) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(methodPerformGetKey);
		return new Object[] { ruleresult, methodPerformGetKey };
	}

	public static final Object[] pattern_PerformGetKeyMethod_8_3_bookkeepingforedges_blackBB(
			PerformRuleResult ruleresult, EObject methodPerformGetKey) {
		return new Object[] { ruleresult, methodPerformGetKey };
	}

	public static final Object[] pattern_PerformGetKeyMethod_8_3_bookkeepingforedges_greenB(
			PerformRuleResult ruleresult) {
		String ruleresult_ruleName_prime = "PerformGetKeyMethod";
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		return new Object[] { ruleresult };
	}

	public static final void pattern_PerformGetKeyMethod_8_5_registerobjects_expressionBBB(PerformGetKeyMethod _this,
			PerformRuleResult ruleresult, EObject methodPerformGetKey) {
		_this.registerObjects_BWD(ruleresult, methodPerformGetKey);

	}

	public static final PerformRuleResult pattern_PerformGetKeyMethod_8_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_1_preparereturnvalue_bindingFB(
			PerformGetKeyMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_1_preparereturnvalue_blackFBB(EClass eClass,
			PerformGetKeyMethod _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_1_preparereturnvalue_bindingAndBlackFFB(
			PerformGetKeyMethod _this) {
		Object[] result_pattern_PerformGetKeyMethod_9_1_preparereturnvalue_binding = pattern_PerformGetKeyMethod_9_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PerformGetKeyMethod_9_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_PerformGetKeyMethod_9_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_9_1_preparereturnvalue_black = pattern_PerformGetKeyMethod_9_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_PerformGetKeyMethod_9_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_PerformGetKeyMethod_9_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "PerformGetKeyMethod";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_2_corematch_bindingFB(Match match) {
		EObject _localVariable_0 = match.getObject("methodPerformGetKey");
		EObject tmpMethodPerformGetKey = _localVariable_0;
		if (tmpMethodPerformGetKey instanceof JavaOpaqueMethod) {
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) tmpMethodPerformGetKey;
			return new Object[] { methodPerformGetKey, match };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PerformGetKeyMethod_9_2_corematch_blackBB(
			JavaOpaqueMethod methodPerformGetKey, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String methodPerformGetKey_name = methodPerformGetKey.getName();
		if (methodPerformGetKey_name.equals("performGetKey")) {
			String methodPerformGetKey_modifier = methodPerformGetKey.getModifier();
			if (methodPerformGetKey_modifier.equals("private")) {
				String methodPerformGetKey_type = methodPerformGetKey.getType();
				if (methodPerformGetKey_type.equals("SecretKey ")) {
					_result.add(new Object[] { methodPerformGetKey, match });
				}

			}

		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_PerformGetKeyMethod_9_3_findcontext_blackB(
			JavaOpaqueMethod methodPerformGetKey) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String methodPerformGetKey_name = methodPerformGetKey.getName();
		if (methodPerformGetKey_name.equals("performGetKey")) {
			String methodPerformGetKey_modifier = methodPerformGetKey.getModifier();
			if (methodPerformGetKey_modifier.equals("private")) {
				String methodPerformGetKey_type = methodPerformGetKey.getType();
				if (methodPerformGetKey_type.equals("SecretKey ")) {
					_result.add(new Object[] { methodPerformGetKey });
				}

			}

		}

		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_3_findcontext_greenBF(
			JavaOpaqueMethod methodPerformGetKey) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		isApplicableMatch.getAllContextElements().add(methodPerformGetKey);
		return new Object[] { methodPerformGetKey, isApplicableMatch };
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_4_solveCSP_bindingFBBB(PerformGetKeyMethod _this,
			IsApplicableMatch isApplicableMatch, JavaOpaqueMethod methodPerformGetKey) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, methodPerformGetKey);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, methodPerformGetKey };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_4_solveCSP_bindingAndBlackFBBB(PerformGetKeyMethod _this,
			IsApplicableMatch isApplicableMatch, JavaOpaqueMethod methodPerformGetKey) {
		Object[] result_pattern_PerformGetKeyMethod_9_4_solveCSP_binding = pattern_PerformGetKeyMethod_9_4_solveCSP_bindingFBBB(
				_this, isApplicableMatch, methodPerformGetKey);
		if (result_pattern_PerformGetKeyMethod_9_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PerformGetKeyMethod_9_4_solveCSP_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_9_4_solveCSP_black = pattern_PerformGetKeyMethod_9_4_solveCSP_blackB(
					csp);
			if (result_pattern_PerformGetKeyMethod_9_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, methodPerformGetKey };
			}
		}
		return null;
	}

	public static final boolean pattern_PerformGetKeyMethod_9_5_checkCSP_expressionFBB(PerformGetKeyMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_PerformGetKeyMethod_9_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "PerformGetKeyMethod";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_PerformGetKeyMethod_9_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_17_1_preparereturnvalue_bindingFB(
			PerformGetKeyMethod _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_17_1_preparereturnvalue_blackFBBF(EClass __eClass,
			PerformGetKeyMethod _this) {
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

	public static final Object[] pattern_PerformGetKeyMethod_17_1_preparereturnvalue_bindingAndBlackFFBF(
			PerformGetKeyMethod _this) {
		Object[] result_pattern_PerformGetKeyMethod_17_1_preparereturnvalue_binding = pattern_PerformGetKeyMethod_17_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_PerformGetKeyMethod_17_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_PerformGetKeyMethod_17_1_preparereturnvalue_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_17_1_preparereturnvalue_black = pattern_PerformGetKeyMethod_17_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_PerformGetKeyMethod_17_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_PerformGetKeyMethod_17_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_PerformGetKeyMethod_17_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_17_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_PerformGetKeyMethod_17_2_testcorematchandDECs_black_nac_0B(
			JavaOpaqueMethod methodPerformGetKey) {
		for (JavaCompilationUnit __DEC_methodPerformGetKey_methods_51282 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(methodPerformGetKey, JavaCompilationUnit.class, "methods")) {
			return new Object[] { methodPerformGetKey };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_PerformGetKeyMethod_17_2_testcorematchandDECs_blackB(
			JavaOpaqueMethod methodPerformGetKey) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String methodPerformGetKey_name = methodPerformGetKey.getName();
		if (methodPerformGetKey_name.equals("performGetKey")) {
			String methodPerformGetKey_modifier = methodPerformGetKey.getModifier();
			if (methodPerformGetKey_modifier.equals("private")) {
				String methodPerformGetKey_type = methodPerformGetKey.getType();
				if (methodPerformGetKey_type.equals("SecretKey ")) {
					if (pattern_PerformGetKeyMethod_17_2_testcorematchandDECs_black_nac_0B(
							methodPerformGetKey) == null) {
						_result.add(new Object[] { methodPerformGetKey });
					}
				}

			}

		}

		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_17_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_PerformGetKeyMethod_17_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBB(
			PerformGetKeyMethod _this, Match match, JavaOpaqueMethod methodPerformGetKey) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, methodPerformGetKey);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_PerformGetKeyMethod_17_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			PerformGetKeyMethod _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_17_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_17_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_PerformGetKeyMethod_17_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_1_prepare_blackB(PerformGetKeyMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_bindingFB(Match targetMatch) {
		EObject _localVariable_0 = targetMatch.getObject("methodPerformGetKey");
		EObject tmpMethodPerformGetKey = _localVariable_0;
		if (tmpMethodPerformGetKey instanceof JavaOpaqueMethod) {
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) tmpMethodPerformGetKey;
			return new Object[] { methodPerformGetKey, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_blackBBB(
			JavaOpaqueMethod methodPerformGetKey, Match sourceMatch, Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			String methodPerformGetKey_name = methodPerformGetKey.getName();
			if (methodPerformGetKey_name.equals("performGetKey")) {
				String methodPerformGetKey_modifier = methodPerformGetKey.getModifier();
				if (methodPerformGetKey_modifier.equals("private")) {
					String methodPerformGetKey_type = methodPerformGetKey.getType();
					if (methodPerformGetKey_type.equals("SecretKey ")) {
						return new Object[] { methodPerformGetKey, sourceMatch, targetMatch };
					}

				}

			}

		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_bindingAndBlackFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_binding = pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_bindingFB(
				targetMatch);
		if (result_pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_binding != null) {
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result_pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_black = pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_blackBBB(
					methodPerformGetKey, sourceMatch, targetMatch);
			if (result_pattern_PerformGetKeyMethod_20_2_matchsrctrgcontext_black != null) {

				return new Object[] { methodPerformGetKey, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_3_solvecsp_bindingFBBBB(PerformGetKeyMethod _this,
			JavaOpaqueMethod methodPerformGetKey, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_1 = _this.isApplicable_solveCsp_CC(methodPerformGetKey, sourceMatch, targetMatch);
		CSP csp = _localVariable_1;
		if (csp != null) {
			return new Object[] { csp, _this, methodPerformGetKey, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_3_solvecsp_bindingAndBlackFBBBB(
			PerformGetKeyMethod _this, JavaOpaqueMethod methodPerformGetKey, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_PerformGetKeyMethod_20_3_solvecsp_binding = pattern_PerformGetKeyMethod_20_3_solvecsp_bindingFBBBB(
				_this, methodPerformGetKey, sourceMatch, targetMatch);
		if (result_pattern_PerformGetKeyMethod_20_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_PerformGetKeyMethod_20_3_solvecsp_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_20_3_solvecsp_black = pattern_PerformGetKeyMethod_20_3_solvecsp_blackB(
					csp);
			if (result_pattern_PerformGetKeyMethod_20_3_solvecsp_black != null) {

				return new Object[] { csp, _this, methodPerformGetKey, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_PerformGetKeyMethod_20_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_PerformGetKeyMethod_20_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "PerformGetKeyMethod";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_6_createcorrespondence_blackBB(
			JavaOpaqueMethod methodPerformGetKey, CCMatch ccMatch) {
		return new Object[] { methodPerformGetKey, ccMatch };
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_PerformGetKeyMethod_20_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "PerformGetKeyMethod";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_PerformGetKeyMethod_20_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final boolean pattern_PerformGetKeyMethod_23_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PerformGetKeyMethod_23_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_24_1_matchtggpattern_black_nac_0B(
			JavaOpaqueMethod methodPerformGetKey) {
		for (JavaCompilationUnit __DEC_methodPerformGetKey_methods_862297 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(methodPerformGetKey, JavaCompilationUnit.class, "methods")) {
			return new Object[] { methodPerformGetKey };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_24_1_matchtggpattern_blackB(
			JavaOpaqueMethod methodPerformGetKey) {
		if (pattern_PerformGetKeyMethod_24_1_matchtggpattern_black_nac_0B(methodPerformGetKey) == null) {
			return new Object[] { methodPerformGetKey };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_24_1_matchtggpattern_greenB(
			JavaOpaqueMethod methodPerformGetKey) {
		String methodPerformGetKey_name_prime = "performGetKey";
		String methodPerformGetKey_modifier_prime = "private";
		String methodPerformGetKey_type_prime = "SecretKey ";
		methodPerformGetKey.setName(methodPerformGetKey_name_prime);
		methodPerformGetKey.setModifier(methodPerformGetKey_modifier_prime);
		methodPerformGetKey.setType(methodPerformGetKey_type_prime);
		return new Object[] { methodPerformGetKey };
	}

	public static final boolean pattern_PerformGetKeyMethod_24_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_PerformGetKeyMethod_24_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_1_createresult_blackB(PerformGetKeyMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_2_isapplicablecore_blackB(PerformGetKeyMethod _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_3_solveCSP_bindingFBBB(PerformGetKeyMethod _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_3_solveCSP_bindingAndBlackFBBB(
			PerformGetKeyMethod _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_PerformGetKeyMethod_25_3_solveCSP_binding = pattern_PerformGetKeyMethod_25_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_PerformGetKeyMethod_25_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_PerformGetKeyMethod_25_3_solveCSP_binding[0];

			Object[] result_pattern_PerformGetKeyMethod_25_3_solveCSP_black = pattern_PerformGetKeyMethod_25_3_solveCSP_blackB(
					csp);
			if (result_pattern_PerformGetKeyMethod_25_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_PerformGetKeyMethod_25_4_checkCSP_expressionFBB(PerformGetKeyMethod _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_PerformGetKeyMethod_25_6_perform_greenFBB(ModelgeneratorRuleResult ruleResult,
			CSP csp) {
		JavaOpaqueMethod methodPerformGetKey = SimpleJavaFactory.eINSTANCE.createJavaOpaqueMethod();
		String methodPerformGetKey_name_prime = "performGetKey";
		String methodPerformGetKey_modifier_prime = "private";
		String methodPerformGetKey_type_prime = "SecretKey ";
		Object _localVariable_0 = csp.getValue("methodPerformGetKey", "parameters");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_1 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(methodPerformGetKey);
		methodPerformGetKey.setName(methodPerformGetKey_name_prime);
		methodPerformGetKey.setModifier(methodPerformGetKey_modifier_prime);
		methodPerformGetKey.setType(methodPerformGetKey_type_prime);
		String methodPerformGetKey_parameters_prime = (String) _localVariable_0;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_1);
		methodPerformGetKey.setParameters(methodPerformGetKey_parameters_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { methodPerformGetKey, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_PerformGetKeyMethod_25_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //PerformGetKeyMethodImpl
