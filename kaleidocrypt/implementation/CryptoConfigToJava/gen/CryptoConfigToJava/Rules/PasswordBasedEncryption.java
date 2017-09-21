/**
 */
package CryptoConfigToJava.Rules;

import CryptoAPIConfig.KeyDerivationAlgorithm;
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
 * A representation of the model object '<em><b>Password Based Encryption</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see CryptoConfigToJava.Rules.RulesPackage#getPasswordBasedEncryption()
 * @model
 * @generated
 */
public interface PasswordBasedEncryption extends EObject, AbstractRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean isAppropriate_FWD(Match match, KeyDerivationAlgorithm kda, Task task, SymmetricBlockCipher sbc);

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
	void registerObjectsToMatch_FWD(Match match, KeyDerivationAlgorithm kda, Task task, SymmetricBlockCipher sbc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_FWD(Match match, KeyDerivationAlgorithm kda, Task task, SymmetricBlockCipher sbc);

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
	CSP isApplicable_solveCsp_FWD(IsApplicableMatch isApplicableMatch, KeyDerivationAlgorithm kda, Task task,
			SymmetricBlockCipher sbc);

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
	void registerObjects_FWD(PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject javaPackage,
			EObject exprRetGetKey, EObject exprOutputSizeLiteral, EObject sbc2Jcu, EObject kdaJcu,
			EObject methodPerformEncryption, EObject sbcJcu, EObject keyEncryption, EObject dataEncryption,
			EObject methodGetKey, EObject t2c, EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject kda,
			EObject methodPerformGetKey, EObject statRetPerformEncryption, EObject exprKeyName,
			EObject exprNameModePadding, EObject methodEncryption, EObject task, EObject exprPwdName, EObject sbc,
			EObject exprDataName, EObject exprRetPerformEncryption, EObject statRetGetKey, EObject kda2Jcu);

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
	boolean isAppropriate_BWD(Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaMethodInvocation exprRetGetKey, JavaLiteral exprOutputSizeLiteral, JavaCompilationUnit kdaJcu,
			JavaOpaqueMethod methodPerformEncryption, JavaCompilationUnit sbcJcu, JavaVariableDeclaration keyEncryption,
			JavaVariableDeclaration dataEncryption, JavaWorkflowMethod methodGetKey, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaOpaqueMethod methodPerformGetKey,
			JavaStatement statRetPerformEncryption, JavaName exprKeyName, JavaLiteral exprNameModePadding,
			JavaWorkflowMethod methodEncryption, JavaName exprPwdName, JavaName exprDataName,
			JavaMethodInvocation exprRetPerformEncryption, JavaStatement statRetGetKey);

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
	void registerObjectsToMatch_BWD(Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaMethodInvocation exprRetGetKey, JavaLiteral exprOutputSizeLiteral, JavaCompilationUnit kdaJcu,
			JavaOpaqueMethod methodPerformEncryption, JavaCompilationUnit sbcJcu, JavaVariableDeclaration keyEncryption,
			JavaVariableDeclaration dataEncryption, JavaWorkflowMethod methodGetKey, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaOpaqueMethod methodPerformGetKey,
			JavaStatement statRetPerformEncryption, JavaName exprKeyName, JavaLiteral exprNameModePadding,
			JavaWorkflowMethod methodEncryption, JavaName exprPwdName, JavaName exprDataName,
			JavaMethodInvocation exprRetPerformEncryption, JavaStatement statRetGetKey);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CSP isAppropriate_solveCsp_BWD(Match match, JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaMethodInvocation exprRetGetKey, JavaLiteral exprOutputSizeLiteral, JavaCompilationUnit kdaJcu,
			JavaOpaqueMethod methodPerformEncryption, JavaCompilationUnit sbcJcu, JavaVariableDeclaration keyEncryption,
			JavaVariableDeclaration dataEncryption, JavaWorkflowMethod methodGetKey, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, JavaOpaqueMethod methodPerformGetKey,
			JavaStatement statRetPerformEncryption, JavaName exprKeyName, JavaLiteral exprNameModePadding,
			JavaWorkflowMethod methodEncryption, JavaName exprPwdName, JavaName exprDataName,
			JavaMethodInvocation exprRetPerformEncryption, JavaStatement statRetGetKey);

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
	CSP isApplicable_solveCsp_BWD(IsApplicableMatch isApplicableMatch, JavaLiteral exprIterationLiteral,
			JavaPackage javaPackage, JavaMethodInvocation exprRetGetKey, JavaLiteral exprOutputSizeLiteral,
			JavaCompilationUnit kdaJcu, JavaOpaqueMethod methodPerformEncryption, JavaCompilationUnit sbcJcu,
			JavaVariableDeclaration keyEncryption, JavaVariableDeclaration dataEncryption,
			JavaWorkflowMethod methodGetKey, JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration,
			JavaOpaqueMethod methodPerformGetKey, JavaStatement statRetPerformEncryption, JavaName exprKeyName,
			JavaLiteral exprNameModePadding, JavaWorkflowMethod methodEncryption, JavaName exprPwdName,
			JavaName exprDataName, JavaMethodInvocation exprRetPerformEncryption, JavaStatement statRetGetKey);

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
	void registerObjects_BWD(PerformRuleResult ruleresult, EObject exprIterationLiteral, EObject javaPackage,
			EObject exprRetGetKey, EObject exprOutputSizeLiteral, EObject sbc2Jcu, EObject kdaJcu,
			EObject methodPerformEncryption, EObject sbcJcu, EObject keyEncryption, EObject dataEncryption,
			EObject methodGetKey, EObject t2c, EObject exprAlgNameLiteral, EObject pwdDeclaration, EObject kda,
			EObject methodPerformGetKey, EObject statRetPerformEncryption, EObject exprKeyName,
			EObject exprNameModePadding, EObject methodEncryption, EObject task, EObject exprPwdName, EObject sbc,
			EObject exprDataName, EObject exprRetPerformEncryption, EObject statRetGetKey, EObject kda2Jcu);

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
	EObjectContainer isAppropriate_FWD_EMoflonEdge_9(EMoflonEdge _edge_algorithms);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObjectContainer isAppropriate_BWD_EMoflonEdge_12(EMoflonEdge _edge_arguments);

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
	CSP isApplicable_solveCsp_CC(JavaLiteral exprIterationLiteral, JavaPackage javaPackage,
			JavaMethodInvocation exprRetGetKey, JavaLiteral exprOutputSizeLiteral, JavaCompilationUnit kdaJcu,
			JavaOpaqueMethod methodPerformEncryption, JavaCompilationUnit sbcJcu, JavaVariableDeclaration keyEncryption,
			JavaVariableDeclaration dataEncryption, JavaWorkflowMethod methodGetKey, JavaLiteral exprAlgNameLiteral,
			JavaVariableDeclaration pwdDeclaration, KeyDerivationAlgorithm kda, JavaOpaqueMethod methodPerformGetKey,
			JavaStatement statRetPerformEncryption, JavaName exprKeyName, JavaLiteral exprNameModePadding,
			JavaWorkflowMethod methodEncryption, Task task, JavaName exprPwdName, SymmetricBlockCipher sbc,
			JavaName exprDataName, JavaMethodInvocation exprRetPerformEncryption, JavaStatement statRetGetKey,
			Match sourceMatch, Match targetMatch);

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
	boolean checkDEC_FWD(KeyDerivationAlgorithm kda, Task task, SymmetricBlockCipher sbc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean checkDEC_BWD(JavaLiteral exprIterationLiteral, JavaPackage javaPackage, JavaMethodInvocation exprRetGetKey,
			JavaLiteral exprOutputSizeLiteral, JavaCompilationUnit kdaJcu, JavaOpaqueMethod methodPerformEncryption,
			JavaCompilationUnit sbcJcu, JavaVariableDeclaration keyEncryption, JavaVariableDeclaration dataEncryption,
			JavaWorkflowMethod methodGetKey, JavaLiteral exprAlgNameLiteral, JavaVariableDeclaration pwdDeclaration,
			JavaOpaqueMethod methodPerformGetKey, JavaStatement statRetPerformEncryption, JavaName exprKeyName,
			JavaLiteral exprNameModePadding, JavaWorkflowMethod methodEncryption, JavaName exprPwdName,
			JavaName exprDataName, JavaMethodInvocation exprRetPerformEncryption, JavaStatement statRetGetKey);

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
} // PasswordBasedEncryption
