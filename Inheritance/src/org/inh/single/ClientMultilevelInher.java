//	Child Class
package org.inh.single;

//	CompanySingleInheritance called a grand parent class "EmployeeSingleInheritance"
//	ClientMultilevelInher calls parent class "CompanySingleInheritance"

public class ClientMultilevelInher extends CompanySingleInheritance {
	
	private void clientName() {
	System.out.println("Client Name: Sam");
				
	}

	public static void main(String[] args) {
		ClientMultilevelInher c = new ClientMultilevelInher();
		c.clientName();
		c.empName();
		c.empId();
		c.cmpName();
		c.cmpId();
	}
}
