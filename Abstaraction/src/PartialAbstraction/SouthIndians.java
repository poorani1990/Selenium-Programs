package PartialAbstraction;

public class SouthIndians extends NorthIndian{

	@Override
	void breakfast() {
		System.out.println("Idly/Dosa");
		
	}
	
	private void dressing() {
		System.out.println("Dothis and Sarees");

	}
	
	public static void main(String[] args) {
		SouthIndians s =new SouthIndians();
		s.breakfast();
		s.dressing();
		s.aadharCard();
		s.panCard();
		s.voterId();
		s.langu();
		s.northBreakfast();
	}

	@Override
	void northBreakfast() {
		System.out.println("North Indian Breakfast: Chappathi");
		
	}
	
	

}
