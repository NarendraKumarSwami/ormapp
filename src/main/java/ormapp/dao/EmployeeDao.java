package ormapp.dao;

import java.util.List;

import ormapp.exception.EmployeeException;
import ormapp.model.Employee;

public interface EmployeeDao {
    
	
	public String addEmployee(Employee emp) throws EmployeeException;
	
	public Employee updateEmployeeName(Integer empId, String newName);
	
	
	public Employee deleteEmployee(Integer empid) throws EmployeeException;
	
	
	public List<Employee> getEmployeeWithRange(int range) throws EmployeeException;
	
	
	
}
