package org.benchmarx.examples.familiestopersons.implementations.funnyqt;

import java.io.File;

import org.benchmarx.Configurator;
import org.benchmarx.emf.Comparator;
import org.benchmarx.examples.familiestopersons.testsuite.Decisions;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.persons.core.PersonsComparator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.Synchroniser;

import Families.FamiliesFactory;
import Families.FamilyRegister;
import Persons.PersonRegister;
import clojure.java.api.Clojure;
import clojure.lang.IFn;
import clojure.lang.Keyword;

/**
 * Driver for the FunnyQT solution.
 * 
 * @see <a href"https://github.com/tsdh/ttc17-families2persons-bx">The soution's
 *      source code</a>
 *
 * @author Dr. Tassilo Horn &lt;tsdh@gnu.org&gt;
 */
public class FunnyQTFamiliesToPersonKaleidoscope implements Synchroniser<
												FamilyRegister, 
												PersonRegister, 
												Configurator<Decisions>, 
												OperationalDelta, 
												OperationalDelta
												>    {

    private static final String RESULTPATH = "results/funnyqt";

    private Resource srcModel;
    private Resource trgModel;

    private Configurator<Decisions> configurator;

    private final static IFn T; // Transform
    private final static IFn V; // Visualize
    private final static IFn S; // Save
    private final static Keyword LEFT = (Keyword) Clojure.read(":left");
    private final static Keyword RIGHT = (Keyword) Clojure.read(":right");

    static {
        final String transformationNamespace = "ttc17-families2persons-bx.core";
        final String emfNamespace = "funnyqt.emf";
        final String visualizationNamespace = "funnyqt.visualization";

        final IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read(emfNamespace));
        require.invoke(Clojure.read(visualizationNamespace));
        require.invoke(Clojure.read(transformationNamespace));

        T = Clojure.var(transformationNamespace, "families2persons");
        V = Clojure.var(visualizationNamespace, "print-model");
        S = Clojure.var(emfNamespace, "save-resource");
    }

    public FunnyQTFamiliesToPersonKaleidoscope() {
        this(new FamiliesComparator(), new PersonsComparator());
    }

    public FunnyQTFamiliesToPersonKaleidoscope(Comparator<FamilyRegister> src,
            Comparator<PersonRegister> trg) {
        
    }

    private void transform(Keyword direction) {
        T.invoke(srcModel, trgModel, direction,
                configurator.decide(Decisions.PREFER_CREATING_PARENT_TO_CHILD),
                configurator.decide(Decisions.PREFER_EXISTING_FAMILY_TO_NEW));
    }

    
    public String getName() {
        return "FunnyQT";
    }

    @Override
    public void initialise() {
        srcModel = new XMIResourceImpl();
        trgModel = new XMIResourceImpl();

        FamilyRegister familiesRoot = FamiliesFactory.eINSTANCE
                .createFamilyRegister();
        srcModel.getContents().add(familiesRoot);

        setUpdatePolicy(new Configurator<Decisions>()
                .makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true)
                .makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true));

        transform(RIGHT);
    }

    @Override
    public void syncForward(OperationalDelta srcDelta) {
    	srcDelta.transformToOpaqueDelta().execute(getSourceModel());        
        transform(RIGHT);
    }

    @Override
    public void syncBackward(OperationalDelta trgDelta) {
    	trgDelta.transformToOpaqueDelta().execute(getTargetModel());
        transform(LEFT);
    }

  
    @Override
    public void setUpdatePolicy(Configurator<Decisions> configurator) {
        this.configurator = configurator;
    }

    @Override
    public FamilyRegister getSourceModel() {
        return (FamilyRegister) srcModel.getContents().get(0);
    }

    @Override
    public PersonRegister getTargetModel() {
        return (PersonRegister) trgModel.getContents().get(0);
    }

    
    public void saveModels(String name) {
        V.invoke(srcModel, RESULTPATH + File.separator + name + "-source.pdf");
        V.invoke(trgModel, RESULTPATH + File.separator + name + "-target.pdf");
        S.invoke(srcModel, RESULTPATH + File.separator + name + "-source.xmi");
        S.invoke(trgModel, RESULTPATH + File.separator + name + "-target.xmi");
    }

	

	@Override
	public OperationalDelta getFailedDelta() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void terminate() {
		// TODO Auto-generated method stub
		
	}
}
