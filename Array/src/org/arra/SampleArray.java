package org.arra;
//Simple Array
public class SampleArray {
	
	public static void main(String[] args) {
		
//	Array Syntax: 
//	DataType Variable[] = new DataType[length];
		int a[] = new int[12];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 25;
		a[3] = 30;
		a[5] = 40;
		a[7] = 50;
		a[10] = 60;
		a[11] = 70;
	System.out.println(a[3]);
	
//	To get the length of the array
	int length = a.length;
	System.out.println(length);
	System.out.println("============================");
	
//	normal for loop
	for(int b=5; b<11; b++)
	{
		System.out.println(a[b]);
	}
	System.out.println("============================");
	
//	Enhanced for loop
	for(int c : a)
	{
		System.out.println(c);
	}
	
	
	}

}
