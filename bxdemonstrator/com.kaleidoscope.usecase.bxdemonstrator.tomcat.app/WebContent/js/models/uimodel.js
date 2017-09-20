
var uiClientModels = {
   layout : undefined,	
   workspace: undefined,
   failedDeltas:undefined,
   userChoices :undefined	
};

function initializeUImodel(){
	uiClientModels.workspace = new srcModelMeta.Workspace([], [], 100, 100);
	uiClientModels.layout = new trgModelMeta.Layout(100, [], [], 100, 100, 100);
	
	
	
}



