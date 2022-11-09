package org.arra;

public class TwoDimensionalArray {
	public static void main(String[] args) {

//	Datatype variable[][] = new DataType[size][size]		

		int a[][] = new int[2][2];

		a[0][0] = 10;
		a[0][1] = 20;
		a[1][0] = 30;
		a[1][1] = 40;
		System.out.println(a[0][1]);

//To find the length of the array
		int length = a.length;
		System.out.println(length);
		System.out.println("===============");

		for (int i = 0; i < a.length; i++) { // row
			for (int j = 0; j < a.length; j++) { // column
				System.out.println(a[i][j]);

			}

		}

	}

}
