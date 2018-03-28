package org.emoflon.ibex.tgg.run.simpleexceltoemployee;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import Employees.impl.EmployeesPackageImpl;
import Simpleexcel.impl.SimpleexcelPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) {
		rs.getPackageRegistry().put("platform:/plugin/com.kaleidoscope.core.aux.simpleexcel/model/Simpleexcel.ecore",
				SimpleexcelPackageImpl.init());
		rs.getPackageRegistry().put(
				"platform:/resource/com.kaleidoscope.usecase.showcase.metamodel.employee/model/Employee.ecore",
				EmployeesPackageImpl.init());
	}
}
