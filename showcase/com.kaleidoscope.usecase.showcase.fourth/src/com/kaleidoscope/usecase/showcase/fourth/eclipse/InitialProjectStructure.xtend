package com.kaleidoscope.usecase.showcase.fourth.eclipse

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path

import static com.kaleidoscope.util.WorkspaceHelper.addAllFoldersAndFile

class InitialProjectStructure extends com.kaleidoscope.usecase.showcase.first.eclipse.InitialProjectStructure {
	
	def static void addJavaMainFile(IProject project) throws CoreException{	
		val IPath filePath = new Path("src/com/kaleidoscope/usecase/showcase/fourth/App.java")
		val String fileContent = '''
		package com.kaleidoscope.usecase.showcase.fourth;
		
		import java.nio.file.Paths;
		import org.apache.log4j.BasicConfigurator;
		import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
		import com.kaleidoscope.usecase.showcase.fourth.controller.ControllerModule;
		import Persons.Person;
		import Persons.PersonContainer;
		import Persons.PersonsFactory;
		
		public class App {
		
			public static void main(String[] args) {
				BasicConfigurator.configure();
				
				OpaqueDelta<PersonContainer> delta = (m) -> {
					Person newPersonTesla = PersonsFactory.eINSTANCE.createPerson();
					newPersonTesla.setName("Nikola Tesla");
					newPersonTesla.setID(0);
					m.getPersons().add(newPersonTesla);
					
					Person newPersonEdison = PersonsFactory.eINSTANCE.createPerson();
					newPersonEdison.setName("Thomas Edison");
					newPersonEdison.setID(1);
					m.getPersons().add(newPersonEdison);
				};
		
				ControllerModule controllerModule = new ControllerModule(Paths.get("models", "gen"));
				controllerModule.getControllerInstance().syncForward(delta);
			}
		
		}
		'''
		addAllFoldersAndFile(project, filePath, fileContent, null)
	}
}