package org.builder;

import java.util.Optional;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.EObject;

import com.kaleidoscope.extensionpoint.ArtefactAdapter;

/**
 * @author Dusko
 *
 */
public interface Builder {

	
	void transformConfig(Optional<Consumer<EObject>>targetModelPostProcessing);
	void transformSimpleJava();
	public void syncCode();
	public void syncConfig();
	public void persistModels(String pathOfCorrModel, String pathForSyncProtocolModel, String pathForSrcModel, String pathForTargetModel);
	
	public void setSourceEditor(ArtefactAdapter sourceEditor);
	public void setTargetEditor(ArtefactAdapter targetEditor);
	
	
	public String getCorrModelPath();
	public void setCorrModelPath(String corrModelPath);
	
	public String getDeltaPath();
	public void setDeltaPath(String deltaPath);
	
	public String getSyncProtocolPath();
	public void setSyncProtocolPath(String syncProtocolPath);
}
