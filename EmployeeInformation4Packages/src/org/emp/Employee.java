package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	
//	Method Creation1
	public void empName() {
		System.out.println("Employee Name: Divya");

	}
	
//	 Object Creation
	public static void main(String[] args) {
		Employee e=new Employee();
		e. empName();
	
// Object Creation for all the 4 packages and classes
	
		Company c=new Company();
		c. companyName();
		
		Client cl=new Client();
		cl.clientName();
		
		Project p=new Project();
		p.projectName();
	
	}
}
