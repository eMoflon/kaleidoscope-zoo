package org.builder;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FilenameUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;

import com.kaleidoscope.implementation.controller.ComponentFactory;
import com.kaleidoscope.implementation.controller.ControllerImpl;

import SimpleJava.JavaPackage;
/**
 * @author Dusko
 * The class is used to build projects, which created by the NewCryptoAPIProject wizard.
 * The main role of the builer is to keep in sync Configuration model /models/config.xmi and SimpleJava model /src/java.xmi.
 * Each time a user makes a change in one of the file a corresponding methods has to be called in order to perform synchronization. 
 * In the beginning the project has only /models/config.xmi and /src/java.xmi needs to be generated.   
 */
public class CryptoAPIProjectBuilder extends IncrementalProjectBuilder implements IResourceDeltaVisitor, ControllerImpl {
	
	private IProject project;
	private Path projectPath;

	private ConfigJavaFilesRelation configJavaFilesRelation;
	private final String COMPONENT_FACTORY_ID = "kaleidocrypt";
	
	private static final Logger logger = Logger.getLogger(CryptoAPIProjectBuilder.class);
	IProgressMonitor monitor;
	
	
	public CryptoAPIProjectBuilder() {
		ComponentFactory.COMPONENT_FACTORY_ID = COMPONENT_FACTORY_ID;
		// Set up a simple configuration that logs on the console.	
	    BasicConfigurator.configure();
	}
	
	
	/**
	 * Does the building of the project. First it checks whether  a src/java.xmi exists and if not it does initial transformation which transforms
	 * models/config.xmi to java.xmi. Then it checks if the model/config.xmi file exists and if not it transforms src/java.xmi into the models/config.xmi.
	 * After this step method visit is used to do synchronization when a change in files occurs.
	 */
	@Override
	protected IProject[] build(int kind, Map<String, String> args, IProgressMonitor monitor) throws CoreException {		
		logger.info("Build is being performed.");
		project = getProject();
		this.monitor = monitor;
		projectPath = Paths.get(project.getLocation().toString());
		
		this.configJavaFilesRelation  = new ConfigJavaFilesRelation(project);
		
		switch (kind) {
		case CLEAN_BUILD:
			performClean();
			break;
		case FULL_BUILD:
			logger.info("Performing full build!");
			
			configJavaFilesRelation.reconstructRelations();
			Set<String> configurationModelsName = configJavaFilesRelation.getAllConfigurationModels();
			
			for (String configurationModelName : configurationModelsName) {
				// performs forward transformation on every configuration model for which  
				// there isn't corresponding java model
				if(configJavaFilesRelation.getJavaFiles(configurationModelName).isEmpty()){
					Path relativeConfigPath = Paths.get("models", configurationModelName + ".xmi");
					Path absConfigPath = projectPath.resolve(relativeConfigPath);					 
					transformForward(absConfigPath);	
				}
			}
			break;
		case AUTO_BUILD:
		case INCREMENTAL_BUILD:
			generateFilesIfchangeIsRelevant();
		default:
			break;
		}
		return null;
	}
	
	private void generateFilesIfchangeIsRelevant() throws CoreException {
		getDelta(getProject()).accept(this);
	}


	private void performClean() {
		
	}
	/**
	 * The method synchronizes the SimpleJava model located in /src/java.xmi with the Configuration model in /models/config.xmi. It is called
	 * each time a user performs a change inside the /models/config.xmi file and saves the file. 
	 * @throws CoreException
	 */
	private void syncForward(String configFileName)throws CoreException{
		logger.info("Sync a java model with the configuration model " + configFileName + " is performed!");
		
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		Path relDeltaPath = Paths.get("models", "gen", configFileName, "fwd.src.delta.xmi");
		Path absDeltaPath = projectPath.resolve(relDeltaPath);
		
		Path persistanceDir = projectPath.resolve(Paths.get("models", "gen", configFileName));
		syncForwardFromDelta(absConfigFilePath, projectPath, persistanceDir, absDeltaPath);
		
		refreshProject();
		
		logger.info("Sync a java model with the configuration model " + configFileName + " is done!");
	}
	
