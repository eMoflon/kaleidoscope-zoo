package bxtooldemo.adapter.artefactadapter;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.kaleidoscope.extensionpoint.ArtefactAdapter;

import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import bxtooldemo.adapter.uimodels.Element;
import bxtooldemo.adapter.uimodels.Workspace;

public class KitchenUIArtefactAdapter implements ArtefactAdapter<Kitchen, Workspace> {

	
	@Override
	public void setResourceSet(ResourceSet resourceSet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Kitchen parse(Workspace parseSource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unparse(Workspace workspaceAdapter, Kitchen kitchen) {
		// workspace conversion
		workspaceAdapter.setWidth((int) kitchen.getXSize());
		workspaceAdapter.setHeight((int) kitchen.getYSize());
		
		if (kitchen != null && kitchen.getItemSockets().size() > 0) {
			
			for (ItemSocket itemSocket : kitchen.getItemSockets()) {
			
				if(itemSocket.getItem()!=null){
					Element element = new Element();
					element.setId(itemSocket.getId());
					element.setPosX(itemSocket.getItem().getXPos());
					element.setPosY(itemSocket.getItem().getYPos());
					element.setType(itemSocket.getItem().eClass().getName());
					workspaceAdapter.getObjects().add(element);
				}
			}
		}
		
	}

}
