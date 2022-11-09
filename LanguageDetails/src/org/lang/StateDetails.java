package org.lang;

//import org.lang.LanguageInfo.StateDetails;
//	Class Creation
public class StateDetails {
//	Method Creation1
		private void northIndia() {
			System.out.println("State Details:");
			System.out.println("North India");
		}
//	 MEthod Creation2
		private void southIndia() {
			System.out.println("South India");
		}
		
//	Main Method Creation
		public static void main(String[] args) {
			
//	 Object Creation
			StateDetails s = new StateDetails();
			
//	Method Calling using Object
			s.northIndia();	
			s.southIndia();
		
// Creating Object for Class1 inside Class 2
		LanguageInfo l =new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		}
}
