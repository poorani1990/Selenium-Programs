package org.col;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listsample {
	public static void main(String[] args) {

// To Create a List (OR) Obj
		List l = new ArrayList();
		l.add(10);
		l.add("Ram");
		l.add(20);
		l.add(true);
		l.add('d');
		l.add(20);
		l.add(40);

//	To print the list
		System.out.println(l);
//	To get the size of the list
		int size = l.size();
		System.out.println(size);

//	To get the specific value
		Object g = l.get(2);
		System.out.println(g);

//	To add the specific index
		l.add(2, 30);
		System.out.println(l);

//	To remove particular value
		Object r = l.remove(2);
		System.out.println(r);

//	to replace the value
		Object set = l.set(4, 70);
		System.out.println(set);
		System.out.println(l);

//	To get the index position of the particular value
		int io = l.indexOf(20);
		System.out.println(io);

//	To get the index position of the last value
		int la = l.lastIndexOf(40);
		System.out.println(la);

//	To check whether the list contains the particular value or not
		boolean s = l.contains("ram");
		System.out.println(s);

		System.out.println("=========================");

//	
		for (int i = 0; i < l.size(); i++) {
			Object o2 = l.get(i);
			System.out.println(o2);
		}
		System.out.println("==========================");

		for (Object o3 : l) {
			System.out.println(o3);
		}

//Generic method
		List<Integer> li = new LinkedList<Integer>();
		li.add(50);
		li.add(100);
		li.add(70);
		System.out.println(li);

//	To add all the values
		l.addAll(li);
		System.out.println(l);

		li.add(40);
		li.add(60);
		System.out.println(l);

//	To remove the common values
		l.removeAll(li);
		System.out.println(l);

//	To retain the common values
		l.retainAll(li);
		System.out.println(l);

	}
}
