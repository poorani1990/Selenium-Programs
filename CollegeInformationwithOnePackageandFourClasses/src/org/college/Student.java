package org.college;

public class Student {
	
	void studentName() {
		System.out.println("Enter Student Name: Divya");
	}

	public void studentId() {
		System.out.println("Enter Student Id: 48");
	}
	
	public void studentDept() {
		System.out.println("Enter Student Dept: IT");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentId();
		s.studentDept();
	}
	
}
