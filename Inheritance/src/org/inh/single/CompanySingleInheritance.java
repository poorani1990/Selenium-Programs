//	Parent Class

package org.inh.single;

//	extends used to call the parent class
public class CompanySingleInheritance  extends EmployeeSingleInheritance{

	public void cmpName() {
		System.out.println("Company Name: TCS");

	}
	
	public void cmpId() {
		
		System.out.println("Company id: 99");
	
	}
	
	public static void main(String[] args) {
		CompanySingleInheritance c =new CompanySingleInheritance();
		c.cmpName();
		c.cmpId();
		c.empName();
		c.empId();
		
		
	}
}
