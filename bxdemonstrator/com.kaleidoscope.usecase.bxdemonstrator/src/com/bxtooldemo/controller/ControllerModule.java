package com.bxtooldemo.controller;


import java.util.List;

import com.bxtooldemo.delta.GridToStringDeltaAdapter;
import com.bxtooldemo.delta.KitchenToStringDeltaAdapter;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;
import com.google.inject.TypeLiteral;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.annotations.Src;
import com.kaleidoscope.core.framework.annotations.Trg;
import com.kaleidoscope.core.framework.synchronisation.ContinuableSynchroniser;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.IdentityArtefactAdapter;
import com.kaleidoscope.usecase.bxdemonstrator.emoflon.implementation.EmoflonToolImpl;

import GridLanguage.Grid;
import KitchenLanguage.Kitchen;
import bxdemonstrator.implemenation.DemoBxtendTool;

public class ControllerModule extends AbstractModule{

	
	private final BxTool bxTool = BxTool.EMOFLON;
	private  int noOfBlocks;
	
	@Provides
	ContinuableSynchroniser<Grid, Kitchen, List<String>, OperationalDelta, OperationalDelta>provideSynchroniser(){
		
		ContinuableSynchroniser<Grid, Kitchen, List<String>, OperationalDelta, OperationalDelta>tool;
		
		if(bxTool.equals(BxTool.EMOFLON)) {
			
			tool = new EmoflonToolImpl(noOfBlocks);
		}
		else if(bxTool.equals(BxTool.BXTEND)){
			tool = new DemoBxtendTool();
		}
		else {
			tool = null;
		}	
		
		return tool;
	}
	@Override
	protected void configure() {
		bind(new TypeLiteral<ArtefactAdapter<Grid, Object>>(){}).annotatedWith(Src.class).to(new TypeLiteral<IdentityArtefactAdapter<Grid, Object>>(){});
		bind(new TypeLiteral<ArtefactAdapter<Kitchen, Object>>(){}).annotatedWith(Trg.class).to(new TypeLiteral<IdentityArtefactAdapter<Kitchen, Object>>(){});
		
		bind(new TypeLiteral<DeltaAdapter<OperationalDelta, String, Grid>>() {}). annotatedWith(Src.class).to(GridToStringDeltaAdapter.class);
		bind(new TypeLiteral<DeltaAdapter<OperationalDelta, String, Kitchen>>() {}). annotatedWith(Trg.class).to(KitchenToStringDeltaAdapter.class);
	
	}
	
	public BxDemoController getControllerInstance(int noOfBlocks) {

		this.noOfBlocks = noOfBlocks;
		Injector injector = Guice.createInjector(this);
		BxDemoController controller = injector.getInstance(BxDemoController.class);

		return controller;
	}
}

enum BxTool {
    EMOFLON, BXTEND 
}