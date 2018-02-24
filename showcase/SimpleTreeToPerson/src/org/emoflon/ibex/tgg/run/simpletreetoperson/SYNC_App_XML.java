package org.emoflon.ibex.tgg.run.simpletreetoperson;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class SYNC_App_XML extends SYNC {
	private boolean fwd;
	private EObject input;

	public SYNC_App_XML(boolean fwd, EObject input) throws IOException {
		super(createIbexOptions());
		this.fwd = fwd;
		this.input = input;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}
	
	@Override
	protected Resource loadTGGResource() throws IOException{
		return loadResource("platform:/resource/" + "SimpleTreeToPerson" + "/model/" + "SimpleTreeToPerson" + ".tgg.xmi");
	}
	
	@Override
	protected Resource loadFlattenedTGGResource() throws IOException{
		return loadResource("platform:/resource/" + "SimpleTreeToPerson" + "/model/" + "SimpleTreeToPerson" + "_flattened.tgg.xmi");
	}
	
	
	@Override
	public void loadModels() throws IOException {
		if(fwd) {
			s = createResource("temp/instances/src.xmi");
			t = createResource("temp/instances/trg.xmi");
			s.getContents().add(input);
		} else {
			s = createResource("temp/instances/src.xmi");
			t = createResource("temp/instances/trg.xmi");
			t.getContents().add(input);
		}
		
		c = createResource("temp/instances/corr.xmi");
		p = createResource("temp/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}
	
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel
		loadAndRegisterMetamodel("platform:/resource/SimpleTreeToPerson/model/SimpleTreeToPerson.ecore");
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
