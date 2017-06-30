package org.builder;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.kaleidoscope.extensionpoint.ArtefactAdapter;

import SimpleJava.JavaCompilationUnit;
import SimpleJava.JavaPackage;

/**
 * @class ConfigJavaFilesRelation is used to find all the configuration models in a project and the corresponding java files.
 * One configuration model can be related with one or more java files and the class represents those relations with two HashMaps.
 *
 */
public class ConfigJavaFilesRelation {

	private IProject project;
	private Path projectPath;
	private ResourceSet resourceSet;
	/**
	 * It is used to relate a configuration file with a java paths. Configuration file is represented with the file name, while java file 
	 * is represented with a path relative to the project in which the file is present.
	 */
	private HashMap<String, ArrayList<Path>> configurationModelJavaFiles;
	private HashMap<Path, String> javaFileConfigurationModel;
	private ArtefactAdapter editor = null;
	
	public ConfigJavaFilesRelation(IProject project, ResourceSet resourceSet){
		this.project = project;
		this.projectPath = Paths.get(project.getLocation().toString());
		this.resourceSet = resourceSet;
		configurationModelJavaFiles = new HashMap<String, ArrayList<Path>>();
		javaFileConfigurationModel = new HashMap<Path, String>();
	}
	
	/**
	 * The method searches for the configuration files. When it find one, it parses the configuration file into the configuraiton model
	 * which is then used to find the paths of all related java files. When it constructs the path for a java file it has to add the relation
	 * to both HashMaps.
	 * @return
	 * @throws CoreException
	 */
	public boolean reconstructRelations() throws CoreException{
		
		File folder = projectPath.resolve(Paths.get("models", "gen")).toFile();
		
		if(!folder.exists())
			return false;
		
		// Loop runs through every configuration folder located in models/gen
		for (File configFolder: folder.listFiles()) {
			if(!configFolder.isDirectory()) continue;
			
			
			// Current configuration folder has to have the file fwd.trg.xmi, which presents corresponding java model
			File javaModelFile = configFolder.toPath().resolve("fwd.trg.xmi").toFile();
			Path javaModelFileLocation = javaModelFile.toPath();
			
			// if corresponding java model file doesn't exist, add empty relation and return
			if(!javaModelFile.exists()){
				addRelation(configFolder.getName(), null);
				return true;
			}
			// parse fwd.trg.xmi to get JavaPackage which is then used to extract paths of all compilation units(java files) 
			// contained inside the JavaPackage
			
			editor = CryptoAPIProjectBuilder.artefactAdapterFactory("xmi", resourceSet).get();			
			editor.setParseSource(javaModelFileLocation);			
			
			JavaPackage javaPackage = (JavaPackage)editor.parse();
			
			if(javaPackage == null)
				return false;
			
			// transform java package notation into a path 
			String javaPackageStr = javaPackage.getName().replaceAll("\\.", File.separator);
			
			// export all java file paths related to the javaPackage and add the corresponding relations
			for (JavaCompilationUnit jcu : javaPackage.getCunits()) {
				String stringJavaFilePath = projectPath.resolve(Paths.get("src", javaPackageStr, jcu.getName() + ".java")).toString();
				addRelation(configFolder.getName(), Paths.get(stringJavaFilePath));				
			}
		}
		return true;
	}
	public Set<String> getAllConfigurationModels(){
		return configurationModelJavaFiles.keySet();
	}
	public ArrayList<Path> getJavaFiles(String configurationPath){
		return configurationModelJavaFiles.get(configurationPath);
	}
	
	public String getConfigurationModel(Path javaFilePath){
		return javaFileConfigurationModel.get(javaFilePath);
	}
	public boolean configurationExists(String configurationPath){
		return configurationModelJavaFiles.containsKey(configurationPath);
	}
	public boolean javaFileExists(Path javaFile){
		return javaFileConfigurationModel.containsKey(javaFile);
	}
	public void addConfiguration(String configName){
		ArrayList<Path> javaFiles = configurationModelJavaFiles.get(configName);
		if(javaFiles == null){
			javaFiles = new ArrayList<Path>();
			configurationModelJavaFiles.put(configName, javaFiles);
		}
	}
	public boolean addRelation(String configurationName, Path javaFile){
		ArrayList<Path> javaFiles = configurationModelJavaFiles.get(configurationName);
		
		
		if(javaFiles == null){
			javaFiles = new ArrayList<Path>();
			configurationModelJavaFiles.put(configurationName, javaFiles);
		}
		if(!javaFiles.contains(javaFile)){
			if(javaFile != null)
				javaFiles.add(javaFile);
		}
		String savedConfigPath = javaFileConfigurationModel.get(javaFile);
		
		if(savedConfigPath == null && javaFile != null){
			javaFileConfigurationModel.put(javaFile, configurationName);
		}
		
		
		return true;
	}

	
	
}
