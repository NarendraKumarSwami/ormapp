package ormapp.dao;

import ormapp.exception.EmployeeException;
import ormapp.model.Employee;

public interface EmployeeDao {
    
	
	public String addEmployee(Employee emp) throws EmployeeException;
	
	public Employee updateEmployeeName(Integer empId, String newName);
	
	
	public Employee deleteEmployee(Integer empid) throws EmployeeException;
	
	
}
