package ormapp.dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import ormapp.connection.MysqlEntityManager;
import ormapp.exception.EmployeeException;
import ormapp.model.Employee;

public class EmployeeDaoImpMysql  implements EmployeeDao {
	
	public EntityManager em;
	
	public EmployeeDaoImpMysql() {
		
		 em =   MysqlEntityManager.getEntityManager();
		
	}

	@Override
	public String addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		
		
		 
		 
		 try {
			 em.getTransaction().begin();
			 
			 em.merge(emp);
			 
			 
			 em.merge(emp);
			 
			 
			
			 
			 em.getTransaction().commit();
			 
			 return "Employee is save";
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new EmployeeException(e.getMessage());
		}
		
		 
		
	}

	@Override
	public Employee updateEmployeeName(Integer empId, String newName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteEmployee(Integer empid) throws EmployeeException {
		// TODO Auto-generated method stub
		
//		En
		
	       Employee emp =  em.find(Employee.class, empid);
	       
	       
	       if(emp != null) {
	    	     em.getTransaction().begin();
	    	     
	    	     em.remove(emp);
	    	     
	    	     em.getTransaction().commit();
	    	     
	    	     em.close();
	    	     
	    	     return emp;
	       }else {
	    	   throw new EmployeeException("There is no employee with this id : "+ empid);
	       }
		
	}

	@Override
	public List<Employee> getEmployeeWithRange(int range) throws EmployeeException {
		// TODO Auto-generated method stub
		
//		Query query = em.createQuery("SELECT e FROM Employee e WHERE e.salary >= :range ");
//		
//		query.setParameter("range", range);
//		
//		  
//		
//		 List<Employee> list =  (List<Employee>)query.getResultList();
		
		
//		 Query q = em.createNamedQuery("minimum salary list");
//		 
//		 q.setParameter("range", range);
//		 
//		  List<Employee> list =   (List<Employee> ) q.getResultList();
		
		
	  Query q =	em.createNativeQuery("SELECT * FROM employee e where e.salary>= ?1", Employee.class);
	  
	     q.setParameter(1, range);
	     
	   List<Employee> list =   ( List<Employee>)   q.getResultList();
		 
		return list;
	}
    
	
	
	
}
