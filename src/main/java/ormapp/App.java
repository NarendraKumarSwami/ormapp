package ormapp;

import java.util.Scanner;

import ormapp.connection.MysqlEntityManager;
import ormapp.dao.EmployeeDao;
import ormapp.dao.EmployeeDaoImpMysql;
import ormapp.exception.EmployeeException;
import ormapp.model.Employee;
import ormapp.service.EmployeeService;

public class App {
	
	
	public static void main(String[] args) {
		
	
		// add employee functionality
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Add Employee :");
		
		System.out.println("enter the employee id: ");
		int empId =	sc.nextInt();
		
		 sc.nextLine();
		System.out.println("enter the name of employee: ");
		String name =	sc.nextLine();
		
		System.out.println("enter the salary of employee: ");
		Double salary =	sc.nextDouble();
		
		
		
	     
	     
		// employee model  --
		  Employee emp = new Employee(empId, name, salary);
		  
		  
		  // service layer 
		  EmployeeDao empDao = new EmployeeDaoImpMysql();
		  
		  
		  EmployeeService empService = new EmployeeService(empDao);
		  
		  String result = null;
		  
		  try {
			 result =  empService.addEmployeeService(emp);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			
			
			
			
		}
		  
		  
		
		  
		
		
	}

}
