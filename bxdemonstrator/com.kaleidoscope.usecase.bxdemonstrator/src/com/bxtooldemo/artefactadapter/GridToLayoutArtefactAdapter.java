package com.bxtooldemo.artefactadapter;

import java.util.Optional;

import com.bxtooldemo.uimodels.Layout;
import com.bxtooldemo.uimodels.Rectangle;
import com.bxtooldemo.uimodels.UIGroup;
import com.kaleidoscope.core.framework.workflow.adapters.ArtefactAdapter;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.Group;

public class GridToLayoutArtefactAdapter implements ArtefactAdapter<Grid, Layout> {

	private Grid model;
	private Layout artefact;

	@Override
	public void parse() {
	}

	@Override
	public void unparse() {
		// layout conversion
		artefact.setGridSize(model.getBlockSize());
		if (model != null && model.getGroups().size() > 0) {
			for (Group group : model.getGroups()) {
				UIGroup uiGroup = new UIGroup();
				for (Block block : group.getOccupies()) {
					Rectangle rect = new Rectangle();
					rect.setId("block_" + block.getXIndex() + "_" + block.getYIndex());

					rect.setxIndex(block.getXIndex()); // ADDED
					rect.setyIndex(block.getYIndex()); // ADDED
					uiGroup.setFillColor(group.getFillColor());
					uiGroup.getBlocks().add(rect);
				}
				artefact.getGroups().add(uiGroup);
			}
		}

	}

	@Override
	public void setModel(Grid m) {
		this.model = m;

	}

	@Override
	public void setArtefact(Layout a) {
		this.artefact = a;

	}

	@Override
	public Optional<Grid> getModel() {
		return Optional.of(model);
	}

	@Override
	public Optional<Layout> getArtefact() {
		return Optional.of(artefact);
	}

}
