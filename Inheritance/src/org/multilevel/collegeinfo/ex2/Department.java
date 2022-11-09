//	Child1 Class
package org.multilevel.collegeinfo.ex2;

public class Department extends Hostel {
	
	private void deptName() {
	System.out.println("Department Name: IT");
				
	}

	public static void main(String[] args) {
		Department d = new Department();
		d.collegeName();
		d.collegeCode();
		d.collegeRank();
		d.studentName();
		d.studentId();
		d.studentDept();
		d.hostelName();
		d.deptName();
		
	}
}
