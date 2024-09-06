package ormapp;

import java.util.List;
import java.util.Scanner;

import ormapp.dao.EmployeeDao;
import ormapp.dao.EmployeeDaoImpMysql;
import ormapp.exception.EmployeeException;
import ormapp.model.Employee;
import ormapp.service.EmployeeService;

public class App {
	
	
	public static void main(String[] args) {
		
	
		// add employee functionality
		
		Scanner sc = new Scanner(System.in);
		
		
		  
		  
		 System.out.println("To perfrom operation,  choose a options");
		 System.out.println("Add employee enter : 1 ");
		 System.out.println("Delete employee enter : 2");
		 System.out.println("Get List of employee with minimum slaray: 3");
		 
		  int num  = sc.nextInt();
		  
		  EmployeeService es = new EmployeeService(new EmployeeDaoImpMysql());
		  switch (num) {
		case 1:
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
			  
			  
			  
			  
			  String result = null;
			  
			  try {
				 result =  es.addEmployeeService(emp);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				
				System.out.println(e.getMessage());
				
				
				
				
			}
			break;
		case 2: 
			
			  System.out.println("Enter the employee id to delete :");
			   int id =  sc.nextInt();
			   
			    
			     
			try {
			    Employee emp1 =	es.deleteEmpService(id);
			    
			    System.out.println("delete emp : " + emp1);
			    
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 3 :
			System.out.println("Enter the minimum salary");
			 int salary1 =  sc.nextInt();
			
			
			 try {
			   List<Employee> emps =	es.getEmployeeWithSalaryRange(salary1);
			   
			      emps.forEach(System.out::println);
			      
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			 
		default:
			break;
		}
		
		  
		
		
	}

}
