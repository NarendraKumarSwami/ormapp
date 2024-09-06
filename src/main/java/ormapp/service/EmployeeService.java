package ormapp.service;

import ormapp.dao.EmployeeDao;
import ormapp.exception.EmployeeException;
import ormapp.model.Employee;

public class EmployeeService {
	
	public EmployeeDao empDao;
	
	public EmployeeService(EmployeeDao empDao) {
		
		this.empDao = empDao;
		
	}
	
	  
	public String addEmployeeService(Employee emp) throws EmployeeException {
		
		
		
		//  
		
		
		
		return empDao.addEmployee(emp);
	}

	
	
	public Employee deleteEmpService(Integer empid) throws EmployeeException {
		
		   return  empDao.deleteEmployee(empid);
	}
	
	
}
