/**
 */
package CryptoConfigToJava.util;

import CryptoConfigToJava.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.moflon.tgg.runtime.AbstractCorrespondence;

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
 * @see CryptoConfigToJava.CryptoConfigToJavaPackage
 * @generated
 */
public class CryptoConfigToJavaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CryptoConfigToJavaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoConfigToJavaSwitch() {
		if (modelPackage == null) {
			modelPackage = CryptoConfigToJavaPackage.eINSTANCE;
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
		case CryptoConfigToJavaPackage.IMPORT_TO_IMPORT: {
			ImportToImport importToImport = (ImportToImport) theEObject;
			T result = caseImportToImport(importToImport);
			if (result == null)
				result = caseAbstractCorrespondence(importToImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_METHOD: {
			KeyDerivationAlgorithmToMethod keyDerivationAlgorithmToMethod = (KeyDerivationAlgorithmToMethod) theEObject;
			T result = caseKeyDerivationAlgorithmToMethod(keyDerivationAlgorithmToMethod);
			if (result == null)
				result = caseAbstractCorrespondence(keyDerivationAlgorithmToMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.TASK_TO_JAVA_PACKAGE: {
			TaskToJavaPackage taskToJavaPackage = (TaskToJavaPackage) theEObject;
			T result = caseTaskToJavaPackage(taskToJavaPackage);
			if (result == null)
				result = caseAbstractCorrespondence(taskToJavaPackage);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.KEY_DERIVATION_ALGORITHM_TO_JCU: {
			KeyDerivationAlgorithmToJcu keyDerivationAlgorithmToJcu = (KeyDerivationAlgorithmToJcu) theEObject;
			T result = caseKeyDerivationAlgorithmToJcu(keyDerivationAlgorithmToJcu);
			if (result == null)
				result = caseAbstractCorrespondence(keyDerivationAlgorithmToJcu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.TASK_TO_JAVA_COMPILATION_UNIT: {
			TaskToJavaCompilationUnit taskToJavaCompilationUnit = (TaskToJavaCompilationUnit) theEObject;
			T result = caseTaskToJavaCompilationUnit(taskToJavaCompilationUnit);
			if (result == null)
				result = caseAbstractCorrespondence(taskToJavaCompilationUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.ALGORITHM_TO_JCU: {
			AlgorithmToJcu algorithmToJcu = (AlgorithmToJcu) theEObject;
			T result = caseAlgorithmToJcu(algorithmToJcu);
			if (result == null)
				result = caseAbstractCorrespondence(algorithmToJcu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_METHOD: {
			SymmetricBlockCipherToMethod symmetricBlockCipherToMethod = (SymmetricBlockCipherToMethod) theEObject;
			T result = caseSymmetricBlockCipherToMethod(symmetricBlockCipherToMethod);
			if (result == null)
				result = caseAbstractCorrespondence(symmetricBlockCipherToMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.SYMMETRIC_BLOCK_CIPHER_TO_JCU: {
			SymmetricBlockCipherToJcu symmetricBlockCipherToJcu = (SymmetricBlockCipherToJcu) theEObject;
			T result = caseSymmetricBlockCipherToJcu(symmetricBlockCipherToJcu);
			if (result == null)
				result = caseAbstractCorrespondence(symmetricBlockCipherToJcu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CryptoConfigToJavaPackage.ALGORITHM_TO_JAVA_COMPILATION_UNIT: {
			AlgorithmToJavaCompilationUnit algorithmToJavaCompilationUnit = (AlgorithmToJavaCompilationUnit) theEObject;
			T result = caseAlgorithmToJavaCompilationUnit(algorithmToJavaCompilationUnit);
			if (result == null)
				result = caseAbstractCorrespondence(algorithmToJavaCompilationUnit);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import To Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import To Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportToImport(ImportToImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Derivation Algorithm To Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Derivation Algorithm To Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyDerivationAlgorithmToMethod(KeyDerivationAlgorithmToMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task To Java Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task To Java Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskToJavaPackage(TaskToJavaPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Derivation Algorithm To Jcu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Derivation Algorithm To Jcu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyDerivationAlgorithmToJcu(KeyDerivationAlgorithmToJcu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task To Java Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task To Java Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskToJavaCompilationUnit(TaskToJavaCompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm To Jcu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm To Jcu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmToJcu(AlgorithmToJcu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Block Cipher To Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Block Cipher To Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricBlockCipherToMethod(SymmetricBlockCipherToMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symmetric Block Cipher To Jcu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symmetric Block Cipher To Jcu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymmetricBlockCipherToJcu(SymmetricBlockCipherToJcu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm To Java Compilation Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm To Java Compilation Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmToJavaCompilationUnit(AlgorithmToJavaCompilationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCorrespondence(AbstractCorrespondence object) {
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

} //CryptoConfigToJavaSwitch
