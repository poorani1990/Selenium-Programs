package org.college;

//Class Creation
public class College {
	
//	Method Creation1
	private void collegeName() {
		System.out.println("College Name : SRM");
}

//	Method Creation2
	private void collegeCode() {
		System.out.println("College Code : 101");
	}

//	Method Creation3
	private void collegeRank() {
		System.out.println("College Rank : 5");

	}

//	Main Method Creation
public static void main(String[] args) {
	
//	 Object Creation
	College co=new College();
	
//	Method Calling using Object
	co.collegeName();
	co.collegeCode();
	co.collegeRank();
	
// Call all the classes inside the Class1
	Student s = new Student();
	s.studentName();
	s.studentId();
	s.studentDept();
	
	Hostel h =new Hostel();
	h.hostelName();
	
	Dept d =new Dept();
	d.deptName();
}
}
