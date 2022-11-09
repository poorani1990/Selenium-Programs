package org.str;

public class Types {
	public static void main(String[] args) {
//		Literal String
		String s = "java";
		String s1 = "java";
		String s2 = "sql";
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("===========================");
	
//		Non-Literal String
		String s3 = new String("phython");
		String s4 = new String("phython");
		
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println("===========================");
	
//		Immutable String
		String s5 = "Selenium";
//		String s6 = "Selenium";
		String s6 = "Maven";
		
		String Concat = s5.concat(s6);
		System.out.println(Concat);

		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		System.out.println(System.identityHashCode(Concat));
		
		System.out.println("===============================");
		
//		Mutable String
		
		StringBuilder s7 = new StringBuilder("King");
		StringBuilder s8 = new StringBuilder("Queen");
		
		StringBuilder append = s7.append(s8);
		System.out.println(append);
		
		System.out.println(System.identityHashCode(s7));
		System.out.println(System.identityHashCode(s8));
		System.out.println(System.identityHashCode(append));
		
		System.out.println("=======================");
//		Empty String
		String s9 = "";
		System.out.println(System.identityHashCode(s9));
		
		System.out.println("=================================");
		
// 		null String
		String s10 = null;
		System.out.println(System.identityHashCode(s10));
		
		System.out.println("==================================");

}
}
