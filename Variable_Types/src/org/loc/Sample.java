package org.loc;
//	Parent Class
//	Instance Variable
public class Sample  {

//	Declaring variable outside the method
	public int age;
	
	public void add() {
		
		int a =10;
		System.out.println(a);
		
	}
	
	public static void main(String[] args) {
		Sample l = new Sample();
		l.add();
		
		System.out.println(l.age);
	}

}
