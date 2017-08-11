/**
 */
package KitchenToGridLanguage.impl;

import GridLanguage.GridLanguagePackage;

import KitchenLanguage.KitchenLanguagePackage;

import KitchenToGridLanguage.KitchenToGridLanguageFactory;
import KitchenToGridLanguage.KitchenToGridLanguagePackage;

import KitchenToGridLanguage.Rules.RulesPackage;

import KitchenToGridLanguage.Rules.impl.RulesPackageImpl;

import MocaTree.MocaTreePackage;

import SDMLanguage.SDMLanguagePackage;

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
public class KitchenToGridLanguagePackageImpl extends EPackageImpl implements KitchenToGridLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "KitchenToGridLanguage.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kitchenToGridCorrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socketToGroupCorrEClass = null;

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
	 * @see KitchenToGridLanguage.KitchenToGridLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KitchenToGridLanguagePackageImpl() {
		super(eNS_URI, KitchenToGridLanguageFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link KitchenToGridLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static KitchenToGridLanguagePackage init() {
		if (isInited)
			return (KitchenToGridLanguagePackage) EPackage.Registry.INSTANCE
					.getEPackage(KitchenToGridLanguagePackage.eNS_URI);

		// Obtain or create and register package
		KitchenToGridLanguagePackageImpl theKitchenToGridLanguagePackage = (KitchenToGridLanguagePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof KitchenToGridLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new KitchenToGridLanguagePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		GridLanguagePackage.eINSTANCE.eClass();
		KitchenLanguagePackage.eINSTANCE.eClass();
		LanguagePackage.eINSTANCE.eClass();
		SDMLanguagePackage.eINSTANCE.eClass();
		MocaTreePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		RulesPackageImpl theRulesPackage = (RulesPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(RulesPackage.eNS_URI) instanceof RulesPackageImpl
						? EPackage.Registry.INSTANCE.getEPackage(RulesPackage.eNS_URI)
						: RulesPackage.eINSTANCE);

		// Load packages
		theKitchenToGridLanguagePackage.loadPackage();

		// Fix loaded packages
		theKitchenToGridLanguagePackage.fixPackageContents();
		theRulesPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theKitchenToGridLanguagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KitchenToGridLanguagePackage.eNS_URI, theKitchenToGridLanguagePackage);
		return theKitchenToGridLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKitchenToGridCorr() {
		if (kitchenToGridCorrEClass == null) {
			kitchenToGridCorrEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(KitchenToGridLanguagePackage.eNS_URI).getEClassifiers().get(0);
		}
		return kitchenToGridCorrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKitchenToGridCorr_Source() {
		return (EReference) getKitchenToGridCorr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKitchenToGridCorr_Target() {
		return (EReference) getKitchenToGridCorr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocketToGroupCorr() {
		if (socketToGroupCorrEClass == null) {
			socketToGroupCorrEClass = (EClass) EPackage.Registry.INSTANCE
					.getEPackage(KitchenToGridLanguagePackage.eNS_URI).getEClassifiers().get(1);
		}
		return socketToGroupCorrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocketToGroupCorr_Source() {
		return (EReference) getSocketToGroupCorr().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocketToGroupCorr_Target() {
		return (EReference) getSocketToGroupCorr().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KitchenToGridLanguageFactory getKitchenToGridLanguageFactory() {
		return (KitchenToGridLanguageFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("KitchenToGridLanguage." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //KitchenToGridLanguagePackageImpl
