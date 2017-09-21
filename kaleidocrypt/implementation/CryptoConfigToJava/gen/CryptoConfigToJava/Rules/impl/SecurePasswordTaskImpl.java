/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoAPIConfig.Algorithm;
import CryptoAPIConfig.CryptoAPIConfigFactory;
import CryptoAPIConfig.KeyDerivationAlgorithm;
import CryptoAPIConfig.Task;

import CryptoConfigToJava.CryptoConfigToJavaFactory;
import CryptoConfigToJava.KeyDerivationAlgorithmToJcu;

import CryptoConfigToJava.Rules.RulesPackage;
import CryptoConfigToJava.Rules.SecurePasswordTask;

import CryptoConfigToJava.TaskToJavaPackage;

import SimpleJava.JavaCompilationUnit;
import SimpleJava.JavaExpression;
import SimpleJava.JavaLiteral;
import SimpleJava.JavaMethod;
import SimpleJava.JavaMethodInvocation;
import SimpleJava.JavaName;
import SimpleJava.JavaOpaqueMethod;
import SimpleJava.JavaPackage;
import SimpleJava.JavaStatement;
import SimpleJava.JavaVariableDeclaration;
import SimpleJava.JavaWorkflowMethod;
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
 * An implementation of the model object '<em><b>Secure Password Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SecurePasswordTaskImpl extends AbstractRuleImpl implements SecurePasswordTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurePasswordTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSecurePasswordTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, KeyDerivationAlgorithm kda, Task task) {

		Object[] result1_black = SecurePasswordTaskImpl.pattern_SecurePasswordTask_0_1_initialbindings_blackBBBB(this,
				match, kda, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[kda] = " + kda + ", " + "[task] = " + task + ".");
		}

		Object[] result2_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, kda, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[kda] = " + kda + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SecurePasswordTaskImpl.pattern_SecurePasswordTask_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_0_4_collectelementstobetranslated_blackBBB(match, kda, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[kda] = " + kda + ", " + "[task] = " + task + ".");
			}
			SecurePasswordTaskImpl.pattern_SecurePasswordTask_0_4_collectelementstobetranslated_greenBBBF(match, kda,
					task);
			//nothing EMoflonEdge task__kda____algorithms = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_0_5_collectcontextelements_blackBBB(match, kda, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[kda] = " + kda + ", " + "[task] = " + task + ".");
			}
			// 
			SecurePasswordTaskImpl.pattern_SecurePasswordTask_0_6_registerobjectstomatch_expressionBBBB(this, match,
					kda, task);
			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_0_7_expressionF();
		} else {
			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_1_1_performtransformation_bindingAndBlackFFFBB(this, isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result1_bindingAndBlack[0];
		Task task = (Task) result1_bindingAndBlack[1];
		CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_1_1_performtransformation_greenFFFFFFBFFFBFFFFB(kda, task, csp);
		JavaLiteral exprIterationLiteral = (JavaLiteral) result1_green[0];
		TaskToJavaPackage t2c = (TaskToJavaPackage) result1_green[1];
		JavaPackage javaPackage = (JavaPackage) result1_green[2];
		JavaLiteral exprAlgNameLiteral = (JavaLiteral) result1_green[3];
		JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result1_green[4];
		JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result1_green[5];
		JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result1_green[7];
		JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result1_green[8];
		KeyDerivationAlgorithmToJcu tc = (KeyDerivationAlgorithmToJcu) result1_green[9];
		JavaName exprPwdName = (JavaName) result1_green[11];
		JavaStatement statRetGetKey = (JavaStatement) result1_green[12];
		JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result1_green[13];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result1_green[14];

		Object[] result2_black = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_1_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(exprIterationLiteral,
						t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey,
						exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey, jcu);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[exprIterationLiteral] = "
					+ exprIterationLiteral + ", " + "[t2c] = " + t2c + ", " + "[javaPackage] = " + javaPackage + ", "
					+ "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", " + "[pwdDeclaration] = " + pwdDeclaration
					+ ", " + "[exprRetGetKey] = " + exprRetGetKey + ", " + "[kda] = " + kda + ", "
					+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
					+ exprOutputSizeLiteral + ", " + "[tc] = " + tc + ", " + "[task] = " + task + ", "
					+ "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = " + statRetGetKey + ", "
					+ "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
		}
		Object[] result2_green = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_1_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(exprIterationLiteral,
						t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey,
						exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey, jcu);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult,
						exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda,
						methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
						jcu);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[exprIterationLiteral] = " + exprIterationLiteral + ", " + "[t2c] = " + t2c + ", "
					+ "[javaPackage] = " + javaPackage + ", " + "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", "
					+ "[pwdDeclaration] = " + pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", "
					+ "[kda] = " + kda + ", " + "[methodPerformGetKey] = " + methodPerformGetKey + ", "
					+ "[exprOutputSizeLiteral] = " + exprOutputSizeLiteral + ", " + "[tc] = " + tc + ", " + "[task] = "
					+ task + ", " + "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = " + statRetGetKey
					+ ", " + "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
		}
		SecurePasswordTaskImpl.pattern_SecurePasswordTask_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
				ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
				jcu);
		//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge jcu__methodGetKey____methods = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge methodGetKey__statRetGetKey____statements = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge exprRetGetKey__exprPwdName____arguments = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge jcu__methodPerformGetKey____methods = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge t2c__javaPackage____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge statRetGetKey__exprRetGetKey____expr = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tc__kda____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge t2c__task____source = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge task__kda____algorithms = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge tc__jcu____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge methodGetKey__pwdDeclaration____params = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = (EMoflonEdge) result3_green[30];

		// 
		// 
		SecurePasswordTaskImpl.pattern_SecurePasswordTask_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
				jcu);
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SecurePasswordTaskImpl.pattern_SecurePasswordTask_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result2_binding[0];
		Task task = (Task) result2_binding[1];
		for (Object[] result2_black : SecurePasswordTaskImpl.pattern_SecurePasswordTask_2_2_corematch_blackBBB(kda,
				task, match)) {
			// ForEach 
			for (Object[] result3_black : SecurePasswordTaskImpl.pattern_SecurePasswordTask_2_3_findcontext_blackBB(kda,
					task)) {
				Object[] result3_green = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_2_3_findcontext_greenBBFF(kda, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge task__kda____algorithms = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_2_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch, kda,
								task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[kda] = " + kda + ", "
							+ "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SecurePasswordTaskImpl.pattern_SecurePasswordTask_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SecurePasswordTaskImpl
							.pattern_SecurePasswordTask_2_6_addmatchtoruleresult_blackBB(ruleresult, isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SecurePasswordTaskImpl.pattern_SecurePasswordTask_2_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, KeyDerivationAlgorithm kda, Task task) {
		match.registerObject("kda", kda);
		match.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, KeyDerivationAlgorithm kda, Task task) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("Crypto");
		literal0.setType("");

		// Create attribute variables
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", true, csp);
		var_task_package.setValue(task.getPackage());
		var_task_package.setType("String");

		// Create unbound variables

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();

		csp.getConstraints().add(setDefaultStringIfNull);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_task_package, literal0);
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, KeyDerivationAlgorithm kda, Task task) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("NoSuchAlgorithmException, InvalidKeySpecException");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue(0);
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue(1);
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue(
				"{\n  byte[] salt=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(salt);\n  PBEKeySpec spec=new PBEKeySpec(pwd,salt,iterations,outputSize);\n  SecretKeyFactory skf=SecretKeyFactory.getInstance(algName);\n  return new SecretKeySpec(skf.generateSecret(spec).getEncoded(),\"AES\");\n}\n");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("char [] pwd,String algName,int iterations,int outputSize");
		literal4.setType("");

		// Create attribute variables
		Variable var_kda_outputSize = CSPFactoryHelper.eINSTANCE.createVariable("kda.outputSize", true, csp);
		var_kda_outputSize.setValue(kda.getOutputSize());
		var_kda_outputSize.setType("String");
		Variable var_kda_iterations = CSPFactoryHelper.eINSTANCE.createVariable("kda.iterations", true, csp);
		var_kda_iterations.setValue(kda.getIterations());
		var_kda_iterations.setType("String");
		Variable var_kda_name = CSPFactoryHelper.eINSTANCE.createVariable("kda.name", true, csp);
		var_kda_name.setValue(kda.getName());
		var_kda_name.setType("String");
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", true, csp);
		var_task_package.setValue(task.getPackage());
		var_task_package.setType("String");

		// Create unbound variables
		Variable var_exprOutputSizeLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprOutputSizeLiteral.value", csp);
		var_exprOutputSizeLiteral_value.setType("String");
		Variable var_exprIterationLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprIterationLiteral.value", csp);
		var_exprIterationLiteral_value.setType("String");
		Variable var_exprAlgNameLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprAlgNameLiteral.value",
				csp);
		var_exprAlgNameLiteral_value.setType("String");
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", csp);
		var_javaPackage_name.setType("String");
		Variable var_methodPerformGetKey_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.throws", csp);
		var_methodPerformGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.index",
				csp);
		var_methodPerformGetKey_index.setType("int");
		Variable var_methodGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.index", csp);
		var_methodGetKey_index.setType("int");
		Variable var_methodGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.throws", csp);
		var_methodGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.body",
				csp);
		var_methodPerformGetKey_body.setType("String");
		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.parameters", csp);
		var_methodPerformGetKey_parameters.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);
		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_exprIterationLiteral_value, var_kda_iterations);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_exprAlgNameLiteral_value, var_kda_name);
		eq_2.setRuleName("NoRuleName");
		eq_2.solve(var_task_package, var_javaPackage_name);
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_methodPerformGetKey_throws, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformGetKey_index, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_methodGetKey_index, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_methodGetKey_throws, literal0);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_methodPerformGetKey_body, literal3);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_methodPerformGetKey_parameters, literal4);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("kda", kda);
		isApplicableMatch.registerObject("task", task);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c,
			EObject javaPackage, EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		ruleresult.registerObject("exprIterationLiteral", exprIterationLiteral);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("javaPackage", javaPackage);
		ruleresult.registerObject("exprAlgNameLiteral", exprAlgNameLiteral);
		ruleresult.registerObject("pwdDeclaration", pwdDeclaration);
		ruleresult.registerObject("exprRetGetKey", exprRetGetKey);
		ruleresult.registerObject("kda", kda);
		ruleresult.registerObject("methodPerformGetKey", methodPerformGetKey);
		ruleresult.registerObject("exprOutputSizeLiteral", exprOutputSizeLiteral);
		ruleresult.registerObject("tc", tc);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("exprPwdName", exprPwdName);
		ruleresult.registerObject("statRetGetKey", statRetGetKey);
		ruleresult.registerObject("methodGetKey", methodGetKey);
		ruleresult.registerObject("jcu", jcu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("kda").eClass())
						.equals("CryptoAPIConfig.KeyDerivationAlgorithm.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("task").eClass())
						.equals("CryptoAPIConfig.Task.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {

		Object[] result1_black = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_10_1_initialbindings_blackBBBBBBBBBBBBB(this, match, exprIterationLiteral,
						javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey,
						exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[exprIterationLiteral] = " + exprIterationLiteral + ", "
					+ "[javaPackage] = " + javaPackage + ", " + "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", "
					+ "[pwdDeclaration] = " + pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", "
					+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
					+ exprOutputSizeLiteral + ", " + "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = "
					+ statRetGetKey + ", " + "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
		}

		Object[] result2_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_10_2_SolveCSP_bindingAndBlackFBBBBBBBBBBBBB(this, match,
						exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
						methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[exprIterationLiteral] = " + exprIterationLiteral + ", "
					+ "[javaPackage] = " + javaPackage + ", " + "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", "
					+ "[pwdDeclaration] = " + pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", "
					+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
					+ exprOutputSizeLiteral + ", " + "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = "
					+ statRetGetKey + ", " + "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SecurePasswordTaskImpl.pattern_SecurePasswordTask_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_10_4_collectelementstobetranslated_blackBBBBBBBBBBBB(match,
							exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
							methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[exprIterationLiteral] = " + exprIterationLiteral + ", " + "[javaPackage] = " + javaPackage
						+ ", " + "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", " + "[pwdDeclaration] = "
						+ pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", "
						+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
						+ exprOutputSizeLiteral + ", " + "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = "
						+ statRetGetKey + ", " + "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
			}
			SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_10_4_collectelementstobetranslated_greenBBBBBBBBBBBBFFFFFFFFFF(match,
							exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
							methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
			//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge jcu__methodGetKey____methods = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge methodGetKey__statRetGetKey____statements = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge exprRetGetKey__exprPwdName____arguments = (EMoflonEdge) result4_green[15];
			//nothing EMoflonEdge jcu__methodPerformGetKey____methods = (EMoflonEdge) result4_green[16];
			//nothing EMoflonEdge statRetGetKey__exprRetGetKey____expr = (EMoflonEdge) result4_green[17];
			//nothing EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = (EMoflonEdge) result4_green[18];
			//nothing EMoflonEdge methodGetKey__pwdDeclaration____params = (EMoflonEdge) result4_green[19];
			//nothing EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = (EMoflonEdge) result4_green[20];
			//nothing EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = (EMoflonEdge) result4_green[21];

			Object[] result5_black = SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_10_5_collectcontextelements_blackBBBBBBBBBBBB(match,
							exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
							methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[exprIterationLiteral] = " + exprIterationLiteral + ", " + "[javaPackage] = " + javaPackage
						+ ", " + "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", " + "[pwdDeclaration] = "
						+ pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", "
						+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
						+ exprOutputSizeLiteral + ", " + "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = "
						+ statRetGetKey + ", " + "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
			}
			// 
			SecurePasswordTaskImpl.pattern_SecurePasswordTask_10_6_registerobjectstomatch_expressionBBBBBBBBBBBBB(this,
					match, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
					methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_10_7_expressionF();
		} else {
			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaLiteral exprIterationLiteral = (JavaLiteral) result1_bindingAndBlack[0];
		JavaPackage javaPackage = (JavaPackage) result1_bindingAndBlack[1];
		JavaLiteral exprAlgNameLiteral = (JavaLiteral) result1_bindingAndBlack[2];
		JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result1_bindingAndBlack[3];
		JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result1_bindingAndBlack[4];
		JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result1_bindingAndBlack[5];
		JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result1_bindingAndBlack[6];
		JavaName exprPwdName = (JavaName) result1_bindingAndBlack[7];
		JavaStatement statRetGetKey = (JavaStatement) result1_bindingAndBlack[8];
		JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result1_bindingAndBlack[9];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_11_1_performtransformation_greenFBFFFBB(javaPackage, jcu, csp);
		TaskToJavaPackage t2c = (TaskToJavaPackage) result1_green[0];
		KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result1_green[2];
		KeyDerivationAlgorithmToJcu tc = (KeyDerivationAlgorithmToJcu) result1_green[3];
		Task task = (Task) result1_green[4];

		Object[] result2_black = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_11_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(exprIterationLiteral,
						t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey,
						exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey, jcu);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[exprIterationLiteral] = "
					+ exprIterationLiteral + ", " + "[t2c] = " + t2c + ", " + "[javaPackage] = " + javaPackage + ", "
					+ "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", " + "[pwdDeclaration] = " + pwdDeclaration
					+ ", " + "[exprRetGetKey] = " + exprRetGetKey + ", " + "[kda] = " + kda + ", "
					+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
					+ exprOutputSizeLiteral + ", " + "[tc] = " + tc + ", " + "[task] = " + task + ", "
					+ "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = " + statRetGetKey + ", "
					+ "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
		}
		Object[] result2_green = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_11_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(exprIterationLiteral,
						t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey,
						exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey, jcu);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult,
						exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda,
						methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
						jcu);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[exprIterationLiteral] = " + exprIterationLiteral + ", " + "[t2c] = " + t2c + ", "
					+ "[javaPackage] = " + javaPackage + ", " + "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", "
					+ "[pwdDeclaration] = " + pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", "
					+ "[kda] = " + kda + ", " + "[methodPerformGetKey] = " + methodPerformGetKey + ", "
					+ "[exprOutputSizeLiteral] = " + exprOutputSizeLiteral + ", " + "[tc] = " + tc + ", " + "[task] = "
					+ task + ", " + "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = " + statRetGetKey
					+ ", " + "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ".");
		}
		SecurePasswordTaskImpl.pattern_SecurePasswordTask_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
				ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
				jcu);
		//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge jcu__methodGetKey____methods = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge methodGetKey__statRetGetKey____statements = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge exprRetGetKey__exprPwdName____arguments = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge jcu__methodPerformGetKey____methods = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge t2c__javaPackage____target = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge statRetGetKey__exprRetGetKey____expr = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge tc__kda____source = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge t2c__task____source = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge task__kda____algorithms = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge tc__jcu____target = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge methodGetKey__pwdDeclaration____params = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = (EMoflonEdge) result3_green[30];

		// 
		// 
		SecurePasswordTaskImpl.pattern_SecurePasswordTask_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(this,
				ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
				jcu);
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_12_2_corematch_bindingFFFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		JavaLiteral exprIterationLiteral = (JavaLiteral) result2_binding[0];
		JavaPackage javaPackage = (JavaPackage) result2_binding[1];
		JavaLiteral exprAlgNameLiteral = (JavaLiteral) result2_binding[2];
		JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result2_binding[3];
		JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result2_binding[4];
		JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result2_binding[5];
		JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result2_binding[6];
		JavaName exprPwdName = (JavaName) result2_binding[7];
		JavaStatement statRetGetKey = (JavaStatement) result2_binding[8];
		JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result2_binding[9];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result2_binding[10];
		for (Object[] result2_black : SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_12_2_corematch_blackBBBBBBBBBBBB(exprIterationLiteral, javaPackage,
						exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral,
						exprPwdName, statRetGetKey, methodGetKey, jcu, match)) {
			// ForEach 
			for (Object[] result3_black : SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_12_3_findcontext_blackBBBBBBBBBBB(exprIterationLiteral, javaPackage,
							exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey,
							exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu)) {
				Object[] result3_green = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFF(exprIterationLiteral,
								javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey,
								exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge jcu__methodGetKey____methods = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge methodGetKey__statRetGetKey____statements = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge exprRetGetKey__exprPwdName____arguments = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge jcu__methodPerformGetKey____methods = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge statRetGetKey__exprRetGetKey____expr = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge methodGetKey__pwdDeclaration____params = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this, isApplicableMatch,
								exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
								methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey,
								jcu);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[exprIterationLiteral] = "
							+ exprIterationLiteral + ", " + "[javaPackage] = " + javaPackage + ", "
							+ "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", " + "[pwdDeclaration] = "
							+ pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", "
							+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
							+ exprOutputSizeLiteral + ", " + "[exprPwdName] = " + exprPwdName + ", "
							+ "[statRetGetKey] = " + statRetGetKey + ", " + "[methodGetKey] = " + methodGetKey + ", "
							+ "[jcu] = " + jcu + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SecurePasswordTaskImpl.pattern_SecurePasswordTask_12_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SecurePasswordTaskImpl
							.pattern_SecurePasswordTask_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SecurePasswordTaskImpl.pattern_SecurePasswordTask_12_6_addmatchtoruleresult_greenBB(ruleresult,
							isApplicableMatch);

				} else {
				}

			}

		}
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		match.registerObject("exprIterationLiteral", exprIterationLiteral);
		match.registerObject("javaPackage", javaPackage);
		match.registerObject("exprAlgNameLiteral", exprAlgNameLiteral);
		match.registerObject("pwdDeclaration", pwdDeclaration);
		match.registerObject("exprRetGetKey", exprRetGetKey);
		match.registerObject("methodPerformGetKey", methodPerformGetKey);
		match.registerObject("exprOutputSizeLiteral", exprOutputSizeLiteral);
		match.registerObject("exprPwdName", exprPwdName);
		match.registerObject("statRetGetKey", statRetGetKey);
		match.registerObject("methodGetKey", methodGetKey);
		match.registerObject("jcu", jcu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("NoSuchAlgorithmException, InvalidKeySpecException");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue(0);
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue(1);
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue(
				"{\n  byte[] salt=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(salt);\n  PBEKeySpec spec=new PBEKeySpec(pwd,salt,iterations,outputSize);\n  SecretKeyFactory skf=SecretKeyFactory.getInstance(algName);\n  return new SecretKeySpec(skf.generateSecret(spec).getEncoded(),\"AES\");\n}\n");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("char [] pwd,String algName,int iterations,int outputSize");
		literal4.setType("");

		// Create attribute variables
		Variable var_methodPerformGetKey_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.throws", true, csp);
		var_methodPerformGetKey_throws.setValue(methodPerformGetKey.getThrows());
		var_methodPerformGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.index",
				true, csp);
		var_methodPerformGetKey_index.setValue(methodPerformGetKey.getIndex());
		var_methodPerformGetKey_index.setType("int");
		Variable var_methodGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.index", true, csp);
		var_methodGetKey_index.setValue(methodGetKey.getIndex());
		var_methodGetKey_index.setType("int");
		Variable var_methodGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.throws", true, csp);
		var_methodGetKey_throws.setValue(methodGetKey.getThrows());
		var_methodGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.body",
				true, csp);
		var_methodPerformGetKey_body.setValue(methodPerformGetKey.getBody());
		var_methodPerformGetKey_body.setType("String");
		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.parameters", true, csp);
		var_methodPerformGetKey_parameters.setValue(methodPerformGetKey.getParameters());
		var_methodPerformGetKey_parameters.setType("String");

		// Create unbound variables

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();

		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_methodPerformGetKey_throws, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformGetKey_index, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_methodGetKey_index, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_methodGetKey_throws, literal0);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_methodPerformGetKey_body, literal3);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_methodPerformGetKey_parameters, literal4);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaLiteral exprIterationLiteral,
			JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration,
			JavaMethodInvocation exprRetGetKey, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			JavaName exprPwdName, JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey,
			JavaCompilationUnit jcu) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("Crypto");
		literal0.setType("");

		// Create attribute variables
		Variable var_exprOutputSizeLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprOutputSizeLiteral.value", true, csp);
		var_exprOutputSizeLiteral_value.setValue(exprOutputSizeLiteral.getValue());
		var_exprOutputSizeLiteral_value.setType("String");
		Variable var_exprIterationLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprIterationLiteral.value", true, csp);
		var_exprIterationLiteral_value.setValue(exprIterationLiteral.getValue());
		var_exprIterationLiteral_value.setType("String");
		Variable var_exprAlgNameLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprAlgNameLiteral.value",
				true, csp);
		var_exprAlgNameLiteral_value.setValue(exprAlgNameLiteral.getValue());
		var_exprAlgNameLiteral_value.setType("String");
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", true, csp);
		var_javaPackage_name.setValue(javaPackage.getName());
		var_javaPackage_name.setType("String");

		// Create unbound variables
		Variable var_kda_outputSize = CSPFactoryHelper.eINSTANCE.createVariable("kda.outputSize", csp);
		var_kda_outputSize.setType("String");
		Variable var_kda_iterations = CSPFactoryHelper.eINSTANCE.createVariable("kda.iterations", csp);
		var_kda_iterations.setType("String");
		Variable var_kda_name = CSPFactoryHelper.eINSTANCE.createVariable("kda.name", csp);
		var_kda_name.setType("String");
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", csp);
		var_task_package.setType("String");

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);
		csp.getConstraints().add(setDefaultStringIfNull);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_exprIterationLiteral_value, var_kda_iterations);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_exprAlgNameLiteral_value, var_kda_name);
		eq_2.setRuleName("NoRuleName");
		eq_2.solve(var_task_package, var_javaPackage_name);
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_task_package, literal0);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("exprIterationLiteral", exprIterationLiteral);
		isApplicableMatch.registerObject("javaPackage", javaPackage);
		isApplicableMatch.registerObject("exprAlgNameLiteral", exprAlgNameLiteral);
		isApplicableMatch.registerObject("pwdDeclaration", pwdDeclaration);
		isApplicableMatch.registerObject("exprRetGetKey", exprRetGetKey);
		isApplicableMatch.registerObject("methodPerformGetKey", methodPerformGetKey);
		isApplicableMatch.registerObject("exprOutputSizeLiteral", exprOutputSizeLiteral);
		isApplicableMatch.registerObject("exprPwdName", exprPwdName);
		isApplicableMatch.registerObject("statRetGetKey", statRetGetKey);
		isApplicableMatch.registerObject("methodGetKey", methodGetKey);
		isApplicableMatch.registerObject("jcu", jcu);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c,
			EObject javaPackage, EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		ruleresult.registerObject("exprIterationLiteral", exprIterationLiteral);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("javaPackage", javaPackage);
		ruleresult.registerObject("exprAlgNameLiteral", exprAlgNameLiteral);
		ruleresult.registerObject("pwdDeclaration", pwdDeclaration);
		ruleresult.registerObject("exprRetGetKey", exprRetGetKey);
		ruleresult.registerObject("kda", kda);
		ruleresult.registerObject("methodPerformGetKey", methodPerformGetKey);
		ruleresult.registerObject("exprOutputSizeLiteral", exprOutputSizeLiteral);
		ruleresult.registerObject("tc", tc);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("exprPwdName", exprPwdName);
		ruleresult.registerObject("statRetGetKey", statRetGetKey);
		ruleresult.registerObject("methodGetKey", methodGetKey);
		ruleresult.registerObject("jcu", jcu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprIterationLiteral").eClass())
						.equals("SimpleJava.JavaLiteral.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("javaPackage").eClass())
						.equals("SimpleJava.JavaPackage.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprAlgNameLiteral").eClass())
						.equals("SimpleJava.JavaLiteral.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("pwdDeclaration").eClass())
						.equals("SimpleJava.JavaVariableDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprRetGetKey").eClass())
						.equals("SimpleJava.JavaMethodInvocation.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("methodPerformGetKey").eClass())
						.equals("SimpleJava.JavaOpaqueMethod.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprOutputSizeLiteral").eClass())
						.equals("SimpleJava.JavaLiteral.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprPwdName").eClass())
						.equals("SimpleJava.JavaName.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("statRetGetKey").eClass())
						.equals("SimpleJava.JavaStatement.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("methodGetKey").eClass())
						.equals("SimpleJava.JavaWorkflowMethod.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("jcu").eClass())
						.equals("SimpleJava.JavaCompilationUnit.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_7(EMoflonEdge _edge_algorithms) {

		Object[] result1_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SecurePasswordTaskImpl.pattern_SecurePasswordTask_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_20_2_testcorematchandDECs_blackFFB(_edge_algorithms)) {
			KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result2_black[0];
			Task task = (Task) result2_black[1];
			Object[] result2_green = SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(this,
							match, kda, task)) {
				// 
				if (SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SecurePasswordTaskImpl
							.pattern_SecurePasswordTask_20_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SecurePasswordTaskImpl.pattern_SecurePasswordTask_20_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_7(EMoflonEdge _edge_cunits) {

		Object[] result1_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SecurePasswordTaskImpl.pattern_SecurePasswordTask_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_21_2_testcorematchandDECs_blackFFFFFFFFFFFB(_edge_cunits)) {
			JavaLiteral exprIterationLiteral = (JavaLiteral) result2_black[0];
			JavaPackage javaPackage = (JavaPackage) result2_black[1];
			JavaLiteral exprAlgNameLiteral = (JavaLiteral) result2_black[2];
			JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result2_black[3];
			JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result2_black[4];
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result2_black[5];
			JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result2_black[6];
			JavaName exprPwdName = (JavaName) result2_black[7];
			JavaStatement statRetGetKey = (JavaStatement) result2_black[8];
			JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result2_black[9];
			JavaCompilationUnit jcu = (JavaCompilationUnit) result2_black[10];
			Object[] result2_green = SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBBBBB(
							this, match, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
							exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey,
							methodGetKey, jcu)) {
				// 
				if (SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SecurePasswordTaskImpl
							.pattern_SecurePasswordTask_21_5_Addmatchtoruleresult_blackBBBB(match, __performOperation,
									__result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SecurePasswordTaskImpl.pattern_SecurePasswordTask_21_5_Addmatchtoruleresult_greenBBBB(match,
							__performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SecurePasswordTask");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("exprIterationLiteral", "index", 2, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprAlgNameLiteral", "index", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("pwdDeclaration", "name", "pwd", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("pwdDeclaration", "type", "char[]", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("pwdDeclaration", "index", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprRetGetKey", "name", "performGetKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "name", "performGetKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "type", "SecretKey ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "modifier", "private", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprOutputSizeLiteral", "index", 3, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("task", "description", "SecurePassword", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprPwdName", "index", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprPwdName", "identifier", "pwd", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("statRetGetKey", "return", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodGetKey", "modifier", "public", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodGetKey", "type", "SecretKey ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodGetKey", "name", "getKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("jcu", "name", "KeyDeriv", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_kda_outputSize = CSPFactoryHelper.eINSTANCE.createVariable("kda", true, csp);
		var_kda_outputSize.setValue(__helper.getValue("kda", "outputSize"));
		var_kda_outputSize.setType("String");

		Variable var_exprIterationLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprIterationLiteral",
				true, csp);
		var_exprIterationLiteral_value.setValue(__helper.getValue("exprIterationLiteral", "value"));
		var_exprIterationLiteral_value.setType("String");

		Variable var_kda_iterations = CSPFactoryHelper.eINSTANCE.createVariable("kda", true, csp);
		var_kda_iterations.setValue(__helper.getValue("kda", "iterations"));
		var_kda_iterations.setType("String");

		Variable var_exprAlgNameLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprAlgNameLiteral", true,
				csp);
		var_exprAlgNameLiteral_value.setValue(__helper.getValue("exprAlgNameLiteral", "value"));
		var_exprAlgNameLiteral_value.setType("String");

		Variable var_exprOutputSizeLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprOutputSizeLiteral",
				true, csp);
		var_exprOutputSizeLiteral_value.setValue(__helper.getValue("exprOutputSizeLiteral", "value"));
		var_exprOutputSizeLiteral_value.setType("String");

		Variable var_kda_name = CSPFactoryHelper.eINSTANCE.createVariable("kda", true, csp);
		var_kda_name.setValue(__helper.getValue("kda", "name"));
		var_kda_name.setType("String");

		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage", true, csp);
		var_javaPackage_name.setValue(__helper.getValue("javaPackage", "name"));
		var_javaPackage_name.setType("String");

		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_package.setValue(__helper.getValue("task", "package"));
		var_task_package.setType("String");

		Variable var_methodPerformGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey", true,
				csp);
		var_methodPerformGetKey_throws.setValue(__helper.getValue("methodPerformGetKey", "throws"));
		var_methodPerformGetKey_throws.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(0);
		var_literal0.setType("");

		Variable var_methodPerformGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey", true,
				csp);
		var_methodPerformGetKey_index.setValue(__helper.getValue("methodPerformGetKey", "index"));
		var_methodPerformGetKey_index.setType("int");

		Variable var_methodGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey", true, csp);
		var_methodGetKey_throws.setValue(__helper.getValue("methodGetKey", "throws"));
		var_methodGetKey_throws.setType("String");

		Variable var_methodGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey", true, csp);
		var_methodGetKey_index.setValue(__helper.getValue("methodGetKey", "index"));
		var_methodGetKey_index.setType("int");

		Variable var_literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal1.setValue("NoSuchAlgorithmException, InvalidKeySpecException");
		var_literal1.setType("");

		Variable var_literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal2.setValue(
				"{\n  byte[] salt=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(salt);\n  PBEKeySpec spec=new PBEKeySpec(pwd,salt,iterations,outputSize);\n  SecretKeyFactory skf=SecretKeyFactory.getInstance(algName);\n  return new SecretKeySpec(skf.generateSecret(spec).getEncoded(),\"AES\");\n}\n");
		var_literal2.setType("");

		Variable var_methodPerformGetKey_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey", true,
				csp);
		var_methodPerformGetKey_body.setValue(__helper.getValue("methodPerformGetKey", "body"));
		var_methodPerformGetKey_body.setType("String");

		Variable var_literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal3.setValue(1);
		var_literal3.setType("");

		Variable var_literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal4.setValue("Crypto");
		var_literal4.setType("");

		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey",
				true, csp);
		var_methodPerformGetKey_parameters.setValue(__helper.getValue("methodPerformGetKey", "parameters"));
		var_methodPerformGetKey_parameters.setType("String");

		Variable var_literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal5.setValue("char [] pwd,String algName,int iterations,int outputSize");
		var_literal5.setType("");

		SetDefaultStringIfNull setDefaultStringIfNull0 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull0);

		Eq eq1 = new Eq();
		csp.getConstraints().add(eq1);

		Eq eq2 = new Eq();
		csp.getConstraints().add(eq2);

		Eq eq3 = new Eq();
		csp.getConstraints().add(eq3);

		Eq eq4 = new Eq();
		csp.getConstraints().add(eq4);

		SetDefaultStringIfNull setDefaultStringIfNull5 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull5);

		SetDefaultStringIfNull setDefaultStringIfNull6 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull6);

		SetDefaultStringIfNull setDefaultStringIfNull7 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull7);

		SetDefaultStringIfNull setDefaultStringIfNull8 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull8);

		SetDefaultStringIfNull setDefaultStringIfNull9 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull9);

		SetDefaultStringIfNull setDefaultStringIfNull10 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull10);

		setDefaultStringIfNull0.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull0.solve(var_task_package, var_literal4);

		eq1.setRuleName("SecurePasswordTask");
		eq1.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);

		eq2.setRuleName("SecurePasswordTask");
		eq2.solve(var_exprIterationLiteral_value, var_kda_iterations);

		eq3.setRuleName("SecurePasswordTask");
		eq3.solve(var_exprAlgNameLiteral_value, var_kda_name);

		eq4.setRuleName("SecurePasswordTask");
		eq4.solve(var_task_package, var_javaPackage_name);

		setDefaultStringIfNull5.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull5.solve(var_methodPerformGetKey_throws, var_literal1);

		setDefaultStringIfNull6.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull6.solve(var_methodPerformGetKey_index, var_literal0);

		setDefaultStringIfNull7.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull7.solve(var_methodGetKey_index, var_literal3);

		setDefaultStringIfNull8.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull8.solve(var_methodGetKey_throws, var_literal1);

		setDefaultStringIfNull9.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull9.solve(var_methodPerformGetKey_body, var_literal2);

		setDefaultStringIfNull10.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull10.solve(var_methodPerformGetKey_parameters, var_literal5);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_exprOutputSizeLiteral_value.setBound(false);
			var_exprIterationLiteral_value.setBound(false);
			var_exprAlgNameLiteral_value.setBound(false);
			var_javaPackage_name.setBound(false);
			var_methodPerformGetKey_throws.setBound(false);
			var_methodPerformGetKey_index.setBound(false);
			var_methodGetKey_index.setBound(false);
			var_methodGetKey_throws.setBound(false);
			var_methodPerformGetKey_body.setBound(false);
			var_methodPerformGetKey_parameters.setBound(false);
			setDefaultStringIfNull0.solve(var_task_package, var_literal4);
			eq1.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);
			eq2.solve(var_exprIterationLiteral_value, var_kda_iterations);
			eq3.solve(var_exprAlgNameLiteral_value, var_kda_name);
			eq4.solve(var_task_package, var_javaPackage_name);
			setDefaultStringIfNull5.solve(var_methodPerformGetKey_throws, var_literal1);
			setDefaultStringIfNull6.solve(var_methodPerformGetKey_index, var_literal0);
			setDefaultStringIfNull7.solve(var_methodGetKey_index, var_literal3);
			setDefaultStringIfNull8.solve(var_methodGetKey_throws, var_literal1);
			setDefaultStringIfNull9.solve(var_methodPerformGetKey_body, var_literal2);
			setDefaultStringIfNull10.solve(var_methodPerformGetKey_parameters, var_literal5);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("exprOutputSizeLiteral", "value", var_exprOutputSizeLiteral_value.getValue());
				__helper.setValue("exprIterationLiteral", "value", var_exprIterationLiteral_value.getValue());
				__helper.setValue("exprAlgNameLiteral", "value", var_exprAlgNameLiteral_value.getValue());
				__helper.setValue("javaPackage", "name", var_javaPackage_name.getValue());
				__helper.setValue("methodPerformGetKey", "throws", var_methodPerformGetKey_throws.getValue());
				__helper.setValue("methodPerformGetKey", "index", var_methodPerformGetKey_index.getValue());
				__helper.setValue("methodGetKey", "index", var_methodGetKey_index.getValue());
				__helper.setValue("methodGetKey", "throws", var_methodGetKey_throws.getValue());
				__helper.setValue("methodPerformGetKey", "body", var_methodPerformGetKey_body.getValue());
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
		ruleResult.setRule("SecurePasswordTask");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("exprIterationLiteral", "index", 2, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprAlgNameLiteral", "index", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("pwdDeclaration", "name", "pwd", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("pwdDeclaration", "type", "char[]", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("pwdDeclaration", "index", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprRetGetKey", "name", "performGetKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "name", "performGetKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "type", "SecretKey ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformGetKey", "modifier", "private", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprOutputSizeLiteral", "index", 3, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("task", "description", "SecurePassword", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprPwdName", "index", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprPwdName", "identifier", "pwd", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("statRetGetKey", "return", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodGetKey", "modifier", "public", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodGetKey", "type", "SecretKey ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodGetKey", "name", "getKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("jcu", "name", "KeyDeriv", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_kda_outputSize = CSPFactoryHelper.eINSTANCE.createVariable("kda", true, csp);
		var_kda_outputSize.setValue(__helper.getValue("kda", "outputSize"));
		var_kda_outputSize.setType("String");

		Variable var_exprIterationLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprIterationLiteral",
				true, csp);
		var_exprIterationLiteral_value.setValue(__helper.getValue("exprIterationLiteral", "value"));
		var_exprIterationLiteral_value.setType("String");

		Variable var_kda_iterations = CSPFactoryHelper.eINSTANCE.createVariable("kda", true, csp);
		var_kda_iterations.setValue(__helper.getValue("kda", "iterations"));
		var_kda_iterations.setType("String");

		Variable var_exprAlgNameLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprAlgNameLiteral", true,
				csp);
		var_exprAlgNameLiteral_value.setValue(__helper.getValue("exprAlgNameLiteral", "value"));
		var_exprAlgNameLiteral_value.setType("String");

		Variable var_exprOutputSizeLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprOutputSizeLiteral",
				true, csp);
		var_exprOutputSizeLiteral_value.setValue(__helper.getValue("exprOutputSizeLiteral", "value"));
		var_exprOutputSizeLiteral_value.setType("String");

		Variable var_kda_name = CSPFactoryHelper.eINSTANCE.createVariable("kda", true, csp);
		var_kda_name.setValue(__helper.getValue("kda", "name"));
		var_kda_name.setType("String");

		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage", true, csp);
		var_javaPackage_name.setValue(__helper.getValue("javaPackage", "name"));
		var_javaPackage_name.setType("String");

		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_package.setValue(__helper.getValue("task", "package"));
		var_task_package.setType("String");

		Variable var_methodPerformGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey", true,
				csp);
		var_methodPerformGetKey_throws.setValue(__helper.getValue("methodPerformGetKey", "throws"));
		var_methodPerformGetKey_throws.setType("String");

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue(0);
		var_literal0.setType("");

		Variable var_methodPerformGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey", true,
				csp);
		var_methodPerformGetKey_index.setValue(__helper.getValue("methodPerformGetKey", "index"));
		var_methodPerformGetKey_index.setType("int");

		Variable var_methodGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey", true, csp);
		var_methodGetKey_throws.setValue(__helper.getValue("methodGetKey", "throws"));
		var_methodGetKey_throws.setType("String");

		Variable var_methodGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey", true, csp);
		var_methodGetKey_index.setValue(__helper.getValue("methodGetKey", "index"));
		var_methodGetKey_index.setType("int");

		Variable var_literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal1.setValue("NoSuchAlgorithmException, InvalidKeySpecException");
		var_literal1.setType("");

		Variable var_literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal2.setValue(
				"{\n  byte[] salt=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(salt);\n  PBEKeySpec spec=new PBEKeySpec(pwd,salt,iterations,outputSize);\n  SecretKeyFactory skf=SecretKeyFactory.getInstance(algName);\n  return new SecretKeySpec(skf.generateSecret(spec).getEncoded(),\"AES\");\n}\n");
		var_literal2.setType("");

		Variable var_methodPerformGetKey_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey", true,
				csp);
		var_methodPerformGetKey_body.setValue(__helper.getValue("methodPerformGetKey", "body"));
		var_methodPerformGetKey_body.setType("String");

		Variable var_literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal3.setValue(1);
		var_literal3.setType("");

		Variable var_literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal4.setValue("Crypto");
		var_literal4.setType("");

		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey",
				true, csp);
		var_methodPerformGetKey_parameters.setValue(__helper.getValue("methodPerformGetKey", "parameters"));
		var_methodPerformGetKey_parameters.setType("String");

		Variable var_literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal5.setValue("char [] pwd,String algName,int iterations,int outputSize");
		var_literal5.setType("");

		SetDefaultStringIfNull setDefaultStringIfNull0 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull0);

		SetDefaultStringIfNull setDefaultStringIfNull1 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull1);

		SetDefaultStringIfNull setDefaultStringIfNull2 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull2);

		SetDefaultStringIfNull setDefaultStringIfNull3 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull3);

		SetDefaultStringIfNull setDefaultStringIfNull4 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull4);

		SetDefaultStringIfNull setDefaultStringIfNull5 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull5);

		Eq eq6 = new Eq();
		csp.getConstraints().add(eq6);

		Eq eq7 = new Eq();
		csp.getConstraints().add(eq7);

		Eq eq8 = new Eq();
		csp.getConstraints().add(eq8);

		Eq eq9 = new Eq();
		csp.getConstraints().add(eq9);

		SetDefaultStringIfNull setDefaultStringIfNull10 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull10);

		setDefaultStringIfNull0.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull0.solve(var_methodPerformGetKey_throws, var_literal1);

		setDefaultStringIfNull1.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull1.solve(var_methodPerformGetKey_index, var_literal0);

		setDefaultStringIfNull2.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull2.solve(var_methodGetKey_index, var_literal3);

		setDefaultStringIfNull3.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull3.solve(var_methodGetKey_throws, var_literal1);

		setDefaultStringIfNull4.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull4.solve(var_methodPerformGetKey_body, var_literal2);

		setDefaultStringIfNull5.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull5.solve(var_methodPerformGetKey_parameters, var_literal5);

		eq6.setRuleName("SecurePasswordTask");
		eq6.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);

		eq7.setRuleName("SecurePasswordTask");
		eq7.solve(var_exprIterationLiteral_value, var_kda_iterations);

		eq8.setRuleName("SecurePasswordTask");
		eq8.solve(var_exprAlgNameLiteral_value, var_kda_name);

		eq9.setRuleName("SecurePasswordTask");
		eq9.solve(var_task_package, var_javaPackage_name);

		setDefaultStringIfNull10.setRuleName("SecurePasswordTask");
		setDefaultStringIfNull10.solve(var_task_package, var_literal4);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_kda_outputSize.setBound(false);
			var_kda_iterations.setBound(false);
			var_kda_name.setBound(false);
			var_task_package.setBound(false);
			var_task_package.setBound(false);
			setDefaultStringIfNull0.solve(var_methodPerformGetKey_throws, var_literal1);
			setDefaultStringIfNull1.solve(var_methodPerformGetKey_index, var_literal0);
			setDefaultStringIfNull2.solve(var_methodGetKey_index, var_literal3);
			setDefaultStringIfNull3.solve(var_methodGetKey_throws, var_literal1);
			setDefaultStringIfNull4.solve(var_methodPerformGetKey_body, var_literal2);
			setDefaultStringIfNull5.solve(var_methodPerformGetKey_parameters, var_literal5);
			eq6.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);
			eq7.solve(var_exprIterationLiteral_value, var_kda_iterations);
			eq8.solve(var_exprAlgNameLiteral_value, var_kda_name);
			eq9.solve(var_task_package, var_javaPackage_name);
			setDefaultStringIfNull10.solve(var_task_package, var_literal4);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("kda", "outputSize", var_kda_outputSize.getValue());
				__helper.setValue("kda", "iterations", var_kda_iterations.getValue());
				__helper.setValue("kda", "name", var_kda_name.getValue());
				__helper.setValue("task", "package", var_task_package.getValue());
				__helper.setValue("task", "package", var_task_package.getValue());
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

		Object[] result1_black = SecurePasswordTaskImpl.pattern_SecurePasswordTask_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SecurePasswordTaskImpl.pattern_SecurePasswordTask_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		JavaLiteral exprIterationLiteral = (JavaLiteral) result2_bindingAndBlack[0];
		JavaPackage javaPackage = (JavaPackage) result2_bindingAndBlack[1];
		JavaLiteral exprAlgNameLiteral = (JavaLiteral) result2_bindingAndBlack[2];
		JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result2_bindingAndBlack[3];
		JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result2_bindingAndBlack[4];
		KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result2_bindingAndBlack[5];
		JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result2_bindingAndBlack[6];
		JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result2_bindingAndBlack[7];
		Task task = (Task) result2_bindingAndBlack[8];
		JavaName exprPwdName = (JavaName) result2_bindingAndBlack[9];
		JavaStatement statRetGetKey = (JavaStatement) result2_bindingAndBlack[10];
		JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result2_bindingAndBlack[11];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result2_bindingAndBlack[12];

		Object[] result3_bindingAndBlack = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBBBB(this, exprIterationLiteral,
						javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey,
						exprOutputSizeLiteral, task, exprPwdName, statRetGetKey, methodGetKey, jcu, sourceMatch,
						targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[exprIterationLiteral] = " + exprIterationLiteral + ", " + "[javaPackage] = " + javaPackage
					+ ", " + "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", " + "[pwdDeclaration] = "
					+ pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", " + "[kda] = " + kda + ", "
					+ "[methodPerformGetKey] = " + methodPerformGetKey + ", " + "[exprOutputSizeLiteral] = "
					+ exprOutputSizeLiteral + ", " + "[task] = " + task + ", " + "[exprPwdName] = " + exprPwdName + ", "
					+ "[statRetGetKey] = " + statRetGetKey + ", " + "[methodGetKey] = " + methodGetKey + ", "
					+ "[jcu] = " + jcu + ", " + "[sourceMatch] = " + sourceMatch + ", " + "[targetMatch] = "
					+ targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SecurePasswordTaskImpl.pattern_SecurePasswordTask_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_24_6_createcorrespondence_blackBBBBBBBBBBBBBB(exprIterationLiteral,
								javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda,
								methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName, statRetGetKey,
								methodGetKey, jcu, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[exprIterationLiteral] = "
							+ exprIterationLiteral + ", " + "[javaPackage] = " + javaPackage + ", "
							+ "[exprAlgNameLiteral] = " + exprAlgNameLiteral + ", " + "[pwdDeclaration] = "
							+ pwdDeclaration + ", " + "[exprRetGetKey] = " + exprRetGetKey + ", " + "[kda] = " + kda
							+ ", " + "[methodPerformGetKey] = " + methodPerformGetKey + ", "
							+ "[exprOutputSizeLiteral] = " + exprOutputSizeLiteral + ", " + "[task] = " + task + ", "
							+ "[exprPwdName] = " + exprPwdName + ", " + "[statRetGetKey] = " + statRetGetKey + ", "
							+ "[methodGetKey] = " + methodGetKey + ", " + "[jcu] = " + jcu + ", " + "[ccMatch] = "
							+ ccMatch + ".");
				}
				SecurePasswordTaskImpl.pattern_SecurePasswordTask_24_6_createcorrespondence_greenFBBFBBB(javaPackage,
						kda, task, jcu, ccMatch);
				//nothing TaskToJavaPackage t2c = (TaskToJavaPackage) result6_green[0];
				//nothing KeyDerivationAlgorithmToJcu tc = (KeyDerivationAlgorithmToJcu) result6_green[3];

				Object[] result7_black = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SecurePasswordTaskImpl.pattern_SecurePasswordTask_24_7_addtoreturnedresult_greenBB(result, ccMatch);

			}

		} else {
		}
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			Task task, JavaName exprPwdName, JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey,
			JavaCompilationUnit jcu, Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("NoSuchAlgorithmException, InvalidKeySpecException");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue(0);
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue(1);
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue(
				"{\n  byte[] salt=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(salt);\n  PBEKeySpec spec=new PBEKeySpec(pwd,salt,iterations,outputSize);\n  SecretKeyFactory skf=SecretKeyFactory.getInstance(algName);\n  return new SecretKeySpec(skf.generateSecret(spec).getEncoded(),\"AES\");\n}\n");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("char [] pwd,String algName,int iterations,int outputSize");
		literal4.setType("");

		// Create attribute variables
		Variable var_exprOutputSizeLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprOutputSizeLiteral.value", true, csp);
		var_exprOutputSizeLiteral_value.setValue(exprOutputSizeLiteral.getValue());
		var_exprOutputSizeLiteral_value.setType("String");
		Variable var_kda_outputSize = CSPFactoryHelper.eINSTANCE.createVariable("kda.outputSize", true, csp);
		var_kda_outputSize.setValue(kda.getOutputSize());
		var_kda_outputSize.setType("String");
		Variable var_exprIterationLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprIterationLiteral.value", true, csp);
		var_exprIterationLiteral_value.setValue(exprIterationLiteral.getValue());
		var_exprIterationLiteral_value.setType("String");
		Variable var_kda_iterations = CSPFactoryHelper.eINSTANCE.createVariable("kda.iterations", true, csp);
		var_kda_iterations.setValue(kda.getIterations());
		var_kda_iterations.setType("String");
		Variable var_exprAlgNameLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprAlgNameLiteral.value",
				true, csp);
		var_exprAlgNameLiteral_value.setValue(exprAlgNameLiteral.getValue());
		var_exprAlgNameLiteral_value.setType("String");
		Variable var_kda_name = CSPFactoryHelper.eINSTANCE.createVariable("kda.name", true, csp);
		var_kda_name.setValue(kda.getName());
		var_kda_name.setType("String");
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", true, csp);
		var_task_package.setValue(task.getPackage());
		var_task_package.setType("String");
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", true, csp);
		var_javaPackage_name.setValue(javaPackage.getName());
		var_javaPackage_name.setType("String");
		Variable var_methodPerformGetKey_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.throws", true, csp);
		var_methodPerformGetKey_throws.setValue(methodPerformGetKey.getThrows());
		var_methodPerformGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.index",
				true, csp);
		var_methodPerformGetKey_index.setValue(methodPerformGetKey.getIndex());
		var_methodPerformGetKey_index.setType("int");
		Variable var_methodGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.index", true, csp);
		var_methodGetKey_index.setValue(methodGetKey.getIndex());
		var_methodGetKey_index.setType("int");
		Variable var_methodGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.throws", true, csp);
		var_methodGetKey_throws.setValue(methodGetKey.getThrows());
		var_methodGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.body",
				true, csp);
		var_methodPerformGetKey_body.setValue(methodPerformGetKey.getBody());
		var_methodPerformGetKey_body.setType("String");
		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.parameters", true, csp);
		var_methodPerformGetKey_parameters.setValue(methodPerformGetKey.getParameters());
		var_methodPerformGetKey_parameters.setType("String");

		// Create unbound variables

		// Create constraints
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();

		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);
		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);

		// Solve CSP
		eq.setRuleName("NoRuleName");
		eq.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_exprIterationLiteral_value, var_kda_iterations);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_exprAlgNameLiteral_value, var_kda_name);
		eq_2.setRuleName("NoRuleName");
		eq_2.solve(var_task_package, var_javaPackage_name);
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_methodPerformGetKey_throws, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformGetKey_index, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_methodGetKey_index, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_methodGetKey_throws, literal0);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_methodPerformGetKey_body, literal3);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_methodPerformGetKey_parameters, literal4);
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
	public boolean checkDEC_FWD(KeyDerivationAlgorithm kda, Task task) {// 
		Object[] result1_black = SecurePasswordTaskImpl.pattern_SecurePasswordTask_27_1_matchtggpattern_blackBB(kda,
				task);
		if (result1_black != null) {
			SecurePasswordTaskImpl.pattern_SecurePasswordTask_27_1_matchtggpattern_greenB(task);

			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_27_2_expressionF();
		} else {
			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {// 
		Object[] result1_black = SecurePasswordTaskImpl
				.pattern_SecurePasswordTask_28_1_matchtggpattern_blackBBBBBBBBBBB(exprIterationLiteral, javaPackage,
						exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral,
						exprPwdName, statRetGetKey, methodGetKey, jcu);
		if (result1_black != null) {
			SecurePasswordTaskImpl.pattern_SecurePasswordTask_28_1_matchtggpattern_greenBBBBBBBBBB(exprIterationLiteral,
					exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral,
					exprPwdName, statRetGetKey, methodGetKey, jcu);

			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_28_2_expressionF();
		} else {
			return SecurePasswordTaskImpl.pattern_SecurePasswordTask_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = SecurePasswordTaskImpl.pattern_SecurePasswordTask_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SecurePasswordTaskImpl.pattern_SecurePasswordTask_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = SecurePasswordTaskImpl.pattern_SecurePasswordTask_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = SecurePasswordTaskImpl
					.pattern_SecurePasswordTask_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch, ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SecurePasswordTaskImpl.pattern_SecurePasswordTask_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = SecurePasswordTaskImpl
						.pattern_SecurePasswordTask_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				SecurePasswordTaskImpl.pattern_SecurePasswordTask_29_6_perform_greenFFFFFFFFFFFFFFFBB(ruleResult, csp);
				//nothing JavaLiteral exprIterationLiteral = (JavaLiteral) result6_green[0];
				//nothing TaskToJavaPackage t2c = (TaskToJavaPackage) result6_green[1];
				//nothing JavaPackage javaPackage = (JavaPackage) result6_green[2];
				//nothing JavaLiteral exprAlgNameLiteral = (JavaLiteral) result6_green[3];
				//nothing JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result6_green[4];
				//nothing JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result6_green[5];
				//nothing KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result6_green[6];
				//nothing JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result6_green[7];
				//nothing JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result6_green[8];
				//nothing KeyDerivationAlgorithmToJcu tc = (KeyDerivationAlgorithmToJcu) result6_green[9];
				//nothing Task task = (Task) result6_green[10];
				//nothing JavaName exprPwdName = (JavaName) result6_green[11];
				//nothing JavaStatement statRetGetKey = (JavaStatement) result6_green[12];
				//nothing JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result6_green[13];
				//nothing JavaCompilationUnit jcu = (JavaCompilationUnit) result6_green[14];

			} else {
			}

		} else {
		}
		return SecurePasswordTaskImpl.pattern_SecurePasswordTask_29_7_expressionFB(ruleResult);
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
		literal0.setValue("NoSuchAlgorithmException, InvalidKeySpecException");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue(0);
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue(1);
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue(
				"{\n  byte[] salt=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(salt);\n  PBEKeySpec spec=new PBEKeySpec(pwd,salt,iterations,outputSize);\n  SecretKeyFactory skf=SecretKeyFactory.getInstance(algName);\n  return new SecretKeySpec(skf.generateSecret(spec).getEncoded(),\"AES\");\n}\n");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("Crypto");
		literal4.setType("");
		Variable literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal5", true, csp);
		literal5.setValue("char [] pwd,String algName,int iterations,int outputSize");
		literal5.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_exprOutputSizeLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprOutputSizeLiteral.value", csp);
		var_exprOutputSizeLiteral_value.setType("String");
		Variable var_kda_outputSize = CSPFactoryHelper.eINSTANCE.createVariable("kda.outputSize", csp);
		var_kda_outputSize.setType("String");
		Variable var_exprIterationLiteral_value = CSPFactoryHelper.eINSTANCE
				.createVariable("exprIterationLiteral.value", csp);
		var_exprIterationLiteral_value.setType("String");
		Variable var_kda_iterations = CSPFactoryHelper.eINSTANCE.createVariable("kda.iterations", csp);
		var_kda_iterations.setType("String");
		Variable var_exprAlgNameLiteral_value = CSPFactoryHelper.eINSTANCE.createVariable("exprAlgNameLiteral.value",
				csp);
		var_exprAlgNameLiteral_value.setType("String");
		Variable var_kda_name = CSPFactoryHelper.eINSTANCE.createVariable("kda.name", csp);
		var_kda_name.setType("String");
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", csp);
		var_task_package.setType("String");
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", csp);
		var_javaPackage_name.setType("String");
		Variable var_methodPerformGetKey_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.throws", csp);
		var_methodPerformGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.index",
				csp);
		var_methodPerformGetKey_index.setType("int");
		Variable var_methodGetKey_index = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.index", csp);
		var_methodGetKey_index.setType("int");
		Variable var_methodGetKey_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodGetKey.throws", csp);
		var_methodGetKey_throws.setType("String");
		Variable var_methodPerformGetKey_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformGetKey.body",
				csp);
		var_methodPerformGetKey_body.setType("String");
		Variable var_methodPerformGetKey_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformGetKey.parameters", csp);
		var_methodPerformGetKey_parameters.setType("String");

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_5 = new SetDefaultStringIfNull();
		Eq eq = new Eq();
		Eq eq_0 = new Eq();
		Eq eq_1 = new Eq();
		Eq eq_2 = new Eq();

		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);
		csp.getConstraints().add(setDefaultStringIfNull_5);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(eq_0);
		csp.getConstraints().add(eq_1);
		csp.getConstraints().add(eq_2);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_methodPerformGetKey_throws, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformGetKey_index, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_methodGetKey_index, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_methodGetKey_throws, literal0);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_methodPerformGetKey_body, literal3);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_task_package, literal4);
		setDefaultStringIfNull_5.setRuleName("NoRuleName");
		setDefaultStringIfNull_5.solve(var_methodPerformGetKey_parameters, literal5);
		eq.setRuleName("NoRuleName");
		eq.solve(var_task_package, var_javaPackage_name);
		eq_0.setRuleName("NoRuleName");
		eq_0.solve(var_exprOutputSizeLiteral_value, var_kda_outputSize);
		eq_1.setRuleName("NoRuleName");
		eq_1.solve(var_exprIterationLiteral_value, var_kda_iterations);
		eq_2.setRuleName("NoRuleName");
		eq_2.solve(var_exprAlgNameLiteral_value, var_kda_name);

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
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (KeyDerivationAlgorithm) arguments.get(1),
					(Task) arguments.get(2));
		case RulesPackage.SECURE_PASSWORD_TASK___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (KeyDerivationAlgorithm) arguments.get(1),
					(Task) arguments.get(2));
			return null;
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_KEYDERIVATIONALGORITHM_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (KeyDerivationAlgorithm) arguments.get(1),
					(Task) arguments.get(2));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_KEYDERIVATIONALGORITHM_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(KeyDerivationAlgorithm) arguments.get(1), (Task) arguments.get(2));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SECURE_PASSWORD_TASK___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_BWD__MATCH_JAVALITERAL_JAVAPACKAGE_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaLiteral) arguments.get(1),
					(JavaPackage) arguments.get(2), (JavaLiteral) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaOpaqueMethod) arguments.get(6), (JavaLiteral) arguments.get(7), (JavaName) arguments.get(8),
					(JavaStatement) arguments.get(9), (JavaWorkflowMethod) arguments.get(10),
					(JavaCompilationUnit) arguments.get(11));
		case RulesPackage.SECURE_PASSWORD_TASK___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVALITERAL_JAVAPACKAGE_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaLiteral) arguments.get(1),
					(JavaPackage) arguments.get(2), (JavaLiteral) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaOpaqueMethod) arguments.get(6), (JavaLiteral) arguments.get(7), (JavaName) arguments.get(8),
					(JavaStatement) arguments.get(9), (JavaWorkflowMethod) arguments.get(10),
					(JavaCompilationUnit) arguments.get(11));
			return null;
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVALITERAL_JAVAPACKAGE_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaLiteral) arguments.get(1),
					(JavaPackage) arguments.get(2), (JavaLiteral) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaOpaqueMethod) arguments.get(6), (JavaLiteral) arguments.get(7), (JavaName) arguments.get(8),
					(JavaStatement) arguments.get(9), (JavaWorkflowMethod) arguments.get(10),
					(JavaCompilationUnit) arguments.get(11));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVALITERAL_JAVAPACKAGE_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (JavaLiteral) arguments.get(1),
					(JavaPackage) arguments.get(2), (JavaLiteral) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaOpaqueMethod) arguments.get(6), (JavaLiteral) arguments.get(7), (JavaName) arguments.get(8),
					(JavaStatement) arguments.get(9), (JavaWorkflowMethod) arguments.get(10),
					(JavaCompilationUnit) arguments.get(11));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SECURE_PASSWORD_TASK___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_7__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_7((EMoflonEdge) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_SOLVE_CSP_CC__JAVALITERAL_JAVAPACKAGE_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_KEYDERIVATIONALGORITHM_JAVAOPAQUEMETHOD_JAVALITERAL_TASK_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((JavaLiteral) arguments.get(0), (JavaPackage) arguments.get(1),
					(JavaLiteral) arguments.get(2), (JavaVariableDeclaration) arguments.get(3),
					(JavaMethodInvocation) arguments.get(4), (KeyDerivationAlgorithm) arguments.get(5),
					(JavaOpaqueMethod) arguments.get(6), (JavaLiteral) arguments.get(7), (Task) arguments.get(8),
					(JavaName) arguments.get(9), (JavaStatement) arguments.get(10),
					(JavaWorkflowMethod) arguments.get(11), (JavaCompilationUnit) arguments.get(12),
					(Match) arguments.get(13), (Match) arguments.get(14));
		case RulesPackage.SECURE_PASSWORD_TASK___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___CHECK_DEC_FWD__KEYDERIVATIONALGORITHM_TASK:
			return checkDEC_FWD((KeyDerivationAlgorithm) arguments.get(0), (Task) arguments.get(1));
		case RulesPackage.SECURE_PASSWORD_TASK___CHECK_DEC_BWD__JAVALITERAL_JAVAPACKAGE_JAVALITERAL_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVAOPAQUEMETHOD_JAVALITERAL_JAVANAME_JAVASTATEMENT_JAVAWORKFLOWMETHOD_JAVACOMPILATIONUNIT:
			return checkDEC_BWD((JavaLiteral) arguments.get(0), (JavaPackage) arguments.get(1),
					(JavaLiteral) arguments.get(2), (JavaVariableDeclaration) arguments.get(3),
					(JavaMethodInvocation) arguments.get(4), (JavaOpaqueMethod) arguments.get(5),
					(JavaLiteral) arguments.get(6), (JavaName) arguments.get(7), (JavaStatement) arguments.get(8),
					(JavaWorkflowMethod) arguments.get(9), (JavaCompilationUnit) arguments.get(10));
		case RulesPackage.SECURE_PASSWORD_TASK___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.SECURE_PASSWORD_TASK___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.SECURE_PASSWORD_TASK___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SecurePasswordTask_0_1_initialbindings_blackBBBB(SecurePasswordTask _this,
			Match match, KeyDerivationAlgorithm kda, Task task) {
		return new Object[] { _this, match, kda, task };
	}

	public static final Object[] pattern_SecurePasswordTask_0_2_SolveCSP_bindingFBBBB(SecurePasswordTask _this,
			Match match, KeyDerivationAlgorithm kda, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, kda, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, kda, task };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SecurePasswordTask_0_2_SolveCSP_bindingAndBlackFBBBB(SecurePasswordTask _this,
			Match match, KeyDerivationAlgorithm kda, Task task) {
		Object[] result_pattern_SecurePasswordTask_0_2_SolveCSP_binding = pattern_SecurePasswordTask_0_2_SolveCSP_bindingFBBBB(
				_this, match, kda, task);
		if (result_pattern_SecurePasswordTask_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SecurePasswordTask_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SecurePasswordTask_0_2_SolveCSP_black = pattern_SecurePasswordTask_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SecurePasswordTask_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, kda, task };
			}
		}
		return null;
	}

	public static final boolean pattern_SecurePasswordTask_0_3_CheckCSP_expressionFBB(SecurePasswordTask _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_0_4_collectelementstobetranslated_blackBBB(Match match,
			KeyDerivationAlgorithm kda, Task task) {
		return new Object[] { match, kda, task };
	}

	public static final Object[] pattern_SecurePasswordTask_0_4_collectelementstobetranslated_greenBBBF(Match match,
			KeyDerivationAlgorithm kda, Task task) {
		EMoflonEdge task__kda____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(kda);
		match.getToBeTranslatedNodes().add(task);
		String task__kda____algorithms_name_prime = "algorithms";
		task__kda____algorithms.setSrc(task);
		task__kda____algorithms.setTrg(kda);
		match.getToBeTranslatedEdges().add(task__kda____algorithms);
		task__kda____algorithms.setName(task__kda____algorithms_name_prime);
		return new Object[] { match, kda, task, task__kda____algorithms };
	}

	public static final Object[] pattern_SecurePasswordTask_0_5_collectcontextelements_blackBBB(Match match,
			KeyDerivationAlgorithm kda, Task task) {
		return new Object[] { match, kda, task };
	}

	public static final void pattern_SecurePasswordTask_0_6_registerobjectstomatch_expressionBBBB(
			SecurePasswordTask _this, Match match, KeyDerivationAlgorithm kda, Task task) {
		_this.registerObjectsToMatch_FWD(match, kda, task);

	}

	public static final boolean pattern_SecurePasswordTask_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SecurePasswordTask_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("kda");
		EObject _localVariable_1 = isApplicableMatch.getObject("task");
		EObject tmpKda = _localVariable_0;
		EObject tmpTask = _localVariable_1;
		if (tmpKda instanceof KeyDerivationAlgorithm) {
			KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) tmpKda;
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				return new Object[] { kda, task, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_1_1_performtransformation_blackBBFBB(
			KeyDerivationAlgorithm kda, Task task, SecurePasswordTask _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { kda, task, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_1_1_performtransformation_bindingAndBlackFFFBB(
			SecurePasswordTask _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SecurePasswordTask_1_1_performtransformation_binding = pattern_SecurePasswordTask_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_SecurePasswordTask_1_1_performtransformation_binding != null) {
			KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result_pattern_SecurePasswordTask_1_1_performtransformation_binding[0];
			Task task = (Task) result_pattern_SecurePasswordTask_1_1_performtransformation_binding[1];

			Object[] result_pattern_SecurePasswordTask_1_1_performtransformation_black = pattern_SecurePasswordTask_1_1_performtransformation_blackBBFBB(
					kda, task, _this, isApplicableMatch);
			if (result_pattern_SecurePasswordTask_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SecurePasswordTask_1_1_performtransformation_black[2];

				return new Object[] { kda, task, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_1_1_performtransformation_greenFFFFFFBFFFBFFFFB(
			KeyDerivationAlgorithm kda, Task task, CSP csp) {
		JavaLiteral exprIterationLiteral = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		JavaPackage javaPackage = SimpleJavaFactory.eINSTANCE.createJavaPackage();
		JavaLiteral exprAlgNameLiteral = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		JavaVariableDeclaration pwdDeclaration = SimpleJavaFactory.eINSTANCE.createJavaVariableDeclaration();
		JavaMethodInvocation exprRetGetKey = SimpleJavaFactory.eINSTANCE.createJavaMethodInvocation();
		JavaOpaqueMethod methodPerformGetKey = SimpleJavaFactory.eINSTANCE.createJavaOpaqueMethod();
		JavaLiteral exprOutputSizeLiteral = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		KeyDerivationAlgorithmToJcu tc = CryptoConfigToJavaFactory.eINSTANCE.createKeyDerivationAlgorithmToJcu();
		JavaName exprPwdName = SimpleJavaFactory.eINSTANCE.createJavaName();
		JavaStatement statRetGetKey = SimpleJavaFactory.eINSTANCE.createJavaStatement();
		JavaWorkflowMethod methodGetKey = SimpleJavaFactory.eINSTANCE.createJavaWorkflowMethod();
		JavaCompilationUnit jcu = SimpleJavaFactory.eINSTANCE.createJavaCompilationUnit();
		int exprIterationLiteral_index_prime = Integer.valueOf(2);
		Object _localVariable_0 = csp.getValue("exprIterationLiteral", "value");
		Object _localVariable_1 = csp.getValue("javaPackage", "name");
		int exprAlgNameLiteral_index_prime = Integer.valueOf(1);
		Object _localVariable_2 = csp.getValue("exprAlgNameLiteral", "value");
		String pwdDeclaration_name_prime = "pwd";
		String pwdDeclaration_type_prime = "char[]";
		int pwdDeclaration_index_prime = Integer.valueOf(0);
		String exprRetGetKey_name_prime = "performGetKey";
		String methodPerformGetKey_name_prime = "performGetKey";
		String methodPerformGetKey_type_prime = "SecretKey ";
		String methodPerformGetKey_modifier_prime = "private";
		Object _localVariable_3 = csp.getValue("methodPerformGetKey", "throws");
		Object _localVariable_4 = csp.getValue("methodPerformGetKey", "index");
		Object _localVariable_5 = csp.getValue("methodPerformGetKey", "body");
		Object _localVariable_6 = csp.getValue("methodPerformGetKey", "parameters");
		int exprOutputSizeLiteral_index_prime = Integer.valueOf(3);
		Object _localVariable_7 = csp.getValue("exprOutputSizeLiteral", "value");
		int exprPwdName_index_prime = Integer.valueOf(0);
		String exprPwdName_identifier_prime = "pwd";
		boolean statRetGetKey_return_prime = Boolean.valueOf(true);
		String methodGetKey_modifier_prime = "public";
		String methodGetKey_type_prime = "SecretKey ";
		String methodGetKey_name_prime = "getKey";
		Object _localVariable_8 = csp.getValue("methodGetKey", "index");
		Object _localVariable_9 = csp.getValue("methodGetKey", "throws");
		String jcu_name_prime = "KeyDeriv";
		t2c.setSource(task);
		t2c.setTarget(javaPackage);
		exprRetGetKey.getArguments().add(exprAlgNameLiteral);
		exprRetGetKey.getArguments().add(exprIterationLiteral);
		exprRetGetKey.getArguments().add(exprOutputSizeLiteral);
		tc.setSource(kda);
		exprRetGetKey.getArguments().add(exprPwdName);
		statRetGetKey.setExpr(exprRetGetKey);
		methodGetKey.getStatements().add(statRetGetKey);
		methodGetKey.getParams().add(pwdDeclaration);
		javaPackage.getCunits().add(jcu);
		jcu.getMethods().add(methodGetKey);
		jcu.getMethods().add(methodPerformGetKey);
		tc.setTarget(jcu);
		exprIterationLiteral.setIndex(Integer.valueOf(exprIterationLiteral_index_prime));
		String exprIterationLiteral_value_prime = (String) _localVariable_0;
		String javaPackage_name_prime = (String) _localVariable_1;
		exprAlgNameLiteral.setIndex(Integer.valueOf(exprAlgNameLiteral_index_prime));
		String exprAlgNameLiteral_value_prime = (String) _localVariable_2;
		pwdDeclaration.setName(pwdDeclaration_name_prime);
		pwdDeclaration.setType(pwdDeclaration_type_prime);
		pwdDeclaration.setIndex(Integer.valueOf(pwdDeclaration_index_prime));
		exprRetGetKey.setName(exprRetGetKey_name_prime);
		methodPerformGetKey.setName(methodPerformGetKey_name_prime);
		methodPerformGetKey.setType(methodPerformGetKey_type_prime);
		methodPerformGetKey.setModifier(methodPerformGetKey_modifier_prime);
		String methodPerformGetKey_throws_prime = (String) _localVariable_3;
		int methodPerformGetKey_index_prime = (int) _localVariable_4;
		String methodPerformGetKey_body_prime = (String) _localVariable_5;
		String methodPerformGetKey_parameters_prime = (String) _localVariable_6;
		exprOutputSizeLiteral.setIndex(Integer.valueOf(exprOutputSizeLiteral_index_prime));
		String exprOutputSizeLiteral_value_prime = (String) _localVariable_7;
		exprPwdName.setIndex(Integer.valueOf(exprPwdName_index_prime));
		exprPwdName.setIdentifier(exprPwdName_identifier_prime);
		statRetGetKey.setReturn(Boolean.valueOf(statRetGetKey_return_prime));
		methodGetKey.setModifier(methodGetKey_modifier_prime);
		methodGetKey.setType(methodGetKey_type_prime);
		methodGetKey.setName(methodGetKey_name_prime);
		int methodGetKey_index_prime = (int) _localVariable_8;
		String methodGetKey_throws_prime = (String) _localVariable_9;
		jcu.setName(jcu_name_prime);
		exprIterationLiteral.setValue(exprIterationLiteral_value_prime);
		javaPackage.setName(javaPackage_name_prime);
		exprAlgNameLiteral.setValue(exprAlgNameLiteral_value_prime);
		methodPerformGetKey.setThrows(methodPerformGetKey_throws_prime);
		methodPerformGetKey.setIndex(Integer.valueOf(methodPerformGetKey_index_prime));
		methodPerformGetKey.setBody(methodPerformGetKey_body_prime);
		methodPerformGetKey.setParameters(methodPerformGetKey_parameters_prime);
		exprOutputSizeLiteral.setValue(exprOutputSizeLiteral_value_prime);
		methodGetKey.setIndex(Integer.valueOf(methodGetKey_index_prime));
		methodGetKey.setThrows(methodGetKey_throws_prime);
		return new Object[] { exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
				jcu, csp };
	}

	public static final Object[] pattern_SecurePasswordTask_1_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, TaskToJavaPackage t2c, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			KeyDerivationAlgorithmToJcu tc, Task task, JavaName exprPwdName, JavaStatement statRetGetKey,
			JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					return new Object[] { exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration,
							exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName,
							statRetGetKey, methodGetKey, jcu };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_1_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, TaskToJavaPackage t2c, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			KeyDerivationAlgorithmToJcu tc, Task task, JavaName exprPwdName, JavaStatement statRetGetKey,
			JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(exprIterationLiteral);
		ruleresult.getCreatedLinkElements().add(t2c);
		ruleresult.getCreatedElements().add(javaPackage);
		ruleresult.getCreatedElements().add(exprAlgNameLiteral);
		ruleresult.getCreatedElements().add(pwdDeclaration);
		ruleresult.getCreatedElements().add(exprRetGetKey);
		ruleresult.getTranslatedElements().add(kda);
		ruleresult.getCreatedElements().add(methodPerformGetKey);
		ruleresult.getCreatedElements().add(exprOutputSizeLiteral);
		ruleresult.getCreatedLinkElements().add(tc);
		ruleresult.getTranslatedElements().add(task);
		ruleresult.getCreatedElements().add(exprPwdName);
		ruleresult.getCreatedElements().add(statRetGetKey);
		ruleresult.getCreatedElements().add(methodGetKey);
		ruleresult.getCreatedElements().add(jcu);
		return new Object[] { ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration,
				exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey,
				methodGetKey, jcu };
	}

	public static final Object[] pattern_SecurePasswordTask_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c, EObject javaPackage,
			EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		if (!exprIterationLiteral.equals(t2c)) {
			if (!exprIterationLiteral.equals(javaPackage)) {
				if (!exprIterationLiteral.equals(pwdDeclaration)) {
					if (!exprIterationLiteral.equals(exprRetGetKey)) {
						if (!exprIterationLiteral.equals(kda)) {
							if (!exprIterationLiteral.equals(methodPerformGetKey)) {
								if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
									if (!exprIterationLiteral.equals(tc)) {
										if (!exprIterationLiteral.equals(task)) {
											if (!exprIterationLiteral.equals(exprPwdName)) {
												if (!exprIterationLiteral.equals(statRetGetKey)) {
													if (!exprIterationLiteral.equals(methodGetKey)) {
														if (!exprIterationLiteral.equals(jcu)) {
															if (!t2c.equals(tc)) {
																if (!t2c.equals(task)) {
																	if (!javaPackage.equals(t2c)) {
																		if (!javaPackage.equals(pwdDeclaration)) {
																			if (!javaPackage.equals(kda)) {
																				if (!javaPackage
																						.equals(methodPerformGetKey)) {
																					if (!javaPackage.equals(tc)) {
																						if (!javaPackage.equals(task)) {
																							if (!javaPackage.equals(
																									statRetGetKey)) {
																								if (!javaPackage.equals(
																										methodGetKey)) {
																									if (!javaPackage
																											.equals(jcu)) {
																										if (!exprAlgNameLiteral
																												.equals(exprIterationLiteral)) {
																											if (!exprAlgNameLiteral
																													.equals(t2c)) {
																												if (!exprAlgNameLiteral
																														.equals(javaPackage)) {
																													if (!exprAlgNameLiteral
																															.equals(pwdDeclaration)) {
																														if (!exprAlgNameLiteral
																																.equals(exprRetGetKey)) {
																															if (!exprAlgNameLiteral
																																	.equals(kda)) {
																																if (!exprAlgNameLiteral
																																		.equals(methodPerformGetKey)) {
																																	if (!exprAlgNameLiteral
																																			.equals(exprOutputSizeLiteral)) {
																																		if (!exprAlgNameLiteral
																																				.equals(tc)) {
																																			if (!exprAlgNameLiteral
																																					.equals(task)) {
																																				if (!exprAlgNameLiteral
																																						.equals(exprPwdName)) {
																																					if (!exprAlgNameLiteral
																																							.equals(statRetGetKey)) {
																																						if (!exprAlgNameLiteral
																																								.equals(methodGetKey)) {
																																							if (!exprAlgNameLiteral
																																									.equals(jcu)) {
																																								if (!pwdDeclaration
																																										.equals(t2c)) {
																																									if (!pwdDeclaration
																																											.equals(tc)) {
																																										if (!pwdDeclaration
																																												.equals(task)) {
																																											if (!pwdDeclaration
																																													.equals(statRetGetKey)) {
																																												if (!exprRetGetKey
																																														.equals(t2c)) {
																																													if (!exprRetGetKey
																																															.equals(javaPackage)) {
																																														if (!exprRetGetKey
																																																.equals(pwdDeclaration)) {
																																															if (!exprRetGetKey
																																																	.equals(kda)) {
																																																if (!exprRetGetKey
																																																		.equals(methodPerformGetKey)) {
																																																	if (!exprRetGetKey
																																																			.equals(tc)) {
																																																		if (!exprRetGetKey
																																																				.equals(task)) {
																																																			if (!exprRetGetKey
																																																					.equals(statRetGetKey)) {
																																																				if (!exprRetGetKey
																																																						.equals(methodGetKey)) {
																																																					if (!exprRetGetKey
																																																							.equals(jcu)) {
																																																						if (!kda.equals(
																																																								t2c)) {
																																																							if (!kda.equals(
																																																									pwdDeclaration)) {
																																																								if (!kda.equals(
																																																										methodPerformGetKey)) {
																																																									if (!kda.equals(
																																																											tc)) {
																																																										if (!kda.equals(
																																																												task)) {
																																																											if (!kda.equals(
																																																													statRetGetKey)) {
																																																												if (!kda.equals(
																																																														methodGetKey)) {
																																																													if (!methodPerformGetKey
																																																															.equals(t2c)) {
																																																														if (!methodPerformGetKey
																																																																.equals(pwdDeclaration)) {
																																																															if (!methodPerformGetKey
																																																																	.equals(tc)) {
																																																																if (!methodPerformGetKey
																																																																		.equals(task)) {
																																																																	if (!methodPerformGetKey
																																																																			.equals(statRetGetKey)) {
																																																																		if (!exprOutputSizeLiteral
																																																																				.equals(t2c)) {
																																																																			if (!exprOutputSizeLiteral
																																																																					.equals(javaPackage)) {
																																																																				if (!exprOutputSizeLiteral
																																																																						.equals(pwdDeclaration)) {
																																																																					if (!exprOutputSizeLiteral
																																																																							.equals(exprRetGetKey)) {
																																																																						if (!exprOutputSizeLiteral
																																																																								.equals(kda)) {
																																																																							if (!exprOutputSizeLiteral
																																																																									.equals(methodPerformGetKey)) {
																																																																								if (!exprOutputSizeLiteral
																																																																										.equals(tc)) {
																																																																									if (!exprOutputSizeLiteral
																																																																											.equals(task)) {
																																																																										if (!exprOutputSizeLiteral
																																																																												.equals(exprPwdName)) {
																																																																											if (!exprOutputSizeLiteral
																																																																													.equals(statRetGetKey)) {
																																																																												if (!exprOutputSizeLiteral
																																																																														.equals(methodGetKey)) {
																																																																													if (!exprOutputSizeLiteral
																																																																															.equals(jcu)) {
																																																																														if (!task
																																																																																.equals(tc)) {
																																																																															if (!exprPwdName
																																																																																	.equals(t2c)) {
																																																																																if (!exprPwdName
																																																																																		.equals(javaPackage)) {
																																																																																	if (!exprPwdName
																																																																																			.equals(pwdDeclaration)) {
																																																																																		if (!exprPwdName
																																																																																				.equals(exprRetGetKey)) {
																																																																																			if (!exprPwdName
																																																																																					.equals(kda)) {
																																																																																				if (!exprPwdName
																																																																																						.equals(methodPerformGetKey)) {
																																																																																					if (!exprPwdName
																																																																																							.equals(tc)) {
																																																																																						if (!exprPwdName
																																																																																								.equals(task)) {
																																																																																							if (!exprPwdName
																																																																																									.equals(statRetGetKey)) {
																																																																																								if (!exprPwdName
																																																																																										.equals(methodGetKey)) {
																																																																																									if (!exprPwdName
																																																																																											.equals(jcu)) {
																																																																																										if (!statRetGetKey
																																																																																												.equals(t2c)) {
																																																																																											if (!statRetGetKey
																																																																																													.equals(tc)) {
																																																																																												if (!statRetGetKey
																																																																																														.equals(task)) {
																																																																																													if (!methodGetKey
																																																																																															.equals(t2c)) {
																																																																																														if (!methodGetKey
																																																																																																.equals(pwdDeclaration)) {
																																																																																															if (!methodGetKey
																																																																																																	.equals(methodPerformGetKey)) {
																																																																																																if (!methodGetKey
																																																																																																		.equals(tc)) {
																																																																																																	if (!methodGetKey
																																																																																																			.equals(task)) {
																																																																																																		if (!methodGetKey
																																																																																																				.equals(statRetGetKey)) {
																																																																																																			if (!jcu.equals(
																																																																																																					t2c)) {
																																																																																																				if (!jcu.equals(
																																																																																																						pwdDeclaration)) {
																																																																																																					if (!jcu.equals(
																																																																																																							kda)) {
																																																																																																						if (!jcu.equals(
																																																																																																								methodPerformGetKey)) {
																																																																																																							if (!jcu.equals(
																																																																																																									tc)) {
																																																																																																								if (!jcu.equals(
																																																																																																										task)) {
																																																																																																									if (!jcu.equals(
																																																																																																											statRetGetKey)) {
																																																																																																										if (!jcu.equals(
																																																																																																												methodGetKey)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													exprIterationLiteral,
																																																																																																													t2c,
																																																																																																													javaPackage,
																																																																																																													exprAlgNameLiteral,
																																																																																																													pwdDeclaration,
																																																																																																													exprRetGetKey,
																																																																																																													kda,
																																																																																																													methodPerformGetKey,
																																																																																																													exprOutputSizeLiteral,
																																																																																																													tc,
																																																																																																													task,
																																																																																																													exprPwdName,
																																																																																																													statRetGetKey,
																																																																																																													methodGetKey,
																																																																																																													jcu };
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

	public static final Object[] pattern_SecurePasswordTask_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c, EObject javaPackage,
			EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__statRetGetKey____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprPwdName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__javaPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetGetKey__exprRetGetKey____expr = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tc__kda____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__task____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__kda____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tc__jcu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__pwdDeclaration____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SecurePasswordTask";
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String jcu__methodGetKey____methods_name_prime = "methods";
		String methodGetKey__statRetGetKey____statements_name_prime = "statements";
		String exprRetGetKey__exprPwdName____arguments_name_prime = "arguments";
		String jcu__methodPerformGetKey____methods_name_prime = "methods";
		String t2c__javaPackage____target_name_prime = "target";
		String statRetGetKey__exprRetGetKey____expr_name_prime = "expr";
		String exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime = "arguments";
		String tc__kda____source_name_prime = "source";
		String t2c__task____source_name_prime = "source";
		String task__kda____algorithms_name_prime = "algorithms";
		String tc__jcu____target_name_prime = "target";
		String methodGetKey__pwdDeclaration____params_name_prime = "params";
		String exprRetGetKey__exprAlgNameLiteral____arguments_name_prime = "arguments";
		String exprRetGetKey__exprIterationLiteral____arguments_name_prime = "arguments";
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		ruleresult.getCreatedEdges().add(javaPackage__jcu____cunits);
		jcu__methodGetKey____methods.setSrc(jcu);
		jcu__methodGetKey____methods.setTrg(methodGetKey);
		ruleresult.getCreatedEdges().add(jcu__methodGetKey____methods);
		methodGetKey__statRetGetKey____statements.setSrc(methodGetKey);
		methodGetKey__statRetGetKey____statements.setTrg(statRetGetKey);
		ruleresult.getCreatedEdges().add(methodGetKey__statRetGetKey____statements);
		exprRetGetKey__exprPwdName____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprPwdName____arguments.setTrg(exprPwdName);
		ruleresult.getCreatedEdges().add(exprRetGetKey__exprPwdName____arguments);
		jcu__methodPerformGetKey____methods.setSrc(jcu);
		jcu__methodPerformGetKey____methods.setTrg(methodPerformGetKey);
		ruleresult.getCreatedEdges().add(jcu__methodPerformGetKey____methods);
		t2c__javaPackage____target.setSrc(t2c);
		t2c__javaPackage____target.setTrg(javaPackage);
		ruleresult.getCreatedEdges().add(t2c__javaPackage____target);
		statRetGetKey__exprRetGetKey____expr.setSrc(statRetGetKey);
		statRetGetKey__exprRetGetKey____expr.setTrg(exprRetGetKey);
		ruleresult.getCreatedEdges().add(statRetGetKey__exprRetGetKey____expr);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setTrg(exprOutputSizeLiteral);
		ruleresult.getCreatedEdges().add(exprRetGetKey__exprOutputSizeLiteral____arguments);
		tc__kda____source.setSrc(tc);
		tc__kda____source.setTrg(kda);
		ruleresult.getCreatedEdges().add(tc__kda____source);
		t2c__task____source.setSrc(t2c);
		t2c__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2c__task____source);
		task__kda____algorithms.setSrc(task);
		task__kda____algorithms.setTrg(kda);
		ruleresult.getTranslatedEdges().add(task__kda____algorithms);
		tc__jcu____target.setSrc(tc);
		tc__jcu____target.setTrg(jcu);
		ruleresult.getCreatedEdges().add(tc__jcu____target);
		methodGetKey__pwdDeclaration____params.setSrc(methodGetKey);
		methodGetKey__pwdDeclaration____params.setTrg(pwdDeclaration);
		ruleresult.getCreatedEdges().add(methodGetKey__pwdDeclaration____params);
		exprRetGetKey__exprAlgNameLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprAlgNameLiteral____arguments.setTrg(exprAlgNameLiteral);
		ruleresult.getCreatedEdges().add(exprRetGetKey__exprAlgNameLiteral____arguments);
		exprRetGetKey__exprIterationLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprIterationLiteral____arguments.setTrg(exprIterationLiteral);
		ruleresult.getCreatedEdges().add(exprRetGetKey__exprIterationLiteral____arguments);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		jcu__methodGetKey____methods.setName(jcu__methodGetKey____methods_name_prime);
		methodGetKey__statRetGetKey____statements.setName(methodGetKey__statRetGetKey____statements_name_prime);
		exprRetGetKey__exprPwdName____arguments.setName(exprRetGetKey__exprPwdName____arguments_name_prime);
		jcu__methodPerformGetKey____methods.setName(jcu__methodPerformGetKey____methods_name_prime);
		t2c__javaPackage____target.setName(t2c__javaPackage____target_name_prime);
		statRetGetKey__exprRetGetKey____expr.setName(statRetGetKey__exprRetGetKey____expr_name_prime);
		exprRetGetKey__exprOutputSizeLiteral____arguments
				.setName(exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime);
		tc__kda____source.setName(tc__kda____source_name_prime);
		t2c__task____source.setName(t2c__task____source_name_prime);
		task__kda____algorithms.setName(task__kda____algorithms_name_prime);
		tc__jcu____target.setName(tc__jcu____target_name_prime);
		methodGetKey__pwdDeclaration____params.setName(methodGetKey__pwdDeclaration____params_name_prime);
		exprRetGetKey__exprAlgNameLiteral____arguments
				.setName(exprRetGetKey__exprAlgNameLiteral____arguments_name_prime);
		exprRetGetKey__exprIterationLiteral____arguments
				.setName(exprRetGetKey__exprIterationLiteral____arguments_name_prime);
		return new Object[] { ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration,
				exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey,
				methodGetKey, jcu, javaPackage__jcu____cunits, jcu__methodGetKey____methods,
				methodGetKey__statRetGetKey____statements, exprRetGetKey__exprPwdName____arguments,
				jcu__methodPerformGetKey____methods, t2c__javaPackage____target, statRetGetKey__exprRetGetKey____expr,
				exprRetGetKey__exprOutputSizeLiteral____arguments, tc__kda____source, t2c__task____source,
				task__kda____algorithms, tc__jcu____target, methodGetKey__pwdDeclaration____params,
				exprRetGetKey__exprAlgNameLiteral____arguments, exprRetGetKey__exprIterationLiteral____arguments };
	}

	public static final void pattern_SecurePasswordTask_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			SecurePasswordTask _this, PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c,
			EObject javaPackage, EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		_this.registerObjects_FWD(ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral,
				pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName,
				statRetGetKey, methodGetKey, jcu);

	}

	public static final PerformRuleResult pattern_SecurePasswordTask_1_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_2_1_preparereturnvalue_bindingFB(SecurePasswordTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SecurePasswordTask _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_2_1_preparereturnvalue_bindingAndBlackFFB(
			SecurePasswordTask _this) {
		Object[] result_pattern_SecurePasswordTask_2_1_preparereturnvalue_binding = pattern_SecurePasswordTask_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SecurePasswordTask_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SecurePasswordTask_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SecurePasswordTask_2_1_preparereturnvalue_black = pattern_SecurePasswordTask_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SecurePasswordTask_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SecurePasswordTask_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SecurePasswordTask";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SecurePasswordTask_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("kda");
		EObject _localVariable_1 = match.getObject("task");
		EObject tmpKda = _localVariable_0;
		EObject tmpTask = _localVariable_1;
		if (tmpKda instanceof KeyDerivationAlgorithm) {
			KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) tmpKda;
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				return new Object[] { kda, task, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SecurePasswordTask_2_2_corematch_blackBBB(KeyDerivationAlgorithm kda,
			Task task, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String task_description = task.getDescription();
		if (task_description.equals("SecurePassword")) {
			_result.add(new Object[] { kda, task, match });
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_SecurePasswordTask_2_3_findcontext_blackBB(
			KeyDerivationAlgorithm kda, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (task.getAlgorithms().contains(kda)) {
			String task_description = task.getDescription();
			if (task_description.equals("SecurePassword")) {
				_result.add(new Object[] { kda, task });
			}

		}
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_2_3_findcontext_greenBBFF(KeyDerivationAlgorithm kda,
			Task task) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge task__kda____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String task__kda____algorithms_name_prime = "algorithms";
		isApplicableMatch.getAllContextElements().add(kda);
		isApplicableMatch.getAllContextElements().add(task);
		task__kda____algorithms.setSrc(task);
		task__kda____algorithms.setTrg(kda);
		isApplicableMatch.getAllContextElements().add(task__kda____algorithms);
		task__kda____algorithms.setName(task__kda____algorithms_name_prime);
		return new Object[] { kda, task, isApplicableMatch, task__kda____algorithms };
	}

	public static final Object[] pattern_SecurePasswordTask_2_4_solveCSP_bindingFBBBB(SecurePasswordTask _this,
			IsApplicableMatch isApplicableMatch, KeyDerivationAlgorithm kda, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, kda, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, kda, task };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SecurePasswordTask_2_4_solveCSP_bindingAndBlackFBBBB(SecurePasswordTask _this,
			IsApplicableMatch isApplicableMatch, KeyDerivationAlgorithm kda, Task task) {
		Object[] result_pattern_SecurePasswordTask_2_4_solveCSP_binding = pattern_SecurePasswordTask_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, kda, task);
		if (result_pattern_SecurePasswordTask_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SecurePasswordTask_2_4_solveCSP_binding[0];

			Object[] result_pattern_SecurePasswordTask_2_4_solveCSP_black = pattern_SecurePasswordTask_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SecurePasswordTask_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, kda, task };
			}
		}
		return null;
	}

	public static final boolean pattern_SecurePasswordTask_2_5_checkCSP_expressionFBB(SecurePasswordTask _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SecurePasswordTask_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SecurePasswordTask";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SecurePasswordTask_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_10_1_initialbindings_blackBBBBBBBBBBBBB(
			SecurePasswordTask _this, Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					return new Object[] { _this, match, exprIterationLiteral, javaPackage, exprAlgNameLiteral,
							pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName,
							statRetGetKey, methodGetKey, jcu };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_10_2_SolveCSP_bindingFBBBBBBBBBBBBB(
			SecurePasswordTask _this, Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, exprIterationLiteral, javaPackage,
				exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral,
				exprPwdName, statRetGetKey, methodGetKey, jcu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, exprIterationLiteral, javaPackage, exprAlgNameLiteral,
					pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName,
					statRetGetKey, methodGetKey, jcu };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SecurePasswordTask_10_2_SolveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			SecurePasswordTask _this, Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		Object[] result_pattern_SecurePasswordTask_10_2_SolveCSP_binding = pattern_SecurePasswordTask_10_2_SolveCSP_bindingFBBBBBBBBBBBBB(
				_this, match, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu);
		if (result_pattern_SecurePasswordTask_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SecurePasswordTask_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SecurePasswordTask_10_2_SolveCSP_black = pattern_SecurePasswordTask_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SecurePasswordTask_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, exprIterationLiteral, javaPackage, exprAlgNameLiteral,
						pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName,
						statRetGetKey, methodGetKey, jcu };
			}
		}
		return null;
	}

	public static final boolean pattern_SecurePasswordTask_10_3_CheckCSP_expressionFBB(SecurePasswordTask _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_10_4_collectelementstobetranslated_blackBBBBBBBBBBBB(
			Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					return new Object[] { match, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
							exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey,
							methodGetKey, jcu };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_10_4_collectelementstobetranslated_greenBBBBBBBBBBBBFFFFFFFFFF(
			Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__statRetGetKey____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprPwdName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetGetKey__exprRetGetKey____expr = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__pwdDeclaration____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(exprIterationLiteral);
		match.getToBeTranslatedNodes().add(javaPackage);
		match.getToBeTranslatedNodes().add(exprAlgNameLiteral);
		match.getToBeTranslatedNodes().add(pwdDeclaration);
		match.getToBeTranslatedNodes().add(exprRetGetKey);
		match.getToBeTranslatedNodes().add(methodPerformGetKey);
		match.getToBeTranslatedNodes().add(exprOutputSizeLiteral);
		match.getToBeTranslatedNodes().add(exprPwdName);
		match.getToBeTranslatedNodes().add(statRetGetKey);
		match.getToBeTranslatedNodes().add(methodGetKey);
		match.getToBeTranslatedNodes().add(jcu);
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String jcu__methodGetKey____methods_name_prime = "methods";
		String methodGetKey__statRetGetKey____statements_name_prime = "statements";
		String exprRetGetKey__exprPwdName____arguments_name_prime = "arguments";
		String jcu__methodPerformGetKey____methods_name_prime = "methods";
		String statRetGetKey__exprRetGetKey____expr_name_prime = "expr";
		String exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime = "arguments";
		String methodGetKey__pwdDeclaration____params_name_prime = "params";
		String exprRetGetKey__exprAlgNameLiteral____arguments_name_prime = "arguments";
		String exprRetGetKey__exprIterationLiteral____arguments_name_prime = "arguments";
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		match.getToBeTranslatedEdges().add(javaPackage__jcu____cunits);
		jcu__methodGetKey____methods.setSrc(jcu);
		jcu__methodGetKey____methods.setTrg(methodGetKey);
		match.getToBeTranslatedEdges().add(jcu__methodGetKey____methods);
		methodGetKey__statRetGetKey____statements.setSrc(methodGetKey);
		methodGetKey__statRetGetKey____statements.setTrg(statRetGetKey);
		match.getToBeTranslatedEdges().add(methodGetKey__statRetGetKey____statements);
		exprRetGetKey__exprPwdName____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprPwdName____arguments.setTrg(exprPwdName);
		match.getToBeTranslatedEdges().add(exprRetGetKey__exprPwdName____arguments);
		jcu__methodPerformGetKey____methods.setSrc(jcu);
		jcu__methodPerformGetKey____methods.setTrg(methodPerformGetKey);
		match.getToBeTranslatedEdges().add(jcu__methodPerformGetKey____methods);
		statRetGetKey__exprRetGetKey____expr.setSrc(statRetGetKey);
		statRetGetKey__exprRetGetKey____expr.setTrg(exprRetGetKey);
		match.getToBeTranslatedEdges().add(statRetGetKey__exprRetGetKey____expr);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setTrg(exprOutputSizeLiteral);
		match.getToBeTranslatedEdges().add(exprRetGetKey__exprOutputSizeLiteral____arguments);
		methodGetKey__pwdDeclaration____params.setSrc(methodGetKey);
		methodGetKey__pwdDeclaration____params.setTrg(pwdDeclaration);
		match.getToBeTranslatedEdges().add(methodGetKey__pwdDeclaration____params);
		exprRetGetKey__exprAlgNameLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprAlgNameLiteral____arguments.setTrg(exprAlgNameLiteral);
		match.getToBeTranslatedEdges().add(exprRetGetKey__exprAlgNameLiteral____arguments);
		exprRetGetKey__exprIterationLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprIterationLiteral____arguments.setTrg(exprIterationLiteral);
		match.getToBeTranslatedEdges().add(exprRetGetKey__exprIterationLiteral____arguments);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		jcu__methodGetKey____methods.setName(jcu__methodGetKey____methods_name_prime);
		methodGetKey__statRetGetKey____statements.setName(methodGetKey__statRetGetKey____statements_name_prime);
		exprRetGetKey__exprPwdName____arguments.setName(exprRetGetKey__exprPwdName____arguments_name_prime);
		jcu__methodPerformGetKey____methods.setName(jcu__methodPerformGetKey____methods_name_prime);
		statRetGetKey__exprRetGetKey____expr.setName(statRetGetKey__exprRetGetKey____expr_name_prime);
		exprRetGetKey__exprOutputSizeLiteral____arguments
				.setName(exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime);
		methodGetKey__pwdDeclaration____params.setName(methodGetKey__pwdDeclaration____params_name_prime);
		exprRetGetKey__exprAlgNameLiteral____arguments
				.setName(exprRetGetKey__exprAlgNameLiteral____arguments_name_prime);
		exprRetGetKey__exprIterationLiteral____arguments
				.setName(exprRetGetKey__exprIterationLiteral____arguments_name_prime);
		return new Object[] { match, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
				exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey,
				jcu, javaPackage__jcu____cunits, jcu__methodGetKey____methods,
				methodGetKey__statRetGetKey____statements, exprRetGetKey__exprPwdName____arguments,
				jcu__methodPerformGetKey____methods, statRetGetKey__exprRetGetKey____expr,
				exprRetGetKey__exprOutputSizeLiteral____arguments, methodGetKey__pwdDeclaration____params,
				exprRetGetKey__exprAlgNameLiteral____arguments, exprRetGetKey__exprIterationLiteral____arguments };
	}

	public static final Object[] pattern_SecurePasswordTask_10_5_collectcontextelements_blackBBBBBBBBBBBB(Match match,
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					return new Object[] { match, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
							exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey,
							methodGetKey, jcu };
				}
			}
		}
		return null;
	}

	public static final void pattern_SecurePasswordTask_10_6_registerobjectstomatch_expressionBBBBBBBBBBBBB(
			SecurePasswordTask _this, Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		_this.registerObjectsToMatch_BWD(match, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
				exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey,
				jcu);

	}

	public static final boolean pattern_SecurePasswordTask_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SecurePasswordTask_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_11_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("exprIterationLiteral");
		EObject _localVariable_1 = isApplicableMatch.getObject("javaPackage");
		EObject _localVariable_2 = isApplicableMatch.getObject("exprAlgNameLiteral");
		EObject _localVariable_3 = isApplicableMatch.getObject("pwdDeclaration");
		EObject _localVariable_4 = isApplicableMatch.getObject("exprRetGetKey");
		EObject _localVariable_5 = isApplicableMatch.getObject("methodPerformGetKey");
		EObject _localVariable_6 = isApplicableMatch.getObject("exprOutputSizeLiteral");
		EObject _localVariable_7 = isApplicableMatch.getObject("exprPwdName");
		EObject _localVariable_8 = isApplicableMatch.getObject("statRetGetKey");
		EObject _localVariable_9 = isApplicableMatch.getObject("methodGetKey");
		EObject _localVariable_10 = isApplicableMatch.getObject("jcu");
		EObject tmpExprIterationLiteral = _localVariable_0;
		EObject tmpJavaPackage = _localVariable_1;
		EObject tmpExprAlgNameLiteral = _localVariable_2;
		EObject tmpPwdDeclaration = _localVariable_3;
		EObject tmpExprRetGetKey = _localVariable_4;
		EObject tmpMethodPerformGetKey = _localVariable_5;
		EObject tmpExprOutputSizeLiteral = _localVariable_6;
		EObject tmpExprPwdName = _localVariable_7;
		EObject tmpStatRetGetKey = _localVariable_8;
		EObject tmpMethodGetKey = _localVariable_9;
		EObject tmpJcu = _localVariable_10;
		if (tmpExprIterationLiteral instanceof JavaLiteral) {
			JavaLiteral exprIterationLiteral = (JavaLiteral) tmpExprIterationLiteral;
			if (tmpJavaPackage instanceof JavaPackage) {
				JavaPackage javaPackage = (JavaPackage) tmpJavaPackage;
				if (tmpExprAlgNameLiteral instanceof JavaLiteral) {
					JavaLiteral exprAlgNameLiteral = (JavaLiteral) tmpExprAlgNameLiteral;
					if (tmpPwdDeclaration instanceof JavaVariableDeclaration) {
						JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) tmpPwdDeclaration;
						if (tmpExprRetGetKey instanceof JavaMethodInvocation) {
							JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) tmpExprRetGetKey;
							if (tmpMethodPerformGetKey instanceof JavaOpaqueMethod) {
								JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) tmpMethodPerformGetKey;
								if (tmpExprOutputSizeLiteral instanceof JavaLiteral) {
									JavaLiteral exprOutputSizeLiteral = (JavaLiteral) tmpExprOutputSizeLiteral;
									if (tmpExprPwdName instanceof JavaName) {
										JavaName exprPwdName = (JavaName) tmpExprPwdName;
										if (tmpStatRetGetKey instanceof JavaStatement) {
											JavaStatement statRetGetKey = (JavaStatement) tmpStatRetGetKey;
											if (tmpMethodGetKey instanceof JavaWorkflowMethod) {
												JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) tmpMethodGetKey;
												if (tmpJcu instanceof JavaCompilationUnit) {
													JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
													return new Object[] { exprIterationLiteral, javaPackage,
															exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
															methodPerformGetKey, exprOutputSizeLiteral, exprPwdName,
															statRetGetKey, methodGetKey, jcu, isApplicableMatch };
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

	public static final Object[] pattern_SecurePasswordTask_11_1_performtransformation_blackBBBBBBBBBBBFBB(
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu,
			SecurePasswordTask _this, IsApplicableMatch isApplicableMatch) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
						if (tmpCsp instanceof CSP) {
							CSP csp = (CSP) tmpCsp;
							return new Object[] { exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
									exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName,
									statRetGetKey, methodGetKey, jcu, csp, _this, isApplicableMatch };
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			SecurePasswordTask _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SecurePasswordTask_11_1_performtransformation_binding = pattern_SecurePasswordTask_11_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SecurePasswordTask_11_1_performtransformation_binding != null) {
			JavaLiteral exprIterationLiteral = (JavaLiteral) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[0];
			JavaPackage javaPackage = (JavaPackage) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[1];
			JavaLiteral exprAlgNameLiteral = (JavaLiteral) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[2];
			JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[3];
			JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[4];
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[5];
			JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[6];
			JavaName exprPwdName = (JavaName) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[7];
			JavaStatement statRetGetKey = (JavaStatement) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[8];
			JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[9];
			JavaCompilationUnit jcu = (JavaCompilationUnit) result_pattern_SecurePasswordTask_11_1_performtransformation_binding[10];

			Object[] result_pattern_SecurePasswordTask_11_1_performtransformation_black = pattern_SecurePasswordTask_11_1_performtransformation_blackBBBBBBBBBBBFBB(
					exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
					methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu, _this,
					isApplicableMatch);
			if (result_pattern_SecurePasswordTask_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SecurePasswordTask_11_1_performtransformation_black[11];

				return new Object[] { exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
						exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey,
						methodGetKey, jcu, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_11_1_performtransformation_greenFBFFFBB(
			JavaPackage javaPackage, JavaCompilationUnit jcu, CSP csp) {
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		KeyDerivationAlgorithm kda = CryptoAPIConfigFactory.eINSTANCE.createKeyDerivationAlgorithm();
		KeyDerivationAlgorithmToJcu tc = CryptoConfigToJavaFactory.eINSTANCE.createKeyDerivationAlgorithmToJcu();
		Task task = CryptoAPIConfigFactory.eINSTANCE.createTask();
		Object _localVariable_0 = csp.getValue("kda", "outputSize");
		Object _localVariable_1 = csp.getValue("kda", "iterations");
		Object _localVariable_2 = csp.getValue("kda", "name");
		String task_description_prime = "SecurePassword";
		Object _localVariable_3 = csp.getValue("task", "package");
		t2c.setTarget(javaPackage);
		tc.setSource(kda);
		tc.setTarget(jcu);
		t2c.setSource(task);
		task.getAlgorithms().add(kda);
		String kda_outputSize_prime = (String) _localVariable_0;
		String kda_iterations_prime = (String) _localVariable_1;
		String kda_name_prime = (String) _localVariable_2;
		task.setDescription(task_description_prime);
		String task_package_prime = (String) _localVariable_3;
		kda.setOutputSize(kda_outputSize_prime);
		kda.setIterations(kda_iterations_prime);
		kda.setName(kda_name_prime);
		task.setPackage(task_package_prime);
		return new Object[] { t2c, javaPackage, kda, tc, task, jcu, csp };
	}

	public static final Object[] pattern_SecurePasswordTask_11_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, TaskToJavaPackage t2c, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			KeyDerivationAlgorithmToJcu tc, Task task, JavaName exprPwdName, JavaStatement statRetGetKey,
			JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					return new Object[] { exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration,
							exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName,
							statRetGetKey, methodGetKey, jcu };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_11_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, TaskToJavaPackage t2c, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			KeyDerivationAlgorithmToJcu tc, Task task, JavaName exprPwdName, JavaStatement statRetGetKey,
			JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(exprIterationLiteral);
		ruleresult.getCreatedLinkElements().add(t2c);
		ruleresult.getTranslatedElements().add(javaPackage);
		ruleresult.getTranslatedElements().add(exprAlgNameLiteral);
		ruleresult.getTranslatedElements().add(pwdDeclaration);
		ruleresult.getTranslatedElements().add(exprRetGetKey);
		ruleresult.getCreatedElements().add(kda);
		ruleresult.getTranslatedElements().add(methodPerformGetKey);
		ruleresult.getTranslatedElements().add(exprOutputSizeLiteral);
		ruleresult.getCreatedLinkElements().add(tc);
		ruleresult.getCreatedElements().add(task);
		ruleresult.getTranslatedElements().add(exprPwdName);
		ruleresult.getTranslatedElements().add(statRetGetKey);
		ruleresult.getTranslatedElements().add(methodGetKey);
		ruleresult.getTranslatedElements().add(jcu);
		return new Object[] { ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration,
				exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey,
				methodGetKey, jcu };
	}

	public static final Object[] pattern_SecurePasswordTask_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c, EObject javaPackage,
			EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		if (!exprIterationLiteral.equals(t2c)) {
			if (!exprIterationLiteral.equals(javaPackage)) {
				if (!exprIterationLiteral.equals(pwdDeclaration)) {
					if (!exprIterationLiteral.equals(exprRetGetKey)) {
						if (!exprIterationLiteral.equals(kda)) {
							if (!exprIterationLiteral.equals(methodPerformGetKey)) {
								if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
									if (!exprIterationLiteral.equals(tc)) {
										if (!exprIterationLiteral.equals(task)) {
											if (!exprIterationLiteral.equals(exprPwdName)) {
												if (!exprIterationLiteral.equals(statRetGetKey)) {
													if (!exprIterationLiteral.equals(methodGetKey)) {
														if (!exprIterationLiteral.equals(jcu)) {
															if (!t2c.equals(tc)) {
																if (!t2c.equals(task)) {
																	if (!javaPackage.equals(t2c)) {
																		if (!javaPackage.equals(pwdDeclaration)) {
																			if (!javaPackage.equals(kda)) {
																				if (!javaPackage
																						.equals(methodPerformGetKey)) {
																					if (!javaPackage.equals(tc)) {
																						if (!javaPackage.equals(task)) {
																							if (!javaPackage.equals(
																									statRetGetKey)) {
																								if (!javaPackage.equals(
																										methodGetKey)) {
																									if (!javaPackage
																											.equals(jcu)) {
																										if (!exprAlgNameLiteral
																												.equals(exprIterationLiteral)) {
																											if (!exprAlgNameLiteral
																													.equals(t2c)) {
																												if (!exprAlgNameLiteral
																														.equals(javaPackage)) {
																													if (!exprAlgNameLiteral
																															.equals(pwdDeclaration)) {
																														if (!exprAlgNameLiteral
																																.equals(exprRetGetKey)) {
																															if (!exprAlgNameLiteral
																																	.equals(kda)) {
																																if (!exprAlgNameLiteral
																																		.equals(methodPerformGetKey)) {
																																	if (!exprAlgNameLiteral
																																			.equals(exprOutputSizeLiteral)) {
																																		if (!exprAlgNameLiteral
																																				.equals(tc)) {
																																			if (!exprAlgNameLiteral
																																					.equals(task)) {
																																				if (!exprAlgNameLiteral
																																						.equals(exprPwdName)) {
																																					if (!exprAlgNameLiteral
																																							.equals(statRetGetKey)) {
																																						if (!exprAlgNameLiteral
																																								.equals(methodGetKey)) {
																																							if (!exprAlgNameLiteral
																																									.equals(jcu)) {
																																								if (!pwdDeclaration
																																										.equals(t2c)) {
																																									if (!pwdDeclaration
																																											.equals(tc)) {
																																										if (!pwdDeclaration
																																												.equals(task)) {
																																											if (!pwdDeclaration
																																													.equals(statRetGetKey)) {
																																												if (!exprRetGetKey
																																														.equals(t2c)) {
																																													if (!exprRetGetKey
																																															.equals(javaPackage)) {
																																														if (!exprRetGetKey
																																																.equals(pwdDeclaration)) {
																																															if (!exprRetGetKey
																																																	.equals(kda)) {
																																																if (!exprRetGetKey
																																																		.equals(methodPerformGetKey)) {
																																																	if (!exprRetGetKey
																																																			.equals(tc)) {
																																																		if (!exprRetGetKey
																																																				.equals(task)) {
																																																			if (!exprRetGetKey
																																																					.equals(statRetGetKey)) {
																																																				if (!exprRetGetKey
																																																						.equals(methodGetKey)) {
																																																					if (!exprRetGetKey
																																																							.equals(jcu)) {
																																																						if (!kda.equals(
																																																								t2c)) {
																																																							if (!kda.equals(
																																																									pwdDeclaration)) {
																																																								if (!kda.equals(
																																																										methodPerformGetKey)) {
																																																									if (!kda.equals(
																																																											tc)) {
																																																										if (!kda.equals(
																																																												task)) {
																																																											if (!kda.equals(
																																																													statRetGetKey)) {
																																																												if (!kda.equals(
																																																														methodGetKey)) {
																																																													if (!methodPerformGetKey
																																																															.equals(t2c)) {
																																																														if (!methodPerformGetKey
																																																																.equals(pwdDeclaration)) {
																																																															if (!methodPerformGetKey
																																																																	.equals(tc)) {
																																																																if (!methodPerformGetKey
																																																																		.equals(task)) {
																																																																	if (!methodPerformGetKey
																																																																			.equals(statRetGetKey)) {
																																																																		if (!exprOutputSizeLiteral
																																																																				.equals(t2c)) {
																																																																			if (!exprOutputSizeLiteral
																																																																					.equals(javaPackage)) {
																																																																				if (!exprOutputSizeLiteral
																																																																						.equals(pwdDeclaration)) {
																																																																					if (!exprOutputSizeLiteral
																																																																							.equals(exprRetGetKey)) {
																																																																						if (!exprOutputSizeLiteral
																																																																								.equals(kda)) {
																																																																							if (!exprOutputSizeLiteral
																																																																									.equals(methodPerformGetKey)) {
																																																																								if (!exprOutputSizeLiteral
																																																																										.equals(tc)) {
																																																																									if (!exprOutputSizeLiteral
																																																																											.equals(task)) {
																																																																										if (!exprOutputSizeLiteral
																																																																												.equals(exprPwdName)) {
																																																																											if (!exprOutputSizeLiteral
																																																																													.equals(statRetGetKey)) {
																																																																												if (!exprOutputSizeLiteral
																																																																														.equals(methodGetKey)) {
																																																																													if (!exprOutputSizeLiteral
																																																																															.equals(jcu)) {
																																																																														if (!task
																																																																																.equals(tc)) {
																																																																															if (!exprPwdName
																																																																																	.equals(t2c)) {
																																																																																if (!exprPwdName
																																																																																		.equals(javaPackage)) {
																																																																																	if (!exprPwdName
																																																																																			.equals(pwdDeclaration)) {
																																																																																		if (!exprPwdName
																																																																																				.equals(exprRetGetKey)) {
																																																																																			if (!exprPwdName
																																																																																					.equals(kda)) {
																																																																																				if (!exprPwdName
																																																																																						.equals(methodPerformGetKey)) {
																																																																																					if (!exprPwdName
																																																																																							.equals(tc)) {
																																																																																						if (!exprPwdName
																																																																																								.equals(task)) {
																																																																																							if (!exprPwdName
																																																																																									.equals(statRetGetKey)) {
																																																																																								if (!exprPwdName
																																																																																										.equals(methodGetKey)) {
																																																																																									if (!exprPwdName
																																																																																											.equals(jcu)) {
																																																																																										if (!statRetGetKey
																																																																																												.equals(t2c)) {
																																																																																											if (!statRetGetKey
																																																																																													.equals(tc)) {
																																																																																												if (!statRetGetKey
																																																																																														.equals(task)) {
																																																																																													if (!methodGetKey
																																																																																															.equals(t2c)) {
																																																																																														if (!methodGetKey
																																																																																																.equals(pwdDeclaration)) {
																																																																																															if (!methodGetKey
																																																																																																	.equals(methodPerformGetKey)) {
																																																																																																if (!methodGetKey
																																																																																																		.equals(tc)) {
																																																																																																	if (!methodGetKey
																																																																																																			.equals(task)) {
																																																																																																		if (!methodGetKey
																																																																																																				.equals(statRetGetKey)) {
																																																																																																			if (!jcu.equals(
																																																																																																					t2c)) {
																																																																																																				if (!jcu.equals(
																																																																																																						pwdDeclaration)) {
																																																																																																					if (!jcu.equals(
																																																																																																							kda)) {
																																																																																																						if (!jcu.equals(
																																																																																																								methodPerformGetKey)) {
																																																																																																							if (!jcu.equals(
																																																																																																									tc)) {
																																																																																																								if (!jcu.equals(
																																																																																																										task)) {
																																																																																																									if (!jcu.equals(
																																																																																																											statRetGetKey)) {
																																																																																																										if (!jcu.equals(
																																																																																																												methodGetKey)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													exprIterationLiteral,
																																																																																																													t2c,
																																																																																																													javaPackage,
																																																																																																													exprAlgNameLiteral,
																																																																																																													pwdDeclaration,
																																																																																																													exprRetGetKey,
																																																																																																													kda,
																																																																																																													methodPerformGetKey,
																																																																																																													exprOutputSizeLiteral,
																																																																																																													tc,
																																																																																																													task,
																																																																																																													exprPwdName,
																																																																																																													statRetGetKey,
																																																																																																													methodGetKey,
																																																																																																													jcu };
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

	public static final Object[] pattern_SecurePasswordTask_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c, EObject javaPackage,
			EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__statRetGetKey____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprPwdName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__javaPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetGetKey__exprRetGetKey____expr = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tc__kda____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge t2c__task____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__kda____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge tc__jcu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__pwdDeclaration____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SecurePasswordTask";
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String jcu__methodGetKey____methods_name_prime = "methods";
		String methodGetKey__statRetGetKey____statements_name_prime = "statements";
		String exprRetGetKey__exprPwdName____arguments_name_prime = "arguments";
		String jcu__methodPerformGetKey____methods_name_prime = "methods";
		String t2c__javaPackage____target_name_prime = "target";
		String statRetGetKey__exprRetGetKey____expr_name_prime = "expr";
		String exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime = "arguments";
		String tc__kda____source_name_prime = "source";
		String t2c__task____source_name_prime = "source";
		String task__kda____algorithms_name_prime = "algorithms";
		String tc__jcu____target_name_prime = "target";
		String methodGetKey__pwdDeclaration____params_name_prime = "params";
		String exprRetGetKey__exprAlgNameLiteral____arguments_name_prime = "arguments";
		String exprRetGetKey__exprIterationLiteral____arguments_name_prime = "arguments";
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		ruleresult.getTranslatedEdges().add(javaPackage__jcu____cunits);
		jcu__methodGetKey____methods.setSrc(jcu);
		jcu__methodGetKey____methods.setTrg(methodGetKey);
		ruleresult.getTranslatedEdges().add(jcu__methodGetKey____methods);
		methodGetKey__statRetGetKey____statements.setSrc(methodGetKey);
		methodGetKey__statRetGetKey____statements.setTrg(statRetGetKey);
		ruleresult.getTranslatedEdges().add(methodGetKey__statRetGetKey____statements);
		exprRetGetKey__exprPwdName____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprPwdName____arguments.setTrg(exprPwdName);
		ruleresult.getTranslatedEdges().add(exprRetGetKey__exprPwdName____arguments);
		jcu__methodPerformGetKey____methods.setSrc(jcu);
		jcu__methodPerformGetKey____methods.setTrg(methodPerformGetKey);
		ruleresult.getTranslatedEdges().add(jcu__methodPerformGetKey____methods);
		t2c__javaPackage____target.setSrc(t2c);
		t2c__javaPackage____target.setTrg(javaPackage);
		ruleresult.getCreatedEdges().add(t2c__javaPackage____target);
		statRetGetKey__exprRetGetKey____expr.setSrc(statRetGetKey);
		statRetGetKey__exprRetGetKey____expr.setTrg(exprRetGetKey);
		ruleresult.getTranslatedEdges().add(statRetGetKey__exprRetGetKey____expr);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setTrg(exprOutputSizeLiteral);
		ruleresult.getTranslatedEdges().add(exprRetGetKey__exprOutputSizeLiteral____arguments);
		tc__kda____source.setSrc(tc);
		tc__kda____source.setTrg(kda);
		ruleresult.getCreatedEdges().add(tc__kda____source);
		t2c__task____source.setSrc(t2c);
		t2c__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2c__task____source);
		task__kda____algorithms.setSrc(task);
		task__kda____algorithms.setTrg(kda);
		ruleresult.getCreatedEdges().add(task__kda____algorithms);
		tc__jcu____target.setSrc(tc);
		tc__jcu____target.setTrg(jcu);
		ruleresult.getCreatedEdges().add(tc__jcu____target);
		methodGetKey__pwdDeclaration____params.setSrc(methodGetKey);
		methodGetKey__pwdDeclaration____params.setTrg(pwdDeclaration);
		ruleresult.getTranslatedEdges().add(methodGetKey__pwdDeclaration____params);
		exprRetGetKey__exprAlgNameLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprAlgNameLiteral____arguments.setTrg(exprAlgNameLiteral);
		ruleresult.getTranslatedEdges().add(exprRetGetKey__exprAlgNameLiteral____arguments);
		exprRetGetKey__exprIterationLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprIterationLiteral____arguments.setTrg(exprIterationLiteral);
		ruleresult.getTranslatedEdges().add(exprRetGetKey__exprIterationLiteral____arguments);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		jcu__methodGetKey____methods.setName(jcu__methodGetKey____methods_name_prime);
		methodGetKey__statRetGetKey____statements.setName(methodGetKey__statRetGetKey____statements_name_prime);
		exprRetGetKey__exprPwdName____arguments.setName(exprRetGetKey__exprPwdName____arguments_name_prime);
		jcu__methodPerformGetKey____methods.setName(jcu__methodPerformGetKey____methods_name_prime);
		t2c__javaPackage____target.setName(t2c__javaPackage____target_name_prime);
		statRetGetKey__exprRetGetKey____expr.setName(statRetGetKey__exprRetGetKey____expr_name_prime);
		exprRetGetKey__exprOutputSizeLiteral____arguments
				.setName(exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime);
		tc__kda____source.setName(tc__kda____source_name_prime);
		t2c__task____source.setName(t2c__task____source_name_prime);
		task__kda____algorithms.setName(task__kda____algorithms_name_prime);
		tc__jcu____target.setName(tc__jcu____target_name_prime);
		methodGetKey__pwdDeclaration____params.setName(methodGetKey__pwdDeclaration____params_name_prime);
		exprRetGetKey__exprAlgNameLiteral____arguments
				.setName(exprRetGetKey__exprAlgNameLiteral____arguments_name_prime);
		exprRetGetKey__exprIterationLiteral____arguments
				.setName(exprRetGetKey__exprIterationLiteral____arguments_name_prime);
		return new Object[] { ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration,
				exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey,
				methodGetKey, jcu, javaPackage__jcu____cunits, jcu__methodGetKey____methods,
				methodGetKey__statRetGetKey____statements, exprRetGetKey__exprPwdName____arguments,
				jcu__methodPerformGetKey____methods, t2c__javaPackage____target, statRetGetKey__exprRetGetKey____expr,
				exprRetGetKey__exprOutputSizeLiteral____arguments, tc__kda____source, t2c__task____source,
				task__kda____algorithms, tc__jcu____target, methodGetKey__pwdDeclaration____params,
				exprRetGetKey__exprAlgNameLiteral____arguments, exprRetGetKey__exprIterationLiteral____arguments };
	}

	public static final void pattern_SecurePasswordTask_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			SecurePasswordTask _this, PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject t2c,
			EObject javaPackage, EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject exprRetGetKey, EObject kda,
			EObject methodPerformGetKey, EObject exprOutputSizeLiteral, EObject tc, EObject task, EObject exprPwdName,
			EObject statRetGetKey, EObject methodGetKey, EObject jcu) {
		_this.registerObjects_BWD(ruleresult, exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral,
				pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName,
				statRetGetKey, methodGetKey, jcu);

	}

	public static final PerformRuleResult pattern_SecurePasswordTask_11_6_expressionFB(PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_12_1_preparereturnvalue_bindingFB(
			SecurePasswordTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SecurePasswordTask _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_12_1_preparereturnvalue_bindingAndBlackFFB(
			SecurePasswordTask _this) {
		Object[] result_pattern_SecurePasswordTask_12_1_preparereturnvalue_binding = pattern_SecurePasswordTask_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SecurePasswordTask_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SecurePasswordTask_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SecurePasswordTask_12_1_preparereturnvalue_black = pattern_SecurePasswordTask_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SecurePasswordTask_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SecurePasswordTask_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SecurePasswordTask";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SecurePasswordTask_12_2_corematch_bindingFFFFFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("exprIterationLiteral");
		EObject _localVariable_1 = match.getObject("javaPackage");
		EObject _localVariable_2 = match.getObject("exprAlgNameLiteral");
		EObject _localVariable_3 = match.getObject("pwdDeclaration");
		EObject _localVariable_4 = match.getObject("exprRetGetKey");
		EObject _localVariable_5 = match.getObject("methodPerformGetKey");
		EObject _localVariable_6 = match.getObject("exprOutputSizeLiteral");
		EObject _localVariable_7 = match.getObject("exprPwdName");
		EObject _localVariable_8 = match.getObject("statRetGetKey");
		EObject _localVariable_9 = match.getObject("methodGetKey");
		EObject _localVariable_10 = match.getObject("jcu");
		EObject tmpExprIterationLiteral = _localVariable_0;
		EObject tmpJavaPackage = _localVariable_1;
		EObject tmpExprAlgNameLiteral = _localVariable_2;
		EObject tmpPwdDeclaration = _localVariable_3;
		EObject tmpExprRetGetKey = _localVariable_4;
		EObject tmpMethodPerformGetKey = _localVariable_5;
		EObject tmpExprOutputSizeLiteral = _localVariable_6;
		EObject tmpExprPwdName = _localVariable_7;
		EObject tmpStatRetGetKey = _localVariable_8;
		EObject tmpMethodGetKey = _localVariable_9;
		EObject tmpJcu = _localVariable_10;
		if (tmpExprIterationLiteral instanceof JavaLiteral) {
			JavaLiteral exprIterationLiteral = (JavaLiteral) tmpExprIterationLiteral;
			if (tmpJavaPackage instanceof JavaPackage) {
				JavaPackage javaPackage = (JavaPackage) tmpJavaPackage;
				if (tmpExprAlgNameLiteral instanceof JavaLiteral) {
					JavaLiteral exprAlgNameLiteral = (JavaLiteral) tmpExprAlgNameLiteral;
					if (tmpPwdDeclaration instanceof JavaVariableDeclaration) {
						JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) tmpPwdDeclaration;
						if (tmpExprRetGetKey instanceof JavaMethodInvocation) {
							JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) tmpExprRetGetKey;
							if (tmpMethodPerformGetKey instanceof JavaOpaqueMethod) {
								JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) tmpMethodPerformGetKey;
								if (tmpExprOutputSizeLiteral instanceof JavaLiteral) {
									JavaLiteral exprOutputSizeLiteral = (JavaLiteral) tmpExprOutputSizeLiteral;
									if (tmpExprPwdName instanceof JavaName) {
										JavaName exprPwdName = (JavaName) tmpExprPwdName;
										if (tmpStatRetGetKey instanceof JavaStatement) {
											JavaStatement statRetGetKey = (JavaStatement) tmpStatRetGetKey;
											if (tmpMethodGetKey instanceof JavaWorkflowMethod) {
												JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) tmpMethodGetKey;
												if (tmpJcu instanceof JavaCompilationUnit) {
													JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
													return new Object[] { exprIterationLiteral, javaPackage,
															exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
															methodPerformGetKey, exprOutputSizeLiteral, exprPwdName,
															statRetGetKey, methodGetKey, jcu, match };
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

	public static final Iterable<Object[]> pattern_SecurePasswordTask_12_2_corematch_blackBBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					int exprIterationLiteral_index = exprIterationLiteral.getIndex();
					if (Integer.valueOf(exprIterationLiteral_index).equals(Integer.valueOf(2))) {
						int exprAlgNameLiteral_index = exprAlgNameLiteral.getIndex();
						if (Integer.valueOf(exprAlgNameLiteral_index).equals(Integer.valueOf(1))) {
							String pwdDeclaration_name = pwdDeclaration.getName();
							if (pwdDeclaration_name.equals("pwd")) {
								String pwdDeclaration_type = pwdDeclaration.getType();
								if (pwdDeclaration_type.equals("char[]")) {
									int pwdDeclaration_index = pwdDeclaration.getIndex();
									if (Integer.valueOf(pwdDeclaration_index).equals(Integer.valueOf(0))) {
										String exprRetGetKey_name = exprRetGetKey.getName();
										if (exprRetGetKey_name.equals("performGetKey")) {
											String methodPerformGetKey_name = methodPerformGetKey.getName();
											if (methodPerformGetKey_name.equals("performGetKey")) {
												String methodPerformGetKey_type = methodPerformGetKey.getType();
												if (methodPerformGetKey_type.equals("SecretKey ")) {
													String methodPerformGetKey_modifier = methodPerformGetKey
															.getModifier();
													if (methodPerformGetKey_modifier.equals("private")) {
														int exprOutputSizeLiteral_index = exprOutputSizeLiteral
																.getIndex();
														if (Integer.valueOf(exprOutputSizeLiteral_index)
																.equals(Integer.valueOf(3))) {
															int exprPwdName_index = exprPwdName.getIndex();
															if (Integer.valueOf(exprPwdName_index)
																	.equals(Integer.valueOf(0))) {
																String exprPwdName_identifier = exprPwdName
																		.getIdentifier();
																if (exprPwdName_identifier.equals("pwd")) {
																	boolean statRetGetKey_return = statRetGetKey
																			.isReturn();
																	if (Boolean.valueOf(statRetGetKey_return)
																			.equals(Boolean.valueOf(true))) {
																		String methodGetKey_modifier = methodGetKey
																				.getModifier();
																		if (methodGetKey_modifier.equals("public")) {
																			String methodGetKey_type = methodGetKey
																					.getType();
																			if (methodGetKey_type
																					.equals("SecretKey ")) {
																				String methodGetKey_name = methodGetKey
																						.getName();
																				if (methodGetKey_name
																						.equals("getKey")) {
																					String jcu_name = jcu.getName();
																					if (jcu_name.equals("KeyDeriv")) {
																						_result.add(new Object[] {
																								exprIterationLiteral,
																								javaPackage,
																								exprAlgNameLiteral,
																								pwdDeclaration,
																								exprRetGetKey,
																								methodPerformGetKey,
																								exprOutputSizeLiteral,
																								exprPwdName,
																								statRetGetKey,
																								methodGetKey, jcu,
																								match });
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
		return _result;
	}

	public static final Iterable<Object[]> pattern_SecurePasswordTask_12_3_findcontext_blackBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					if (javaPackage.getCunits().contains(jcu)) {
						if (jcu.getMethods().contains(methodGetKey)) {
							if (methodGetKey.getStatements().contains(statRetGetKey)) {
								if (exprRetGetKey.getArguments().contains(exprPwdName)) {
									if (jcu.getMethods().contains(methodPerformGetKey)) {
										if (exprRetGetKey.equals(statRetGetKey.getExpr())) {
											if (exprRetGetKey.getArguments().contains(exprOutputSizeLiteral)) {
												if (methodGetKey.getParams().contains(pwdDeclaration)) {
													if (exprRetGetKey.getArguments().contains(exprAlgNameLiteral)) {
														if (exprRetGetKey.getArguments()
																.contains(exprIterationLiteral)) {
															int exprIterationLiteral_index = exprIterationLiteral
																	.getIndex();
															if (Integer.valueOf(exprIterationLiteral_index)
																	.equals(Integer.valueOf(2))) {
																int exprAlgNameLiteral_index = exprAlgNameLiteral
																		.getIndex();
																if (Integer.valueOf(exprAlgNameLiteral_index)
																		.equals(Integer.valueOf(1))) {
																	String pwdDeclaration_name = pwdDeclaration
																			.getName();
																	if (pwdDeclaration_name.equals("pwd")) {
																		String pwdDeclaration_type = pwdDeclaration
																				.getType();
																		if (pwdDeclaration_type.equals("char[]")) {
																			int pwdDeclaration_index = pwdDeclaration
																					.getIndex();
																			if (Integer.valueOf(pwdDeclaration_index)
																					.equals(Integer.valueOf(0))) {
																				String exprRetGetKey_name = exprRetGetKey
																						.getName();
																				if (exprRetGetKey_name
																						.equals("performGetKey")) {
																					String methodPerformGetKey_name = methodPerformGetKey
																							.getName();
																					if (methodPerformGetKey_name
																							.equals("performGetKey")) {
																						String methodPerformGetKey_type = methodPerformGetKey
																								.getType();
																						if (methodPerformGetKey_type
																								.equals("SecretKey ")) {
																							String methodPerformGetKey_modifier = methodPerformGetKey
																									.getModifier();
																							if (methodPerformGetKey_modifier
																									.equals("private")) {
																								int exprOutputSizeLiteral_index = exprOutputSizeLiteral
																										.getIndex();
																								if (Integer.valueOf(
																										exprOutputSizeLiteral_index)
																										.equals(Integer
																												.valueOf(
																														3))) {
																									int exprPwdName_index = exprPwdName
																											.getIndex();
																									if (Integer.valueOf(
																											exprPwdName_index)
																											.equals(Integer
																													.valueOf(
																															0))) {
																										String exprPwdName_identifier = exprPwdName
																												.getIdentifier();
																										if (exprPwdName_identifier
																												.equals("pwd")) {
																											boolean statRetGetKey_return = statRetGetKey
																													.isReturn();
																											if (Boolean
																													.valueOf(
																															statRetGetKey_return)
																													.equals(Boolean
																															.valueOf(
																																	true))) {
																												String methodGetKey_modifier = methodGetKey
																														.getModifier();
																												if (methodGetKey_modifier
																														.equals("public")) {
																													String methodGetKey_type = methodGetKey
																															.getType();
																													if (methodGetKey_type
																															.equals("SecretKey ")) {
																														String methodGetKey_name = methodGetKey
																																.getName();
																														if (methodGetKey_name
																																.equals("getKey")) {
																															String jcu_name = jcu
																																	.getName();
																															if (jcu_name
																																	.equals("KeyDeriv")) {
																																_result.add(
																																		new Object[] {
																																				exprIterationLiteral,
																																				javaPackage,
																																				exprAlgNameLiteral,
																																				pwdDeclaration,
																																				exprRetGetKey,
																																				methodPerformGetKey,
																																				exprOutputSizeLiteral,
																																				exprPwdName,
																																				statRetGetKey,
																																				methodGetKey,
																																				jcu });
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

	public static final Object[] pattern_SecurePasswordTask_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFF(
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__statRetGetKey____statements = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprPwdName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformGetKey____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetGetKey__exprRetGetKey____expr = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprOutputSizeLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodGetKey__pwdDeclaration____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprAlgNameLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetGetKey__exprIterationLiteral____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String jcu__methodGetKey____methods_name_prime = "methods";
		String methodGetKey__statRetGetKey____statements_name_prime = "statements";
		String exprRetGetKey__exprPwdName____arguments_name_prime = "arguments";
		String jcu__methodPerformGetKey____methods_name_prime = "methods";
		String statRetGetKey__exprRetGetKey____expr_name_prime = "expr";
		String exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime = "arguments";
		String methodGetKey__pwdDeclaration____params_name_prime = "params";
		String exprRetGetKey__exprAlgNameLiteral____arguments_name_prime = "arguments";
		String exprRetGetKey__exprIterationLiteral____arguments_name_prime = "arguments";
		isApplicableMatch.getAllContextElements().add(exprIterationLiteral);
		isApplicableMatch.getAllContextElements().add(javaPackage);
		isApplicableMatch.getAllContextElements().add(exprAlgNameLiteral);
		isApplicableMatch.getAllContextElements().add(pwdDeclaration);
		isApplicableMatch.getAllContextElements().add(exprRetGetKey);
		isApplicableMatch.getAllContextElements().add(methodPerformGetKey);
		isApplicableMatch.getAllContextElements().add(exprOutputSizeLiteral);
		isApplicableMatch.getAllContextElements().add(exprPwdName);
		isApplicableMatch.getAllContextElements().add(statRetGetKey);
		isApplicableMatch.getAllContextElements().add(methodGetKey);
		isApplicableMatch.getAllContextElements().add(jcu);
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		isApplicableMatch.getAllContextElements().add(javaPackage__jcu____cunits);
		jcu__methodGetKey____methods.setSrc(jcu);
		jcu__methodGetKey____methods.setTrg(methodGetKey);
		isApplicableMatch.getAllContextElements().add(jcu__methodGetKey____methods);
		methodGetKey__statRetGetKey____statements.setSrc(methodGetKey);
		methodGetKey__statRetGetKey____statements.setTrg(statRetGetKey);
		isApplicableMatch.getAllContextElements().add(methodGetKey__statRetGetKey____statements);
		exprRetGetKey__exprPwdName____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprPwdName____arguments.setTrg(exprPwdName);
		isApplicableMatch.getAllContextElements().add(exprRetGetKey__exprPwdName____arguments);
		jcu__methodPerformGetKey____methods.setSrc(jcu);
		jcu__methodPerformGetKey____methods.setTrg(methodPerformGetKey);
		isApplicableMatch.getAllContextElements().add(jcu__methodPerformGetKey____methods);
		statRetGetKey__exprRetGetKey____expr.setSrc(statRetGetKey);
		statRetGetKey__exprRetGetKey____expr.setTrg(exprRetGetKey);
		isApplicableMatch.getAllContextElements().add(statRetGetKey__exprRetGetKey____expr);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprOutputSizeLiteral____arguments.setTrg(exprOutputSizeLiteral);
		isApplicableMatch.getAllContextElements().add(exprRetGetKey__exprOutputSizeLiteral____arguments);
		methodGetKey__pwdDeclaration____params.setSrc(methodGetKey);
		methodGetKey__pwdDeclaration____params.setTrg(pwdDeclaration);
		isApplicableMatch.getAllContextElements().add(methodGetKey__pwdDeclaration____params);
		exprRetGetKey__exprAlgNameLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprAlgNameLiteral____arguments.setTrg(exprAlgNameLiteral);
		isApplicableMatch.getAllContextElements().add(exprRetGetKey__exprAlgNameLiteral____arguments);
		exprRetGetKey__exprIterationLiteral____arguments.setSrc(exprRetGetKey);
		exprRetGetKey__exprIterationLiteral____arguments.setTrg(exprIterationLiteral);
		isApplicableMatch.getAllContextElements().add(exprRetGetKey__exprIterationLiteral____arguments);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		jcu__methodGetKey____methods.setName(jcu__methodGetKey____methods_name_prime);
		methodGetKey__statRetGetKey____statements.setName(methodGetKey__statRetGetKey____statements_name_prime);
		exprRetGetKey__exprPwdName____arguments.setName(exprRetGetKey__exprPwdName____arguments_name_prime);
		jcu__methodPerformGetKey____methods.setName(jcu__methodPerformGetKey____methods_name_prime);
		statRetGetKey__exprRetGetKey____expr.setName(statRetGetKey__exprRetGetKey____expr_name_prime);
		exprRetGetKey__exprOutputSizeLiteral____arguments
				.setName(exprRetGetKey__exprOutputSizeLiteral____arguments_name_prime);
		methodGetKey__pwdDeclaration____params.setName(methodGetKey__pwdDeclaration____params_name_prime);
		exprRetGetKey__exprAlgNameLiteral____arguments
				.setName(exprRetGetKey__exprAlgNameLiteral____arguments_name_prime);
		exprRetGetKey__exprIterationLiteral____arguments
				.setName(exprRetGetKey__exprIterationLiteral____arguments_name_prime);
		return new Object[] { exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu,
				isApplicableMatch, javaPackage__jcu____cunits, jcu__methodGetKey____methods,
				methodGetKey__statRetGetKey____statements, exprRetGetKey__exprPwdName____arguments,
				jcu__methodPerformGetKey____methods, statRetGetKey__exprRetGetKey____expr,
				exprRetGetKey__exprOutputSizeLiteral____arguments, methodGetKey__pwdDeclaration____params,
				exprRetGetKey__exprAlgNameLiteral____arguments, exprRetGetKey__exprIterationLiteral____arguments };
	}

	public static final Object[] pattern_SecurePasswordTask_12_4_solveCSP_bindingFBBBBBBBBBBBBB(
			SecurePasswordTask _this, IsApplicableMatch isApplicableMatch, JavaLiteral exprIterationLiteral,
			JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration,
			JavaMethodInvocation exprRetGetKey, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			JavaName exprPwdName, JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey,
			JavaCompilationUnit jcu) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, exprIterationLiteral, javaPackage,
				exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral,
				exprPwdName, statRetGetKey, methodGetKey, jcu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, exprIterationLiteral, javaPackage, exprAlgNameLiteral,
					pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName,
					statRetGetKey, methodGetKey, jcu };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SecurePasswordTask_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			SecurePasswordTask _this, IsApplicableMatch isApplicableMatch, JavaLiteral exprIterationLiteral,
			JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration,
			JavaMethodInvocation exprRetGetKey, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			JavaName exprPwdName, JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey,
			JavaCompilationUnit jcu) {
		Object[] result_pattern_SecurePasswordTask_12_4_solveCSP_binding = pattern_SecurePasswordTask_12_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
				exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey,
				jcu);
		if (result_pattern_SecurePasswordTask_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SecurePasswordTask_12_4_solveCSP_binding[0];

			Object[] result_pattern_SecurePasswordTask_12_4_solveCSP_black = pattern_SecurePasswordTask_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SecurePasswordTask_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, exprIterationLiteral, javaPackage,
						exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral,
						exprPwdName, statRetGetKey, methodGetKey, jcu };
			}
		}
		return null;
	}

	public static final boolean pattern_SecurePasswordTask_12_5_checkCSP_expressionFBB(SecurePasswordTask _this,
			CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SecurePasswordTask_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SecurePasswordTask";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SecurePasswordTask_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_20_1_preparereturnvalue_bindingFB(
			SecurePasswordTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SecurePasswordTask _this) {
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

	public static final Object[] pattern_SecurePasswordTask_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SecurePasswordTask _this) {
		Object[] result_pattern_SecurePasswordTask_20_1_preparereturnvalue_binding = pattern_SecurePasswordTask_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SecurePasswordTask_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SecurePasswordTask_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SecurePasswordTask_20_1_preparereturnvalue_black = pattern_SecurePasswordTask_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SecurePasswordTask_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SecurePasswordTask_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SecurePasswordTask_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SecurePasswordTask_20_2_testcorematchandDECs_black_nac_0BB(Task task,
			KeyDerivationAlgorithm kda) {
		for (Algorithm __DEC_task_algorithms_859214 : task.getAlgorithms()) {
			if (!kda.equals(__DEC_task_algorithms_859214)) {
				return new Object[] { task, kda };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SecurePasswordTask_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_algorithms) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_algorithms.getSrc();
		if (tmpTask instanceof Task) {
			Task task = (Task) tmpTask;
			EObject tmpKda = _edge_algorithms.getTrg();
			if (tmpKda instanceof KeyDerivationAlgorithm) {
				KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) tmpKda;
				if (task.getAlgorithms().contains(kda)) {
					String task_description = task.getDescription();
					if (task_description.equals("SecurePassword")) {
						if (pattern_SecurePasswordTask_20_2_testcorematchandDECs_black_nac_0BB(task, kda) == null) {
							_result.add(new Object[] { kda, task, _edge_algorithms });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SecurePasswordTask_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SecurePasswordTask _this, Match match, KeyDerivationAlgorithm kda, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, kda, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SecurePasswordTask_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SecurePasswordTask _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SecurePasswordTask_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_21_1_preparereturnvalue_bindingFB(
			SecurePasswordTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SecurePasswordTask _this) {
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

	public static final Object[] pattern_SecurePasswordTask_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SecurePasswordTask _this) {
		Object[] result_pattern_SecurePasswordTask_21_1_preparereturnvalue_binding = pattern_SecurePasswordTask_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SecurePasswordTask_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SecurePasswordTask_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SecurePasswordTask_21_1_preparereturnvalue_black = pattern_SecurePasswordTask_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SecurePasswordTask_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SecurePasswordTask_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SecurePasswordTask_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_0BB(
			JavaLiteral exprIterationLiteral, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprIterationLiteral_expr_338961 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprIterationLiteral, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprIterationLiteral_expr_338961)) {
				return new Object[] { exprIterationLiteral, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_1BB(
			JavaPackage javaPackage, JavaCompilationUnit jcu) {
		for (JavaCompilationUnit __DEC_javaPackage_cunits_891590 : javaPackage.getCunits()) {
			if (!jcu.equals(__DEC_javaPackage_cunits_891590)) {
				return new Object[] { javaPackage, jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_2BB(
			JavaLiteral exprAlgNameLiteral, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprAlgNameLiteral_expr_382894 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprAlgNameLiteral, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprAlgNameLiteral_expr_382894)) {
				return new Object[] { exprAlgNameLiteral, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_3BB(
			JavaVariableDeclaration pwdDeclaration, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_pwdDeclaration_expr_888917 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pwdDeclaration, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_pwdDeclaration_expr_888917)) {
				return new Object[] { pwdDeclaration, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_4BB(
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey) {
		for (JavaMethodInvocation __DEC_pwdDeclaration_arguments_46791 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pwdDeclaration, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetGetKey.equals(__DEC_pwdDeclaration_arguments_46791)) {
				return new Object[] { pwdDeclaration, exprRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_5B(
			JavaMethodInvocation exprRetGetKey) {
		for (JavaMethodInvocation __DEC_exprRetGetKey_arguments_321574 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprRetGetKey, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetGetKey.equals(__DEC_exprRetGetKey_arguments_321574)) {
				return new Object[] { exprRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_6BB(
			JavaLiteral exprOutputSizeLiteral, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprOutputSizeLiteral_expr_541306 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprOutputSizeLiteral, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprOutputSizeLiteral_expr_541306)) {
				return new Object[] { exprOutputSizeLiteral, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_7BB(
			JavaName exprPwdName, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprPwdName_expr_179916 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprPwdName, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprPwdName_expr_179916)) {
				return new Object[] { exprPwdName, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_8BB(
			JavaWorkflowMethod methodGetKey, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_methodGetKey_statements_184054 : methodGetKey.getStatements()) {
			if (!statRetGetKey.equals(__DEC_methodGetKey_statements_184054)) {
				return new Object[] { methodGetKey, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_9BB(
			JavaStatement statRetGetKey, JavaLiteral exprIterationLiteral) {
		if (exprIterationLiteral.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprIterationLiteral };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_10BB(
			JavaStatement statRetGetKey, JavaLiteral exprAlgNameLiteral) {
		if (exprAlgNameLiteral.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprAlgNameLiteral };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_11BB(
			JavaStatement statRetGetKey, JavaVariableDeclaration pwdDeclaration) {
		if (pwdDeclaration.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, pwdDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_12BB(
			JavaMethodInvocation exprRetGetKey, JavaVariableDeclaration pwdDeclaration) {
		if (exprRetGetKey.getArguments().contains(pwdDeclaration)) {
			return new Object[] { exprRetGetKey, pwdDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_13BB(
			JavaStatement statRetGetKey, JavaLiteral exprOutputSizeLiteral) {
		if (exprOutputSizeLiteral.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprOutputSizeLiteral };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_14BB(
			JavaStatement statRetGetKey, JavaName exprPwdName) {
		if (exprPwdName.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprPwdName };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SecurePasswordTask_21_2_testcorematchandDECs_blackFFFFFFFFFFFB(
			EMoflonEdge _edge_cunits) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpJavaPackage = _edge_cunits.getSrc();
		if (tmpJavaPackage instanceof JavaPackage) {
			JavaPackage javaPackage = (JavaPackage) tmpJavaPackage;
			EObject tmpJcu = _edge_cunits.getTrg();
			if (tmpJcu instanceof JavaCompilationUnit) {
				JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
				if (javaPackage.getCunits().contains(jcu)) {
					String jcu_name = jcu.getName();
					if (jcu_name.equals("KeyDeriv")) {
						if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_1BB(javaPackage,
								jcu) == null) {
							for (JavaMethod tmpMethodGetKey : jcu.getMethods()) {
								if (tmpMethodGetKey instanceof JavaWorkflowMethod) {
									JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) tmpMethodGetKey;
									String methodGetKey_modifier = methodGetKey.getModifier();
									if (methodGetKey_modifier.equals("public")) {
										String methodGetKey_type = methodGetKey.getType();
										if (methodGetKey_type.equals("SecretKey ")) {
											String methodGetKey_name = methodGetKey.getName();
											if (methodGetKey_name.equals("getKey")) {
												for (JavaMethod tmpMethodPerformGetKey : jcu.getMethods()) {
													if (tmpMethodPerformGetKey instanceof JavaOpaqueMethod) {
														JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) tmpMethodPerformGetKey;
														String methodPerformGetKey_name = methodPerformGetKey.getName();
														if (methodPerformGetKey_name.equals("performGetKey")) {
															String methodPerformGetKey_type = methodPerformGetKey
																	.getType();
															if (methodPerformGetKey_type.equals("SecretKey ")) {
																String methodPerformGetKey_modifier = methodPerformGetKey
																		.getModifier();
																if (methodPerformGetKey_modifier.equals("private")) {
																	for (JavaStatement statRetGetKey : methodGetKey
																			.getStatements()) {
																		JavaExpression tmpExprRetGetKey = statRetGetKey
																				.getExpr();
																		if (tmpExprRetGetKey instanceof JavaMethodInvocation) {
																			JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) tmpExprRetGetKey;
																			boolean statRetGetKey_return = statRetGetKey
																					.isReturn();
																			if (Boolean.valueOf(statRetGetKey_return)
																					.equals(Boolean.valueOf(true))) {
																				String exprRetGetKey_name = exprRetGetKey
																						.getName();
																				if (exprRetGetKey_name
																						.equals("performGetKey")) {
																					if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_8BB(
																							methodGetKey,
																							statRetGetKey) == null) {
																						if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_5B(
																								exprRetGetKey) == null) {
																							for (JavaVariableDeclaration pwdDeclaration : methodGetKey
																									.getParams()) {
																								String pwdDeclaration_name = pwdDeclaration
																										.getName();
																								if (pwdDeclaration_name
																										.equals("pwd")) {
																									String pwdDeclaration_type = pwdDeclaration
																											.getType();
																									if (pwdDeclaration_type
																											.equals("char[]")) {
																										int pwdDeclaration_index = pwdDeclaration
																												.getIndex();
																										if (Integer
																												.valueOf(
																														pwdDeclaration_index)
																												.equals(Integer
																														.valueOf(
																																0))) {
																											if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_3BB(
																													pwdDeclaration,
																													statRetGetKey) == null) {
																												if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_4BB(
																														pwdDeclaration,
																														exprRetGetKey) == null) {
																													if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_11BB(
																															statRetGetKey,
																															pwdDeclaration) == null) {
																														if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_12BB(
																																exprRetGetKey,
																																pwdDeclaration) == null) {
																															for (JavaExpression tmpExprPwdName : exprRetGetKey
																																	.getArguments()) {
																																if (tmpExprPwdName instanceof JavaName) {
																																	JavaName exprPwdName = (JavaName) tmpExprPwdName;
																																	int exprPwdName_index = exprPwdName
																																			.getIndex();
																																	if (Integer
																																			.valueOf(
																																					exprPwdName_index)
																																			.equals(Integer
																																					.valueOf(
																																							0))) {
																																		String exprPwdName_identifier = exprPwdName
																																				.getIdentifier();
																																		if (exprPwdName_identifier
																																				.equals("pwd")) {
																																			if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_7BB(
																																					exprPwdName,
																																					statRetGetKey) == null) {
																																				if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_14BB(
																																						statRetGetKey,
																																						exprPwdName) == null) {
																																					for (JavaExpression tmpExprOutputSizeLiteral : exprRetGetKey
																																							.getArguments()) {
																																						if (tmpExprOutputSizeLiteral instanceof JavaLiteral) {
																																							JavaLiteral exprOutputSizeLiteral = (JavaLiteral) tmpExprOutputSizeLiteral;
																																							int exprOutputSizeLiteral_index = exprOutputSizeLiteral
																																									.getIndex();
																																							if (Integer
																																									.valueOf(
																																											exprOutputSizeLiteral_index)
																																									.equals(Integer
																																											.valueOf(
																																													3))) {
																																								if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_6BB(
																																										exprOutputSizeLiteral,
																																										statRetGetKey) == null) {
																																									if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_13BB(
																																											statRetGetKey,
																																											exprOutputSizeLiteral) == null) {
																																										for (JavaExpression tmpExprAlgNameLiteral : exprRetGetKey
																																												.getArguments()) {
																																											if (tmpExprAlgNameLiteral instanceof JavaLiteral) {
																																												JavaLiteral exprAlgNameLiteral = (JavaLiteral) tmpExprAlgNameLiteral;
																																												if (!exprAlgNameLiteral
																																														.equals(exprOutputSizeLiteral)) {
																																													int exprAlgNameLiteral_index = exprAlgNameLiteral
																																															.getIndex();
																																													if (Integer
																																															.valueOf(
																																																	exprAlgNameLiteral_index)
																																															.equals(Integer
																																																	.valueOf(
																																																			1))) {
																																														if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_2BB(
																																																exprAlgNameLiteral,
																																																statRetGetKey) == null) {
																																															if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_10BB(
																																																	statRetGetKey,
																																																	exprAlgNameLiteral) == null) {
																																																for (JavaExpression tmpExprIterationLiteral : exprRetGetKey
																																																		.getArguments()) {
																																																	if (tmpExprIterationLiteral instanceof JavaLiteral) {
																																																		JavaLiteral exprIterationLiteral = (JavaLiteral) tmpExprIterationLiteral;
																																																		if (!exprIterationLiteral
																																																				.equals(exprOutputSizeLiteral)) {
																																																			if (!exprAlgNameLiteral
																																																					.equals(exprIterationLiteral)) {
																																																				int exprIterationLiteral_index = exprIterationLiteral
																																																						.getIndex();
																																																				if (Integer
																																																						.valueOf(
																																																								exprIterationLiteral_index)
																																																						.equals(Integer
																																																								.valueOf(
																																																										2))) {
																																																					if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_0BB(
																																																							exprIterationLiteral,
																																																							statRetGetKey) == null) {
																																																						if (pattern_SecurePasswordTask_21_2_testcorematchandDECs_black_nac_9BB(
																																																								statRetGetKey,
																																																								exprIterationLiteral) == null) {
																																																							_result.add(
																																																									new Object[] {
																																																											exprIterationLiteral,
																																																											javaPackage,
																																																											exprAlgNameLiteral,
																																																											pwdDeclaration,
																																																											exprRetGetKey,
																																																											methodPerformGetKey,
																																																											exprOutputSizeLiteral,
																																																											exprPwdName,
																																																											statRetGetKey,
																																																											methodGetKey,
																																																											jcu,
																																																											_edge_cunits });
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

		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SecurePasswordTask_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBBBBB(
			SecurePasswordTask _this, Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, exprIterationLiteral, javaPackage, exprAlgNameLiteral,
				pwdDeclaration, exprRetGetKey, methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey,
				methodGetKey, jcu);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SecurePasswordTask_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SecurePasswordTask _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SecurePasswordTask_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_24_1_prepare_blackB(SecurePasswordTask _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SecurePasswordTask_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SecurePasswordTask_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("exprIterationLiteral");
		EObject _localVariable_1 = targetMatch.getObject("javaPackage");
		EObject _localVariable_2 = targetMatch.getObject("exprAlgNameLiteral");
		EObject _localVariable_3 = targetMatch.getObject("pwdDeclaration");
		EObject _localVariable_4 = targetMatch.getObject("exprRetGetKey");
		EObject _localVariable_5 = sourceMatch.getObject("kda");
		EObject _localVariable_6 = targetMatch.getObject("methodPerformGetKey");
		EObject _localVariable_7 = targetMatch.getObject("exprOutputSizeLiteral");
		EObject _localVariable_8 = sourceMatch.getObject("task");
		EObject _localVariable_9 = targetMatch.getObject("exprPwdName");
		EObject _localVariable_10 = targetMatch.getObject("statRetGetKey");
		EObject _localVariable_11 = targetMatch.getObject("methodGetKey");
		EObject _localVariable_12 = targetMatch.getObject("jcu");
		EObject tmpExprIterationLiteral = _localVariable_0;
		EObject tmpJavaPackage = _localVariable_1;
		EObject tmpExprAlgNameLiteral = _localVariable_2;
		EObject tmpPwdDeclaration = _localVariable_3;
		EObject tmpExprRetGetKey = _localVariable_4;
		EObject tmpKda = _localVariable_5;
		EObject tmpMethodPerformGetKey = _localVariable_6;
		EObject tmpExprOutputSizeLiteral = _localVariable_7;
		EObject tmpTask = _localVariable_8;
		EObject tmpExprPwdName = _localVariable_9;
		EObject tmpStatRetGetKey = _localVariable_10;
		EObject tmpMethodGetKey = _localVariable_11;
		EObject tmpJcu = _localVariable_12;
		if (tmpExprIterationLiteral instanceof JavaLiteral) {
			JavaLiteral exprIterationLiteral = (JavaLiteral) tmpExprIterationLiteral;
			if (tmpJavaPackage instanceof JavaPackage) {
				JavaPackage javaPackage = (JavaPackage) tmpJavaPackage;
				if (tmpExprAlgNameLiteral instanceof JavaLiteral) {
					JavaLiteral exprAlgNameLiteral = (JavaLiteral) tmpExprAlgNameLiteral;
					if (tmpPwdDeclaration instanceof JavaVariableDeclaration) {
						JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) tmpPwdDeclaration;
						if (tmpExprRetGetKey instanceof JavaMethodInvocation) {
							JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) tmpExprRetGetKey;
							if (tmpKda instanceof KeyDerivationAlgorithm) {
								KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) tmpKda;
								if (tmpMethodPerformGetKey instanceof JavaOpaqueMethod) {
									JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) tmpMethodPerformGetKey;
									if (tmpExprOutputSizeLiteral instanceof JavaLiteral) {
										JavaLiteral exprOutputSizeLiteral = (JavaLiteral) tmpExprOutputSizeLiteral;
										if (tmpTask instanceof Task) {
											Task task = (Task) tmpTask;
											if (tmpExprPwdName instanceof JavaName) {
												JavaName exprPwdName = (JavaName) tmpExprPwdName;
												if (tmpStatRetGetKey instanceof JavaStatement) {
													JavaStatement statRetGetKey = (JavaStatement) tmpStatRetGetKey;
													if (tmpMethodGetKey instanceof JavaWorkflowMethod) {
														JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) tmpMethodGetKey;
														if (tmpJcu instanceof JavaCompilationUnit) {
															JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
															return new Object[] { exprIterationLiteral, javaPackage,
																	exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
																	kda, methodPerformGetKey, exprOutputSizeLiteral,
																	task, exprPwdName, statRetGetKey, methodGetKey, jcu,
																	targetMatch, sourceMatch };
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

	public static final Object[] pattern_SecurePasswordTask_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey, KeyDerivationAlgorithm kda,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, Task task, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu, Match sourceMatch,
			Match targetMatch) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					if (!sourceMatch.equals(targetMatch)) {
						int exprIterationLiteral_index = exprIterationLiteral.getIndex();
						if (Integer.valueOf(exprIterationLiteral_index).equals(Integer.valueOf(2))) {
							int exprAlgNameLiteral_index = exprAlgNameLiteral.getIndex();
							if (Integer.valueOf(exprAlgNameLiteral_index).equals(Integer.valueOf(1))) {
								String pwdDeclaration_name = pwdDeclaration.getName();
								if (pwdDeclaration_name.equals("pwd")) {
									String pwdDeclaration_type = pwdDeclaration.getType();
									if (pwdDeclaration_type.equals("char[]")) {
										int pwdDeclaration_index = pwdDeclaration.getIndex();
										if (Integer.valueOf(pwdDeclaration_index).equals(Integer.valueOf(0))) {
											String exprRetGetKey_name = exprRetGetKey.getName();
											if (exprRetGetKey_name.equals("performGetKey")) {
												String methodPerformGetKey_name = methodPerformGetKey.getName();
												if (methodPerformGetKey_name.equals("performGetKey")) {
													String methodPerformGetKey_type = methodPerformGetKey.getType();
													if (methodPerformGetKey_type.equals("SecretKey ")) {
														String methodPerformGetKey_modifier = methodPerformGetKey
																.getModifier();
														if (methodPerformGetKey_modifier.equals("private")) {
															int exprOutputSizeLiteral_index = exprOutputSizeLiteral
																	.getIndex();
															if (Integer.valueOf(exprOutputSizeLiteral_index)
																	.equals(Integer.valueOf(3))) {
																String task_description = task.getDescription();
																if (task_description.equals("SecurePassword")) {
																	int exprPwdName_index = exprPwdName.getIndex();
																	if (Integer.valueOf(exprPwdName_index)
																			.equals(Integer.valueOf(0))) {
																		String exprPwdName_identifier = exprPwdName
																				.getIdentifier();
																		if (exprPwdName_identifier.equals("pwd")) {
																			boolean statRetGetKey_return = statRetGetKey
																					.isReturn();
																			if (Boolean.valueOf(statRetGetKey_return)
																					.equals(Boolean.valueOf(true))) {
																				String methodGetKey_modifier = methodGetKey
																						.getModifier();
																				if (methodGetKey_modifier
																						.equals("public")) {
																					String methodGetKey_type = methodGetKey
																							.getType();
																					if (methodGetKey_type
																							.equals("SecretKey ")) {
																						String methodGetKey_name = methodGetKey
																								.getName();
																						if (methodGetKey_name
																								.equals("getKey")) {
																							String jcu_name = jcu
																									.getName();
																							if (jcu_name.equals(
																									"KeyDeriv")) {
																								return new Object[] {
																										exprIterationLiteral,
																										javaPackage,
																										exprAlgNameLiteral,
																										pwdDeclaration,
																										exprRetGetKey,
																										kda,
																										methodPerformGetKey,
																										exprOutputSizeLiteral,
																										task,
																										exprPwdName,
																										statRetGetKey,
																										methodGetKey,
																										jcu,
																										sourceMatch,
																										targetMatch };
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
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding = pattern_SecurePasswordTask_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding != null) {
			JavaLiteral exprIterationLiteral = (JavaLiteral) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[0];
			JavaPackage javaPackage = (JavaPackage) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[1];
			JavaLiteral exprAlgNameLiteral = (JavaLiteral) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[2];
			JavaVariableDeclaration pwdDeclaration = (JavaVariableDeclaration) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[3];
			JavaMethodInvocation exprRetGetKey = (JavaMethodInvocation) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[4];
			KeyDerivationAlgorithm kda = (KeyDerivationAlgorithm) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[5];
			JavaOpaqueMethod methodPerformGetKey = (JavaOpaqueMethod) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[6];
			JavaLiteral exprOutputSizeLiteral = (JavaLiteral) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[7];
			Task task = (Task) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[8];
			JavaName exprPwdName = (JavaName) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[9];
			JavaStatement statRetGetKey = (JavaStatement) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[10];
			JavaWorkflowMethod methodGetKey = (JavaWorkflowMethod) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[11];
			JavaCompilationUnit jcu = (JavaCompilationUnit) result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_binding[12];

			Object[] result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_black = pattern_SecurePasswordTask_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBBBB(
					exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda,
					methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName, statRetGetKey, methodGetKey, jcu,
					sourceMatch, targetMatch);
			if (result_pattern_SecurePasswordTask_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
						exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName,
						statRetGetKey, methodGetKey, jcu, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_24_3_solvecsp_bindingFBBBBBBBBBBBBBBBB(
			SecurePasswordTask _this, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			Task task, JavaName exprPwdName, JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey,
			JavaCompilationUnit jcu, Match sourceMatch, Match targetMatch) {
		CSP _localVariable_13 = _this.isApplicable_solveCsp_CC(exprIterationLiteral, javaPackage, exprAlgNameLiteral,
				pwdDeclaration, exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName,
				statRetGetKey, methodGetKey, jcu, sourceMatch, targetMatch);
		CSP csp = _localVariable_13;
		if (csp != null) {
			return new Object[] { csp, _this, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
					exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName, statRetGetKey,
					methodGetKey, jcu, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SecurePasswordTask_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBBBB(
			SecurePasswordTask _this, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			Task task, JavaName exprPwdName, JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey,
			JavaCompilationUnit jcu, Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SecurePasswordTask_24_3_solvecsp_binding = pattern_SecurePasswordTask_24_3_solvecsp_bindingFBBBBBBBBBBBBBBBB(
				_this, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey, kda,
				methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName, statRetGetKey, methodGetKey, jcu,
				sourceMatch, targetMatch);
		if (result_pattern_SecurePasswordTask_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SecurePasswordTask_24_3_solvecsp_binding[0];

			Object[] result_pattern_SecurePasswordTask_24_3_solvecsp_black = pattern_SecurePasswordTask_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SecurePasswordTask_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
						exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName,
						statRetGetKey, methodGetKey, jcu, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SecurePasswordTask_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SecurePasswordTask_24_5_matchcorrcontext_blackBB(Match sourceMatch,
			Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SecurePasswordTask";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SecurePasswordTask_24_6_createcorrespondence_blackBBBBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey, KeyDerivationAlgorithm kda,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, Task task, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu, CCMatch ccMatch) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					return new Object[] { exprIterationLiteral, javaPackage, exprAlgNameLiteral, pwdDeclaration,
							exprRetGetKey, kda, methodPerformGetKey, exprOutputSizeLiteral, task, exprPwdName,
							statRetGetKey, methodGetKey, jcu, ccMatch };
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_24_6_createcorrespondence_greenFBBFBBB(
			JavaPackage javaPackage, KeyDerivationAlgorithm kda, Task task, JavaCompilationUnit jcu, CCMatch ccMatch) {
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		KeyDerivationAlgorithmToJcu tc = CryptoConfigToJavaFactory.eINSTANCE.createKeyDerivationAlgorithmToJcu();
		t2c.setTarget(javaPackage);
		t2c.setSource(task);
		ccMatch.getCreateCorr().add(t2c);
		tc.setSource(kda);
		tc.setTarget(jcu);
		ccMatch.getCreateCorr().add(tc);
		return new Object[] { t2c, javaPackage, kda, tc, task, jcu, ccMatch };
	}

	public static final Object[] pattern_SecurePasswordTask_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SecurePasswordTask_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SecurePasswordTask";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SecurePasswordTask_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_27_1_matchtggpattern_black_nac_0BB(Task task,
			KeyDerivationAlgorithm kda) {
		for (Algorithm __DEC_task_algorithms_215906 : task.getAlgorithms()) {
			if (!kda.equals(__DEC_task_algorithms_215906)) {
				return new Object[] { task, kda };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_27_1_matchtggpattern_blackBB(KeyDerivationAlgorithm kda,
			Task task) {
		if (task.getAlgorithms().contains(kda)) {
			if (pattern_SecurePasswordTask_27_1_matchtggpattern_black_nac_0BB(task, kda) == null) {
				return new Object[] { kda, task };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_27_1_matchtggpattern_greenB(Task task) {
		String task_description_prime = "SecurePassword";
		task.setDescription(task_description_prime);
		return new Object[] { task };
	}

	public static final boolean pattern_SecurePasswordTask_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SecurePasswordTask_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_0BB(
			JavaLiteral exprIterationLiteral, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprIterationLiteral_expr_213700 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprIterationLiteral, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprIterationLiteral_expr_213700)) {
				return new Object[] { exprIterationLiteral, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_1BB(JavaPackage javaPackage,
			JavaCompilationUnit jcu) {
		for (JavaCompilationUnit __DEC_javaPackage_cunits_603328 : javaPackage.getCunits()) {
			if (!jcu.equals(__DEC_javaPackage_cunits_603328)) {
				return new Object[] { javaPackage, jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_2BB(
			JavaLiteral exprAlgNameLiteral, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprAlgNameLiteral_expr_376110 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprAlgNameLiteral, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprAlgNameLiteral_expr_376110)) {
				return new Object[] { exprAlgNameLiteral, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_3BB(
			JavaVariableDeclaration pwdDeclaration, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_pwdDeclaration_expr_382314 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pwdDeclaration, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_pwdDeclaration_expr_382314)) {
				return new Object[] { pwdDeclaration, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_4BB(
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey) {
		for (JavaMethodInvocation __DEC_pwdDeclaration_arguments_361890 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(pwdDeclaration, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetGetKey.equals(__DEC_pwdDeclaration_arguments_361890)) {
				return new Object[] { pwdDeclaration, exprRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_5B(
			JavaMethodInvocation exprRetGetKey) {
		for (JavaMethodInvocation __DEC_exprRetGetKey_arguments_821500 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprRetGetKey, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetGetKey.equals(__DEC_exprRetGetKey_arguments_821500)) {
				return new Object[] { exprRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_6BB(
			JavaLiteral exprOutputSizeLiteral, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprOutputSizeLiteral_expr_780178 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprOutputSizeLiteral, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprOutputSizeLiteral_expr_780178)) {
				return new Object[] { exprOutputSizeLiteral, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_7BB(JavaName exprPwdName,
			JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_exprPwdName_expr_900529 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprPwdName, JavaStatement.class, "expr")) {
			if (!statRetGetKey.equals(__DEC_exprPwdName_expr_900529)) {
				return new Object[] { exprPwdName, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_8BB(
			JavaWorkflowMethod methodGetKey, JavaStatement statRetGetKey) {
		for (JavaStatement __DEC_methodGetKey_statements_120204 : methodGetKey.getStatements()) {
			if (!statRetGetKey.equals(__DEC_methodGetKey_statements_120204)) {
				return new Object[] { methodGetKey, statRetGetKey };
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_9BB(
			JavaStatement statRetGetKey, JavaLiteral exprIterationLiteral) {
		if (exprIterationLiteral.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprIterationLiteral };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_10BB(
			JavaStatement statRetGetKey, JavaLiteral exprAlgNameLiteral) {
		if (exprAlgNameLiteral.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprAlgNameLiteral };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_11BB(
			JavaStatement statRetGetKey, JavaVariableDeclaration pwdDeclaration) {
		if (pwdDeclaration.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, pwdDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_12BB(
			JavaMethodInvocation exprRetGetKey, JavaVariableDeclaration pwdDeclaration) {
		if (exprRetGetKey.getArguments().contains(pwdDeclaration)) {
			return new Object[] { exprRetGetKey, pwdDeclaration };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_13BB(
			JavaStatement statRetGetKey, JavaLiteral exprOutputSizeLiteral) {
		if (exprOutputSizeLiteral.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprOutputSizeLiteral };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_14BB(
			JavaStatement statRetGetKey, JavaName exprPwdName) {
		if (exprPwdName.equals(statRetGetKey.getExpr())) {
			return new Object[] { statRetGetKey, exprPwdName };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_blackBBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaMethodInvocation exprRetGetKey,
			JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral, JavaName exprPwdName,
			JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey, JavaCompilationUnit jcu) {
		if (!exprIterationLiteral.equals(exprOutputSizeLiteral)) {
			if (!exprAlgNameLiteral.equals(exprIterationLiteral)) {
				if (!exprAlgNameLiteral.equals(exprOutputSizeLiteral)) {
					if (javaPackage.getCunits().contains(jcu)) {
						if (jcu.getMethods().contains(methodGetKey)) {
							if (methodGetKey.getStatements().contains(statRetGetKey)) {
								if (exprRetGetKey.getArguments().contains(exprPwdName)) {
									if (jcu.getMethods().contains(methodPerformGetKey)) {
										if (exprRetGetKey.equals(statRetGetKey.getExpr())) {
											if (exprRetGetKey.getArguments().contains(exprOutputSizeLiteral)) {
												if (methodGetKey.getParams().contains(pwdDeclaration)) {
													if (exprRetGetKey.getArguments().contains(exprAlgNameLiteral)) {
														if (exprRetGetKey.getArguments()
																.contains(exprIterationLiteral)) {
															if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_0BB(
																	exprIterationLiteral, statRetGetKey) == null) {
																if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_1BB(
																		javaPackage, jcu) == null) {
																	if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_2BB(
																			exprAlgNameLiteral,
																			statRetGetKey) == null) {
																		if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_3BB(
																				pwdDeclaration,
																				statRetGetKey) == null) {
																			if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_4BB(
																					pwdDeclaration,
																					exprRetGetKey) == null) {
																				if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_5B(
																						exprRetGetKey) == null) {
																					if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_6BB(
																							exprOutputSizeLiteral,
																							statRetGetKey) == null) {
																						if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_7BB(
																								exprPwdName,
																								statRetGetKey) == null) {
																							if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_8BB(
																									methodGetKey,
																									statRetGetKey) == null) {
																								if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_9BB(
																										statRetGetKey,
																										exprIterationLiteral) == null) {
																									if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_10BB(
																											statRetGetKey,
																											exprAlgNameLiteral) == null) {
																										if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_11BB(
																												statRetGetKey,
																												pwdDeclaration) == null) {
																											if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_12BB(
																													exprRetGetKey,
																													pwdDeclaration) == null) {
																												if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_13BB(
																														statRetGetKey,
																														exprOutputSizeLiteral) == null) {
																													if (pattern_SecurePasswordTask_28_1_matchtggpattern_black_nac_14BB(
																															statRetGetKey,
																															exprPwdName) == null) {
																														return new Object[] {
																																exprIterationLiteral,
																																javaPackage,
																																exprAlgNameLiteral,
																																pwdDeclaration,
																																exprRetGetKey,
																																methodPerformGetKey,
																																exprOutputSizeLiteral,
																																exprPwdName,
																																statRetGetKey,
																																methodGetKey,
																																jcu };
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
								}
							}
						}
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_28_1_matchtggpattern_greenBBBBBBBBBB(
			JavaLiteral exprIterationLiteral, JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration,
			JavaMethodInvocation exprRetGetKey, JavaOpaqueMethod methodPerformGetKey, JavaLiteral exprOutputSizeLiteral,
			JavaName exprPwdName, JavaStatement statRetGetKey, JavaWorkflowMethod methodGetKey,
			JavaCompilationUnit jcu) {
		int exprIterationLiteral_index_prime = Integer.valueOf(2);
		int exprAlgNameLiteral_index_prime = Integer.valueOf(1);
		String pwdDeclaration_name_prime = "pwd";
		String pwdDeclaration_type_prime = "char[]";
		int pwdDeclaration_index_prime = Integer.valueOf(0);
		String exprRetGetKey_name_prime = "performGetKey";
		String methodPerformGetKey_name_prime = "performGetKey";
		String methodPerformGetKey_type_prime = "SecretKey ";
		String methodPerformGetKey_modifier_prime = "private";
		int exprOutputSizeLiteral_index_prime = Integer.valueOf(3);
		int exprPwdName_index_prime = Integer.valueOf(0);
		String exprPwdName_identifier_prime = "pwd";
		boolean statRetGetKey_return_prime = Boolean.valueOf(true);
		String methodGetKey_modifier_prime = "public";
		String methodGetKey_type_prime = "SecretKey ";
		String methodGetKey_name_prime = "getKey";
		String jcu_name_prime = "KeyDeriv";
		exprIterationLiteral.setIndex(Integer.valueOf(exprIterationLiteral_index_prime));
		exprAlgNameLiteral.setIndex(Integer.valueOf(exprAlgNameLiteral_index_prime));
		pwdDeclaration.setName(pwdDeclaration_name_prime);
		pwdDeclaration.setType(pwdDeclaration_type_prime);
		pwdDeclaration.setIndex(Integer.valueOf(pwdDeclaration_index_prime));
		exprRetGetKey.setName(exprRetGetKey_name_prime);
		methodPerformGetKey.setName(methodPerformGetKey_name_prime);
		methodPerformGetKey.setType(methodPerformGetKey_type_prime);
		methodPerformGetKey.setModifier(methodPerformGetKey_modifier_prime);
		exprOutputSizeLiteral.setIndex(Integer.valueOf(exprOutputSizeLiteral_index_prime));
		exprPwdName.setIndex(Integer.valueOf(exprPwdName_index_prime));
		exprPwdName.setIdentifier(exprPwdName_identifier_prime);
		statRetGetKey.setReturn(Boolean.valueOf(statRetGetKey_return_prime));
		methodGetKey.setModifier(methodGetKey_modifier_prime);
		methodGetKey.setType(methodGetKey_type_prime);
		methodGetKey.setName(methodGetKey_name_prime);
		jcu.setName(jcu_name_prime);
		return new Object[] { exprIterationLiteral, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				methodPerformGetKey, exprOutputSizeLiteral, exprPwdName, statRetGetKey, methodGetKey, jcu };
	}

	public static final boolean pattern_SecurePasswordTask_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SecurePasswordTask_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_29_1_createresult_blackB(SecurePasswordTask _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SecurePasswordTask_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SecurePasswordTask_29_2_isapplicablecore_blackB(SecurePasswordTask _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SecurePasswordTask_29_3_solveCSP_bindingFBBB(SecurePasswordTask _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SecurePasswordTask_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SecurePasswordTask_29_3_solveCSP_bindingAndBlackFBBB(SecurePasswordTask _this,
			IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SecurePasswordTask_29_3_solveCSP_binding = pattern_SecurePasswordTask_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_SecurePasswordTask_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SecurePasswordTask_29_3_solveCSP_binding[0];

			Object[] result_pattern_SecurePasswordTask_29_3_solveCSP_black = pattern_SecurePasswordTask_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SecurePasswordTask_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SecurePasswordTask_29_4_checkCSP_expressionFBB(SecurePasswordTask _this,
			CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SecurePasswordTask_29_6_perform_blackB(ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_SecurePasswordTask_29_6_perform_greenFFFFFFFFFFFFFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		JavaLiteral exprIterationLiteral = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		JavaPackage javaPackage = SimpleJavaFactory.eINSTANCE.createJavaPackage();
		JavaLiteral exprAlgNameLiteral = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		JavaVariableDeclaration pwdDeclaration = SimpleJavaFactory.eINSTANCE.createJavaVariableDeclaration();
		JavaMethodInvocation exprRetGetKey = SimpleJavaFactory.eINSTANCE.createJavaMethodInvocation();
		KeyDerivationAlgorithm kda = CryptoAPIConfigFactory.eINSTANCE.createKeyDerivationAlgorithm();
		JavaOpaqueMethod methodPerformGetKey = SimpleJavaFactory.eINSTANCE.createJavaOpaqueMethod();
		JavaLiteral exprOutputSizeLiteral = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		KeyDerivationAlgorithmToJcu tc = CryptoConfigToJavaFactory.eINSTANCE.createKeyDerivationAlgorithmToJcu();
		Task task = CryptoAPIConfigFactory.eINSTANCE.createTask();
		JavaName exprPwdName = SimpleJavaFactory.eINSTANCE.createJavaName();
		JavaStatement statRetGetKey = SimpleJavaFactory.eINSTANCE.createJavaStatement();
		JavaWorkflowMethod methodGetKey = SimpleJavaFactory.eINSTANCE.createJavaWorkflowMethod();
		JavaCompilationUnit jcu = SimpleJavaFactory.eINSTANCE.createJavaCompilationUnit();
		int exprIterationLiteral_index_prime = Integer.valueOf(2);
		Object _localVariable_0 = csp.getValue("exprIterationLiteral", "value");
		Object _localVariable_1 = csp.getValue("javaPackage", "name");
		int exprAlgNameLiteral_index_prime = Integer.valueOf(1);
		Object _localVariable_2 = csp.getValue("exprAlgNameLiteral", "value");
		String pwdDeclaration_name_prime = "pwd";
		String pwdDeclaration_type_prime = "char[]";
		int pwdDeclaration_index_prime = Integer.valueOf(0);
		String exprRetGetKey_name_prime = "performGetKey";
		Object _localVariable_3 = csp.getValue("kda", "outputSize");
		Object _localVariable_4 = csp.getValue("kda", "iterations");
		Object _localVariable_5 = csp.getValue("kda", "name");
		String methodPerformGetKey_name_prime = "performGetKey";
		String methodPerformGetKey_type_prime = "SecretKey ";
		String methodPerformGetKey_modifier_prime = "private";
		Object _localVariable_6 = csp.getValue("methodPerformGetKey", "throws");
		Object _localVariable_7 = csp.getValue("methodPerformGetKey", "index");
		Object _localVariable_8 = csp.getValue("methodPerformGetKey", "body");
		Object _localVariable_9 = csp.getValue("methodPerformGetKey", "parameters");
		int exprOutputSizeLiteral_index_prime = Integer.valueOf(3);
		Object _localVariable_10 = csp.getValue("exprOutputSizeLiteral", "value");
		String task_description_prime = "SecurePassword";
		Object _localVariable_11 = csp.getValue("task", "package");
		int exprPwdName_index_prime = Integer.valueOf(0);
		String exprPwdName_identifier_prime = "pwd";
		boolean statRetGetKey_return_prime = Boolean.valueOf(true);
		String methodGetKey_modifier_prime = "public";
		String methodGetKey_type_prime = "SecretKey ";
		String methodGetKey_name_prime = "getKey";
		Object _localVariable_12 = csp.getValue("methodGetKey", "index");
		Object _localVariable_13 = csp.getValue("methodGetKey", "throws");
		String jcu_name_prime = "KeyDeriv";
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_14 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(exprIterationLiteral);
		ruleResult.getCorrObjects().add(t2c);
		t2c.setTarget(javaPackage);
		ruleResult.getTargetObjects().add(javaPackage);
		ruleResult.getTargetObjects().add(exprAlgNameLiteral);
		ruleResult.getTargetObjects().add(pwdDeclaration);
		exprRetGetKey.getArguments().add(exprAlgNameLiteral);
		exprRetGetKey.getArguments().add(exprIterationLiteral);
		ruleResult.getTargetObjects().add(exprRetGetKey);
		ruleResult.getSourceObjects().add(kda);
		ruleResult.getTargetObjects().add(methodPerformGetKey);
		exprRetGetKey.getArguments().add(exprOutputSizeLiteral);
		ruleResult.getTargetObjects().add(exprOutputSizeLiteral);
		tc.setSource(kda);
		ruleResult.getCorrObjects().add(tc);
		t2c.setSource(task);
		task.getAlgorithms().add(kda);
		ruleResult.getSourceObjects().add(task);
		exprRetGetKey.getArguments().add(exprPwdName);
		ruleResult.getTargetObjects().add(exprPwdName);
		statRetGetKey.setExpr(exprRetGetKey);
		ruleResult.getTargetObjects().add(statRetGetKey);
		methodGetKey.getStatements().add(statRetGetKey);
		methodGetKey.getParams().add(pwdDeclaration);
		ruleResult.getTargetObjects().add(methodGetKey);
		javaPackage.getCunits().add(jcu);
		jcu.getMethods().add(methodGetKey);
		jcu.getMethods().add(methodPerformGetKey);
		tc.setTarget(jcu);
		ruleResult.getTargetObjects().add(jcu);
		exprIterationLiteral.setIndex(Integer.valueOf(exprIterationLiteral_index_prime));
		String exprIterationLiteral_value_prime = (String) _localVariable_0;
		String javaPackage_name_prime = (String) _localVariable_1;
		exprAlgNameLiteral.setIndex(Integer.valueOf(exprAlgNameLiteral_index_prime));
		String exprAlgNameLiteral_value_prime = (String) _localVariable_2;
		pwdDeclaration.setName(pwdDeclaration_name_prime);
		pwdDeclaration.setType(pwdDeclaration_type_prime);
		pwdDeclaration.setIndex(Integer.valueOf(pwdDeclaration_index_prime));
		exprRetGetKey.setName(exprRetGetKey_name_prime);
		String kda_outputSize_prime = (String) _localVariable_3;
		String kda_iterations_prime = (String) _localVariable_4;
		String kda_name_prime = (String) _localVariable_5;
		methodPerformGetKey.setName(methodPerformGetKey_name_prime);
		methodPerformGetKey.setType(methodPerformGetKey_type_prime);
		methodPerformGetKey.setModifier(methodPerformGetKey_modifier_prime);
		String methodPerformGetKey_throws_prime = (String) _localVariable_6;
		int methodPerformGetKey_index_prime = (int) _localVariable_7;
		String methodPerformGetKey_body_prime = (String) _localVariable_8;
		String methodPerformGetKey_parameters_prime = (String) _localVariable_9;
		exprOutputSizeLiteral.setIndex(Integer.valueOf(exprOutputSizeLiteral_index_prime));
		String exprOutputSizeLiteral_value_prime = (String) _localVariable_10;
		task.setDescription(task_description_prime);
		String task_package_prime = (String) _localVariable_11;
		exprPwdName.setIndex(Integer.valueOf(exprPwdName_index_prime));
		exprPwdName.setIdentifier(exprPwdName_identifier_prime);
		statRetGetKey.setReturn(Boolean.valueOf(statRetGetKey_return_prime));
		methodGetKey.setModifier(methodGetKey_modifier_prime);
		methodGetKey.setType(methodGetKey_type_prime);
		methodGetKey.setName(methodGetKey_name_prime);
		int methodGetKey_index_prime = (int) _localVariable_12;
		String methodGetKey_throws_prime = (String) _localVariable_13;
		jcu.setName(jcu_name_prime);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_14);
		exprIterationLiteral.setValue(exprIterationLiteral_value_prime);
		javaPackage.setName(javaPackage_name_prime);
		exprAlgNameLiteral.setValue(exprAlgNameLiteral_value_prime);
		kda.setOutputSize(kda_outputSize_prime);
		kda.setIterations(kda_iterations_prime);
		kda.setName(kda_name_prime);
		methodPerformGetKey.setThrows(methodPerformGetKey_throws_prime);
		methodPerformGetKey.setIndex(Integer.valueOf(methodPerformGetKey_index_prime));
		methodPerformGetKey.setBody(methodPerformGetKey_body_prime);
		methodPerformGetKey.setParameters(methodPerformGetKey_parameters_prime);
		exprOutputSizeLiteral.setValue(exprOutputSizeLiteral_value_prime);
		task.setPackage(task_package_prime);
		methodGetKey.setIndex(Integer.valueOf(methodGetKey_index_prime));
		methodGetKey.setThrows(methodGetKey_throws_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { exprIterationLiteral, t2c, javaPackage, exprAlgNameLiteral, pwdDeclaration, exprRetGetKey,
				kda, methodPerformGetKey, exprOutputSizeLiteral, tc, task, exprPwdName, statRetGetKey, methodGetKey,
				jcu, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SecurePasswordTask_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SecurePasswordTaskImpl
