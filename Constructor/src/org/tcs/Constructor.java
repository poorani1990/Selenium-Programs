package org.tcs;

public class Constructor {

	public Constructor() {
		System.out.println("Default Constructor");
	}
	
//	Constructor Overloading
	
	public Constructor(int age)
	{
		System.out.println("Paramerterized Constructor:" +age);
	}

	public Constructor(String name)
	{
		System.out.println("Paramerterized Constructor:" +name);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor d= new Constructor("Sam");
		Constructor e = new Constructor(25);
		
	}

}
