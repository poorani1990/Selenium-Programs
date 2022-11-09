package org.exec;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NestedTry {

	public static void main(String[] args) {

//		Arithmetic Exception --> Thow an exception while giving infinite value ex: 4/0

		System.out.println("Start");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/2);
			try
			{
				System.out.println(4/0);
			}
			catch (NullPointerException e)
			{
				System.out.println("inner: Don't try to divide a number by zero");
			}
			finally {
				System.out.println("inner: Exception Handled");
			}
		} 
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Don't try to perform any action beyond string's index");
		}
		catch (NullPointerException e)
		{
			System.out.println("Don't try to fetch the value from the null string");
		}

		catch (ArithmeticException e) {
			System.out.println("outer: Don't try to divide number by zero");
		} finally {
			System.out.println("outer: Exception Handled");
		}
		System.out.println(5);
		System.out.println(6);
		System.out.println("End");

	}
}