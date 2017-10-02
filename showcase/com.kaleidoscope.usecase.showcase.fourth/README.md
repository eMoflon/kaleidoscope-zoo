## Fourth showcase scenario:

1. Run `com.kaleidoscope.usecase.showcase.fourth` as an Eclipse Application
2. In the new Eclipse instance go to `File -> New -> Other...`
3. Choose the wizard `New Showcase Fourth Project` inside the folder `Other`
4. Enter the project name and click `Finish`

A new project with the chosen name should be created in the workspace. 
It contains a Java class `Main` and a folder `instances` with two files `src.xmi` and `trg.xmi`.
A user performs all the changes inside the class `Main`. How a delta (change) is defined can be modified by changing a local variable `OpaqueDelta<PersonContainer> delta`.
Direction of the synchronisaiton can be altered by calling `controllerModule.getControllerInstance().syncForward(delta)` or 
`controllerModule.getControllerInstance().syncForward(delta)`. 
An example of a change is the addition of two persons inside the Person Container of the source model.
Executing `Main.java` file should trigger the addition of a corresponding new employees in the target model.
If a user defines a delta on the source model then `syncForward(delta)` call should be made.
Otherwise if a user defines a delta on the target model then `syncForward(delta)` call should be made.

## What this demonstrates

This scenario is:
- __Persistent__ meaning that all models are saved to file and the synchronisation can be continued even after shutting down completely.

The only difference compared to the first scenario is the way of generating delta and the type of delta.
`Main` class contains programmatically defined `Opaque Delta` which is used as a change on the source model or on the target model. 
This demonstrates that it is possible to easily swap Delta type (here Operational to Opaque Delta) without affecting the rest of the framework. 
To see how the framework is correspondingly configured, take a look at `src/com/kaleidoscope/usecase/showcase/fourth/controller/ControllerModule.java`
