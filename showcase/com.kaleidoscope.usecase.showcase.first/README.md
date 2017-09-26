## First show case scenario:

1. Run `com.kaleidoscope.usecase.showcase.first` as an Eclipse Application
2. In the new Eclipse instance go to `File -> New -> Other...`
3. Choose the wizard `New Showcase First Project` inside the folder `Other`
4. Enter the project name and click `Finish`

A new project with the chosen name should be created in the workspace. 
It contains a folder `models` with two files `src.xmi` and `trg.xmi`. 
A user can now change any of the files (but not both!) and save it to trigger the synchonisation.
An example of a change is the addition of a new person inside the `Person Container` of the source model.
Saving the source model should trigger the addition of a corresponding new employee in the target model.

## What this demonstrates

This scenario is:
- __State-based__ meaning that the delta to be propagated is supplied by providing a new version of the entire model. This requires an offline delta discoverer (EMFCompare is used here).
- __Persistent__ meaning that all models are saved to file and the synchronisation can be continued even after shutting down completely.

To see how the framework is correspondingly configured, take a look at `src/com/kaleidoscope/usecase/showcase/first/controller/ControllerModule.java`