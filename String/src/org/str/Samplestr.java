package org.str;

public class Samplestr {

	public static void main(String[] args) {
		String s = "Java";
		String s1 = "JAVA";
		String s2 = "welcome to java class";
		String s3 = "  hi hello  ";
		String s4 = "";
		
//	Return type ctrl+2, l

//	To find the length of the variable
		int length = s.length();
		System.out.println(length);
		
//	To convert from lower to upper case
		String up=s.toUpperCase();
		System.out.println(up);

// To covert from upper case to lower case
	String lo =s.toLowerCase();
	System.out.println(lo);
	
//	To get a index position of particular letter
	int io = s.indexOf('a');
	System.out.println(io);
	
//	To get a particular character from string by using index
	char ip =s.charAt(2);
	System.out.println(ip);
	
//	 To Compare the two strings with case sensitive
	boolean eq = s.equals(s1);
	System.out.println(eq);
	
//	 To Compare the two strings without case sensitive		
	boolean eq1 =s.equalsIgnoreCase(s1);
	System.out.println(eq1);
	
// 	To check the given value is present or not
	boolean pr=s.contains(s1);
	System.out.println(pr);
	
//	To replace the values
	String re = s.replace('v', 'a');
	System.out.println(re);
	
	String re1 = s.replace("av", "va");
	System.out.println(re1);
	
//	To check whether the string start with the particular value or not
	boolean st = s2.startsWith("welcome");
	System.out.println(st);
	
//	To check whether the string end with the particular value or not
	boolean st1 = s2.endsWith("class");
	System.out.println(st1);

//	To check whether the string is empty or not
	boolean em = s4.isEmpty();
	System.out.println(em);
	
//	To remove the unwanted space from java
	String tr = s2.trim();
	System.out.println(tr);

//	To split the string value
	String[] split = s2.split(" ");
	System.out.println(split[0]);
	System.out.println(split[1]);
	System.out.println(split[2]);
	System.out.println(split[3]);
	
//	To get the value from the specific index
	String si =s2.substring(5);
	System.out.println(si);
	
//	To get the value between the specific index
	String ss =s2.substring(5, 12);
	System.out.println(ss);
	}
	
}
