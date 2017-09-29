package com.kaleidoscope.usecase.showcase.first.eclipse;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.controllers.statebased.PersistentStateBasedController;
import com.kaleidoscope.usecase.showcase.first.controller.ArtefactAdapterModule;
import com.kaleidoscope.usecase.showcase.first.controller.ControllerModule;
import com.kaleidoscope.usecase.showcase.first.controller.ControllerType;

import Employees.EmployeeContainer;
import Persons.PersonContainer;
  
public class Builder extends IncrementalProjectBuilder implements IResourceDeltaVisitor {
	
	protected IProject project;
	protected Path projectPath;
	
	protected Path syncForwardRealtiveSourcePath;
	protected Path syncBacwardRelativeTargetPath;
	
	
	public Builder(Path syncForwardRelativeSourcePath, Path syncBackwardRelativeTargetPath) {
		this.syncForwardRealtiveSourcePath = syncForwardRelativeSourcePath;
		this.syncBacwardRelativeTargetPath = syncBackwardRelativeTargetPath;
	}
	
	public Builder() {
		syncForwardRealtiveSourcePath = Paths.get("models", "src.xmi");
		syncBacwardRelativeTargetPath = Paths.get("models", "trg.xmi");
	}
	
	protected static final Logger logger = Logger.getLogger(Builder.class);
	
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {		
		logger.info("Build is being performed.");
		project = getProject();
		projectPath = Paths.get(project.getLocation().toString());
		
		switch (kind) {
			case CLEAN_BUILD:
				performClean();
				break;
			case FULL_BUILD:			
				syncForward();
				logger.info("Performing full build!");
				break;
			case AUTO_BUILD:
			case INCREMENTAL_BUILD:
				generateFilesIfchangeIsRelevant();
			default:
				break;
		}
		return null;
	}
	
	public 
	PersistentStateBasedController<
		PersonContainer, 
		Path, 
		EmployeeContainer, 
		Path, 
		String,  
		OperationalDelta, 
		OperationalDelta, 
		Path
		> 
	getControllerInstance() {
		Injector injector = Guice.createInjector(
				new ControllerModule(projectPath.resolve(Paths.get("models"))), 
				new ArtefactAdapterModule(projectPath)
			);
		return injector.getInstance(Key.get(new ControllerType()));
	}
	
	private void generateFilesIfchangeIsRelevant() throws CoreException {
		getDelta(getProject()).accept(this);
	}


	private void performClean() {
		
	}
	
	
	public void syncForward()	throws CoreException{
		
		logger.info("Sync a java model with the configuration model is performed!");
		
		Path syncForwardAbsoluteSourcePath = projectPath.resolve(syncForwardRealtiveSourcePath);
		
		if(syncForwardAbsoluteSourcePath.toFile().exists()) {
			
			getControllerInstance().syncForward(syncForwardAbsoluteSourcePath);
			refreshProject();
			logger.info("Sync a java model with the configuration model is done!");
		}else {
			
			logger.info("Sync a jave model with the configuration model was tried without the existing source");
		}
	
	}
	
	public void syncBackward()	throws CoreException{
		logger.info("Sync configuration model with a java model is performed!");
	
		Path syncBacwardAbsoulteTargetPath = projectPath.resolve(syncBacwardRelativeTargetPath);
	
		if(syncBacwardAbsoulteTargetPath.toFile().exists()) {
			getControllerInstance().syncBackward(syncBacwardAbsoulteTargetPath);
			refreshProject();
			logger.info("Sync configuration model with a java model is done!");
		}else {
			
			logger.info("Sync configuration model with a java model was tried without the existing source");
		}
		
		
	}
	
	public void refreshProject() throws CoreException{
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
	}
	
	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		
		IPath relFilePath = delta.getResource().getProjectRelativePath();
			
		if(delta.getResource().getName().equals("bin")){
			return false;
		}
		
		if(delta.getResource().getType() != IResource.FILE)
			return true;		
		

		if(relFilePath.toOSString().contentEquals(syncForwardRealtiveSourcePath.toString())){
			
			syncForward();
			
		}else if(relFilePath.toOSString().contentEquals(syncBacwardRelativeTargetPath.toString())){
			
			syncBackward();		
			
		}
		return true;
	}
}
