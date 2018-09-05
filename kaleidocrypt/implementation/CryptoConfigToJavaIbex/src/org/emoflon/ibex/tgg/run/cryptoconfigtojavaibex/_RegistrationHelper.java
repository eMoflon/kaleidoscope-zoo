package org.emoflon.ibex.tgg.run.cryptoconfigtojavaibex;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.cryptoconfigtojavaibex.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import CryptoAPIConfig.CryptoAPIConfigPackage;
import Simplejava.SimplejavaPackage;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements

		EPackage srcPack = CryptoAPIConfigPackage.eINSTANCE;
		EPackage trgPack = SimplejavaPackage.eINSTANCE;

		rs.getPackageRegistry().put(srcPack.getNsURI(), srcPack);
		rs.getPackageRegistry().put(trgPack.getNsURI(), trgPack);		
		rs.getPackageRegistry().put("platform:/resource/CryptoAPIConfig/model/CryptoAPIConfig.ecore", srcPack);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("CryptoConfigToJavaIbex");
		options.projectPath("CryptoConfigToJavaIbex");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
