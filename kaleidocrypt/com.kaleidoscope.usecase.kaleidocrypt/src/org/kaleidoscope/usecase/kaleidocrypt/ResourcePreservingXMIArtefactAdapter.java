package org.kaleidoscope.usecase.kaleidocrypt;

import java.nio.file.Path;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

public class ResourcePreservingXMIArtefactAdapter<T extends EObject> extends XMIArtefactAdapter<T>
		implements ArtefactAdapter<T, Path> {

	private Resource oldResource;
	private EObject root;

	public ResourcePreservingXMIArtefactAdapter(Path path) {
		super(path);
	}

	@Override
	public void setModel(T m) {
		super.setModel(m);
		oldResource = m.eResource();
		root = m;
	}

	@Override
	public void unparse() {
		super.unparse();
		if (oldResource.getContents().isEmpty())
			oldResource.getContents().add(root);
	}
}
