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
		throw new UnsupportedOperationException();
	}

	@Override
	public void unparse() { 
		artefact.setGridSize(model.getBlockSize());
		
		if (model != null && model.getGroups().size() > 0) {
			for (Group group : model.getGroups()) {
				
				UIGroup uiGroup = transformGroupIntoUIgroup(group);
				artefact.getGroups().add(uiGroup);
			}
		}

	}
	private Rectangle transformBlockIntoRectangle(Block block) {
		
		Rectangle rect = new Rectangle();
		rect.setId("block_" + block.getXIndex() + "_" + block.getYIndex());
		rect.setxIndex(block.getXIndex()); 
		rect.setyIndex(block.getYIndex()); 
		return rect;
	}
	private UIGroup transformGroupIntoUIgroup(Group group) {
		
		UIGroup uiGroup = new UIGroup();
		uiGroup.setFillColor(group.getFillColor());
		
		for (Block block : group.getOccupies()) {
			Rectangle rectangle = transformBlockIntoRectangle(block);
			uiGroup.getBlocks().add(rectangle);
		}

		return uiGroup;
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
