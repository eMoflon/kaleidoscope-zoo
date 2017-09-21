# kaleidoscope-zoo
A zoo of examples and application scenarios of kaleidoscope, a model synchronisation framework.

## Prerequisite:

1. Install Eclipse Oxygen with Eclipse Modeling Tools (tested on 4.7.0) http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/oxygenr

## Install required plugins:
1. Install eMoflon: http://emoflon.github.io/eclipse-plugin/emoflon_2.31.0/updatesite
2. Install the latest version of Xtend: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/
3. Install the latest version of Xtext: http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/

Make sure you enable "contact all update sites" in the update manager so all dependencies are automatically installed.

## Setup steps:

1. Check encoding for Xtend Files
  - In Eclipse: Go to ```Window->Preferences->General->Workspace```
  - Change the text file encoding to 'Other: UTF-8'
2. Go to ```File/Import.../Team/Team Project Set```, check URL and enter in and import this PSF file: https://raw.githubusercontent.com/eMoflon/kaleidoscope-zoo/master/projectsSet.psf
