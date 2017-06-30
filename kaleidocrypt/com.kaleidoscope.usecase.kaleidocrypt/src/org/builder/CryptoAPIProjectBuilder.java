package org.builder;


import java.net.URL;
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
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.moflon.core.utilities.LogUtils;
import org.moflon.core.utilities.MoflonUtilitiesActivator;

import com.kaleidoscope.extensionpoint.ArtefactAdapter;
import com.kaleidoscope.extensionpoint.BXtool;
import com.kaleidoscope.extensionpoint.Controller;
import com.kaleidoscope.extensionpoint.DeltaDiscoverer;
import com.kaleidoscope.implementation.artefactadapter.JavaArtefactAdapter;
import com.kaleidoscope.implementation.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.implementation.tool.BxtendTool;
import com.kaleidoscope.implementation.tool.EMoflonTool;

import CryptoConfigToJava.CryptoConfigToJavaPackage;
import SimpleJava.JavaPackage;
/**
 * @author Dusko
 * The class is used to build projects, which created by the NewCryptoAPIProject wizard.
 * The main role of the builer is to keep in sync Configuration model /models/config.xmi and SimpleJava model /src/java.xmi.
 * Each time a user makes a change in one of the file a corresponding methods has to be called in order to perform synchronization. 
 * In the beginning the project has only /models/config.xmi and /src/java.xmi needs to be generated.   
 */
public class CryptoAPIProjectBuilder extends IncrementalProjectBuilder implements IResourceDeltaVisitor {
	
	private static ResourceSetImpl resourceSet = new ResourceSetImpl();
	private IProject project;
	private Path projectPath;
	private DeltaDiscoverer deltaDiscoverer;
	private ConfigJavaFilesRelation configJavaFilesRelation;
	
	private static final String ARTEFACT_ADAPTER_EXTENSON_ID = "com.kaleidoscope.extensionpoint.artefactadapter";
	private static final String DELTA_DISCOVER_EXTENSON_ID = "com.kaleidoscope.extensionpoint.deltadiscoverer";
	private static final String CONTROLLER_EXTENSON_ID = "com.kaleidoscope.extensionpoint.controller";
	private static final String BXTOOL_EXTENSON_ID = "com.kaleidoscope.extensionpoint.bxtool";
	
	
	private static final Logger logger = Logger.getLogger(CryptoAPIProjectBuilder.class);
	URL pathToTGGtransProjet  = MoflonUtilitiesActivator.getPathRelToPlugIn(".", "CryptoConfigToJava");
	IProgressMonitor monitor;
	String bxToolType = "emoflon";
	
