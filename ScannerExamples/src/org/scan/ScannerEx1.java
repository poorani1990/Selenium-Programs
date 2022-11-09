package org.scan;

import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your age");
		byte age = s.nextByte();
		System.out.println("Your age: "+age);
		
		System.out.println("Enter your joining year");
		short year = s.nextShort();
		System.out.println("Joining year: "+year);
		
		System.out.println("Enter your pin number");
		int pin = s.nextInt();
		System.out.println("Your pin number: "+pin);
		
		System.out.println("Enter your phone no");
		long phone = s.nextLong();
		System.out.println("Your phone no: " + phone);
		
		System.out.println("Enter your weight");
		float weight = s.nextFloat();
		System.out.println("Your weight: "+weight);
		
		System.out.println("Enter your height");
		double height = s.nextDouble();
		System.out.println("Your height: " + height);
		
		System.out.println("Sky is blue");
		boolean b = s.nextBoolean();
		System.out.println("Sky is blue: " + b);
		
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("Your name " + name);
		
		System.out.println("Enter your company name");
		s.nextLine();
		String cn = s.nextLine();
		System.out.println("Your company name " + cn);
	}

}
