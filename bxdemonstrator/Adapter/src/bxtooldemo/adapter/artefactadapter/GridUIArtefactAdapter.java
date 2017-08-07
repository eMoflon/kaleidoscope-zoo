package bxtooldemo.adapter.artefactadapter;

import org.eclipse.emf.ecore.resource.ResourceSet;

import com.kaleidoscope.extensionpoint.ArtefactAdapter;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.Group;
import bxtooldemo.adapter.uimodels.Layout;
import bxtooldemo.adapter.uimodels.Rectangle;
import bxtooldemo.adapter.uimodels.UIGroup;

public class GridUIArtefactAdapter implements ArtefactAdapter<Grid, Layout> {

	@Override
	public void unparse(Layout layoutAdapter, Grid grid) {
		// layout conversion
		layoutAdapter.setGridSize(grid.getBlockSize());
		if (grid != null && grid.getGroups().size() > 0) {
			for (Group group : grid.getGroups()) {
				UIGroup uiGroup = new UIGroup();
				for (Block block : group.getOccupies()) {
					Rectangle rect = new Rectangle();
					rect.setId("block_"+block.getXIndex()+"_"+block.getYIndex());
					
					rect.setxIndex(block.getXIndex());  // ADDED
					rect.setyIndex(block.getYIndex()); // ADDED
					uiGroup.setFillColor(group.getFillColor());
					uiGroup.getBlocks().add(rect);
				}
				layoutAdapter.getGroups().add(uiGroup);
			}
		}
		
	}

	@Override
	public void setResourceSet(ResourceSet resourceSet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Grid parse(Layout parseSource) {
		// TODO Auto-generated method stub
		return null;
	}

}