	public CryptoAPIProjectBuilder() {
		// Set up a simple configuration that logs on the console.	
	    BasicConfigurator.configure();
	    deltaDiscoverer = deltaDiscoveryFactory("default").get();
	}
	
	
	public  static Optional<ArtefactAdapter> artefactAdapterFactory(String type, ResourceSet set) {
        IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(ARTEFACT_ADAPTER_EXTENSON_ID);
        try {
            for (IConfigurationElement e : config) {
            	
            	Optional<String> typeAttribute = Optional.ofNullable(e.getAttribute("type"));
            	
            	if(typeAttribute.equals(Optional.of(type))){
            		final Object o = e.createExecutableExtension("class");
            		if (o instanceof XMIArtefactAdapter) {
	                	((XMIArtefactAdapter) o).initialize(set);
	                	
	                }
                    if (o instanceof JavaArtefactAdapter) {
                    	((JavaArtefactAdapter) o).initialize(set);
                    }
                    return Optional.of((ArtefactAdapter)o);
            	}
                logger.debug("Evaluating extension");            
            }
        } catch (CoreException ex) {
            LogUtils.error(logger, ex);
        }
        
        return Optional.empty();
    }
	private Optional<DeltaDiscoverer> deltaDiscoveryFactory(String type) {
        IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(DELTA_DISCOVER_EXTENSON_ID);
        try {
        	
            for (IConfigurationElement e : config) {
            	
            	Optional<String> typeAttribute = Optional.ofNullable(e.getAttribute("type"));
            	
            	if(typeAttribute.equals(Optional.of(type))){
            			                
	                final Object o = e.createExecutableExtension("class");
	                if (o instanceof DeltaDiscoverer) {
	                	return Optional.of((DeltaDiscoverer)o);
	                }
            	}
            }
        } catch (CoreException ex) {
            LogUtils.error(logger, ex);
        }
        return Optional.empty();
    }
	private Optional<Controller> controllerFactory(String type) {
        IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(CONTROLLER_EXTENSON_ID);
        try {
            for (IConfigurationElement e : config) {
            	
            	Optional<String> typeAttribute = Optional.ofNullable(e.getAttribute("type"));
            	
            	if(typeAttribute.equals(Optional.of(type))){
	                
	                final Object o = e.createExecutableExtension("class");
	                if (o instanceof Controller) {
	                	return Optional.of((Controller) o);
	                }
            	}
            }
        } catch (CoreException ex) {
            LogUtils.error(logger, ex);
        }
        return Optional.empty();
    }
	private Optional<BXtool> bxToolFactory(String type, Path persistanceDir) {
        IConfigurationElement[] config = Platform.getExtensionRegistry().getConfigurationElementsFor(BXTOOL_EXTENSON_ID);
        try {
            for (IConfigurationElement e : config) {
                
            	Optional<String> typeAttribute = Optional.ofNullable(e.getAttribute("type"));
            	
            	if(typeAttribute.equals(Optional.of(type))){
	                final Object o = e.createExecutableExtension("class");
	                if (o instanceof EMoflonTool) {
	                	((EMoflonTool) o).initialize(resourceSet, pathToTGGtransProjet.getPath(), CryptoConfigToJavaPackage.eINSTANCE, persistanceDir);
	                	
	                }
	                if (o instanceof BxtendTool) {
	                	((BxtendTool) o).initialize(resourceSet, persistanceDir);
	                	
	                }
	                return Optional.of((BXtool) o);
            	}
            }
        } catch (CoreException ex) {
            LogUtils.error(logger, ex);
        }
        return Optional.empty();
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
		
		resourceSet = new ResourceSetImpl();
		this.configJavaFilesRelation  = new ConfigJavaFilesRelation(project, resourceSet);
		
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
		ArtefactAdapter cryptoJavaArtefactAdapter = artefactAdapterFactory("java", resourceSet).get();
		cryptoJavaArtefactAdapter.setUnParseSource(projectPath);
		
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		
		ArtefactAdapter configArtefactAdapter = artefactAdapterFactory("xmi", resourceSet).get();
		configArtefactAdapter.setParseSource(absConfigFilePath);
		
		ArtefactAdapter deltaArtefactAdapter = artefactAdapterFactory("xmi", resourceSet).get();
		
		Path relDeltaPath = Paths.get("models", "gen", configFileName, "fwd.src.delta.xmi");
		Path absDeltaPath = projectPath.resolve(relDeltaPath);
		
		// it is used by a tool for example emoflon to save corresponding model, sync protocol, source, target model...
		Path persistanceDir = projectPath.resolve(Paths.get("models", "gen", configFileName));
		Controller controller = controllerFactory("default").get();
		
		BXtool tool = bxToolFactory(bxToolType, persistanceDir).get();
		controller.initialize(tool, deltaDiscoverer, deltaArtefactAdapter);
		
		controller.setSourceArtefactAdapter(configArtefactAdapter);
		controller.setTargetArtefactAdapter(cryptoJavaArtefactAdapter);
		controller.setDeltaPath(absDeltaPath);
		
		controller.syncForwardFromDelta();
		controller.persistModels();
		
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
		configJavaFilesRelation.reconstructRelations();
		
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
		
		ArtefactAdapter cryptoJavaEditor = artefactAdapterFactory("java", resourceSet).get();
		cryptoJavaEditor.setUnParseSource(projectPath);
		cryptoJavaEditor.setParseSource(javaFilePaths);
		
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		ArtefactAdapter configArtefactAdapter = artefactAdapterFactory("xmi", resourceSet).get();
		configArtefactAdapter.setParseSource(absConfigFilePath);
		
		Path relDeltaPath = Paths.get("models", "gen", configFileName, "bwd.trg.delta.xmi");
		Path absDeltaPath = projectPath.resolve(relDeltaPath);
		ArtefactAdapter deltaArtefactAdapter = artefactAdapterFactory("xmi", resourceSet).get();
		
		Path persistanceDir = projectPath.resolve(Paths.get("models", "gen", configFileName));
		Controller controller = controllerFactory("default").get();
		BXtool tool = bxToolFactory(bxToolType, persistanceDir).get();
		
		controller.initialize(tool, deltaDiscoverer, deltaArtefactAdapter);
		controller.setSourceArtefactAdapter(configArtefactAdapter);
		controller.setTargetArtefactAdapter(cryptoJavaEditor);
		controller.setDeltaPath(absDeltaPath);
		controller.syncBackwardFromDelta();
		controller.persistModels();
		
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
		configJavaFilesRelation.reconstructRelations();
		
		logger.info("Sync configuration model " + configFileName + " with a java model is done!");
	}
	
