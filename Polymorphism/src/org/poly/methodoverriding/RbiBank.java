//Child Class

package org.poly.methodoverriding;

public class RbiBank extends WorldBank {
	
	@Override
	public void savings() {
		System.out.println("Savings: 15% "); 
	super.savings(); //Here, Savings value will be print from the Rbibank (15%) also the super class method will be executed after
	// this(18%)
	}
	
	@Override
	public void loan() {
			System.out.println("Loan: 12% "); //Here, loan value will be print from the Rbibank (12%) but the super class method
			// will be not be executed after this.
	//super.loan();
		}
	
	@Override
		public void deposite() {
			System.out.println("Deposite: 10% ");	
			super.deposite();
		}
		
		private void fixed() {
			System.out.println("Fixed: 8%");
		}

		
		public static void main(String[] args) {
			RbiBank r =new RbiBank();
			r.savings();
			r.loan();
			r.deposite();
			r.fixed();
					}
}
