package org.tcs;

public class ChildClass {

	public ChildClass() {
		
		System.out.println("Parent Default Constructor");
	}
	
//	Constructor Overloading
	
	public ChildClass(int id)
	{	this();
		System.out.println("Paramerterized Constructor:" +id);
	}

	public static void main(String[] args) {
		ChildClass c = new ChildClass();
		
		
	}

}
