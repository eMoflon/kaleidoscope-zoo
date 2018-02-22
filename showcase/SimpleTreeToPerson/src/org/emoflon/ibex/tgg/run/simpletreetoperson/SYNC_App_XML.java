package org.emoflon.ibex.tgg.run.simpletreetoperson;

import java.io.IOException;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class SYNC_App_XML extends SYNC {

	private boolean fwd;
	private Resource input;

	public SYNC_App_XML(boolean fwd, Resource input) throws IOException {
		super(createIbexOptions());
		this.fwd = fwd;
		this.input = input;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}
	
	@Override
	protected Resource loadTGGResource() throws IOException{
		return loadResource("platform:/plugin/" + "SimpleTreeToPerson" + "/model/" + "SimpleTreeToPerson" + ".tgg.xmi");
	}
	
	@Override
	protected Resource loadFlattenedTGGResource() throws IOException{
		return loadResource("platform:/plugin/" + "SimpleTreeToPerson" + "/model/" + "SimpleTreeToPerson" + "_flattened.tgg.xmi");
	}
	
	
	@Override
	public void loadModels() throws IOException {
		if(fwd) {			
			s = input;
			t = createResource("temp/instances/trg.xmi");
		} else {
			t = input;
			s = createResource("temp/instances/src.xmi");
		}
		
		c = createResource("temp/instances/corr.xmi");
		p = createResource("temp/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}
	
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel

		loadAndRegisterMetamodel("platform:/plugin/SimpleTreeToPerson/model/SimpleTreeToPerson.ecore");
		
		EPackage pack = (EPackage) rs.getPackageRegistry().get("platform:/plugin/SimpleTreeToPerson/model/SimpleTreeToPerson.ecore");
		rs.getPackageRegistry().put("platform:/resource/SimpleTreeToPerson/model/SimpleTreeToPerson.ecore", pack);
	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectName("SimpleTreeToPerson");
			options.projectPath("SimpleTreeToPerson");
			options.debug(false);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
