//Parent Class
package org.example1.Telugu;

import org.example1.English.English;

public class Telugu extends English {
	public void teluguLanguage() {
			System.out.println("Telugu Language");
			}
	public static void main(String[] args) {
		Telugu t =new Telugu();
		t.allLanguage();
		t.tamilLanguage();
		t.englishLanguage();
		t.teluguLanguage();
		
	}
}
