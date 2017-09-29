## Second showcase scenario:

1. Run `com.kaleidoscope.usecase.showcase.second` as an Eclipse Application
2. In the new Eclipse instance go to `File -> New -> Other...`
3. Choose the wizard `New Showcase Second Project` inside the folder `Other`
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
- Involved artefacts are text files converted to models using Xtext-based parsers and unparsed to text with Xtend templates.

The only difference compared to the first scenario is the choice of artefacts for source and target models. 
This demonstrates that it is possible to easily swap ArtefactAdapters (here XMI to Xtext-based) without affecting the rest of the framework. To see how the framework is correspondingly configured, take a look at `src/com/kaleidoscope/usecase/showcase/second/controller/ControllerModule.java`
