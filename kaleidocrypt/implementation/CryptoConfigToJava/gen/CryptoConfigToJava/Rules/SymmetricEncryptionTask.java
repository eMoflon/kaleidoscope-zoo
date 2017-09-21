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
	boolean isAppropriate_FWD(Match match, Task task, SymmetricBlockCipher sbc);

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
	void registerObjectsToMatch_FWD(Match match, Task task, SymmetricBlockCipher sbc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, Task task, SymmetricBlockCipher sbc);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, Task task, SymmetricBlockCipher sbc);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject task, EObject dataEncryption, EObject t2c,
			EObject sbc, EObject methodEncryption, EObject exprKeyName, EObject exprDataName,
			EObject statRetPerformEncryption, EObject methodPerformEncryption, EObject sbc2Jcu,
			EObject exprRetPerformEncryption, EObject keyEncryption, EObject javaPackage, EObject exprNameModePadding,
			EObject jcu);

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
	boolean isAppropriate_BWD(Match match, JavaVariableDeclaration dataEncryption, JavaWorkflowMethod methodEncryption,
			JavaName exprKeyName, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaOpaqueMethod methodPerformEncryption, JavaMethodInvocation exprRetPerformEncryption,
			JavaVariableDeclaration keyEncryption, JavaPackage javaPackage, JavaLiteral exprNameModePadding,
			JavaCompilationUnit jcu);

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
	void registerObjectsToMatch_BWD(Match match, JavaVariableDeclaration dataEncryption,
			JavaWorkflowMethod methodEncryption, JavaName exprKeyName, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaOpaqueMethod methodPerformEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption,
			JavaPackage javaPackage, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, JavaVariableDeclaration dataEncryption,
			JavaWorkflowMethod methodEncryption, JavaName exprKeyName, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaOpaqueMethod methodPerformEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption,
			JavaPackage javaPackage, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaVariableDeclaration dataEncryption,
			JavaWorkflowMethod methodEncryption, JavaName exprKeyName, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaOpaqueMethod methodPerformEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption,
			JavaPackage javaPackage, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu);

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
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject task, EObject dataEncryption, EObject t2c,
			EObject sbc, EObject methodEncryption, EObject exprKeyName, EObject exprDataName,
			EObject statRetPerformEncryption, EObject methodPerformEncryption, EObject sbc2Jcu,
			EObject exprRetPerformEncryption, EObject keyEncryption, EObject javaPackage, EObject exprNameModePadding,
			EObject jcu);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_5(EMoflonEdge _edge_algorithms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_5(EMoflonEdge _edge_expr);

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
	CSP isApplicable_solveCsp_CC(Task task, JavaVariableDeclaration dataEncryption, SymmetricBlockCipher sbc,
			JavaWorkflowMethod methodEncryption, JavaName exprKeyName, JavaName exprDataName,
			JavaStatement statRetPerformEncryption, JavaOpaqueMethod methodPerformEncryption,
			JavaMethodInvocation exprRetPerformEncryption, JavaVariableDeclaration keyEncryption,
			JavaPackage javaPackage, JavaLiteral exprNameModePadding, JavaCompilationUnit jcu, Match sourceMatch,
			Match targetMatch);

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
	boolean checkDEC_FWD(Task task, SymmetricBlockCipher sbc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(JavaVariableDeclaration dataEncryption, JavaWorkflowMethod methodEncryption,
			JavaName exprKeyName, JavaName exprDataName, JavaStatement statRetPerformEncryption,
			JavaOpaqueMethod methodPerformEncryption, JavaMethodInvocation exprRetPerformEncryption,
			JavaVariableDeclaration keyEncryption, JavaPackage javaPackage, JavaLiteral exprNameModePadding,
			JavaCompilationUnit jcu);

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
