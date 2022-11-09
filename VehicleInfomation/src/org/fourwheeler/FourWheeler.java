package org.fourwheeler;

public class FourWheeler {
	public void car() {
		System.out.println("Car: Audi ");

	}
	
	public void bus() {
		System.out.println("Bus: Benz ");

	}
	public void lorry() {
		System.out.println("Lorry: Volvo ");

	}
	public static void main(String[] args) {
		FourWheeler fw =new FourWheeler();
		fw.car();
		fw.bus();
		fw.lorry();
	}
}
