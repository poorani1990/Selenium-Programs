//	Polymorphism
package org.poly.methodoverloading;

//	Creating Class and Method
public class Employee {
	private void employeeDetails() {
		System.out.println("Enter employee details: ");
		
	}

//	Copying the existing method and changing/passing the arguments
	private void employeeDetails(String name) {
			System.out.println("Employee name: " + name);
			
		}

//	Copying the existing method and changing the different arguments

	private void employeeDetails(int age) {
		System.out.println("Employee age: "+age);
		
	}
	

//	Copying the existing method and changing the different arguments
	private void employeeDetails(int id, float weight) {
		System.out.println("Employee id: "+id+ "\nEmployee height: "+weight);
		
	}
	

//	Copying the existing method and changing the different arguments	
	private void employeeDetails(float height, int joiningYear) {
		System.out.println("Employee height: "+ height+"\nEmployee Joining Year"+joiningYear);
		
	}
	
//	Creating main method and pass

	public static void main(String[] args) {
		Employee e =new Employee();
		e.employeeDetails();
		e.employeeDetails("Sam");
		e.employeeDetails(25);
		e.employeeDetails(55, 50.5f);
		e.employeeDetails(5.5f, 2020);
		
			}


}
