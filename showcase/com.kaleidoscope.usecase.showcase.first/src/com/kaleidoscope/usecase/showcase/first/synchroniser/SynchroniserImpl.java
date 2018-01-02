package com.kaleidoscope.usecase.showcase.first.synchroniser;
import java.nio.file.Path;

import com.kaleidoscope.core.auxiliary.xmi.artefactadapter.XMIArtefactAdapter;
import com.kaleidoscope.core.delta.javabased.operational.AddEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.AttributeChangeOp;
import com.kaleidoscope.core.delta.javabased.operational.DeleteEdgeOp;
import com.kaleidoscope.core.delta.javabased.operational.OperationalDelta;
import com.kaleidoscope.core.framework.synchronisation.PersistentSynchroniser;

import Employees.Employee;
import Employees.EmployeeContainer;
import Employees.EmployeesFactory;
import Persons.Person;
import Persons.PersonContainer;
import Persons.PersonsFactory;


public class SynchroniserImpl implements PersistentSynchroniser<PersonContainer, EmployeeContainer, String, OperationalDelta, OperationalDelta, Path>{

	protected PersonContainer sourceModel;
	protected EmployeeContainer targetModel;
	protected String sourceModelFileName = ".src.xmi";
	protected String targetModelFileName = ".trg.xmi";
	
	public SynchroniserImpl(PersonContainer sourceModel, EmployeeContainer targetModel) {
		this.sourceModel = sourceModel;
		this.targetModel = targetModel;
	}
	@Override
	public PersonContainer getSourceModel() {	
		return sourceModel;
	}

	@Override
	public EmployeeContainer getTargetModel() {		
		return targetModel;
	}
	
	@Override
	public void syncForward(OperationalDelta operationalDelta) {
	
		if(operationalDelta == null || operationalDelta.getOperations().isEmpty()){
			return;
		}
  		operationalDelta.getOperations().forEach(o -> {
			if(o instanceof AddEdgeOp) {
				
 				AddEdgeOp op = (AddEdgeOp)o;
 				PersonContainer personContainer  = (PersonContainer)op.getEdge().getSrc();
				Person addedPerson = (Person)op.getEdge().getTrg();
				personContainer.getPersons().add(addedPerson);
				
				Employee employee = EmployeesFactory.eINSTANCE.createEmployee();
				employee.setName(addedPerson.getName());
				employee.setID(addedPerson.getID());		
				
				targetModel.getEmployees().add(employee);
			}
			else if(o instanceof DeleteEdgeOp) {
				DeleteEdgeOp op = (DeleteEdgeOp)o;
				Person deletePerson = (Person)op.getEdge().getTrg();
				sourceModel.getPersons().remove(deletePerson);
			
				Employee deleteEmployee  = targetModel.getEmployees().stream().filter(e -> e.getID() == deletePerson.getID()).findAny().orElse(null);
				targetModel.getEmployees().remove(deleteEmployee);
			}
			else if(o instanceof AttributeChangeOp) {
				AttributeChangeOp op = (AttributeChangeOp)o;
				
				Person changedPerson = (Person)op.getAffectedNode();
				Employee changedEmployee  = targetModel.getEmployees().stream().filter(e -> e.getID() == changedPerson.getID()).findAny().orElse(null);
				
				changedPerson.eSet(op.getAffectedAttribute(), op.getNewValue());
				
				if(op.getAffectedAttribute().getName().contentEquals("name")){
					changedEmployee.setName(changedPerson.getName());
				}
			}	
		});
	}

	@Override
	public void syncBackward(OperationalDelta operationalDelta) {
		
		if(operationalDelta == null || operationalDelta.getOperations().isEmpty()){
			return;
		}
		
		operationalDelta.getOperations().forEach(o -> {
			if(o instanceof AddEdgeOp) {
				
 				AddEdgeOp op = (AddEdgeOp)o;
 				EmployeeContainer employeeContainer  = (EmployeeContainer)op.getEdge().getSrc();
				Employee addedEmployee = (Employee)op.getEdge().getTrg();
				employeeContainer.getEmployees().add(addedEmployee);
				
				Person person = PersonsFactory.eINSTANCE.createPerson();
				person.setName(addedEmployee.getName());
				person.setID(addedEmployee.getID());
				sourceModel.getPersons().add(person);
			}
			else if(o instanceof DeleteEdgeOp) {
				DeleteEdgeOp op = (DeleteEdgeOp)o;
				Employee deleteEmployee= (Employee)op.getEdge().getTrg();
				targetModel.getEmployees().remove(deleteEmployee);
			
				Person deletePerson = sourceModel.getPersons().stream().filter(e -> e.getID() == deleteEmployee.getID()).findAny().orElse(null);
				sourceModel.getPersons().remove(deletePerson);
			}
			else if(o instanceof AttributeChangeOp) {
				AttributeChangeOp op = (AttributeChangeOp)o;
				
				Employee changedEmployee = (Employee)op.getAffectedNode();
				Person changedPerson = sourceModel.getPersons().stream().filter(e -> e.getID() == changedEmployee.getID()).findAny().orElse(null);
				
				changedEmployee.eSet(op.getAffectedAttribute(), op.getNewValue());
				
				if(op.getAffectedAttribute().getName().contentEquals("name")){
					changedPerson.setName(changedEmployee.getName());
				}
			}	
			
		});
	}

	@Override
	public OperationalDelta getFailedDelta() {
		return null;
	}

	@Override
	public void setUpdatePolicy(String updatePolicy) {
		
	}

	@Override
	public void initialise() {
		
	}

	@Override
	public void terminate() {
		
	}
	@Override
	public void restoreState(Path persistenceDirectory) {
		XMIArtefactAdapter<PersonContainer > sourceArtefactAdapter = new  XMIArtefactAdapter<PersonContainer>(persistenceDirectory.resolve(sourceModelFileName));
		sourceArtefactAdapter.parse();
		sourceModel = sourceArtefactAdapter.getModel().orElse(sourceModel);
		
		XMIArtefactAdapter<EmployeeContainer > targetArtefactAdapter = new  XMIArtefactAdapter<EmployeeContainer>(persistenceDirectory.resolve(targetModelFileName));
		targetArtefactAdapter .parse();
		targetModel = targetArtefactAdapter .getModel().orElse(targetModel);
	}

	@Override
	public void persistState(Path persistenceDirectory) {
		XMIArtefactAdapter<PersonContainer > sourceArtefactAdapter = new  XMIArtefactAdapter<PersonContainer>(persistenceDirectory.resolve(sourceModelFileName));
		sourceArtefactAdapter.setModel(sourceModel);
		sourceArtefactAdapter.unparse();
		
		XMIArtefactAdapter<EmployeeContainer > targetArtefactAdapter = new  XMIArtefactAdapter<EmployeeContainer>(persistenceDirectory.resolve(targetModelFileName));
		targetArtefactAdapter.setModel(targetModel);
		targetArtefactAdapter.unparse();
	}

}
