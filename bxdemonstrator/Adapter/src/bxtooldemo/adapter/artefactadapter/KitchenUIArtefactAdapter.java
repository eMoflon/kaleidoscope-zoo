package bxtooldemo.adapter.artefactadapter;

import java.util.Optional;

import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import KitchenLanguage.ItemSocket;
import KitchenLanguage.Kitchen;
import bxtooldemo.adapter.uimodels.Element;
import bxtooldemo.adapter.uimodels.Workspace;

public class KitchenUIArtefactAdapter implements ArtefactAdapter<Kitchen, Workspace> {

	private Kitchen model;
	private Workspace artefact;

	@Override
	public void parse() {
	}

	@Override
	public void unparse() {
		// workspace conversion
		artefact.setWidth((int) model.getXSize());
		artefact.setHeight((int) model.getYSize());

		if (model != null && model.getItemSockets().size() > 0) {

			for (ItemSocket itemSocket : model.getItemSockets()) {

				if (itemSocket.getItem() != null) {
					Element element = new Element();
					element.setId(itemSocket.getId());
					element.setPosX(itemSocket.getItem().getXPos());
					element.setPosY(itemSocket.getItem().getYPos());
					element.setType(itemSocket.getItem().eClass().getName());
					artefact.getObjects().add(element);
				}
			}
		}
	}

	@Override
	public void setModel(Kitchen m) {
		this.model = m;

	}

	@Override
	public void setArtefact(Workspace a) {
		this.artefact = a; 

	}

	@Override
	public Optional<Kitchen> getModel() {
		return Optional.of(model);
	}

	@Override
	public Optional<Workspace> getArtefact() {
		return Optional.of(artefact);
	}

}
