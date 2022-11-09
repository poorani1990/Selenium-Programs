package org.com;
//Switch Case

public class SwitchCase {

	public static void main(String[] args) {
		
//Switch

		int dish = 3;

		switch (dish) {
		case 1: {

			System.out.println("Dosa");
			break;	
		}
			

		case 2: {

			System.out.println("Pongal");
			break;
		}
			
		case 3: {

			System.out.println("Briyani");
			break;
		}
			
		default:
			System.out.println(" Invalid value between 3");
		}
	}
}
