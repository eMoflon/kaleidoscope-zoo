package bxtendDemonstratorImpl.rules;

import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class SynchronizationError extends IllegalStateException {

	private Copier objectMapping;
	
	public SynchronizationError(){
		
	}
	public SynchronizationError(String string, Copier objectMapping) {
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
