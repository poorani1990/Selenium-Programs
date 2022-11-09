//Package 1
package org.cts;

//Class Creation
public class Employee {

//	Method Creation1
	public void empName() {
		System.out.println("Employee Name: Divya");

	}
//	Method Creation2
	public void empId() {
		System.out.println("Employee Id: 101");

	}

//	Main Method Creation
public static void main(String[] args) {
	
//	 Object Creation
	Employee a=new Employee();
	a. empName();
	a.empId();

//	Creating object for class1 inside Class2
		Company c =new Company();
		c.companyName();
		c.companyId();	
}
}