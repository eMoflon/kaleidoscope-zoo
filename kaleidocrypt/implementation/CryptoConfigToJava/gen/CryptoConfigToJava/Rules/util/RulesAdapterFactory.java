/**
 */
package CryptoConfigToJava.Rules.util;

import CryptoConfigToJava.Rules.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractRule;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CryptoConfigToJava.Rules.RulesPackage
 * @generated
 */
public class RulesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RulesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RulesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RulesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RulesSwitch<Adapter> modelSwitch = new RulesSwitch<Adapter>() {
		@Override
		public Adapter caseIgnoreMethodInvocationArgument(IgnoreMethodInvocationArgument object) {
			return createIgnoreMethodInvocationArgumentAdapter();
		}

		@Override
		public Adapter caseKeyDerivationAlgorithmImportToImport(KeyDerivationAlgorithmImportToImport object) {
			return createKeyDerivationAlgorithmImportToImportAdapter();
		}

		@Override
		public Adapter caseIgnoreParameterRule(IgnoreParameterRule object) {
			return createIgnoreParameterRuleAdapter();
		}

		@Override
		public Adapter caseSecurePasswordTask(SecurePasswordTask object) {
			return createSecurePasswordTaskAdapter();
		}

		@Override
		public Adapter caseIgnoreOpaqueMethod(IgnoreOpaqueMethod object) {
			return createIgnoreOpaqueMethodAdapter();
		}

		@Override
		public Adapter casePerformGetKeyMethod(PerformGetKeyMethod object) {
			return createPerformGetKeyMethodAdapter();
		}

		@Override
		public Adapter caseSymmetricEncryptionTask(SymmetricEncryptionTask object) {
			return createSymmetricEncryptionTaskAdapter();
		}

		@Override
		public Adapter caseSymmetricBlockCipherImportToImport(SymmetricBlockCipherImportToImport object) {
			return createSymmetricBlockCipherImportToImportAdapter();
		}

		@Override
		public Adapter casePasswordBasedEncryption(PasswordBasedEncryption object) {
			return createPasswordBasedEncryptionAdapter();
		}

		@Override
		public Adapter caseAbstractRule(AbstractRule object) {
			return createAbstractRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument <em>Ignore Method Invocation Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.IgnoreMethodInvocationArgument
	 * @generated
	 */
	public Adapter createIgnoreMethodInvocationArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport <em>Key Derivation Algorithm Import To Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.KeyDerivationAlgorithmImportToImport
	 * @generated
	 */
	public Adapter createKeyDerivationAlgorithmImportToImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.IgnoreParameterRule <em>Ignore Parameter Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.IgnoreParameterRule
	 * @generated
	 */
	public Adapter createIgnoreParameterRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.SecurePasswordTask <em>Secure Password Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.SecurePasswordTask
	 * @generated
	 */
	public Adapter createSecurePasswordTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.IgnoreOpaqueMethod <em>Ignore Opaque Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.IgnoreOpaqueMethod
	 * @generated
	 */
	public Adapter createIgnoreOpaqueMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.PerformGetKeyMethod <em>Perform Get Key Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.PerformGetKeyMethod
	 * @generated
	 */
	public Adapter createPerformGetKeyMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.SymmetricEncryptionTask <em>Symmetric Encryption Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.SymmetricEncryptionTask
	 * @generated
	 */
	public Adapter createSymmetricEncryptionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport <em>Symmetric Block Cipher Import To Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.SymmetricBlockCipherImportToImport
	 * @generated
	 */
	public Adapter createSymmetricBlockCipherImportToImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.Rules.PasswordBasedEncryption <em>Password Based Encryption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.Rules.PasswordBasedEncryption
	 * @generated
	 */
	public Adapter createPasswordBasedEncryptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractRule <em>Abstract Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractRule
	 * @generated
	 */
	public Adapter createAbstractRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RulesAdapterFactory
