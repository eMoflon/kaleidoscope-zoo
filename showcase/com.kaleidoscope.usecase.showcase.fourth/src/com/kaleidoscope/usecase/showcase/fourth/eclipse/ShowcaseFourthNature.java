package com.kaleidoscope.usecase.showcase.fourth.eclipse;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.PlatformUI;

import com.kaleidoscope.util.BuildPath;
import com.kaleidoscope.util.BuildPropertiesFileBuilder;
import com.kaleidoscope.util.LogUtils;
import com.kaleidoscope.util.WorkspaceHelper;
import com.kaleidoscope.util.manifest.ManifestFileUpdater;
import com.kaleidoscope.util.manifest.ManifestFileUpdater.AttributeUpdatePolicy;
import com.kaleidoscope.util.manifest.PluginManifestConstants;

public class ShowcaseFourthNature implements IProjectNature {
	public static final String SHOWCASE_API_NATURE_ID = "com.kaleidoscope.usecase.showcase.fourth.nature";
	protected static final Logger logger = Logger.getLogger(WorkspaceHelper.class);
	protected IProject project;
	
	public ShowcaseFourthNature() {
		
	}
	
	@Override
	public void configure() throws CoreException {
		PlatformUI.getWorkbench().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					performSetUpRoutines();
				} catch (CoreException | IOException e) {
					LogUtils.error(logger, e);
				}
			}

		});
	}
	
	protected void performSetUpRoutines() throws CoreException, IOException {
		WorkspaceHelper.setUpAsJavaProject(project, new NullProgressMonitor());
		setUpAsPluginProject();
	}
	
	protected void setUpAsPluginProject() throws CoreException, IOException {
        setUpBuildProperties();
        setUpManifestFile();
        BuildPath.addContainerToBuildPath(project, "org.eclipse.pde.core.requiredPlugins");	
    }
	protected void setUpBuildProperties() throws CoreException {
		logger.debug("Adding build.properties");
        new BuildPropertiesFileBuilder().createBuildProperties(project, new NullProgressMonitor());
	}
	protected void setUpManifestFile() throws CoreException, IOException {
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
			changed |= ManifestFileUpdater.updateAttribute(manifest, PluginManifestConstants.REQUIRE_BUNDLE, "com.kaleidoscope.core.delta;bundle-version=\"1.0.0\",\r\n" + 
					" com.kaleidoscope.usecase.showcase.metamodel.employee;bundle-version=\"1.0.0\",\r\n" + 
					" com.kaleidoscope.usecase.showcase.metamodel.person;bundle-version=\"1.0.0\",\r\n" + 
					" com.kaleidoscope.core.aux.xmi" +
					" org.eclipse.emf.ecore.xmi;bundle-version=\"2.13.0\",\r\n" + 
					" com.kaleidoscope.usecase.showcase.first;bundle-version=\"1.0.0\",\r\n" + 
					" org.apache.log4j;bundle-version=\"1.2.15\",\r\n" + 
					" com.google.inject;bundle-version=\"3.0.0\",\r\n" +
					" javax.inject;bundle-version=\"1.0.0\",\r\n" + 
					" com.kaleidoscope.usecase.showcase.fourth;bundle-version=\"1.0.0\",\r\n" + 
					" com.kaleidoscope.core.framework;bundle-version=\"1.0.0\"", AttributeUpdatePolicy.KEEP);
			
			return changed;
		});
	}
	
	@Override
	public void deconfigure() throws CoreException {
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;

	}
}
