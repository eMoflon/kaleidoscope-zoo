/**
 */
package CryptoConfigToJava.util;

import CryptoConfigToJava.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.moflon.tgg.runtime.AbstractCorrespondence;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CryptoConfigToJava.CryptoConfigToJavaPackage
 * @generated
 */
public class CryptoConfigToJavaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CryptoConfigToJavaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoConfigToJavaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CryptoConfigToJavaPackage.eINSTANCE;
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
	protected CryptoConfigToJavaSwitch<Adapter> modelSwitch = new CryptoConfigToJavaSwitch<Adapter>() {
		@Override
		public Adapter caseAlgorithmToJcu(AlgorithmToJcu object) {
			return createAlgorithmToJcuAdapter();
		}

		@Override
		public Adapter caseTaskToJavaCompilationUnit(TaskToJavaCompilationUnit object) {
			return createTaskToJavaCompilationUnitAdapter();
		}

		@Override
		public Adapter caseKeyDerivationAlgorithmToJcu(KeyDerivationAlgorithmToJcu object) {
			return createKeyDerivationAlgorithmToJcuAdapter();
		}

		@Override
		public Adapter caseImportToImport(ImportToImport object) {
			return createImportToImportAdapter();
		}

		@Override
		public Adapter caseTaskToJavaPackage(TaskToJavaPackage object) {
			return createTaskToJavaPackageAdapter();
		}

		@Override
		public Adapter caseSymmetricBlockCipherToJcu(SymmetricBlockCipherToJcu object) {
			return createSymmetricBlockCipherToJcuAdapter();
		}

		@Override
		public Adapter caseKeyDerivationAlgorithmToMethod(KeyDerivationAlgorithmToMethod object) {
			return createKeyDerivationAlgorithmToMethodAdapter();
		}

		@Override
		public Adapter caseAlgorithmToJavaCompilationUnit(AlgorithmToJavaCompilationUnit object) {
			return createAlgorithmToJavaCompilationUnitAdapter();
		}

		@Override
		public Adapter caseSymmetricBlockCipherToMethod(SymmetricBlockCipherToMethod object) {
			return createSymmetricBlockCipherToMethodAdapter();
		}

		@Override
		public Adapter caseAbstractCorrespondence(AbstractCorrespondence object) {
			return createAbstractCorrespondenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.AlgorithmToJcu <em>Algorithm To Jcu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.AlgorithmToJcu
	 * @generated
	 */
	public Adapter createAlgorithmToJcuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.TaskToJavaCompilationUnit <em>Task To Java Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.TaskToJavaCompilationUnit
	 * @generated
	 */
	public Adapter createTaskToJavaCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.KeyDerivationAlgorithmToJcu <em>Key Derivation Algorithm To Jcu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.KeyDerivationAlgorithmToJcu
	 * @generated
	 */
	public Adapter createKeyDerivationAlgorithmToJcuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.ImportToImport <em>Import To Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.ImportToImport
	 * @generated
	 */
	public Adapter createImportToImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.TaskToJavaPackage <em>Task To Java Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.TaskToJavaPackage
	 * @generated
	 */
	public Adapter createTaskToJavaPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.SymmetricBlockCipherToJcu <em>Symmetric Block Cipher To Jcu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.SymmetricBlockCipherToJcu
	 * @generated
	 */
	public Adapter createSymmetricBlockCipherToJcuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.KeyDerivationAlgorithmToMethod <em>Key Derivation Algorithm To Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.KeyDerivationAlgorithmToMethod
	 * @generated
	 */
	public Adapter createKeyDerivationAlgorithmToMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.AlgorithmToJavaCompilationUnit <em>Algorithm To Java Compilation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.AlgorithmToJavaCompilationUnit
	 * @generated
	 */
	public Adapter createAlgorithmToJavaCompilationUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CryptoConfigToJava.SymmetricBlockCipherToMethod <em>Symmetric Block Cipher To Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CryptoConfigToJava.SymmetricBlockCipherToMethod
	 * @generated
	 */
	public Adapter createSymmetricBlockCipherToMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.moflon.tgg.runtime.AbstractCorrespondence <em>Abstract Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.moflon.tgg.runtime.AbstractCorrespondence
	 * @generated
	 */
	public Adapter createAbstractCorrespondenceAdapter() {
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

} //CryptoConfigToJavaAdapterFactory
