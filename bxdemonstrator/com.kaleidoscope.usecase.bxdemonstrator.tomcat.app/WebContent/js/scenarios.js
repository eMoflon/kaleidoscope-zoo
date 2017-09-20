/**
 * 
 */
var scenario0= new Array();
var conclusion0 = "This example is a simplified kitchen planner that offers to the right a symbolic view (the ktichen) of all objects currently positioned in the kitchen, and to the left a layout view (the grid) showing how much space the objects occupy as coloured groups of blocks organised in a grid.<br> You can create or delete any number of sinks, tables, and fridges in the kitchen, and press Sync to propagate your changes to the grid.<br><br>" +
        "You will find out that the western blue wall has all the water outlets, so you can only create sinks near enough to it, while the northern red wall has all the electrical outlets, meaning you can only create fridges near enough to it.<br><br>" +
		"Tables can be created anywhere but you'll have to decide if you want the table to take up two horizontal or two vertical blocks in the grid. The synchroniser will prompt you for your preference if necessary.<br><br>" +
		"You can of course move objects around in the kitchen if their final position is still legal.<br><br>" +
		"The kitchen planner can also be used to find out what would fit in a certain group of blocks. To do this click a group of blocks in the grid so they have the same colour (Click on any white block. You will get a new color. Now, same color can be applied on any other white block with a click. For a new color, click thrice on any white block.) and then press Sync to get suggestions for which corresponding object can be placed in the kitchen.<br><br>" +
        "Note that extra blocks are ignored if the object will not occupy them all, but are retained for the rest of the session. You can think of this as reserving empty or extra space (for chairs, or a flower pot, etc). It is also possible to vary the granularity of the grid by changing its height/width in number of blocks (this triggers a refresh).<br><br>" +
		"You can delete whole groups of blocks in the grid by clicking on them (the colour of the group will be greyed out).<br><br>" +
		"You cannot, however, move groups of blocks around in the grid, or perform changes in both the grid and the kitchen before pressing the Sync button.";

var scenario1= new Array("Create a sink in the kitchen (recall that this is only possible directly on the blue wall)", "Synchronise", "Now move the sink away from the blue wall and synchronise","Your change will be rejected as there exists no grid that would be consistent with this change and new kitchen");
var conclusion1 = "This demonstrates that not all possible changes can be synchronised (according to our current rules). Other example for changes in the kitchen that can be made but will be rejected include creating or moving fridges too far away from the red wall, or moving any objects on top of each other.<br><br>" + "Reset and Go to the next scenario.";
var scenario2= new Array("Click on two vertical blocks in the layout so that they have the same colour and the top-most block is directly on the northern(top) wall", "Synchronise", "You will be asked to choose to create either a fridge, or a vertical table", "Enter a number representing your preference", "Your preferred object will be created in the kitchen");
var conclusion2 = "This demonstrates how user interaction (or some other, possibly automated means) can be used to decide between multiple equally consistent results.<br><br>" + "Reset and Go to the next scenario.";
var scenario3= new Array("Create a fridge on the red wall of the kitchen", "Synchronise (and note the colour of the group of blocks created in the grid)", "Now delete the fridge and synchronise", "Assuming the deletion was a mistake, undo it by re-creating the fridge and synchronising", 
"Although the kitchen is now (for all we care) in the same state it was in after Step (2), the grid is, however, in a different state as the re-created group has a different colour than before");
var conclusion3 = "This demonstrates that undoing changes in the kitchen to revert to a previous state does not necessarily imply that this can be reflected analogously in the grid.<br><br>" + "Reset and Go to the next scenario.";
var scenario4= new Array("Create two sinks, sink_1 and sink_2 apart from each other, somewhere along the blue wall of the kitchen", "Synchronise and note the colours of the two groups created in the grid for the sinks", "Now move sink_1 to a new valid location (along the blue wall) via drag and drop", 
		"Also move sink_2 to a new valid location, but this time by deleting it and then recreating a sink at the desired new location (along the blue wall)", 
		"Synchronise and note how both groups are moved correspondingly in the grid, but that the colour of the group for sink_1 is retained, while the group corresponding to the second sink now has a new colour");
var conclusion4 = "This demonstrates that the actual change performed can have an effect on synchronisation results, even if the final result (the kitchen here) might appear to be exactly the same in both cases (the sinks are both moved to their new positions as far as we can see and thus care).<br><br>" + "Reset and Go to the next scenario.";
var scenario5= new Array("Create a fridge on the red wall of the kitchen", "Synchronise to update the grid", "Fill a few isolated and single blocks with unique colours in the grid", "Synchronise (these blocks will be ignored and the kitchen remains unchanged)", "Now move the fridge along the red wall in the kitchen and synchronise",
		"As you might expect, the isolated blocks that have no relevance for the kitchen are nonetheless preserved in the grid");
var conclusion5 = "This demonstrates that it is possible to avoid unnecessary information loss (the single blocks), if the old state of the grid is taken into account. It would be impossible to do this if the grid were created solely from the kitchen (and vice-versa).";



function loadScenario(header, scenario, conclusion){
	var scenarioElement;
	$('#divItemList').show();
	$('#itemHeader').text("");
	$('#itemList').text("");
	$('#itemConclusion').text("");
	$('#itemHeader').append(header);
    for (i = 0; i < scenario.length; i++ ) {
        // Create the <LI> element
    	scenarioElement = document.createElement("LI");
        // Add the array values between the <LI> tags
    	scenarioElement.innerHTML = scenario[i];
        // Append the <LI> to the bottom of the <UL> element
        $('#itemList').append(scenarioElement);
    }
    $('#itemConclusion').append(conclusion);
}
