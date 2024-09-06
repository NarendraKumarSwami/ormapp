package ormapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
@NamedQueries({
	@NamedQuery(query = "SELECT e FROM Employee e WHERE e.salary >= :range", name="minimum salary list")
})
public class Employee {

	  @Id
      public Integer empId;
      
      public String name;
      
      public Double salary;
      
      
      
      public Employee() {
		// TODO Auto-generated constructor stub
	}

      
      


	public Employee(Integer empId, String name, Double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}





	public Integer getEmpId() {
		return empId;
	}



	public void setEmpId(Integer empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	
	



	public Double getSalary() {
		return salary;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
      
      
      
      
}
