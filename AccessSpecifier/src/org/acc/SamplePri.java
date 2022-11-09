package org.acc;

public class SamplePri extends EmployeePri{
	
	 	
	public static void main(String[] args) {
		
//		With extends
		SamplePri s =new SamplePri();
		s.add();
		
		
//	Without Extends
		EmployeePri e = new EmployeePri();
		e.add();
	}

}
