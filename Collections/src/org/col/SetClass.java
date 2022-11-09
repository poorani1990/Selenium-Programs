package org.col;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {

public static void main(String[] args) {
	Set<String> s = new TreeSet();
	
	
//	String will display the value based on the ASCII code. display the value based
//	on the data type
	s.add("10");
	s.add("ram");
	s.add("20");
	s.add("xavier");
	s.add("leo");
	s.add("King");
	s.add("leo");
	s.add("Trim");
	
	System.out.println(s);
	
//	To get the size of the set
	int s1 = s.size();
	System.out.println(s1);
	
//	To check whether the set contains particular value or not
	boolean c = s.contains("xavier");
	System.out.println(c);
	
//	 To remove the particular value
	boolean re = s.remove("leo");
	System.out.println(re);
	System.out.println(s);
	
//	To iterate the value
	for(Object o : s)
	{
			System.out.println(o);
	}
	
	
	List l = new ArrayList();
	
	l.add("ram");
	l.add("xavier");
	l.add("Tommy");
	System.out.println(l);
	
//	To add all the values to the list
	s.addAll(l);
	System.out.println(s);
	
//	To remove common values
//	s.removeAll(l);
//	System.out.println(s);
	 
//	To retain common values
	s.retainAll(l);
	System.out.println(s);
	

	
}


}
