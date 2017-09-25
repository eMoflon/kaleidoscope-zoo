package com.kaleidoscope.usecase.showcase.first.eclipse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.PlatformUI;
import com.kaleidoscope.util.LogUtils;
import com.kaleidoscope.util.WorkspaceHelper;
import com.kaleidoscope.util.BuildPropertiesFileBuilder;
import com.kaleidoscope.util.manifest.ManifestFileUpdater;
import com.kaleidoscope.util.manifest.ManifestFileUpdater.AttributeUpdatePolicy;
import com.kaleidoscope.util.manifest.PluginManifestConstants;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;

public class ShowcaseFirstNature implements IProjectNature {

	public static final String SHOWCASE_FIRST_API_NATURE_ID = "com.kaleidoscope.usecase.showcase.first.nature";
	public static final String SHOWCASE_FIRST_API_BUILDER_ID = "com.kaleidoscope.usecase.showcase.first.builder";
	
	
	private static final Logger logger = Logger.getLogger(WorkspaceHelper.class);
	private IProject project;
	
	@Override
	public void configure() throws CoreException {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					performSetUpRoutines();
					addICryptoAPIProjectBuilder();
				} catch (CoreException | IOException e) {
					LogUtils.error(logger, e);
				}
			}

		});
	}
	private void addICryptoAPIProjectBuilder() throws CoreException {
		IProjectDescription projectDescription = project.getDescription();
		ICommand[] buildSpec = projectDescription.getBuildSpec();
		ICommand command = projectDescription.newCommand();
		command.setBuilderName(SHOWCASE_FIRST_API_BUILDER_ID);
		Collection<ICommand> list = new ArrayList<>();
		list.add(command);
		list.addAll(Arrays.asList(buildSpec));
		projectDescription.setBuildSpec(list.toArray(new ICommand[list.size()]));
		project.setDescription(projectDescription, new NullProgressMonitor());
	}
	private void performSetUpRoutines() throws CoreException, IOException {
		WorkspaceHelper.setUpAsJavaProject(project, new NullProgressMonitor());
		setUpAsPluginProject();
		setUpAsCryptoAPIProject();
	}
	
	private void setUpAsCryptoAPIProject() throws CoreException, IOException {
		
	}
	private void setUpAsPluginProject() throws CoreException, IOException {
        setUpBuildProperties();
        setUpManifestFile();
        addContainerToBuildPath(project, "org.eclipse.pde.core.requiredPlugins");	
    }
	private void setUpBuildProperties() throws CoreException {
		logger.debug("Adding build.properties");
        new BuildPropertiesFileBuilder().createBuildProperties(project, new NullProgressMonitor());
	}
	private void setUpManifestFile() throws CoreException, IOException {
		logger.debug("Adding MANIFEST.MF");
		new ManifestFileUpdater().processManifest(project, manifest -> {
			boolean changed = false;
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.MANIFEST_VERSION, "1.0", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_MANIFEST_VERSION, "2", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_NAME, project.getName(), AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_SYMBOLIC_NAME, project.getName() + ";singleton:=true", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_VERSION, "1.0", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_VENDOR, "eMoflon IBeX", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_ACTIVATION_POLICY, "lazy", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.BUNDLE_EXECUTION_ENVIRONMENT, "JavaSE-1.8", AttributeUpdatePolicy.KEEP);
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.REQUIRE_BUNDLE, "ConfigToJavaImpl;bundle-version=\"1.0.0\"", AttributeUpdatePolicy.KEEP);
			return changed;
		});
	}
	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;

	}

	 private static void addContainerToBuildPath(final IJavaProject iJavaProject, final String container)
	   {
	      try
	      {
	         // Get current entries on the classpath
	         Collection<IClasspathEntry> classpathEntries = new ArrayList<>(Arrays.asList(iJavaProject.getRawClasspath()));

	         addContainerToBuildPath(classpathEntries, container);

	         setBuildPath(iJavaProject, classpathEntries);
	      } catch (JavaModelException e)
	      {
	         LogUtils.error(logger, e, "Unable to set classpath variable");
	      }
	   }
	 private static void setBuildPath(final IJavaProject javaProject, final Collection<IClasspathEntry> entries, final IProgressMonitor monitor)
	         throws JavaModelException
	   {
	      final SubMonitor subMon = SubMonitor.convert(monitor, "Set build path", 1);
	      // Create new buildpath
	      IClasspathEntry[] newEntries = new IClasspathEntry[entries.size()];
	      entries.toArray(newEntries);

	      // Set new classpath with added entries
	      javaProject.setRawClasspath(newEntries, subMon.newChild(1));
	   }

	   private static void setBuildPath(final IJavaProject javaProject, final Collection<IClasspathEntry> entries) throws JavaModelException
	   {
	      setBuildPath(javaProject, entries, new NullProgressMonitor());
	   }
   public static void addContainerToBuildPath(final IProject project, final String container)
   {
      addContainerToBuildPath(JavaCore.create(project), container);
   }
	private static void addContainerToBuildPath(final Collection<IClasspathEntry> classpathEntries, final String container)
	   {
	      IClasspathEntry entry = JavaCore.newContainerEntry(new Path(container));
	      for (IClasspathEntry iClasspathEntry : classpathEntries)
	      {
	         if (iClasspathEntry.getPath().equals(entry.getPath()))
	         {
	            // No need to add variable - already on classpath
	            return;
	         }
	      }

	      classpathEntries.add(entry);
	   }
}
