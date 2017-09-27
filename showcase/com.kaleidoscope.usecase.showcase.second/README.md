## Setup steps:

1. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import this PSF file: https://raw.githubusercontent.com/eMoflon/kaleidoscope-zoo/master/showcase/projectSet.psf

## First scenario
1. Run ```com.kaleidoscope.usecase.showcase.second``` as Eclipse Application
2. In the new Eclipse instance go to ```File -> New -> Other...```
3. Choose the wizard ```New Showcase Second Project``` inside the folder ```Other```
4. Enter the project name and Finish

A new project with the chosen name should appear in the Workspace. It contains folder ```models``` with two files ```src.persons``` and ```trg.employees```. A user can change any of the files by using ```PersonDsl Editor``` or ```EmployeeDsl Editor```
and save it which synchonises the change. An example of a change could be the addition of a new person (```Person 2 { name "Marko Markovic"}```) in ```src.persons``` which causes addition of a corresponding new employee
inside ```trg.xmi``` after saving the ```src.persons```. 

## Second show case scenario:

1. Run `com.kaleidoscope.usecase.showcase.second` as an Eclipse Application
2. In the new Eclipse instance go to `File -> New -> Other...`
3. Choose the wizard `New Showcase First Project` inside the folder `Other`
4. Enter the project name and click `Finish`

A new project with the chosen name should be created in the workspace. 
It contains a folder `models` with two files `src.persons` and `trg.employees`. 
A user can now change any of the files (but not both!) by using ```PersonDsl Editor``` or ```EmployeeDsl Editor``` and save it to trigger the synchonisation.
An example of a change is the addition of a new person (```Person 2 { name "Marko Markovic"}```) inside the `src.persons`.
Saving the source model should trigger the addition of a corresponding new employee in the target model.

## What this demonstrates

This scenario is:
- __State-based__ meaning that the delta to be propagated is supplied by providing a new version of the entire model. This requires an offline delta discoverer (EMFCompare is used here).
- __Persistent__ meaning that all models are saved to file and the synchronisation can be continued even after shutting down completely.
- __Xtext-based__ meaning Xtext is used for defining ArtefactAdapters. For both models a special grammar is defined in Xtext for parsing and unparsing textual representations of them.

To see how the framework is correspondingly configured, take a look at `src/com/kaleidoscope/usecase/showcase/first/controller/ControllerModule.java`
