package org.exec;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {

//		Arithmetic Exception --> Thow an exception while giving infinite value ex: 4/0

		System.out.println("Start");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Don't try to divide number by zero");
		} finally {
			System.out.println("Exception Handled");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println("End");

//			NULL Pointer Exception --> if we are giving string value instead of null we will not get this exception
		String s = null;

		try {
			char charAt = s.charAt(2);
		} catch (NullPointerException e) {
			System.out.println("Don't try to fetch the value from NULL string");
		} finally {
			System.out.println("Exception Handled");
		}

//			StringIndexOutofBoundsException --> we will get an exception if we are giving charAt(8)-> outof the limit
		String s1 = "Java";
		try {
			char ca = s1.charAt(5);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Don't try to get the string value");
		} finally {
			System.out.println("Exception Handled");
		}

//				ArrayIndexOutofBoundsException --> we will get an exception if we are giving a[8]-> outof the limit
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 10;
		a[2] = 10;
		a[3] = 10;
		a[4] = 10;
		List l = new LinkedList();
		l.add(10);
		l.add("Surya");
		l.add('d');
		try {
			System.out.println(a[4]);
			Object obj = l.get(8);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Don't try to fetch the value out of array index");
		} catch (IndexOutOfBoundsException e) {
//	IndexOutofBoundsException -->--> we will get an exception if we are giving value outof the limit

			System.out.println("Don't try to fetch the value out of  index");

		} finally {
			System.out.println("Exception Handled");
		}

//			InputMismatchException --> --> we will get an exception while giving input value as string instead of int
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");

//			NumberFormatException --> we will not get this exception if we are giving only integer or string value
		String sn = "2345poi";

		try {
			int age = sc.nextInt();
			int con = Integer.parseInt(sn);
		} catch (InputMismatchException e) {
			System.out.println("Don't enter age in string format");
		}

		catch (NumberFormatException e) {
			System.out.println("Don't enter a value in alpha numeric order");
		}
	}

}
