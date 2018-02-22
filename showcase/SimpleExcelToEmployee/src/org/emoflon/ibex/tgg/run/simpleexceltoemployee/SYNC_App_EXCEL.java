package org.emoflon.ibex.tgg.run.simpleexceltoemployee;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class SYNC_App_EXCEL extends SYNC {

	private boolean fwd;
	private Resource input;
	
	public SYNC_App_EXCEL(boolean fwd, Resource input) throws IOException {
		super(createIbexOptions());
		this.fwd = fwd;
		this.input = input;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	@Override
	protected Resource loadTGGResource() throws IOException{
		return loadResource("platform:/plugin/" + options.projectName() + "/model/" + options.projectName() + ".tgg.xmi");
	}
	
	@Override
	protected Resource loadFlattenedTGGResource() throws IOException{
		return loadResource("platform:/plugin/" + options.projectName() + "/model/" + options.projectName() + "_flattened.tgg.xmi");
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
			
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectName("SimpleExcelToEmployee");
			options.debug(false);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
