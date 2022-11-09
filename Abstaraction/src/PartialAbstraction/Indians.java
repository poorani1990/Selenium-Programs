package PartialAbstraction;

import org.example1.English;

//	Parent Class
public abstract class Indians extends English {

	public void aadharCard() {
		System.out.println("www.aadharcard.com");
	}
	
	public void panCard() {
	System.out.println("www.pancard.com");
	}
	
	public void voterId() {
	System.out.println("www.voterid.com");
	}
	
/* Above all three methods are common but the breakfast method is different for 
	north Indian and south Indians. So we are make it as abstract class
/ after typing abstract class {} and private will be removed	
/ abstract keyword have to added in the class name also	
	*/
	abstract void breakfast();
	
	}
