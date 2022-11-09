//	Child2 Class
package org.hierachical;

//	Child 2 has to call Parent class not a Child 1 class
//	ClientHierarchical calls parent class "EmployeeHierarchical"

public class ClientHierarchical extends EmployeeHierarchical {
	
	private void clientName() {
	System.out.println("Client Name: Sam");
				
	}

	public static void main(String[] args) {
		ClientHierarchical c = new ClientHierarchical();
		c.clientName();
		c.empName();
		c.empId();
	}
}
