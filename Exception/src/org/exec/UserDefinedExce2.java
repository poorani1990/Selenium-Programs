package org.exec; 


public class UserDefinedExce2 

{
	public static void main(String[] args) throws UserDefinedException 
	
	{
		String id = "2876";
		
		if (id.startsWith("28")) {
			
			System.out.println("My Employee");
			
		}
		
		else
		{
			System.out.println("Not My Employee");
			throw new UserDefinedException();
		}
	System.out.println("Salary Crdited: " +id);
	
	}
	
}
