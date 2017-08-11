package org.emoflon.crypto;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;

import org.admin.ui.wizards.new_project.NewCryptoAPIProjectWizard;
import org.admin.ui.wizards.symmetric_encryption.NewSymmetricEncryptionWizard;
import org.builder.CryptoAPIProjectBuilder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobManager;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.wizards.IWizardDescriptor;

import com.kaleidoscope.extensionpoint.ArtefactAdapter;

import configuration.core.ConfigurationComparator;
import simplejava.core.SimpleJavaComparator;

public class CryptoTestHelper<S,T> {

	
	final private ResourceSet resourceSet;
		
	private String projectName;
	private Path projectPath;
	private IProject project;
	
	private  Path expectedJavaFilesFolderPath;	
	//private  String expectedSimpleJavaRootFolder;
	
	private Path expectedConfigurationFolderPath;
	private String expectedConfigurationRootFolder;
	
	private Comparator<S> srcComparator =  (Comparator<S>) new ConfigurationComparator();
	private Comparator<T> trgComparator = (Comparator<T>) new SimpleJavaComparator();
	
	
	public IProject getProject() {
		return project;
	}
	public void closeProject() throws CoreException{
		project.close(null);
	}
	public IProject setProject(IProject project) {
		this.project = project;
		this.projectPath = Paths.get(project.getLocation().toString());
		this.projectName = project.getName();
		return project;
	}
	public CryptoTestHelper(ResourceSet resourceSet, String expecedConfigurationRootFolder, String expectedSimpleJavaRootFolder, Comparator<S> srcComparator, Comparator<T> trgComparator){
		this.srcComparator = srcComparator;
		this.trgComparator = trgComparator;
		this.resourceSet = resourceSet;
		
		//this.expectedSimpleJavaRootFolder = expectedSimpleJavaRootFolder;
		this.expectedConfigurationRootFolder = expecedConfigurationRootFolder;
		
		this.expectedJavaFilesFolderPath = Paths.get(expectedSimpleJavaRootFolder).toAbsolutePath();
		this.expectedConfigurationFolderPath = Paths.get(this.expectedConfigurationRootFolder);
	}
	public void createProject(String projectName, String newProjectWizardID) throws InterruptedException{
		this.projectName = projectName;
		createProjectWizard(projectName, newProjectWizardID);
		this.project = getProject(projectName).get();
		this.projectPath = Paths.get(project.getLocation().toString());
	}
	
	public void assertSource(Path expectedSourcePath, Path actualSourceName){
		srcComparator.compare(loadExpectedSourceModel(expectedSourcePath), loadActualSourceModel(actualSourceName));
	}
	
	public void assertTarget(Path expectedTargetPath, Path actualTargetPath){
		trgComparator.compare(loadExpectedTargetModel(expectedTargetPath), loadActualTargetModel(actualTargetPath));
	}
	
