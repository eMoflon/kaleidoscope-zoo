package org.emoflon.ibex.tgg.run.simpleexceltoemployee;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import Employees.impl.EmployeesPackageImpl;
import Simpleexcel.impl.SimpleexcelPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) {
		//throw new NotImplementedException("You need to register your source and target metamodels.");
		
		// For both source and target metamodels (and any other dependencies you might require)
		
		// Option 1 (recommended): If you have generated code for your metamodel <Foo> and use eMoflon projects and defaults
		// rs.getPackageRegistry().put("platform:/resource/Foo/model/Foo.ecore", FooPackageImpl.init());

		// Option 2:  If you wish to use the .ecore file directly without generating code
		// loadAndRegisterMetamodel(<pathToEcoreFile>);
		
		rs.getPackageRegistry().put("platform:/resource/com.kaleidoscope.core.aux.simpleexcel/model/Simpleexcel.ecore",
				SimpleexcelPackageImpl.init());
		rs.getPackageRegistry().put(
				"platform:/resource/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employees.ecore",
				EmployeesPackageImpl.init());
	}
}
