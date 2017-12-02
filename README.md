# kaleidoscope-zoo
A zoo of examples and application scenarios of kaleidoscope, a model synchronisation framework.

## Prerequisite:

1. Install the latest version of Eclipse Modeling Tools (last tested on 4.7.0) http://www.eclipse.org/downloads/packages/
2. Install the Kaleidoscope Framework via this Update Site:  http://emoflon.org/kaleidoscope-zoo/com.kaleidoscope.deployment.updatesite  
    - **Important:** Make sure you enable "contact all update sites" in the update manager so all dependencies are automatically installed.
    - **Important:** After adding the Kaleidoscope update site some extra update sites will be added automatically for all dependencies.  Unfortunately, you have to first click on `Manage` and *enable* all these update sites first before clicking `Install`.

## Setup steps:

1. Check encoding for Xtend Files
  - In Eclipse: Go to ```Window->Preferences->General->Workspace```
  - Change the text file encoding to 'Other: UTF-8'

## Showcases

### The underlying consistency relation
All showcases implement the same underlying consistency relation between the same metamodels.
The source metamodel represents a set of persons in a single container.  Each person has a string as name and an integer as ID that is unique in the container.
The target metamodel is similar, also consisting of a single container with employees.  Employees have names and unique IDs just like persons, but additionally have an integer representing their salary.
Source and target models are consistent if there exist a bijection between persons and employees that is equality on IDs.

### Install required plugins:
1. Install the latest version of Xtend: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
2. Install the latest version of Xtext: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/

Make sure you enable "contact all update sites" in the update manager so all dependencies are automatically installed.

### Setup steps:

1. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import this PSF file: https://raw.githubusercontent.com/eMoflon/kaleidoscope-zoo/master/showcase/projectSet.psf
2. You might have to manually trigger code generation for the Xtext/Xtend projects.
3. Consult the README file in each of the showcase projects for further instructions.

## Kaleidocrypt

### Install required plugins:
1. Install eMoflon: http://emoflon.github.io/eclipse-plugin/emoflon_2.31.0/updatesite
2. Install the latest version of Xtend: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/

Make sure you enable "contact all update sites" in the update manager so all dependencies are automatically installed.

### Setup steps:

1. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import this PSF file: https://raw.githubusercontent.com/eMoflon/kaleidoscope-zoo/master/kaleidocrypt/KaleidocryptProjectSet.psf
2. Run ```com.kaleidoscope.usecase.kaleidocrypt``` as Eclipse Application
3. Add a new project, e.g., called CryptoAPI
4. A new configuration can be added by selecting the CryptoAPI project and adding a configuration such as SymmetricEncryption.

## BX Demonstrator

### Install required plugins:
1. Tomcat: Install Tomcat Version 7.0 on your system. You can follow the below link for the installation process. (http://crunchify.com/step-by-step-guide-to-setup-and-install-apache-tomcat-server-in-eclipse-development-environment-ide/)
2. Install eMoflon: http://emoflon.github.io/eclipse-plugin/emoflon_2.31.0/updatesite
3. Install the latest version of Xtend: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
4. Install the latest version of Web Tools Platform http://download.eclipse.org/webtools/repository/oxygen/

Make sure you enable "contact all update sites" in the update manager so all dependencies are automatically installed.

### Setup steps:

1. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import this PSF file: https://raw.githubusercontent.com/eMoflon/kaleidoscope-zoo/master/bxdemonstrator/BXdemonstratorProjectSet.psf
2. Add Servers View  
  - ```Window->Show View->Other...->Workspace```
  - Search for Servers View and add it
3. Click on “Servers” tab -> click on the link to create a new Sever -> Enter and Select the Tomcat server configured earlier -> Next -> Enter the Tomcat server path and JRE version -> Next -> Select the project name and add to the server and Finish

You will see a folder name “Servers” on Project Explorer

4. Run the Project ```com.kaleidoscope.usecases.bxdemonstrator.tomcat.app```

Right click on Project -> Run As -> Run on Server -> select the Tomcat server and Finish

Now you will be able to run the project on browser by entering http://localhost:8080/com.kaleidoscope.usecase.bxdemonstrator.tomcat.app/

For small code changes, Tomcat automatically build and push the changes while in running mode. Only you have to refresh the browser to see the effect of changes. For big changes, changes in javascript file(logic.js) or if the automatic build is not working(sometimes), stop the server, clean and then start once again.