	public String getProjectName(){
		return project.getName();
	}
	public <T> void performChangeSaveTargetEdit(Path relTargetModelPath, Consumer<T>change){
		ArrayList<Path>targetModelPaths = new ArrayList<Path>();
		targetModelPaths.add(projectPath.resolve(relTargetModelPath));
		
		ArtefactAdapter actualTargetEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("java", resourceSet).get();
		actualTargetEditor.setParseSource(targetModelPaths);
		actualTargetEditor.setUnParseSource(projectPath);
		//ArtefactAdapter actualTargetEditor = new JavaJDTEditor(resourceSet, project, null, targetModelPaths);
		T targetModel = actualTargetEditor.parse();
		change.accept(targetModel);		
		actualTargetEditor.unparse(targetModel);
		refreshModelsJavaSource(project);
	}
	public <T> void performChangesSaveTargetEdit(String targetModelPath, ArrayList<Consumer<T>>changes){
		ArrayList<String>targetModelPaths = new ArrayList<String>();
		targetModelPaths.add(targetModelPath);
		
		ArtefactAdapter actualTargetEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("java", resourceSet).get();
		actualTargetEditor.setParseSource(targetModelPaths);
		actualTargetEditor.setUnParseSource(projectPath);
		//ArtefactAdapter actualTargetEditor = new JavaJDTEditor(resourceSet, project, null, targetModelPaths);
		T targetModel = actualTargetEditor.parse();
		changes.forEach(c -> c.accept(targetModel));		
		actualTargetEditor.unparse(targetModel);
		refreshModelsJavaSource(project);
	}
	public <S> void performChangesSaveSourceEdit(String configFileName, ArrayList<Consumer<S>>changes){
		
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		
		ArtefactAdapter actualSourceEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("xmi", resourceSet).get();
		actualSourceEditor.setParseSource(absConfigFilePath);
		actualSourceEditor.setUnParseSource(absConfigFilePath);
		//ArtefactAdapter actualSourceEditor = new XMIEditor(resourceSet, absConfigFilePath);
		S sourceModel = actualSourceEditor.parse();
		changes.forEach(c -> c.accept(sourceModel));
		actualSourceEditor.unparse(sourceModel);
		refreshModelsJavaSource(project);
	}
	public  <S> void performChangeSaveSourceEdit(String configFileName, Consumer<S>change){
		
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", configFileName + ".xmi"));
		
		ArtefactAdapter actualSourceEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("xmi", resourceSet).get();
		actualSourceEditor.setParseSource(absConfigFilePath);
		actualSourceEditor.setUnParseSource(absConfigFilePath);
		//ArtefactAdapter actualSourceEditor = new XMIEditor(resourceSet, absConfigFilePath);
		S sourceModel = actualSourceEditor.parse();		
		change.accept(sourceModel);
		actualSourceEditor.unparse(sourceModel);
		refreshModelsJavaSource(project);
	}
	
	public <S> S loadActualSourceModel(Path actualSourceName){
		Path absConfigFilePath = projectPath.resolve(Paths.get("models", actualSourceName.toString() + ".xmi").toString());
		
		ArtefactAdapter actualSourceEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("xmi", resourceSet).get();
		actualSourceEditor.setParseSource(absConfigFilePath);
		actualSourceEditor.setUnParseSource(absConfigFilePath);
		//ArtefactAdapter actualSourceEditor = new XMIEditor(resourceSet, absConfigFilePath);
		return actualSourceEditor.parse();		
	}
	public <S> S loadExpectedSourceModel(Path expectedSourcePath){
		Path absExpectedConfigFilePath = expectedConfigurationFolderPath.resolve(expectedSourcePath);
		
		ArtefactAdapter expectedSourceEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("xmi", resourceSet).get();
		expectedSourceEditor.setParseSource(absExpectedConfigFilePath);
		expectedSourceEditor.setUnParseSource(absExpectedConfigFilePath);
		//ArtefactAdapter expectedSourceEditor = new XMIEditor(resourceSet, absExpectedConfigFilePath);
		return expectedSourceEditor.parse();		
	}
	public <T> T loadActualTargetModel(Path actualTargetPath){
		ArrayList<Path>actualTargetPaths = new ArrayList<Path>();
		actualTargetPaths.add(projectPath.resolve(actualTargetPath));
		
		ArtefactAdapter actualTargetEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("java", resourceSet).get();
		actualTargetEditor.setParseSource(actualTargetPaths);
		//ArtefactAdapter actualTargetEditor = new JavaJDTEditor(resourceSet, project, null, actualTargetPaths);
		return actualTargetEditor.parse();		
	}
	
	public <T> T loadExpectedTargetModel(Path epxectedTargetPath){
		ArrayList<Path>epxectedTargetPaths = new ArrayList<Path>();
		epxectedTargetPaths.add(expectedJavaFilesFolderPath.resolve(epxectedTargetPath));
		
		ArtefactAdapter actualTargetEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("java", resourceSet).get();
		actualTargetEditor.setParseSource(epxectedTargetPaths);
		//ArtefactAdapter actualTargetEditor = new JavaJDTEditor(resourceSet, null, null, epxectedTargetPaths);
		return actualTargetEditor.parse();		
	}
	
	public void saveActualTargetModel(T targetModel, String actualTargetPath){
		ArrayList<Path>actualTargetPaths = new ArrayList<Path>();
		actualTargetPaths.add(Paths.get(actualTargetPath));
		
		ArtefactAdapter actualTargetEditor = CryptoAPIProjectBuilder.artefactAdapterFactory("java", resourceSet).get();
		actualTargetEditor.setParseSource(actualTargetPaths);
		actualTargetEditor.setUnParseSource(projectPath);
		//ArtefactAdapter actualTargetEditor = new JavaJDTEditor(resourceSet, project, null, actualTargetPaths);
		actualTargetEditor.unparse(targetModel);
		refreshModelsJavaSource(project);
	}
	
