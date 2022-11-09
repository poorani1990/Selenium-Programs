package org.junit;

public class ReturnClassC {

	public static void main(String[] args) {
		ReturnTypeClassA x = new ReturnTypeClassA();
		String add = x.add(10, 20);
		System.out.println(add);
		
		if(add.equals("Java"))
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	
	}
}
