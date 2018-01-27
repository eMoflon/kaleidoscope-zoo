package org.benchmarx.emf;

import com.kaleidoscope.core.framework.synchronisation.SynchronisationResult;

public class EMFModelAssertation<S, T> implements ModelAssertation<S, T> {

	private Comparator<S> src;
	private Comparator<T> trg;
	
	
	public EMFModelAssertation(Comparator<S> src, Comparator<T> trg) {
		this.src = src;
		this.trg = trg;
		
	}
	private void assertModels(S source, T target, SynchronisationResult<S, ?, T, ?, ?> syncResult) {
		src.assertEquals(source, (S)syncResult.getSourceArtefactAdapter().getModel().get());
		trg.assertEquals(target, (T)syncResult.getTargetArtefactAdapter().getModel().get());		
	}
	
	@Override
	public void assertPostcondition(S source, T target, SynchronisationResult<S, ?, T, ?, ?> syncResult){
		assertModels(source, target, syncResult);
	}

	@Override
	public void assertPrecondition(S source, T target, SynchronisationResult<S, ?, T, ?, ?> syncResult){
		assertModels(source, target, syncResult);
	}
}