	/**
	 * The method synchronizes the Configuration model located in /src/java.xmi with the SimpleJava model in /src/java.xmi. It is called
	 * each time a user performs a change inside the /src/java.xmi file and saves the file. 
	 * @throws CoreException
	 */
	private void syncBackward(String configFileName)throws CoreException{
		logger.info("Sync configuration model " + configFileName + " with a java model is performed!");
		
		ArrayList<Path>javaFilePaths = configJavaFilesRelation.getJavaFiles(configFileName);	
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		
		Path relDeltaPath = Paths.get("models", "gen", configFileName, "bwd.trg.delta.xmi");
		Path absDeltaPath = projectPath.resolve(relDeltaPath);
		
		Path persistanceDir = projectPath.resolve(Paths.get("models", "gen", configFileName));
		
		syncBackwardFromDelta(absConfigFilePath, javaFilePaths, persistanceDir, absDeltaPath);
		
		refreshProject();
		logger.info("Sync configuration model " + configFileName + " with a java model is done!");
	}
	private void refreshProject() throws CoreException{
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
		configJavaFilesRelation.reconstructRelations();
		
	}
	private   void simpleJavaModelPostProcessing(EObject simpleJavaModel){
		JavaPackage jp = (JavaPackage)simpleJavaModel;
		JavaImportAlphabeticalNormaliser jin = new JavaImportAlphabeticalNormaliser();
		
		jp.getCunits().forEach(c -> jin.normalize(c.getImports()));;
	}
	private void transformForward(Path absoluteConfigurationPath)throws CoreException{		
		String configurationFileName = FilenameUtils.removeExtension(absoluteConfigurationPath.getFileName().toString());		
		Path persistanceDir = projectPath.resolve(Paths.get("models", "gen", configurationFileName));
		
		sourceToTargetTransformation(absoluteConfigurationPath, projectPath, persistanceDir, Optional.of(this::simpleJavaModelPostProcessing));		
		
		refreshProject();
		configJavaFilesRelation.reconstructRelations();
	}
	
	/**
	 * It is called for every change in a project. The method ignores changes in files that are located inside a bin folder.
	 * The methods responses only on changes inside the config files or .java. After the change is detected depending on the file, 
	 * a suitable synchronization is performed, forward or backward.
	 * @param delta is the resource that was changed
	 */
	@Override
	public boolean visit(IResourceDelta delta) throws CoreException {
		
		Pattern configFilePattern = Pattern.compile("models/[a-zA-Z]*[.]xmi", Pattern.CASE_INSENSITIVE);
		Pattern javaFilePattern = Pattern.compile(".+[.]java", Pattern.CASE_INSENSITIVE);
		
		String relFilePath = delta.getResource().getProjectRelativePath().toString();
		Path absFilePath = projectPath.resolve(Paths.get(relFilePath));
		
		Matcher configFileMatcher = configFilePattern.matcher(relFilePath);
	    Matcher javaFileMatcher = javaFilePattern.matcher(relFilePath);
	    		
		if(delta.getResource().getName().equals("bin")){
			return false;
		}
		
		if(delta.getResource().getType() != IResource.FILE)
			return true;		
		
		String fileName =delta.getResource().getFullPath().removeFileExtension().lastSegment(); 
		configJavaFilesRelation.reconstructRelations();
		
		if(configFileMatcher.matches()){
			
			if(delta.getKind() == IResourceDelta.ADDED){
				
				logger.info("ADDED change on a configuration model is detected!");
				Path absConfigModelPath = Paths.get(delta.getResource().getLocation().toString());
				transformForward(absConfigModelPath);	
			}
			if(delta.getKind() == IResourceDelta.CHANGED  && 
				configJavaFilesRelation.configurationExists(fileName)){
		
				logger.info("CHANGED change on a configuration model is detected!");
				syncForward(fileName);				
			}
			
		}else if(javaFileMatcher.matches() && 
				configJavaFilesRelation.javaFileExists(absFilePath)){
			
			if(delta.getKind() == IResourceDelta.CHANGED){
				logger.info("CHANGED change on the java file is detected!");
				String configFileName = configJavaFilesRelation.getConfigurationModel(absFilePath);
				syncBackward(configFileName);
			}			
			
		}
		return true;
	}
}
