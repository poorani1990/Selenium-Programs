package FullyAbstraction;

//Child
public class HdfcBank implements WorldBank, RbiBank{

	@Override
	public void deposite() {
		System.out.println("Deposite: 12%");
		
	}

	@Override
	public void savings() {
		System.out.println("Savings: 10%");
		
	}

	@Override
	public void fixed() {
		System.out.println("Fixed: 8%");
		
	}
	
	private void loan() {
		System.out.println("Loan: 15 %");

	}
	
	public static void main(String[] args) {
		HdfcBank h =new HdfcBank();
		h.deposite();
		h.savings();
		h.fixed();
		h.loan();
	}

}
 