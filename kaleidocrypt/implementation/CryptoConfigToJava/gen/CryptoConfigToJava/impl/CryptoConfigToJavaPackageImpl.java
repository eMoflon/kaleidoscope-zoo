/**
 */
package CryptoConfigToJava.impl;

import CryptoAPIConfig.CryptoAPIConfigPackage;

import CryptoConfigToJava.CryptoConfigToJavaFactory;
import CryptoConfigToJava.CryptoConfigToJavaPackage;

import CryptoConfigToJava.Rules.RulesPackage;

import CryptoConfigToJava.Rules.impl.RulesPackageImpl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

import SimpleJava.SimpleJavaPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.moflon.tgg.language.LanguagePackage;

import org.moflon.tgg.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CryptoConfigToJavaPackageImpl extends EPackageImpl implements CryptoConfigToJavaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "CryptoConfigToJava.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importToImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyDerivationAlgorithmToMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskToJavaPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyDerivationAlgorithmToJcuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskToJavaCompilationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmToJcuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricBlockCipherToMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symmetricBlockCipherToJcuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmToJavaCompilationUnitEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CryptoConfigToJava.CryptoConfigToJavaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CryptoConfigToJavaPackageImpl() {
		super(eNS_URI, CryptoConfigToJavaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CryptoConfigToJavaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CryptoConfigToJavaPackage init() {
		if (isInited)
			return (CryptoConfigToJavaPackage) EPackage.Registry.INSTANCE
					.getEPackage(CryptoConfigToJavaPackage.eNS_URI);

		// Obtain or create and register package
		CryptoConfigToJavaPackageImpl theCryptoConfigToJavaPackage = (CryptoConfigToJavaPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CryptoConfigToJavaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CryptoConfigToJavaPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		CryptoAPIConfigPackage.eINSTANCE.eClass();
		SimpleJavaPackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
						: RulesPackage.eINSTANCE);

		// Load packages
		theCryptoConfigToJavaPackage.loadPackage();

		// Fix loaded packages
		theCryptoConfigToJavaPackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theCryptoConfigToJavaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CryptoConfigToJavaPackage.eNS_URI, theCryptoConfigToJavaPackage);
		return theCryptoConfigToJavaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportToImport() {
		if (importToImportEClass == null) {
			importToImportEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CryptoConfigToJavaPackage.eNS_URI)
					.getEClassifiers().get(0);
		}
		return importToImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportToImport_Source() {
		return (EReference) getImportToImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportToImport_Target() {
		return (EReference) getImportToImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyDerivationAlgorithmToMethod() {
		if (keyDerivationAlgorithmToMethodEClass == null) {
			keyDerivationAlgorithmToMethodEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CryptoConfigToJavaPackage.eNS_URI).getEClassifiers().get(1);
		}
		return keyDerivationAlgorithmToMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyDerivationAlgorithmToMethod_Source() {
		return (EReference) getKeyDerivationAlgorithmToMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyDerivationAlgorithmToMethod_Target() {
		return (EReference) getKeyDerivationAlgorithmToMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskToJavaPackage() {
		if (taskToJavaPackageEClass == null) {
			taskToJavaPackageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CryptoConfigToJavaPackage.eNS_URI)
					.getEClassifiers().get(2);
		}
		return taskToJavaPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskToJavaPackage_Source() {
		return (EReference) getTaskToJavaPackage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskToJavaPackage_Target() {
		return (EReference) getTaskToJavaPackage().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyDerivationAlgorithmToJcu() {
		if (keyDerivationAlgorithmToJcuEClass == null) {
			keyDerivationAlgorithmToJcuEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CryptoConfigToJavaPackage.eNS_URI).getEClassifiers().get(3);
		}
		return keyDerivationAlgorithmToJcuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyDerivationAlgorithmToJcu_Source() {
		return (EReference) getKeyDerivationAlgorithmToJcu().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeyDerivationAlgorithmToJcu_Target() {
		return (EReference) getKeyDerivationAlgorithmToJcu().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaskToJavaCompilationUnit() {
		if (taskToJavaCompilationUnitEClass == null) {
			taskToJavaCompilationUnitEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CryptoConfigToJavaPackage.eNS_URI).getEClassifiers().get(4);
		}
		return taskToJavaCompilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskToJavaCompilationUnit_Source() {
		return (EReference) getTaskToJavaCompilationUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTaskToJavaCompilationUnit_Target() {
		return (EReference) getTaskToJavaCompilationUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithmToJcu() {
		if (algorithmToJcuEClass == null) {
			algorithmToJcuEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(CryptoConfigToJavaPackage.eNS_URI)
					.getEClassifiers().get(5);
		}
		return algorithmToJcuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmToJcu_Source() {
		return (EReference) getAlgorithmToJcu().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmToJcu_Target() {
		return (EReference) getAlgorithmToJcu().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricBlockCipherToMethod() {
		if (symmetricBlockCipherToMethodEClass == null) {
			symmetricBlockCipherToMethodEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CryptoConfigToJavaPackage.eNS_URI).getEClassifiers().get(6);
		}
		return symmetricBlockCipherToMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricBlockCipherToMethod_Source() {
		return (EReference) getSymmetricBlockCipherToMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricBlockCipherToMethod_Target() {
		return (EReference) getSymmetricBlockCipherToMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymmetricBlockCipherToJcu() {
		if (symmetricBlockCipherToJcuEClass == null) {
			symmetricBlockCipherToJcuEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CryptoConfigToJavaPackage.eNS_URI).getEClassifiers().get(7);
		}
		return symmetricBlockCipherToJcuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricBlockCipherToJcu_Source() {
		return (EReference) getSymmetricBlockCipherToJcu().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymmetricBlockCipherToJcu_Target() {
		return (EReference) getSymmetricBlockCipherToJcu().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithmToJavaCompilationUnit() {
		if (algorithmToJavaCompilationUnitEClass == null) {
			algorithmToJavaCompilationUnitEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(CryptoConfigToJavaPackage.eNS_URI).getEClassifiers().get(8);
		}
		return algorithmToJavaCompilationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmToJavaCompilationUnit_Source() {
		return (EReference) getAlgorithmToJavaCompilationUnit().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithmToJavaCompilationUnit_Target() {
		return (EReference) getAlgorithmToJavaCompilationUnit().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoConfigToJavaFactory getCryptoConfigToJavaFactory() {
		return (CryptoConfigToJavaFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("CryptoConfigToJava." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CryptoConfigToJavaPackageImpl
