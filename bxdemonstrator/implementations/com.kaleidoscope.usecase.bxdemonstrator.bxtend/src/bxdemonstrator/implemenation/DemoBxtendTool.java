package bxdemonstrator.implemenation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.ContinuableSynchroniser;

import GridLanguage.Block;
import GridLanguage.Grid;
import GridLanguage.GridLanguageFactory;
import KitchenLanguage.Kitchen;
import bxtendDemonstratorImpl.Transformation;
import bxtendDemonstratorImpl.rules.BxtendDemonstratorImplTransformation;
import bxtendDemonstratorImpl.rules.Elem2Elem;
import bxtendDemonstratorImpl.rules.SynchronizationError;


public class DemoBxtendTool  implements  ContinuableSynchroniser<Grid, Kitchen, List<String>, OperationalDelta, OperationalDelta>{
	
	private EObject source;
	private EObject target;
	private EObject corr;
	
	private OperationalDelta failedDelta;
	
	private Collection<EObject> root = new ArrayList<EObject>();
	private Copier objectMapping; 
	private OperationalDelta operationalJavaBasedDelta;

	ResourceSet set = null;
	
	public DemoBxtendTool(){
	
	}
	@Override
	public void initialize() {
		failedDelta = new OperationalDelta();	
		set = new ResourceSetImpl();
		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		source = initialiseGrid();
		sourceToTargetTransformation();
	}
	
	@Override
	public void terminate() {
		
	}
	@Override
	public OperationalDelta getFailedDelta() {
		return failedDelta;
	}
	@Override
	public Grid getSourceModel(){
		return (Grid)source;
	}
	@Override
	public Kitchen getTargetModel(){
		return (Kitchen)target;
	}
	
	@Override
	public void syncForward(OperationalDelta javaBasedDelta) {		
		clear();
		operationalJavaBasedDelta = javaBasedDelta;
		
		
		while(operationalJavaBasedDelta.getOperations().size() > 0) {
			updateConsistentState();
			
			try{
				operationalJavaBasedDelta.getOperations().get(0).executeOperation();
				Resource sourceRes = set.createResource(URI.createURI("sourceModel.kitchen"));
				Resource  targetRes = set.createResource(URI.createURI("targetModel.grid"));
				Resource corrRes = set.createResource(URI.createURI("corrModel.corr"));
				
				sourceRes.getContents().add(source);
				targetRes.getContents().add(target);
				corrRes.getContents().add(corr);
				
				BxtendDemonstratorImplTransformation f2pt =  new BxtendDemonstratorImplTransformation(sourceRes, targetRes, corrRes);
				f2pt.sourceToTarget();
				
			}catch(SynchronizationError r){
				rollback();
				failedDelta.addOperation(operationalJavaBasedDelta.getOperations().get(0));
				
			}
			operationalJavaBasedDelta.getOperations().remove(0);
			
			
			if(Elem2Elem.CONTINUATION.hasContinuation()){
				return;
			}
		}
		
	}
	@Override
	public void syncBackward(OperationalDelta javaBasedDelta) {	
		clear();
		operationalJavaBasedDelta = javaBasedDelta;
		
		while(operationalJavaBasedDelta.getOperations().size() > 0) {
			updateConsistentState();
			
			try{
				
				operationalJavaBasedDelta.getOperations().get(0).executeOperation();
				Resource sourceRes = set.createResource(URI.createURI("sourceModel.kitchen"));
				Resource  targetRes = set.createResource(URI.createURI("targetModel.grid"));
				Resource corrRes = set.createResource(URI.createURI("corrModel.corr"));
				
				sourceRes.getContents().add(source);
				targetRes.getContents().add(target);
				corrRes.getContents().add(corr);
				
				BxtendDemonstratorImplTransformation f2pt =  new BxtendDemonstratorImplTransformation(sourceRes, targetRes, corrRes);
				f2pt.targetToSource();
				
			}catch(SynchronizationError r){
				rollback();
				failedDelta.addOperation(operationalJavaBasedDelta.getOperations().get(0));				
			}
			
			operationalJavaBasedDelta.getOperations().remove(0);
			
			if(Elem2Elem.CONTINUATION.hasContinuation()){
				return;
			}
		}	
	}
	

	private void clear() {
		failedDelta = new OperationalDelta();	
	}
	
	private void sourceToTargetTransformation(){
		
		Resource sourceRes = set.createResource(URI.createURI("sourceModel.kitchen"));
		Resource  targetRes = set.createResource(URI.createURI("targetModel.grid"));
		Resource corrRes = set.createResource(URI.createURI("corrModel.corr"));
		sourceRes.getContents().add(source);
		
		BxtendDemonstratorImplTransformation f2pt =  new BxtendDemonstratorImplTransformation(sourceRes, targetRes, corrRes);
		f2pt.sourceToTarget();
		
		target = targetRes.getContents().get(0);
		corr = corrRes.getContents().get(0);		
	}

