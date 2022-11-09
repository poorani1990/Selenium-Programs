//Parent Class
//Super Class
package org.poly.methodoverriding;

public class WorldBank {

	public void savings() {
		System.out.println("Saving: 18% ");	
	}
	
	public void loan() {
		System.out.println("Loan: 15% ");	
	}
	public void deposite() {
		System.out.println("Deposite: 12% ");	
	}
	
	public static void main(String[] args) {
		WorldBank w =new WorldBank();
		w.savings();
		w.loan();
		w.deposite();
	}
}