	private   void cryptoJavaModelPostProcessing(EObject cryptoJavaModel){
		JavaPackage jp = (JavaPackage)cryptoJavaModel;
		JavaImportAlphabeticalNormaliser jin = new JavaImportAlphabeticalNormaliser();
		
		jp.getCunits().forEach(c -> jin.normalize(c.getImports()));;
	}
	private void transformForward(Path absoluteConfigurationPath)throws CoreException{		
		String configurationFileName = FilenameUtils.removeExtension(absoluteConfigurationPath.getFileName().toString());;
		
		logger.info("Transformation from " + configurationFileName + " to a java mode is being performed!");
		
		Path persistanceDir = projectPath.resolve(Paths.get("models", "gen", configurationFileName));
		
		Controller controller = controllerFactory("default").get();
		BXtool tool = bxToolFactory(bxToolType, persistanceDir).get();
		controller.initialize(tool, deltaDiscoverer, null);
		
		ArtefactAdapter configArtefactAdapter = artefactAdapterFactory("xmi", resourceSet).get();
		configArtefactAdapter.setParseSource(absoluteConfigurationPath);
		
		ArtefactAdapter cryptoJavaArtefactAdapter = artefactAdapterFactory("java", resourceSet).get();
		cryptoJavaArtefactAdapter.setUnParseSource(projectPath);		
		
		controller.setSourceArtefactAdapter(configArtefactAdapter);
		controller.setTargetArtefactAdapter(cryptoJavaArtefactAdapter);
				
		controller.sourceToTargetTransformation(Optional.of(this::cryptoJavaModelPostProcessing));
		controller.persistModels();
		
		logger.info("Transformation from " + configurationFileName + " to a java mode is finished!");
		project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, monitor);
		project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, monitor);
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
			
			if(delta.getKind() == delta.ADDED){
				
				logger.info("ADDED change on a configuration model is detected!");
				Path absConfigModelPath = Paths.get(delta.getResource().getLocation().toString());
				transformForward(absConfigModelPath);	
			}
			if(delta.getKind() == delta.CHANGED  && 
				configJavaFilesRelation.configurationExists(fileName)){
		
				logger.info("CHANGED change on a configuration model is detected!");
				syncForward(fileName);				
			}
			
		}else if(javaFileMatcher.matches() && 
				configJavaFilesRelation.javaFileExists(absFilePath)){
			
			if(delta.getKind() == delta.CHANGED){
				logger.info("CHANGED change on the java file is detected!");
				String configFileName = configJavaFilesRelation.getConfigurationModel(absFilePath);
				syncBackward(configFileName);
			}			
			
		}
		return true;
	}
}
