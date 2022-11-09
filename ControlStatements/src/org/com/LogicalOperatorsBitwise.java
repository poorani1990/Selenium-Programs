package org.com;
//Logical Operators && ||
public class LogicalOperatorsBitwise {

	public static void main(String[] args) {
		
//	 else if ladder
		
		int a=10, b=20, c=30;
		
// 
		if (a>b & a>c) {
		System.out.println("a is greater");	
		}
//		
		else if (b>a & b>c) {
			System.out.println("b is greater");	
			}
//		
		else if (c>a & c>b) {
			System.out.println("c is greater");	
			}
//		
		else {
			System.out.println("nothing is greater");	
			}
	}
}
