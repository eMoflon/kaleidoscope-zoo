package com.bxtooldemo.delta;

import java.util.ArrayList;
import java.util.List;

import com.bxtooldemo.uimodels.Element;
import com.bxtooldemo.uimodels.UIGroup;


public class GridKitchenDeltaOperation {

	
	
	public static final String ELEMENT_CREATED_OPERATION = "ADDED";
	public static final String ELEMENT_DELETED_OPERATION = "REMOVED";
	public static final String ELEMENT_MOVED_OPERATION = "CHANGED";

	public static final String GROUP_CREATED_OPERATION = "group_created";
	public static final String GRUPD_DELETED_OPERATION = "group_remove";

	private List<DeltaKitchenOperation> kitchenOperations = new ArrayList<DeltaKitchenOperation>();
	private List<DeltaGridOperation> gridOperations = new ArrayList<DeltaGridOperation>();
	
	public void addKitchenOperation(DeltaKitchenOperation op){
		kitchenOperations.add(op);
	}
	public void addGridOperation(DeltaGridOperation op){
		gridOperations.add(op);
	}
	
	public List<DeltaKitchenOperation> getKitchenOperations() {
		return kitchenOperations;
	}
	public List<DeltaGridOperation> getGridOperations() {
		return gridOperations;
	}
}

class DeltaKitchenOperation{
	
	private String operationType;
	private Element affectedElement;
	
	public Element getAffectedElement() {
		return affectedElement;
	}
	public void setAffectedElement(Element affectedElement) {
		this.affectedElement = affectedElement;
	}
	public  DeltaKitchenOperation(Element affectedElement, String operationType){
		this.affectedElement = affectedElement;
		this.operationType = operationType;
	}
	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}
}

class DeltaGridOperation{
	
	String operationType;
	UIGroup affectedGroup;
	
	public UIGroup getAffectedGroup() {
		return affectedGroup;
	}
	public void setAffectedGroup(UIGroup affectedGroup) {
		this.affectedGroup = affectedGroup;
	}
	public  DeltaGridOperation(UIGroup affectedGroup, String operationType){
		this.affectedGroup = affectedGroup;
		this.operationType = operationType;
	}
	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

}
