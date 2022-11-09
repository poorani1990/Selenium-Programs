package org.exec;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exception {
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
//	Interrupted Exception
		System.out.println("Hello");
		Thread.sleep(300);
		System.out.println("World");
		
//	IO Exception--> we will not get exception if we enter any value inside the string""
		File f = new File("yeah");
		f.createNewFile();
		
//	AWT Exception--> this exception can be added in class name
		Robot robot = new Robot();
		
//	Arithmetic Exception --> Thow an exception while giving infinite value ex: 4/0
		System.out.println("Start");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0);
		System.out.println(5);
		System.out.println(6);
		System.out.println("End");

//	NULL Pointer Exception --> if we are giving string value instead of null we will not get this exception
		String s = null;
		
		char charAt = s.charAt(2);
		System.out.println(charAt);
		
//	StringIndexOutofBoundsException --> we will get an exception if we are giving charAt(8)-> outof the limit
	String s1 = "Java";
		
		char ca = s1.charAt(2);
		System.out.println(ca);
		
//	ArrayIndexOutofBoundsException --> we will get an exception if we are giving a[8]-> outof the limit
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 10;
		a[2] = 10;
		a[3] = 10;
		a[4] = 10;
		
		System.out.println(a[4]);
	
//	IndexOutofBoundsException -->--> we will get an exception if we are giving value outof the limit
		List l =	new LinkedList();
		l.add(10);
		l.add("Surya");
		l.add('d');
		
		Object obj = l.get(8);
		System.out.println(obj);
		
//	InputMismatchException --> --> we will get an exception while giving input value as string instead of int
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Your age: "+age);
		
//	NumberFormatException --> we will not get this exception if we are giving only integer or string value
		String sn = "2345poi";
		int con = Integer.parseInt(sn);
		System.out.println(con);		

	}

}
