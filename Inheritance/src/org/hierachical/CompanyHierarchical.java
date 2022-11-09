//	Child1 Class

package org.hierachical;

//	extends used to call the parent class
public class CompanyHierarchical  extends EmployeeHierarchical{

	public void cmpName() {
		System.out.println("Company Name: TCS");

	}
	
	public void cmpId() {
		
		System.out.println("Company id: 99");
	
	}
	
	public static void main(String[] args) {
		CompanyHierarchical c =new CompanyHierarchical();
		c.cmpName();
		c.cmpId();
		c.empName();
		c.empId();
		
		
	}
}
