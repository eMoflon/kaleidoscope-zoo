## Fourth showcase scenario:

1. Run `com.kaleidoscope.usecase.showcase.fourth` as an Eclipse Application
2. In the new Eclipse instance go to `File -> New -> Other...`
3. Choose the wizard `New Showcase Fourth Project` inside the folder `Other`
4. Enter the project name and click `Finish`

A new project with the chosen name should be created in the workspace. 
It contains a Java class `Main` and a folder `models` with two files `src.xmi` and `trg.xmi`.
A user performs all the changes inside the class `Main`. The delta to be propagated is specified programmatically and assigned as a lamda to the local variable `OpaqueDelta<PersonContainer> delta`.
The direction (forward, backward) in which the delta is to be propagated can be altered by calling either `controllerModule.getControllerInstance().syncForward(delta)` or 
`controllerModule.getControllerInstance().syncForward(delta)`. 
An example of a change is the addition of two persons inside the Person Container of the source model.
Executing `Main.java` file should trigger the addition of a corresponding new employees in the target model.
A delta on the source model must be propagated via `syncForward(delta)`, a delta on the target model via `syncBackward(delta)`.

## What this demonstrates

This scenario is:
- __Persistent__ meaning that all models are saved to file and the synchronisation can be continued even after shutting down completely.

The difference compared to the first scenario is the way delta are specified.
The `Main` class contains a programmatically defined `Opaque Delta`, which is applied as a change on the source/target model and propagated to the target/source model. 
This demonstrates that it is possible to easily swap Delta types and how they are specified (here Operational to Opaque) without affecting the rest of the framework. 
To see how the framework is configured, take a look at `src/com/kaleidoscope/usecase/showcase/fourth/controller/ControllerModule.java`
