package org.exc;

import java.util.ArrayList;
import java.util.List;

public class UserDefLinkedList {

	public static void main(String[] args) {
		
		Encapsulation a = new Encapsulation();
		a.setId(123);
		a.setName("Sam");
		
		Encapsulation b = new Encapsulation();
		b.setId(20);
		b.setName("Saadvi");
		
		Encapsulation c= new Encapsulation();
		c.setId(30);
		c.setName("Dinesh");
		
//	User Defined List , Encapsulation is class name used instead of using generic class name
		List<Encapsulation> l = new ArrayList();
		l.add(a);
		l.add(b);
		l.add(c);
		
		for(int i=0;i<l.size();i++)
		{
			Encapsulation enc = l.get(i);
			
		int id = enc.getId();
		System.out.println(id);

		String name = enc.getName();
		System.out.println(name);
		}
	}
}
