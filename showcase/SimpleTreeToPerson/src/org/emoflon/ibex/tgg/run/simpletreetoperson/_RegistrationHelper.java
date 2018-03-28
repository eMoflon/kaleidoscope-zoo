package org.emoflon.ibex.tgg.run.simpletreetoperson;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import Persons.impl.PersonsPackageImpl;
import Simpletree.impl.SimpletreePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) {
		rs.getPackageRegistry().put("platform:/plugin/com.kaleidoscope.core.aux.simpletree/model/Simpletree.ecore",
				SimpletreePackageImpl.init());
		rs.getPackageRegistry().put(
				"platform:/resource/com.kaleidoscope.usecase.showcase.metamodel.person/model/Person.ecore",
				PersonsPackageImpl.init());
	}
}
