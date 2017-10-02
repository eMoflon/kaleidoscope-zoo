package com.kaleidoscope.usecase.showcase.fourth.eclipse

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path

import static com.kaleidoscope.util.WorkspaceHelper.addAllFoldersAndFile

class InitialProjectStructure extends com.kaleidoscope.usecase.showcase.first.eclipse.InitialProjectStructure {
	

	def static void addJavaMainFile(IProject project) throws CoreException{
		
		val IPath filePath = new Path("src/Main.java")
		val String fileContent = '''
		import java.nio.file.Paths;
		
		import com.kaleidoscope.core.delta.javabased.opaque.OpaqueDelta;
		import com.kaleidoscope.usecase.showcase.fourth.controller.ControllerModule;
		
		import Persons.Person;
		import Persons.PersonContainer;
		import Persons.PersonsFactory;
		
		public class Main {
		
			public static void main(String[] args) {
		
				OpaqueDelta<PersonContainer> delta = (m) -> {
					Person newPerson = PersonsFactory.eINSTANCE.createPerson();
					newPerson.setName("Nikola Tesla");
					m.getPersons().add(newPerson);
					
					Person newPersonEdison = PersonsFactory.eINSTANCE.createPerson();
					newPersonEdison.setName("Thomas Edison");
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