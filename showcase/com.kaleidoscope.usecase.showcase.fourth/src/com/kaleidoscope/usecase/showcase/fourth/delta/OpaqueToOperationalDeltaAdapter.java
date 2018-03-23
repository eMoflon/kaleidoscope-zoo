package com.kaleidoscope.usecase.showcase.fourth.delta;

import com.kaleidoscope.core.delta.discovery.OnlineDeltaDiscoverer;
import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaInputAdapter;

public class OpaqueToOperationalDeltaAdapter<Model> implements DeltaInputAdapter<OperationalDelta, OpaqueDelta<Model>, Model> {
	@Override
	public OperationalDelta parse(OpaqueDelta<Model> md, Model m) {
		OnlineDeltaDiscoverer<Model> deltaDiscoverer = new OnlineChangeDetector<Model>();
		deltaDiscoverer.generateDeltaFromModel(m);
		deltaDiscoverer.start();
		md.execute(m);
		deltaDiscoverer.stop();
		return deltaDiscoverer.getCurrentDelta();
	}
}