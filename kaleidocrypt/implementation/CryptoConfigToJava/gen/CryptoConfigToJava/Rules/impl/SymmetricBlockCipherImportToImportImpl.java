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
	public boolean isAppropriate_FWD(Match match, Import imp, SymmetricBlockCipher alg) {

		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_0_1_initialbindings_blackBBBB(this, match, imp, alg);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
		}

		Object[] result2_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, imp, alg);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_4_collectelementstobetranslated_blackBBB(match, imp,
							alg);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_4_collectelementstobetranslated_greenBBBF(match, imp,
							alg);
			//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_blackBBB(match, imp, alg);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[imp] = " + imp + ", " + "[alg] = " + alg + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_greenBB(match, alg);

			// 
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_0_6_registerobjectstomatch_expressionBBBB(this, match,
							imp, alg);
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
		Import imp = (Import) result1_bindingAndBlack[0];
		SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result1_bindingAndBlack[1];
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result1_bindingAndBlack[2];
		JavaCompilationUnit cu = (JavaCompilationUnit) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_greenBFBFB(imp, cu, csp);
		ImportToImport i2j = (ImportToImport) result1_green[1];
		JavaImport jimp = (JavaImport) result1_green[3];

		Object[] result2_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_blackBBB(imp, i2j, jimp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[imp] = " + imp + ", "
					+ "[i2j] = " + i2j + ", " + "[jimp] = " + jimp + ".");
		}
		Object[] result2_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_greenFBBB(imp, i2j, jimp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_3_bookkeepingforedges_blackBBBBBBB(ruleresult, imp, i2j,
						ac, alg, cu, jimp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[imp] = " + imp + ", " + "[i2j] = " + i2j + ", " + "[ac] = " + ac + ", " + "[alg] = "
					+ alg + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
		}
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, imp,
						i2j, alg, cu, jimp);
		//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge i2j__imp____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge i2j__jimp____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[9];

		// 
		// 
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_1_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						imp, i2j, ac, alg, cu, jimp);
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
		Import imp = (Import) result2_binding[0];
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_binding[1];
		for (Object[] result2_black : SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_2_2_corematch_blackBFBFB(imp, alg, match)) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result2_black[1];
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[3];
			// ForEach 
			for (Object[] result3_black : SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_blackBBBB(imp, ac, alg, cu)) {
				Object[] result3_green = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_greenBBBBFFFF(imp, ac, alg, cu);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge ac__cu____target = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge ac__alg____source = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, imp, ac, alg, cu);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[imp] = " + imp + ", " + "[ac] = "
							+ ac + ", " + "[alg] = " + alg + ", " + "[cu] = " + cu + ".");
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
	public void registerObjectsToMatch_FWD(Match match, Import imp, SymmetricBlockCipher alg) {
		match.registerObject("imp", imp);
		match.registerObject("alg", alg);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, Import imp, SymmetricBlockCipher alg) {// Create CSP
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Import imp, SymmetricBlockCipherToJcu ac,
			SymmetricBlockCipher alg, JavaCompilationUnit cu) {// Create CSP
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
		isApplicableMatch.registerObject("alg", alg);
		isApplicableMatch.registerObject("cu", cu);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject alg,
			EObject cu, EObject jimp) {
		ruleresult.registerObject("imp", imp);
		ruleresult.registerObject("i2j", i2j);
		ruleresult.registerObject("ac", ac);
		ruleresult.registerObject("alg", alg);
		ruleresult.registerObject("cu", cu);
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

		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_10_1_initialbindings_blackBBBB(this, match, cu, jimp);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
		}

		Object[] result2_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingAndBlackFBBBB(this, match, cu, jimp);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_4_collectelementstobetranslated_blackBBB(match, cu,
							jimp);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_4_collectelementstobetranslated_greenBBBF(match, cu,
							jimp);
			//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_blackBBB(match, cu, jimp);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
			}
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_greenBB(match, cu);

			// 
			SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_10_6_registerobjectstomatch_expressionBBBB(this, match,
							cu, jimp);
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
		SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result1_bindingAndBlack[0];
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result1_bindingAndBlack[1];
		JavaCompilationUnit cu = (JavaCompilationUnit) result1_bindingAndBlack[2];
		JavaImport jimp = (JavaImport) result1_bindingAndBlack[3];
		CSP csp = (CSP) result1_bindingAndBlack[4];
		Object[] result1_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_greenFFBBB(alg, jimp, csp);
		Import imp = (Import) result1_green[0];
		ImportToImport i2j = (ImportToImport) result1_green[1];

		Object[] result2_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_blackBBB(imp, i2j, jimp);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[imp] = " + imp + ", "
					+ "[i2j] = " + i2j + ", " + "[jimp] = " + jimp + ".");
		}
		Object[] result2_green = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_greenFBBB(imp, i2j, jimp);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_3_bookkeepingforedges_blackBBBBBBB(ruleresult, imp, i2j,
						ac, alg, cu, jimp);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[imp] = " + imp + ", " + "[i2j] = " + i2j + ", " + "[ac] = " + ac + ", " + "[alg] = "
					+ alg + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
		}
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_3_bookkeepingforedges_greenBBBBBBFFFF(ruleresult, imp,
						i2j, alg, cu, jimp);
		//nothing EMoflonEdge alg__imp____imports = (EMoflonEdge) result3_green[6];
		//nothing EMoflonEdge i2j__imp____source = (EMoflonEdge) result3_green[7];
		//nothing EMoflonEdge i2j__jimp____target = (EMoflonEdge) result3_green[8];
		//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[9];

		// 
		// 
		SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_11_5_registerobjects_expressionBBBBBBBB(this, ruleresult,
						imp, i2j, ac, alg, cu, jimp);
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
		JavaCompilationUnit cu = (JavaCompilationUnit) result2_binding[0];
		JavaImport jimp = (JavaImport) result2_binding[1];
		for (Object[] result2_black : SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_12_2_corematch_blackFFBBB(cu, jimp, match)) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result2_black[0];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_black[1];
			// ForEach 
			for (Object[] result3_black : SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_blackBBBB(ac, alg, cu, jimp)) {
				Object[] result3_green = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_greenBBBBFFFF(ac, alg, cu, jimp);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[4];
				//nothing EMoflonEdge ac__cu____target = (EMoflonEdge) result3_green[5];
				//nothing EMoflonEdge ac__alg____source = (EMoflonEdge) result3_green[6];
				//nothing EMoflonEdge cu__jimp____imports = (EMoflonEdge) result3_green[7];

				Object[] result4_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingAndBlackFBBBBBB(this,
								isApplicableMatch, ac, alg, cu, jimp);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ac] = " + ac + ", " + "[alg] = "
							+ alg + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ".");
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp) {// Create CSP
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
		isApplicableMatch.registerObject("alg", alg);
		isApplicableMatch.registerObject("cu", cu);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject alg,
			EObject cu, EObject jimp) {
		ruleresult.registerObject("imp", imp);
		ruleresult.registerObject("i2j", i2j);
		ruleresult.registerObject("ac", ac);
		ruleresult.registerObject("alg", alg);
		ruleresult.registerObject("cu", cu);
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
			Import imp = (Import) result2_black[0];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_black[1];
			Object[] result2_green = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, imp, alg)) {
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
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_8(EMoflonEdge _edge_imports) {

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
			JavaCompilationUnit cu = (JavaCompilationUnit) result2_black[0];
			JavaImport jimp = (JavaImport) result2_black[1];
			Object[] result2_green = SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, cu, jimp)) {
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
		Import imp = (Import) result2_bindingAndBlack[0];
		SymmetricBlockCipher alg = (SymmetricBlockCipher) result2_bindingAndBlack[1];
		JavaCompilationUnit cu = (JavaCompilationUnit) result2_bindingAndBlack[2];
		JavaImport jimp = (JavaImport) result2_bindingAndBlack[3];

		Object[] result3_bindingAndBlack = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingAndBlackFBBBBBBB(this, imp, alg, cu,
						jimp, sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[imp] = " + imp + ", " + "[alg] = " + alg + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp
					+ ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_24_5_matchcorrcontext_blackFBBBB(alg, cu, sourceMatch,
							targetMatch)) {
				SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result5_black[0];
				Object[] result5_green = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_5_matchcorrcontext_greenBBBF(ac, sourceMatch,
								targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[3];

				Object[] result6_black = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_6_createcorrespondence_blackBBBBB(imp, alg, cu,
								jimp, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[imp] = " + imp + ", "
							+ "[alg] = " + alg + ", " + "[cu] = " + cu + ", " + "[jimp] = " + jimp + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_24_6_createcorrespondence_greenBFBB(imp, jimp,
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
	public CSP isApplicable_solveCsp_CC(Import imp, SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp,
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
	public boolean checkDEC_FWD(Import imp, SymmetricBlockCipher alg) {// 
		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_27_1_matchtggpattern_blackBB(imp, alg);
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
	public boolean checkDEC_BWD(JavaCompilationUnit cu, JavaImport jimp) {// 
		Object[] result1_black = SymmetricBlockCipherImportToImportImpl
				.pattern_SymmetricBlockCipherImportToImport_28_1_matchtggpattern_blackBB(cu, jimp);
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
							isApplicableMatch, ac, alg, cu, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ac] = " + ac + ", " + "[alg] = " + alg
						+ ", " + "[cu] = " + cu + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SymmetricBlockCipherImportToImportImpl
					.pattern_SymmetricBlockCipherImportToImport_29_4_checkCSP_expressionFBB(this, csp)) {
				// 
				Object[] result5_black = SymmetricBlockCipherImportToImportImpl
						.pattern_SymmetricBlockCipherImportToImport_29_5_checknacs_blackBBB(ac, alg, cu);
				if (result5_black != null) {

					Object[] result6_black = SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_29_6_perform_blackBBBB(ac, alg, cu, ruleResult);
					if (result6_black == null) {
						throw new RuntimeException(
								"Pattern matching failed." + " Variables: " + "[ac] = " + ac + ", " + "[alg] = " + alg
										+ ", " + "[cu] = " + cu + ", " + "[ruleResult] = " + ruleResult + ".");
					}
					SymmetricBlockCipherImportToImportImpl
							.pattern_SymmetricBlockCipherImportToImport_29_6_perform_greenFFBBFBB(alg, cu, ruleResult,
									csp);
					//nothing Import imp = (Import) result6_green[0];
					//nothing ImportToImport i2j = (ImportToImport) result6_green[1];
					//nothing JavaImport jimp = (JavaImport) result6_green[4];

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
			SymmetricBlockCipher alg, JavaCompilationUnit cu, ModelgeneratorRuleResult ruleResult) {// Create CSP
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
		isApplicableMatch.registerObject("alg", alg);
		isApplicableMatch.registerObject("cu", cu);
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
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD__MATCH_IMPORT_SYMMETRICBLOCKCIPHER:
			return isAppropriate_FWD((Match) arguments.get(0), (Import) arguments.get(1),
					(SymmetricBlockCipher) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_IMPORT_SYMMETRICBLOCKCIPHER:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (Import) arguments.get(1),
					(SymmetricBlockCipher) arguments.get(2));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_IMPORT_SYMMETRICBLOCKCIPHER:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (Import) arguments.get(1),
					(SymmetricBlockCipher) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_IMPORT_SYMMETRICBLOCKCIPHERTOJCU_SYMMETRICBLOCKCIPHER_JAVACOMPILATIONUNIT:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0), (Import) arguments.get(1),
					(SymmetricBlockCipherToJcu) arguments.get(2), (SymmetricBlockCipher) arguments.get(3),
					(JavaCompilationUnit) arguments.get(4));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaImport) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaImport) arguments.get(2));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVACOMPILATIONUNIT_JAVAIMPORT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaCompilationUnit) arguments.get(1),
					(JavaImport) arguments.get(2));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHERTOJCU_SYMMETRICBLOCKCIPHER_JAVACOMPILATIONUNIT_JAVAIMPORT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SymmetricBlockCipherToJcu) arguments.get(1), (SymmetricBlockCipher) arguments.get(2),
					(JavaCompilationUnit) arguments.get(3), (JavaImport) arguments.get(4));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6));
			return null;
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_FWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPROPRIATE_BWD_EMOFLON_EDGE_8__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_8((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_SOLVE_CSP_CC__IMPORT_SYMMETRICBLOCKCIPHER_JAVACOMPILATIONUNIT_JAVAIMPORT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((Import) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(JavaCompilationUnit) arguments.get(2), (JavaImport) arguments.get(3), (Match) arguments.get(4),
					(Match) arguments.get(5));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_DEC_FWD__IMPORT_SYMMETRICBLOCKCIPHER:
			return checkDEC_FWD((Import) arguments.get(0), (SymmetricBlockCipher) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___CHECK_DEC_BWD__JAVACOMPILATIONUNIT_JAVAIMPORT:
			return checkDEC_BWD((JavaCompilationUnit) arguments.get(0), (JavaImport) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL__RULEENTRYCONTAINER_SYMMETRICBLOCKCIPHERTOJCU:
			return generateModel((RuleEntryContainer) arguments.get(0), (SymmetricBlockCipherToJcu) arguments.get(1));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHERTOJCU_SYMMETRICBLOCKCIPHER_JAVACOMPILATIONUNIT_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(SymmetricBlockCipherToJcu) arguments.get(1), (SymmetricBlockCipher) arguments.get(2),
					(JavaCompilationUnit) arguments.get(3), (ModelgeneratorRuleResult) arguments.get(4));
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_1_initialbindings_blackBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, Import imp, SymmetricBlockCipher alg) {
		return new Object[] { _this, match, imp, alg };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, Import imp, SymmetricBlockCipher alg) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, imp, alg);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, imp, alg };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingAndBlackFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, Import imp, SymmetricBlockCipher alg) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_binding = pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_bindingFBBBB(
				_this, match, imp, alg);
		if (result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_black = pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, imp, alg };
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
			Match match, Import imp, SymmetricBlockCipher alg) {
		return new Object[] { match, imp, alg };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_4_collectelementstobetranslated_greenBBBF(
			Match match, Import imp, SymmetricBlockCipher alg) {
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(imp);
		String alg__imp____imports_name_prime = "imports";
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		match.getToBeTranslatedEdges().add(alg__imp____imports);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		return new Object[] { match, imp, alg, alg__imp____imports };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_blackBBB(
			Match match, Import imp, SymmetricBlockCipher alg) {
		return new Object[] { match, imp, alg };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_0_5_collectcontextelements_greenBB(
			Match match, SymmetricBlockCipher alg) {
		match.getContextNodes().add(alg);
		return new Object[] { match, alg };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_0_6_registerobjectstomatch_expressionBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, Import imp, SymmetricBlockCipher alg) {
		_this.registerObjectsToMatch_FWD(match, imp, alg);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("imp");
		EObject _localVariable_1 = isApplicableMatch.getObject("ac");
		EObject _localVariable_2 = isApplicableMatch.getObject("alg");
		EObject _localVariable_3 = isApplicableMatch.getObject("cu");
		EObject tmpImp = _localVariable_0;
		EObject tmpAc = _localVariable_1;
		EObject tmpAlg = _localVariable_2;
		EObject tmpCu = _localVariable_3;
		if (tmpImp instanceof Import) {
			Import imp = (Import) tmpImp;
			if (tmpAc instanceof SymmetricBlockCipherToJcu) {
				SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) tmpAc;
				if (tmpAlg instanceof SymmetricBlockCipher) {
					SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
					if (tmpCu instanceof JavaCompilationUnit) {
						JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
						return new Object[] { imp, ac, alg, cu, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_blackBBBBFBB(
			Import imp, SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu,
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { imp, ac, alg, cu, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_bindingAndBlackFFFFFBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding = pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding != null) {
			Import imp = (Import) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[0];
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[1];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[2];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_binding[3];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_black = pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_blackBBBBFBB(
					imp, ac, alg, cu, _this, isApplicableMatch);
			if (result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_black[4];

				return new Object[] { imp, ac, alg, cu, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_1_performtransformation_greenBFBFB(
			Import imp, JavaCompilationUnit cu, CSP csp) {
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		JavaImport jimp = SimpleJavaFactory.eINSTANCE.createJavaImport();
		Object _localVariable_0 = csp.getValue("jimp", "value");
		i2j.setSource(imp);
		i2j.setTarget(jimp);
		cu.getImports().add(jimp);
		String jimp_value_prime = (String) _localVariable_0;
		jimp.setValue(jimp_value_prime);
		return new Object[] { imp, i2j, cu, jimp, csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_blackBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		return new Object[] { imp, i2j, jimp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_2_collecttranslatedelements_greenFBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(imp);
		ruleresult.getCreatedLinkElements().add(i2j);
		ruleresult.getCreatedElements().add(jimp);
		return new Object[] { ruleresult, imp, i2j, jimp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_1_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject alg, EObject cu, EObject jimp) {
		if (!imp.equals(jimp)) {
			if (!i2j.equals(imp)) {
				if (!i2j.equals(jimp)) {
					if (!ac.equals(imp)) {
						if (!ac.equals(i2j)) {
							if (!ac.equals(alg)) {
								if (!ac.equals(cu)) {
									if (!ac.equals(jimp)) {
										if (!alg.equals(imp)) {
											if (!alg.equals(i2j)) {
												if (!alg.equals(cu)) {
													if (!alg.equals(jimp)) {
														if (!cu.equals(imp)) {
															if (!cu.equals(i2j)) {
																if (!cu.equals(jimp)) {
																	return new Object[] { ruleresult, imp, i2j, ac, alg,
																			cu, jimp };
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
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject alg, EObject cu, EObject jimp) {
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__imp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__jimp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SymmetricBlockCipherImportToImport";
		String alg__imp____imports_name_prime = "imports";
		String i2j__imp____source_name_prime = "source";
		String i2j__jimp____target_name_prime = "target";
		String cu__jimp____imports_name_prime = "imports";
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		ruleresult.getTranslatedEdges().add(alg__imp____imports);
		i2j__imp____source.setSrc(i2j);
		i2j__imp____source.setTrg(imp);
		ruleresult.getCreatedEdges().add(i2j__imp____source);
		i2j__jimp____target.setSrc(i2j);
		i2j__jimp____target.setTrg(jimp);
		ruleresult.getCreatedEdges().add(i2j__jimp____target);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		ruleresult.getCreatedEdges().add(cu__jimp____imports);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		i2j__imp____source.setName(i2j__imp____source_name_prime);
		i2j__jimp____target.setName(i2j__jimp____target_name_prime);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		return new Object[] { ruleresult, imp, i2j, alg, cu, jimp, alg__imp____imports, i2j__imp____source,
				i2j__jimp____target, cu__jimp____imports };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_1_5_registerobjects_expressionBBBBBBBB(
			SymmetricBlockCipherImportToImport _this, PerformRuleResult ruleresult, EObject imp, EObject i2j,
			EObject ac, EObject alg, EObject cu, EObject jimp) {
		_this.registerObjects_FWD(ruleresult, imp, i2j, ac, alg, cu, jimp);

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
		EObject _localVariable_0 = match.getObject("imp");
		EObject _localVariable_1 = match.getObject("alg");
		EObject tmpImp = _localVariable_0;
		EObject tmpAlg = _localVariable_1;
		if (tmpImp instanceof Import) {
			Import imp = (Import) tmpImp;
			if (tmpAlg instanceof SymmetricBlockCipher) {
				SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
				return new Object[] { imp, alg, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_2_2_corematch_blackBFBFB(
			Import imp, SymmetricBlockCipher alg, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SymmetricBlockCipherToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(alg,
				SymmetricBlockCipherToJcu.class, "source")) {
			JavaCompilationUnit cu = ac.getTarget();
			if (cu != null) {
				_result.add(new Object[] { imp, ac, alg, cu, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_blackBBBB(
			Import imp, SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (alg.getImports().contains(imp)) {
			if (cu.equals(ac.getTarget())) {
				if (alg.equals(ac.getSource())) {
					_result.add(new Object[] { imp, ac, alg, cu });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_3_findcontext_greenBBBBFFFF(Import imp,
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__cu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__alg____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String alg__imp____imports_name_prime = "imports";
		String ac__cu____target_name_prime = "target";
		String ac__alg____source_name_prime = "source";
		isApplicableMatch.getAllContextElements().add(imp);
		isApplicableMatch.getAllContextElements().add(ac);
		isApplicableMatch.getAllContextElements().add(alg);
		isApplicableMatch.getAllContextElements().add(cu);
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		isApplicableMatch.getAllContextElements().add(alg__imp____imports);
		ac__cu____target.setSrc(ac);
		ac__cu____target.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(ac__cu____target);
		ac__alg____source.setSrc(ac);
		ac__alg____source.setTrg(alg);
		isApplicableMatch.getAllContextElements().add(ac__alg____source);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		ac__cu____target.setName(ac__cu____target_name_prime);
		ac__alg____source.setName(ac__alg____source_name_prime);
		return new Object[] { imp, ac, alg, cu, isApplicableMatch, alg__imp____imports, ac__cu____target,
				ac__alg____source };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, Import imp,
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, imp, ac, alg, cu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, imp, ac, alg, cu };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingAndBlackFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, Import imp,
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_binding = pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, imp, ac, alg, cu);
		if (result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_black = pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, imp, ac, alg, cu };
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
			SymmetricBlockCipherImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		return new Object[] { _this, match, cu, jimp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, cu, jimp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, cu, jimp };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingAndBlackFBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_binding = pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_bindingFBBBB(
				_this, match, cu, jimp);
		if (result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_black = pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, cu, jimp };
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
			Match match, JavaCompilationUnit cu, JavaImport jimp) {
		return new Object[] { match, cu, jimp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_4_collectelementstobetranslated_greenBBBF(
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_blackBBB(
			Match match, JavaCompilationUnit cu, JavaImport jimp) {
		return new Object[] { match, cu, jimp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_10_5_collectcontextelements_greenBB(
			Match match, JavaCompilationUnit cu) {
		match.getContextNodes().add(cu);
		return new Object[] { match, cu };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_10_6_registerobjectstomatch_expressionBBBB(
			SymmetricBlockCipherImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		_this.registerObjectsToMatch_BWD(match, cu, jimp);

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
		EObject _localVariable_0 = isApplicableMatch.getObject("ac");
		EObject _localVariable_1 = isApplicableMatch.getObject("alg");
		EObject _localVariable_2 = isApplicableMatch.getObject("cu");
		EObject _localVariable_3 = isApplicableMatch.getObject("jimp");
		EObject tmpAc = _localVariable_0;
		EObject tmpAlg = _localVariable_1;
		EObject tmpCu = _localVariable_2;
		EObject tmpJimp = _localVariable_3;
		if (tmpAc instanceof SymmetricBlockCipherToJcu) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) tmpAc;
			if (tmpAlg instanceof SymmetricBlockCipher) {
				SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
				if (tmpCu instanceof JavaCompilationUnit) {
					JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
					if (tmpJimp instanceof JavaImport) {
						JavaImport jimp = (JavaImport) tmpJimp;
						return new Object[] { ac, alg, cu, jimp, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_blackBBBBFBB(
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp,
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { ac, alg, cu, jimp, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_bindingAndBlackFFFFFBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding = pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_bindingFFFFB(
				isApplicableMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding != null) {
			SymmetricBlockCipherToJcu ac = (SymmetricBlockCipherToJcu) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[0];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[1];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[2];
			JavaImport jimp = (JavaImport) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_binding[3];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_black = pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_blackBBBBFBB(
					ac, alg, cu, jimp, _this, isApplicableMatch);
			if (result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_black[4];

				return new Object[] { ac, alg, cu, jimp, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_1_performtransformation_greenFFBBB(
			SymmetricBlockCipher alg, JavaImport jimp, CSP csp) {
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_blackBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		return new Object[] { imp, i2j, jimp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_2_collecttranslatedelements_greenFBBB(
			Import imp, ImportToImport i2j, JavaImport jimp) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(imp);
		ruleresult.getCreatedLinkElements().add(i2j);
		ruleresult.getTranslatedElements().add(jimp);
		return new Object[] { ruleresult, imp, i2j, jimp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_11_3_bookkeepingforedges_blackBBBBBBB(
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject ac, EObject alg, EObject cu, EObject jimp) {
		if (!imp.equals(jimp)) {
			if (!i2j.equals(imp)) {
				if (!i2j.equals(jimp)) {
					if (!ac.equals(imp)) {
						if (!ac.equals(i2j)) {
							if (!ac.equals(alg)) {
								if (!ac.equals(cu)) {
									if (!ac.equals(jimp)) {
										if (!alg.equals(imp)) {
											if (!alg.equals(i2j)) {
												if (!alg.equals(cu)) {
													if (!alg.equals(jimp)) {
														if (!cu.equals(imp)) {
															if (!cu.equals(i2j)) {
																if (!cu.equals(jimp)) {
																	return new Object[] { ruleresult, imp, i2j, ac, alg,
																			cu, jimp };
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
			PerformRuleResult ruleresult, EObject imp, EObject i2j, EObject alg, EObject cu, EObject jimp) {
		EMoflonEdge alg__imp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__imp____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge i2j__jimp____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SymmetricBlockCipherImportToImport";
		String alg__imp____imports_name_prime = "imports";
		String i2j__imp____source_name_prime = "source";
		String i2j__jimp____target_name_prime = "target";
		String cu__jimp____imports_name_prime = "imports";
		alg__imp____imports.setSrc(alg);
		alg__imp____imports.setTrg(imp);
		ruleresult.getCreatedEdges().add(alg__imp____imports);
		i2j__imp____source.setSrc(i2j);
		i2j__imp____source.setTrg(imp);
		ruleresult.getCreatedEdges().add(i2j__imp____source);
		i2j__jimp____target.setSrc(i2j);
		i2j__jimp____target.setTrg(jimp);
		ruleresult.getCreatedEdges().add(i2j__jimp____target);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		ruleresult.getTranslatedEdges().add(cu__jimp____imports);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		alg__imp____imports.setName(alg__imp____imports_name_prime);
		i2j__imp____source.setName(i2j__imp____source_name_prime);
		i2j__jimp____target.setName(i2j__jimp____target_name_prime);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		return new Object[] { ruleresult, imp, i2j, alg, cu, jimp, alg__imp____imports, i2j__imp____source,
				i2j__jimp____target, cu__jimp____imports };
	}

	public static final void pattern_SymmetricBlockCipherImportToImport_11_5_registerobjects_expressionBBBBBBBB(
			SymmetricBlockCipherImportToImport _this, PerformRuleResult ruleresult, EObject imp, EObject i2j,
			EObject ac, EObject alg, EObject cu, EObject jimp) {
		_this.registerObjects_BWD(ruleresult, imp, i2j, ac, alg, cu, jimp);

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

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_12_2_corematch_blackFFBBB(
			JavaCompilationUnit cu, JavaImport jimp, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		for (SymmetricBlockCipherToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
				SymmetricBlockCipherToJcu.class, "target")) {
			SymmetricBlockCipher alg = ac.getSource();
			if (alg != null) {
				_result.add(new Object[] { ac, alg, cu, jimp, match });
			}

		}
		return _result;
	}

	public static final Iterable<Object[]> pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_blackBBBB(
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (cu.equals(ac.getTarget())) {
			if (alg.equals(ac.getSource())) {
				if (cu.getImports().contains(jimp)) {
					_result.add(new Object[] { ac, alg, cu, jimp });
				}
			}
		}
		return _result;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_3_findcontext_greenBBBBFFFF(
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge ac__cu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge ac__alg____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge cu__jimp____imports = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ac__cu____target_name_prime = "target";
		String ac__alg____source_name_prime = "source";
		String cu__jimp____imports_name_prime = "imports";
		isApplicableMatch.getAllContextElements().add(ac);
		isApplicableMatch.getAllContextElements().add(alg);
		isApplicableMatch.getAllContextElements().add(cu);
		isApplicableMatch.getAllContextElements().add(jimp);
		ac__cu____target.setSrc(ac);
		ac__cu____target.setTrg(cu);
		isApplicableMatch.getAllContextElements().add(ac__cu____target);
		ac__alg____source.setSrc(ac);
		ac__alg____source.setTrg(alg);
		isApplicableMatch.getAllContextElements().add(ac__alg____source);
		cu__jimp____imports.setSrc(cu);
		cu__jimp____imports.setTrg(jimp);
		isApplicableMatch.getAllContextElements().add(cu__jimp____imports);
		ac__cu____target.setName(ac__cu____target_name_prime);
		ac__alg____source.setName(ac__alg____source_name_prime);
		cu__jimp____imports.setName(cu__jimp____imports_name_prime);
		return new Object[] { ac, alg, cu, jimp, isApplicableMatch, ac__cu____target, ac__alg____source,
				cu__jimp____imports };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, ac, alg, cu, jimp);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ac, alg, cu, jimp };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingAndBlackFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_binding = pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ac, alg, cu, jimp);
		if (result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_black = pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ac, alg, cu, jimp };
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
					_result.add(new Object[] { imp, alg, _edge_imports });
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
			SymmetricBlockCipherImportToImport _this, Match match, Import imp, SymmetricBlockCipher alg) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, imp, alg);
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
					_result.add(new Object[] { cu, jimp, _edge_imports });
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
			SymmetricBlockCipherImportToImport _this, Match match, JavaCompilationUnit cu, JavaImport jimp) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, cu, jimp);
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
			Match sourceMatch, Match targetMatch) {
		EObject _localVariable_0 = sourceMatch.getObject("imp");
		EObject _localVariable_1 = sourceMatch.getObject("alg");
		EObject _localVariable_2 = targetMatch.getObject("cu");
		EObject _localVariable_3 = targetMatch.getObject("jimp");
		EObject tmpImp = _localVariable_0;
		EObject tmpAlg = _localVariable_1;
		EObject tmpCu = _localVariable_2;
		EObject tmpJimp = _localVariable_3;
		if (tmpImp instanceof Import) {
			Import imp = (Import) tmpImp;
			if (tmpAlg instanceof SymmetricBlockCipher) {
				SymmetricBlockCipher alg = (SymmetricBlockCipher) tmpAlg;
				if (tmpCu instanceof JavaCompilationUnit) {
					JavaCompilationUnit cu = (JavaCompilationUnit) tmpCu;
					if (tmpJimp instanceof JavaImport) {
						JavaImport jimp = (JavaImport) tmpJimp;
						return new Object[] { imp, alg, cu, jimp, sourceMatch, targetMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_blackBBBBBB(
			Import imp, SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp, Match sourceMatch,
			Match targetMatch) {
		if (!sourceMatch.equals(targetMatch)) {
			return new Object[] { imp, alg, cu, jimp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_bindingAndBlackFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding = pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_bindingFFFFBB(
				sourceMatch, targetMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding != null) {
			Import imp = (Import) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[0];
			SymmetricBlockCipher alg = (SymmetricBlockCipher) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[1];
			JavaCompilationUnit cu = (JavaCompilationUnit) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[2];
			JavaImport jimp = (JavaImport) result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_binding[3];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_black = pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_blackBBBBBB(
					imp, alg, cu, jimp, sourceMatch, targetMatch);
			if (result_pattern_SymmetricBlockCipherImportToImport_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { imp, alg, cu, jimp, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingFBBBBBBB(
			SymmetricBlockCipherImportToImport _this, Import imp, SymmetricBlockCipher alg, JavaCompilationUnit cu,
			JavaImport jimp, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_4 = _this.isApplicable_solveCsp_CC(imp, alg, cu, jimp, sourceMatch, targetMatch);
		CSP csp = _localVariable_4;
		if (csp != null) {
			return new Object[] { csp, _this, imp, alg, cu, jimp, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingAndBlackFBBBBBBB(
			SymmetricBlockCipherImportToImport _this, Import imp, SymmetricBlockCipher alg, JavaCompilationUnit cu,
			JavaImport jimp, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_binding = pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_bindingFBBBBBBB(
				_this, imp, alg, cu, jimp, sourceMatch, targetMatch);
		if (result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_black = pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, imp, alg, cu, jimp, sourceMatch, targetMatch };
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
			SymmetricBlockCipher alg, JavaCompilationUnit cu, Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			for (SymmetricBlockCipherToJcu ac : org.moflon.core.utilities.eMoflonEMFUtil.getOppositeReferenceTyped(cu,
					SymmetricBlockCipherToJcu.class, "target")) {
				if (alg.equals(ac.getSource())) {
					_result.add(new Object[] { ac, alg, cu, sourceMatch, targetMatch });
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
			Import imp, SymmetricBlockCipher alg, JavaCompilationUnit cu, JavaImport jimp, CCMatch ccMatch) {
		return new Object[] { imp, alg, cu, jimp, ccMatch };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_24_6_createcorrespondence_greenBFBB(
			Import imp, JavaImport jimp, CCMatch ccMatch) {
		ImportToImport i2j = CryptoConfigToJavaFactory.eINSTANCE.createImportToImport();
		i2j.setSource(imp);
		i2j.setTarget(jimp);
		ccMatch.getCreateCorr().add(i2j);
		return new Object[] { imp, i2j, jimp, ccMatch };
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

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_27_1_matchtggpattern_blackBB(Import imp,
			SymmetricBlockCipher alg) {
		if (alg.getImports().contains(imp)) {
			return new Object[] { imp, alg };
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
			JavaCompilationUnit cu, JavaImport jimp) {
		if (cu.getImports().contains(jimp)) {
			return new Object[] { cu, jimp };
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
			SymmetricBlockCipher alg, JavaCompilationUnit cu, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ac, alg, cu, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ac, alg, cu, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_bindingAndBlackFBBBBBB(
			SymmetricBlockCipherImportToImport _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipherToJcu ac,
			SymmetricBlockCipher alg, JavaCompilationUnit cu, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_binding = pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_bindingFBBBBBB(
				_this, isApplicableMatch, ac, alg, cu, ruleResult);
		if (result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_binding[0];

			Object[] result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_black = pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricBlockCipherImportToImport_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ac, alg, cu, ruleResult };
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
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu) {
		return new Object[] { ac, alg, cu };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_6_perform_blackBBBB(
			SymmetricBlockCipherToJcu ac, SymmetricBlockCipher alg, JavaCompilationUnit cu,
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ac, alg, cu, ruleResult };
	}

	public static final Object[] pattern_SymmetricBlockCipherImportToImport_29_6_perform_greenFFBBFBB(
			SymmetricBlockCipher alg, JavaCompilationUnit cu, ModelgeneratorRuleResult ruleResult, CSP csp) {
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
		i2j.setTarget(jimp);
		cu.getImports().add(jimp);
		ruleResult.getTargetObjects().add(jimp);
		String imp_value_prime = (String) _localVariable_0;
		String jimp_value_prime = (String) _localVariable_1;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_2);
		imp.setValue(imp_value_prime);
		jimp.setValue(jimp_value_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { imp, i2j, alg, cu, jimp, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SymmetricBlockCipherImportToImport_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SymmetricBlockCipherImportToImportImpl