	private Optional<IProject> getProject(String projectName){
		
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject iProject : projects) {
			if(iProject.getName().equals(projectName));
				return Optional.of(iProject);
		}
		return Optional.empty();
	}
	
	
	public void createConfiguration(String projectName, String configFileName, String packageName, String configurationModelWizardID) throws InterruptedException{
		// create a job that is used to execute wizards for creating new project and creating configuration model
		Job job = new Job("Create new configuration") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				Workbench.getInstance().getDisplay().syncExec(new Runnable() {
					@Override
					public void run() {																
						Optional<IWizard> symmetricEncryptionWizard = openWizard(configurationModelWizardID);
																				
						final Optional<IProject> project = getProject(projectName);												
						project.get().getName();
						symmetricEncryptionWizard.ifPresent(w -> {							
							NewSymmetricEncryptionWizard ncp = (NewSymmetricEncryptionWizard)w;					
							project.ifPresent(p -> ncp.setProject(p));			
							
							try {
								ncp.doFinish(configFileName, packageName);
								
							} catch (CoreException e) {							
								e.printStackTrace();
							}
							
						});
					}
				});
				return Status.OK_STATUS;
			}
		};				
		// Start the Job
		job.schedule();
		//wait until the job is finished
		job.join();
		refreshModelsJavaSource(project);
	}
	private void createProjectWizard(String projectName, String newProjectWizardID) throws InterruptedException{
		// create a job that is used to execute wizards for creating new project and creating configuration model
		Job job = new Job("Create new project") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				Workbench.getInstance().getDisplay().syncExec(new Runnable() {
					@Override
					public void run() {
						Optional<IWizard> newProjectWizard = openWizard(newProjectWizardID);																
						
						newProjectWizard.ifPresent(w -> {							
							NewCryptoAPIProjectWizard ncp = (NewCryptoAPIProjectWizard)w;						
								try {
									ncp.doFinish(projectName, monitor);
								} catch (CoreException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
						});														
					}
				});
				return Status.OK_STATUS;
			}
		};				
		// Start the Job
		job.schedule();
		//wait until the job is finished
		job.join();
	}	
	private void refreshModelsJavaSource(IProject project){
		IJobManager jobManager = Job.getJobManager();
		
		try {
			//refresh source java files and models folder
			project.getFolder("src").refreshLocal(IResource.DEPTH_INFINITE, null);
			project.getFolder("models").refreshLocal(IResource.DEPTH_INFINITE, null);
			
			// wait until refresh is over
			jobManager = Job.getJobManager();
			jobManager.join(ResourcesPlugin.FAMILY_AUTO_REFRESH, null);
			jobManager.join(ResourcesPlugin.FAMILY_MANUAL_REFRESH, null);
			
			ResourcesPlugin.getWorkspace().build(IncrementalProjectBuilder.INCREMENTAL_BUILD, null);
			
			Thread.sleep(1000);
			jobManager = Job.getJobManager();
			jobManager.join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
			jobManager.join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
			
		} catch (CoreException | OperationCanceledException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
	}
	
	private Optional<IWizard> openWizard(String id) {
		 // First see if this is a "new wizard".
		 IWizardDescriptor descriptor = PlatformUI.getWorkbench()
		   .getNewWizardRegistry().findWizard(id);
		 // If not check if it is an "import wizard".
		 if  (descriptor == null) {
		   descriptor = PlatformUI.getWorkbench().getImportWizardRegistry()
		   .findWizard(id);
		 }
		 // Or maybe an export wizard
		 if  (descriptor == null) {
		   descriptor = PlatformUI.getWorkbench().getExportWizardRegistry()
		   .findWizard(id);
		 }
		 try  {
		   // Then if we have a wizard, open it.
		   if  (descriptor != null) {
		     IWizard wizard = descriptor.createWizard();
		    
		     return Optional.of(wizard);
		   }
		 } catch  (CoreException e) {
		   e.printStackTrace();
		 }
		 
		 return Optional.empty();
		}
}


