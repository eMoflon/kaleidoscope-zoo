package com.bxtooldemo.delta;

import org.eclipse.emf.ecore.EObject;

import com.kaleidoscope.core.delta.javabased.operational.AddEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.AttributeChangeOp;
import com.kaleidoscope.core.delta.javabased.operational.CompositeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.Operation;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;

import GridLanguage.Block;
import KitchenLanguage.Fridge;
import KitchenLanguage.Item;
import KitchenLanguage.Sink;
import KitchenLanguage.Table;

public class FailedDeltaToStringAdapter implements DeltaAdapter<OperationalDelta, String, Object> {

	@Override
	public OperationalDelta parse(String ad, Object m) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String unparse(OperationalDelta failedDelta, Object model) {
			
		String failedDeltaMsg = "";
		
		for (Operation op : failedDelta.getOperations()) {
			if(op instanceof CompositeOp){
				
				CompositeOp compositeOp = (CompositeOp) op;
				
				for(Operation atomicOperation : compositeOp.getOperations()){
					
					if(atomicOperation instanceof AddEdgeOp){
						EObject edgeTarget = ((AddEdgeOp) atomicOperation).getEdge().getTrg();
						
						if(edgeTarget instanceof Block){
							failedDeltaMsg +=  " Creation of Group";
							break;
						}
						else if(edgeTarget instanceof Item){
							failedDeltaMsg +=  " Creation of " + getItemName((Item)edgeTarget);
							break;							
						}
					}
					
					else if(atomicOperation instanceof DeleteEdgeOp){
						EObject edgeTarget = ((AddEdgeOp) atomicOperation).getEdge().getTrg();
						
						if(edgeTarget instanceof Block){
							failedDeltaMsg +=  " Deletion of Group";
							break;
						}
						else if(edgeTarget instanceof Item){
							failedDeltaMsg +=  " Creation of " + getItemName((Item)edgeTarget);
							break;
						}
					}
					else if(atomicOperation instanceof AttributeChangeOp){
						EObject affectedNode = ((AttributeChangeOp) atomicOperation).getAffectedNode();
						if(affectedNode instanceof Item){
							failedDeltaMsg +=  " Movement of " + getItemName((Item)affectedNode);
							break;
						}
					}
				}
				
			}				
		}
		return failedDeltaMsg;
		
	}
	
	private String getItemName(Item item){
		if(item instanceof Fridge)
			  return "Fridge";
			else if(item instanceof Table)
				return "Tabe";
			else if(item instanceof Sink)
				return "Sink";
			else
				return "";
	}

}
