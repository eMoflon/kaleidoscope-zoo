/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoAPIConfig.CryptoAPIConfigFactory;
import CryptoAPIConfig.Import;
import CryptoAPIConfig.SymmetricBlockCipher;

import CryptoConfigToJava.CryptoConfigToJavaFactory;
import CryptoConfigToJava.ImportToImport;

import CryptoConfigToJava.Rules.RulesPackage;
import CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport;

import CryptoConfigToJava.SymmetricBlockCipherToJcu;

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
 * An implementation of the model object '<em><b>Symmetric Block Cipher Import To Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SymmetricBlockCipherImportToImportImpl extends AbstractRuleImpl
		implements SymmetricBlockCipherImportToImport {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymmetricBlockCipherImportToImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSymmetricBlockCipherImportToImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SymmetricBlockCipher alg, Import imp) {

		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_0_1_initialbindings_blackBBBB(this, match, alg, imp);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[alg] = " + alg + ", " + "[imp] = " + imp + ".");
		}

		Object[] result2_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, alg, imp);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[alg] = " + alg + ", " + "[imp] = " + imp + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_4_collectelementstobetranslated_blackBBB(match, alg,
							imp);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[alg] = " + alg + ", " + "[imp] = " + imp + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_4_collectelementstobetranslated_greenBBBF(match, alg,
							imp);
			//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_blackBBB(match, alg, imp);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[alg] = " + alg + ", " + "[imp] = " + imp + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_greenBB(match, alg);

			// 
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_6_registerobjectstomatch_expressionBBBB(this, match,
							alg, imp);
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_0_7_expressionF();
		} else {
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result1_bindingAndBlack[0];
		JavaCompilationUnit cu = (JavaCompilationUnit) result1_bindingAndBlack[1];
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result1_bindingAndBlack[2];
		Import imp = (Import) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_greenFBFBB(cu, imp, csp);
		JavaImport jimp = (JavaImport) result1_green[0];
		ImportToImport i2j = (ImportToImport) result1_green[2];

		Object[] result2_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_blackBBB(jimp, i2j, imp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jimp] = " + jimp + ", "
					+ "[i2j] = " + i2j + ", " + "[imp] = " + imp + ".");
		}
		Object[] result2_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_greenFBBB(jimp, i2j, imp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jimp, ac,
						cu, i2j, alg, imp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jimp] = " + jimp + ", " + "[ac] = " + ac + ", " + "[cu] = " + cu + ", " + "[i2j] = "
					+ i2j + ", " + "[alg] = " + alg + ", " + "[imp] = " + imp + ".");
		}
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, jimp,
						cu, i2j, alg, imp);
		//nothing EMoflonEdge i2j__jimp____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge i2j__imp____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						jimp, ac, cu, i2j, alg, imp);
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_binding[0];
		Import imp = (Import) result2_binding[1];
		for (Object[] result2_black : SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_2_2_corematch_blackFFBBB(alg, imp, match)) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result2_black[0];
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[1];
			// ForEach 
			for (Object[] result3_black : SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_blackBBBB(ac, cu, alg, imp)) {
				Object[] result3_green = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_greenBBBBFFFF(ac, cu, alg, imp);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge ac__cu____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge ac__alg____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, ac, cu, alg, imp);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ac] = " + ac + ", " + "[cu] = "
							+ cu + ", " + "[alg] = " + alg + ", " + "[imp] = " + imp + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_2_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SymmetricBlockCipher alg, Import imp) {
		match.registerObject("alg", alg);
		match.registerObject("imp", imp);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SymmetricBlockCipher alg, Import imp) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp) {// Create CSP
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
		isApplicableMatch.registerObject("ac", ac);
		isApplicableMatch.registerObject("cu", cu);
		isApplicableMatch.registerObject("alg", alg);
		isApplicableMatch.registerObject("imp", imp);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject jimp, EObject ac, EObject cu, EObject i2j,
			EObject alg, EObject imp) {
		ruleresult.registerObject("jimp", jimp);
		ruleresult.registerObject("ac", ac);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("i2j", i2j);
		ruleresult.registerObject("alg", alg);
		ruleresult.registerObject("imp", imp);

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
	public boolean isAppropriate_BWD(Match match, JavaImport jimp, JavaCompilationUnit cu) {

		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_10_1_initialbindings_blackBBBB(this, match, jimp, cu);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jimp] = " + jimp + ", " + "[cu] = " + cu + ".");
		}

		Object[] result2_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, jimp, cu);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[jimp] = " + jimp + ", " + "[cu] = " + cu + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_4_collectelementstobetranslated_blackBBB(match, jimp,
							cu);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jimp] = " + jimp + ", " + "[cu] = " + cu + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_4_collectelementstobetranslated_greenBBBF(match,
							jimp, cu);
			//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_blackBBB(match, jimp, cu);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[jimp] = " + jimp + ", " + "[cu] = " + cu + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_greenBB(match, cu);

			// 
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_6_registerobjectstomatch_expressionBBBB(this, match,
							jimp, cu);
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_10_7_expressionF();
		} else {
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_bindingAndBlackFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaImport jimp = (JavaImport) result1_bindingAndBlack[0];
		SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result1_bindingAndBlack[1];
		JavaCompilationUnit cu = (JavaCompilationUnit) result1_bindingAndBlack[2];
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_greenBFBFB(jimp, alg, csp);
		ImportToImport i2j = (ImportToImport) result1_green[1];
		Import imp = (Import) result1_green[3];

		Object[] result2_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_blackBBB(jimp, i2j, imp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jimp] = " + jimp + ", "
					+ "[i2j] = " + i2j + ", " + "[imp] = " + imp + ".");
		}
		Object[] result2_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_greenFBBB(jimp, i2j, imp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, jimp, ac,
						cu, i2j, alg, imp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[jimp] = " + jimp + ", " + "[ac] = " + ac + ", " + "[cu] = " + cu + ", " + "[i2j] = "
					+ i2j + ", " + "[alg] = " + alg + ", " + "[imp] = " + imp + ".");
		}
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, jimp,
						cu, i2j, alg, imp);
		//nothing EMoflonEdge i2j__jimp____target = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge i2j__imp____source = (EMoflonEdge) result3_green[9];

		// 
		// 
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						jimp, ac, cu, i2j, alg, imp);
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_12_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		JavaImport jimp = (JavaImport) result2_binding[0];
		JavaCompilationUnit cu = (JavaCompilationUnit) result2_binding[1];
		for (Object[] result2_black : SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_12_2_corematch_blackBFBFB(jimp, cu, match)) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result2_black[1];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_black[3];
			// ForEach 
			for (Object[] result3_black : SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_blackBBBB(jimp, ac, cu, alg)) {
				Object[] result3_green = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_greenBBBBFFFF(jimp, ac, cu, alg);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge ac__cu____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge ac__alg____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, jimp, ac, cu, alg);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[jimp] = " + jimp + ", "
							+ "[ac] = " + ac + ", " + "[cu] = " + cu + ", " + "[alg] = " + alg + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_12_6_addmatchtoruleresult_greenBB(ruleresult,
									isApplicableMatch);

				} else {
				}

			}

		}
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, JavaImport jimp, JavaCompilationUnit cu) {
		match.registerObject("jimp", jimp);
		match.registerObject("cu", cu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, JavaImport jimp, JavaCompilationUnit cu) {// Create CSP
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaImport jimp,
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg) {// Create CSP
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
		isApplicableMatch.registerObject("jimp", jimp);
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
	public boolean isApplicable_checkCsp_BWD(CSP csp) {
		return csp.check();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject jimp, EObject ac, EObject cu, EObject i2j,
			EObject alg, EObject imp) {
		ruleresult.registerObject("jimp", jimp);
		ruleresult.registerObject("ac", ac);
		ruleresult.registerObject("cu", cu);
		ruleresult.registerObject("i2j", i2j);
		ruleresult.registerObject("alg", alg);
		ruleresult.registerObject("imp", imp);

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
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_imports) {

		Object[] result1_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_20_2_testcorematchandDECs_blackFFB(_edge_imports)) {
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_black[0];
			Import imp = (Import) result2_black[1];
			Object[] result2_green = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, alg, imp)) {
				// 
				if (SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_20_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_12(EMoflonEdge _edge_imports) {

		Object[] result1_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_21_2_testcorematchandDECs_blackFFB(_edge_imports)) {
			JavaImport jimp = (JavaImport) result2_black[0];
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[1];
			Object[] result2_green = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, jimp, cu)) {
				// 
				if (SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_21_5_Addmatchtoruleresult_greenBBBB(match,
									__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SymmetricBlockCipherImportToImport");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp", true, csp);
		var_imp_value.setValue(__helper.getValue("imp", "value"));
		var_imp_value.setType("String");

		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp", true, csp);
		var_jimp_value.setValue(__helper.getValue("jimp", "value"));
		var_jimp_value.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SymmetricBlockCipherImportToImport");
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
		ruleResult.setRule("SymmetricBlockCipherImportToImport");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		Variable var_imp_value = CSPFactoryHelper.eINSTANCE.createVariable("imp", true, csp);
		var_imp_value.setValue(__helper.getValue("imp", "value"));
		var_imp_value.setType("String");

		Variable var_jimp_value = CSPFactoryHelper.eINSTANCE.createVariable("jimp", true, csp);
		var_jimp_value.setValue(__helper.getValue("jimp", "value"));
		var_jimp_value.setType("String");

		Eq eq0 = new Eq();
		csp.getConstraints().add(eq0);

		eq0.setRuleName("SymmetricBlockCipherImportToImport");
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

		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		JavaImport jimp = (JavaImport) result2_bindingAndBlack[0];
		JavaCompilationUnit cu = (JavaCompilationUnit) result2_bindingAndBlack[1];
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_bindingAndBlack[2];
		Import imp = (Import) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, jimp, cu, alg,
						imp, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[jimp] = " + jimp + ", " + "[cu] = " + cu + ", " + "[alg] = " + alg + ", " + "[imp] = " + imp
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_24_5_matchcorrcontext_blackFBBBB(cu, alg, sourceMatch,
							targetMatch)) {
				SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result5_black[0];
				Object[] result5_green = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_5_matchcorrcontext_greenBBBF(ac, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_6_createcorrespondence_blackBBBBB(jimp, cu, alg,
								imp, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[jimp] = " + jimp + ", "
							+ "[cu] = " + cu + ", " + "[alg] = " + alg + ", " + "[imp] = " + imp + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_6_createcorrespondence_greenBFBB(jimp, imp,
								ccMatch);
				//nothing ImportToImport i2j = (ImportToImport) result6_green[1];

				Object[] result7_black = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(JavaImport jimp, JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp,
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
	public boolean checkDEC_FWD(SymmetricBlockCipher alg, Import imp) {// 
		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_27_1_matchtggpattern_blackBB(alg, imp);
		if (result1_black != null) {
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_27_2_expressionF();
		} else {
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(JavaImport jimp, JavaCompilationUnit cu) {// 
		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_28_1_matchtggpattern_blackBB(jimp, cu);
		if (result1_black != null) {
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_28_2_expressionF();
		} else {
			return SymmetricBlockCipherImportToImportImpl.pattern_SymmetricBlockCipherImportToImport_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer,
			SymmetricBlockCipherToJcu acParameter) {

		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// ForEach 
		for (Object[] result2_black : SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_blackFFFFBB(ruleEntryContainer,
						ruleResult)) {
			//nothing RuleEntryList acList = (RuleEntryList) result2_black[0];
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result2_black[1];
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[2];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_black[3];

			Object[] result3_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_bindingAndBlackFBBBBBB(this,
							isApplicableMatch, ac, cu, alg, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ac] = " + ac + ", " + "[cu] = " + cu
						+ ", " + "[alg] = " + alg + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_29_5_checknacs_blackBBB(ac, cu, alg);
				if (result5_black != null) {

					Object[] result6_black = SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_29_6_perform_blackBBBB(ac, cu, alg, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[ac] = " + ac + ", " + "[cu] = " + cu
										+ ", " + "[alg] = " + alg + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_29_6_perform_greenFBFBFBB(cu, alg, ruleResult,
									csp);
					//nothing JavaImport jimp = (JavaImport) result6_green[0];
					//nothing ImportToImport i2j = (ImportToImport) result6_green[2];
					//nothing Import imp = (Import) result6_green[4];

				} else {
				}

			} else {
			}

		}
		return SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_29_7_expressionFB(ruleResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			JavaCompilationUnit cu, SymmetricBlockCipher alg, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD__MATCH_SYMMETRICBLOCKCIPHER_IMPORT:
			return isAppropriate_FWD((Match) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(Import) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SYMMETRICBLOCKCIPHER_IMPORT:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(Import) arguments.get(2));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SYMMETRICBLOCKCIPHER_IMPORT:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(Import) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHERTOJCU_JAVACOMPILATIONUNIT_SYMMETRICBLOCKCIPHER_IMPORT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SymmetricBlockCipherToJcu) arguments.get(1), (JavaCompilationUnit) arguments.get(2),
					(SymmetricBlockCipher) arguments.get(3), (Import) arguments.get(4));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD__MATCH_JAVAIMPORT_JAVACOMPILATIONUNIT:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaImport) arguments.get(1),
					(JavaCompilationUnit) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAIMPORT_JAVACOMPILATIONUNIT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaImport) arguments.get(1),
					(JavaCompilationUnit) arguments.get(2));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAIMPORT_JAVACOMPILATIONUNIT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaImport) arguments.get(1),
					(JavaCompilationUnit) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAIMPORT_SYMMETRICBLOCKCIPHERTOJCU_JAVACOMPILATIONUNIT_SYMMETRICBLOCKCIPHER:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (JavaImport) arguments.get(1),
					(SymmetricBlockCipherToJcu) arguments.get(2), (JavaCompilationUnit) arguments.get(3),
					(SymmetricBlockCipher) arguments.get(4));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_9__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_9((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_12__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_12((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_CC__JAVAIMPORT_JAVACOMPILATIONUNIT_SYMMETRICBLOCKCIPHER_IMPORT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((JavaImport) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(SymmetricBlockCipher) arguments.get(2), (Import) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_DEC_FWD__SYMMETRICBLOCKCIPHER_IMPORT:
			return checkDEC_FWD((SymmetricBlockCipher) arguments.get(0), (Import) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_DEC_BWD__JAVAIMPORT_JAVACOMPILATIONUNIT:
			return checkDEC_BWD((JavaImport) arguments.get(0), (JavaCompilationUnit) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL__RULEENTRYCONTAINER_SYMMETRICBLOCKCIPHERTOJCU:
			return generateModel((RuleEntryContainer) arguments.get(0), (SymmetricBlockCipherToJcu) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHERTOJCU_JAVACOMPILATIONUNIT_SYMMETRICBLOCKCIPHER_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SymmetricBlockCipherToJcu) arguments.get(1), (JavaCompilationUnit) arguments.get(2),
					(SymmetricBlockCipher) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_1_initialbindings_blackBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, SymmetricBlockCipher alg, Import imp) {
		return new Object[] { _this, match, alg, imp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, SymmetricBlockCipher alg, Import imp) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, alg, imp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, alg, imp };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingAndBlackFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, SymmetricBlockCipher alg, Import imp) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_binding = pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingFBBBB(
				_this, match, alg, imp);
		if (result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_black = pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, alg, imp };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_0_3_CheckCSP_expressionFBB(
			SymmetricBlockCipherImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_4_collectelementstobetranslated_blackBBB(
			Match match, SymmetricBlockCipher alg, Import imp) {
		return new Object[] { match, alg, imp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_4_collectelementstobetranslated_greenBBBF(
			Match match, SymmetricBlockCipher alg, Import imp) {
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(imp);
		String alg__imp____imports_name_prime = "imports";
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		match.getToBeTranslatedEdges().add(alg__imp____imports);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		return new Object[] { match, alg, imp, alg__imp____imports };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_blackBBB(
			Match match, SymmetricBlockCipher alg, Import imp) {
		return new Object[] { match, alg, imp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_greenBB(
			Match match, SymmetricBlockCipher alg) {
		match.getContextNodes().add(alg);
		return new Object[] { match, alg };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_0_6_registerobjectstomatch_expressionBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, SymmetricBlockCipher alg, Import imp) {
		_this.registerObjectsToMatch_FWD(match, alg, imp);

	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("ac");
		EObject _localVariable_1 = isApplicableMatch.getObject("cu");
		EObject _localVariable_2 = isApplicableMatch.getObject("alg");
		EObject _localVariable_3 = isApplicableMatch.getObject("imp");
		EObject tmpAc = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpAlg = _localVariable_2;
		EObject tmpImp = _localVariable_3;
		if (tmpAc instanceof SymmetricBlockCipherToJcu) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) tmpAc;
			if (tmpCu instanceof JavaCompilationUnit) {
				JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
				if (tmpAlg instanceof SymmetricBlockCipher) {
					SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
					if (tmpImp instanceof Import) {
						Import imp = (Import) tmpImp;
						return new Object[] { ac, cu, alg, imp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_blackBBBBFBB(
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp,
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { ac, cu, alg, imp, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_bindingAndBlackFFFFFBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding = pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding != null) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[0];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[1];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[2];
			Import imp = (Import) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[3];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_black = pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_blackBBBBFBB(
					ac, cu, alg, imp, _this, isApplicableMatch);
			if (result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_black[4];

				return new Object[] { ac, cu, alg, imp, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_greenFBFBB(
			JavaCompilationUnit cu, Import imp, CSP csp) {
		JavaImport jimp = SimpleJavaFactory.eINSTANCE.createJavaImport();
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		Object _localVariable_0 = csp.getValue("jimp", "value");
		cu.getImports().add(jimp);
		i2j.setTarget(jimp);
		i2j.setSource(imp);
		String jimp_value_prime = (String) _localVariable_0;
		jimp.setValue(jimp_value_prime);
		return new Object[] { jimp, cu, i2j, imp, csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_blackBBB(
			JavaImport jimp, ImportToImport i2j, Import imp) {
		return new Object[] { jimp, i2j, imp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_greenFBBB(
			JavaImport jimp, ImportToImport i2j, Import imp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(jimp);
		ruleresult.getCreatedLinkElements().add(i2j);
		ruleresult.getTranslatedElements().add(imp);
		return new Object[] { ruleresult, jimp, i2j, imp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jimp, EObject ac, EObject cu, EObject i2j, EObject alg, EObject imp) {
		if (!ac.equals(jimp)) {
			if (!ac.equals(cu)) {
				if (!ac.equals(i2j)) {
					if (!ac.equals(alg)) {
						if (!ac.equals(imp)) {
							if (!cu.equals(jimp)) {
								if (!cu.equals(i2j)) {
									if (!cu.equals(imp)) {
										if (!i2j.equals(jimp)) {
											if (!i2j.equals(imp)) {
												if (!alg.equals(jimp)) {
													if (!alg.equals(cu)) {
														if (!alg.equals(i2j)) {
															if (!alg.equals(imp)) {
																if (!imp.equals(jimp)) {
																	return new Object[] { ruleresult, jimp, ac, cu, i2j,
																			alg, imp };
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jimp, EObject cu, EObject i2j, EObject alg, EObject imp) {
		EMoflonEdge i2j__jimp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__imp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SymmetricBlockCipherImportToImport";
		String i2j__jimp____target_name_prime = "target";
		String cu__jimp____imports_name_prime = "imports";
		String alg__imp____imports_name_prime = "imports";
		String i2j__imp____source_name_prime = "source";
		i2j__jimp____target.setSrc(i2j);
		i2j__jimp____target.setTrg(jimp);
		ruleresult.getCreatedEdges().add(i2j__jimp____target);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		ruleresult.getCreatedEdges().add(cu__jimp____imports);
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		ruleresult.getTranslatedEdges().add(alg__imp____imports);
		i2j__imp____source.setSrc(i2j);
		i2j__imp____source.setTrg(imp);
		ruleresult.getCreatedEdges().add(i2j__imp____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i2j__jimp____target.setName(i2j__jimp____target_name_prime);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		i2j__imp____source.setName(i2j__imp____source_name_prime);
		return new Object[] { ruleresult, jimp, cu, i2j, alg, imp, i2j__jimp____target, cu__jimp____imports,
				alg__imp____imports, i2j__imp____source };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_1_5_registerobjects_expressionBBBBBBBB(
			SymmetricBlockCipherImportToImport _this, PerformRuleResult ruleresult, EObject jimp, EObject ac,
			EObject cu, EObject i2j, EObject alg, EObject imp) {
		_this.registerObjects_FWD(ruleresult, jimp, ac, cu, i2j, alg, imp);

	}

	public static final PerformRuleResult pattern_SymmetricBlockCipherImportToImport_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_bindingFB(
			SymmetricBlockCipherImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_blackFBB(
			EClass eClass, SymmetricBlockCipherImportToImport _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_bindingAndBlackFFB(
			SymmetricBlockCipherImportToImport _this) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_binding = pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_black = pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SymmetricBlockCipherImportToImport";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("alg");
		EObject _localVariable_1 = match.getObject("imp");
		EObject tmpAlg = _localVariable_0;
		EObject tmpImp = _localVariable_1;
		if (tmpAlg instanceof SymmetricBlockCipher) {
			SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
			if (tmpImp instanceof Import) {
				Import imp = (Import) tmpImp;
				return new Object[] { alg, imp, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_2_2_corematch_blackFFBBB(
			SymmetricBlockCipher alg, Import imp, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SymmetricBlockCipherToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(alg,
				SymmetricBlockCipherToJcu.class, "source")) {
			JavaCompilationUnit cu = ac.getTarget();
			if (cu != null) {
				_result.add(new Object[] { ac, cu, alg, imp, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_blackBBBB(
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (cu.equals(ac.getTarget())) {
			if (alg.equals(ac.getSource())) {
				if (alg.getImports().contains(imp)) {
					_result.add(new Object[] { ac, cu, alg, imp });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_greenBBBBFFFF(
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ac__cu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__alg____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ac__cu____target_name_prime = "target";
		String ac__alg____source_name_prime = "source";
		String alg__imp____imports_name_prime = "imports";
		isApplicableMatch.getAllContextElements().add(ac);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(alg);
		isApplicableMatch.getAllContextElements().add(imp);
		ac__cu____target.setSrc(ac);
		ac__cu____target.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(ac__cu____target);
		ac__alg____source.setSrc(ac);
		ac__alg____source.setTrg(alg);
		isApplicableMatch.getAllContextElements().add(ac__alg____source);
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		isApplicableMatch.getAllContextElements().add(alg__imp____imports);
		ac__cu____target.setName(ac__cu____target_name_prime);
		ac__alg____source.setName(ac__alg____source_name_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		return new Object[] { ac, cu, alg, imp, isApplicableMatch, ac__cu____target, ac__alg____source,
				alg__imp____imports };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, ac, cu, alg, imp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, imp };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingAndBlackFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_binding = pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ac, cu, alg, imp);
		if (result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_black = pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, imp };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_2_5_checkCSP_expressionFBB(
			SymmetricBlockCipherImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SymmetricBlockCipherImportToImport";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SymmetricBlockCipherImportToImport_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_1_initialbindings_blackBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaImport jimp, JavaCompilationUnit cu) {
		return new Object[] { _this, match, jimp, cu };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaImport jimp, JavaCompilationUnit cu) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, jimp, cu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, jimp, cu };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingAndBlackFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaImport jimp, JavaCompilationUnit cu) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_binding = pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingFBBBB(
				_this, match, jimp, cu);
		if (result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_black = pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, jimp, cu };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_10_3_CheckCSP_expressionFBB(
			SymmetricBlockCipherImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_4_collectelementstobetranslated_blackBBB(
			Match match, JavaImport jimp, JavaCompilationUnit cu) {
		return new Object[] { match, jimp, cu };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_4_collectelementstobetranslated_greenBBBF(
			Match match, JavaImport jimp, JavaCompilationUnit cu) {
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(jimp);
		String cu__jimp____imports_name_prime = "imports";
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		match.getToBeTranslatedEdges().add(cu__jimp____imports);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		return new Object[] { match, jimp, cu, cu__jimp____imports };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_blackBBB(
			Match match, JavaImport jimp, JavaCompilationUnit cu) {
		return new Object[] { match, jimp, cu };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_greenBB(
			Match match, JavaCompilationUnit cu) {
		match.getContextNodes().add(cu);
		return new Object[] { match, cu };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_10_6_registerobjectstomatch_expressionBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaImport jimp, JavaCompilationUnit cu) {
		_this.registerObjectsToMatch_BWD(match, jimp, cu);

	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_bindingFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("jimp");
		EObject _localVariable_1 = isApplicableMatch.getObject("ac");
		EObject _localVariable_2 = isApplicableMatch.getObject("cu");
		EObject _localVariable_3 = isApplicableMatch.getObject("alg");
		EObject tmpJimp = _localVariable_0;
		EObject tmpAc = _localVariable_1;
		EObject tmpCu = _localVariable_2;
		EObject tmpAlg = _localVariable_3;
		if (tmpJimp instanceof JavaImport) {
			JavaImport jimp = (JavaImport) tmpJimp;
			if (tmpAc instanceof SymmetricBlockCipherToJcu) {
				SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) tmpAc;
				if (tmpCu instanceof JavaCompilationUnit) {
					JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
					if (tmpAlg instanceof SymmetricBlockCipher) {
						SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
						return new Object[] { jimp, ac, cu, alg, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_blackBBBBFBB(
			JavaImport jimp, SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg,
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { jimp, ac, cu, alg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_bindingAndBlackFFFFFBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding = pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding != null) {
			JavaImport jimp = (JavaImport) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[0];
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[1];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[2];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[3];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_black = pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_blackBBBBFBB(
					jimp, ac, cu, alg, _this, isApplicableMatch);
			if (result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_black[4];

				return new Object[] { jimp, ac, cu, alg, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_greenBFBFB(
			JavaImport jimp, SymmetricBlockCipher alg, CSP csp) {
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		Import imp = CryptoAPIConfigFactory.eINSTANCE.createImport();
		Object _localVariable_0 = csp.getValue("imp", "value");
		i2j.setTarget(jimp);
		alg.getImports().add(imp);
		i2j.setSource(imp);
		String imp_value_prime = (String) _localVariable_0;
		imp.setValue(imp_value_prime);
		return new Object[] { jimp, i2j, alg, imp, csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_blackBBB(
			JavaImport jimp, ImportToImport i2j, Import imp) {
		return new Object[] { jimp, i2j, imp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_greenFBBB(
			JavaImport jimp, ImportToImport i2j, Import imp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(jimp);
		ruleresult.getCreatedLinkElements().add(i2j);
		ruleresult.getCreatedElements().add(imp);
		return new Object[] { ruleresult, jimp, i2j, imp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject jimp, EObject ac, EObject cu, EObject i2j, EObject alg, EObject imp) {
		if (!ac.equals(jimp)) {
			if (!ac.equals(cu)) {
				if (!ac.equals(i2j)) {
					if (!ac.equals(alg)) {
						if (!ac.equals(imp)) {
							if (!cu.equals(jimp)) {
								if (!cu.equals(i2j)) {
									if (!cu.equals(imp)) {
										if (!i2j.equals(jimp)) {
											if (!i2j.equals(imp)) {
												if (!alg.equals(jimp)) {
													if (!alg.equals(cu)) {
														if (!alg.equals(i2j)) {
															if (!alg.equals(imp)) {
																if (!imp.equals(jimp)) {
																	return new Object[] { ruleresult, jimp, ac, cu, i2j,
																			alg, imp };
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_3_bookkeepingforedges_greenBBBBBBFFFF(
			PerformRuleResult ruleresult, EObject jimp, EObject cu, EObject i2j, EObject alg, EObject imp) {
		EMoflonEdge i2j__jimp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__imp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SymmetricBlockCipherImportToImport";
		String i2j__jimp____target_name_prime = "target";
		String cu__jimp____imports_name_prime = "imports";
		String alg__imp____imports_name_prime = "imports";
		String i2j__imp____source_name_prime = "source";
		i2j__jimp____target.setSrc(i2j);
		i2j__jimp____target.setTrg(jimp);
		ruleresult.getCreatedEdges().add(i2j__jimp____target);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		ruleresult.getTranslatedEdges().add(cu__jimp____imports);
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		ruleresult.getCreatedEdges().add(alg__imp____imports);
		i2j__imp____source.setSrc(i2j);
		i2j__imp____source.setTrg(imp);
		ruleresult.getCreatedEdges().add(i2j__imp____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		i2j__jimp____target.setName(i2j__jimp____target_name_prime);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		i2j__imp____source.setName(i2j__imp____source_name_prime);
		return new Object[] { ruleresult, jimp, cu, i2j, alg, imp, i2j__jimp____target, cu__jimp____imports,
				alg__imp____imports, i2j__imp____source };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_11_5_registerobjects_expressionBBBBBBBB(
			SymmetricBlockCipherImportToImport _this, PerformRuleResult ruleresult, EObject jimp, EObject ac,
			EObject cu, EObject i2j, EObject alg, EObject imp) {
		_this.registerObjects_BWD(ruleresult, jimp, ac, cu, i2j, alg, imp);

	}

	public static final PerformRuleResult pattern_SymmetricBlockCipherImportToImport_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_bindingFB(
			SymmetricBlockCipherImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_blackFBB(
			EClass eClass, SymmetricBlockCipherImportToImport _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_bindingAndBlackFFB(
			SymmetricBlockCipherImportToImport _this) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_binding = pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_black = pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SymmetricBlockCipherImportToImport";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("jimp");
		EObject _localVariable_1 = match.getObject("cu");
		EObject tmpJimp = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		if (tmpJimp instanceof JavaImport) {
			JavaImport jimp = (JavaImport) tmpJimp;
			if (tmpCu instanceof JavaCompilationUnit) {
				JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
				return new Object[] { jimp, cu, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_12_2_corematch_blackBFBFB(
			JavaImport jimp, JavaCompilationUnit cu, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SymmetricBlockCipherToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
				SymmetricBlockCipherToJcu.class, "target")) {
			SymmetricBlockCipher alg = ac.getSource();
			if (alg != null) {
				_result.add(new Object[] { jimp, ac, cu, alg, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_blackBBBB(
			JavaImport jimp, SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (cu.getImports().contains(jimp)) {
			if (cu.equals(ac.getTarget())) {
				if (alg.equals(ac.getSource())) {
					_result.add(new Object[] { jimp, ac, cu, alg });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_greenBBBBFFFF(
			JavaImport jimp, SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__cu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__alg____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String cu__jimp____imports_name_prime = "imports";
		String ac__cu____target_name_prime = "target";
		String ac__alg____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(jimp);
		isApplicableMatch.getAllContextElements().add(ac);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(alg);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		isApplicableMatch.getAllContextElements().add(cu__jimp____imports);
		ac__cu____target.setSrc(ac);
		ac__cu____target.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(ac__cu____target);
		ac__alg____source.setSrc(ac);
		ac__alg____source.setTrg(alg);
		isApplicableMatch.getAllContextElements().add(ac__alg____source);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		ac__cu____target.setName(ac__cu____target_name_prime);
		ac__alg____source.setName(ac__alg____source_name_prime);
		return new Object[] { jimp, ac, cu, alg, isApplicableMatch, cu__jimp____imports, ac__cu____target,
				ac__alg____source };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, JavaImport jimp,
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, jimp, ac, cu, alg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, jimp, ac, cu, alg };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingAndBlackFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, JavaImport jimp,
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_binding = pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, jimp, ac, cu, alg);
		if (result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_black = pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, jimp, ac, cu, alg };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_12_5_checkCSP_expressionFBB(
			SymmetricBlockCipherImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SymmetricBlockCipherImportToImport";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SymmetricBlockCipherImportToImport_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_bindingFB(
			SymmetricBlockCipherImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_blackFBBF(
			EClass __eClass, SymmetricBlockCipherImportToImport _this) {
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SymmetricBlockCipherImportToImport _this) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_binding = pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_black = pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_imports) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpAlg = _edge_imports.getSrc();
		if (tmpAlg instanceof SymmetricBlockCipher) {
			SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
			EObject tmpImp = _edge_imports.getTrg();
			if (tmpImp instanceof Import) {
				Import imp = (Import) tmpImp;
				if (alg.getImports().contains(imp)) {
					_result.add(new Object[] { alg, imp, _edge_imports });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_20_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, SymmetricBlockCipher alg, Import imp) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, alg, imp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SymmetricBlockCipherImportToImport _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_20_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_20_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SymmetricBlockCipherImportToImport_20_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_bindingFB(
			SymmetricBlockCipherImportToImport _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_blackFBBF(
			EClass __eClass, SymmetricBlockCipherImportToImport _this) {
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SymmetricBlockCipherImportToImport _this) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_binding = pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_black = pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_21_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_imports) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpCu = _edge_imports.getSrc();
		if (tmpCu instanceof JavaCompilationUnit) {
			JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
			EObject tmpJimp = _edge_imports.getTrg();
			if (tmpJimp instanceof JavaImport) {
				JavaImport jimp = (JavaImport) tmpJimp;
				if (cu.getImports().contains(jimp)) {
					_result.add(new Object[] { jimp, cu, _edge_imports });
				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_21_2_testcorematchandDECs_greenFB(
			EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaImport jimp, JavaCompilationUnit cu) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, jimp, cu);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SymmetricBlockCipherImportToImport _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_21_5_Addmatchtoruleresult_blackBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_21_5_Addmatchtoruleresult_greenBBBB(
			Match match, EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SymmetricBlockCipherImportToImport_21_6_expressionFB(
			EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_1_prepare_blackB(
			SymmetricBlockCipherImportToImport _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_bindingFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("jimp");
		EObject _localVariable_1 = targetMatch.getObject("cu");
		EObject _localVariable_2 = sourceMatch.getObject("alg");
		EObject _localVariable_3 = sourceMatch.getObject("imp");
		EObject tmpJimp = _localVariable_0;
		EObject tmpCu = _localVariable_1;
		EObject tmpAlg = _localVariable_2;
		EObject tmpImp = _localVariable_3;
		if (tmpJimp instanceof JavaImport) {
			JavaImport jimp = (JavaImport) tmpJimp;
			if (tmpCu instanceof JavaCompilationUnit) {
				JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
				if (tmpAlg instanceof SymmetricBlockCipher) {
					SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
					if (tmpImp instanceof Import) {
						Import imp = (Import) tmpImp;
						return new Object[] { jimp, cu, alg, imp, targetMatch, sourceMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_blackBBBBBB(
			JavaImport jimp, JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { jimp, cu, alg, imp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding = pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_bindingFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding != null) {
			JavaImport jimp = (JavaImport) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[0];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[1];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[2];
			Import imp = (Import) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_black = pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_blackBBBBBB(
					jimp, cu, alg, imp, sourceMatch, targetMatch);
			if (result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { jimp, cu, alg, imp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingFBBBBBBB(
			SymmetricBlockCipherImportToImport _this, JavaImport jimp, JavaCompilationUnit cu, SymmetricBlockCipher alg,
			Import imp, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(jimp, cu, alg, imp, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, jimp, cu, alg, imp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			SymmetricBlockCipherImportToImport _this, JavaImport jimp, JavaCompilationUnit cu, SymmetricBlockCipher alg,
			Import imp, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_binding = pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingFBBBBBBB(
				_this, jimp, cu, alg, imp, sourceMatch, targetMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_black = pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, jimp, cu, alg, imp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_24_5_matchcorrcontext_blackFBBBB(
			JavaCompilationUnit cu, SymmetricBlockCipher alg, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (SymmetricBlockCipherToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
					SymmetricBlockCipherToJcu.class, "target")) {
				if (alg.equals(ac.getSource())) {
					_result.add(new Object[] { ac, cu, alg, sourceMatch, targetMatch });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_5_matchcorrcontext_greenBBBF(
			SymmetricBlockCipherToJcu ac, Match sourceMatch, Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SymmetricBlockCipherImportToImport";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.getAllContextElements().add(ac);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { ac, sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_6_createcorrespondence_blackBBBBB(
			JavaImport jimp, JavaCompilationUnit cu, SymmetricBlockCipher alg, Import imp, CCMatch ccMatch) {
		return new Object[] { jimp, cu, alg, imp, ccMatch };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_6_createcorrespondence_greenBFBB(
			JavaImport jimp, Import imp, CCMatch ccMatch) {
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		i2j.setTarget(jimp);
		i2j.setSource(imp);
		ccMatch.getCreateCorr().add(i2j);
		return new Object[] { jimp, i2j, imp, ccMatch };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SymmetricBlockCipherImportToImport";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SymmetricBlockCipherImportToImport_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_27_1_matchtggpattern_blackBB(
			SymmetricBlockCipher alg, Import imp) {
		if (alg.getImports().contains(imp)) {
			return new Object[] { alg, imp };
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_28_1_matchtggpattern_blackBB(
			JavaImport jimp, JavaCompilationUnit cu) {
		if (cu.getImports().contains(jimp)) {
			return new Object[] { jimp, cu };
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_1_createresult_blackB(
			SymmetricBlockCipherImportToImport _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_black_nac_0BB(
			ModelgeneratorRuleResult ruleResult, SymmetricBlockCipherToJcu ac) {
		if (ruleResult.getCorrObjects().contains(ac)) {
			return new Object[] { ruleResult, ac };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_black_nac_1BB(
			ModelgeneratorRuleResult ruleResult, JavaCompilationUnit cu) {
		if (ruleResult.getTargetObjects().contains(cu)) {
			return new Object[] { ruleResult, cu };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_black_nac_2BB(
			ModelgeneratorRuleResult ruleResult, SymmetricBlockCipher alg) {
		if (ruleResult.getSourceObjects().contains(alg)) {
			return new Object[] { ruleResult, alg };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_blackFFFFBB(
			RuleEntryContainer ruleEntryContainer, ModelgeneratorRuleResult ruleResult) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (RuleEntryList acList : ruleEntryContainer.getRuleEntryList()) {
			for (EObject tmpAc : acList.getEntryObjects()) {
				if (tmpAc instanceof SymmetricBlockCipherToJcu) {
					SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) tmpAc;
					JavaCompilationUnit cu = ac.getTarget();
					if (cu != null) {
						SymmetricBlockCipher alg = ac.getSource();
						if (alg != null) {
							if (pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_black_nac_0BB(
									ruleResult, ac) == null) {
								if (pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_black_nac_1BB(
										ruleResult, cu) == null) {
									if (pattern_SymmetricBlockCipherImportToImport_29_2_isapplicablecore_black_nac_2BB(
											ruleResult, alg) == null) {
										_result.add(
												new Object[] { acList, ac, cu, alg, ruleEntryContainer, ruleResult });
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_bindingFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			JavaCompilationUnit cu, SymmetricBlockCipher alg, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ac, cu, alg, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_bindingAndBlackFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			JavaCompilationUnit cu, SymmetricBlockCipher alg, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_binding = pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ac, cu, alg, ruleResult);
		if (result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_black = pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ac, cu, alg, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricBlockCipherImportToImport_29_4_checkCSP_expressionFBB(
			SymmetricBlockCipherImportToImport _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_5_checknacs_blackBBB(
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg) {
		return new Object[] { ac, cu, alg };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_6_perform_blackBBBB(
			SymmetricBlockCipherToJcu ac, JavaCompilationUnit cu, SymmetricBlockCipher alg,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ac, cu, alg, ruleResult };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_6_perform_greenFBFBFBB(
			JavaCompilationUnit cu, SymmetricBlockCipher alg, ModelgeneratorRuleResult ruleResult, CSP csp) {
		JavaImport jimp = SimpleJavaFactory.eINSTANCE.createJavaImport();
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		Import imp = CryptoAPIConfigFactory.eINSTANCE.createImport();
		Object _localVariable_0 = csp.getValue("jimp", "value");
		Object _localVariable_1 = csp.getValue("imp", "value");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_2 = ruleResult.getIncrementedPerformCount();
		cu.getImports().add(jimp);
		ruleResult.getTargetObjects().add(jimp);
		i2j.setTarget(jimp);
		ruleResult.getCorrObjects().add(i2j);
		alg.getImports().add(imp);
		i2j.setSource(imp);
		ruleResult.getSourceObjects().add(imp);
		String jimp_value_prime = (String) _localVariable_0;
		String imp_value_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		jimp.setValue(jimp_value_prime);
		imp.setValue(imp_value_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { jimp, cu, i2j, alg, imp, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SymmetricBlockCipherImportToImport_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SymmetricBlockCipherImportToImportImpl
