package org.exec;

import java.lang.Exception;

public class ExceptionPrint {

	public static void main(String[] args) {

//		PrintstackTrace Exception --> Thow an exception while giving infinite value ex: 4/0

		System.out.println("Start");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4 / 0);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
			
			System.out.println(e.getMessage());
			
			System.out.println("Don't try to divide number by zero");
		} 
		
		finally {
			System.out.println("Exception Handled");
		}
		
		System.out.println(5);
		System.out.println(6);
		System.out.println("End");

	}

}