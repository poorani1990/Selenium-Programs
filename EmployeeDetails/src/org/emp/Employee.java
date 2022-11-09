package org.emp;

public class Employee {

	private void empName() {
		System.out.println("Employee Name: Divya");

	}
	private void empId() {
		System.out.println("Employee Id: 101");

	}
private void empDob() {
	System.out.println("Employee Date of birth: 13/July/2000");

}
	private void empPhone() {
		System.out.println("Employee Phone number: 0988888888");

	}
	private void empEmail() {
		System.out.println("Employee E-mail: Test@gmail.com");

	}
	private void empAddress() {
		System.out.println("Employee Address: Chennai");

	}
public static void main(String[] args) {
	Employee a=new Employee();
	a. empName();
	a.empId();
	a.empDob();
	a.empPhone();
	a.empAddress();
}
}
