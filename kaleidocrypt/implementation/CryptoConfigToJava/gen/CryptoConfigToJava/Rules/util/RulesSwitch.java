/**
 */
package CryptoConfigToJava.Rules.util;

import CryptoConfigToJava.Rules.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CryptoConfigToJava.Rules.RulesPackage
 * @generated
 */
public class RulesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesSwitch() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RulesPackage.SECURE_PASSWORD_TASK: {
			SecurePasswordTask securePasswordTask = (SecurePasswordTask) theEObject;
			T result = caseSecurePasswordTask(securePasswordTask);
			if (result == null)
				result = caseAbstractRule(securePasswordTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PERFORM_GET_KEY_METHOD: {
			PerformGetKeyMethod performGetKeyMethod = (PerformGetKeyMethod) theEObject;
			T result = casePerformGetKeyMethod(performGetKeyMethod);
			if (result == null)
				result = caseAbstractRule(performGetKeyMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SYMMETRIC_ENCRYPTION_TASK: {
			SymmetricEncryptionTask symmetricEncryptionTask = (SymmetricEncryptionTask) theEObject;
			T result = caseSymmetricEncryptionTask(symmetricEncryptionTask);
			if (result == null)
				result = caseAbstractRule(symmetricEncryptionTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.SYMMETRIC_BLOCK_CIPHER_IMPORT_TO_IMPORT: {
			SymmetricBlockCipherImportToImport symmetricBlockCipherImportToImport = (SymmetricBlockCipherImportToImport) theEObject;
			T result = caseSymmetricBlockCipherImportToImport(symmetricBlockCipherImportToImport);
			if (result == null)
				result = caseAbstractRule(symmetricBlockCipherImportToImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IGNORE_METHOD_INVOCATION_ARGUMENT: {
			IgnoreMethodInvocationArgument ignoreMethodInvocationArgument = (IgnoreMethodInvocationArgument) theEObject;
			T result = caseIgnoreMethodInvocationArgument(ignoreMethodInvocationArgument);
			if (result == null)
				result = caseAbstractRule(ignoreMethodInvocationArgument);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IGNORE_OPAQUE_METHOD: {
			IgnoreOpaqueMethod ignoreOpaqueMethod = (IgnoreOpaqueMethod) theEObject;
			T result = caseIgnoreOpaqueMethod(ignoreOpaqueMethod);
			if (result == null)
				result = caseAbstractRule(ignoreOpaqueMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.KEY_DERIVATION_ALGORITHM_IMPORT_TO_IMPORT: {
			KeyDerivationAlgorithmImportToImport keyDerivationAlgorithmImportToImport = (KeyDerivationAlgorithmImportToImport) theEObject;
			T result = caseKeyDerivationAlgorithmImportToImport(keyDerivationAlgorithmImportToImport);
			if (result == null)
				result = caseAbstractRule(keyDerivationAlgorithmImportToImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.IGNORE_PARAMETER_RULE: {
			IgnoreParameterRule ignoreParameterRule = (IgnoreParameterRule) theEObject;
			T result = caseIgnoreParameterRule(ignoreParameterRule);
			if (result == null)
				result = caseAbstractRule(ignoreParameterRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RulesPackage.PASSWORD_BASED_ENCRYPTION: {
			PasswordBasedEncryption passwordBasedEncryption = (PasswordBasedEncryption) theEObject;
			T result = casePasswordBasedEncryption(passwordBasedEncryption);
			if (result == null)
				result = caseAbstractRule(passwordBasedEncryption);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secure Password Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secure Password Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurePasswordTask(SecurePasswordTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Get Key Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Get Key Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformGetKeyMethod(PerformGetKeyMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Encryption Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Encryption Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricEncryptionTask(SymmetricEncryptionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Block Cipher Import To Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Block Cipher Import To Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricBlockCipherImportToImport(SymmetricBlockCipherImportToImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Method Invocation Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Method Invocation Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreMethodInvocationArgument(IgnoreMethodInvocationArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Opaque Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Opaque Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreOpaqueMethod(IgnoreOpaqueMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Derivation Algorithm Import To Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Derivation Algorithm Import To Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyDerivationAlgorithmImportToImport(KeyDerivationAlgorithmImportToImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ignore Parameter Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ignore Parameter Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIgnoreParameterRule(IgnoreParameterRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Based Encryption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Based Encryption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordBasedEncryption(PasswordBasedEncryption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRule(AbstractRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RulesSwitch
