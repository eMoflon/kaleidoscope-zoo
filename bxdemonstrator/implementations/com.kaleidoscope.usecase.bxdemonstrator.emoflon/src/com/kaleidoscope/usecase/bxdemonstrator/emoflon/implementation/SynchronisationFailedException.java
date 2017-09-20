package com.kaleidoscope.usecase.bxdemonstrator.emoflon.implementation;

import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class SynchronisationFailedException extends IllegalStateException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Copier objectMapping;

	public SynchronisationFailedException(String string, Copier objectMapping) {
		this.setObjectMapping(objectMapping);
	}

	public Copier getObjectMapping() {
		return objectMapping;
	}

	public void setObjectMapping(Copier objectMapping) {
		this.objectMapping = objectMapping;
	}
	
	// TODO:  Add methods to update or access mappings
	
}
