/**
 */
package CryptoConfigToJava.Rules;

import CryptoAPIConfig.SymmetricBlockCipher;
import CryptoAPIConfig.Task;

import SimpleJava.JavaCompilationUnit;
import SimpleJava.JavaLiteral;
import SimpleJava.JavaMethodInvocation;
import SimpleJava.JavaName;
import SimpleJava.JavaOpaqueMethod;
import SimpleJava.JavaPackage;
import SimpleJava.JavaStatement;
import SimpleJava.JavaVariableDeclaration;
import SimpleJava.JavaWorkflowMethod;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.language.csp.CSP;

import org.moflon.tgg.language.modelgenerator.RuleEntryContainer;

import org.moflon.tgg.runtime.AbstractRule;
import org.moflon.tgg.runtime.AttributeConstraintsRuleResult;
import org.moflon.tgg.runtime.EMoflonEdge;
import org.moflon.tgg.runtime.EObjectContainer;
import org.moflon.tgg.runtime.IsApplicableMatch;
import org.moflon.tgg.runtime.IsApplicableRuleResult;
import org.moflon.tgg.runtime.Match;
import org.moflon.tgg.runtime.ModelgeneratorRuleResult;
import org.moflon.tgg.runtime.PerformRuleResult;
import org.moflon.tgg.runtime.TripleMatch;
// <-- [user defined imports]
// [user defined imports] -->

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symmetric Encryption Task</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CryptoConfigToJava.Rules.RulesPackage#getSymmetricEncryptionTask()
 * @model
 * @generated
 */
public interface SymmetricEncryptionTask extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, SymmetricBlockCipher sbc, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_FWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_FWD(Match match, SymmetricBlockCipher sbc, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, SymmetricBlockCipher sbc, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, SymmetricBlockCipher sbc, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_FWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject exprNameModePadding,
			EObject exprRetPerformEncryption, EObject keyEncryption, EObject exprDataName, EObject javaPackage,
			EObject sbc2Jcu, EObject dataEncryption, EObject sbc, EObject exprKeyName, EObject methodEncryption,
			EObject t2c, EObject jcu, EObject methodPerformEncryption, EObject task, EObject statRetPerformEncryption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_FWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_BWD(Match match, JavaLiteral exprNameModePadding,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption, JavaName exprDataName,
			JavaPackage javaPackage, JavaVariableDeclaration dataEncryption, JavaName exprKeyName,
			JavaWorkflowMethod methodEncryption, JavaCompilationUnit jcu, JavaOpaqueMethod methodPerformEncryption,
			JavaStatement statRetPerformEncryption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PerformRuleResult perform_BWD(IsApplicableMatch isApplicableMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjectsToMatch_BWD(Match match, JavaLiteral exprNameModePadding,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption, JavaName exprDataName,
			JavaPackage javaPackage, JavaVariableDeclaration dataEncryption, JavaName exprKeyName,
			JavaWorkflowMethod methodEncryption, JavaCompilationUnit jcu, JavaOpaqueMethod methodPerformEncryption,
			JavaStatement statRetPerformEncryption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, JavaLiteral exprNameModePadding,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption, JavaName exprDataName,
			JavaPackage javaPackage, JavaVariableDeclaration dataEncryption, JavaName exprKeyName,
			JavaWorkflowMethod methodEncryption, JavaCompilationUnit jcu, JavaOpaqueMethod methodPerformEncryption,
			JavaStatement statRetPerformEncryption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaLiteral exprNameModePadding,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption, JavaName exprDataName,
			JavaPackage javaPackage, JavaVariableDeclaration dataEncryption, JavaName exprKeyName,
			JavaWorkflowMethod methodEncryption, JavaCompilationUnit jcu, JavaOpaqueMethod methodPerformEncryption,
			JavaStatement statRetPerformEncryption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_BWD(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject exprNameModePadding,
			EObject exprRetPerformEncryption, EObject keyEncryption, EObject exprDataName, EObject javaPackage,
			EObject sbc2Jcu, EObject dataEncryption, EObject sbc, EObject exprKeyName, EObject methodEncryption,
			EObject t2c, EObject jcu, EObject methodPerformEncryption, EObject task, EObject statRetPerformEncryption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkTypes_BWD(Match match);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_FWD_EMoflonEdge_6(EMoflonEdge _edge_algorithms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_6(EMoflonEdge _edge_arguments);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_FWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AttributeConstraintsRuleResult checkAttributes_BWD(TripleMatch __tripleMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	IsApplicableRuleResult isApplicable_CC(Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isApplicable_solveCsp_CC(JavaLiteral exprNameModePadding, JavaMethodInvocation exprRetPerformEncryption,
			JavaVariableDeclaration keyEncryption, JavaName exprDataName, JavaPackage javaPackage,
			JavaVariableDeclaration dataEncryption, SymmetricBlockCipher sbc, JavaName exprKeyName,
			JavaWorkflowMethod methodEncryption, JavaCompilationUnit jcu, JavaOpaqueMethod methodPerformEncryption,
			Task task, JavaStatement statRetPerformEncryption, Match sourceMatch, Match targetMatch);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isApplicable_checkCsp_CC(CSP csp);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_FWD(SymmetricBlockCipher sbc, Task task);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(JavaLiteral exprNameModePadding, JavaMethodInvocation exprRetPerformEncryption,
			JavaVariableDeclaration keyEncryption, JavaName exprDataName, JavaPackage javaPackage,
			JavaVariableDeclaration dataEncryption, JavaName exprKeyName, JavaWorkflowMethod methodEncryption,
			JavaCompilationUnit jcu, JavaOpaqueMethod methodPerformEncryption, JavaStatement statRetPerformEncryption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ModelgeneratorRuleResult generateModel(RuleEntryContainer ruleEntryContainer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP generateModel_solveCsp_BWD(IsApplicableMatch isApplicableMatch, ModelgeneratorRuleResult ruleResult);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean generateModel_checkCsp_BWD(CSP csp);
	// <-- [user code injected with eMoflon]

	// [user code injected with eMoflon] -->
} // SymmetricEncryptionTask
