/**
 */
package CryptoConfigToJava.Rules.impl;

import CryptoAPIConfig.Algorithm;
import CryptoAPIConfig.CryptoAPIConfigFactory;
import CryptoAPIConfig.SymmetricBlockCipher;
import CryptoAPIConfig.Task;

import CryptoConfigToJava.CryptoConfigToJavaFactory;

import CryptoConfigToJava.Rules.RulesPackage;
import CryptoConfigToJava.Rules.SymmetricEncryptionTask;

import CryptoConfigToJava.SymmetricBlockCipherToJcu;
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
 * An implementation of the model object '<em><b>Symmetric Encryption Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SymmetricEncryptionTaskImpl extends AbstractRuleImpl implements SymmetricEncryptionTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymmetricEncryptionTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RulesPackage.eINSTANCE.getSymmetricEncryptionTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_FWD(Match match, SymmetricBlockCipher sbc, Task task) {

		Object[] result1_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_0_1_initialbindings_blackBBBB(this, match, sbc, task);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[sbc] = " + sbc + ", " + "[task] = " + task + ".");
		}

		Object[] result2_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_0_2_SolveCSP_bindingAndBlackFBBBB(this, match, sbc, task);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[sbc] = " + sbc + ", " + "[task] = " + task + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_0_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_0_4_collectelementstobetranslated_blackBBB(match, sbc, task);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[sbc] = " + sbc + ", " + "[task] = " + task + ".");
			}
			SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_0_4_collectelementstobetranslated_greenBBBF(match, sbc, task);
			//nothing EMoflonEdge task__sbc____algorithms = (EMoflonEdge) result4_green[3];

			Object[] result5_black = SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_0_5_collectcontextelements_blackBBB(match, sbc, task);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[sbc] = " + sbc + ", " + "[task] = " + task + ".");
			}
			// 
			SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_0_6_registerobjectstomatch_expressionBBBB(this,
					match, sbc, task);
			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_0_7_expressionF();
		} else {
			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_0_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_1_1_performtransformation_bindingAndBlackFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		SymmetricBlockCipher sbc = (SymmetricBlockCipher) result1_bindingAndBlack[0];
		Task task = (Task) result1_bindingAndBlack[1];
		CSP csp = (CSP) result1_bindingAndBlack[2];
		Object[] result1_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_1_1_performtransformation_greenFBFFFFFBFFFFFFFB(sbc, task, csp);
		JavaPackage javaPackage = (JavaPackage) result1_green[0];
		JavaName exprDataName = (JavaName) result1_green[2];
		JavaStatement statRetPerformEncryption = (JavaStatement) result1_green[3];
		JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result1_green[4];
		JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result1_green[5];
		JavaName exprKeyName = (JavaName) result1_green[6];
		JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result1_green[8];
		JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result1_green[9];
		TaskToJavaPackage t2c = (TaskToJavaPackage) result1_green[10];
		JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result1_green[11];
		JavaLiteral exprNameModePadding = (JavaLiteral) result1_green[12];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result1_green[13];
		SymmetricBlockCipherToJcu sbc2Jcu = (SymmetricBlockCipherToJcu) result1_green[14];

		Object[] result2_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_1_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(javaPackage, sbc,
						exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						task, methodPerformEncryption, methodEncryption, t2c, keyEncryption, exprNameModePadding, jcu,
						sbc2Jcu);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[javaPackage] = " + javaPackage
					+ ", " + "[sbc] = " + sbc + ", " + "[exprDataName] = " + exprDataName + ", "
					+ "[statRetPerformEncryption] = " + statRetPerformEncryption + ", " + "[dataEncryption] = "
					+ dataEncryption + ", " + "[exprRetPerformEncryption] = " + exprRetPerformEncryption + ", "
					+ "[exprKeyName] = " + exprKeyName + ", " + "[task] = " + task + ", "
					+ "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
					+ methodEncryption + ", " + "[t2c] = " + t2c + ", " + "[keyEncryption] = " + keyEncryption + ", "
					+ "[exprNameModePadding] = " + exprNameModePadding + ", " + "[jcu] = " + jcu + ", " + "[sbc2Jcu] = "
					+ sbc2Jcu + ".");
		}
		Object[] result2_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_1_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(javaPackage, sbc,
						exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						task, methodPerformEncryption, methodEncryption, t2c, keyEncryption, exprNameModePadding, jcu,
						sbc2Jcu);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, javaPackage,
						sbc, exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
						exprKeyName, task, methodPerformEncryption, methodEncryption, t2c, keyEncryption,
						exprNameModePadding, jcu, sbc2Jcu);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[javaPackage] = " + javaPackage + ", " + "[sbc] = " + sbc + ", " + "[exprDataName] = "
					+ exprDataName + ", " + "[statRetPerformEncryption] = " + statRetPerformEncryption + ", "
					+ "[dataEncryption] = " + dataEncryption + ", " + "[exprRetPerformEncryption] = "
					+ exprRetPerformEncryption + ", " + "[exprKeyName] = " + exprKeyName + ", " + "[task] = " + task
					+ ", " + "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
					+ methodEncryption + ", " + "[t2c] = " + t2c + ", " + "[keyEncryption] = " + keyEncryption + ", "
					+ "[exprNameModePadding] = " + exprNameModePadding + ", " + "[jcu] = " + jcu + ", " + "[sbc2Jcu] = "
					+ sbc2Jcu + ".");
		}
		SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
						ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
						keyEncryption, exprNameModePadding, jcu, sbc2Jcu);
		//nothing EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge methodEncryption__dataEncryption____params = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge methodEncryption__keyEncryption____params = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge task__sbc____algorithms = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge t2c__javaPackage____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge sbc2Jcu__jcu____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge sbc2Jcu__sbc____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge jcu__methodEncryption____methods = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge jcu__methodPerformEncryption____methods = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge methodEncryption__statRetPerformEncryption____statements = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge t2c__task____source = (EMoflonEdge) result3_green[30];

		// 
		// 
		SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
				this, ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu);
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_1_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_FWD(Match match) {

		Object[] result1_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_2_2_corematch_bindingFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		SymmetricBlockCipher sbc = (SymmetricBlockCipher) result2_binding[0];
		Task task = (Task) result2_binding[1];
		for (Object[] result2_black : SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_2_2_corematch_blackBBB(sbc, task, match)) {
			// ForEach 
			for (Object[] result3_black : SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_2_3_findcontext_blackBB(sbc, task)) {
				Object[] result3_green = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_2_3_findcontext_greenBBFF(sbc, task);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[2];
				//nothing EMoflonEdge task__sbc____algorithms = (EMoflonEdge) result3_green[3];

				Object[] result4_bindingAndBlack = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_2_4_solveCSP_bindingAndBlackFBBBB(this, isApplicableMatch, sbc,
								task);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[sbc] = " + sbc + ", "
							+ "[task] = " + task + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_2_5_checkCSP_expressionFBB(this, csp)) {

					Object[] result6_black = SymmetricEncryptionTaskImpl
							.pattern_SymmetricEncryptionTask_2_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_2_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_2_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_FWD(Match match, SymmetricBlockCipher sbc, Task task) {
		match.registerObject("sbc", sbc);
		match.registerObject("task", task);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_FWD(Match match, SymmetricBlockCipher sbc, Task task) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("crypto");
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
	public CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SymmetricBlockCipher sbc, Task task) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("data");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue("private");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue(0);
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue("Enc");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("key");
		literal4.setType("");
		Variable literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal5", true, csp);
		literal5.setValue(2);
		literal5.setType("");
		Variable literal6 = CSPFactoryHelper.eINSTANCE.createVariable("literal6", true, csp);
		literal6.setValue("byte[] data,SecretKey key,String encryptPassingArgument");
		literal6.setType("");
		Variable literal7 = CSPFactoryHelper.eINSTANCE.createVariable("literal7", true, csp);
		literal7.setValue(
				"InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException");
		literal7.setType("");
		Variable literal8 = CSPFactoryHelper.eINSTANCE.createVariable("literal8", true, csp);
		literal8.setValue("byte[] ");
		literal8.setType("");
		Variable literal9 = CSPFactoryHelper.eINSTANCE.createVariable("literal9", true, csp);
		literal9.setValue("public");
		literal9.setType("");
		Variable literal10 = CSPFactoryHelper.eINSTANCE.createVariable("literal10", true, csp);
		literal10.setValue(
				"{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n");
		literal10.setType("");
		Variable literal11 = CSPFactoryHelper.eINSTANCE.createVariable("literal11", true, csp);
		literal11.setValue(1);
		literal11.setType("");
		Variable literal12 = CSPFactoryHelper.eINSTANCE.createVariable("literal12", true, csp);
		literal12.setValue("encrypt");
		literal12.setType("");

		// Create attribute variables
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", true, csp);
		var_task_package.setValue(task.getPackage());
		var_task_package.setType("String");
		Variable var_sbc_name = CSPFactoryHelper.eINSTANCE.createVariable("sbc.name", true, csp);
		var_sbc_name.setValue(sbc.getName());
		var_sbc_name.setType("String");
		Variable var_sbc_mode = CSPFactoryHelper.eINSTANCE.createVariable("sbc.mode", true, csp);
		var_sbc_mode.setValue(sbc.getMode());
		var_sbc_mode.setType("String");
		Variable var_sbc_padding = CSPFactoryHelper.eINSTANCE.createVariable("sbc.padding", true, csp);
		var_sbc_padding.setValue(sbc.getPadding());
		var_sbc_padding.setType("String");

		// Create unbound variables
		Variable var_exprDataName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.identifier",
				csp);
		var_exprDataName_identifier.setType("String");
		Variable var_methodPerformEncryption_modifier = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.modifier", csp);
		var_methodPerformEncryption_modifier.setType("String");
		Variable var_exprDataName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.index", csp);
		var_exprDataName_index.setType("int");
		Variable var_jcu_name = CSPFactoryHelper.eINSTANCE.createVariable("jcu.name", csp);
		var_jcu_name.setType("String");
		Variable var_exprKeyName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.identifier", csp);
		var_exprKeyName_identifier.setType("String");
		Variable var_exprNameModePadding_index = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.index",
				csp);
		var_exprNameModePadding_index.setType("int");
		Variable var_methodPerformEncryption_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.parameters", csp);
		var_methodPerformEncryption_parameters.setType("String");
		Variable var_methodEncryption_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.throws",
				csp);
		var_methodEncryption_throws.setType("String");
		Variable var_methodPerformEncryption_index = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.index", csp);
		var_methodPerformEncryption_index.setType("int");
		Variable var_methodEncryption_type = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.type", csp);
		var_methodEncryption_type.setType("String");
		Variable var_methodPerformEncryption_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.throws", csp);
		var_methodPerformEncryption_throws.setType("String");
		Variable var_methodEncryption_modifier = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.modifier",
				csp);
		var_methodEncryption_modifier.setType("String");
		Variable var_methodPerformEncryption_body = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.body", csp);
		var_methodPerformEncryption_body.setType("String");
		Variable var_methodEncryption_index = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.index", csp);
		var_methodEncryption_index.setType("int");
		Variable var_methodEncryption_name = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.name", csp);
		var_methodEncryption_name.setType("String");
		Variable var_exprKeyName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.index", csp);
		var_exprKeyName_index.setType("int");
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", csp);
		var_javaPackage_name.setType("String");
		Variable var_exprNameModePadding_value = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.value",
				csp);
		var_exprNameModePadding_value.setType("String");

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_5 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_6 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_7 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_8 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_9 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_10 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_11 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_12 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_13 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_14 = new SetDefaultStringIfNull();
		Eq eq = new Eq();
		NameModePadding nameModePadding = new NameModePadding();

		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);
		csp.getConstraints().add(setDefaultStringIfNull_5);
		csp.getConstraints().add(setDefaultStringIfNull_6);
		csp.getConstraints().add(setDefaultStringIfNull_7);
		csp.getConstraints().add(setDefaultStringIfNull_8);
		csp.getConstraints().add(setDefaultStringIfNull_9);
		csp.getConstraints().add(setDefaultStringIfNull_10);
		csp.getConstraints().add(setDefaultStringIfNull_11);
		csp.getConstraints().add(setDefaultStringIfNull_12);
		csp.getConstraints().add(setDefaultStringIfNull_13);
		csp.getConstraints().add(setDefaultStringIfNull_14);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(nameModePadding);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_exprDataName_identifier, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformEncryption_modifier, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_exprDataName_index, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_jcu_name, literal3);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_exprKeyName_identifier, literal4);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_exprNameModePadding_index, literal5);
		setDefaultStringIfNull_5.setRuleName("NoRuleName");
		setDefaultStringIfNull_5.solve(var_methodPerformEncryption_parameters, literal6);
		setDefaultStringIfNull_6.setRuleName("NoRuleName");
		setDefaultStringIfNull_6.solve(var_methodEncryption_throws, literal7);
		setDefaultStringIfNull_7.setRuleName("NoRuleName");
		setDefaultStringIfNull_7.solve(var_methodPerformEncryption_index, literal2);
		setDefaultStringIfNull_8.setRuleName("NoRuleName");
		setDefaultStringIfNull_8.solve(var_methodEncryption_type, literal8);
		setDefaultStringIfNull_9.setRuleName("NoRuleName");
		setDefaultStringIfNull_9.solve(var_methodPerformEncryption_throws, literal7);
		setDefaultStringIfNull_10.setRuleName("NoRuleName");
		setDefaultStringIfNull_10.solve(var_methodEncryption_modifier, literal9);
		setDefaultStringIfNull_11.setRuleName("NoRuleName");
		setDefaultStringIfNull_11.solve(var_methodPerformEncryption_body, literal10);
		setDefaultStringIfNull_12.setRuleName("NoRuleName");
		setDefaultStringIfNull_12.solve(var_methodEncryption_index, literal11);
		setDefaultStringIfNull_13.setRuleName("NoRuleName");
		setDefaultStringIfNull_13.solve(var_methodEncryption_name, literal12);
		setDefaultStringIfNull_14.setRuleName("NoRuleName");
		setDefaultStringIfNull_14.solve(var_exprKeyName_index, literal11);
		eq.setRuleName("NoRuleName");
		eq.solve(var_task_package, var_javaPackage_name);
		nameModePadding.setRuleName("NoRuleName");
		nameModePadding.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("sbc", sbc);
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
	public void registerObjects_FWD(PerformRuleResult ruleresult, EObject javaPackage, EObject sbc,
			EObject exprDataName, EObject statRetPerformEncryption, EObject dataEncryption,
			EObject exprRetPerformEncryption, EObject exprKeyName, EObject task, EObject methodPerformEncryption,
			EObject methodEncryption, EObject t2c, EObject keyEncryption, EObject exprNameModePadding, EObject jcu,
			EObject sbc2Jcu) {
		ruleresult.registerObject("javaPackage", javaPackage);
		ruleresult.registerObject("sbc", sbc);
		ruleresult.registerObject("exprDataName", exprDataName);
		ruleresult.registerObject("statRetPerformEncryption", statRetPerformEncryption);
		ruleresult.registerObject("dataEncryption", dataEncryption);
		ruleresult.registerObject("exprRetPerformEncryption", exprRetPerformEncryption);
		ruleresult.registerObject("exprKeyName", exprKeyName);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("methodPerformEncryption", methodPerformEncryption);
		ruleresult.registerObject("methodEncryption", methodEncryption);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("keyEncryption", keyEncryption);
		ruleresult.registerObject("exprNameModePadding", exprNameModePadding);
		ruleresult.registerObject("jcu", jcu);
		ruleresult.registerObject("sbc2Jcu", sbc2Jcu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_FWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("sbc").eClass())
						.equals("CryptoAPIConfig.SymmetricBlockCipher.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("task").eClass())
						.equals("CryptoAPIConfig.Task.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAppropriate_BWD(Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {

		Object[] result1_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_10_1_initialbindings_blackBBBBBBBBBBBBB(this, match, javaPackage,
						exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[javaPackage] = " + javaPackage + ", " + "[exprDataName] = "
					+ exprDataName + ", " + "[statRetPerformEncryption] = " + statRetPerformEncryption + ", "
					+ "[dataEncryption] = " + dataEncryption + ", " + "[exprRetPerformEncryption] = "
					+ exprRetPerformEncryption + ", " + "[exprKeyName] = " + exprKeyName + ", "
					+ "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
					+ methodEncryption + ", " + "[keyEncryption] = " + keyEncryption + ", " + "[exprNameModePadding] = "
					+ exprNameModePadding + ", " + "[jcu] = " + jcu + ".");
		}

		Object[] result2_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_10_2_SolveCSP_bindingAndBlackFBBBBBBBBBBBBB(this, match, javaPackage,
						exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[match] = " + match + ", " + "[javaPackage] = " + javaPackage + ", " + "[exprDataName] = "
					+ exprDataName + ", " + "[statRetPerformEncryption] = " + statRetPerformEncryption + ", "
					+ "[dataEncryption] = " + dataEncryption + ", " + "[exprRetPerformEncryption] = "
					+ exprRetPerformEncryption + ", " + "[exprKeyName] = " + exprKeyName + ", "
					+ "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
					+ methodEncryption + ", " + "[keyEncryption] = " + keyEncryption + ", " + "[exprNameModePadding] = "
					+ exprNameModePadding + ", " + "[jcu] = " + jcu + ".");
		}
		CSP csp = (CSP) result2_bindingAndBlack[0];
		// 
		if (SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_10_3_CheckCSP_expressionFBB(this, csp)) {

			Object[] result4_black = SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_10_4_collectelementstobetranslated_blackBBBBBBBBBBBB(match,
							javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
							exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
							keyEncryption, exprNameModePadding, jcu);
			if (result4_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[javaPackage] = " + javaPackage + ", " + "[exprDataName] = " + exprDataName + ", "
						+ "[statRetPerformEncryption] = " + statRetPerformEncryption + ", " + "[dataEncryption] = "
						+ dataEncryption + ", " + "[exprRetPerformEncryption] = " + exprRetPerformEncryption + ", "
						+ "[exprKeyName] = " + exprKeyName + ", " + "[methodPerformEncryption] = "
						+ methodPerformEncryption + ", " + "[methodEncryption] = " + methodEncryption + ", "
						+ "[keyEncryption] = " + keyEncryption + ", " + "[exprNameModePadding] = " + exprNameModePadding
						+ ", " + "[jcu] = " + jcu + ".");
			}
			SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_10_4_collectelementstobetranslated_greenBBBBBBBBBBBBFFFFFFFFFF(
							match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
							exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
							keyEncryption, exprNameModePadding, jcu);
			//nothing EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = (EMoflonEdge) result4_green[12];
			//nothing EMoflonEdge methodEncryption__dataEncryption____params = (EMoflonEdge) result4_green[13];
			//nothing EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = (EMoflonEdge) result4_green[14];
			//nothing EMoflonEdge methodEncryption__keyEncryption____params = (EMoflonEdge) result4_green[15];
			//nothing EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = (EMoflonEdge) result4_green[16];
			//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result4_green[17];
			//nothing EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = (EMoflonEdge) result4_green[18];
			//nothing EMoflonEdge jcu__methodEncryption____methods = (EMoflonEdge) result4_green[19];
			//nothing EMoflonEdge jcu__methodPerformEncryption____methods = (EMoflonEdge) result4_green[20];
			//nothing EMoflonEdge methodEncryption__statRetPerformEncryption____statements = (EMoflonEdge) result4_green[21];

			Object[] result5_black = SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_10_5_collectcontextelements_blackBBBBBBBBBBBB(match, javaPackage,
							exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
							exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding,
							jcu);
			if (result5_black == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match + ", "
						+ "[javaPackage] = " + javaPackage + ", " + "[exprDataName] = " + exprDataName + ", "
						+ "[statRetPerformEncryption] = " + statRetPerformEncryption + ", " + "[dataEncryption] = "
						+ dataEncryption + ", " + "[exprRetPerformEncryption] = " + exprRetPerformEncryption + ", "
						+ "[exprKeyName] = " + exprKeyName + ", " + "[methodPerformEncryption] = "
						+ methodPerformEncryption + ", " + "[methodEncryption] = " + methodEncryption + ", "
						+ "[keyEncryption] = " + keyEncryption + ", " + "[exprNameModePadding] = " + exprNameModePadding
						+ ", " + "[jcu] = " + jcu + ".");
			}
			// 
			SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_10_6_registerobjectstomatch_expressionBBBBBBBBBBBBB(this, match,
							javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
							exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
							keyEncryption, exprNameModePadding, jcu);
			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_10_7_expressionF();
		} else {
			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_10_8_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch) {

		Object[] result1_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(this,
						isApplicableMatch);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[isApplicableMatch] = " + isApplicableMatch + ".");
		}
		JavaPackage javaPackage = (JavaPackage) result1_bindingAndBlack[0];
		JavaName exprDataName = (JavaName) result1_bindingAndBlack[1];
		JavaStatement statRetPerformEncryption = (JavaStatement) result1_bindingAndBlack[2];
		JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result1_bindingAndBlack[3];
		JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result1_bindingAndBlack[4];
		JavaName exprKeyName = (JavaName) result1_bindingAndBlack[5];
		JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result1_bindingAndBlack[6];
		JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result1_bindingAndBlack[7];
		JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result1_bindingAndBlack[8];
		JavaLiteral exprNameModePadding = (JavaLiteral) result1_bindingAndBlack[9];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result1_bindingAndBlack[10];
		CSP csp = (CSP) result1_bindingAndBlack[11];
		Object[] result1_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_11_1_performtransformation_greenBFFFBFB(javaPackage, jcu, csp);
		SymmetricBlockCipher sbc = (SymmetricBlockCipher) result1_green[1];
		Task task = (Task) result1_green[2];
		TaskToJavaPackage t2c = (TaskToJavaPackage) result1_green[3];
		SymmetricBlockCipherToJcu sbc2Jcu = (SymmetricBlockCipherToJcu) result1_green[5];

		Object[] result2_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_11_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(javaPackage, sbc,
						exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						task, methodPerformEncryption, methodEncryption, t2c, keyEncryption, exprNameModePadding, jcu,
						sbc2Jcu);
		if (result2_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[javaPackage] = " + javaPackage
					+ ", " + "[sbc] = " + sbc + ", " + "[exprDataName] = " + exprDataName + ", "
					+ "[statRetPerformEncryption] = " + statRetPerformEncryption + ", " + "[dataEncryption] = "
					+ dataEncryption + ", " + "[exprRetPerformEncryption] = " + exprRetPerformEncryption + ", "
					+ "[exprKeyName] = " + exprKeyName + ", " + "[task] = " + task + ", "
					+ "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
					+ methodEncryption + ", " + "[t2c] = " + t2c + ", " + "[keyEncryption] = " + keyEncryption + ", "
					+ "[exprNameModePadding] = " + exprNameModePadding + ", " + "[jcu] = " + jcu + ", " + "[sbc2Jcu] = "
					+ sbc2Jcu + ".");
		}
		Object[] result2_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_11_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(javaPackage, sbc,
						exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						task, methodPerformEncryption, methodEncryption, t2c, keyEncryption, exprNameModePadding, jcu,
						sbc2Jcu);
		PerformRuleResult ruleresult = (PerformRuleResult) result2_green[0];

		Object[] result3_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(ruleresult, javaPackage,
						sbc, exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
						exprKeyName, task, methodPerformEncryption, methodEncryption, t2c, keyEncryption,
						exprNameModePadding, jcu, sbc2Jcu);
		if (result3_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = " + ruleresult
					+ ", " + "[javaPackage] = " + javaPackage + ", " + "[sbc] = " + sbc + ", " + "[exprDataName] = "
					+ exprDataName + ", " + "[statRetPerformEncryption] = " + statRetPerformEncryption + ", "
					+ "[dataEncryption] = " + dataEncryption + ", " + "[exprRetPerformEncryption] = "
					+ exprRetPerformEncryption + ", " + "[exprKeyName] = " + exprKeyName + ", " + "[task] = " + task
					+ ", " + "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
					+ methodEncryption + ", " + "[t2c] = " + t2c + ", " + "[keyEncryption] = " + keyEncryption + ", "
					+ "[exprNameModePadding] = " + exprNameModePadding + ", " + "[jcu] = " + jcu + ", " + "[sbc2Jcu] = "
					+ sbc2Jcu + ".");
		}
		SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
						ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
						keyEncryption, exprNameModePadding, jcu, sbc2Jcu);
		//nothing EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = (EMoflonEdge) result3_green[16];
		//nothing EMoflonEdge methodEncryption__dataEncryption____params = (EMoflonEdge) result3_green[17];
		//nothing EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = (EMoflonEdge) result3_green[18];
		//nothing EMoflonEdge methodEncryption__keyEncryption____params = (EMoflonEdge) result3_green[19];
		//nothing EMoflonEdge task__sbc____algorithms = (EMoflonEdge) result3_green[20];
		//nothing EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = (EMoflonEdge) result3_green[21];
		//nothing EMoflonEdge t2c__javaPackage____target = (EMoflonEdge) result3_green[22];
		//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result3_green[23];
		//nothing EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = (EMoflonEdge) result3_green[24];
		//nothing EMoflonEdge sbc2Jcu__jcu____target = (EMoflonEdge) result3_green[25];
		//nothing EMoflonEdge sbc2Jcu__sbc____source = (EMoflonEdge) result3_green[26];
		//nothing EMoflonEdge jcu__methodEncryption____methods = (EMoflonEdge) result3_green[27];
		//nothing EMoflonEdge jcu__methodPerformEncryption____methods = (EMoflonEdge) result3_green[28];
		//nothing EMoflonEdge methodEncryption__statRetPerformEncryption____statements = (EMoflonEdge) result3_green[29];
		//nothing EMoflonEdge t2c__task____source = (EMoflonEdge) result3_green[30];

		// 
		// 
		SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
				this, ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu);
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_11_6_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsApplicableRuleResult isApplicable_BWD(Match match) {

		Object[] result1_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_bindingAndBlackFFB(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation performOperation = (EOperation) result1_bindingAndBlack[0];
		//nothing EClass eClass = (EClass) result1_bindingAndBlack[1];
		Object[] result1_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_greenBF(performOperation);
		IsApplicableRuleResult ruleresult = (IsApplicableRuleResult) result1_green[1];

		// ForEach 
		Object[] result2_binding = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_12_2_corematch_bindingFFFFFFFFFFFB(match);
		if (result2_binding == null) {
			throw new RuntimeException(
					"Binding in node core match failed." + " Variables: " + "[match] = " + match + ".");
		}
		JavaPackage javaPackage = (JavaPackage) result2_binding[0];
		JavaName exprDataName = (JavaName) result2_binding[1];
		JavaStatement statRetPerformEncryption = (JavaStatement) result2_binding[2];
		JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result2_binding[3];
		JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result2_binding[4];
		JavaName exprKeyName = (JavaName) result2_binding[5];
		JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result2_binding[6];
		JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result2_binding[7];
		JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result2_binding[8];
		JavaLiteral exprNameModePadding = (JavaLiteral) result2_binding[9];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result2_binding[10];
		for (Object[] result2_black : SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_12_2_corematch_blackBBBBBBBBBBBB(javaPackage, exprDataName,
						statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu, match)) {
			// ForEach 
			for (Object[] result3_black : SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_12_3_findcontext_blackBBBBBBBBBBB(javaPackage, exprDataName,
							statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
							methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu)) {
				Object[] result3_green = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFF(javaPackage,
								exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
								exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
								exprNameModePadding, jcu);
				IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result3_green[11];
				//nothing EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = (EMoflonEdge) result3_green[12];
				//nothing EMoflonEdge methodEncryption__dataEncryption____params = (EMoflonEdge) result3_green[13];
				//nothing EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = (EMoflonEdge) result3_green[14];
				//nothing EMoflonEdge methodEncryption__keyEncryption____params = (EMoflonEdge) result3_green[15];
				//nothing EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = (EMoflonEdge) result3_green[16];
				//nothing EMoflonEdge javaPackage__jcu____cunits = (EMoflonEdge) result3_green[17];
				//nothing EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = (EMoflonEdge) result3_green[18];
				//nothing EMoflonEdge jcu__methodEncryption____methods = (EMoflonEdge) result3_green[19];
				//nothing EMoflonEdge jcu__methodPerformEncryption____methods = (EMoflonEdge) result3_green[20];
				//nothing EMoflonEdge methodEncryption__statRetPerformEncryption____statements = (EMoflonEdge) result3_green[21];

				Object[] result4_bindingAndBlack = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(this,
								isApplicableMatch, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
								exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
								keyEncryption, exprNameModePadding, jcu);
				if (result4_bindingAndBlack == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
							+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[javaPackage] = " + javaPackage
							+ ", " + "[exprDataName] = " + exprDataName + ", " + "[statRetPerformEncryption] = "
							+ statRetPerformEncryption + ", " + "[dataEncryption] = " + dataEncryption + ", "
							+ "[exprRetPerformEncryption] = " + exprRetPerformEncryption + ", " + "[exprKeyName] = "
							+ exprKeyName + ", " + "[methodPerformEncryption] = " + methodPerformEncryption + ", "
							+ "[methodEncryption] = " + methodEncryption + ", " + "[keyEncryption] = " + keyEncryption
							+ ", " + "[exprNameModePadding] = " + exprNameModePadding + ", " + "[jcu] = " + jcu + ".");
				}
				CSP csp = (CSP) result4_bindingAndBlack[0];
				// 
				if (SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_12_5_checkCSP_expressionFBB(this,
						csp)) {

					Object[] result6_black = SymmetricEncryptionTaskImpl
							.pattern_SymmetricEncryptionTask_12_6_addmatchtoruleresult_blackBB(ruleresult,
									isApplicableMatch);
					if (result6_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[ruleresult] = "
								+ ruleresult + ", " + "[isApplicableMatch] = " + isApplicableMatch + ".");
					}
					SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_12_6_addmatchtoruleresult_greenBB(
							ruleresult, isApplicableMatch);

				} else {
				}

			}

		}
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_12_7_expressionFB(ruleresult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void registerObjectsToMatch_BWD(Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		match.registerObject("javaPackage", javaPackage);
		match.registerObject("exprDataName", exprDataName);
		match.registerObject("statRetPerformEncryption", statRetPerformEncryption);
		match.registerObject("dataEncryption", dataEncryption);
		match.registerObject("exprRetPerformEncryption", exprRetPerformEncryption);
		match.registerObject("exprKeyName", exprKeyName);
		match.registerObject("methodPerformEncryption", methodPerformEncryption);
		match.registerObject("methodEncryption", methodEncryption);
		match.registerObject("keyEncryption", keyEncryption);
		match.registerObject("exprNameModePadding", exprNameModePadding);
		match.registerObject("jcu", jcu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isAppropriate_solveCsp_BWD(Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("data");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue("private");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue(0);
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue("Enc");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("key");
		literal4.setType("");
		Variable literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal5", true, csp);
		literal5.setValue(2);
		literal5.setType("");
		Variable literal6 = CSPFactoryHelper.eINSTANCE.createVariable("literal6", true, csp);
		literal6.setValue("byte[] data,SecretKey key,String encryptPassingArgument");
		literal6.setType("");
		Variable literal7 = CSPFactoryHelper.eINSTANCE.createVariable("literal7", true, csp);
		literal7.setValue(
				"InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException");
		literal7.setType("");
		Variable literal8 = CSPFactoryHelper.eINSTANCE.createVariable("literal8", true, csp);
		literal8.setValue("byte[] ");
		literal8.setType("");
		Variable literal9 = CSPFactoryHelper.eINSTANCE.createVariable("literal9", true, csp);
		literal9.setValue("public");
		literal9.setType("");
		Variable literal10 = CSPFactoryHelper.eINSTANCE.createVariable("literal10", true, csp);
		literal10.setValue(
				"{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n");
		literal10.setType("");
		Variable literal11 = CSPFactoryHelper.eINSTANCE.createVariable("literal11", true, csp);
		literal11.setValue(1);
		literal11.setType("");
		Variable literal12 = CSPFactoryHelper.eINSTANCE.createVariable("literal12", true, csp);
		literal12.setValue("encrypt");
		literal12.setType("");

		// Create attribute variables
		Variable var_exprDataName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.identifier",
				true, csp);
		var_exprDataName_identifier.setValue(exprDataName.getIdentifier());
		var_exprDataName_identifier.setType("String");
		Variable var_methodPerformEncryption_modifier = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.modifier", true, csp);
		var_methodPerformEncryption_modifier.setValue(methodPerformEncryption.getModifier());
		var_methodPerformEncryption_modifier.setType("String");
		Variable var_exprDataName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.index", true, csp);
		var_exprDataName_index.setValue(exprDataName.getIndex());
		var_exprDataName_index.setType("int");
		Variable var_jcu_name = CSPFactoryHelper.eINSTANCE.createVariable("jcu.name", true, csp);
		var_jcu_name.setValue(jcu.getName());
		var_jcu_name.setType("String");
		Variable var_exprKeyName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.identifier", true,
				csp);
		var_exprKeyName_identifier.setValue(exprKeyName.getIdentifier());
		var_exprKeyName_identifier.setType("String");
		Variable var_exprNameModePadding_index = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.index",
				true, csp);
		var_exprNameModePadding_index.setValue(exprNameModePadding.getIndex());
		var_exprNameModePadding_index.setType("int");
		Variable var_methodPerformEncryption_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.parameters", true, csp);
		var_methodPerformEncryption_parameters.setValue(methodPerformEncryption.getParameters());
		var_methodPerformEncryption_parameters.setType("String");
		Variable var_methodEncryption_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.throws",
				true, csp);
		var_methodEncryption_throws.setValue(methodEncryption.getThrows());
		var_methodEncryption_throws.setType("String");
		Variable var_methodPerformEncryption_index = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.index", true, csp);
		var_methodPerformEncryption_index.setValue(methodPerformEncryption.getIndex());
		var_methodPerformEncryption_index.setType("int");
		Variable var_methodEncryption_type = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.type", true,
				csp);
		var_methodEncryption_type.setValue(methodEncryption.getType());
		var_methodEncryption_type.setType("String");
		Variable var_methodPerformEncryption_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.throws", true, csp);
		var_methodPerformEncryption_throws.setValue(methodPerformEncryption.getThrows());
		var_methodPerformEncryption_throws.setType("String");
		Variable var_methodEncryption_modifier = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.modifier",
				true, csp);
		var_methodEncryption_modifier.setValue(methodEncryption.getModifier());
		var_methodEncryption_modifier.setType("String");
		Variable var_methodPerformEncryption_body = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.body", true, csp);
		var_methodPerformEncryption_body.setValue(methodPerformEncryption.getBody());
		var_methodPerformEncryption_body.setType("String");
		Variable var_methodEncryption_index = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.index", true,
				csp);
		var_methodEncryption_index.setValue(methodEncryption.getIndex());
		var_methodEncryption_index.setType("int");
		Variable var_methodEncryption_name = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.name", true,
				csp);
		var_methodEncryption_name.setValue(methodEncryption.getName());
		var_methodEncryption_name.setType("String");
		Variable var_exprKeyName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.index", true, csp);
		var_exprKeyName_index.setValue(exprKeyName.getIndex());
		var_exprKeyName_index.setType("int");

		// Create unbound variables

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_5 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_6 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_7 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_8 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_9 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_10 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_11 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_12 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_13 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_14 = new SetDefaultStringIfNull();

		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);
		csp.getConstraints().add(setDefaultStringIfNull_5);
		csp.getConstraints().add(setDefaultStringIfNull_6);
		csp.getConstraints().add(setDefaultStringIfNull_7);
		csp.getConstraints().add(setDefaultStringIfNull_8);
		csp.getConstraints().add(setDefaultStringIfNull_9);
		csp.getConstraints().add(setDefaultStringIfNull_10);
		csp.getConstraints().add(setDefaultStringIfNull_11);
		csp.getConstraints().add(setDefaultStringIfNull_12);
		csp.getConstraints().add(setDefaultStringIfNull_13);
		csp.getConstraints().add(setDefaultStringIfNull_14);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_exprDataName_identifier, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformEncryption_modifier, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_exprDataName_index, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_jcu_name, literal3);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_exprKeyName_identifier, literal4);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_exprNameModePadding_index, literal5);
		setDefaultStringIfNull_5.setRuleName("NoRuleName");
		setDefaultStringIfNull_5.solve(var_methodPerformEncryption_parameters, literal6);
		setDefaultStringIfNull_6.setRuleName("NoRuleName");
		setDefaultStringIfNull_6.solve(var_methodEncryption_throws, literal7);
		setDefaultStringIfNull_7.setRuleName("NoRuleName");
		setDefaultStringIfNull_7.solve(var_methodPerformEncryption_index, literal2);
		setDefaultStringIfNull_8.setRuleName("NoRuleName");
		setDefaultStringIfNull_8.solve(var_methodEncryption_type, literal8);
		setDefaultStringIfNull_9.setRuleName("NoRuleName");
		setDefaultStringIfNull_9.solve(var_methodPerformEncryption_throws, literal7);
		setDefaultStringIfNull_10.setRuleName("NoRuleName");
		setDefaultStringIfNull_10.solve(var_methodEncryption_modifier, literal9);
		setDefaultStringIfNull_11.setRuleName("NoRuleName");
		setDefaultStringIfNull_11.solve(var_methodPerformEncryption_body, literal10);
		setDefaultStringIfNull_12.setRuleName("NoRuleName");
		setDefaultStringIfNull_12.solve(var_methodEncryption_index, literal11);
		setDefaultStringIfNull_13.setRuleName("NoRuleName");
		setDefaultStringIfNull_13.solve(var_methodEncryption_name, literal12);
		setDefaultStringIfNull_14.setRuleName("NoRuleName");
		setDefaultStringIfNull_14.solve(var_exprKeyName_index, literal11);
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
	public CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaPackage javaPackage,
			JavaName exprDataName, JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();
		isApplicableMatch.getAttributeInfo().add(csp);

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("crypto");
		literal0.setType("");

		// Create attribute variables
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", true, csp);
		var_javaPackage_name.setValue(javaPackage.getName());
		var_javaPackage_name.setType("String");
		Variable var_exprNameModePadding_value = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.value",
				true, csp);
		var_exprNameModePadding_value.setValue(exprNameModePadding.getValue());
		var_exprNameModePadding_value.setType("String");

		// Create unbound variables
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", csp);
		var_task_package.setType("String");
		Variable var_sbc_name = CSPFactoryHelper.eINSTANCE.createVariable("sbc.name", csp);
		var_sbc_name.setType("String");
		Variable var_sbc_mode = CSPFactoryHelper.eINSTANCE.createVariable("sbc.mode", csp);
		var_sbc_mode.setType("String");
		Variable var_sbc_padding = CSPFactoryHelper.eINSTANCE.createVariable("sbc.padding", csp);
		var_sbc_padding.setType("String");

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		Eq eq = new Eq();
		NameModePadding nameModePadding = new NameModePadding();

		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(nameModePadding);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_task_package, literal0);
		eq.setRuleName("NoRuleName");
		eq.solve(var_task_package, var_javaPackage_name);
		nameModePadding.setRuleName("NoRuleName");
		nameModePadding.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);

		// Snapshot pattern match on which CSP is solved
		isApplicableMatch.registerObject("javaPackage", javaPackage);
		isApplicableMatch.registerObject("exprDataName", exprDataName);
		isApplicableMatch.registerObject("statRetPerformEncryption", statRetPerformEncryption);
		isApplicableMatch.registerObject("dataEncryption", dataEncryption);
		isApplicableMatch.registerObject("exprRetPerformEncryption", exprRetPerformEncryption);
		isApplicableMatch.registerObject("exprKeyName", exprKeyName);
		isApplicableMatch.registerObject("methodPerformEncryption", methodPerformEncryption);
		isApplicableMatch.registerObject("methodEncryption", methodEncryption);
		isApplicableMatch.registerObject("keyEncryption", keyEncryption);
		isApplicableMatch.registerObject("exprNameModePadding", exprNameModePadding);
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
	public void registerObjects_BWD(PerformRuleResult ruleresult, EObject javaPackage, EObject sbc,
			EObject exprDataName, EObject statRetPerformEncryption, EObject dataEncryption,
			EObject exprRetPerformEncryption, EObject exprKeyName, EObject task, EObject methodPerformEncryption,
			EObject methodEncryption, EObject t2c, EObject keyEncryption, EObject exprNameModePadding, EObject jcu,
			EObject sbc2Jcu) {
		ruleresult.registerObject("javaPackage", javaPackage);
		ruleresult.registerObject("sbc", sbc);
		ruleresult.registerObject("exprDataName", exprDataName);
		ruleresult.registerObject("statRetPerformEncryption", statRetPerformEncryption);
		ruleresult.registerObject("dataEncryption", dataEncryption);
		ruleresult.registerObject("exprRetPerformEncryption", exprRetPerformEncryption);
		ruleresult.registerObject("exprKeyName", exprKeyName);
		ruleresult.registerObject("task", task);
		ruleresult.registerObject("methodPerformEncryption", methodPerformEncryption);
		ruleresult.registerObject("methodEncryption", methodEncryption);
		ruleresult.registerObject("t2c", t2c);
		ruleresult.registerObject("keyEncryption", keyEncryption);
		ruleresult.registerObject("exprNameModePadding", exprNameModePadding);
		ruleresult.registerObject("jcu", jcu);
		ruleresult.registerObject("sbc2Jcu", sbc2Jcu);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkTypes_BWD(Match match) {
		return true
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("javaPackage").eClass())
						.equals("SimpleJava.JavaPackage.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprDataName").eClass())
						.equals("SimpleJava.JavaName.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("statRetPerformEncryption").eClass())
						.equals("SimpleJava.JavaStatement.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("dataEncryption").eClass())
						.equals("SimpleJava.JavaVariableDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprRetPerformEncryption").eClass())
						.equals("SimpleJava.JavaMethodInvocation.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprKeyName").eClass())
						.equals("SimpleJava.JavaName.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("methodPerformEncryption").eClass())
						.equals("SimpleJava.JavaOpaqueMethod.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("methodEncryption").eClass())
						.equals("SimpleJava.JavaWorkflowMethod.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("keyEncryption").eClass())
						.equals("SimpleJava.JavaVariableDeclaration.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("exprNameModePadding").eClass())
						.equals("SimpleJava.JavaLiteral.")
				&& org.moflon.util.eMoflonSDMUtil.getFQN(match.getObject("jcu").eClass())
						.equals("SimpleJava.JavaCompilationUnit.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_FWD_EMoflonEdge_2(EMoflonEdge _edge_algorithms) {

		Object[] result1_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_20_2_testcorematchandDECs_blackFFB(_edge_algorithms)) {
			SymmetricBlockCipher sbc = (SymmetricBlockCipher) result2_black[0];
			Task task = (Task) result2_black[1];
			Object[] result2_green = SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_20_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
							this, match, sbc, task)) {
				// 
				if (SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SymmetricEncryptionTaskImpl
							.pattern_SymmetricEncryptionTask_20_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_20_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_20_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectContainer isAppropriate_BWD_EMoflonEdge_5(EMoflonEdge _edge_arguments) {

		Object[] result1_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_bindingAndBlackFFBF(this);
		if (result1_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		EOperation __performOperation = (EOperation) result1_bindingAndBlack[0];
		EClass __eClass = (EClass) result1_bindingAndBlack[1];
		EOperation isApplicableCC = (EOperation) result1_bindingAndBlack[3];
		Object[] result1_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_greenF();
		EObjectContainer __result = (EObjectContainer) result1_green[0];

		// ForEach 
		for (Object[] result2_black : SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_blackFFFFFFFFFFFB(_edge_arguments)) {
			JavaPackage javaPackage = (JavaPackage) result2_black[0];
			JavaName exprDataName = (JavaName) result2_black[1];
			JavaStatement statRetPerformEncryption = (JavaStatement) result2_black[2];
			JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result2_black[3];
			JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result2_black[4];
			JavaName exprKeyName = (JavaName) result2_black[5];
			JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result2_black[6];
			JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result2_black[7];
			JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result2_black[8];
			JavaLiteral exprNameModePadding = (JavaLiteral) result2_black[9];
			JavaCompilationUnit jcu = (JavaCompilationUnit) result2_black[10];
			Object[] result2_green = SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_greenFB(__eClass);
			Match match = (Match) result2_green[0];

			// 
			if (SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBBBBB(
							this, match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
							exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
							keyEncryption, exprNameModePadding, jcu)) {
				// 
				if (SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
								this, match)) {

					Object[] result5_black = SymmetricEncryptionTaskImpl
							.pattern_SymmetricEncryptionTask_21_5_Addmatchtoruleresult_blackBBBB(match,
									__performOperation, __result, isApplicableCC);
					if (result5_black == null) {
						throw new RuntimeException("Pattern matching failed." + " Variables: " + "[match] = " + match
								+ ", " + "[__performOperation] = " + __performOperation + ", " + "[__result] = "
								+ __result + ", " + "[isApplicableCC] = " + isApplicableCC + ".");
					}
					SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_21_5_Addmatchtoruleresult_greenBBBB(
							match, __performOperation, __result, isApplicableCC);

				} else {
				}

			} else {
			}

		}
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_21_6_expressionFB(__result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch) {
		AttributeConstraintsRuleResult ruleResult = org.moflon.tgg.runtime.RuntimeFactory.eINSTANCE
				.createAttributeConstraintsRuleResult();
		ruleResult.setRule("SymmetricEncryptionTask");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("statRetPerformEncryption", "return", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("dataEncryption", "index", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("dataEncryption", "name", "data", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("dataEncryption", "type", "byte[]", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprRetPerformEncryption", "name", "performEncryption",
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("task", "description", "SymmetricEncryption", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformEncryption", "type", "byte[] ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformEncryption", "name", "performEncryption",
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("keyEncryption", "type", "SecretKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("keyEncryption", "index", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("keyEncryption", "name", "key", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("data");
		var_literal0.setType("");

		Variable var_literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal1.setValue("private");
		var_literal1.setType("");

		Variable var_literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal2.setValue("crypto");
		var_literal2.setType("");

		Variable var_methodPerformEncryption_modifier = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_modifier.setValue(__helper.getValue("methodPerformEncryption", "modifier"));
		var_methodPerformEncryption_modifier.setType("String");

		Variable var_exprDataName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName", true, csp);
		var_exprDataName_index.setValue(__helper.getValue("exprDataName", "index"));
		var_exprDataName_index.setType("int");

		Variable var_literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal3.setValue(0);
		var_literal3.setType("");

		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_package.setValue(__helper.getValue("task", "package"));
		var_task_package.setType("String");

		Variable var_jcu_name = CSPFactoryHelper.eINSTANCE.createVariable("jcu", true, csp);
		var_jcu_name.setValue(__helper.getValue("jcu", "name"));
		var_jcu_name.setType("String");

		Variable var_literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal4.setValue("key");
		var_literal4.setType("");

		Variable var_exprKeyName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName", true, csp);
		var_exprKeyName_identifier.setValue(__helper.getValue("exprKeyName", "identifier"));
		var_exprKeyName_identifier.setType("String");

		Variable var_literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal5.setValue("Enc");
		var_literal5.setType("");

		Variable var_literal6 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal6.setValue(2);
		var_literal6.setType("");

		Variable var_exprNameModePadding_index = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding", true,
				csp);
		var_exprNameModePadding_index.setValue(__helper.getValue("exprNameModePadding", "index"));
		var_exprNameModePadding_index.setType("int");

		Variable var_literal7 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal7.setValue("byte[] data,SecretKey key,String encryptPassingArgument");
		var_literal7.setType("");

		Variable var_methodPerformEncryption_index = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_index.setValue(__helper.getValue("methodPerformEncryption", "index"));
		var_methodPerformEncryption_index.setType("int");

		Variable var_methodEncryption_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_throws.setValue(__helper.getValue("methodEncryption", "throws"));
		var_methodEncryption_throws.setType("String");

		Variable var_methodPerformEncryption_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_parameters.setValue(__helper.getValue("methodPerformEncryption", "parameters"));
		var_methodPerformEncryption_parameters.setType("String");

		Variable var_literal8 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal8.setValue(
				"InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException");
		var_literal8.setType("");

		Variable var_literal9 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal9.setValue("byte[] ");
		var_literal9.setType("");

		Variable var_exprDataName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName", true, csp);
		var_exprDataName_identifier.setValue(__helper.getValue("exprDataName", "identifier"));
		var_exprDataName_identifier.setType("String");

		Variable var_literal10 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal10.setValue(
				"{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n");
		var_literal10.setType("");

		Variable var_methodEncryption_modifier = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true,
				csp);
		var_methodEncryption_modifier.setValue(__helper.getValue("methodEncryption", "modifier"));
		var_methodEncryption_modifier.setType("String");

		Variable var_literal11 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal11.setValue("public");
		var_literal11.setType("");

		Variable var_methodPerformEncryption_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformEncryption",
				true, csp);
		var_methodPerformEncryption_body.setValue(__helper.getValue("methodPerformEncryption", "body"));
		var_methodPerformEncryption_body.setType("String");

		Variable var_methodEncryption_type = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_type.setValue(__helper.getValue("methodEncryption", "type"));
		var_methodEncryption_type.setType("String");

		Variable var_methodEncryption_name = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_name.setValue(__helper.getValue("methodEncryption", "name"));
		var_methodEncryption_name.setType("String");

		Variable var_literal12 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal12.setValue("encrypt");
		var_literal12.setType("");

		Variable var_literal13 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal13.setValue(1);
		var_literal13.setType("");

		Variable var_methodEncryption_index = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_index.setValue(__helper.getValue("methodEncryption", "index"));
		var_methodEncryption_index.setType("int");

		Variable var_methodPerformEncryption_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_throws.setValue(__helper.getValue("methodPerformEncryption", "throws"));
		var_methodPerformEncryption_throws.setType("String");

		Variable var_exprKeyName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName", true, csp);
		var_exprKeyName_index.setValue(__helper.getValue("exprKeyName", "index"));
		var_exprKeyName_index.setType("int");

		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage", true, csp);
		var_javaPackage_name.setValue(__helper.getValue("javaPackage", "name"));
		var_javaPackage_name.setType("String");

		Variable var_sbc_mode = CSPFactoryHelper.eINSTANCE.createVariable("sbc", true, csp);
		var_sbc_mode.setValue(__helper.getValue("sbc", "mode"));
		var_sbc_mode.setType("String");

		Variable var_sbc_padding = CSPFactoryHelper.eINSTANCE.createVariable("sbc", true, csp);
		var_sbc_padding.setValue(__helper.getValue("sbc", "padding"));
		var_sbc_padding.setType("String");

		Variable var_sbc_name = CSPFactoryHelper.eINSTANCE.createVariable("sbc", true, csp);
		var_sbc_name.setValue(__helper.getValue("sbc", "name"));
		var_sbc_name.setType("String");

		Variable var_exprNameModePadding_value = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding", true,
				csp);
		var_exprNameModePadding_value.setValue(__helper.getValue("exprNameModePadding", "value"));
		var_exprNameModePadding_value.setType("String");

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

		SetDefaultStringIfNull setDefaultStringIfNull11 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull11);

		SetDefaultStringIfNull setDefaultStringIfNull12 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull12);

		SetDefaultStringIfNull setDefaultStringIfNull13 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull13);

		SetDefaultStringIfNull setDefaultStringIfNull14 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull14);

		SetDefaultStringIfNull setDefaultStringIfNull15 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull15);

		SetDefaultStringIfNull setDefaultStringIfNull16 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull16);

		Eq eq17 = new Eq();
		csp.getConstraints().add(eq17);

		NameModePadding nameModePadding18 = new NameModePadding();
		csp.getConstraints().add(nameModePadding18);

		setDefaultStringIfNull0.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull0.solve(var_task_package, var_literal2);

		setDefaultStringIfNull1.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull1.solve(var_exprDataName_identifier, var_literal0);

		setDefaultStringIfNull2.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull2.solve(var_methodPerformEncryption_modifier, var_literal1);

		setDefaultStringIfNull3.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull3.solve(var_exprDataName_index, var_literal3);

		setDefaultStringIfNull4.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull4.solve(var_jcu_name, var_literal5);

		setDefaultStringIfNull5.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull5.solve(var_exprKeyName_identifier, var_literal4);

		setDefaultStringIfNull6.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull6.solve(var_exprNameModePadding_index, var_literal6);

		setDefaultStringIfNull7.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull7.solve(var_methodPerformEncryption_parameters, var_literal7);

		setDefaultStringIfNull8.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull8.solve(var_methodEncryption_throws, var_literal8);

		setDefaultStringIfNull9.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull9.solve(var_methodPerformEncryption_index, var_literal3);

		setDefaultStringIfNull10.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull10.solve(var_methodEncryption_type, var_literal9);

		setDefaultStringIfNull11.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull11.solve(var_methodPerformEncryption_throws, var_literal8);

		setDefaultStringIfNull12.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull12.solve(var_methodEncryption_modifier, var_literal11);

		setDefaultStringIfNull13.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull13.solve(var_methodPerformEncryption_body, var_literal10);

		setDefaultStringIfNull14.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull14.solve(var_methodEncryption_index, var_literal13);

		setDefaultStringIfNull15.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull15.solve(var_methodEncryption_name, var_literal12);

		setDefaultStringIfNull16.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull16.solve(var_exprKeyName_index, var_literal13);

		eq17.setRuleName("SymmetricEncryptionTask");
		eq17.solve(var_task_package, var_javaPackage_name);

		nameModePadding18.setRuleName("SymmetricEncryptionTask");
		nameModePadding18.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_exprDataName_identifier.setBound(false);
			var_methodPerformEncryption_modifier.setBound(false);
			var_exprDataName_index.setBound(false);
			var_jcu_name.setBound(false);
			var_exprKeyName_identifier.setBound(false);
			var_exprNameModePadding_index.setBound(false);
			var_methodPerformEncryption_parameters.setBound(false);
			var_methodEncryption_throws.setBound(false);
			var_methodPerformEncryption_index.setBound(false);
			var_methodEncryption_type.setBound(false);
			var_methodPerformEncryption_throws.setBound(false);
			var_methodEncryption_modifier.setBound(false);
			var_methodPerformEncryption_body.setBound(false);
			var_methodEncryption_index.setBound(false);
			var_methodEncryption_name.setBound(false);
			var_exprKeyName_index.setBound(false);
			var_javaPackage_name.setBound(false);
			var_exprNameModePadding_value.setBound(false);
			setDefaultStringIfNull0.solve(var_task_package, var_literal2);
			setDefaultStringIfNull1.solve(var_exprDataName_identifier, var_literal0);
			setDefaultStringIfNull2.solve(var_methodPerformEncryption_modifier, var_literal1);
			setDefaultStringIfNull3.solve(var_exprDataName_index, var_literal3);
			setDefaultStringIfNull4.solve(var_jcu_name, var_literal5);
			setDefaultStringIfNull5.solve(var_exprKeyName_identifier, var_literal4);
			setDefaultStringIfNull6.solve(var_exprNameModePadding_index, var_literal6);
			setDefaultStringIfNull7.solve(var_methodPerformEncryption_parameters, var_literal7);
			setDefaultStringIfNull8.solve(var_methodEncryption_throws, var_literal8);
			setDefaultStringIfNull9.solve(var_methodPerformEncryption_index, var_literal3);
			setDefaultStringIfNull10.solve(var_methodEncryption_type, var_literal9);
			setDefaultStringIfNull11.solve(var_methodPerformEncryption_throws, var_literal8);
			setDefaultStringIfNull12.solve(var_methodEncryption_modifier, var_literal11);
			setDefaultStringIfNull13.solve(var_methodPerformEncryption_body, var_literal10);
			setDefaultStringIfNull14.solve(var_methodEncryption_index, var_literal13);
			setDefaultStringIfNull15.solve(var_methodEncryption_name, var_literal12);
			setDefaultStringIfNull16.solve(var_exprKeyName_index, var_literal13);
			eq17.solve(var_task_package, var_javaPackage_name);
			nameModePadding18.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("exprDataName", "identifier", var_exprDataName_identifier.getValue());
				__helper.setValue("methodPerformEncryption", "modifier",
						var_methodPerformEncryption_modifier.getValue());
				__helper.setValue("exprDataName", "index", var_exprDataName_index.getValue());
				__helper.setValue("jcu", "name", var_jcu_name.getValue());
				__helper.setValue("exprKeyName", "identifier", var_exprKeyName_identifier.getValue());
				__helper.setValue("exprNameModePadding", "index", var_exprNameModePadding_index.getValue());
				__helper.setValue("methodPerformEncryption", "parameters",
						var_methodPerformEncryption_parameters.getValue());
				__helper.setValue("methodEncryption", "throws", var_methodEncryption_throws.getValue());
				__helper.setValue("methodPerformEncryption", "index", var_methodPerformEncryption_index.getValue());
				__helper.setValue("methodEncryption", "type", var_methodEncryption_type.getValue());
				__helper.setValue("methodPerformEncryption", "throws", var_methodPerformEncryption_throws.getValue());
				__helper.setValue("methodEncryption", "modifier", var_methodEncryption_modifier.getValue());
				__helper.setValue("methodPerformEncryption", "body", var_methodPerformEncryption_body.getValue());
				__helper.setValue("methodEncryption", "index", var_methodEncryption_index.getValue());
				__helper.setValue("methodEncryption", "name", var_methodEncryption_name.getValue());
				__helper.setValue("exprKeyName", "index", var_exprKeyName_index.getValue());
				__helper.setValue("javaPackage", "name", var_javaPackage_name.getValue());
				__helper.setValue("exprNameModePadding", "value", var_exprNameModePadding_value.getValue());
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
		ruleResult.setRule("SymmetricEncryptionTask");
		ruleResult.setSuccess(true);

		CSP csp = CspFactory.eINSTANCE.createCSP();

		CheckAttributeHelper __helper = new CheckAttributeHelper(__tripleMatch);

		if (!__helper.hasExpectedValue("statRetPerformEncryption", "return", true, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("dataEncryption", "index", 0, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("dataEncryption", "name", "data", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("dataEncryption", "type", "byte[]", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("exprRetPerformEncryption", "name", "performEncryption",
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("task", "description", "SymmetricEncryption", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformEncryption", "type", "byte[] ", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("methodPerformEncryption", "name", "performEncryption",
				ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("keyEncryption", "type", "SecretKey", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("keyEncryption", "index", 1, ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		if (!__helper.hasExpectedValue("keyEncryption", "name", "key", ComparingOperator.EQUAL)) {
			ruleResult.setSuccess(false);
			return ruleResult;
		}

		Variable var_literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal0.setValue("data");
		var_literal0.setType("");

		Variable var_literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal1.setValue("private");
		var_literal1.setType("");

		Variable var_literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal2.setValue("crypto");
		var_literal2.setType("");

		Variable var_methodPerformEncryption_modifier = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_modifier.setValue(__helper.getValue("methodPerformEncryption", "modifier"));
		var_methodPerformEncryption_modifier.setType("String");

		Variable var_exprDataName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName", true, csp);
		var_exprDataName_index.setValue(__helper.getValue("exprDataName", "index"));
		var_exprDataName_index.setType("int");

		Variable var_literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal3.setValue(0);
		var_literal3.setType("");

		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task", true, csp);
		var_task_package.setValue(__helper.getValue("task", "package"));
		var_task_package.setType("String");

		Variable var_jcu_name = CSPFactoryHelper.eINSTANCE.createVariable("jcu", true, csp);
		var_jcu_name.setValue(__helper.getValue("jcu", "name"));
		var_jcu_name.setType("String");

		Variable var_literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal4.setValue("key");
		var_literal4.setType("");

		Variable var_exprKeyName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName", true, csp);
		var_exprKeyName_identifier.setValue(__helper.getValue("exprKeyName", "identifier"));
		var_exprKeyName_identifier.setType("String");

		Variable var_literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal5.setValue("Enc");
		var_literal5.setType("");

		Variable var_literal6 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal6.setValue(2);
		var_literal6.setType("");

		Variable var_exprNameModePadding_index = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding", true,
				csp);
		var_exprNameModePadding_index.setValue(__helper.getValue("exprNameModePadding", "index"));
		var_exprNameModePadding_index.setType("int");

		Variable var_literal7 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal7.setValue("byte[] data,SecretKey key,String encryptPassingArgument");
		var_literal7.setType("");

		Variable var_methodPerformEncryption_index = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_index.setValue(__helper.getValue("methodPerformEncryption", "index"));
		var_methodPerformEncryption_index.setType("int");

		Variable var_methodEncryption_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_throws.setValue(__helper.getValue("methodEncryption", "throws"));
		var_methodEncryption_throws.setType("String");

		Variable var_methodPerformEncryption_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_parameters.setValue(__helper.getValue("methodPerformEncryption", "parameters"));
		var_methodPerformEncryption_parameters.setType("String");

		Variable var_literal8 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal8.setValue(
				"InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException");
		var_literal8.setType("");

		Variable var_literal9 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal9.setValue("byte[] ");
		var_literal9.setType("");

		Variable var_exprDataName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName", true, csp);
		var_exprDataName_identifier.setValue(__helper.getValue("exprDataName", "identifier"));
		var_exprDataName_identifier.setType("String");

		Variable var_literal10 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal10.setValue(
				"{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n");
		var_literal10.setType("");

		Variable var_methodEncryption_modifier = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true,
				csp);
		var_methodEncryption_modifier.setValue(__helper.getValue("methodEncryption", "modifier"));
		var_methodEncryption_modifier.setType("String");

		Variable var_literal11 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal11.setValue("public");
		var_literal11.setType("");

		Variable var_methodPerformEncryption_body = CSPFactoryHelper.eINSTANCE.createVariable("methodPerformEncryption",
				true, csp);
		var_methodPerformEncryption_body.setValue(__helper.getValue("methodPerformEncryption", "body"));
		var_methodPerformEncryption_body.setType("String");

		Variable var_methodEncryption_type = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_type.setValue(__helper.getValue("methodEncryption", "type"));
		var_methodEncryption_type.setType("String");

		Variable var_methodEncryption_name = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_name.setValue(__helper.getValue("methodEncryption", "name"));
		var_methodEncryption_name.setType("String");

		Variable var_literal12 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal12.setValue("encrypt");
		var_literal12.setType("");

		Variable var_literal13 = CSPFactoryHelper.eINSTANCE.createVariable("literal", true, csp);
		var_literal13.setValue(1);
		var_literal13.setType("");

		Variable var_methodEncryption_index = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption", true, csp);
		var_methodEncryption_index.setValue(__helper.getValue("methodEncryption", "index"));
		var_methodEncryption_index.setType("int");

		Variable var_methodPerformEncryption_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption", true, csp);
		var_methodPerformEncryption_throws.setValue(__helper.getValue("methodPerformEncryption", "throws"));
		var_methodPerformEncryption_throws.setType("String");

		Variable var_exprKeyName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName", true, csp);
		var_exprKeyName_index.setValue(__helper.getValue("exprKeyName", "index"));
		var_exprKeyName_index.setType("int");

		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage", true, csp);
		var_javaPackage_name.setValue(__helper.getValue("javaPackage", "name"));
		var_javaPackage_name.setType("String");

		Variable var_sbc_mode = CSPFactoryHelper.eINSTANCE.createVariable("sbc", true, csp);
		var_sbc_mode.setValue(__helper.getValue("sbc", "mode"));
		var_sbc_mode.setType("String");

		Variable var_sbc_padding = CSPFactoryHelper.eINSTANCE.createVariable("sbc", true, csp);
		var_sbc_padding.setValue(__helper.getValue("sbc", "padding"));
		var_sbc_padding.setType("String");

		Variable var_sbc_name = CSPFactoryHelper.eINSTANCE.createVariable("sbc", true, csp);
		var_sbc_name.setValue(__helper.getValue("sbc", "name"));
		var_sbc_name.setType("String");

		Variable var_exprNameModePadding_value = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding", true,
				csp);
		var_exprNameModePadding_value.setValue(__helper.getValue("exprNameModePadding", "value"));
		var_exprNameModePadding_value.setType("String");

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

		SetDefaultStringIfNull setDefaultStringIfNull11 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull11);

		SetDefaultStringIfNull setDefaultStringIfNull12 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull12);

		SetDefaultStringIfNull setDefaultStringIfNull13 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull13);

		SetDefaultStringIfNull setDefaultStringIfNull14 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull14);

		SetDefaultStringIfNull setDefaultStringIfNull15 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull15);

		SetDefaultStringIfNull setDefaultStringIfNull16 = new SetDefaultStringIfNull();
		csp.getConstraints().add(setDefaultStringIfNull16);

		Eq eq17 = new Eq();
		csp.getConstraints().add(eq17);

		NameModePadding nameModePadding18 = new NameModePadding();
		csp.getConstraints().add(nameModePadding18);

		setDefaultStringIfNull0.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull0.solve(var_exprDataName_identifier, var_literal0);

		setDefaultStringIfNull1.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull1.solve(var_methodPerformEncryption_modifier, var_literal1);

		setDefaultStringIfNull2.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull2.solve(var_exprDataName_index, var_literal3);

		setDefaultStringIfNull3.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull3.solve(var_jcu_name, var_literal5);

		setDefaultStringIfNull4.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull4.solve(var_exprKeyName_identifier, var_literal4);

		setDefaultStringIfNull5.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull5.solve(var_exprNameModePadding_index, var_literal6);

		setDefaultStringIfNull6.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull6.solve(var_methodPerformEncryption_parameters, var_literal7);

		setDefaultStringIfNull7.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull7.solve(var_methodEncryption_throws, var_literal8);

		setDefaultStringIfNull8.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull8.solve(var_methodPerformEncryption_index, var_literal3);

		setDefaultStringIfNull9.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull9.solve(var_methodEncryption_type, var_literal9);

		setDefaultStringIfNull10.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull10.solve(var_methodPerformEncryption_throws, var_literal8);

		setDefaultStringIfNull11.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull11.solve(var_methodEncryption_modifier, var_literal11);

		setDefaultStringIfNull12.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull12.solve(var_methodPerformEncryption_body, var_literal10);

		setDefaultStringIfNull13.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull13.solve(var_methodEncryption_index, var_literal13);

		setDefaultStringIfNull14.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull14.solve(var_methodEncryption_name, var_literal12);

		setDefaultStringIfNull15.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull15.solve(var_exprKeyName_index, var_literal13);

		setDefaultStringIfNull16.setRuleName("SymmetricEncryptionTask");
		setDefaultStringIfNull16.solve(var_task_package, var_literal2);

		eq17.setRuleName("SymmetricEncryptionTask");
		eq17.solve(var_task_package, var_javaPackage_name);

		nameModePadding18.setRuleName("SymmetricEncryptionTask");
		nameModePadding18.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);

		if (csp.check()) {
			ruleResult.setSuccess(true);
		} else {
			var_task_package.setBound(false);
			var_task_package.setBound(false);
			var_sbc_mode.setBound(false);
			var_sbc_padding.setBound(false);
			var_sbc_name.setBound(false);
			setDefaultStringIfNull0.solve(var_exprDataName_identifier, var_literal0);
			setDefaultStringIfNull1.solve(var_methodPerformEncryption_modifier, var_literal1);
			setDefaultStringIfNull2.solve(var_exprDataName_index, var_literal3);
			setDefaultStringIfNull3.solve(var_jcu_name, var_literal5);
			setDefaultStringIfNull4.solve(var_exprKeyName_identifier, var_literal4);
			setDefaultStringIfNull5.solve(var_exprNameModePadding_index, var_literal6);
			setDefaultStringIfNull6.solve(var_methodPerformEncryption_parameters, var_literal7);
			setDefaultStringIfNull7.solve(var_methodEncryption_throws, var_literal8);
			setDefaultStringIfNull8.solve(var_methodPerformEncryption_index, var_literal3);
			setDefaultStringIfNull9.solve(var_methodEncryption_type, var_literal9);
			setDefaultStringIfNull10.solve(var_methodPerformEncryption_throws, var_literal8);
			setDefaultStringIfNull11.solve(var_methodEncryption_modifier, var_literal11);
			setDefaultStringIfNull12.solve(var_methodPerformEncryption_body, var_literal10);
			setDefaultStringIfNull13.solve(var_methodEncryption_index, var_literal13);
			setDefaultStringIfNull14.solve(var_methodEncryption_name, var_literal12);
			setDefaultStringIfNull15.solve(var_exprKeyName_index, var_literal13);
			setDefaultStringIfNull16.solve(var_task_package, var_literal2);
			eq17.solve(var_task_package, var_javaPackage_name);
			nameModePadding18.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);
			if (csp.check()) {
				ruleResult.setSuccess(true);
				ruleResult.setRequiredChange(true);
				__helper.setValue("task", "package", var_task_package.getValue());
				__helper.setValue("task", "package", var_task_package.getValue());
				__helper.setValue("sbc", "mode", var_sbc_mode.getValue());
				__helper.setValue("sbc", "padding", var_sbc_padding.getValue());
				__helper.setValue("sbc", "name", var_sbc_name.getValue());
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

		Object[] result1_black = SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_24_1_prepare_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_24_1_prepare_greenF();
		IsApplicableRuleResult result = (IsApplicableRuleResult) result1_green[0];

		Object[] result2_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFFFBB(sourceMatch,
						targetMatch);
		if (result2_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[sourceMatch] = " + sourceMatch
					+ ", " + "[targetMatch] = " + targetMatch + ".");
		}
		JavaPackage javaPackage = (JavaPackage) result2_bindingAndBlack[0];
		SymmetricBlockCipher sbc = (SymmetricBlockCipher) result2_bindingAndBlack[1];
		JavaName exprDataName = (JavaName) result2_bindingAndBlack[2];
		JavaStatement statRetPerformEncryption = (JavaStatement) result2_bindingAndBlack[3];
		JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result2_bindingAndBlack[4];
		JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result2_bindingAndBlack[5];
		JavaName exprKeyName = (JavaName) result2_bindingAndBlack[6];
		Task task = (Task) result2_bindingAndBlack[7];
		JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result2_bindingAndBlack[8];
		JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result2_bindingAndBlack[9];
		JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result2_bindingAndBlack[10];
		JavaLiteral exprNameModePadding = (JavaLiteral) result2_bindingAndBlack[11];
		JavaCompilationUnit jcu = (JavaCompilationUnit) result2_bindingAndBlack[12];

		Object[] result3_bindingAndBlack = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBBBB(this, javaPackage, sbc,
						exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						task, methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu,
						sourceMatch, targetMatch);
		if (result3_bindingAndBlack == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
					+ "[javaPackage] = " + javaPackage + ", " + "[sbc] = " + sbc + ", " + "[exprDataName] = "
					+ exprDataName + ", " + "[statRetPerformEncryption] = " + statRetPerformEncryption + ", "
					+ "[dataEncryption] = " + dataEncryption + ", " + "[exprRetPerformEncryption] = "
					+ exprRetPerformEncryption + ", " + "[exprKeyName] = " + exprKeyName + ", " + "[task] = " + task
					+ ", " + "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
					+ methodEncryption + ", " + "[keyEncryption] = " + keyEncryption + ", " + "[exprNameModePadding] = "
					+ exprNameModePadding + ", " + "[jcu] = " + jcu + ", " + "[sourceMatch] = " + sourceMatch + ", "
					+ "[targetMatch] = " + targetMatch + ".");
		}
		CSP csp = (CSP) result3_bindingAndBlack[0];
		// 
		if (SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_24_4_checkCSP_expressionFB(csp)) {
			// ForEach 
			for (Object[] result5_black : SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_24_5_matchcorrcontext_blackBB(sourceMatch, targetMatch)) {
				Object[] result5_green = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_24_5_matchcorrcontext_greenBBF(sourceMatch, targetMatch);
				CCMatch ccMatch = (CCMatch) result5_green[2];

				Object[] result6_black = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_24_6_createcorrespondence_blackBBBBBBBBBBBBBB(javaPackage, sbc,
								exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
								exprKeyName, task, methodPerformEncryption, methodEncryption, keyEncryption,
								exprNameModePadding, jcu, ccMatch);
				if (result6_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[javaPackage] = "
							+ javaPackage + ", " + "[sbc] = " + sbc + ", " + "[exprDataName] = " + exprDataName + ", "
							+ "[statRetPerformEncryption] = " + statRetPerformEncryption + ", " + "[dataEncryption] = "
							+ dataEncryption + ", " + "[exprRetPerformEncryption] = " + exprRetPerformEncryption + ", "
							+ "[exprKeyName] = " + exprKeyName + ", " + "[task] = " + task + ", "
							+ "[methodPerformEncryption] = " + methodPerformEncryption + ", " + "[methodEncryption] = "
							+ methodEncryption + ", " + "[keyEncryption] = " + keyEncryption + ", "
							+ "[exprNameModePadding] = " + exprNameModePadding + ", " + "[jcu] = " + jcu + ", "
							+ "[ccMatch] = " + ccMatch + ".");
				}
				SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_24_6_createcorrespondence_greenBBBFBFB(
						javaPackage, sbc, task, jcu, ccMatch);
				//nothing TaskToJavaPackage t2c = (TaskToJavaPackage) result6_green[3];
				//nothing SymmetricBlockCipherToJcu sbc2Jcu = (SymmetricBlockCipherToJcu) result6_green[5];

				Object[] result7_black = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_24_7_addtoreturnedresult_blackBB(result, ccMatch);
				if (result7_black == null) {
					throw new RuntimeException("Pattern matching failed." + " Variables: " + "[result] = " + result
							+ ", " + "[ccMatch] = " + ccMatch + ".");
				}
				SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_24_7_addtoreturnedresult_greenBB(result,
						ccMatch);

			}

		} else {
		}
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_24_8_expressionFB(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP isApplicable_solveCsp_CC(JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			Match sourceMatch, Match targetMatch) {// Create CSP
		CSP csp = CspFactory.eINSTANCE.createCSP();

		// Create literals
		Variable literal0 = CSPFactoryHelper.eINSTANCE.createVariable("literal0", true, csp);
		literal0.setValue("data");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue("private");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue(0);
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue("Enc");
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("key");
		literal4.setType("");
		Variable literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal5", true, csp);
		literal5.setValue(2);
		literal5.setType("");
		Variable literal6 = CSPFactoryHelper.eINSTANCE.createVariable("literal6", true, csp);
		literal6.setValue("byte[] data,SecretKey key,String encryptPassingArgument");
		literal6.setType("");
		Variable literal7 = CSPFactoryHelper.eINSTANCE.createVariable("literal7", true, csp);
		literal7.setValue(
				"InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException");
		literal7.setType("");
		Variable literal8 = CSPFactoryHelper.eINSTANCE.createVariable("literal8", true, csp);
		literal8.setValue("byte[] ");
		literal8.setType("");
		Variable literal9 = CSPFactoryHelper.eINSTANCE.createVariable("literal9", true, csp);
		literal9.setValue("public");
		literal9.setType("");
		Variable literal10 = CSPFactoryHelper.eINSTANCE.createVariable("literal10", true, csp);
		literal10.setValue(
				"{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n");
		literal10.setType("");
		Variable literal11 = CSPFactoryHelper.eINSTANCE.createVariable("literal11", true, csp);
		literal11.setValue(1);
		literal11.setType("");
		Variable literal12 = CSPFactoryHelper.eINSTANCE.createVariable("literal12", true, csp);
		literal12.setValue("encrypt");
		literal12.setType("");

		// Create attribute variables
		Variable var_exprDataName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.identifier",
				true, csp);
		var_exprDataName_identifier.setValue(exprDataName.getIdentifier());
		var_exprDataName_identifier.setType("String");
		Variable var_methodPerformEncryption_modifier = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.modifier", true, csp);
		var_methodPerformEncryption_modifier.setValue(methodPerformEncryption.getModifier());
		var_methodPerformEncryption_modifier.setType("String");
		Variable var_exprDataName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.index", true, csp);
		var_exprDataName_index.setValue(exprDataName.getIndex());
		var_exprDataName_index.setType("int");
		Variable var_jcu_name = CSPFactoryHelper.eINSTANCE.createVariable("jcu.name", true, csp);
		var_jcu_name.setValue(jcu.getName());
		var_jcu_name.setType("String");
		Variable var_exprKeyName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.identifier", true,
				csp);
		var_exprKeyName_identifier.setValue(exprKeyName.getIdentifier());
		var_exprKeyName_identifier.setType("String");
		Variable var_exprNameModePadding_index = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.index",
				true, csp);
		var_exprNameModePadding_index.setValue(exprNameModePadding.getIndex());
		var_exprNameModePadding_index.setType("int");
		Variable var_methodPerformEncryption_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.parameters", true, csp);
		var_methodPerformEncryption_parameters.setValue(methodPerformEncryption.getParameters());
		var_methodPerformEncryption_parameters.setType("String");
		Variable var_methodEncryption_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.throws",
				true, csp);
		var_methodEncryption_throws.setValue(methodEncryption.getThrows());
		var_methodEncryption_throws.setType("String");
		Variable var_methodPerformEncryption_index = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.index", true, csp);
		var_methodPerformEncryption_index.setValue(methodPerformEncryption.getIndex());
		var_methodPerformEncryption_index.setType("int");
		Variable var_methodEncryption_type = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.type", true,
				csp);
		var_methodEncryption_type.setValue(methodEncryption.getType());
		var_methodEncryption_type.setType("String");
		Variable var_methodPerformEncryption_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.throws", true, csp);
		var_methodPerformEncryption_throws.setValue(methodPerformEncryption.getThrows());
		var_methodPerformEncryption_throws.setType("String");
		Variable var_methodEncryption_modifier = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.modifier",
				true, csp);
		var_methodEncryption_modifier.setValue(methodEncryption.getModifier());
		var_methodEncryption_modifier.setType("String");
		Variable var_methodPerformEncryption_body = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.body", true, csp);
		var_methodPerformEncryption_body.setValue(methodPerformEncryption.getBody());
		var_methodPerformEncryption_body.setType("String");
		Variable var_methodEncryption_index = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.index", true,
				csp);
		var_methodEncryption_index.setValue(methodEncryption.getIndex());
		var_methodEncryption_index.setType("int");
		Variable var_methodEncryption_name = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.name", true,
				csp);
		var_methodEncryption_name.setValue(methodEncryption.getName());
		var_methodEncryption_name.setType("String");
		Variable var_exprKeyName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.index", true, csp);
		var_exprKeyName_index.setValue(exprKeyName.getIndex());
		var_exprKeyName_index.setType("int");
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", true, csp);
		var_task_package.setValue(task.getPackage());
		var_task_package.setType("String");
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", true, csp);
		var_javaPackage_name.setValue(javaPackage.getName());
		var_javaPackage_name.setType("String");
		Variable var_sbc_name = CSPFactoryHelper.eINSTANCE.createVariable("sbc.name", true, csp);
		var_sbc_name.setValue(sbc.getName());
		var_sbc_name.setType("String");
		Variable var_sbc_mode = CSPFactoryHelper.eINSTANCE.createVariable("sbc.mode", true, csp);
		var_sbc_mode.setValue(sbc.getMode());
		var_sbc_mode.setType("String");
		Variable var_sbc_padding = CSPFactoryHelper.eINSTANCE.createVariable("sbc.padding", true, csp);
		var_sbc_padding.setValue(sbc.getPadding());
		var_sbc_padding.setType("String");
		Variable var_exprNameModePadding_value = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.value",
				true, csp);
		var_exprNameModePadding_value.setValue(exprNameModePadding.getValue());
		var_exprNameModePadding_value.setType("String");

		// Create unbound variables

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_5 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_6 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_7 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_8 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_9 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_10 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_11 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_12 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_13 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_14 = new SetDefaultStringIfNull();
		Eq eq = new Eq();
		NameModePadding nameModePadding = new NameModePadding();

		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);
		csp.getConstraints().add(setDefaultStringIfNull_5);
		csp.getConstraints().add(setDefaultStringIfNull_6);
		csp.getConstraints().add(setDefaultStringIfNull_7);
		csp.getConstraints().add(setDefaultStringIfNull_8);
		csp.getConstraints().add(setDefaultStringIfNull_9);
		csp.getConstraints().add(setDefaultStringIfNull_10);
		csp.getConstraints().add(setDefaultStringIfNull_11);
		csp.getConstraints().add(setDefaultStringIfNull_12);
		csp.getConstraints().add(setDefaultStringIfNull_13);
		csp.getConstraints().add(setDefaultStringIfNull_14);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(nameModePadding);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_exprDataName_identifier, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformEncryption_modifier, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_exprDataName_index, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_jcu_name, literal3);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_exprKeyName_identifier, literal4);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_exprNameModePadding_index, literal5);
		setDefaultStringIfNull_5.setRuleName("NoRuleName");
		setDefaultStringIfNull_5.solve(var_methodPerformEncryption_parameters, literal6);
		setDefaultStringIfNull_6.setRuleName("NoRuleName");
		setDefaultStringIfNull_6.solve(var_methodEncryption_throws, literal7);
		setDefaultStringIfNull_7.setRuleName("NoRuleName");
		setDefaultStringIfNull_7.solve(var_methodPerformEncryption_index, literal2);
		setDefaultStringIfNull_8.setRuleName("NoRuleName");
		setDefaultStringIfNull_8.solve(var_methodEncryption_type, literal8);
		setDefaultStringIfNull_9.setRuleName("NoRuleName");
		setDefaultStringIfNull_9.solve(var_methodPerformEncryption_throws, literal7);
		setDefaultStringIfNull_10.setRuleName("NoRuleName");
		setDefaultStringIfNull_10.solve(var_methodEncryption_modifier, literal9);
		setDefaultStringIfNull_11.setRuleName("NoRuleName");
		setDefaultStringIfNull_11.solve(var_methodPerformEncryption_body, literal10);
		setDefaultStringIfNull_12.setRuleName("NoRuleName");
		setDefaultStringIfNull_12.solve(var_methodEncryption_index, literal11);
		setDefaultStringIfNull_13.setRuleName("NoRuleName");
		setDefaultStringIfNull_13.solve(var_methodEncryption_name, literal12);
		setDefaultStringIfNull_14.setRuleName("NoRuleName");
		setDefaultStringIfNull_14.solve(var_exprKeyName_index, literal11);
		eq.setRuleName("NoRuleName");
		eq.solve(var_task_package, var_javaPackage_name);
		nameModePadding.setRuleName("NoRuleName");
		nameModePadding.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);
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
	public boolean checkDEC_FWD(SymmetricBlockCipher sbc, Task task) {// 
		Object[] result1_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_27_1_matchtggpattern_blackBB(sbc, task);
		if (result1_black != null) {
			SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_27_1_matchtggpattern_greenB(task);

			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_27_2_expressionF();
		} else {
			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_27_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkDEC_BWD(JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {// 
		Object[] result1_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_28_1_matchtggpattern_blackBBBBBBBBBBB(javaPackage, exprDataName,
						statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu);
		if (result1_black != null) {
			SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_28_1_matchtggpattern_greenBBBBB(
					statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, methodPerformEncryption,
					keyEncryption);

			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_28_2_expressionF();
		} else {
			return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_28_3_expressionF();
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer) {

		Object[] result1_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_29_1_createresult_blackB(this);
		if (result1_black == null) {
			throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ".");
		}
		Object[] result1_green = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_29_1_createresult_greenFF();
		IsApplicableMatch isApplicableMatch = (IsApplicableMatch) result1_green[0];
		ModelgeneratorRuleResult ruleResult = (ModelgeneratorRuleResult) result1_green[1];

		// 
		Object[] result2_black = SymmetricEncryptionTaskImpl
				.pattern_SymmetricEncryptionTask_29_2_isapplicablecore_blackB(this);
		if (result2_black != null) {

			Object[] result3_bindingAndBlack = SymmetricEncryptionTaskImpl
					.pattern_SymmetricEncryptionTask_29_3_solveCSP_bindingAndBlackFBBB(this, isApplicableMatch,
							ruleResult);
			if (result3_bindingAndBlack == null) {
				throw new RuntimeException("Pattern matching failed." + " Variables: " + "[this] = " + this + ", "
						+ "[isApplicableMatch] = " + isApplicableMatch + ", " + "[ruleResult] = " + ruleResult + ".");
			}
			CSP csp = (CSP) result3_bindingAndBlack[0];
			// 
			if (SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_29_4_checkCSP_expressionFBB(this, csp)) {
				// 

				Object[] result6_black = SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_29_6_perform_blackB(ruleResult);
				if (result6_black == null) {
					throw new RuntimeException(
							"Pattern matching failed." + " Variables: " + "[ruleResult] = " + ruleResult + ".");
				}
				SymmetricEncryptionTaskImpl
						.pattern_SymmetricEncryptionTask_29_6_perform_greenFFFFFFFFFFFFFFFBB(ruleResult, csp);
				//nothing JavaPackage javaPackage = (JavaPackage) result6_green[0];
				//nothing SymmetricBlockCipher sbc = (SymmetricBlockCipher) result6_green[1];
				//nothing JavaName exprDataName = (JavaName) result6_green[2];
				//nothing JavaStatement statRetPerformEncryption = (JavaStatement) result6_green[3];
				//nothing JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result6_green[4];
				//nothing JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result6_green[5];
				//nothing JavaName exprKeyName = (JavaName) result6_green[6];
				//nothing Task task = (Task) result6_green[7];
				//nothing JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result6_green[8];
				//nothing JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result6_green[9];
				//nothing TaskToJavaPackage t2c = (TaskToJavaPackage) result6_green[10];
				//nothing JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result6_green[11];
				//nothing JavaLiteral exprNameModePadding = (JavaLiteral) result6_green[12];
				//nothing JavaCompilationUnit jcu = (JavaCompilationUnit) result6_green[13];
				//nothing SymmetricBlockCipherToJcu sbc2Jcu = (SymmetricBlockCipherToJcu) result6_green[14];

			} else {
			}

		} else {
		}
		return SymmetricEncryptionTaskImpl.pattern_SymmetricEncryptionTask_29_7_expressionFB(ruleResult);
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
		literal0.setValue("data");
		literal0.setType("");
		Variable literal1 = CSPFactoryHelper.eINSTANCE.createVariable("literal1", true, csp);
		literal1.setValue("private");
		literal1.setType("");
		Variable literal2 = CSPFactoryHelper.eINSTANCE.createVariable("literal2", true, csp);
		literal2.setValue("crypto");
		literal2.setType("");
		Variable literal3 = CSPFactoryHelper.eINSTANCE.createVariable("literal3", true, csp);
		literal3.setValue(0);
		literal3.setType("");
		Variable literal4 = CSPFactoryHelper.eINSTANCE.createVariable("literal4", true, csp);
		literal4.setValue("Enc");
		literal4.setType("");
		Variable literal5 = CSPFactoryHelper.eINSTANCE.createVariable("literal5", true, csp);
		literal5.setValue("key");
		literal5.setType("");
		Variable literal6 = CSPFactoryHelper.eINSTANCE.createVariable("literal6", true, csp);
		literal6.setValue(2);
		literal6.setType("");
		Variable literal7 = CSPFactoryHelper.eINSTANCE.createVariable("literal7", true, csp);
		literal7.setValue("byte[] data,SecretKey key,String encryptPassingArgument");
		literal7.setType("");
		Variable literal8 = CSPFactoryHelper.eINSTANCE.createVariable("literal8", true, csp);
		literal8.setValue(
				"InvalidKeyException,NoSuchAlgorithmException,NoSuchPaddingException,IllegalBlockSizeException,BadPaddingException,InvalidAlgorithmParameterException");
		literal8.setType("");
		Variable literal9 = CSPFactoryHelper.eINSTANCE.createVariable("literal9", true, csp);
		literal9.setValue("byte[] ");
		literal9.setType("");
		Variable literal10 = CSPFactoryHelper.eINSTANCE.createVariable("literal10", true, csp);
		literal10.setValue("public");
		literal10.setType("");
		Variable literal11 = CSPFactoryHelper.eINSTANCE.createVariable("literal11", true, csp);
		literal11.setValue(
				"{\n  byte[] ivb=new byte[16];\n  SecureRandom.getInstanceStrong().nextBytes(ivb);\n  IvParameterSpec iv=new IvParameterSpec(ivb);\n  Cipher c=Cipher.getInstance(encryptPassingArgument);\n  c.init(Cipher.ENCRYPT_MODE,key,iv);\n  byte[] res=c.doFinal(data);\n  byte[] ret=new byte[res.length + ivb.length];\n  System.arraycopy(ivb,0,ret,0,ivb.length);\n  System.arraycopy(res,0,ret,ivb.length,ret.length);\n  return ret;\n}\n");
		literal11.setType("");
		Variable literal12 = CSPFactoryHelper.eINSTANCE.createVariable("literal12", true, csp);
		literal12.setValue(1);
		literal12.setType("");
		Variable literal13 = CSPFactoryHelper.eINSTANCE.createVariable("literal13", true, csp);
		literal13.setValue("encrypt");
		literal13.setType("");

		// Create attribute variables

		// Create unbound variables
		Variable var_exprDataName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.identifier",
				csp);
		var_exprDataName_identifier.setType("String");
		Variable var_methodPerformEncryption_modifier = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.modifier", csp);
		var_methodPerformEncryption_modifier.setType("String");
		Variable var_task_package = CSPFactoryHelper.eINSTANCE.createVariable("task.package", csp);
		var_task_package.setType("String");
		Variable var_exprDataName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprDataName.index", csp);
		var_exprDataName_index.setType("int");
		Variable var_jcu_name = CSPFactoryHelper.eINSTANCE.createVariable("jcu.name", csp);
		var_jcu_name.setType("String");
		Variable var_exprKeyName_identifier = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.identifier", csp);
		var_exprKeyName_identifier.setType("String");
		Variable var_exprNameModePadding_index = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.index",
				csp);
		var_exprNameModePadding_index.setType("int");
		Variable var_methodPerformEncryption_parameters = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.parameters", csp);
		var_methodPerformEncryption_parameters.setType("String");
		Variable var_methodEncryption_throws = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.throws",
				csp);
		var_methodEncryption_throws.setType("String");
		Variable var_methodPerformEncryption_index = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.index", csp);
		var_methodPerformEncryption_index.setType("int");
		Variable var_methodEncryption_type = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.type", csp);
		var_methodEncryption_type.setType("String");
		Variable var_methodPerformEncryption_throws = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.throws", csp);
		var_methodPerformEncryption_throws.setType("String");
		Variable var_methodEncryption_modifier = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.modifier",
				csp);
		var_methodEncryption_modifier.setType("String");
		Variable var_methodPerformEncryption_body = CSPFactoryHelper.eINSTANCE
				.createVariable("methodPerformEncryption.body", csp);
		var_methodPerformEncryption_body.setType("String");
		Variable var_methodEncryption_index = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.index", csp);
		var_methodEncryption_index.setType("int");
		Variable var_methodEncryption_name = CSPFactoryHelper.eINSTANCE.createVariable("methodEncryption.name", csp);
		var_methodEncryption_name.setType("String");
		Variable var_exprKeyName_index = CSPFactoryHelper.eINSTANCE.createVariable("exprKeyName.index", csp);
		var_exprKeyName_index.setType("int");
		Variable var_javaPackage_name = CSPFactoryHelper.eINSTANCE.createVariable("javaPackage.name", csp);
		var_javaPackage_name.setType("String");
		Variable var_sbc_name = CSPFactoryHelper.eINSTANCE.createVariable("sbc.name", csp);
		var_sbc_name.setType("String");
		Variable var_sbc_mode = CSPFactoryHelper.eINSTANCE.createVariable("sbc.mode", csp);
		var_sbc_mode.setType("String");
		Variable var_sbc_padding = CSPFactoryHelper.eINSTANCE.createVariable("sbc.padding", csp);
		var_sbc_padding.setType("String");
		Variable var_exprNameModePadding_value = CSPFactoryHelper.eINSTANCE.createVariable("exprNameModePadding.value",
				csp);
		var_exprNameModePadding_value.setType("String");

		// Create constraints
		SetDefaultStringIfNull setDefaultStringIfNull = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_0 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_1 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_2 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_3 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_4 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_5 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_6 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_7 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_8 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_9 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_10 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_11 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_12 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_13 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_14 = new SetDefaultStringIfNull();
		SetDefaultStringIfNull setDefaultStringIfNull_15 = new SetDefaultStringIfNull();
		Eq eq = new Eq();
		NameModePadding nameModePadding = new NameModePadding();

		csp.getConstraints().add(setDefaultStringIfNull);
		csp.getConstraints().add(setDefaultStringIfNull_0);
		csp.getConstraints().add(setDefaultStringIfNull_1);
		csp.getConstraints().add(setDefaultStringIfNull_2);
		csp.getConstraints().add(setDefaultStringIfNull_3);
		csp.getConstraints().add(setDefaultStringIfNull_4);
		csp.getConstraints().add(setDefaultStringIfNull_5);
		csp.getConstraints().add(setDefaultStringIfNull_6);
		csp.getConstraints().add(setDefaultStringIfNull_7);
		csp.getConstraints().add(setDefaultStringIfNull_8);
		csp.getConstraints().add(setDefaultStringIfNull_9);
		csp.getConstraints().add(setDefaultStringIfNull_10);
		csp.getConstraints().add(setDefaultStringIfNull_11);
		csp.getConstraints().add(setDefaultStringIfNull_12);
		csp.getConstraints().add(setDefaultStringIfNull_13);
		csp.getConstraints().add(setDefaultStringIfNull_14);
		csp.getConstraints().add(setDefaultStringIfNull_15);
		csp.getConstraints().add(eq);
		csp.getConstraints().add(nameModePadding);

		// Solve CSP
		setDefaultStringIfNull.setRuleName("NoRuleName");
		setDefaultStringIfNull.solve(var_exprDataName_identifier, literal0);
		setDefaultStringIfNull_0.setRuleName("NoRuleName");
		setDefaultStringIfNull_0.solve(var_methodPerformEncryption_modifier, literal1);
		setDefaultStringIfNull_1.setRuleName("NoRuleName");
		setDefaultStringIfNull_1.solve(var_task_package, literal2);
		setDefaultStringIfNull_2.setRuleName("NoRuleName");
		setDefaultStringIfNull_2.solve(var_exprDataName_index, literal3);
		setDefaultStringIfNull_3.setRuleName("NoRuleName");
		setDefaultStringIfNull_3.solve(var_jcu_name, literal4);
		setDefaultStringIfNull_4.setRuleName("NoRuleName");
		setDefaultStringIfNull_4.solve(var_exprKeyName_identifier, literal5);
		setDefaultStringIfNull_5.setRuleName("NoRuleName");
		setDefaultStringIfNull_5.solve(var_exprNameModePadding_index, literal6);
		setDefaultStringIfNull_6.setRuleName("NoRuleName");
		setDefaultStringIfNull_6.solve(var_methodPerformEncryption_parameters, literal7);
		setDefaultStringIfNull_7.setRuleName("NoRuleName");
		setDefaultStringIfNull_7.solve(var_methodEncryption_throws, literal8);
		setDefaultStringIfNull_8.setRuleName("NoRuleName");
		setDefaultStringIfNull_8.solve(var_methodPerformEncryption_index, literal3);
		setDefaultStringIfNull_9.setRuleName("NoRuleName");
		setDefaultStringIfNull_9.solve(var_methodEncryption_type, literal9);
		setDefaultStringIfNull_10.setRuleName("NoRuleName");
		setDefaultStringIfNull_10.solve(var_methodPerformEncryption_throws, literal8);
		setDefaultStringIfNull_11.setRuleName("NoRuleName");
		setDefaultStringIfNull_11.solve(var_methodEncryption_modifier, literal10);
		setDefaultStringIfNull_12.setRuleName("NoRuleName");
		setDefaultStringIfNull_12.solve(var_methodPerformEncryption_body, literal11);
		setDefaultStringIfNull_13.setRuleName("NoRuleName");
		setDefaultStringIfNull_13.solve(var_methodEncryption_index, literal12);
		setDefaultStringIfNull_14.setRuleName("NoRuleName");
		setDefaultStringIfNull_14.solve(var_methodEncryption_name, literal13);
		setDefaultStringIfNull_15.setRuleName("NoRuleName");
		setDefaultStringIfNull_15.solve(var_exprKeyName_index, literal12);
		eq.setRuleName("NoRuleName");
		eq.solve(var_task_package, var_javaPackage_name);
		nameModePadding.setRuleName("NoRuleName");
		nameModePadding.solve(var_sbc_name, var_sbc_mode, var_sbc_padding, var_exprNameModePadding_value);

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
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_FWD__MATCH_SYMMETRICBLOCKCIPHER_TASK:
			return isAppropriate_FWD((Match) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(Task) arguments.get(2));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___PERFORM_FWD__ISAPPLICABLEMATCH:
			return perform_FWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_FWD__MATCH:
			return isApplicable_FWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_TO_MATCH_FWD__MATCH_SYMMETRICBLOCKCIPHER_TASK:
			registerObjectsToMatch_FWD((Match) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(Task) arguments.get(2));
			return null;
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_SOLVE_CSP_FWD__MATCH_SYMMETRICBLOCKCIPHER_TASK:
			return isAppropriate_solveCsp_FWD((Match) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(Task) arguments.get(2));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_CHECK_CSP_FWD__CSP:
			return isAppropriate_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_SOLVE_CSP_FWD__ISAPPLICABLEMATCH_SYMMETRICBLOCKCIPHER_TASK:
			return isApplicable_solveCsp_FWD((IsApplicableMatch) arguments.get(0),
					(SymmetricBlockCipher) arguments.get(1), (Task) arguments.get(2));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CHECK_CSP_FWD__CSP:
			return isApplicable_checkCsp_FWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_FWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_FWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___CHECK_TYPES_FWD__MATCH:
			return checkTypes_FWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_BWD__MATCH_JAVAPACKAGE_JAVANAME_JAVASTATEMENT_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVANAME_JAVAOPAQUEMETHOD_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION_JAVALITERAL_JAVACOMPILATIONUNIT:
			return isAppropriate_BWD((Match) arguments.get(0), (JavaPackage) arguments.get(1),
					(JavaName) arguments.get(2), (JavaStatement) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaName) arguments.get(6), (JavaOpaqueMethod) arguments.get(7),
					(JavaWorkflowMethod) arguments.get(8), (JavaVariableDeclaration) arguments.get(9),
					(JavaLiteral) arguments.get(10), (JavaCompilationUnit) arguments.get(11));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___PERFORM_BWD__ISAPPLICABLEMATCH:
			return perform_BWD((IsApplicableMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_BWD__MATCH:
			return isApplicable_BWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_TO_MATCH_BWD__MATCH_JAVAPACKAGE_JAVANAME_JAVASTATEMENT_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVANAME_JAVAOPAQUEMETHOD_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION_JAVALITERAL_JAVACOMPILATIONUNIT:
			registerObjectsToMatch_BWD((Match) arguments.get(0), (JavaPackage) arguments.get(1),
					(JavaName) arguments.get(2), (JavaStatement) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaName) arguments.get(6), (JavaOpaqueMethod) arguments.get(7),
					(JavaWorkflowMethod) arguments.get(8), (JavaVariableDeclaration) arguments.get(9),
					(JavaLiteral) arguments.get(10), (JavaCompilationUnit) arguments.get(11));
			return null;
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_SOLVE_CSP_BWD__MATCH_JAVAPACKAGE_JAVANAME_JAVASTATEMENT_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVANAME_JAVAOPAQUEMETHOD_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION_JAVALITERAL_JAVACOMPILATIONUNIT:
			return isAppropriate_solveCsp_BWD((Match) arguments.get(0), (JavaPackage) arguments.get(1),
					(JavaName) arguments.get(2), (JavaStatement) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaName) arguments.get(6), (JavaOpaqueMethod) arguments.get(7),
					(JavaWorkflowMethod) arguments.get(8), (JavaVariableDeclaration) arguments.get(9),
					(JavaLiteral) arguments.get(10), (JavaCompilationUnit) arguments.get(11));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_CHECK_CSP_BWD__CSP:
			return isAppropriate_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_JAVAPACKAGE_JAVANAME_JAVASTATEMENT_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVANAME_JAVAOPAQUEMETHOD_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION_JAVALITERAL_JAVACOMPILATIONUNIT:
			return isApplicable_solveCsp_BWD((IsApplicableMatch) arguments.get(0), (JavaPackage) arguments.get(1),
					(JavaName) arguments.get(2), (JavaStatement) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaName) arguments.get(6), (JavaOpaqueMethod) arguments.get(7),
					(JavaWorkflowMethod) arguments.get(8), (JavaVariableDeclaration) arguments.get(9),
					(JavaLiteral) arguments.get(10), (JavaCompilationUnit) arguments.get(11));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CHECK_CSP_BWD__CSP:
			return isApplicable_checkCsp_BWD((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___REGISTER_OBJECTS_BWD__PERFORMRULERESULT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT_EOBJECT:
			registerObjects_BWD((PerformRuleResult) arguments.get(0), (EObject) arguments.get(1),
					(EObject) arguments.get(2), (EObject) arguments.get(3), (EObject) arguments.get(4),
					(EObject) arguments.get(5), (EObject) arguments.get(6), (EObject) arguments.get(7),
					(EObject) arguments.get(8), (EObject) arguments.get(9), (EObject) arguments.get(10),
					(EObject) arguments.get(11), (EObject) arguments.get(12), (EObject) arguments.get(13),
					(EObject) arguments.get(14), (EObject) arguments.get(15));
			return null;
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___CHECK_TYPES_BWD__MATCH:
			return checkTypes_BWD((Match) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_FWD_EMOFLON_EDGE_2__EMOFLONEDGE:
			return isAppropriate_FWD_EMoflonEdge_2((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPROPRIATE_BWD_EMOFLON_EDGE_5__EMOFLONEDGE:
			return isAppropriate_BWD_EMoflonEdge_5((EMoflonEdge) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___CHECK_ATTRIBUTES_FWD__TRIPLEMATCH:
			return checkAttributes_FWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___CHECK_ATTRIBUTES_BWD__TRIPLEMATCH:
			return checkAttributes_BWD((TripleMatch) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CC__MATCH_MATCH:
			return isApplicable_CC((Match) arguments.get(0), (Match) arguments.get(1));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_SOLVE_CSP_CC__JAVAPACKAGE_SYMMETRICBLOCKCIPHER_JAVANAME_JAVASTATEMENT_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVANAME_TASK_JAVAOPAQUEMETHOD_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION_JAVALITERAL_JAVACOMPILATIONUNIT_MATCH_MATCH:
			return isApplicable_solveCsp_CC((JavaPackage) arguments.get(0), (SymmetricBlockCipher) arguments.get(1),
					(JavaName) arguments.get(2), (JavaStatement) arguments.get(3),
					(JavaVariableDeclaration) arguments.get(4), (JavaMethodInvocation) arguments.get(5),
					(JavaName) arguments.get(6), (Task) arguments.get(7), (JavaOpaqueMethod) arguments.get(8),
					(JavaWorkflowMethod) arguments.get(9), (JavaVariableDeclaration) arguments.get(10),
					(JavaLiteral) arguments.get(11), (JavaCompilationUnit) arguments.get(12), (Match) arguments.get(13),
					(Match) arguments.get(14));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___IS_APPLICABLE_CHECK_CSP_CC__CSP:
			return isApplicable_checkCsp_CC((CSP) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___CHECK_DEC_FWD__SYMMETRICBLOCKCIPHER_TASK:
			return checkDEC_FWD((SymmetricBlockCipher) arguments.get(0), (Task) arguments.get(1));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___CHECK_DEC_BWD__JAVAPACKAGE_JAVANAME_JAVASTATEMENT_JAVAVARIABLEDECLARATION_JAVAMETHODINVOCATION_JAVANAME_JAVAOPAQUEMETHOD_JAVAWORKFLOWMETHOD_JAVAVARIABLEDECLARATION_JAVALITERAL_JAVACOMPILATIONUNIT:
			return checkDEC_BWD((JavaPackage) arguments.get(0), (JavaName) arguments.get(1),
					(JavaStatement) arguments.get(2), (JavaVariableDeclaration) arguments.get(3),
					(JavaMethodInvocation) arguments.get(4), (JavaName) arguments.get(5),
					(JavaOpaqueMethod) arguments.get(6), (JavaWorkflowMethod) arguments.get(7),
					(JavaVariableDeclaration) arguments.get(8), (JavaLiteral) arguments.get(9),
					(JavaCompilationUnit) arguments.get(10));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___GENERATE_MODEL__RULEENTRYCONTAINER:
			return generateModel((RuleEntryContainer) arguments.get(0));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___GENERATE_MODEL_SOLVE_CSP_BWD__ISAPPLICABLEMATCH_MODELGENERATORRULERESULT:
			return generateModel_solveCsp_BWD((IsApplicableMatch) arguments.get(0),
					(ModelgeneratorRuleResult) arguments.get(1));
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK___GENERATE_MODEL_CHECK_CSP_BWD__CSP:
			return generateModel_checkCsp_BWD((CSP) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	public static final Object[] pattern_SymmetricEncryptionTask_0_1_initialbindings_blackBBBB(
			SymmetricEncryptionTask _this, Match match, SymmetricBlockCipher sbc, Task task) {
		return new Object[] { _this, match, sbc, task };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_0_2_SolveCSP_bindingFBBBB(
			SymmetricEncryptionTask _this, Match match, SymmetricBlockCipher sbc, Task task) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_FWD(match, sbc, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, sbc, task };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_0_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_0_2_SolveCSP_bindingAndBlackFBBBB(
			SymmetricEncryptionTask _this, Match match, SymmetricBlockCipher sbc, Task task) {
		Object[] result_pattern_SymmetricEncryptionTask_0_2_SolveCSP_binding = pattern_SymmetricEncryptionTask_0_2_SolveCSP_bindingFBBBB(
				_this, match, sbc, task);
		if (result_pattern_SymmetricEncryptionTask_0_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_0_2_SolveCSP_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_0_2_SolveCSP_black = pattern_SymmetricEncryptionTask_0_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SymmetricEncryptionTask_0_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, sbc, task };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricEncryptionTask_0_3_CheckCSP_expressionFBB(
			SymmetricEncryptionTask _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_0_4_collectelementstobetranslated_blackBBB(Match match,
			SymmetricBlockCipher sbc, Task task) {
		return new Object[] { match, sbc, task };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_0_4_collectelementstobetranslated_greenBBBF(
			Match match, SymmetricBlockCipher sbc, Task task) {
		EMoflonEdge task__sbc____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(sbc);
		match.getToBeTranslatedNodes().add(task);
		String task__sbc____algorithms_name_prime = "algorithms";
		task__sbc____algorithms.setSrc(task);
		task__sbc____algorithms.setTrg(sbc);
		match.getToBeTranslatedEdges().add(task__sbc____algorithms);
		task__sbc____algorithms.setName(task__sbc____algorithms_name_prime);
		return new Object[] { match, sbc, task, task__sbc____algorithms };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_0_5_collectcontextelements_blackBBB(Match match,
			SymmetricBlockCipher sbc, Task task) {
		return new Object[] { match, sbc, task };
	}

	public static final void pattern_SymmetricEncryptionTask_0_6_registerobjectstomatch_expressionBBBB(
			SymmetricEncryptionTask _this, Match match, SymmetricBlockCipher sbc, Task task) {
		_this.registerObjectsToMatch_FWD(match, sbc, task);

	}

	public static final boolean pattern_SymmetricEncryptionTask_0_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricEncryptionTask_0_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_1_1_performtransformation_bindingFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("sbc");
		EObject _localVariable_1 = isApplicableMatch.getObject("task");
		EObject tmpSbc = _localVariable_0;
		EObject tmpTask = _localVariable_1;
		if (tmpSbc instanceof SymmetricBlockCipher) {
			SymmetricBlockCipher sbc = (SymmetricBlockCipher) tmpSbc;
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				return new Object[] { sbc, task, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_1_1_performtransformation_blackBBFBB(
			SymmetricBlockCipher sbc, Task task, SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch) {
		for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
			if (tmpCsp instanceof CSP) {
				CSP csp = (CSP) tmpCsp;
				return new Object[] { sbc, task, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_1_1_performtransformation_bindingAndBlackFFFBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SymmetricEncryptionTask_1_1_performtransformation_binding = pattern_SymmetricEncryptionTask_1_1_performtransformation_bindingFFB(
				isApplicableMatch);
		if (result_pattern_SymmetricEncryptionTask_1_1_performtransformation_binding != null) {
			SymmetricBlockCipher sbc = (SymmetricBlockCipher) result_pattern_SymmetricEncryptionTask_1_1_performtransformation_binding[0];
			Task task = (Task) result_pattern_SymmetricEncryptionTask_1_1_performtransformation_binding[1];

			Object[] result_pattern_SymmetricEncryptionTask_1_1_performtransformation_black = pattern_SymmetricEncryptionTask_1_1_performtransformation_blackBBFBB(
					sbc, task, _this, isApplicableMatch);
			if (result_pattern_SymmetricEncryptionTask_1_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_1_1_performtransformation_black[2];

				return new Object[] { sbc, task, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_1_1_performtransformation_greenFBFFFFFBFFFFFFFB(
			SymmetricBlockCipher sbc, Task task, CSP csp) {
		JavaPackage javaPackage = SimpleJavaFactory.eINSTANCE.createJavaPackage();
		JavaName exprDataName = SimpleJavaFactory.eINSTANCE.createJavaName();
		JavaStatement statRetPerformEncryption = SimpleJavaFactory.eINSTANCE.createJavaStatement();
		JavaVariableDeclaration dataEncryption = SimpleJavaFactory.eINSTANCE.createJavaVariableDeclaration();
		JavaMethodInvocation exprRetPerformEncryption = SimpleJavaFactory.eINSTANCE.createJavaMethodInvocation();
		JavaName exprKeyName = SimpleJavaFactory.eINSTANCE.createJavaName();
		JavaOpaqueMethod methodPerformEncryption = SimpleJavaFactory.eINSTANCE.createJavaOpaqueMethod();
		JavaWorkflowMethod methodEncryption = SimpleJavaFactory.eINSTANCE.createJavaWorkflowMethod();
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		JavaVariableDeclaration keyEncryption = SimpleJavaFactory.eINSTANCE.createJavaVariableDeclaration();
		JavaLiteral exprNameModePadding = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		JavaCompilationUnit jcu = SimpleJavaFactory.eINSTANCE.createJavaCompilationUnit();
		SymmetricBlockCipherToJcu sbc2Jcu = CryptoConfigToJavaFactory.eINSTANCE.createSymmetricBlockCipherToJcu();
		Object _localVariable_0 = csp.getValue("javaPackage", "name");
		Object _localVariable_1 = csp.getValue("exprDataName", "identifier");
		Object _localVariable_2 = csp.getValue("exprDataName", "index");
		boolean statRetPerformEncryption_return_prime = Boolean.valueOf(true);
		int dataEncryption_index_prime = Integer.valueOf(0);
		String dataEncryption_name_prime = "data";
		String dataEncryption_type_prime = "byte[]";
		String exprRetPerformEncryption_name_prime = "performEncryption";
		Object _localVariable_3 = csp.getValue("exprKeyName", "identifier");
		Object _localVariable_4 = csp.getValue("exprKeyName", "index");
		String methodPerformEncryption_type_prime = "byte[] ";
		String methodPerformEncryption_name_prime = "performEncryption";
		Object _localVariable_5 = csp.getValue("methodPerformEncryption", "modifier");
		Object _localVariable_6 = csp.getValue("methodPerformEncryption", "parameters");
		Object _localVariable_7 = csp.getValue("methodPerformEncryption", "index");
		Object _localVariable_8 = csp.getValue("methodPerformEncryption", "throws");
		Object _localVariable_9 = csp.getValue("methodPerformEncryption", "body");
		Object _localVariable_10 = csp.getValue("methodEncryption", "throws");
		Object _localVariable_11 = csp.getValue("methodEncryption", "type");
		Object _localVariable_12 = csp.getValue("methodEncryption", "modifier");
		Object _localVariable_13 = csp.getValue("methodEncryption", "index");
		Object _localVariable_14 = csp.getValue("methodEncryption", "name");
		String keyEncryption_type_prime = "SecretKey";
		int keyEncryption_index_prime = Integer.valueOf(1);
		String keyEncryption_name_prime = "key";
		Object _localVariable_15 = csp.getValue("exprNameModePadding", "index");
		Object _localVariable_16 = csp.getValue("exprNameModePadding", "value");
		Object _localVariable_17 = csp.getValue("jcu", "name");
		exprRetPerformEncryption.getArguments().add(exprDataName);
		statRetPerformEncryption.setExpr(exprRetPerformEncryption);
		exprRetPerformEncryption.getArguments().add(exprKeyName);
		methodEncryption.getParams().add(dataEncryption);
		methodEncryption.getStatements().add(statRetPerformEncryption);
		t2c.setTarget(javaPackage);
		t2c.setSource(task);
		methodEncryption.getParams().add(keyEncryption);
		exprRetPerformEncryption.getArguments().add(exprNameModePadding);
		javaPackage.getCunits().add(jcu);
		jcu.getMethods().add(methodEncryption);
		jcu.getMethods().add(methodPerformEncryption);
		sbc2Jcu.setTarget(jcu);
		sbc2Jcu.setSource(sbc);
		String javaPackage_name_prime = (String) _localVariable_0;
		String exprDataName_identifier_prime = (String) _localVariable_1;
		int exprDataName_index_prime = (int) _localVariable_2;
		statRetPerformEncryption.setReturn(Boolean.valueOf(statRetPerformEncryption_return_prime));
		dataEncryption.setIndex(Integer.valueOf(dataEncryption_index_prime));
		dataEncryption.setName(dataEncryption_name_prime);
		dataEncryption.setType(dataEncryption_type_prime);
		exprRetPerformEncryption.setName(exprRetPerformEncryption_name_prime);
		String exprKeyName_identifier_prime = (String) _localVariable_3;
		int exprKeyName_index_prime = (int) _localVariable_4;
		methodPerformEncryption.setType(methodPerformEncryption_type_prime);
		methodPerformEncryption.setName(methodPerformEncryption_name_prime);
		String methodPerformEncryption_modifier_prime = (String) _localVariable_5;
		String methodPerformEncryption_parameters_prime = (String) _localVariable_6;
		int methodPerformEncryption_index_prime = (int) _localVariable_7;
		String methodPerformEncryption_throws_prime = (String) _localVariable_8;
		String methodPerformEncryption_body_prime = (String) _localVariable_9;
		String methodEncryption_throws_prime = (String) _localVariable_10;
		String methodEncryption_type_prime = (String) _localVariable_11;
		String methodEncryption_modifier_prime = (String) _localVariable_12;
		int methodEncryption_index_prime = (int) _localVariable_13;
		String methodEncryption_name_prime = (String) _localVariable_14;
		keyEncryption.setType(keyEncryption_type_prime);
		keyEncryption.setIndex(Integer.valueOf(keyEncryption_index_prime));
		keyEncryption.setName(keyEncryption_name_prime);
		int exprNameModePadding_index_prime = (int) _localVariable_15;
		String exprNameModePadding_value_prime = (String) _localVariable_16;
		String jcu_name_prime = (String) _localVariable_17;
		javaPackage.setName(javaPackage_name_prime);
		exprDataName.setIdentifier(exprDataName_identifier_prime);
		exprDataName.setIndex(Integer.valueOf(exprDataName_index_prime));
		exprKeyName.setIdentifier(exprKeyName_identifier_prime);
		exprKeyName.setIndex(Integer.valueOf(exprKeyName_index_prime));
		methodPerformEncryption.setModifier(methodPerformEncryption_modifier_prime);
		methodPerformEncryption.setParameters(methodPerformEncryption_parameters_prime);
		methodPerformEncryption.setIndex(Integer.valueOf(methodPerformEncryption_index_prime));
		methodPerformEncryption.setThrows(methodPerformEncryption_throws_prime);
		methodPerformEncryption.setBody(methodPerformEncryption_body_prime);
		methodEncryption.setThrows(methodEncryption_throws_prime);
		methodEncryption.setType(methodEncryption_type_prime);
		methodEncryption.setModifier(methodEncryption_modifier_prime);
		methodEncryption.setIndex(Integer.valueOf(methodEncryption_index_prime));
		methodEncryption.setName(methodEncryption_name_prime);
		exprNameModePadding.setIndex(Integer.valueOf(exprNameModePadding_index_prime));
		exprNameModePadding.setValue(exprNameModePadding_value_prime);
		jcu.setName(jcu_name_prime);
		return new Object[] { javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu, csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_1_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(
			JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption, TaskToJavaPackage t2c,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			SymmetricBlockCipherToJcu sbc2Jcu) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				return new Object[] { javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
						keyEncryption, exprNameModePadding, jcu, sbc2Jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_1_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(
			JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption, TaskToJavaPackage t2c,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			SymmetricBlockCipherToJcu sbc2Jcu) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getCreatedElements().add(javaPackage);
		ruleresult.getTranslatedElements().add(sbc);
		ruleresult.getCreatedElements().add(exprDataName);
		ruleresult.getCreatedElements().add(statRetPerformEncryption);
		ruleresult.getCreatedElements().add(dataEncryption);
		ruleresult.getCreatedElements().add(exprRetPerformEncryption);
		ruleresult.getCreatedElements().add(exprKeyName);
		ruleresult.getTranslatedElements().add(task);
		ruleresult.getCreatedElements().add(methodPerformEncryption);
		ruleresult.getCreatedElements().add(methodEncryption);
		ruleresult.getCreatedLinkElements().add(t2c);
		ruleresult.getCreatedElements().add(keyEncryption);
		ruleresult.getCreatedElements().add(exprNameModePadding);
		ruleresult.getCreatedElements().add(jcu);
		ruleresult.getCreatedLinkElements().add(sbc2Jcu);
		return new Object[] { ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_1_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject javaPackage, EObject sbc, EObject exprDataName,
			EObject statRetPerformEncryption, EObject dataEncryption, EObject exprRetPerformEncryption,
			EObject exprKeyName, EObject task, EObject methodPerformEncryption, EObject methodEncryption, EObject t2c,
			EObject keyEncryption, EObject exprNameModePadding, EObject jcu, EObject sbc2Jcu) {
		if (!javaPackage.equals(sbc)) {
			if (!javaPackage.equals(statRetPerformEncryption)) {
				if (!javaPackage.equals(task)) {
					if (!javaPackage.equals(methodPerformEncryption)) {
						if (!javaPackage.equals(methodEncryption)) {
							if (!javaPackage.equals(t2c)) {
								if (!javaPackage.equals(keyEncryption)) {
									if (!javaPackage.equals(jcu)) {
										if (!javaPackage.equals(sbc2Jcu)) {
											if (!sbc.equals(statRetPerformEncryption)) {
												if (!sbc.equals(task)) {
													if (!sbc.equals(t2c)) {
														if (!sbc.equals(sbc2Jcu)) {
															if (!exprDataName.equals(javaPackage)) {
																if (!exprDataName.equals(sbc)) {
																	if (!exprDataName
																			.equals(statRetPerformEncryption)) {
																		if (!exprDataName
																				.equals(exprRetPerformEncryption)) {
																			if (!exprDataName.equals(exprKeyName)) {
																				if (!exprDataName.equals(task)) {
																					if (!exprDataName.equals(
																							methodPerformEncryption)) {
																						if (!exprDataName.equals(
																								methodEncryption)) {
																							if (!exprDataName
																									.equals(t2c)) {
																								if (!exprDataName
																										.equals(keyEncryption)) {
																									if (!exprDataName
																											.equals(exprNameModePadding)) {
																										if (!exprDataName
																												.equals(jcu)) {
																											if (!exprDataName
																													.equals(sbc2Jcu)) {
																												if (!statRetPerformEncryption
																														.equals(task)) {
																													if (!statRetPerformEncryption
																															.equals(t2c)) {
																														if (!dataEncryption
																																.equals(javaPackage)) {
																															if (!dataEncryption
																																	.equals(sbc)) {
																																if (!dataEncryption
																																		.equals(exprDataName)) {
																																	if (!dataEncryption
																																			.equals(statRetPerformEncryption)) {
																																		if (!dataEncryption
																																				.equals(exprRetPerformEncryption)) {
																																			if (!dataEncryption
																																					.equals(exprKeyName)) {
																																				if (!dataEncryption
																																						.equals(task)) {
																																					if (!dataEncryption
																																							.equals(methodPerformEncryption)) {
																																						if (!dataEncryption
																																								.equals(methodEncryption)) {
																																							if (!dataEncryption
																																									.equals(t2c)) {
																																								if (!dataEncryption
																																										.equals(keyEncryption)) {
																																									if (!dataEncryption
																																											.equals(exprNameModePadding)) {
																																										if (!dataEncryption
																																												.equals(jcu)) {
																																											if (!dataEncryption
																																													.equals(sbc2Jcu)) {
																																												if (!exprRetPerformEncryption
																																														.equals(javaPackage)) {
																																													if (!exprRetPerformEncryption
																																															.equals(sbc)) {
																																														if (!exprRetPerformEncryption
																																																.equals(statRetPerformEncryption)) {
																																															if (!exprRetPerformEncryption
																																																	.equals(task)) {
																																																if (!exprRetPerformEncryption
																																																		.equals(methodPerformEncryption)) {
																																																	if (!exprRetPerformEncryption
																																																			.equals(methodEncryption)) {
																																																		if (!exprRetPerformEncryption
																																																				.equals(t2c)) {
																																																			if (!exprRetPerformEncryption
																																																					.equals(keyEncryption)) {
																																																				if (!exprRetPerformEncryption
																																																						.equals(jcu)) {
																																																					if (!exprRetPerformEncryption
																																																							.equals(sbc2Jcu)) {
																																																						if (!exprKeyName
																																																								.equals(javaPackage)) {
																																																							if (!exprKeyName
																																																									.equals(sbc)) {
																																																								if (!exprKeyName
																																																										.equals(statRetPerformEncryption)) {
																																																									if (!exprKeyName
																																																											.equals(exprRetPerformEncryption)) {
																																																										if (!exprKeyName
																																																												.equals(task)) {
																																																											if (!exprKeyName
																																																													.equals(methodPerformEncryption)) {
																																																												if (!exprKeyName
																																																														.equals(methodEncryption)) {
																																																													if (!exprKeyName
																																																															.equals(t2c)) {
																																																														if (!exprKeyName
																																																																.equals(keyEncryption)) {
																																																															if (!exprKeyName
																																																																	.equals(exprNameModePadding)) {
																																																																if (!exprKeyName
																																																																		.equals(jcu)) {
																																																																	if (!exprKeyName
																																																																			.equals(sbc2Jcu)) {
																																																																		if (!methodPerformEncryption
																																																																				.equals(sbc)) {
																																																																			if (!methodPerformEncryption
																																																																					.equals(statRetPerformEncryption)) {
																																																																				if (!methodPerformEncryption
																																																																						.equals(task)) {
																																																																					if (!methodPerformEncryption
																																																																							.equals(t2c)) {
																																																																						if (!methodPerformEncryption
																																																																								.equals(sbc2Jcu)) {
																																																																							if (!methodEncryption
																																																																									.equals(sbc)) {
																																																																								if (!methodEncryption
																																																																										.equals(statRetPerformEncryption)) {
																																																																									if (!methodEncryption
																																																																											.equals(task)) {
																																																																										if (!methodEncryption
																																																																												.equals(methodPerformEncryption)) {
																																																																											if (!methodEncryption
																																																																													.equals(t2c)) {
																																																																												if (!methodEncryption
																																																																														.equals(sbc2Jcu)) {
																																																																													if (!t2c.equals(
																																																																															task)) {
																																																																														if (!keyEncryption
																																																																																.equals(sbc)) {
																																																																															if (!keyEncryption
																																																																																	.equals(statRetPerformEncryption)) {
																																																																																if (!keyEncryption
																																																																																		.equals(task)) {
																																																																																	if (!keyEncryption
																																																																																			.equals(methodPerformEncryption)) {
																																																																																		if (!keyEncryption
																																																																																				.equals(methodEncryption)) {
																																																																																			if (!keyEncryption
																																																																																					.equals(t2c)) {
																																																																																				if (!keyEncryption
																																																																																						.equals(sbc2Jcu)) {
																																																																																					if (!exprNameModePadding
																																																																																							.equals(javaPackage)) {
																																																																																						if (!exprNameModePadding
																																																																																								.equals(sbc)) {
																																																																																							if (!exprNameModePadding
																																																																																									.equals(statRetPerformEncryption)) {
																																																																																								if (!exprNameModePadding
																																																																																										.equals(exprRetPerformEncryption)) {
																																																																																									if (!exprNameModePadding
																																																																																											.equals(task)) {
																																																																																										if (!exprNameModePadding
																																																																																												.equals(methodPerformEncryption)) {
																																																																																											if (!exprNameModePadding
																																																																																													.equals(methodEncryption)) {
																																																																																												if (!exprNameModePadding
																																																																																														.equals(t2c)) {
																																																																																													if (!exprNameModePadding
																																																																																															.equals(keyEncryption)) {
																																																																																														if (!exprNameModePadding
																																																																																																.equals(jcu)) {
																																																																																															if (!exprNameModePadding
																																																																																																	.equals(sbc2Jcu)) {
																																																																																																if (!jcu.equals(
																																																																																																		sbc)) {
																																																																																																	if (!jcu.equals(
																																																																																																			statRetPerformEncryption)) {
																																																																																																		if (!jcu.equals(
																																																																																																				task)) {
																																																																																																			if (!jcu.equals(
																																																																																																					methodPerformEncryption)) {
																																																																																																				if (!jcu.equals(
																																																																																																						methodEncryption)) {
																																																																																																					if (!jcu.equals(
																																																																																																							t2c)) {
																																																																																																						if (!jcu.equals(
																																																																																																								keyEncryption)) {
																																																																																																							if (!jcu.equals(
																																																																																																									sbc2Jcu)) {
																																																																																																								if (!sbc2Jcu
																																																																																																										.equals(statRetPerformEncryption)) {
																																																																																																									if (!sbc2Jcu
																																																																																																											.equals(task)) {
																																																																																																										if (!sbc2Jcu
																																																																																																												.equals(t2c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													javaPackage,
																																																																																																													sbc,
																																																																																																													exprDataName,
																																																																																																													statRetPerformEncryption,
																																																																																																													dataEncryption,
																																																																																																													exprRetPerformEncryption,
																																																																																																													exprKeyName,
																																																																																																													task,
																																																																																																													methodPerformEncryption,
																																																																																																													methodEncryption,
																																																																																																													t2c,
																																																																																																													keyEncryption,
																																																																																																													exprNameModePadding,
																																																																																																													jcu,
																																																																																																													sbc2Jcu };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SymmetricEncryptionTask_1_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject javaPackage, EObject sbc, EObject exprDataName,
			EObject statRetPerformEncryption, EObject dataEncryption, EObject exprRetPerformEncryption,
			EObject exprKeyName, EObject task, EObject methodPerformEncryption, EObject methodEncryption, EObject t2c,
			EObject keyEncryption, EObject exprNameModePadding, EObject jcu, EObject sbc2Jcu) {
		EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__dataEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__keyEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sbc____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge t2c__javaPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sbc2Jcu__jcu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sbc2Jcu__sbc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__statRetPerformEncryption____statements = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge t2c__task____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SymmetricEncryptionTask";
		String exprRetPerformEncryption__exprDataName____arguments_name_prime = "arguments";
		String methodEncryption__dataEncryption____params_name_prime = "params";
		String exprRetPerformEncryption__exprKeyName____arguments_name_prime = "arguments";
		String methodEncryption__keyEncryption____params_name_prime = "params";
		String task__sbc____algorithms_name_prime = "algorithms";
		String statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime = "expr";
		String t2c__javaPackage____target_name_prime = "target";
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String exprRetPerformEncryption__exprNameModePadding____arguments_name_prime = "arguments";
		String sbc2Jcu__jcu____target_name_prime = "target";
		String sbc2Jcu__sbc____source_name_prime = "source";
		String jcu__methodEncryption____methods_name_prime = "methods";
		String jcu__methodPerformEncryption____methods_name_prime = "methods";
		String methodEncryption__statRetPerformEncryption____statements_name_prime = "statements";
		String t2c__task____source_name_prime = "source";
		exprRetPerformEncryption__exprDataName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprDataName____arguments.setTrg(exprDataName);
		ruleresult.getCreatedEdges().add(exprRetPerformEncryption__exprDataName____arguments);
		methodEncryption__dataEncryption____params.setSrc(methodEncryption);
		methodEncryption__dataEncryption____params.setTrg(dataEncryption);
		ruleresult.getCreatedEdges().add(methodEncryption__dataEncryption____params);
		exprRetPerformEncryption__exprKeyName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprKeyName____arguments.setTrg(exprKeyName);
		ruleresult.getCreatedEdges().add(exprRetPerformEncryption__exprKeyName____arguments);
		methodEncryption__keyEncryption____params.setSrc(methodEncryption);
		methodEncryption__keyEncryption____params.setTrg(keyEncryption);
		ruleresult.getCreatedEdges().add(methodEncryption__keyEncryption____params);
		task__sbc____algorithms.setSrc(task);
		task__sbc____algorithms.setTrg(sbc);
		ruleresult.getTranslatedEdges().add(task__sbc____algorithms);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setSrc(statRetPerformEncryption);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setTrg(exprRetPerformEncryption);
		ruleresult.getCreatedEdges().add(statRetPerformEncryption__exprRetPerformEncryption____expr);
		t2c__javaPackage____target.setSrc(t2c);
		t2c__javaPackage____target.setTrg(javaPackage);
		ruleresult.getCreatedEdges().add(t2c__javaPackage____target);
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		ruleresult.getCreatedEdges().add(javaPackage__jcu____cunits);
		exprRetPerformEncryption__exprNameModePadding____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprNameModePadding____arguments.setTrg(exprNameModePadding);
		ruleresult.getCreatedEdges().add(exprRetPerformEncryption__exprNameModePadding____arguments);
		sbc2Jcu__jcu____target.setSrc(sbc2Jcu);
		sbc2Jcu__jcu____target.setTrg(jcu);
		ruleresult.getCreatedEdges().add(sbc2Jcu__jcu____target);
		sbc2Jcu__sbc____source.setSrc(sbc2Jcu);
		sbc2Jcu__sbc____source.setTrg(sbc);
		ruleresult.getCreatedEdges().add(sbc2Jcu__sbc____source);
		jcu__methodEncryption____methods.setSrc(jcu);
		jcu__methodEncryption____methods.setTrg(methodEncryption);
		ruleresult.getCreatedEdges().add(jcu__methodEncryption____methods);
		jcu__methodPerformEncryption____methods.setSrc(jcu);
		jcu__methodPerformEncryption____methods.setTrg(methodPerformEncryption);
		ruleresult.getCreatedEdges().add(jcu__methodPerformEncryption____methods);
		methodEncryption__statRetPerformEncryption____statements.setSrc(methodEncryption);
		methodEncryption__statRetPerformEncryption____statements.setTrg(statRetPerformEncryption);
		ruleresult.getCreatedEdges().add(methodEncryption__statRetPerformEncryption____statements);
		t2c__task____source.setSrc(t2c);
		t2c__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2c__task____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		exprRetPerformEncryption__exprDataName____arguments
				.setName(exprRetPerformEncryption__exprDataName____arguments_name_prime);
		methodEncryption__dataEncryption____params.setName(methodEncryption__dataEncryption____params_name_prime);
		exprRetPerformEncryption__exprKeyName____arguments
				.setName(exprRetPerformEncryption__exprKeyName____arguments_name_prime);
		methodEncryption__keyEncryption____params.setName(methodEncryption__keyEncryption____params_name_prime);
		task__sbc____algorithms.setName(task__sbc____algorithms_name_prime);
		statRetPerformEncryption__exprRetPerformEncryption____expr
				.setName(statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime);
		t2c__javaPackage____target.setName(t2c__javaPackage____target_name_prime);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		exprRetPerformEncryption__exprNameModePadding____arguments
				.setName(exprRetPerformEncryption__exprNameModePadding____arguments_name_prime);
		sbc2Jcu__jcu____target.setName(sbc2Jcu__jcu____target_name_prime);
		sbc2Jcu__sbc____source.setName(sbc2Jcu__sbc____source_name_prime);
		jcu__methodEncryption____methods.setName(jcu__methodEncryption____methods_name_prime);
		jcu__methodPerformEncryption____methods.setName(jcu__methodPerformEncryption____methods_name_prime);
		methodEncryption__statRetPerformEncryption____statements
				.setName(methodEncryption__statRetPerformEncryption____statements_name_prime);
		t2c__task____source.setName(t2c__task____source_name_prime);
		return new Object[] { ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu, exprRetPerformEncryption__exprDataName____arguments,
				methodEncryption__dataEncryption____params, exprRetPerformEncryption__exprKeyName____arguments,
				methodEncryption__keyEncryption____params, task__sbc____algorithms,
				statRetPerformEncryption__exprRetPerformEncryption____expr, t2c__javaPackage____target,
				javaPackage__jcu____cunits, exprRetPerformEncryption__exprNameModePadding____arguments,
				sbc2Jcu__jcu____target, sbc2Jcu__sbc____source, jcu__methodEncryption____methods,
				jcu__methodPerformEncryption____methods, methodEncryption__statRetPerformEncryption____statements,
				t2c__task____source };
	}

	public static final void pattern_SymmetricEncryptionTask_1_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, PerformRuleResult ruleresult, EObject javaPackage, EObject sbc,
			EObject exprDataName, EObject statRetPerformEncryption, EObject dataEncryption,
			EObject exprRetPerformEncryption, EObject exprKeyName, EObject task, EObject methodPerformEncryption,
			EObject methodEncryption, EObject t2c, EObject keyEncryption, EObject exprNameModePadding, EObject jcu,
			EObject sbc2Jcu) {
		_this.registerObjects_FWD(ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu);

	}

	public static final PerformRuleResult pattern_SymmetricEncryptionTask_1_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_bindingFB(
			SymmetricEncryptionTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_blackFBB(EClass eClass,
			SymmetricEncryptionTask _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_FWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_bindingAndBlackFFB(
			SymmetricEncryptionTask _this) {
		Object[] result_pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_binding = pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_black = pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SymmetricEncryptionTask";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_2_corematch_bindingFFB(Match match) {
		EObject _localVariable_0 = match.getObject("sbc");
		EObject _localVariable_1 = match.getObject("task");
		EObject tmpSbc = _localVariable_0;
		EObject tmpTask = _localVariable_1;
		if (tmpSbc instanceof SymmetricBlockCipher) {
			SymmetricBlockCipher sbc = (SymmetricBlockCipher) tmpSbc;
			if (tmpTask instanceof Task) {
				Task task = (Task) tmpTask;
				return new Object[] { sbc, task, match };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SymmetricEncryptionTask_2_2_corematch_blackBBB(
			SymmetricBlockCipher sbc, Task task, Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		String task_description = task.getDescription();
		if (task_description.equals("SymmetricEncryption")) {
			_result.add(new Object[] { sbc, task, match });
		}

		return _result;
	}

	public static final Iterable<Object[]> pattern_SymmetricEncryptionTask_2_3_findcontext_blackBB(
			SymmetricBlockCipher sbc, Task task) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (task.getAlgorithms().contains(sbc)) {
			String task_description = task.getDescription();
			if (task_description.equals("SymmetricEncryption")) {
				_result.add(new Object[] { sbc, task });
			}

		}
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_3_findcontext_greenBBFF(SymmetricBlockCipher sbc,
			Task task) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge task__sbc____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String task__sbc____algorithms_name_prime = "algorithms";
		isApplicableMatch.getAllContextElements().add(sbc);
		isApplicableMatch.getAllContextElements().add(task);
		task__sbc____algorithms.setSrc(task);
		task__sbc____algorithms.setTrg(sbc);
		isApplicableMatch.getAllContextElements().add(task__sbc____algorithms);
		task__sbc____algorithms.setName(task__sbc____algorithms_name_prime);
		return new Object[] { sbc, task, isApplicableMatch, task__sbc____algorithms };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_4_solveCSP_bindingFBBBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipher sbc, Task task) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_FWD(isApplicableMatch, sbc, task);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, sbc, task };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_4_solveCSP_bindingAndBlackFBBBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch, SymmetricBlockCipher sbc, Task task) {
		Object[] result_pattern_SymmetricEncryptionTask_2_4_solveCSP_binding = pattern_SymmetricEncryptionTask_2_4_solveCSP_bindingFBBBB(
				_this, isApplicableMatch, sbc, task);
		if (result_pattern_SymmetricEncryptionTask_2_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_2_4_solveCSP_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_2_4_solveCSP_black = pattern_SymmetricEncryptionTask_2_4_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricEncryptionTask_2_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, sbc, task };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricEncryptionTask_2_5_checkCSP_expressionFBB(
			SymmetricEncryptionTask _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_FWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_2_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SymmetricEncryptionTask";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SymmetricEncryptionTask_2_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_10_1_initialbindings_blackBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				return new Object[] { _this, match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
						exprNameModePadding, jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_10_2_SolveCSP_bindingFBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		CSP _localVariable_0 = _this.isAppropriate_solveCsp_BWD(match, javaPackage, exprDataName,
				statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
				methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, match, javaPackage, exprDataName, statRetPerformEncryption,
					dataEncryption, exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
					keyEncryption, exprNameModePadding, jcu };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_10_2_SolveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_10_2_SolveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		Object[] result_pattern_SymmetricEncryptionTask_10_2_SolveCSP_binding = pattern_SymmetricEncryptionTask_10_2_SolveCSP_bindingFBBBBBBBBBBBBB(
				_this, match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
				exprNameModePadding, jcu);
		if (result_pattern_SymmetricEncryptionTask_10_2_SolveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_10_2_SolveCSP_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_10_2_SolveCSP_black = pattern_SymmetricEncryptionTask_10_2_SolveCSP_blackB(
					csp);
			if (result_pattern_SymmetricEncryptionTask_10_2_SolveCSP_black != null) {

				return new Object[] { csp, _this, match, javaPackage, exprDataName, statRetPerformEncryption,
						dataEncryption, exprRetPerformEncryption, exprKeyName, methodPerformEncryption,
						methodEncryption, keyEncryption, exprNameModePadding, jcu };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricEncryptionTask_10_3_CheckCSP_expressionFBB(
			SymmetricEncryptionTask _this, CSP csp) {
		boolean _localVariable_0 = _this.isAppropriate_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_10_4_collectelementstobetranslated_blackBBBBBBBBBBBB(
			Match match, JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				return new Object[] { match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
						exprNameModePadding, jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_10_4_collectelementstobetranslated_greenBBBBBBBBBBBBFFFFFFFFFF(
			Match match, JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__dataEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__keyEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jcu__methodEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__statRetPerformEncryption____statements = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		match.getToBeTranslatedNodes().add(javaPackage);
		match.getToBeTranslatedNodes().add(exprDataName);
		match.getToBeTranslatedNodes().add(statRetPerformEncryption);
		match.getToBeTranslatedNodes().add(dataEncryption);
		match.getToBeTranslatedNodes().add(exprRetPerformEncryption);
		match.getToBeTranslatedNodes().add(exprKeyName);
		match.getToBeTranslatedNodes().add(methodPerformEncryption);
		match.getToBeTranslatedNodes().add(methodEncryption);
		match.getToBeTranslatedNodes().add(keyEncryption);
		match.getToBeTranslatedNodes().add(exprNameModePadding);
		match.getToBeTranslatedNodes().add(jcu);
		String exprRetPerformEncryption__exprDataName____arguments_name_prime = "arguments";
		String methodEncryption__dataEncryption____params_name_prime = "params";
		String exprRetPerformEncryption__exprKeyName____arguments_name_prime = "arguments";
		String methodEncryption__keyEncryption____params_name_prime = "params";
		String statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime = "expr";
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String exprRetPerformEncryption__exprNameModePadding____arguments_name_prime = "arguments";
		String jcu__methodEncryption____methods_name_prime = "methods";
		String jcu__methodPerformEncryption____methods_name_prime = "methods";
		String methodEncryption__statRetPerformEncryption____statements_name_prime = "statements";
		exprRetPerformEncryption__exprDataName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprDataName____arguments.setTrg(exprDataName);
		match.getToBeTranslatedEdges().add(exprRetPerformEncryption__exprDataName____arguments);
		methodEncryption__dataEncryption____params.setSrc(methodEncryption);
		methodEncryption__dataEncryption____params.setTrg(dataEncryption);
		match.getToBeTranslatedEdges().add(methodEncryption__dataEncryption____params);
		exprRetPerformEncryption__exprKeyName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprKeyName____arguments.setTrg(exprKeyName);
		match.getToBeTranslatedEdges().add(exprRetPerformEncryption__exprKeyName____arguments);
		methodEncryption__keyEncryption____params.setSrc(methodEncryption);
		methodEncryption__keyEncryption____params.setTrg(keyEncryption);
		match.getToBeTranslatedEdges().add(methodEncryption__keyEncryption____params);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setSrc(statRetPerformEncryption);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setTrg(exprRetPerformEncryption);
		match.getToBeTranslatedEdges().add(statRetPerformEncryption__exprRetPerformEncryption____expr);
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		match.getToBeTranslatedEdges().add(javaPackage__jcu____cunits);
		exprRetPerformEncryption__exprNameModePadding____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprNameModePadding____arguments.setTrg(exprNameModePadding);
		match.getToBeTranslatedEdges().add(exprRetPerformEncryption__exprNameModePadding____arguments);
		jcu__methodEncryption____methods.setSrc(jcu);
		jcu__methodEncryption____methods.setTrg(methodEncryption);
		match.getToBeTranslatedEdges().add(jcu__methodEncryption____methods);
		jcu__methodPerformEncryption____methods.setSrc(jcu);
		jcu__methodPerformEncryption____methods.setTrg(methodPerformEncryption);
		match.getToBeTranslatedEdges().add(jcu__methodPerformEncryption____methods);
		methodEncryption__statRetPerformEncryption____statements.setSrc(methodEncryption);
		methodEncryption__statRetPerformEncryption____statements.setTrg(statRetPerformEncryption);
		match.getToBeTranslatedEdges().add(methodEncryption__statRetPerformEncryption____statements);
		exprRetPerformEncryption__exprDataName____arguments
				.setName(exprRetPerformEncryption__exprDataName____arguments_name_prime);
		methodEncryption__dataEncryption____params.setName(methodEncryption__dataEncryption____params_name_prime);
		exprRetPerformEncryption__exprKeyName____arguments
				.setName(exprRetPerformEncryption__exprKeyName____arguments_name_prime);
		methodEncryption__keyEncryption____params.setName(methodEncryption__keyEncryption____params_name_prime);
		statRetPerformEncryption__exprRetPerformEncryption____expr
				.setName(statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		exprRetPerformEncryption__exprNameModePadding____arguments
				.setName(exprRetPerformEncryption__exprNameModePadding____arguments_name_prime);
		jcu__methodEncryption____methods.setName(jcu__methodEncryption____methods_name_prime);
		jcu__methodPerformEncryption____methods.setName(jcu__methodPerformEncryption____methods_name_prime);
		methodEncryption__statRetPerformEncryption____statements
				.setName(methodEncryption__statRetPerformEncryption____statements_name_prime);
		return new Object[] { match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
				exprNameModePadding, jcu, exprRetPerformEncryption__exprDataName____arguments,
				methodEncryption__dataEncryption____params, exprRetPerformEncryption__exprKeyName____arguments,
				methodEncryption__keyEncryption____params, statRetPerformEncryption__exprRetPerformEncryption____expr,
				javaPackage__jcu____cunits, exprRetPerformEncryption__exprNameModePadding____arguments,
				jcu__methodEncryption____methods, jcu__methodPerformEncryption____methods,
				methodEncryption__statRetPerformEncryption____statements };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_10_5_collectcontextelements_blackBBBBBBBBBBBB(
			Match match, JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				return new Object[] { match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
						exprNameModePadding, jcu };
			}
		}
		return null;
	}

	public static final void pattern_SymmetricEncryptionTask_10_6_registerobjectstomatch_expressionBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		_this.registerObjectsToMatch_BWD(match, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
				exprNameModePadding, jcu);

	}

	public static final boolean pattern_SymmetricEncryptionTask_10_7_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricEncryptionTask_10_8_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_11_1_performtransformation_bindingFFFFFFFFFFFB(
			IsApplicableMatch isApplicableMatch) {
		EObject _localVariable_0 = isApplicableMatch.getObject("javaPackage");
		EObject _localVariable_1 = isApplicableMatch.getObject("exprDataName");
		EObject _localVariable_2 = isApplicableMatch.getObject("statRetPerformEncryption");
		EObject _localVariable_3 = isApplicableMatch.getObject("dataEncryption");
		EObject _localVariable_4 = isApplicableMatch.getObject("exprRetPerformEncryption");
		EObject _localVariable_5 = isApplicableMatch.getObject("exprKeyName");
		EObject _localVariable_6 = isApplicableMatch.getObject("methodPerformEncryption");
		EObject _localVariable_7 = isApplicableMatch.getObject("methodEncryption");
		EObject _localVariable_8 = isApplicableMatch.getObject("keyEncryption");
		EObject _localVariable_9 = isApplicableMatch.getObject("exprNameModePadding");
		EObject _localVariable_10 = isApplicableMatch.getObject("jcu");
		EObject tmpJavaPackage = _localVariable_0;
		EObject tmpExprDataName = _localVariable_1;
		EObject tmpStatRetPerformEncryption = _localVariable_2;
		EObject tmpDataEncryption = _localVariable_3;
		EObject tmpExprRetPerformEncryption = _localVariable_4;
		EObject tmpExprKeyName = _localVariable_5;
		EObject tmpMethodPerformEncryption = _localVariable_6;
		EObject tmpMethodEncryption = _localVariable_7;
		EObject tmpKeyEncryption = _localVariable_8;
		EObject tmpExprNameModePadding = _localVariable_9;
		EObject tmpJcu = _localVariable_10;
		if (tmpJavaPackage instanceof JavaPackage) {
			JavaPackage javaPackage = (JavaPackage) tmpJavaPackage;
			if (tmpExprDataName instanceof JavaName) {
				JavaName exprDataName = (JavaName) tmpExprDataName;
				if (tmpStatRetPerformEncryption instanceof JavaStatement) {
					JavaStatement statRetPerformEncryption = (JavaStatement) tmpStatRetPerformEncryption;
					if (tmpDataEncryption instanceof JavaVariableDeclaration) {
						JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) tmpDataEncryption;
						if (tmpExprRetPerformEncryption instanceof JavaMethodInvocation) {
							JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) tmpExprRetPerformEncryption;
							if (tmpExprKeyName instanceof JavaName) {
								JavaName exprKeyName = (JavaName) tmpExprKeyName;
								if (tmpMethodPerformEncryption instanceof JavaOpaqueMethod) {
									JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) tmpMethodPerformEncryption;
									if (tmpMethodEncryption instanceof JavaWorkflowMethod) {
										JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) tmpMethodEncryption;
										if (tmpKeyEncryption instanceof JavaVariableDeclaration) {
											JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) tmpKeyEncryption;
											if (tmpExprNameModePadding instanceof JavaLiteral) {
												JavaLiteral exprNameModePadding = (JavaLiteral) tmpExprNameModePadding;
												if (tmpJcu instanceof JavaCompilationUnit) {
													JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
													return new Object[] { javaPackage, exprDataName,
															statRetPerformEncryption, dataEncryption,
															exprRetPerformEncryption, exprKeyName,
															methodPerformEncryption, methodEncryption, keyEncryption,
															exprNameModePadding, jcu, isApplicableMatch };
												}
											}
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

	public static final Object[] pattern_SymmetricEncryptionTask_11_1_performtransformation_blackBBBBBBBBBBBFBB(
			JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				for (EObject tmpCsp : isApplicableMatch.getAttributeInfo()) {
					if (tmpCsp instanceof CSP) {
						CSP csp = (CSP) tmpCsp;
						return new Object[] { javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
								exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
								keyEncryption, exprNameModePadding, jcu, csp, _this, isApplicableMatch };
					}
				}
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_11_1_performtransformation_bindingAndBlackFFFFFFFFFFFFBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch) {
		Object[] result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding = pattern_SymmetricEncryptionTask_11_1_performtransformation_bindingFFFFFFFFFFFB(
				isApplicableMatch);
		if (result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding != null) {
			JavaPackage javaPackage = (JavaPackage) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[0];
			JavaName exprDataName = (JavaName) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[1];
			JavaStatement statRetPerformEncryption = (JavaStatement) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[2];
			JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[3];
			JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[4];
			JavaName exprKeyName = (JavaName) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[5];
			JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[6];
			JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[7];
			JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[8];
			JavaLiteral exprNameModePadding = (JavaLiteral) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[9];
			JavaCompilationUnit jcu = (JavaCompilationUnit) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_binding[10];

			Object[] result_pattern_SymmetricEncryptionTask_11_1_performtransformation_black = pattern_SymmetricEncryptionTask_11_1_performtransformation_blackBBBBBBBBBBBFBB(
					javaPackage, exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
					exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu,
					_this, isApplicableMatch);
			if (result_pattern_SymmetricEncryptionTask_11_1_performtransformation_black != null) {
				CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_11_1_performtransformation_black[11];

				return new Object[] { javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
						exprNameModePadding, jcu, csp, _this, isApplicableMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_11_1_performtransformation_greenBFFFBFB(
			JavaPackage javaPackage, JavaCompilationUnit jcu, CSP csp) {
		SymmetricBlockCipher sbc = CryptoAPIConfigFactory.eINSTANCE.createSymmetricBlockCipher();
		Task task = CryptoAPIConfigFactory.eINSTANCE.createTask();
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		SymmetricBlockCipherToJcu sbc2Jcu = CryptoConfigToJavaFactory.eINSTANCE.createSymmetricBlockCipherToJcu();
		Object _localVariable_0 = csp.getValue("sbc", "name");
		Object _localVariable_1 = csp.getValue("sbc", "mode");
		Object _localVariable_2 = csp.getValue("sbc", "padding");
		String task_description_prime = "SymmetricEncryption";
		Object _localVariable_3 = csp.getValue("task", "package");
		task.getAlgorithms().add(sbc);
		t2c.setTarget(javaPackage);
		t2c.setSource(task);
		sbc2Jcu.setTarget(jcu);
		sbc2Jcu.setSource(sbc);
		String sbc_name_prime = (String) _localVariable_0;
		String sbc_mode_prime = (String) _localVariable_1;
		String sbc_padding_prime = (String) _localVariable_2;
		task.setDescription(task_description_prime);
		String task_package_prime = (String) _localVariable_3;
		sbc.setName(sbc_name_prime);
		sbc.setMode(sbc_mode_prime);
		sbc.setPadding(sbc_padding_prime);
		task.setPackage(task_package_prime);
		return new Object[] { javaPackage, sbc, task, t2c, jcu, sbc2Jcu, csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_11_2_collecttranslatedelements_blackBBBBBBBBBBBBBBB(
			JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption, TaskToJavaPackage t2c,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			SymmetricBlockCipherToJcu sbc2Jcu) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				return new Object[] { javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
						keyEncryption, exprNameModePadding, jcu, sbc2Jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_11_2_collecttranslatedelements_greenFBBBBBBBBBBBBBBB(
			JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption, TaskToJavaPackage t2c,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			SymmetricBlockCipherToJcu sbc2Jcu) {
		PerformRuleResult ruleresult = RuntimeFactory.eINSTANCE.createPerformRuleResult();
		ruleresult.getTranslatedElements().add(javaPackage);
		ruleresult.getCreatedElements().add(sbc);
		ruleresult.getTranslatedElements().add(exprDataName);
		ruleresult.getTranslatedElements().add(statRetPerformEncryption);
		ruleresult.getTranslatedElements().add(dataEncryption);
		ruleresult.getTranslatedElements().add(exprRetPerformEncryption);
		ruleresult.getTranslatedElements().add(exprKeyName);
		ruleresult.getCreatedElements().add(task);
		ruleresult.getTranslatedElements().add(methodPerformEncryption);
		ruleresult.getTranslatedElements().add(methodEncryption);
		ruleresult.getCreatedLinkElements().add(t2c);
		ruleresult.getTranslatedElements().add(keyEncryption);
		ruleresult.getTranslatedElements().add(exprNameModePadding);
		ruleresult.getTranslatedElements().add(jcu);
		ruleresult.getCreatedLinkElements().add(sbc2Jcu);
		return new Object[] { ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_11_3_bookkeepingforedges_blackBBBBBBBBBBBBBBBB(
			PerformRuleResult ruleresult, EObject javaPackage, EObject sbc, EObject exprDataName,
			EObject statRetPerformEncryption, EObject dataEncryption, EObject exprRetPerformEncryption,
			EObject exprKeyName, EObject task, EObject methodPerformEncryption, EObject methodEncryption, EObject t2c,
			EObject keyEncryption, EObject exprNameModePadding, EObject jcu, EObject sbc2Jcu) {
		if (!javaPackage.equals(sbc)) {
			if (!javaPackage.equals(statRetPerformEncryption)) {
				if (!javaPackage.equals(task)) {
					if (!javaPackage.equals(methodPerformEncryption)) {
						if (!javaPackage.equals(methodEncryption)) {
							if (!javaPackage.equals(t2c)) {
								if (!javaPackage.equals(keyEncryption)) {
									if (!javaPackage.equals(jcu)) {
										if (!javaPackage.equals(sbc2Jcu)) {
											if (!sbc.equals(statRetPerformEncryption)) {
												if (!sbc.equals(task)) {
													if (!sbc.equals(t2c)) {
														if (!sbc.equals(sbc2Jcu)) {
															if (!exprDataName.equals(javaPackage)) {
																if (!exprDataName.equals(sbc)) {
																	if (!exprDataName
																			.equals(statRetPerformEncryption)) {
																		if (!exprDataName
																				.equals(exprRetPerformEncryption)) {
																			if (!exprDataName.equals(exprKeyName)) {
																				if (!exprDataName.equals(task)) {
																					if (!exprDataName.equals(
																							methodPerformEncryption)) {
																						if (!exprDataName.equals(
																								methodEncryption)) {
																							if (!exprDataName
																									.equals(t2c)) {
																								if (!exprDataName
																										.equals(keyEncryption)) {
																									if (!exprDataName
																											.equals(exprNameModePadding)) {
																										if (!exprDataName
																												.equals(jcu)) {
																											if (!exprDataName
																													.equals(sbc2Jcu)) {
																												if (!statRetPerformEncryption
																														.equals(task)) {
																													if (!statRetPerformEncryption
																															.equals(t2c)) {
																														if (!dataEncryption
																																.equals(javaPackage)) {
																															if (!dataEncryption
																																	.equals(sbc)) {
																																if (!dataEncryption
																																		.equals(exprDataName)) {
																																	if (!dataEncryption
																																			.equals(statRetPerformEncryption)) {
																																		if (!dataEncryption
																																				.equals(exprRetPerformEncryption)) {
																																			if (!dataEncryption
																																					.equals(exprKeyName)) {
																																				if (!dataEncryption
																																						.equals(task)) {
																																					if (!dataEncryption
																																							.equals(methodPerformEncryption)) {
																																						if (!dataEncryption
																																								.equals(methodEncryption)) {
																																							if (!dataEncryption
																																									.equals(t2c)) {
																																								if (!dataEncryption
																																										.equals(keyEncryption)) {
																																									if (!dataEncryption
																																											.equals(exprNameModePadding)) {
																																										if (!dataEncryption
																																												.equals(jcu)) {
																																											if (!dataEncryption
																																													.equals(sbc2Jcu)) {
																																												if (!exprRetPerformEncryption
																																														.equals(javaPackage)) {
																																													if (!exprRetPerformEncryption
																																															.equals(sbc)) {
																																														if (!exprRetPerformEncryption
																																																.equals(statRetPerformEncryption)) {
																																															if (!exprRetPerformEncryption
																																																	.equals(task)) {
																																																if (!exprRetPerformEncryption
																																																		.equals(methodPerformEncryption)) {
																																																	if (!exprRetPerformEncryption
																																																			.equals(methodEncryption)) {
																																																		if (!exprRetPerformEncryption
																																																				.equals(t2c)) {
																																																			if (!exprRetPerformEncryption
																																																					.equals(keyEncryption)) {
																																																				if (!exprRetPerformEncryption
																																																						.equals(jcu)) {
																																																					if (!exprRetPerformEncryption
																																																							.equals(sbc2Jcu)) {
																																																						if (!exprKeyName
																																																								.equals(javaPackage)) {
																																																							if (!exprKeyName
																																																									.equals(sbc)) {
																																																								if (!exprKeyName
																																																										.equals(statRetPerformEncryption)) {
																																																									if (!exprKeyName
																																																											.equals(exprRetPerformEncryption)) {
																																																										if (!exprKeyName
																																																												.equals(task)) {
																																																											if (!exprKeyName
																																																													.equals(methodPerformEncryption)) {
																																																												if (!exprKeyName
																																																														.equals(methodEncryption)) {
																																																													if (!exprKeyName
																																																															.equals(t2c)) {
																																																														if (!exprKeyName
																																																																.equals(keyEncryption)) {
																																																															if (!exprKeyName
																																																																	.equals(exprNameModePadding)) {
																																																																if (!exprKeyName
																																																																		.equals(jcu)) {
																																																																	if (!exprKeyName
																																																																			.equals(sbc2Jcu)) {
																																																																		if (!methodPerformEncryption
																																																																				.equals(sbc)) {
																																																																			if (!methodPerformEncryption
																																																																					.equals(statRetPerformEncryption)) {
																																																																				if (!methodPerformEncryption
																																																																						.equals(task)) {
																																																																					if (!methodPerformEncryption
																																																																							.equals(t2c)) {
																																																																						if (!methodPerformEncryption
																																																																								.equals(sbc2Jcu)) {
																																																																							if (!methodEncryption
																																																																									.equals(sbc)) {
																																																																								if (!methodEncryption
																																																																										.equals(statRetPerformEncryption)) {
																																																																									if (!methodEncryption
																																																																											.equals(task)) {
																																																																										if (!methodEncryption
																																																																												.equals(methodPerformEncryption)) {
																																																																											if (!methodEncryption
																																																																													.equals(t2c)) {
																																																																												if (!methodEncryption
																																																																														.equals(sbc2Jcu)) {
																																																																													if (!t2c.equals(
																																																																															task)) {
																																																																														if (!keyEncryption
																																																																																.equals(sbc)) {
																																																																															if (!keyEncryption
																																																																																	.equals(statRetPerformEncryption)) {
																																																																																if (!keyEncryption
																																																																																		.equals(task)) {
																																																																																	if (!keyEncryption
																																																																																			.equals(methodPerformEncryption)) {
																																																																																		if (!keyEncryption
																																																																																				.equals(methodEncryption)) {
																																																																																			if (!keyEncryption
																																																																																					.equals(t2c)) {
																																																																																				if (!keyEncryption
																																																																																						.equals(sbc2Jcu)) {
																																																																																					if (!exprNameModePadding
																																																																																							.equals(javaPackage)) {
																																																																																						if (!exprNameModePadding
																																																																																								.equals(sbc)) {
																																																																																							if (!exprNameModePadding
																																																																																									.equals(statRetPerformEncryption)) {
																																																																																								if (!exprNameModePadding
																																																																																										.equals(exprRetPerformEncryption)) {
																																																																																									if (!exprNameModePadding
																																																																																											.equals(task)) {
																																																																																										if (!exprNameModePadding
																																																																																												.equals(methodPerformEncryption)) {
																																																																																											if (!exprNameModePadding
																																																																																													.equals(methodEncryption)) {
																																																																																												if (!exprNameModePadding
																																																																																														.equals(t2c)) {
																																																																																													if (!exprNameModePadding
																																																																																															.equals(keyEncryption)) {
																																																																																														if (!exprNameModePadding
																																																																																																.equals(jcu)) {
																																																																																															if (!exprNameModePadding
																																																																																																	.equals(sbc2Jcu)) {
																																																																																																if (!jcu.equals(
																																																																																																		sbc)) {
																																																																																																	if (!jcu.equals(
																																																																																																			statRetPerformEncryption)) {
																																																																																																		if (!jcu.equals(
																																																																																																				task)) {
																																																																																																			if (!jcu.equals(
																																																																																																					methodPerformEncryption)) {
																																																																																																				if (!jcu.equals(
																																																																																																						methodEncryption)) {
																																																																																																					if (!jcu.equals(
																																																																																																							t2c)) {
																																																																																																						if (!jcu.equals(
																																																																																																								keyEncryption)) {
																																																																																																							if (!jcu.equals(
																																																																																																									sbc2Jcu)) {
																																																																																																								if (!sbc2Jcu
																																																																																																										.equals(statRetPerformEncryption)) {
																																																																																																									if (!sbc2Jcu
																																																																																																											.equals(task)) {
																																																																																																										if (!sbc2Jcu
																																																																																																												.equals(t2c)) {
																																																																																																											return new Object[] {
																																																																																																													ruleresult,
																																																																																																													javaPackage,
																																																																																																													sbc,
																																																																																																													exprDataName,
																																																																																																													statRetPerformEncryption,
																																																																																																													dataEncryption,
																																																																																																													exprRetPerformEncryption,
																																																																																																													exprKeyName,
																																																																																																													task,
																																																																																																													methodPerformEncryption,
																																																																																																													methodEncryption,
																																																																																																													t2c,
																																																																																																													keyEncryption,
																																																																																																													exprNameModePadding,
																																																																																																													jcu,
																																																																																																													sbc2Jcu };
																																																																																																										}
																																																																																																									}
																																																																																																								}
																																																																																																							}
																																																																																																						}
																																																																																																					}
																																																																																																				}
																																																																																																			}
																																																																																																		}
																																																																																																	}
																																																																																																}
																																																																																															}
																																																																																														}
																																																																																													}
																																																																																												}
																																																																																											}
																																																																																										}
																																																																																									}
																																																																																								}
																																																																																							}
																																																																																						}
																																																																																					}
																																																																																				}
																																																																																			}
																																																																																		}
																																																																																	}
																																																																																}
																																																																															}
																																																																														}
																																																																													}
																																																																												}
																																																																											}
																																																																										}
																																																																									}
																																																																								}
																																																																							}
																																																																						}
																																																																					}
																																																																				}
																																																																			}
																																																																		}
																																																																	}
																																																																}
																																																															}
																																																														}
																																																													}
																																																												}
																																																											}
																																																										}
																																																									}
																																																								}
																																																							}
																																																						}
																																																					}
																																																				}
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
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

	public static final Object[] pattern_SymmetricEncryptionTask_11_3_bookkeepingforedges_greenBBBBBBBBBBBBBBBBFFFFFFFFFFFFFFF(
			PerformRuleResult ruleresult, EObject javaPackage, EObject sbc, EObject exprDataName,
			EObject statRetPerformEncryption, EObject dataEncryption, EObject exprRetPerformEncryption,
			EObject exprKeyName, EObject task, EObject methodPerformEncryption, EObject methodEncryption, EObject t2c,
			EObject keyEncryption, EObject exprNameModePadding, EObject jcu, EObject sbc2Jcu) {
		EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__dataEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__keyEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge task__sbc____algorithms = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge t2c__javaPackage____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge sbc2Jcu__jcu____target = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge sbc2Jcu__sbc____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__statRetPerformEncryption____statements = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge t2c__task____source = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		String ruleresult_ruleName_prime = "SymmetricEncryptionTask";
		String exprRetPerformEncryption__exprDataName____arguments_name_prime = "arguments";
		String methodEncryption__dataEncryption____params_name_prime = "params";
		String exprRetPerformEncryption__exprKeyName____arguments_name_prime = "arguments";
		String methodEncryption__keyEncryption____params_name_prime = "params";
		String task__sbc____algorithms_name_prime = "algorithms";
		String statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime = "expr";
		String t2c__javaPackage____target_name_prime = "target";
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String exprRetPerformEncryption__exprNameModePadding____arguments_name_prime = "arguments";
		String sbc2Jcu__jcu____target_name_prime = "target";
		String sbc2Jcu__sbc____source_name_prime = "source";
		String jcu__methodEncryption____methods_name_prime = "methods";
		String jcu__methodPerformEncryption____methods_name_prime = "methods";
		String methodEncryption__statRetPerformEncryption____statements_name_prime = "statements";
		String t2c__task____source_name_prime = "source";
		exprRetPerformEncryption__exprDataName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprDataName____arguments.setTrg(exprDataName);
		ruleresult.getTranslatedEdges().add(exprRetPerformEncryption__exprDataName____arguments);
		methodEncryption__dataEncryption____params.setSrc(methodEncryption);
		methodEncryption__dataEncryption____params.setTrg(dataEncryption);
		ruleresult.getTranslatedEdges().add(methodEncryption__dataEncryption____params);
		exprRetPerformEncryption__exprKeyName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprKeyName____arguments.setTrg(exprKeyName);
		ruleresult.getTranslatedEdges().add(exprRetPerformEncryption__exprKeyName____arguments);
		methodEncryption__keyEncryption____params.setSrc(methodEncryption);
		methodEncryption__keyEncryption____params.setTrg(keyEncryption);
		ruleresult.getTranslatedEdges().add(methodEncryption__keyEncryption____params);
		task__sbc____algorithms.setSrc(task);
		task__sbc____algorithms.setTrg(sbc);
		ruleresult.getCreatedEdges().add(task__sbc____algorithms);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setSrc(statRetPerformEncryption);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setTrg(exprRetPerformEncryption);
		ruleresult.getTranslatedEdges().add(statRetPerformEncryption__exprRetPerformEncryption____expr);
		t2c__javaPackage____target.setSrc(t2c);
		t2c__javaPackage____target.setTrg(javaPackage);
		ruleresult.getCreatedEdges().add(t2c__javaPackage____target);
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		ruleresult.getTranslatedEdges().add(javaPackage__jcu____cunits);
		exprRetPerformEncryption__exprNameModePadding____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprNameModePadding____arguments.setTrg(exprNameModePadding);
		ruleresult.getTranslatedEdges().add(exprRetPerformEncryption__exprNameModePadding____arguments);
		sbc2Jcu__jcu____target.setSrc(sbc2Jcu);
		sbc2Jcu__jcu____target.setTrg(jcu);
		ruleresult.getCreatedEdges().add(sbc2Jcu__jcu____target);
		sbc2Jcu__sbc____source.setSrc(sbc2Jcu);
		sbc2Jcu__sbc____source.setTrg(sbc);
		ruleresult.getCreatedEdges().add(sbc2Jcu__sbc____source);
		jcu__methodEncryption____methods.setSrc(jcu);
		jcu__methodEncryption____methods.setTrg(methodEncryption);
		ruleresult.getTranslatedEdges().add(jcu__methodEncryption____methods);
		jcu__methodPerformEncryption____methods.setSrc(jcu);
		jcu__methodPerformEncryption____methods.setTrg(methodPerformEncryption);
		ruleresult.getTranslatedEdges().add(jcu__methodPerformEncryption____methods);
		methodEncryption__statRetPerformEncryption____statements.setSrc(methodEncryption);
		methodEncryption__statRetPerformEncryption____statements.setTrg(statRetPerformEncryption);
		ruleresult.getTranslatedEdges().add(methodEncryption__statRetPerformEncryption____statements);
		t2c__task____source.setSrc(t2c);
		t2c__task____source.setTrg(task);
		ruleresult.getCreatedEdges().add(t2c__task____source);
		ruleresult.setRuleName(ruleresult_ruleName_prime);
		exprRetPerformEncryption__exprDataName____arguments
				.setName(exprRetPerformEncryption__exprDataName____arguments_name_prime);
		methodEncryption__dataEncryption____params.setName(methodEncryption__dataEncryption____params_name_prime);
		exprRetPerformEncryption__exprKeyName____arguments
				.setName(exprRetPerformEncryption__exprKeyName____arguments_name_prime);
		methodEncryption__keyEncryption____params.setName(methodEncryption__keyEncryption____params_name_prime);
		task__sbc____algorithms.setName(task__sbc____algorithms_name_prime);
		statRetPerformEncryption__exprRetPerformEncryption____expr
				.setName(statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime);
		t2c__javaPackage____target.setName(t2c__javaPackage____target_name_prime);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		exprRetPerformEncryption__exprNameModePadding____arguments
				.setName(exprRetPerformEncryption__exprNameModePadding____arguments_name_prime);
		sbc2Jcu__jcu____target.setName(sbc2Jcu__jcu____target_name_prime);
		sbc2Jcu__sbc____source.setName(sbc2Jcu__sbc____source_name_prime);
		jcu__methodEncryption____methods.setName(jcu__methodEncryption____methods_name_prime);
		jcu__methodPerformEncryption____methods.setName(jcu__methodPerformEncryption____methods_name_prime);
		methodEncryption__statRetPerformEncryption____statements
				.setName(methodEncryption__statRetPerformEncryption____statements_name_prime);
		t2c__task____source.setName(t2c__task____source_name_prime);
		return new Object[] { ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu, exprRetPerformEncryption__exprDataName____arguments,
				methodEncryption__dataEncryption____params, exprRetPerformEncryption__exprKeyName____arguments,
				methodEncryption__keyEncryption____params, task__sbc____algorithms,
				statRetPerformEncryption__exprRetPerformEncryption____expr, t2c__javaPackage____target,
				javaPackage__jcu____cunits, exprRetPerformEncryption__exprNameModePadding____arguments,
				sbc2Jcu__jcu____target, sbc2Jcu__sbc____source, jcu__methodEncryption____methods,
				jcu__methodPerformEncryption____methods, methodEncryption__statRetPerformEncryption____statements,
				t2c__task____source };
	}

	public static final void pattern_SymmetricEncryptionTask_11_5_registerobjects_expressionBBBBBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, PerformRuleResult ruleresult, EObject javaPackage, EObject sbc,
			EObject exprDataName, EObject statRetPerformEncryption, EObject dataEncryption,
			EObject exprRetPerformEncryption, EObject exprKeyName, EObject task, EObject methodPerformEncryption,
			EObject methodEncryption, EObject t2c, EObject keyEncryption, EObject exprNameModePadding, EObject jcu,
			EObject sbc2Jcu) {
		_this.registerObjects_BWD(ruleresult, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu);

	}

	public static final PerformRuleResult pattern_SymmetricEncryptionTask_11_6_expressionFB(
			PerformRuleResult ruleresult) {
		PerformRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_bindingFB(
			SymmetricEncryptionTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass eClass = _localVariable_0;
		if (eClass != null) {
			return new Object[] { eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_blackFBB(EClass eClass,
			SymmetricEncryptionTask _this) {
		for (EOperation performOperation : eClass.getEOperations()) {
			String performOperation_name = performOperation.getName();
			if (performOperation_name.equals("perform_BWD")) {
				return new Object[] { performOperation, eClass, _this };
			}

		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_bindingAndBlackFFB(
			SymmetricEncryptionTask _this) {
		Object[] result_pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_binding = pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_binding != null) {
			EClass eClass = (EClass) result_pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_black = pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_blackFBB(
					eClass, _this);
			if (result_pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_black != null) {
				EOperation performOperation = (EOperation) result_pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_black[0];

				return new Object[] { performOperation, eClass, _this };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_1_preparereturnvalue_greenBF(
			EOperation performOperation) {
		IsApplicableRuleResult ruleresult = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		boolean ruleresult_success_prime = Boolean.valueOf(false);
		String ruleresult_rule_prime = "SymmetricEncryptionTask";
		ruleresult.setPerformOperation(performOperation);
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		ruleresult.setRule(ruleresult_rule_prime);
		return new Object[] { performOperation, ruleresult };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_2_corematch_bindingFFFFFFFFFFFB(Match match) {
		EObject _localVariable_0 = match.getObject("javaPackage");
		EObject _localVariable_1 = match.getObject("exprDataName");
		EObject _localVariable_2 = match.getObject("statRetPerformEncryption");
		EObject _localVariable_3 = match.getObject("dataEncryption");
		EObject _localVariable_4 = match.getObject("exprRetPerformEncryption");
		EObject _localVariable_5 = match.getObject("exprKeyName");
		EObject _localVariable_6 = match.getObject("methodPerformEncryption");
		EObject _localVariable_7 = match.getObject("methodEncryption");
		EObject _localVariable_8 = match.getObject("keyEncryption");
		EObject _localVariable_9 = match.getObject("exprNameModePadding");
		EObject _localVariable_10 = match.getObject("jcu");
		EObject tmpJavaPackage = _localVariable_0;
		EObject tmpExprDataName = _localVariable_1;
		EObject tmpStatRetPerformEncryption = _localVariable_2;
		EObject tmpDataEncryption = _localVariable_3;
		EObject tmpExprRetPerformEncryption = _localVariable_4;
		EObject tmpExprKeyName = _localVariable_5;
		EObject tmpMethodPerformEncryption = _localVariable_6;
		EObject tmpMethodEncryption = _localVariable_7;
		EObject tmpKeyEncryption = _localVariable_8;
		EObject tmpExprNameModePadding = _localVariable_9;
		EObject tmpJcu = _localVariable_10;
		if (tmpJavaPackage instanceof JavaPackage) {
			JavaPackage javaPackage = (JavaPackage) tmpJavaPackage;
			if (tmpExprDataName instanceof JavaName) {
				JavaName exprDataName = (JavaName) tmpExprDataName;
				if (tmpStatRetPerformEncryption instanceof JavaStatement) {
					JavaStatement statRetPerformEncryption = (JavaStatement) tmpStatRetPerformEncryption;
					if (tmpDataEncryption instanceof JavaVariableDeclaration) {
						JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) tmpDataEncryption;
						if (tmpExprRetPerformEncryption instanceof JavaMethodInvocation) {
							JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) tmpExprRetPerformEncryption;
							if (tmpExprKeyName instanceof JavaName) {
								JavaName exprKeyName = (JavaName) tmpExprKeyName;
								if (tmpMethodPerformEncryption instanceof JavaOpaqueMethod) {
									JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) tmpMethodPerformEncryption;
									if (tmpMethodEncryption instanceof JavaWorkflowMethod) {
										JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) tmpMethodEncryption;
										if (tmpKeyEncryption instanceof JavaVariableDeclaration) {
											JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) tmpKeyEncryption;
											if (tmpExprNameModePadding instanceof JavaLiteral) {
												JavaLiteral exprNameModePadding = (JavaLiteral) tmpExprNameModePadding;
												if (tmpJcu instanceof JavaCompilationUnit) {
													JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
													return new Object[] { javaPackage, exprDataName,
															statRetPerformEncryption, dataEncryption,
															exprRetPerformEncryption, exprKeyName,
															methodPerformEncryption, methodEncryption, keyEncryption,
															exprNameModePadding, jcu, match };
												}
											}
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

	public static final Iterable<Object[]> pattern_SymmetricEncryptionTask_12_2_corematch_blackBBBBBBBBBBBB(
			JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			Match match) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				boolean statRetPerformEncryption_return = statRetPerformEncryption.isReturn();
				if (Boolean.valueOf(statRetPerformEncryption_return).equals(Boolean.valueOf(true))) {
					int dataEncryption_index = dataEncryption.getIndex();
					if (Integer.valueOf(dataEncryption_index).equals(Integer.valueOf(0))) {
						String dataEncryption_name = dataEncryption.getName();
						if (dataEncryption_name.equals("data")) {
							String dataEncryption_type = dataEncryption.getType();
							if (dataEncryption_type.equals("byte[]")) {
								String exprRetPerformEncryption_name = exprRetPerformEncryption.getName();
								if (exprRetPerformEncryption_name.equals("performEncryption")) {
									String methodPerformEncryption_type = methodPerformEncryption.getType();
									if (methodPerformEncryption_type.equals("byte[] ")) {
										String methodPerformEncryption_name = methodPerformEncryption.getName();
										if (methodPerformEncryption_name.equals("performEncryption")) {
											String keyEncryption_type = keyEncryption.getType();
											if (keyEncryption_type.equals("SecretKey")) {
												int keyEncryption_index = keyEncryption.getIndex();
												if (Integer.valueOf(keyEncryption_index).equals(Integer.valueOf(1))) {
													String keyEncryption_name = keyEncryption.getName();
													if (keyEncryption_name.equals("key")) {
														_result.add(new Object[] { javaPackage, exprDataName,
																statRetPerformEncryption, dataEncryption,
																exprRetPerformEncryption, exprKeyName,
																methodPerformEncryption, methodEncryption,
																keyEncryption, exprNameModePadding, jcu, match });
													}

												}

											}

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

	public static final Iterable<Object[]> pattern_SymmetricEncryptionTask_12_3_findcontext_blackBBBBBBBBBBB(
			JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				if (exprRetPerformEncryption.getArguments().contains(exprDataName)) {
					if (methodEncryption.getParams().contains(dataEncryption)) {
						if (exprRetPerformEncryption.getArguments().contains(exprKeyName)) {
							if (methodEncryption.getParams().contains(keyEncryption)) {
								if (exprRetPerformEncryption.equals(statRetPerformEncryption.getExpr())) {
									if (javaPackage.getCunits().contains(jcu)) {
										if (exprRetPerformEncryption.getArguments().contains(exprNameModePadding)) {
											if (jcu.getMethods().contains(methodEncryption)) {
												if (jcu.getMethods().contains(methodPerformEncryption)) {
													if (methodEncryption.getStatements()
															.contains(statRetPerformEncryption)) {
														boolean statRetPerformEncryption_return = statRetPerformEncryption
																.isReturn();
														if (Boolean.valueOf(statRetPerformEncryption_return)
																.equals(Boolean.valueOf(true))) {
															int dataEncryption_index = dataEncryption.getIndex();
															if (Integer.valueOf(dataEncryption_index)
																	.equals(Integer.valueOf(0))) {
																String dataEncryption_name = dataEncryption.getName();
																if (dataEncryption_name.equals("data")) {
																	String dataEncryption_type = dataEncryption
																			.getType();
																	if (dataEncryption_type.equals("byte[]")) {
																		String exprRetPerformEncryption_name = exprRetPerformEncryption
																				.getName();
																		if (exprRetPerformEncryption_name
																				.equals("performEncryption")) {
																			String methodPerformEncryption_type = methodPerformEncryption
																					.getType();
																			if (methodPerformEncryption_type
																					.equals("byte[] ")) {
																				String methodPerformEncryption_name = methodPerformEncryption
																						.getName();
																				if (methodPerformEncryption_name
																						.equals("performEncryption")) {
																					String keyEncryption_type = keyEncryption
																							.getType();
																					if (keyEncryption_type
																							.equals("SecretKey")) {
																						int keyEncryption_index = keyEncryption
																								.getIndex();
																						if (Integer.valueOf(
																								keyEncryption_index)
																								.equals(Integer
																										.valueOf(1))) {
																							String keyEncryption_name = keyEncryption
																									.getName();
																							if (keyEncryption_name
																									.equals("key")) {
																								_result.add(
																										new Object[] {
																												javaPackage,
																												exprDataName,
																												statRetPerformEncryption,
																												dataEncryption,
																												exprRetPerformEncryption,
																												exprKeyName,
																												methodPerformEncryption,
																												methodEncryption,
																												keyEncryption,
																												exprNameModePadding,
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
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_3_findcontext_greenBBBBBBBBBBBFFFFFFFFFFF(
			JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		EMoflonEdge exprRetPerformEncryption__exprDataName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__dataEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprKeyName____arguments = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__keyEncryption____params = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge statRetPerformEncryption__exprRetPerformEncryption____expr = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge javaPackage__jcu____cunits = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge exprRetPerformEncryption__exprNameModePadding____arguments = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		EMoflonEdge jcu__methodEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge jcu__methodPerformEncryption____methods = RuntimeFactory.eINSTANCE.createEMoflonEdge();
		EMoflonEdge methodEncryption__statRetPerformEncryption____statements = RuntimeFactory.eINSTANCE
				.createEMoflonEdge();
		String exprRetPerformEncryption__exprDataName____arguments_name_prime = "arguments";
		String methodEncryption__dataEncryption____params_name_prime = "params";
		String exprRetPerformEncryption__exprKeyName____arguments_name_prime = "arguments";
		String methodEncryption__keyEncryption____params_name_prime = "params";
		String statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime = "expr";
		String javaPackage__jcu____cunits_name_prime = "cunits";
		String exprRetPerformEncryption__exprNameModePadding____arguments_name_prime = "arguments";
		String jcu__methodEncryption____methods_name_prime = "methods";
		String jcu__methodPerformEncryption____methods_name_prime = "methods";
		String methodEncryption__statRetPerformEncryption____statements_name_prime = "statements";
		isApplicableMatch.getAllContextElements().add(javaPackage);
		isApplicableMatch.getAllContextElements().add(exprDataName);
		isApplicableMatch.getAllContextElements().add(statRetPerformEncryption);
		isApplicableMatch.getAllContextElements().add(dataEncryption);
		isApplicableMatch.getAllContextElements().add(exprRetPerformEncryption);
		isApplicableMatch.getAllContextElements().add(exprKeyName);
		isApplicableMatch.getAllContextElements().add(methodPerformEncryption);
		isApplicableMatch.getAllContextElements().add(methodEncryption);
		isApplicableMatch.getAllContextElements().add(keyEncryption);
		isApplicableMatch.getAllContextElements().add(exprNameModePadding);
		isApplicableMatch.getAllContextElements().add(jcu);
		exprRetPerformEncryption__exprDataName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprDataName____arguments.setTrg(exprDataName);
		isApplicableMatch.getAllContextElements().add(exprRetPerformEncryption__exprDataName____arguments);
		methodEncryption__dataEncryption____params.setSrc(methodEncryption);
		methodEncryption__dataEncryption____params.setTrg(dataEncryption);
		isApplicableMatch.getAllContextElements().add(methodEncryption__dataEncryption____params);
		exprRetPerformEncryption__exprKeyName____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprKeyName____arguments.setTrg(exprKeyName);
		isApplicableMatch.getAllContextElements().add(exprRetPerformEncryption__exprKeyName____arguments);
		methodEncryption__keyEncryption____params.setSrc(methodEncryption);
		methodEncryption__keyEncryption____params.setTrg(keyEncryption);
		isApplicableMatch.getAllContextElements().add(methodEncryption__keyEncryption____params);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setSrc(statRetPerformEncryption);
		statRetPerformEncryption__exprRetPerformEncryption____expr.setTrg(exprRetPerformEncryption);
		isApplicableMatch.getAllContextElements().add(statRetPerformEncryption__exprRetPerformEncryption____expr);
		javaPackage__jcu____cunits.setSrc(javaPackage);
		javaPackage__jcu____cunits.setTrg(jcu);
		isApplicableMatch.getAllContextElements().add(javaPackage__jcu____cunits);
		exprRetPerformEncryption__exprNameModePadding____arguments.setSrc(exprRetPerformEncryption);
		exprRetPerformEncryption__exprNameModePadding____arguments.setTrg(exprNameModePadding);
		isApplicableMatch.getAllContextElements().add(exprRetPerformEncryption__exprNameModePadding____arguments);
		jcu__methodEncryption____methods.setSrc(jcu);
		jcu__methodEncryption____methods.setTrg(methodEncryption);
		isApplicableMatch.getAllContextElements().add(jcu__methodEncryption____methods);
		jcu__methodPerformEncryption____methods.setSrc(jcu);
		jcu__methodPerformEncryption____methods.setTrg(methodPerformEncryption);
		isApplicableMatch.getAllContextElements().add(jcu__methodPerformEncryption____methods);
		methodEncryption__statRetPerformEncryption____statements.setSrc(methodEncryption);
		methodEncryption__statRetPerformEncryption____statements.setTrg(statRetPerformEncryption);
		isApplicableMatch.getAllContextElements().add(methodEncryption__statRetPerformEncryption____statements);
		exprRetPerformEncryption__exprDataName____arguments
				.setName(exprRetPerformEncryption__exprDataName____arguments_name_prime);
		methodEncryption__dataEncryption____params.setName(methodEncryption__dataEncryption____params_name_prime);
		exprRetPerformEncryption__exprKeyName____arguments
				.setName(exprRetPerformEncryption__exprKeyName____arguments_name_prime);
		methodEncryption__keyEncryption____params.setName(methodEncryption__keyEncryption____params_name_prime);
		statRetPerformEncryption__exprRetPerformEncryption____expr
				.setName(statRetPerformEncryption__exprRetPerformEncryption____expr_name_prime);
		javaPackage__jcu____cunits.setName(javaPackage__jcu____cunits_name_prime);
		exprRetPerformEncryption__exprNameModePadding____arguments
				.setName(exprRetPerformEncryption__exprNameModePadding____arguments_name_prime);
		jcu__methodEncryption____methods.setName(jcu__methodEncryption____methods_name_prime);
		jcu__methodPerformEncryption____methods.setName(jcu__methodPerformEncryption____methods_name_prime);
		methodEncryption__statRetPerformEncryption____statements
				.setName(methodEncryption__statRetPerformEncryption____statements_name_prime);
		return new Object[] { javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
				exprNameModePadding, jcu, isApplicableMatch, exprRetPerformEncryption__exprDataName____arguments,
				methodEncryption__dataEncryption____params, exprRetPerformEncryption__exprKeyName____arguments,
				methodEncryption__keyEncryption____params, statRetPerformEncryption__exprRetPerformEncryption____expr,
				javaPackage__jcu____cunits, exprRetPerformEncryption__exprNameModePadding____arguments,
				jcu__methodEncryption____methods, jcu__methodPerformEncryption____methods,
				methodEncryption__statRetPerformEncryption____statements };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_4_solveCSP_bindingFBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch, JavaPackage javaPackage,
			JavaName exprDataName, JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		CSP _localVariable_0 = _this.isApplicable_solveCsp_BWD(isApplicableMatch, javaPackage, exprDataName,
				statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
				methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, javaPackage, exprDataName, statRetPerformEncryption,
					dataEncryption, exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
					keyEncryption, exprNameModePadding, jcu };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_4_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_4_solveCSP_bindingAndBlackFBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch, JavaPackage javaPackage,
			JavaName exprDataName, JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		Object[] result_pattern_SymmetricEncryptionTask_12_4_solveCSP_binding = pattern_SymmetricEncryptionTask_12_4_solveCSP_bindingFBBBBBBBBBBBBB(
				_this, isApplicableMatch, javaPackage, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption, keyEncryption,
				exprNameModePadding, jcu);
		if (result_pattern_SymmetricEncryptionTask_12_4_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_12_4_solveCSP_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_12_4_solveCSP_black = pattern_SymmetricEncryptionTask_12_4_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricEncryptionTask_12_4_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, javaPackage, exprDataName,
						statRetPerformEncryption, dataEncryption, exprRetPerformEncryption, exprKeyName,
						methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding, jcu };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricEncryptionTask_12_5_checkCSP_expressionFBB(
			SymmetricEncryptionTask _this, CSP csp) {
		boolean _localVariable_0 = _this.isApplicable_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_6_addmatchtoruleresult_blackBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_12_6_addmatchtoruleresult_greenBB(
			IsApplicableRuleResult ruleresult, IsApplicableMatch isApplicableMatch) {
		ruleresult.getIsApplicableMatch().add(isApplicableMatch);
		boolean ruleresult_success_prime = Boolean.valueOf(true);
		String isApplicableMatch_ruleName_prime = "SymmetricEncryptionTask";
		ruleresult.setSuccess(Boolean.valueOf(ruleresult_success_prime));
		isApplicableMatch.setRuleName(isApplicableMatch_ruleName_prime);
		return new Object[] { ruleresult, isApplicableMatch };
	}

	public static final IsApplicableRuleResult pattern_SymmetricEncryptionTask_12_7_expressionFB(
			IsApplicableRuleResult ruleresult) {
		IsApplicableRuleResult _result = ruleresult;
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_bindingFB(
			SymmetricEncryptionTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SymmetricEncryptionTask _this) {
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

	public static final Object[] pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_bindingAndBlackFFBF(
			SymmetricEncryptionTask _this) {
		Object[] result_pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_binding = pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_black = pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_20_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_20_2_testcorematchandDECs_black_nac_0BB(Task task,
			SymmetricBlockCipher sbc) {
		for (Algorithm __DEC_task_algorithms_816326 : task.getAlgorithms()) {
			if (!sbc.equals(__DEC_task_algorithms_816326)) {
				return new Object[] { task, sbc };
			}
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SymmetricEncryptionTask_20_2_testcorematchandDECs_blackFFB(
			EMoflonEdge _edge_algorithms) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpTask = _edge_algorithms.getSrc();
		if (tmpTask instanceof Task) {
			Task task = (Task) tmpTask;
			EObject tmpSbc = _edge_algorithms.getTrg();
			if (tmpSbc instanceof SymmetricBlockCipher) {
				SymmetricBlockCipher sbc = (SymmetricBlockCipher) tmpSbc;
				if (task.getAlgorithms().contains(sbc)) {
					String task_description = task.getDescription();
					if (task_description.equals("SymmetricEncryption")) {
						if (pattern_SymmetricEncryptionTask_20_2_testcorematchandDECs_black_nac_0BB(task,
								sbc) == null) {
							_result.add(new Object[] { sbc, task, _edge_algorithms });
						}
					}

				}
			}

		}

		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_20_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SymmetricEncryptionTask_20_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBB(
			SymmetricEncryptionTask _this, Match match, SymmetricBlockCipher sbc, Task task) {
		boolean _localVariable_0 = _this.isAppropriate_FWD(match, sbc, task);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SymmetricEncryptionTask_20_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SymmetricEncryptionTask _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_FWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_20_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_20_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SymmetricEncryptionTask_20_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_bindingFB(
			SymmetricEncryptionTask _this) {
		EClass _localVariable_0 = _this.eClass();
		EClass __eClass = _localVariable_0;
		if (__eClass != null) {
			return new Object[] { __eClass, _this };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_blackFBBF(EClass __eClass,
			SymmetricEncryptionTask _this) {
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

	public static final Object[] pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_bindingAndBlackFFBF(
			SymmetricEncryptionTask _this) {
		Object[] result_pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_binding = pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_bindingFB(
				_this);
		if (result_pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_binding != null) {
			EClass __eClass = (EClass) result_pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_black = pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_blackFBBF(
					__eClass, _this);
			if (result_pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_black != null) {
				EOperation __performOperation = (EOperation) result_pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_black[0];
				EOperation isApplicableCC = (EOperation) result_pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_black[3];

				return new Object[] { __performOperation, __eClass, _this, isApplicableCC };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_1_preparereturnvalue_greenF() {
		EObjectContainer __result = RuntimeFactory.eINSTANCE.createEObjectContainer();
		return new Object[] { __result };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_0BB(
			JavaPackage javaPackage, JavaCompilationUnit jcu) {
		for (JavaCompilationUnit __DEC_javaPackage_cunits_16704 : javaPackage.getCunits()) {
			if (!jcu.equals(__DEC_javaPackage_cunits_16704)) {
				return new Object[] { javaPackage, jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_1BB(
			JavaName exprDataName, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_exprDataName_expr_886139 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprDataName, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_exprDataName_expr_886139)) {
				return new Object[] { exprDataName, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_2BB(
			JavaVariableDeclaration dataEncryption, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_dataEncryption_expr_219486 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(dataEncryption, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_dataEncryption_expr_219486)) {
				return new Object[] { dataEncryption, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_3BB(
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption) {
		for (JavaMethodInvocation __DEC_dataEncryption_arguments_249676 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(dataEncryption, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetPerformEncryption.equals(__DEC_dataEncryption_arguments_249676)) {
				return new Object[] { dataEncryption, exprRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_4B(
			JavaMethodInvocation exprRetPerformEncryption) {
		for (JavaMethodInvocation __DEC_exprRetPerformEncryption_arguments_864633 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprRetPerformEncryption, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetPerformEncryption.equals(__DEC_exprRetPerformEncryption_arguments_864633)) {
				return new Object[] { exprRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_5BB(
			JavaName exprKeyName, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_exprKeyName_expr_573462 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprKeyName, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_exprKeyName_expr_573462)) {
				return new Object[] { exprKeyName, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_6BB(
			JavaWorkflowMethod methodEncryption, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_methodEncryption_statements_531725 : methodEncryption.getStatements()) {
			if (!statRetPerformEncryption.equals(__DEC_methodEncryption_statements_531725)) {
				return new Object[] { methodEncryption, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_7BB(
			JavaVariableDeclaration keyEncryption, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_keyEncryption_expr_871320 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(keyEncryption, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_keyEncryption_expr_871320)) {
				return new Object[] { keyEncryption, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_8BB(
			JavaVariableDeclaration keyEncryption, JavaMethodInvocation exprRetPerformEncryption) {
		for (JavaMethodInvocation __DEC_keyEncryption_arguments_304996 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(keyEncryption, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetPerformEncryption.equals(__DEC_keyEncryption_arguments_304996)) {
				return new Object[] { keyEncryption, exprRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_9BB(
			JavaLiteral exprNameModePadding, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_exprNameModePadding_expr_624052 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprNameModePadding, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_exprNameModePadding_expr_624052)) {
				return new Object[] { exprNameModePadding, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_10BB(
			JavaStatement statRetPerformEncryption, JavaName exprDataName) {
		if (exprDataName.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, exprDataName };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_11BB(
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption) {
		if (dataEncryption.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, dataEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_12BB(
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration dataEncryption) {
		if (exprRetPerformEncryption.getArguments().contains(dataEncryption)) {
			return new Object[] { exprRetPerformEncryption, dataEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_13BB(
			JavaStatement statRetPerformEncryption, JavaName exprKeyName) {
		if (exprKeyName.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, exprKeyName };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_14BB(
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration keyEncryption) {
		if (keyEncryption.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, keyEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_15BB(
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption) {
		if (exprRetPerformEncryption.getArguments().contains(keyEncryption)) {
			return new Object[] { exprRetPerformEncryption, keyEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_16BB(
			JavaStatement statRetPerformEncryption, JavaLiteral exprNameModePadding) {
		if (exprNameModePadding.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, exprNameModePadding };
		}
		return null;
	}

	public static final Iterable<Object[]> pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_blackFFFFFFFFFFFB(
			EMoflonEdge _edge_arguments) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		EObject tmpExprRetPerformEncryption = _edge_arguments.getSrc();
		if (tmpExprRetPerformEncryption instanceof JavaMethodInvocation) {
			JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) tmpExprRetPerformEncryption;
			EObject tmpExprDataName = _edge_arguments.getTrg();
			if (tmpExprDataName instanceof JavaName) {
				JavaName exprDataName = (JavaName) tmpExprDataName;
				if (exprRetPerformEncryption.getArguments().contains(exprDataName)) {
					String exprRetPerformEncryption_name = exprRetPerformEncryption.getName();
					if (exprRetPerformEncryption_name.equals("performEncryption")) {
						if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_4B(
								exprRetPerformEncryption) == null) {
							for (JavaExpression tmpExprKeyName : exprRetPerformEncryption.getArguments()) {
								if (tmpExprKeyName instanceof JavaName) {
									JavaName exprKeyName = (JavaName) tmpExprKeyName;
									if (!exprDataName.equals(exprKeyName)) {
										for (JavaExpression tmpExprNameModePadding : exprRetPerformEncryption
												.getArguments()) {
											if (tmpExprNameModePadding instanceof JavaLiteral) {
												JavaLiteral exprNameModePadding = (JavaLiteral) tmpExprNameModePadding;
												for (JavaStatement statRetPerformEncryption : org.moflon.core.utilities.eMoflonEMFUtil
														.getOppositeReferenceTyped(exprRetPerformEncryption,
																JavaStatement.class, "expr")) {
													boolean statRetPerformEncryption_return = statRetPerformEncryption
															.isReturn();
													if (Boolean.valueOf(statRetPerformEncryption_return)
															.equals(Boolean.valueOf(true))) {
														if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_1BB(
																exprDataName, statRetPerformEncryption) == null) {
															if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_5BB(
																	exprKeyName, statRetPerformEncryption) == null) {
																if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_9BB(
																		exprNameModePadding,
																		statRetPerformEncryption) == null) {
																	if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_10BB(
																			statRetPerformEncryption,
																			exprDataName) == null) {
																		if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_13BB(
																				statRetPerformEncryption,
																				exprKeyName) == null) {
																			if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_16BB(
																					statRetPerformEncryption,
																					exprNameModePadding) == null) {
																				for (JavaWorkflowMethod methodEncryption : org.moflon.core.utilities.eMoflonEMFUtil
																						.getOppositeReferenceTyped(
																								statRetPerformEncryption,
																								JavaWorkflowMethod.class,
																								"statements")) {
																					if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_6BB(
																							methodEncryption,
																							statRetPerformEncryption) == null) {
																						for (JavaVariableDeclaration dataEncryption : methodEncryption
																								.getParams()) {
																							int dataEncryption_index = dataEncryption
																									.getIndex();
																							if (Integer.valueOf(
																									dataEncryption_index)
																									.equals(Integer
																											.valueOf(
																													0))) {
																								String dataEncryption_name = dataEncryption
																										.getName();
																								if (dataEncryption_name
																										.equals("data")) {
																									String dataEncryption_type = dataEncryption
																											.getType();
																									if (dataEncryption_type
																											.equals("byte[]")) {
																										if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_2BB(
																												dataEncryption,
																												statRetPerformEncryption) == null) {
																											if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_3BB(
																													dataEncryption,
																													exprRetPerformEncryption) == null) {
																												if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_11BB(
																														statRetPerformEncryption,
																														dataEncryption) == null) {
																													if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_12BB(
																															exprRetPerformEncryption,
																															dataEncryption) == null) {
																														for (JavaVariableDeclaration keyEncryption : methodEncryption
																																.getParams()) {
																															if (!dataEncryption
																																	.equals(keyEncryption)) {
																																String keyEncryption_type = keyEncryption
																																		.getType();
																																if (keyEncryption_type
																																		.equals("SecretKey")) {
																																	int keyEncryption_index = keyEncryption
																																			.getIndex();
																																	if (Integer
																																			.valueOf(
																																					keyEncryption_index)
																																			.equals(Integer
																																					.valueOf(
																																							1))) {
																																		String keyEncryption_name = keyEncryption
																																				.getName();
																																		if (keyEncryption_name
																																				.equals("key")) {
																																			if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_7BB(
																																					keyEncryption,
																																					statRetPerformEncryption) == null) {
																																				if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_8BB(
																																						keyEncryption,
																																						exprRetPerformEncryption) == null) {
																																					if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_14BB(
																																							statRetPerformEncryption,
																																							keyEncryption) == null) {
																																						if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_15BB(
																																								exprRetPerformEncryption,
																																								keyEncryption) == null) {
																																							for (JavaCompilationUnit jcu : org.moflon.core.utilities.eMoflonEMFUtil
																																									.getOppositeReferenceTyped(
																																											methodEncryption,
																																											JavaCompilationUnit.class,
																																											"methods")) {
																																								for (JavaMethod tmpMethodPerformEncryption : jcu
																																										.getMethods()) {
																																									if (tmpMethodPerformEncryption instanceof JavaOpaqueMethod) {
																																										JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) tmpMethodPerformEncryption;
																																										String methodPerformEncryption_type = methodPerformEncryption
																																												.getType();
																																										if (methodPerformEncryption_type
																																												.equals("byte[] ")) {
																																											String methodPerformEncryption_name = methodPerformEncryption
																																													.getName();
																																											if (methodPerformEncryption_name
																																													.equals("performEncryption")) {
																																												for (JavaPackage javaPackage : org.moflon.core.utilities.eMoflonEMFUtil
																																														.getOppositeReferenceTyped(
																																																jcu,
																																																JavaPackage.class,
																																																"cunits")) {
																																													if (pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_black_nac_0BB(
																																															javaPackage,
																																															jcu) == null) {
																																														_result.add(
																																																new Object[] {
																																																		javaPackage,
																																																		exprDataName,
																																																		statRetPerformEncryption,
																																																		dataEncryption,
																																																		exprRetPerformEncryption,
																																																		exprKeyName,
																																																		methodPerformEncryption,
																																																		methodEncryption,
																																																		keyEncryption,
																																																		exprNameModePadding,
																																																		jcu,
																																																		_edge_arguments });
																																													}
																																												}
																																											}

																																										}

																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}

																																	}

																																}

																															}
																														}
																													}
																												}
																											}
																										}
																									}

																								}

																							}

																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}

												}
											}
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

	public static final Object[] pattern_SymmetricEncryptionTask_21_2_testcorematchandDECs_greenFB(EClass __eClass) {
		Match match = RuntimeFactory.eINSTANCE.createMatch();
		String __eClass_name = __eClass.getName();
		String match_ruleName_prime = __eClass_name;
		match.setRuleName(match_ruleName_prime);
		return new Object[] { match, __eClass };

	}

	public static final boolean pattern_SymmetricEncryptionTask_21_3_bookkeepingwithgenericisAppropriatemethod_expressionFBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, Match match, JavaPackage javaPackage, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		boolean _localVariable_0 = _this.isAppropriate_BWD(match, javaPackage, exprDataName, statRetPerformEncryption,
				dataEncryption, exprRetPerformEncryption, exprKeyName, methodPerformEncryption, methodEncryption,
				keyEncryption, exprNameModePadding, jcu);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final boolean pattern_SymmetricEncryptionTask_21_4_Ensurethatthecorrecttypesofelementsarematched_expressionFBB(
			SymmetricEncryptionTask _this, Match match) {
		boolean _localVariable_0 = _this.checkTypes_BWD(match);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_5_Addmatchtoruleresult_blackBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		if (!__performOperation.equals(isApplicableCC)) {
			return new Object[] { match, __performOperation, __result, isApplicableCC };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_21_5_Addmatchtoruleresult_greenBBBB(Match match,
			EOperation __performOperation, EObjectContainer __result, EOperation isApplicableCC) {
		__result.getContents().add(match);
		match.setIsApplicableOperation(__performOperation);
		match.setIsApplicableCCOperation(isApplicableCC);
		return new Object[] { match, __performOperation, __result, isApplicableCC };
	}

	public static final EObjectContainer pattern_SymmetricEncryptionTask_21_6_expressionFB(EObjectContainer __result) {
		EObjectContainer _result = __result;
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_1_prepare_blackB(SymmetricEncryptionTask _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_1_prepare_greenF() {
		IsApplicableRuleResult result = RuntimeFactory.eINSTANCE.createIsApplicableRuleResult();
		return new Object[] { result };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFFFBB(
			Match targetMatch, Match sourceMatch) {
		EObject _localVariable_0 = targetMatch.getObject("javaPackage");
		EObject _localVariable_1 = sourceMatch.getObject("sbc");
		EObject _localVariable_2 = targetMatch.getObject("exprDataName");
		EObject _localVariable_3 = targetMatch.getObject("statRetPerformEncryption");
		EObject _localVariable_4 = targetMatch.getObject("dataEncryption");
		EObject _localVariable_5 = targetMatch.getObject("exprRetPerformEncryption");
		EObject _localVariable_6 = targetMatch.getObject("exprKeyName");
		EObject _localVariable_7 = sourceMatch.getObject("task");
		EObject _localVariable_8 = targetMatch.getObject("methodPerformEncryption");
		EObject _localVariable_9 = targetMatch.getObject("methodEncryption");
		EObject _localVariable_10 = targetMatch.getObject("keyEncryption");
		EObject _localVariable_11 = targetMatch.getObject("exprNameModePadding");
		EObject _localVariable_12 = targetMatch.getObject("jcu");
		EObject tmpJavaPackage = _localVariable_0;
		EObject tmpSbc = _localVariable_1;
		EObject tmpExprDataName = _localVariable_2;
		EObject tmpStatRetPerformEncryption = _localVariable_3;
		EObject tmpDataEncryption = _localVariable_4;
		EObject tmpExprRetPerformEncryption = _localVariable_5;
		EObject tmpExprKeyName = _localVariable_6;
		EObject tmpTask = _localVariable_7;
		EObject tmpMethodPerformEncryption = _localVariable_8;
		EObject tmpMethodEncryption = _localVariable_9;
		EObject tmpKeyEncryption = _localVariable_10;
		EObject tmpExprNameModePadding = _localVariable_11;
		EObject tmpJcu = _localVariable_12;
		if (tmpJavaPackage instanceof JavaPackage) {
			JavaPackage javaPackage = (JavaPackage) tmpJavaPackage;
			if (tmpSbc instanceof SymmetricBlockCipher) {
				SymmetricBlockCipher sbc = (SymmetricBlockCipher) tmpSbc;
				if (tmpExprDataName instanceof JavaName) {
					JavaName exprDataName = (JavaName) tmpExprDataName;
					if (tmpStatRetPerformEncryption instanceof JavaStatement) {
						JavaStatement statRetPerformEncryption = (JavaStatement) tmpStatRetPerformEncryption;
						if (tmpDataEncryption instanceof JavaVariableDeclaration) {
							JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) tmpDataEncryption;
							if (tmpExprRetPerformEncryption instanceof JavaMethodInvocation) {
								JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) tmpExprRetPerformEncryption;
								if (tmpExprKeyName instanceof JavaName) {
									JavaName exprKeyName = (JavaName) tmpExprKeyName;
									if (tmpTask instanceof Task) {
										Task task = (Task) tmpTask;
										if (tmpMethodPerformEncryption instanceof JavaOpaqueMethod) {
											JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) tmpMethodPerformEncryption;
											if (tmpMethodEncryption instanceof JavaWorkflowMethod) {
												JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) tmpMethodEncryption;
												if (tmpKeyEncryption instanceof JavaVariableDeclaration) {
													JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) tmpKeyEncryption;
													if (tmpExprNameModePadding instanceof JavaLiteral) {
														JavaLiteral exprNameModePadding = (JavaLiteral) tmpExprNameModePadding;
														if (tmpJcu instanceof JavaCompilationUnit) {
															JavaCompilationUnit jcu = (JavaCompilationUnit) tmpJcu;
															return new Object[] { javaPackage, sbc, exprDataName,
																	statRetPerformEncryption, dataEncryption,
																	exprRetPerformEncryption, exprKeyName, task,
																	methodPerformEncryption, methodEncryption,
																	keyEncryption, exprNameModePadding, jcu,
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

	public static final Object[] pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBBBB(
			JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			Match sourceMatch, Match targetMatch) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				if (!sourceMatch.equals(targetMatch)) {
					boolean statRetPerformEncryption_return = statRetPerformEncryption.isReturn();
					if (Boolean.valueOf(statRetPerformEncryption_return).equals(Boolean.valueOf(true))) {
						int dataEncryption_index = dataEncryption.getIndex();
						if (Integer.valueOf(dataEncryption_index).equals(Integer.valueOf(0))) {
							String dataEncryption_name = dataEncryption.getName();
							if (dataEncryption_name.equals("data")) {
								String dataEncryption_type = dataEncryption.getType();
								if (dataEncryption_type.equals("byte[]")) {
									String exprRetPerformEncryption_name = exprRetPerformEncryption.getName();
									if (exprRetPerformEncryption_name.equals("performEncryption")) {
										String task_description = task.getDescription();
										if (task_description.equals("SymmetricEncryption")) {
											String methodPerformEncryption_type = methodPerformEncryption.getType();
											if (methodPerformEncryption_type.equals("byte[] ")) {
												String methodPerformEncryption_name = methodPerformEncryption.getName();
												if (methodPerformEncryption_name.equals("performEncryption")) {
													String keyEncryption_type = keyEncryption.getType();
													if (keyEncryption_type.equals("SecretKey")) {
														int keyEncryption_index = keyEncryption.getIndex();
														if (Integer.valueOf(keyEncryption_index)
																.equals(Integer.valueOf(1))) {
															String keyEncryption_name = keyEncryption.getName();
															if (keyEncryption_name.equals("key")) {
																return new Object[] { javaPackage, sbc, exprDataName,
																		statRetPerformEncryption, dataEncryption,
																		exprRetPerformEncryption, exprKeyName, task,
																		methodPerformEncryption, methodEncryption,
																		keyEncryption, exprNameModePadding, jcu,
																		sourceMatch, targetMatch };
															}

														}

													}

												}

											}

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

	public static final Object[] pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_bindingAndBlackFFFFFFFFFFFFFBB(
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding = pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_bindingFFFFFFFFFFFFFBB(
				targetMatch, sourceMatch);
		if (result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding != null) {
			JavaPackage javaPackage = (JavaPackage) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[0];
			SymmetricBlockCipher sbc = (SymmetricBlockCipher) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[1];
			JavaName exprDataName = (JavaName) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[2];
			JavaStatement statRetPerformEncryption = (JavaStatement) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[3];
			JavaVariableDeclaration dataEncryption = (JavaVariableDeclaration) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[4];
			JavaMethodInvocation exprRetPerformEncryption = (JavaMethodInvocation) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[5];
			JavaName exprKeyName = (JavaName) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[6];
			Task task = (Task) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[7];
			JavaOpaqueMethod methodPerformEncryption = (JavaOpaqueMethod) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[8];
			JavaWorkflowMethod methodEncryption = (JavaWorkflowMethod) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[9];
			JavaVariableDeclaration keyEncryption = (JavaVariableDeclaration) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[10];
			JavaLiteral exprNameModePadding = (JavaLiteral) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[11];
			JavaCompilationUnit jcu = (JavaCompilationUnit) result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_binding[12];

			Object[] result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_black = pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_blackBBBBBBBBBBBBBBB(
					javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
					exprKeyName, task, methodPerformEncryption, methodEncryption, keyEncryption, exprNameModePadding,
					jcu, sourceMatch, targetMatch);
			if (result_pattern_SymmetricEncryptionTask_24_2_matchsrctrgcontext_black != null) {

				return new Object[] { javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption,
						keyEncryption, exprNameModePadding, jcu, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_3_solvecsp_bindingFBBBBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			Match sourceMatch, Match targetMatch) {
		CSP _localVariable_13 = _this.isApplicable_solveCsp_CC(javaPackage, sbc, exprDataName, statRetPerformEncryption,
				dataEncryption, exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption,
				keyEncryption, exprNameModePadding, jcu, sourceMatch, targetMatch);
		CSP csp = _localVariable_13;
		if (csp != null) {
			return new Object[] { csp, _this, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
					exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption,
					keyEncryption, exprNameModePadding, jcu, sourceMatch, targetMatch };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_3_solvecsp_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_3_solvecsp_bindingAndBlackFBBBBBBBBBBBBBBBB(
			SymmetricEncryptionTask _this, JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			Match sourceMatch, Match targetMatch) {
		Object[] result_pattern_SymmetricEncryptionTask_24_3_solvecsp_binding = pattern_SymmetricEncryptionTask_24_3_solvecsp_bindingFBBBBBBBBBBBBBBBB(
				_this, javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, keyEncryption,
				exprNameModePadding, jcu, sourceMatch, targetMatch);
		if (result_pattern_SymmetricEncryptionTask_24_3_solvecsp_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_24_3_solvecsp_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_24_3_solvecsp_black = pattern_SymmetricEncryptionTask_24_3_solvecsp_blackB(
					csp);
			if (result_pattern_SymmetricEncryptionTask_24_3_solvecsp_black != null) {

				return new Object[] { csp, _this, javaPackage, sbc, exprDataName, statRetPerformEncryption,
						dataEncryption, exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption,
						methodEncryption, keyEncryption, exprNameModePadding, jcu, sourceMatch, targetMatch };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricEncryptionTask_24_4_checkCSP_expressionFB(CSP csp) {
		boolean _localVariable_0 = csp.check();
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Iterable<Object[]> pattern_SymmetricEncryptionTask_24_5_matchcorrcontext_blackBB(
			Match sourceMatch, Match targetMatch) {
		LinkedList<Object[]> _result = new LinkedList<Object[]>();
		if (!sourceMatch.equals(targetMatch)) {
			_result.add(new Object[] { sourceMatch, targetMatch });
		}
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_5_matchcorrcontext_greenBBF(Match sourceMatch,
			Match targetMatch) {
		CCMatch ccMatch = RuntimeFactory.eINSTANCE.createCCMatch();
		String ccMatch_ruleName_prime = "SymmetricEncryptionTask";
		ccMatch.setSourceMatch(sourceMatch);
		ccMatch.setTargetMatch(targetMatch);
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { sourceMatch, targetMatch, ccMatch };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_6_createcorrespondence_blackBBBBBBBBBBBBBB(
			JavaPackage javaPackage, SymmetricBlockCipher sbc, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName, Task task,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu,
			CCMatch ccMatch) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				return new Object[] { javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
						exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption,
						keyEncryption, exprNameModePadding, jcu, ccMatch };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_6_createcorrespondence_greenBBBFBFB(
			JavaPackage javaPackage, SymmetricBlockCipher sbc, Task task, JavaCompilationUnit jcu, CCMatch ccMatch) {
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		SymmetricBlockCipherToJcu sbc2Jcu = CryptoConfigToJavaFactory.eINSTANCE.createSymmetricBlockCipherToJcu();
		t2c.setTarget(javaPackage);
		t2c.setSource(task);
		ccMatch.getCreateCorr().add(t2c);
		sbc2Jcu.setTarget(jcu);
		sbc2Jcu.setSource(sbc);
		ccMatch.getCreateCorr().add(sbc2Jcu);
		return new Object[] { javaPackage, sbc, task, t2c, jcu, sbc2Jcu, ccMatch };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_7_addtoreturnedresult_blackBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		return new Object[] { result, ccMatch };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_24_7_addtoreturnedresult_greenBB(
			IsApplicableRuleResult result, CCMatch ccMatch) {
		result.getIsApplicableMatch().add(ccMatch);
		boolean result_success_prime = Boolean.valueOf(true);
		String ccMatch_ruleName_prime = "SymmetricEncryptionTask";
		result.setSuccess(Boolean.valueOf(result_success_prime));
		ccMatch.setRuleName(ccMatch_ruleName_prime);
		return new Object[] { result, ccMatch };
	}

	public static final IsApplicableRuleResult pattern_SymmetricEncryptionTask_24_8_expressionFB(
			IsApplicableRuleResult result) {
		IsApplicableRuleResult _result = result;
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_27_1_matchtggpattern_black_nac_0BB(Task task,
			SymmetricBlockCipher sbc) {
		for (Algorithm __DEC_task_algorithms_24475 : task.getAlgorithms()) {
			if (!sbc.equals(__DEC_task_algorithms_24475)) {
				return new Object[] { task, sbc };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_27_1_matchtggpattern_blackBB(SymmetricBlockCipher sbc,
			Task task) {
		if (task.getAlgorithms().contains(sbc)) {
			if (pattern_SymmetricEncryptionTask_27_1_matchtggpattern_black_nac_0BB(task, sbc) == null) {
				return new Object[] { sbc, task };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_27_1_matchtggpattern_greenB(Task task) {
		String task_description_prime = "SymmetricEncryption";
		task.setDescription(task_description_prime);
		return new Object[] { task };
	}

	public static final boolean pattern_SymmetricEncryptionTask_27_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricEncryptionTask_27_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_0BB(
			JavaPackage javaPackage, JavaCompilationUnit jcu) {
		for (JavaCompilationUnit __DEC_javaPackage_cunits_595430 : javaPackage.getCunits()) {
			if (!jcu.equals(__DEC_javaPackage_cunits_595430)) {
				return new Object[] { javaPackage, jcu };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_1BB(
			JavaName exprDataName, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_exprDataName_expr_907759 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprDataName, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_exprDataName_expr_907759)) {
				return new Object[] { exprDataName, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_2BB(
			JavaVariableDeclaration dataEncryption, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_dataEncryption_expr_42962 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(dataEncryption, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_dataEncryption_expr_42962)) {
				return new Object[] { dataEncryption, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_3BB(
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption) {
		for (JavaMethodInvocation __DEC_dataEncryption_arguments_418039 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(dataEncryption, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetPerformEncryption.equals(__DEC_dataEncryption_arguments_418039)) {
				return new Object[] { dataEncryption, exprRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_4B(
			JavaMethodInvocation exprRetPerformEncryption) {
		for (JavaMethodInvocation __DEC_exprRetPerformEncryption_arguments_656815 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprRetPerformEncryption, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetPerformEncryption.equals(__DEC_exprRetPerformEncryption_arguments_656815)) {
				return new Object[] { exprRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_5BB(
			JavaName exprKeyName, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_exprKeyName_expr_706700 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprKeyName, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_exprKeyName_expr_706700)) {
				return new Object[] { exprKeyName, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_6BB(
			JavaWorkflowMethod methodEncryption, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_methodEncryption_statements_769393 : methodEncryption.getStatements()) {
			if (!statRetPerformEncryption.equals(__DEC_methodEncryption_statements_769393)) {
				return new Object[] { methodEncryption, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_7BB(
			JavaVariableDeclaration keyEncryption, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_keyEncryption_expr_937015 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(keyEncryption, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_keyEncryption_expr_937015)) {
				return new Object[] { keyEncryption, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_8BB(
			JavaVariableDeclaration keyEncryption, JavaMethodInvocation exprRetPerformEncryption) {
		for (JavaMethodInvocation __DEC_keyEncryption_arguments_531736 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(keyEncryption, JavaMethodInvocation.class, "arguments")) {
			if (!exprRetPerformEncryption.equals(__DEC_keyEncryption_arguments_531736)) {
				return new Object[] { keyEncryption, exprRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_9BB(
			JavaLiteral exprNameModePadding, JavaStatement statRetPerformEncryption) {
		for (JavaStatement __DEC_exprNameModePadding_expr_278420 : org.moflon.core.utilities.eMoflonEMFUtil
				.getOppositeReferenceTyped(exprNameModePadding, JavaStatement.class, "expr")) {
			if (!statRetPerformEncryption.equals(__DEC_exprNameModePadding_expr_278420)) {
				return new Object[] { exprNameModePadding, statRetPerformEncryption };
			}
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_10BB(
			JavaStatement statRetPerformEncryption, JavaName exprDataName) {
		if (exprDataName.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, exprDataName };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_11BB(
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption) {
		if (dataEncryption.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, dataEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_12BB(
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration dataEncryption) {
		if (exprRetPerformEncryption.getArguments().contains(dataEncryption)) {
			return new Object[] { exprRetPerformEncryption, dataEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_13BB(
			JavaStatement statRetPerformEncryption, JavaName exprKeyName) {
		if (exprKeyName.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, exprKeyName };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_14BB(
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration keyEncryption) {
		if (keyEncryption.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, keyEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_15BB(
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption) {
		if (exprRetPerformEncryption.getArguments().contains(keyEncryption)) {
			return new Object[] { exprRetPerformEncryption, keyEncryption };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_16BB(
			JavaStatement statRetPerformEncryption, JavaLiteral exprNameModePadding) {
		if (exprNameModePadding.equals(statRetPerformEncryption.getExpr())) {
			return new Object[] { statRetPerformEncryption, exprNameModePadding };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_blackBBBBBBBBBBB(
			JavaPackage javaPackage, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaVariableDeclaration dataEncryption, JavaMethodInvocation exprRetPerformEncryption, JavaName exprKeyName,
			JavaOpaqueMethod methodPerformEncryption, JavaWorkflowMethod methodEncryption,
			JavaVariableDeclaration keyEncryption, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu) {
		if (!exprDataName.equals(exprKeyName)) {
			if (!dataEncryption.equals(keyEncryption)) {
				if (exprRetPerformEncryption.getArguments().contains(exprDataName)) {
					if (methodEncryption.getParams().contains(dataEncryption)) {
						if (exprRetPerformEncryption.getArguments().contains(exprKeyName)) {
							if (methodEncryption.getParams().contains(keyEncryption)) {
								if (exprRetPerformEncryption.equals(statRetPerformEncryption.getExpr())) {
									if (javaPackage.getCunits().contains(jcu)) {
										if (exprRetPerformEncryption.getArguments().contains(exprNameModePadding)) {
											if (jcu.getMethods().contains(methodEncryption)) {
												if (jcu.getMethods().contains(methodPerformEncryption)) {
													if (methodEncryption.getStatements()
															.contains(statRetPerformEncryption)) {
														if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_0BB(
																javaPackage, jcu) == null) {
															if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_1BB(
																	exprDataName, statRetPerformEncryption) == null) {
																if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_2BB(
																		dataEncryption,
																		statRetPerformEncryption) == null) {
																	if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_3BB(
																			dataEncryption,
																			exprRetPerformEncryption) == null) {
																		if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_4B(
																				exprRetPerformEncryption) == null) {
																			if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_5BB(
																					exprKeyName,
																					statRetPerformEncryption) == null) {
																				if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_6BB(
																						methodEncryption,
																						statRetPerformEncryption) == null) {
																					if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_7BB(
																							keyEncryption,
																							statRetPerformEncryption) == null) {
																						if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_8BB(
																								keyEncryption,
																								exprRetPerformEncryption) == null) {
																							if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_9BB(
																									exprNameModePadding,
																									statRetPerformEncryption) == null) {
																								if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_10BB(
																										statRetPerformEncryption,
																										exprDataName) == null) {
																									if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_11BB(
																											statRetPerformEncryption,
																											dataEncryption) == null) {
																										if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_12BB(
																												exprRetPerformEncryption,
																												dataEncryption) == null) {
																											if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_13BB(
																													statRetPerformEncryption,
																													exprKeyName) == null) {
																												if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_14BB(
																														statRetPerformEncryption,
																														keyEncryption) == null) {
																													if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_15BB(
																															exprRetPerformEncryption,
																															keyEncryption) == null) {
																														if (pattern_SymmetricEncryptionTask_28_1_matchtggpattern_black_nac_16BB(
																																statRetPerformEncryption,
																																exprNameModePadding) == null) {
																															return new Object[] {
																																	javaPackage,
																																	exprDataName,
																																	statRetPerformEncryption,
																																	dataEncryption,
																																	exprRetPerformEncryption,
																																	exprKeyName,
																																	methodPerformEncryption,
																																	methodEncryption,
																																	keyEncryption,
																																	exprNameModePadding,
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
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_28_1_matchtggpattern_greenBBBBB(
			JavaStatement statRetPerformEncryption, JavaVariableDeclaration dataEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaOpaqueMethod methodPerformEncryption,
			JavaVariableDeclaration keyEncryption) {
		boolean statRetPerformEncryption_return_prime = Boolean.valueOf(true);
		int dataEncryption_index_prime = Integer.valueOf(0);
		String dataEncryption_name_prime = "data";
		String dataEncryption_type_prime = "byte[]";
		String exprRetPerformEncryption_name_prime = "performEncryption";
		String methodPerformEncryption_type_prime = "byte[] ";
		String methodPerformEncryption_name_prime = "performEncryption";
		String keyEncryption_type_prime = "SecretKey";
		int keyEncryption_index_prime = Integer.valueOf(1);
		String keyEncryption_name_prime = "key";
		statRetPerformEncryption.setReturn(Boolean.valueOf(statRetPerformEncryption_return_prime));
		dataEncryption.setIndex(Integer.valueOf(dataEncryption_index_prime));
		dataEncryption.setName(dataEncryption_name_prime);
		dataEncryption.setType(dataEncryption_type_prime);
		exprRetPerformEncryption.setName(exprRetPerformEncryption_name_prime);
		methodPerformEncryption.setType(methodPerformEncryption_type_prime);
		methodPerformEncryption.setName(methodPerformEncryption_name_prime);
		keyEncryption.setType(keyEncryption_type_prime);
		keyEncryption.setIndex(Integer.valueOf(keyEncryption_index_prime));
		keyEncryption.setName(keyEncryption_name_prime);
		return new Object[] { statRetPerformEncryption, dataEncryption, exprRetPerformEncryption,
				methodPerformEncryption, keyEncryption };
	}

	public static final boolean pattern_SymmetricEncryptionTask_28_2_expressionF() {
		boolean _result = Boolean.valueOf(true);
		return _result;
	}

	public static final boolean pattern_SymmetricEncryptionTask_28_3_expressionF() {
		boolean _result = Boolean.valueOf(false);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_1_createresult_blackB(
			SymmetricEncryptionTask _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_1_createresult_greenFF() {
		IsApplicableMatch isApplicableMatch = RuntimeFactory.eINSTANCE.createIsApplicableMatch();
		ModelgeneratorRuleResult ruleResult = RuntimeFactory.eINSTANCE.createModelgeneratorRuleResult();
		boolean ruleResult_success_prime = Boolean.valueOf(false);
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		return new Object[] { isApplicableMatch, ruleResult };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_2_isapplicablecore_blackB(
			SymmetricEncryptionTask _this) {
		return new Object[] { _this };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_3_solveCSP_bindingFBBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		CSP _localVariable_0 = _this.generateModel_solveCsp_BWD(isApplicableMatch, ruleResult);
		CSP csp = _localVariable_0;
		if (csp != null) {
			return new Object[] { csp, _this, isApplicableMatch, ruleResult };
		}
		return null;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_3_solveCSP_blackB(CSP csp) {
		return new Object[] { csp };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_3_solveCSP_bindingAndBlackFBBB(
			SymmetricEncryptionTask _this, IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult) {
		Object[] result_pattern_SymmetricEncryptionTask_29_3_solveCSP_binding = pattern_SymmetricEncryptionTask_29_3_solveCSP_bindingFBBB(
				_this, isApplicableMatch, ruleResult);
		if (result_pattern_SymmetricEncryptionTask_29_3_solveCSP_binding != null) {
			CSP csp = (CSP) result_pattern_SymmetricEncryptionTask_29_3_solveCSP_binding[0];

			Object[] result_pattern_SymmetricEncryptionTask_29_3_solveCSP_black = pattern_SymmetricEncryptionTask_29_3_solveCSP_blackB(
					csp);
			if (result_pattern_SymmetricEncryptionTask_29_3_solveCSP_black != null) {

				return new Object[] { csp, _this, isApplicableMatch, ruleResult };
			}
		}
		return null;
	}

	public static final boolean pattern_SymmetricEncryptionTask_29_4_checkCSP_expressionFBB(
			SymmetricEncryptionTask _this, CSP csp) {
		boolean _localVariable_0 = _this.generateModel_checkCsp_BWD(csp);
		boolean _result = Boolean.valueOf(_localVariable_0);
		return _result;
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_6_perform_blackB(
			ModelgeneratorRuleResult ruleResult) {
		return new Object[] { ruleResult };
	}

	public static final Object[] pattern_SymmetricEncryptionTask_29_6_perform_greenFFFFFFFFFFFFFFFBB(
			ModelgeneratorRuleResult ruleResult, CSP csp) {
		JavaPackage javaPackage = SimpleJavaFactory.eINSTANCE.createJavaPackage();
		SymmetricBlockCipher sbc = CryptoAPIConfigFactory.eINSTANCE.createSymmetricBlockCipher();
		JavaName exprDataName = SimpleJavaFactory.eINSTANCE.createJavaName();
		JavaStatement statRetPerformEncryption = SimpleJavaFactory.eINSTANCE.createJavaStatement();
		JavaVariableDeclaration dataEncryption = SimpleJavaFactory.eINSTANCE.createJavaVariableDeclaration();
		JavaMethodInvocation exprRetPerformEncryption = SimpleJavaFactory.eINSTANCE.createJavaMethodInvocation();
		JavaName exprKeyName = SimpleJavaFactory.eINSTANCE.createJavaName();
		Task task = CryptoAPIConfigFactory.eINSTANCE.createTask();
		JavaOpaqueMethod methodPerformEncryption = SimpleJavaFactory.eINSTANCE.createJavaOpaqueMethod();
		JavaWorkflowMethod methodEncryption = SimpleJavaFactory.eINSTANCE.createJavaWorkflowMethod();
		TaskToJavaPackage t2c = CryptoConfigToJavaFactory.eINSTANCE.createTaskToJavaPackage();
		JavaVariableDeclaration keyEncryption = SimpleJavaFactory.eINSTANCE.createJavaVariableDeclaration();
		JavaLiteral exprNameModePadding = SimpleJavaFactory.eINSTANCE.createJavaLiteral();
		JavaCompilationUnit jcu = SimpleJavaFactory.eINSTANCE.createJavaCompilationUnit();
		SymmetricBlockCipherToJcu sbc2Jcu = CryptoConfigToJavaFactory.eINSTANCE.createSymmetricBlockCipherToJcu();
		Object _localVariable_0 = csp.getValue("javaPackage", "name");
		Object _localVariable_1 = csp.getValue("sbc", "name");
		Object _localVariable_2 = csp.getValue("sbc", "mode");
		Object _localVariable_3 = csp.getValue("sbc", "padding");
		Object _localVariable_4 = csp.getValue("exprDataName", "identifier");
		Object _localVariable_5 = csp.getValue("exprDataName", "index");
		boolean statRetPerformEncryption_return_prime = Boolean.valueOf(true);
		int dataEncryption_index_prime = Integer.valueOf(0);
		String dataEncryption_name_prime = "data";
		String dataEncryption_type_prime = "byte[]";
		String exprRetPerformEncryption_name_prime = "performEncryption";
		Object _localVariable_6 = csp.getValue("exprKeyName", "identifier");
		Object _localVariable_7 = csp.getValue("exprKeyName", "index");
		String task_description_prime = "SymmetricEncryption";
		Object _localVariable_8 = csp.getValue("task", "package");
		String methodPerformEncryption_type_prime = "byte[] ";
		String methodPerformEncryption_name_prime = "performEncryption";
		Object _localVariable_9 = csp.getValue("methodPerformEncryption", "modifier");
		Object _localVariable_10 = csp.getValue("methodPerformEncryption", "parameters");
		Object _localVariable_11 = csp.getValue("methodPerformEncryption", "index");
		Object _localVariable_12 = csp.getValue("methodPerformEncryption", "throws");
		Object _localVariable_13 = csp.getValue("methodPerformEncryption", "body");
		Object _localVariable_14 = csp.getValue("methodEncryption", "throws");
		Object _localVariable_15 = csp.getValue("methodEncryption", "type");
		Object _localVariable_16 = csp.getValue("methodEncryption", "modifier");
		Object _localVariable_17 = csp.getValue("methodEncryption", "index");
		Object _localVariable_18 = csp.getValue("methodEncryption", "name");
		String keyEncryption_type_prime = "SecretKey";
		int keyEncryption_index_prime = Integer.valueOf(1);
		String keyEncryption_name_prime = "key";
		Object _localVariable_19 = csp.getValue("exprNameModePadding", "index");
		Object _localVariable_20 = csp.getValue("exprNameModePadding", "value");
		Object _localVariable_21 = csp.getValue("jcu", "name");
		boolean ruleResult_success_prime = Boolean.valueOf(true);
		int _localVariable_22 = ruleResult.getIncrementedPerformCount();
		ruleResult.getTargetObjects().add(javaPackage);
		ruleResult.getSourceObjects().add(sbc);
		ruleResult.getTargetObjects().add(exprDataName);
		ruleResult.getTargetObjects().add(statRetPerformEncryption);
		ruleResult.getTargetObjects().add(dataEncryption);
		exprRetPerformEncryption.getArguments().add(exprDataName);
		statRetPerformEncryption.setExpr(exprRetPerformEncryption);
		ruleResult.getTargetObjects().add(exprRetPerformEncryption);
		exprRetPerformEncryption.getArguments().add(exprKeyName);
		ruleResult.getTargetObjects().add(exprKeyName);
		task.getAlgorithms().add(sbc);
		ruleResult.getSourceObjects().add(task);
		ruleResult.getTargetObjects().add(methodPerformEncryption);
		methodEncryption.getParams().add(dataEncryption);
		methodEncryption.getStatements().add(statRetPerformEncryption);
		ruleResult.getTargetObjects().add(methodEncryption);
		t2c.setTarget(javaPackage);
		t2c.setSource(task);
		ruleResult.getCorrObjects().add(t2c);
		methodEncryption.getParams().add(keyEncryption);
		ruleResult.getTargetObjects().add(keyEncryption);
		exprRetPerformEncryption.getArguments().add(exprNameModePadding);
		ruleResult.getTargetObjects().add(exprNameModePadding);
		javaPackage.getCunits().add(jcu);
		jcu.getMethods().add(methodEncryption);
		jcu.getMethods().add(methodPerformEncryption);
		ruleResult.getTargetObjects().add(jcu);
		sbc2Jcu.setTarget(jcu);
		sbc2Jcu.setSource(sbc);
		ruleResult.getCorrObjects().add(sbc2Jcu);
		String javaPackage_name_prime = (String) _localVariable_0;
		String sbc_name_prime = (String) _localVariable_1;
		String sbc_mode_prime = (String) _localVariable_2;
		String sbc_padding_prime = (String) _localVariable_3;
		String exprDataName_identifier_prime = (String) _localVariable_4;
		int exprDataName_index_prime = (int) _localVariable_5;
		statRetPerformEncryption.setReturn(Boolean.valueOf(statRetPerformEncryption_return_prime));
		dataEncryption.setIndex(Integer.valueOf(dataEncryption_index_prime));
		dataEncryption.setName(dataEncryption_name_prime);
		dataEncryption.setType(dataEncryption_type_prime);
		exprRetPerformEncryption.setName(exprRetPerformEncryption_name_prime);
		String exprKeyName_identifier_prime = (String) _localVariable_6;
		int exprKeyName_index_prime = (int) _localVariable_7;
		task.setDescription(task_description_prime);
		String task_package_prime = (String) _localVariable_8;
		methodPerformEncryption.setType(methodPerformEncryption_type_prime);
		methodPerformEncryption.setName(methodPerformEncryption_name_prime);
		String methodPerformEncryption_modifier_prime = (String) _localVariable_9;
		String methodPerformEncryption_parameters_prime = (String) _localVariable_10;
		int methodPerformEncryption_index_prime = (int) _localVariable_11;
		String methodPerformEncryption_throws_prime = (String) _localVariable_12;
		String methodPerformEncryption_body_prime = (String) _localVariable_13;
		String methodEncryption_throws_prime = (String) _localVariable_14;
		String methodEncryption_type_prime = (String) _localVariable_15;
		String methodEncryption_modifier_prime = (String) _localVariable_16;
		int methodEncryption_index_prime = (int) _localVariable_17;
		String methodEncryption_name_prime = (String) _localVariable_18;
		keyEncryption.setType(keyEncryption_type_prime);
		keyEncryption.setIndex(Integer.valueOf(keyEncryption_index_prime));
		keyEncryption.setName(keyEncryption_name_prime);
		int exprNameModePadding_index_prime = (int) _localVariable_19;
		String exprNameModePadding_value_prime = (String) _localVariable_20;
		String jcu_name_prime = (String) _localVariable_21;
		ruleResult.setSuccess(Boolean.valueOf(ruleResult_success_prime));
		int ruleResult_performCount_prime = Integer.valueOf(_localVariable_22);
		javaPackage.setName(javaPackage_name_prime);
		sbc.setName(sbc_name_prime);
		sbc.setMode(sbc_mode_prime);
		sbc.setPadding(sbc_padding_prime);
		exprDataName.setIdentifier(exprDataName_identifier_prime);
		exprDataName.setIndex(Integer.valueOf(exprDataName_index_prime));
		exprKeyName.setIdentifier(exprKeyName_identifier_prime);
		exprKeyName.setIndex(Integer.valueOf(exprKeyName_index_prime));
		task.setPackage(task_package_prime);
		methodPerformEncryption.setModifier(methodPerformEncryption_modifier_prime);
		methodPerformEncryption.setParameters(methodPerformEncryption_parameters_prime);
		methodPerformEncryption.setIndex(Integer.valueOf(methodPerformEncryption_index_prime));
		methodPerformEncryption.setThrows(methodPerformEncryption_throws_prime);
		methodPerformEncryption.setBody(methodPerformEncryption_body_prime);
		methodEncryption.setThrows(methodEncryption_throws_prime);
		methodEncryption.setType(methodEncryption_type_prime);
		methodEncryption.setModifier(methodEncryption_modifier_prime);
		methodEncryption.setIndex(Integer.valueOf(methodEncryption_index_prime));
		methodEncryption.setName(methodEncryption_name_prime);
		exprNameModePadding.setIndex(Integer.valueOf(exprNameModePadding_index_prime));
		exprNameModePadding.setValue(exprNameModePadding_value_prime);
		jcu.setName(jcu_name_prime);
		ruleResult.setPerformCount(Integer.valueOf(ruleResult_performCount_prime));
		return new Object[] { javaPackage, sbc, exprDataName, statRetPerformEncryption, dataEncryption,
				exprRetPerformEncryption, exprKeyName, task, methodPerformEncryption, methodEncryption, t2c,
				keyEncryption, exprNameModePadding, jcu, sbc2Jcu, ruleResult, csp };
	}

	public static final ModelgeneratorRuleResult pattern_SymmetricEncryptionTask_29_7_expressionFB(
			ModelgeneratorRuleResult ruleResult) {
		ModelgeneratorRuleResult _result = ruleResult;
		return _result;
	}

	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} //SymmetricEncryptionTaskImpl
