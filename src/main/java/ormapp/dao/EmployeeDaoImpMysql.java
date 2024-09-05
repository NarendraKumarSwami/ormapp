package ormapp.dao;

import jakarta.persistence.EntityManager;
import ormapp.connection.MysqlEntityManager;
import ormapp.exception.EmployeeException;
import ormapp.model.Employee;

public class EmployeeDaoImpMysql  implements EmployeeDao {
	
	
	

	@Override
	public String addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		
		// Entity Manager 
		 EntityManager em =   MysqlEntityManager.getEntityManager();
		 
		 try {
			 em.getTransaction().begin();
			 
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
    
	
	
}