	@Override
	public boolean hasContinuation() {
		return Elem2Elem.CONTINUATION.hasContinuation();
	}
	@Override
	public List<String> getContinuationPolicy() {
		return Elem2Elem.CONTINUATION.getChoices().get();
	}
	@Override
	public void continueSync() {
		
		Elem2Elem.CONTINUATION.executeFunction();
		Elem2Elem.CONTINUATION.clear();
		
	}
	@Override
	public void setUpdatePolicy(List<String> updatePolicy) {
		Elem2Elem.CONTINUATION.setDecision(updatePolicy.get(0));
	}
	
	private Grid initialiseGrid() {
		//initialize grid with block structure
		Grid gridRoot = GridLanguageFactory.eINSTANCE.createGrid();
		int noOfBlocks = 5;
		gridRoot.setBlockSize((double)500/noOfBlocks);
		
		Block topLeft = createTopLeft(gridRoot);
		createFirstRow(gridRoot, topLeft, noOfBlocks);
		createFirstCol(gridRoot, topLeft, noOfBlocks);
		createInternalBlocks(gridRoot, topLeft, noOfBlocks);
		
		return gridRoot;
	}

	private Block createTopLeft(Grid gridRoot) {
		Block block = GridLanguageFactory.eINSTANCE.createBlock();
		block.setXIndex(0);
		block.setYIndex(0);
		gridRoot.getBlocks().add(block);
		
		return block;
	}

	private void createFirstRow(Grid gridRoot, Block topLeft, int noOfBlocks) {
		Block west = topLeft;
		for (int i = 1; i < noOfBlocks; i++) {
			Block block = GridLanguageFactory.eINSTANCE.createBlock();
			block.setXIndex(i);
			block.setYIndex(0);
			block.setW(west);
			gridRoot.getBlocks().add(block);
			
			west = block;
		}
	}
	
	private void createFirstCol(Grid gridRoot, Block topLeft, int noOfBlocks) {
		Block north = topLeft;
		for (int i = 1; i < noOfBlocks; i++) {
			Block block = GridLanguageFactory.eINSTANCE.createBlock();
			block.setXIndex(0);
			block.setYIndex(i);
			block.setN(north);
			gridRoot.getBlocks().add(block);
			
			north = block;
		}
	}
	
	private void createInternalBlocks(Grid gridRoot, Block topLeft, int noOfBlocks) {
		Block northwest = topLeft;
		Block north = northwest.getE();
		Block west = northwest.getS();
		for (int i = 1; i < noOfBlocks; i++) {
			
			for (int j = 1; j < noOfBlocks; j++) {
				Block block = GridLanguageFactory.eINSTANCE.createBlock();
				block.setXIndex(j);
				block.setYIndex(i);
				block.setNw(northwest);
				block.setN(north);
				block.setW(west);
				gridRoot.getBlocks().add(block);
				
				northwest = north;
				north = northwest.getE();
				west = block;
			}
			
				topLeft = topLeft.getS();
				northwest = topLeft;
				north = northwest.getE();
				west = northwest.getS();
			
		}
	}
	
	
	
	public void updateConsistentState() {
		List<EObject> copy = new ArrayList<EObject>();
		copy.add(source);
		copy.add(target);
		copy.add(corr);	
		copy.add(operationalJavaBasedDelta.toEMF());
		root = EcoreUtil.copyAll(copy);
		
		objectMapping = new Copier();
		root = objectMapping.copyAll(copy);
		objectMapping.copyReferences(); 
	}
	
	private void rollback() {
		EObject oldSrc = root.stream().filter(o -> o instanceof Grid).findFirst().get();
		EObject oldTrg = root.stream().filter(o -> o instanceof Kitchen).findFirst().get();
		EObject oldCorr = root.stream().filter(o -> o instanceof Transformation).findFirst().get();
		EObject oldDelta = root.stream().filter(o -> o instanceof KaleidoscopeDelta.OperationalDelta).findFirst().get();
		
		source.eResource().getContents().add(oldSrc);
		source.eResource().getContents().remove(source);
		source = oldSrc;
		
		target.eResource().getContents().add(oldTrg);
		target.eResource().getContents().remove(target);
		target = oldTrg;
		
		corr.eResource().getContents().add(oldCorr);
		corr.eResource().getContents().remove(corr);
		corr = (Transformation) oldCorr;
		
		operationalJavaBasedDelta = OperationalDelta.fromEMF((KaleidoscopeDelta.OperationalDelta)oldDelta);
		System.out.println("Performed rollback!");
	}
}
