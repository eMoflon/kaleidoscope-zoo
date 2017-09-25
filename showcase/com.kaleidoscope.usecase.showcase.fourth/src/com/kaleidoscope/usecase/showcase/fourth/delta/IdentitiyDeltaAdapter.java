package com.kaleidoscope.usecase.showcase.fourth.delta;

import com.kaleidoscope.core.delta.javabased.Delta;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;

public class IdentitiyDeltaAdapter<ModelDelta extends Delta, Model> implements DeltaAdapter<ModelDelta, ModelDelta, Model> {


	@Override
	public ModelDelta parse(ModelDelta md, Model m) {
		return md;
	}

	@Override
	public ModelDelta unparse(ModelDelta md, Model a) {
		return md;
	}

}
