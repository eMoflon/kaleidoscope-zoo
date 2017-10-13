/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoAPIConfig.CryptoAPIConfigFactory;
import CryptoAPIConfig.Import;
import CryptoAPIConfig.KeyDerivationAlgorithm;

import CryptoConfigToJava.CryptoConfigToJavaFactory;
import CryptoConfigToJava.ImportToImport;
import CryptoConfigToJava.KeyDerivationAlgorithmToJcu;

import CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport;
import CryptoConfigToJava.Rules.RulesPackage;

import SimpleJava.JavaCompilationUnit;
import SimpleJava.JavaImport;
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
 * An implementation of the model object '<em><b>Key Derivation Algorithm Import To Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class KeyDerivationAlgorithmImportToImportImpl extends AbstractRuleImpl
		implements KeyDerivationAlgorithmImportToImport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyDerivationAlgorithmImportToImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getKeyDerivationAlgorithmImportToImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, Import imp, KeyDerivationAlgorithm alg) {

		Object[] result1_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_0_1_initialbindings_blackBBBB(this, match, imp, alg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
		}

		Object[] result2_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, imp, alg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_0_4_collectelementstobetranslated_blackBBB(match, imp,
							alg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
			}
			KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_0_4_collectelementstobetranslated_greenBBBF(match,
							imp, alg);
			//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result4_green[3];

			Object[] result5_black = KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_0_5_collectcontextelements_blackBBB(match, imp, alg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
			}
			KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_0_5_collectcontextelements_greenBB(match, alg);

			// 
			KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_0_6_registerobjectstomatch_expressionBBBB(this, match,
							imp, alg);
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_0_7_expressionF();
		} else {
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		Import imp = (Import) result1_bindingAndBlack[0];
		KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result1_bindingAndBlack[1];
		JavaCompilationUnit cu = (JavaCompilationUnit) result1_bindingAndBlack[2];
		KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_greenBFBFB(imp, cu, csp);
		ImportToImport i2j = (ImportToImport) result1_green[1];
		JavaImport jimp = (JavaImport) result1_green[3];

		Object[] result2_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_2_collecttranslatedelements_blackBBB(imp, i2j, jimp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[imp] = " + imp + ", "
					+ "[i2j] = " + i2j + ", " + "[jimp] = " + jimp + ".");
		}
		Object[] result2_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_2_collecttranslatedelements_greenFBBB(imp, i2j, jimp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, imp, i2j,
						ac, cu, alg, jimp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[imp] = " + imp + ", " + "[i2j] = " + i2j + ", " + "[ac] = " + ac + ", " + "[cu] = " + cu
					+ ", " + "[alg] = " + alg + ", " + "[jimp] = " + jimp + ".");
		}
		KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, imp,
						i2j, cu, alg, jimp);
		//nothing EMoflonEdge i2j__imp____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge i2j__jimp____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[9];

		// 
		// 
		KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						imp, i2j, ac, cu, alg, jimp);
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		Import imp = (Import) result2_binding[0];
		KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result2_binding[1];
		for (Object[] result2_black : KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_2_2_corematch_blackBFFBB(imp, alg, match)) {
			KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result2_black[1];
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[2];
			// ForEach 
			for (Object[] result3_black : KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_2_3_findcontext_blackBBBB(imp, ac, cu, alg)) {
				Object[] result3_green = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_2_3_findcontext_greenBBBBFFFF(imp, ac, cu, alg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge ac__alg____source = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge ac__cu____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, imp, ac, cu, alg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[imp] = " + imp + ", " + "[ac] = "
							+ ac + ", " + "[cu] = " + cu + ", " + "[alg] = " + alg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, Import imp, KeyDerivationAlgorithm alg) {
		match.registerObject("imp", imp);
		match.registerObject("alg", alg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Import imp, KeyDerivationAlgorithm alg) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Import imp,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp.value", true, csp);
		var_imp_value.setValue(imp.getValue());
		var_imp_value.setType("String");

		// Create unbound variables
		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp.value", csp);
		var_jimp_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_imp_value, var_jimp_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("imp", imp);
		isApplicableMatch.registerObject("ac", ac);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("alg", alg);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject cu,
			EObject alg, EObject jimp) {
		ruleresult.registerObject("imp", imp);
		ruleresult.registerObject("i2j", i2j);
		ruleresult.registerObject("ac", ac);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("alg", alg);
		ruleresult.registerObject("jimp", jimp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("imp").eClass())
				.equals("CryptoAPIConfig.Import.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, JavaCompilationUnit cu, JavaImport jimp) {

		Object[] result1_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_10_1_initialbindings_blackBBBB(this, match, cu, jimp);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
		}

		Object[] result2_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, cu, jimp);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_10_4_collectelementstobetranslated_blackBBB(match, cu,
							jimp);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
			}
			KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_10_4_collectelementstobetranslated_greenBBBF(match,
							cu, jimp);
			//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result4_green[3];

			Object[] result5_black = KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_10_5_collectcontextelements_blackBBB(match, cu, jimp);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
			}
			KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_10_5_collectcontextelements_greenBB(match, cu);

			// 
			KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_10_6_registerobjectstomatch_expressionBBBB(this,
							match, cu, jimp);
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_10_7_expressionF();
		} else {
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result1_bindingAndBlack[0];
		JavaCompilationUnit cu = (JavaCompilationUnit) result1_bindingAndBlack[1];
		KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result1_bindingAndBlack[2];
		JavaImport jimp = (JavaImport) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_greenFFBBB(alg, jimp, csp);
		Import imp = (Import) result1_green[0];
		ImportToImport i2j = (ImportToImport) result1_green[1];

		Object[] result2_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_2_collecttranslatedelements_blackBBB(imp, i2j, jimp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[imp] = " + imp + ", "
					+ "[i2j] = " + i2j + ", " + "[jimp] = " + jimp + ".");
		}
		Object[] result2_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_2_collecttranslatedelements_greenFBBB(imp, i2j, jimp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, imp,
						i2j, ac, cu, alg, jimp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[imp] = " + imp + ", " + "[i2j] = " + i2j + ", " + "[ac] = " + ac + ", " + "[cu] = " + cu
					+ ", " + "[alg] = " + alg + ", " + "[jimp] = " + jimp + ".");
		}
		KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, imp,
						i2j, cu, alg, jimp);
		//nothing EMoflonEdge i2j__imp____source = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge i2j__jimp____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[9];

		// 
		// 
		KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						imp, i2j, ac, cu, alg, jimp);
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		JavaCompilationUnit cu = (JavaCompilationUnit) result2_binding[0];
		JavaImport jimp = (JavaImport) result2_binding[1];
		for (Object[] result2_black : KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_12_2_corematch_blackFBFBB(cu, jimp, match)) {
			KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result2_black[0];
			KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result2_black[2];
			// ForEach 
			for (Object[] result3_black : KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_12_3_findcontext_blackBBBB(ac, cu, alg, jimp)) {
				Object[] result3_green = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_12_3_findcontext_greenBBBBFFFF(ac, cu, alg, jimp);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge ac__alg____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge ac__cu____target = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, ac, cu, alg, jimp);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ac] = " + ac + ", " + "[cu] = "
							+ cu + ", " + "[alg] = " + alg + ", " + "[jimp] = " + jimp + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, JavaCompilationUnit cu, JavaImport jimp) {
		match.registerObject("cu", cu);
		match.registerObject("jimp", jimp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, JavaCompilationUnit cu, JavaImport jimp) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, KeyDerivationAlgorithmToJcu ac,
			JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables
		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp.value", true, csp);
		var_jimp_value.setValue(jimp.getValue());
		var_jimp_value.setType("String");

		// Create unbound variables
		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp.value", csp);
		var_imp_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_imp_value, var_jimp_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ac", ac);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("alg", alg);
		isApplicableMatch.registerObject("jimp", jimp);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject cu,
			EObject alg, EObject jimp) {
		ruleresult.registerObject("imp", imp);
		ruleresult.registerObject("i2j", i2j);
		ruleresult.registerObject("ac", ac);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("alg", alg);
		ruleresult.registerObject("jimp", jimp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true && org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("jimp").eClass())
				.equals("SimpleJava.JavaImport.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_8(EMoflonEdge _edge_imports) {

		Object[] result1_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_20_2_testcorematchandDECs_blackFFB(_edge_imports)) {
			Import imp = (Import) result2_black[0];
			KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result2_black[1];
			Object[] result2_green = KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, imp, alg)) {
				// 
				if (KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_10(EMoflonEdge _edge_imports) {

		Object[] result1_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_21_2_testcorematchandDECs_blackFFB(_edge_imports)) {
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[0];
			JavaImport jimp = (JavaImport) result2_black[1];
			Object[] result2_green = KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, cu, jimp)) {
				// 
				if (KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("KeyDerivationAlgorithmImportToImport");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp", true, csp);
		var_jimp_value.setValue(__helper.getValue("jimp", "value"));
		var_jimp_value.setType("String");

		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp", true, csp);
		var_imp_value.setValue(__helper.getValue("imp", "value"));
		var_imp_value.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("KeyDerivationAlgorithmImportToImport");
		eq0.solve(var_imp_value, var_jimp_value);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_jimp_value.setBound(false);
			eq0.solve(var_imp_value, var_jimp_value);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("jimp", "value", var_jimp_value.getValue());
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
		ruleResult.setRule("KeyDerivationAlgorithmImportToImport");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp", true, csp);
		var_jimp_value.setValue(__helper.getValue("jimp", "value"));
		var_jimp_value.setType("String");

		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp", true, csp);
		var_imp_value.setValue(__helper.getValue("imp", "value"));
		var_imp_value.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("KeyDerivationAlgorithmImportToImport");
		eq0.solve(var_imp_value, var_jimp_value);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_imp_value.setBound(false);
			eq0.solve(var_imp_value, var_jimp_value);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("imp", "value", var_imp_value.getValue());
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

		Object[] result1_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		Import imp = (Import) result2_bindingAndBlack[0];
		JavaCompilationUnit cu = (JavaCompilationUnit) result2_bindingAndBlack[1];
		KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result2_bindingAndBlack[2];
		JavaImport jimp = (JavaImport) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, imp, cu, alg,
						jimp, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[imp] = " + imp + ", " + "[cu] = " + cu + ", " + "[alg] = " + alg + ", " + "[jimp] = " + jimp
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_24_5_matchcorrcontext_blackFBBBB(cu, alg, sourceMatch,
							targetMatch)) {
				KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result5_black[0];
				Object[] result5_green = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_24_5_matchcorrcontext_greenBBBF(ac, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_24_6_createcorrespondence_blackBBBBB(imp, cu, alg,
								jimp, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[imp] = " + imp + ", "
							+ "[cu] = " + cu + ", " + "[alg] = " + alg + ", " + "[jimp] = " + jimp + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_24_6_createcorrespondence_greenBFBB(imp, jimp,
								ccMatch);
				//nothing ImportToImport i2j = (ImportToImport) result6_green[1];

				Object[] result7_black = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(Import imp, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals

		// Create attribute variables
		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp.value", true, csp);
		var_imp_value.setValue(imp.getValue());
		var_imp_value.setType("String");
		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp.value", true, csp);
		var_jimp_value.setValue(jimp.getValue());
		var_jimp_value.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_imp_value, var_jimp_value);
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
	public boolean checkDEC_FWD(Import imp, KeyDerivationAlgorithm alg) {// 
		Object[] result1_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_27_1_matchtggpattern_blackBB(imp, alg);
		if (result1_black != null) {
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_27_2_expressionF();
		} else {
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(JavaCompilationUnit cu, JavaImport jimp) {// 
		Object[] result1_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_28_1_matchtggpattern_blackBB(cu, jimp);
		if (result1_black != null) {
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_28_2_expressionF();
		} else {
			return KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			KeyDerivationAlgorithmToJcu acParameter) {

		Object[] result1_black = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList acList = (RuleEntryList) result2_black[0];
			KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result2_black[1];
			KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result2_black[2];
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[3];

			Object[] result3_bindingAndBlack = KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, ac, cu, alg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ac] = " + ac + ", " + "[cu] = " + cu
						+ ", " + "[alg] = " + alg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (KeyDerivationAlgorithmImportToImportImpl
					.pattern_KeyDerivationAlgorithmImportToImport_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = KeyDerivationAlgorithmImportToImportImpl
						.pattern_KeyDerivationAlgorithmImportToImport_29_5_checknacs_blackBBB(ac, cu, alg);
				if (result5_black != null) {

					Object[] result6_black = KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_29_6_perform_blackBBBB(ac, cu, alg,
									ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[ac] = " + ac + ", " + "[cu] = " + cu
										+ ", " + "[alg] = " + alg + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					KeyDerivationAlgorithmImportToImportImpl
							.pattern_KeyDerivationAlgorithmImportToImport_29_6_perform_greenFFBBFBB(cu, alg, ruleResult,
									csp);
					//nothing Import imp = (Import) result6_green[0];
					//nothing ImportToImport i2j = (ImportToImport) result6_green[1];
					//nothing JavaImport jimp = (JavaImport) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return KeyDerivationAlgorithmImportToImportImpl
				.pattern_KeyDerivationAlgorithmImportToImport_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, KeyDerivationAlgorithmToJcu ac,
			JavaCompilationUnit cu, KeyDerivationAlgorithm alg, ModelgeneratorRuleResult ruleResult) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals

		// Create attribute variables

		// Create unbound variables
		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp.value", csp);
		var_imp_value.setType("String");
		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp.value", csp);
		var_jimp_value.setType("String");

		// Create constraints
		Eq eq = new Eq();

		csp.getConstraints().add(eq);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_imp_value, var_jimp_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("ac", ac);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("alg", alg);
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
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD__MATCH_IMPORT_KEYDERIVATIONALGORITHM:
			return isAppropriate_FWD((Match) arguments.get(0), (Import) arguments.get(1),
					(KeyDerivationAlgorithm) arguments.get(2));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_IMPORT_KEYDERIVATIONALGORITHM:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Import) arguments.get(1),
					(KeyDerivationAlgorithm) arguments.get(2));
			return null;
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_IMPORT_KEYDERIVATIONALGORITHM:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Import) arguments.get(1),
					(KeyDerivationAlgorithm) arguments.get(2));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_IMPORT_KEYDERIVATIONALGORITHMTOJCU_JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Import) arguments.get(1),
					(KeyDerivationAlgorithmToJcu) arguments.get(2), (JavaCompilationUnit) arguments.get(3),
					(KeyDerivationAlgorithm) arguments.get(4));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaImport) arguments.get(2));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaImport) arguments.get(2));
			return null;
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaImport) arguments.get(2));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_KEYDERIVATIONALGORITHMTOJCU_JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM_JAVAIMPORT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(KeyDerivationAlgorithmToJcu) arguments.get(1), (JavaCompilationUnit) arguments.get(2),
					(KeyDerivationAlgorithm) arguments.get(3), (JavaImport) arguments.get(4));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_10__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_10((EMoflonEdge) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_CC__IMPORT_JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM_JAVAIMPORT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Import) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(KeyDerivationAlgorithm) arguments.get(2), (JavaImport) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_DEC_FWD__IMPORT_KEYDERIVATIONALGORITHM:
			return checkDEC_FWD((Import) arguments.get(0), (KeyDerivationAlgorithm) arguments.get(1));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___CHECK_DEC_BWD__JAVACOMPILATIONUNIT_JAVAIMPORT:
			return checkDEC_BWD((JavaCompilationUnit) arguments.get(0), (JavaImport) arguments.get(1));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___GENERATE_MODEL__RULEENTRYCONTAINER_KEYDERIVATIONALGORITHMTOJCU:
			return generateModel((RuleEntryContainer) arguments.get(0), (KeyDerivationAlgorithmToJcu) arguments.get(1));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_KEYDERIVATIONALGORITHMTOJCU_JAVACOMPILATIONUNIT_KEYDERIVATIONALGORITHM_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(KeyDerivationAlgorithmToJcu) arguments.get(1), (JavaCompilationUnit) arguments.get(2),
					(KeyDerivationAlgorithm) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_1_initialbindings_blackBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, Import imp, KeyDerivationAlgorithm alg) {
		return new Object[] { _this, match, imp, alg };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_bindingFBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, Import imp, KeyDerivationAlgorithm alg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, imp, alg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, imp, alg };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_bindingAndBlackFBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, Import imp, KeyDerivationAlgorithm alg) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_binding = pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_bindingFBBBB(
				_this, match, imp, alg);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_black = pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, imp, alg };
			}
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_0_3_CheckCSP_expressionFBB(
			KeyDerivationAlgorithmImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_4_collectelementstobetranslated_blackBBB(
			Match match, Import imp, KeyDerivationAlgorithm alg) {
		return new Object[] { match, imp, alg };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Import imp, KeyDerivationAlgorithm alg) {
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(imp);
		String alg__imp____imports_name_prime = "imports";
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		match.getToBeTranslatedEdges().add(alg__imp____imports);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		return new Object[] { match, imp, alg, alg__imp____imports };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_5_collectcontextelements_blackBBB(
			Match match, Import imp, KeyDerivationAlgorithm alg) {
		return new Object[] { match, imp, alg };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_0_5_collectcontextelements_greenBB(
			Match match, KeyDerivationAlgorithm alg) {
		match.getContextNodes().add(alg);
		return new Object[] { match, alg };
	}

	public static final void pattern_KeyDerivationAlgorithmImportToImport_0_6_registerobjectstomatch_expressionBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, Import imp, KeyDerivationAlgorithm alg) {
		_this.registerObjectsToMatch_FWD(match, imp, alg);

	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("imp");
		EObject _localVariable_1 = isApplicableMatch.getObject("ac");
		EObject _localVariable_2 = isApplicableMatch.getObject("cu");
		EObject _localVariable_3 = isApplicableMatch.getObject("alg");
		EObject tmpImp = _localVariable_0;
		EObject tmpAc = _localVariable_1;
		EObject tmpCu = _localVariable_2;
		EObject tmpAlg = _localVariable_3;
		if (tmpImp instanceof Import) {
			Import imp = (Import) tmpImp;
			if (tmpAc instanceof KeyDerivationAlgorithmToJcu) {
				KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) tmpAc;
				if (tmpCu instanceof JavaCompilationUnit) {
					JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
					if (tmpAlg instanceof KeyDerivationAlgorithm) {
						KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) tmpAlg;
						return new Object[] { imp, ac, cu, alg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_blackBBBBFBB(
			Import imp, KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg,
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { imp, ac, cu, alg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_bindingAndBlackFFFFFBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_binding = pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_binding != null) {
			Import imp = (Import) result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_binding[0];
			KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_binding[1];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_binding[2];
			KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_binding[3];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_black = pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_blackBBBBFBB(
					imp, ac, cu, alg, _this, isApplicableMatch);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_black[4];

				return new Object[] { imp, ac, cu, alg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_1_performtransformation_greenBFBFB(
			Import imp, JavaCompilationUnit cu, CSP csp) {
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		JavaImport jimp = SimpleJavaFactory.eINSTANCE.createJavaImport();
		Object _localVariable_0 = csp.getValue("jimp", "value");
		i2j.setSource(imp);
		cu.getImports().add(jimp);
		i2j.setTarget(jimp);
		String jimp_value_prime = (String) _localVariable_0;
		jimp.setValue(jimp_value_prime);
		return new Object[] { imp, i2j, cu, jimp, csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_2_collecttranslatedelements_blackBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		return new Object[] { imp, i2j, jimp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_2_collecttranslatedelements_greenFBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(imp);
		ruleresult.getCreatedLinkElements().add(i2j);
		ruleresult.getCreatedElements().add(jimp);
		return new Object[] { ruleresult, imp, i2j, jimp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject cu, EObject alg, EObject jimp) {
		if (!imp.equals(jimp)) {
			if (!i2j.equals(imp)) {
				if (!i2j.equals(jimp)) {
					if (!ac.equals(imp)) {
						if (!ac.equals(i2j)) {
							if (!ac.equals(cu)) {
								if (!ac.equals(alg)) {
									if (!ac.equals(jimp)) {
										if (!cu.equals(imp)) {
											if (!cu.equals(i2j)) {
												if (!cu.equals(jimp)) {
													if (!alg.equals(imp)) {
														if (!alg.equals(i2j)) {
															if (!alg.equals(cu)) {
																if (!alg.equals(jimp)) {
																	return new Object[] { ruleresult, imp, i2j, ac, cu,
																			alg, jimp };
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

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject cu, EObject alg, EObject jimp) {
		EMoflonEdge i2j__imp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__jimp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "KeyDerivationAlgorithmImportToImport";
		String i2j__imp____source_name_prime = "source";
		String cu__jimp____imports_name_prime = "imports";
		String i2j__jimp____target_name_prime = "target";
		String alg__imp____imports_name_prime = "imports";
		i2j__imp____source.setSrc(i2j);
		i2j__imp____source.setTrg(imp);
		ruleresult.getCreatedEdges().add(i2j__imp____source);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		ruleresult.getCreatedEdges().add(cu__jimp____imports);
		i2j__jimp____target.setSrc(i2j);
		i2j__jimp____target.setTrg(jimp);
		ruleresult.getCreatedEdges().add(i2j__jimp____target);
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		ruleresult.getTranslatedEdges().add(alg__imp____imports);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i2j__imp____source.setName(i2j__imp____source_name_prime);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		i2j__jimp____target.setName(i2j__jimp____target_name_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		return new Object[] { ruleresult, imp, i2j, cu, alg, jimp, i2j__imp____source, cu__jimp____imports,
				i2j__jimp____target, alg__imp____imports };
	}

	public static final void pattern_KeyDerivationAlgorithmImportToImport_1_5_registerobjects_expressionBBBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, PerformRuleResult ruleresult, EObject imp, EObject i2j,
			EObject ac, EObject cu, EObject alg, EObject jimp) {
		_this.registerObjects_FWD(ruleresult, imp, i2j, ac, cu, alg, jimp);

	}

	public static final PerformRuleResult pattern_KeyDerivationAlgorithmImportToImport_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_bindingFB(
			KeyDerivationAlgorithmImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_blackFBB(
			EClass eClass, KeyDerivationAlgorithmImportToImport _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_bindingAndBlackFFB(
			KeyDerivationAlgorithmImportToImport _this) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_binding = pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_black = pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "KeyDerivationAlgorithmImportToImport";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("imp");
		EObject _localVariable_1 = match.getObject("alg");
		EObject tmpImp = _localVariable_0;
		EObject tmpAlg = _localVariable_1;
		if (tmpImp instanceof Import) {
			Import imp = (Import) tmpImp;
			if (tmpAlg instanceof KeyDerivationAlgorithm) {
				KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) tmpAlg;
				return new Object[] { imp, alg, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_2_2_corematch_blackBFFBB(
			Import imp, KeyDerivationAlgorithm alg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (KeyDerivationAlgorithmToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(alg,
				KeyDerivationAlgorithmToJcu.class, "source")) {
			JavaCompilationUnit cu = ac.getTarget();
			if (cu != null) {
				_result.add(new Object[] { imp, ac, cu, alg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_2_3_findcontext_blackBBBB(
			Import imp, KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (alg.equals(ac.getSource())) {
			if (alg.getImports().contains(imp)) {
				if (cu.equals(ac.getTarget())) {
					_result.add(new Object[] { imp, ac, cu, alg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_3_findcontext_greenBBBBFFFF(Import imp,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ac__alg____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__cu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ac__alg____source_name_prime = "source";
		String alg__imp____imports_name_prime = "imports";
		String ac__cu____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(imp);
		isApplicableMatch.getAllContextElements().add(ac);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(alg);
		ac__alg____source.setSrc(ac);
		ac__alg____source.setTrg(alg);
		isApplicableMatch.getAllContextElements().add(ac__alg____source);
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		isApplicableMatch.getAllContextElements().add(alg__imp____imports);
		ac__cu____target.setSrc(ac);
		ac__cu____target.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(ac__cu____target);
		ac__alg____source.setName(ac__alg____source_name_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		ac__cu____target.setName(ac__cu____target_name_prime);
		return new Object[] { imp, ac, cu, alg, isApplicableMatch, ac__alg____source, alg__imp____imports,
				ac__cu____target };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_bindingFBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch, Import imp,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, imp, ac, cu, alg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, imp, ac, cu, alg };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_bindingAndBlackFBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch, Import imp,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_binding = pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, imp, ac, cu, alg);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_black = pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, imp, ac, cu, alg };
			}
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_2_5_checkCSP_expressionFBB(
			KeyDerivationAlgorithmImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "KeyDerivationAlgorithmImportToImport";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_KeyDerivationAlgorithmImportToImport_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_1_initialbindings_blackBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		return new Object[] { _this, match, cu, jimp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_bindingFBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, cu, jimp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cu, jimp };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_bindingAndBlackFBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_binding = pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_bindingFBBBB(
				_this, match, cu, jimp);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_black = pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cu, jimp };
			}
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_10_3_CheckCSP_expressionFBB(
			KeyDerivationAlgorithmImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_4_collectelementstobetranslated_blackBBB(
			Match match, JavaCompilationUnit cu, JavaImport jimp) {
		return new Object[] { match, cu, jimp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_4_collectelementstobetranslated_greenBBBF(
			Match match, JavaCompilationUnit cu, JavaImport jimp) {
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jimp);
		String cu__jimp____imports_name_prime = "imports";
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		match.getToBeTranslatedEdges().add(cu__jimp____imports);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		return new Object[] { match, cu, jimp, cu__jimp____imports };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_5_collectcontextelements_blackBBB(
			Match match, JavaCompilationUnit cu, JavaImport jimp) {
		return new Object[] { match, cu, jimp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_10_5_collectcontextelements_greenBB(
			Match match, JavaCompilationUnit cu) {
		match.getContextNodes().add(cu);
		return new Object[] { match, cu };
	}

	public static final void pattern_KeyDerivationAlgorithmImportToImport_10_6_registerobjectstomatch_expressionBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		_this.registerObjectsToMatch_BWD(match, cu, jimp);

	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("ac");
		EObject _localVariable_1 = isApplicableMatch.getObject("cu");
		EObject _localVariable_2 = isApplicableMatch.getObject("alg");
		EObject _localVariable_3 = isApplicableMatch.getObject("jimp");
		EObject tmpAc = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpAlg = _localVariable_2;
		EObject tmpJimp = _localVariable_3;
		if (tmpAc instanceof KeyDerivationAlgorithmToJcu) {
			KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) tmpAc;
			if (tmpCu instanceof JavaCompilationUnit) {
				JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
				if (tmpAlg instanceof KeyDerivationAlgorithm) {
					KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) tmpAlg;
					if (tmpJimp instanceof JavaImport) {
						JavaImport jimp = (JavaImport) tmpJimp;
						return new Object[] { ac, cu, alg, jimp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_blackBBBBFBB(
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp,
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { ac, cu, alg, jimp, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_bindingAndBlackFFFFFBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_binding = pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_binding != null) {
			KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_binding[0];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_binding[1];
			KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_binding[2];
			JavaImport jimp = (JavaImport) result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_binding[3];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_black = pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_blackBBBBFBB(
					ac, cu, alg, jimp, _this, isApplicableMatch);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_black[4];

				return new Object[] { ac, cu, alg, jimp, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_1_performtransformation_greenFFBBB(
			KeyDerivationAlgorithm alg, JavaImport jimp, CSP csp) {
		Import imp = CryptoAPIConfigFactory.eINSTANCE.createImport();
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		Object _localVariable_0 = csp.getValue("imp", "value");
		alg.getImports().add(imp);
		i2j.setSource(imp);
		i2j.setTarget(jimp);
		String imp_value_prime = (String) _localVariable_0;
		imp.setValue(imp_value_prime);
		return new Object[] { imp, i2j, alg, jimp, csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_2_collecttranslatedelements_blackBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		return new Object[] { imp, i2j, jimp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_2_collecttranslatedelements_greenFBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(imp);
		ruleresult.getCreatedLinkElements().add(i2j);
		ruleresult.getTranslatedElements().add(jimp);
		return new Object[] { ruleresult, imp, i2j, jimp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject cu, EObject alg, EObject jimp) {
		if (!imp.equals(jimp)) {
			if (!i2j.equals(imp)) {
				if (!i2j.equals(jimp)) {
					if (!ac.equals(imp)) {
						if (!ac.equals(i2j)) {
							if (!ac.equals(cu)) {
								if (!ac.equals(alg)) {
									if (!ac.equals(jimp)) {
										if (!cu.equals(imp)) {
											if (!cu.equals(i2j)) {
												if (!cu.equals(jimp)) {
													if (!alg.equals(imp)) {
														if (!alg.equals(i2j)) {
															if (!alg.equals(cu)) {
																if (!alg.equals(jimp)) {
																	return new Object[] { ruleresult, imp, i2j, ac, cu,
																			alg, jimp };
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

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject cu, EObject alg, EObject jimp) {
		EMoflonEdge i2j__imp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__jimp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "KeyDerivationAlgorithmImportToImport";
		String i2j__imp____source_name_prime = "source";
		String cu__jimp____imports_name_prime = "imports";
		String i2j__jimp____target_name_prime = "target";
		String alg__imp____imports_name_prime = "imports";
		i2j__imp____source.setSrc(i2j);
		i2j__imp____source.setTrg(imp);
		ruleresult.getCreatedEdges().add(i2j__imp____source);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		ruleresult.getTranslatedEdges().add(cu__jimp____imports);
		i2j__jimp____target.setSrc(i2j);
		i2j__jimp____target.setTrg(jimp);
		ruleresult.getCreatedEdges().add(i2j__jimp____target);
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		ruleresult.getCreatedEdges().add(alg__imp____imports);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i2j__imp____source.setName(i2j__imp____source_name_prime);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		i2j__jimp____target.setName(i2j__jimp____target_name_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		return new Object[] { ruleresult, imp, i2j, cu, alg, jimp, i2j__imp____source, cu__jimp____imports,
				i2j__jimp____target, alg__imp____imports };
	}

	public static final void pattern_KeyDerivationAlgorithmImportToImport_11_5_registerobjects_expressionBBBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, PerformRuleResult ruleresult, EObject imp, EObject i2j,
			EObject ac, EObject cu, EObject alg, EObject jimp) {
		_this.registerObjects_BWD(ruleresult, imp, i2j, ac, cu, alg, jimp);

	}

	public static final PerformRuleResult pattern_KeyDerivationAlgorithmImportToImport_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_bindingFB(
			KeyDerivationAlgorithmImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_blackFBB(
			EClass eClass, KeyDerivationAlgorithmImportToImport _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_bindingAndBlackFFB(
			KeyDerivationAlgorithmImportToImport _this) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_binding = pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_black = pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "KeyDerivationAlgorithmImportToImport";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("cu");
		EObject _localVariable_1 = match.getObject("jimp");
		EObject tmpCu = _localVariable_0;
		EObject tmpJimp = _localVariable_1;
		if (tmpCu instanceof JavaCompilationUnit) {
			JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
			if (tmpJimp instanceof JavaImport) {
				JavaImport jimp = (JavaImport) tmpJimp;
				return new Object[] { cu, jimp, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_12_2_corematch_blackFBFBB(
			JavaCompilationUnit cu, JavaImport jimp, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (KeyDerivationAlgorithmToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
				KeyDerivationAlgorithmToJcu.class, "target")) {
			KeyDerivationAlgorithm alg = ac.getSource();
			if (alg != null) {
				_result.add(new Object[] { ac, cu, alg, jimp, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_12_3_findcontext_blackBBBB(
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (cu.getImports().contains(jimp)) {
			if (alg.equals(ac.getSource())) {
				if (cu.equals(ac.getTarget())) {
					_result.add(new Object[] { ac, cu, alg, jimp });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_3_findcontext_greenBBBBFFFF(
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__alg____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__cu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cu__jimp____imports_name_prime = "imports";
		String ac__alg____source_name_prime = "source";
		String ac__cu____target_name_prime = "target";
		isApplicableMatch.getAllContextElements().add(ac);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(alg);
		isApplicableMatch.getAllContextElements().add(jimp);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		isApplicableMatch.getAllContextElements().add(cu__jimp____imports);
		ac__alg____source.setSrc(ac);
		ac__alg____source.setTrg(alg);
		isApplicableMatch.getAllContextElements().add(ac__alg____source);
		ac__cu____target.setSrc(ac);
		ac__cu____target.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(ac__cu____target);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		ac__alg____source.setName(ac__alg____source_name_prime);
		ac__cu____target.setName(ac__cu____target_name_prime);
		return new Object[] { ac, cu, alg, jimp, isApplicableMatch, cu__jimp____imports, ac__alg____source,
				ac__cu____target };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_bindingFBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, ac, cu, alg, jimp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, jimp };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_bindingAndBlackFBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_binding = pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ac, cu, alg, jimp);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_black = pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, jimp };
			}
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_12_5_checkCSP_expressionFBB(
			KeyDerivationAlgorithmImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "KeyDerivationAlgorithmImportToImport";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_KeyDerivationAlgorithmImportToImport_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_bindingFB(
			KeyDerivationAlgorithmImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, KeyDerivationAlgorithmImportToImport _this) {
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

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_bindingAndBlackFFBF(
			KeyDerivationAlgorithmImportToImport _this) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_binding = pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_black = pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_imports) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlg = _edge_imports.getSrc();
		if (tmpAlg instanceof KeyDerivationAlgorithm) {
			KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) tmpAlg;
			EObject tmpImp = _edge_imports.getTrg();
			if (tmpImp instanceof Import) {
				Import imp = (Import) tmpImp;
				if (alg.getImports().contains(imp)) {
					_result.add(new Object[] { imp, alg, _edge_imports });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, Import imp, KeyDerivationAlgorithm alg) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, imp, alg);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			KeyDerivationAlgorithmImportToImport _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_KeyDerivationAlgorithmImportToImport_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_bindingFB(
			KeyDerivationAlgorithmImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, KeyDerivationAlgorithmImportToImport _this) {
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

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_bindingAndBlackFFBF(
			KeyDerivationAlgorithmImportToImport _this) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_binding = pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_black = pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_imports) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCu = _edge_imports.getSrc();
		if (tmpCu instanceof JavaCompilationUnit) {
			JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
			EObject tmpJimp = _edge_imports.getTrg();
			if (tmpJimp instanceof JavaImport) {
				JavaImport jimp = (JavaImport) tmpJimp;
				if (cu.getImports().contains(jimp)) {
					_result.add(new Object[] { cu, jimp, _edge_imports });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			KeyDerivationAlgorithmImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cu, jimp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			KeyDerivationAlgorithmImportToImport _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_KeyDerivationAlgorithmImportToImport_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_1_prepare_blackB(
			KeyDerivationAlgorithmImportToImport _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("imp");
		EObject _localVariable_1 = targetMatch.getObject("cu");
		EObject _localVariable_2 = sourceMatch.getObject("alg");
		EObject _localVariable_3 = targetMatch.getObject("jimp");
		EObject tmpImp = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpAlg = _localVariable_2;
		EObject tmpJimp = _localVariable_3;
		if (tmpImp instanceof Import) {
			Import imp = (Import) tmpImp;
			if (tmpCu instanceof JavaCompilationUnit) {
				JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
				if (tmpAlg instanceof KeyDerivationAlgorithm) {
					KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) tmpAlg;
					if (tmpJimp instanceof JavaImport) {
						JavaImport jimp = (JavaImport) tmpJimp;
						return new Object[] { imp, cu, alg, jimp, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_blackBBBBBB(
			Import imp, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { imp, cu, alg, jimp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_binding = pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_binding != null) {
			Import imp = (Import) result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_binding[0];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_binding[1];
			KeyDerivationAlgorithm alg = (KeyDerivationAlgorithm) result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_binding[2];
			JavaImport jimp = (JavaImport) result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_black = pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_blackBBBBBB(
					imp, cu, alg, jimp, sourceMatch, targetMatch);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { imp, cu, alg, jimp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_bindingFBBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, Import imp, JavaCompilationUnit cu, KeyDerivationAlgorithm alg,
			JavaImport jimp, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(imp, cu, alg, jimp, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, imp, cu, alg, jimp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, Import imp, JavaCompilationUnit cu, KeyDerivationAlgorithm alg,
			JavaImport jimp, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_binding = pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_bindingFBBBBBBB(
				_this, imp, cu, alg, jimp, sourceMatch, targetMatch);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_black = pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, imp, cu, alg, jimp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_24_5_matchcorrcontext_blackFBBBB(
			JavaCompilationUnit cu, KeyDerivationAlgorithm alg, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (KeyDerivationAlgorithmToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil
					.getOppositeReferenceTyped(alg, KeyDerivationAlgorithmToJcu.class, "source")) {
				if (cu.equals(ac.getTarget())) {
					_result.add(new Object[] { ac, cu, alg, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_5_matchcorrcontext_greenBBBF(
			KeyDerivationAlgorithmToJcu ac, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "KeyDerivationAlgorithmImportToImport";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ac);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ac, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_6_createcorrespondence_blackBBBBB(
			Import imp, JavaCompilationUnit cu, KeyDerivationAlgorithm alg, JavaImport jimp, CCMatch ccMatch) {
		return new Object[] { imp, cu, alg, jimp, ccMatch };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_6_createcorrespondence_greenBFBB(
			Import imp, JavaImport jimp, CCMatch ccMatch) {
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		i2j.setSource(imp);
		i2j.setTarget(jimp);
		ccMatch.getCreateCorr().add(i2j);
		return new Object[] { imp, i2j, jimp, ccMatch };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "KeyDerivationAlgorithmImportToImport";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_KeyDerivationAlgorithmImportToImport_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_27_1_matchtggpattern_blackBB(Import imp,
			KeyDerivationAlgorithm alg) {
		if (alg.getImports().contains(imp)) {
			return new Object[] { imp, alg };
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_28_1_matchtggpattern_blackBB(
			JavaCompilationUnit cu, JavaImport jimp) {
		if (cu.getImports().contains(jimp)) {
			return new Object[] { cu, jimp };
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_1_createresult_blackB(
			KeyDerivationAlgorithmImportToImport _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, KeyDerivationAlgorithmToJcu ac) {
		if (ruleResult.getCorrObjects().contains(ac)) {
			return new Object[] { ruleResult, ac };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, KeyDerivationAlgorithm alg) {
		if (ruleResult.getSourceObjects().contains(alg)) {
			return new Object[] { ruleResult, alg };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, JavaCompilationUnit cu) {
		if (ruleResult.getTargetObjects().contains(cu)) {
			return new Object[] { ruleResult, cu };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList acList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpAc : acList.getEntryObjects()) {
				if (tmpAc instanceof KeyDerivationAlgorithmToJcu) {
					KeyDerivationAlgorithmToJcu ac = (KeyDerivationAlgorithmToJcu) tmpAc;
					KeyDerivationAlgorithm alg = ac.getSource();
					if (alg != null) {
						JavaCompilationUnit cu = ac.getTarget();
						if (cu != null) {
							if (pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_black_nac_0BB(
									ruleResult, ac) == null) {
								if (pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, alg) == null) {
									if (pattern_KeyDerivationAlgorithmImportToImport_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, cu) == null) {
										_result.add(
												new Object[] { acList, ac, alg, cu, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_bindingFBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg,
			ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ac, cu, alg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_bindingAndBlackFBBBBBB(
			KeyDerivationAlgorithmImportToImport _this, IsApplicableMatch isApplicableMatch,
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg,
			ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_binding = pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ac, cu, alg, ruleResult);
		if (result_pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_binding[0];

			Object[] result_pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_black = pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_KeyDerivationAlgorithmImportToImport_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_KeyDerivationAlgorithmImportToImport_29_4_checkCSP_expressionFBB(
			KeyDerivationAlgorithmImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_5_checknacs_blackBBB(
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg) {
		return new Object[] { ac, cu, alg };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_6_perform_blackBBBB(
			KeyDerivationAlgorithmToJcu ac, JavaCompilationUnit cu, KeyDerivationAlgorithm alg,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ac, cu, alg, ruleResult };
	}

	public static final Object[] pattern_KeyDerivationAlgorithmImportToImport_29_6_perform_greenFFBBFBB(
			JavaCompilationUnit cu, KeyDerivationAlgorithm alg, ModelgeneratorRuleResult ruleResult, CSP csp) {
		Import imp = CryptoAPIConfigFactory.eINSTANCE.createImport();
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		JavaImport jimp = SimpleJavaFactory.eINSTANCE.createJavaImport();
		Object _localVariable_0 = csp.getValue("imp", "value");
		Object _localVariable_1 = csp.getValue("jimp", "value");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		alg.getImports().add(imp);
		ruleResult.getSourceObjects().add(imp);
		i2j.setSource(imp);
		ruleResult.getCorrObjects().add(i2j);
		cu.getImports().add(jimp);
		i2j.setTarget(jimp);
		ruleResult.getTargetObjects().add(jimp);
		String imp_value_prime = (String) _localVariable_0;
		String jimp_value_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		imp.setValue(imp_value_prime);
		jimp.setValue(jimp_value_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { imp, i2j, cu, alg, jimp, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_KeyDerivationAlgorithmImportToImport_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //KeyDerivationAlgorithmImportToImportImpl
