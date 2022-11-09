package org.tcs;

public class ConstructorChaining extends ChildClass {

	public ConstructorChaining(){
		this(25);
		System.out.println("Child Default Constructor");
	}
	
//	Constructor Overloading
	
	public ConstructorChaining(int age)
// this used to call the constructor within the class
	{	this("Sam");
		System.out.println("Paramerterized Constructor:" +age);
	}

	public ConstructorChaining(String name)
// super used to call the constructor within the class
	{	super(101);
		System.out.println("Paramerterized Constructor:" +name);
	}

	public static void main(String[] args) {
		ConstructorChaining c = new ConstructorChaining();
		
		
	}

}
