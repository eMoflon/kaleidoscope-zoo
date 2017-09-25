package com.kaleidoscope.usecase.showcase.fourth.deltaadapter;

import com.kaleidoscope.core.delta.discovery.OnlineDeltaDiscoverer;
import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;
import com.kaleidoscope.usecase.showcase.fourth.deltadiscoverer.OnlineChangeDetector;



public class OpaqueToOperationalDeltaAdapter<Model> implements DeltaAdapter<OperationalDelta, OpaqueDelta<Model>, Model> {


	@Override
	public OperationalDelta parse(OpaqueDelta<Model> md, Model m) {
		OnlineDeltaDiscoverer<Model> deltaDiscoverer = new OnlineChangeDetector<Model>();
		deltaDiscoverer.generateDeltaFromModel(m);
		deltaDiscoverer.start();
		md.execute(m);
		deltaDiscoverer.stop();
		return deltaDiscoverer.getCurrentDelta();
	}

	@Override
	public OpaqueDelta<Model> unparse(OperationalDelta md, Model a) {
		
       OpaqueDelta<Model> delta = (m) -> {
    	   		md.executeOperationalDelta();
		};
		
		return delta;
	}

}