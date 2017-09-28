package com.kaleidoscope.usecase.showcase.third.eclipse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class ShowcaseThirdNature extends com.kaleidoscope.usecase.showcase.first.eclipse.ShowcaseFirstNature{

	public static final String SHOWCASE_API_NATURE_ID = "com.kaleidoscope.usecase.showcase.third.nature";
	public static final String SHOWCASE_API_BUILDER_ID = "com.kaleidoscope.usecase.showcase.third.builder";
	
	@Override
	protected void addICryptoAPIProjectBuilder() throws CoreException {
		IProjectDescription projectDescription = project.getDescription();
		ICommand[] buildSpec = projectDescription.getBuildSpec();
		ICommand command = projectDescription.newCommand();
		command.setBuilderName(SHOWCASE_API_BUILDER_ID);
		Collection<ICommand> list = new ArrayList<>();
		list.add(command);
		list.addAll(Arrays.asList(buildSpec));
		projectDescription.setBuildSpec(list.toArray(new ICommand[list.size()]));
		project.setDescription(projectDescription, new NullProgressMonitor());
	}
	
}
