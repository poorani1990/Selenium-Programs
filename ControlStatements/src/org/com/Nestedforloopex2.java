package org.com;

public class Nestedforloopex2 {
//nested for

//
	public static void main(String[] args) {
//			step - 1	 2	  8
		for (int i = 0; i <= 4; i++) {// outer for
//						3		4	6
			for (int j = 0; j <= -4; j++) {

//								5	
				System.out.println(j);
			}
//							7
			System.out.println(i);
		}
	}
}