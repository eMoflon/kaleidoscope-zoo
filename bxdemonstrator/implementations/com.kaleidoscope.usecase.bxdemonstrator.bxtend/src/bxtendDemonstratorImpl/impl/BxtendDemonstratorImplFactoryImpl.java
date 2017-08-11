/**
 */
package bxtendDemonstratorImpl.impl;

import bxtendDemonstratorImpl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BxtendDemonstratorImplFactoryImpl extends EFactoryImpl implements BxtendDemonstratorImplFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BxtendDemonstratorImplFactory init() {
		try {
			BxtendDemonstratorImplFactory theBxtendDemonstratorImplFactory = (BxtendDemonstratorImplFactory)EPackage.Registry.INSTANCE.getEFactory(BxtendDemonstratorImplPackage.eNS_URI);
			if (theBxtendDemonstratorImplFactory != null) {
				return theBxtendDemonstratorImplFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BxtendDemonstratorImplFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BxtendDemonstratorImplFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BxtendDemonstratorImplPackage.TRANSFORMATION: return createTransformation();
			case BxtendDemonstratorImplPackage.CORR: return createCorr();
			case BxtendDemonstratorImplPackage.BASIC_ELEM: return createBasicElem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corr createCorr() {
		CorrImpl corr = new CorrImpl();
		return corr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicElem createBasicElem() {
		BasicElemImpl basicElem = new BasicElemImpl();
		return basicElem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BxtendDemonstratorImplPackage getBxtendDemonstratorImplPackage() {
		return (BxtendDemonstratorImplPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BxtendDemonstratorImplPackage getPackage() {
		return BxtendDemonstratorImplPackage.eINSTANCE;
	}

} //BxtendDemonstratorImplFactoryImpl
