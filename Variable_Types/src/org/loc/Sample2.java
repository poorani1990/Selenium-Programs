package org.loc;
//	Child Class
//	Instance Variable
public class Sample2 extends Sample  {

//	Calling the variable outside the class (example for with extends)
	
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		
		System.out.println(s.age);
	
	
//	Example for without extends
	Sample l = new Sample();
	System.out.println(l.age);
		

	}	
}


