package com.kaleidoscope.usecase.showcase.third.deltaadapter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.workflow.adapters.DeltaAdapter;

public class XMIDeltaAdapter<Model> implements DeltaAdapter<OperationalDelta, Path, Model> {
	private final static Logger logger = Logger.getLogger(XMIDeltaAdapter.class); 
	private Path path;
	
	public XMIDeltaAdapter(Path path) {
		this.path = path;
	}
	
	public XMIDeltaAdapter() {
		
	}
	
	@Override
	public OperationalDelta parse(Path path, Model m) {
		logger.debug("Parsing to XMI");
		try {
			File file = path.toFile();
			Path fileName = path.getFileName();
		
			File genFile = path.getParent().resolve(Paths.get("gen", fileName.toString())).toFile();  
			FileUtils.copyFile(file, genFile);
			  
			Resource genResource = ((EObject)m).eResource().getResourceSet().createResource(URI.createFileURI(genFile.getAbsolutePath()));	
			genResource.load(null);
		
			KaleidoscopeDelta.OperationalDelta opDelta = (KaleidoscopeDelta.OperationalDelta)genResource.getContents().get(0);	
			OperationalDelta operationalDelta = OperationalDelta.fromEMF(opDelta);
			
			return operationalDelta;
		} catch (IOException e) {	
			logger.error("Not able to load the XMI file from " + path);			
		}catch(ClassCastException e){			
			logger.error("Not able to cast " + path + " to required type: " + e.getMessage());
		}
		
		return new OperationalDelta();
	}

	@Override
	public Path unparse(OperationalDelta d, Model a) {
		logger.debug("Starting to unparse XMI");
		try {
			File file = path.toFile();  
			Resource resource = ((EObject)a).eResource().getResourceSet().createResource(URI.createFileURI(file.getAbsolutePath()));	
			
			resource.getContents().add((EObject)d.toEMF());
			resource.save(null);			
	
			logger.debug("XMI Resource saved!");
		} catch (IOException | ClassCastException e) {
			logger.error("Not able to save XMI resource: " + e.getMessage());					
		}		
		
		return path;
	}

}
