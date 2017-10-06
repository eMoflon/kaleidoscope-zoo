## Third showcase scenario:

1. Run `com.kaleidoscope.usecase.showcase.third` as an Eclipse Application
2. In the new Eclipse instance go to `File -> New -> Other...`
3. Choose the wizard `New Showcase Third Project` inside the folder `Other`
4. Enter the project name and click `Finish`

A new project with the chosen name should be created in the workspace containing a folder `models` with two files `src.xmi` and `trg.xmi`. 
A user can now change any of the files (but not both!) by opening them (right-click and select `Open With`) with the `Kaleidoscope Delta Editor`, editing them as usual and saving to trigger the synchonisation.
An example of a change is the addition of a new person inside the Person Container of the source model.
Saving the source model should trigger the addition of a corresponding new employee in the target model.


## What this demonstrates

This scenario is:
- __Delta-based__ meaning that the delta to be propagated is supplied by using the `Kaleidoscope Delta Editor` . This requires an online delta listener.
- __Persistent__ meaning that all models are saved to file and the synchronisation can be continued even after shutting down completely.

The only difference compared to the first scenario is the way deltas are created.
`Kaleidoscope Delta Editor` records all the changes made by a user and generates deltas between the models as soon as the user saves the editor.
This demonstrates that it is possible to easily swap a DeltaDiscoverer (here an offline delta discoverer based on EMFCompare to an online delta discoverer that leverages the EMF notification framework) without affecting the rest of the framework. 
To see how the framework is configured, take a look at `src/com/kaleidoscope/usecase/showcase/third/controller/ControllerModule.java`
