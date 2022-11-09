package org.exc;

//Usage of Pojo class

public class Usage {
	
	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		e.setId(123);
		e.setName("Sam");
		
//		Encapsulation b = new Encapsulation();
//		b.setId(20);
//		b.setName("Saadvi");
		
//		Will work based on the object name assigned
		
		int id = e.getId();
		System.out.println(id);
		
		String name = e.getName();
		System.out.println(name);
		
	}

}
