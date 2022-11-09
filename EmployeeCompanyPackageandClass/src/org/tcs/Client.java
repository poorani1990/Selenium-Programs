//Package 2
package org.tcs;

import org.cts.Company;
import org.cts.Employee;

//Class Creation
public class Client {
//		Method Creation1
		public void clientName() {

			System.out.println("Client Name: Sam");
		}

//		Main Method Creation
		public static void main(String[] args) {
//			 Object Creation
			Client c = new Client();
			c.clientName();
//	Creating Object for package1 class2
			Employee e = new Employee();
			e.empName();
			e.empId();
//	Creating Object for package1 class1		
			Company co = new Company();
			co.companyName();
			co.companyId();

}
}