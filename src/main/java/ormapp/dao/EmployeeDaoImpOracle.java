package ormapp.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import ormapp.connection.OracleEntityManager;
import ormapp.exception.EmployeeException;
import ormapp.model.Employee;

public class EmployeeDaoImpOracle implements EmployeeDao {

	@Override
	public String addEmployee(Employee emp) throws EmployeeException {
		// TODO Auto-generated method stub
		  EntityManager em = OracleEntityManager.getEntityManager();
		  
		EntityTransaction et =  em.getTransaction();
		
		try {
			et.begin();
			
			em.persist(emp);
			
			et.commit();
			
			return "Employee is added in Oracle database";
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
