package com.kaleidoscope.usecase.showcase.second.artefactadapter;

import com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee;
import com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class EmployeeSerializer {
  public CharSequence employeeContainerToString(final EmployeeContainer c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Employee> _employees = c.getEmployees();
      for(final Employee e : _employees) {
        CharSequence _employeeToString = this.employeeToString(e);
        _builder.append(_employeeToString);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence employeeToString(final Employee p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Employee ");
    int _iD = p.getID();
    _builder.append(_iD);
    _builder.append(" {name ");
    String _name = p.getName();
    _builder.append(_name);
    _builder.append(" salary ");
    int _salary = p.getSalary();
    _builder.append(_salary);
    _builder.append("}");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
