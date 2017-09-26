## Setup steps:

1. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import this PSF file: https://raw.githubusercontent.com/eMoflon/kaleidoscope-zoo/master/showcase/projectSet.psf

## First scenario
1. Run ```com.kaleidoscope.usecase.showcase.first``` as Eclipse Application
2. In the new Eclipse instance go to ```File -> New -> Other...```
3. Choose the wizard ```New Showcase First Project``` inside the folder ```Other```
4. Enter the project name and Finish

A new project with the chosen name should appear in the Workspace. It contains folder ```models``` with two files ```src.xmi``` and ```trg.xmi```. A user can change any of the files by using ```Sample Reflective Ecore Model Editor``` and save it which synchonises the change.
An example of a change could be the addition of a new person inside ```Person Container``` in ```src.xmi``` which causes addition of a corresponding new employee
inside ```trg.xmi``` after saving the ```src.xmi```. 
