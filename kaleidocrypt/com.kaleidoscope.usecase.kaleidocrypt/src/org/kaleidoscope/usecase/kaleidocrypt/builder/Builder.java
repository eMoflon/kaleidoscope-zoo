package org.kaleidoscope.usecase.kaleidocrypt.builder;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public interface Builder {
	public boolean isResourceSourceArtefact(IResource resource);
	public boolean isResourceTargetArtefact(IResource resource);
	public void syncBackward(IResource targetArtefactResource)throws CoreException;
	public void syncForward(IResource sourceArtefactResource)throws CoreException;
	public boolean isResourceToBeIgnored(IResource resource);
}
