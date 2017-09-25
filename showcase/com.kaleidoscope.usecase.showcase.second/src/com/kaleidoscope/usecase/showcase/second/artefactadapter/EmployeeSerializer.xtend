package com.kaleidoscope.usecase.showcase.second.artefactadapter
import com.kaleidoscope.usecase.showcase.xtext.employeeDsl.Employee
import com.kaleidoscope.usecase.showcase.xtext.employeeDsl.EmployeeContainer

class EmployeeSerializer {
	
	def employeeContainerToString(EmployeeContainer c)
	'''
	«FOR e:c.employees»
	«employeeToString(e)»
	«ENDFOR»
	'''
	
	def employeeToString(Employee p)
	'''
	Employee «p.ID» {name «p.name» salary «p.salary»}
	'''
}