package org.lang.singleinher;

//	Class Creation
public class StateDetails extends LanguageInfo{
	
//	Method Creation1
		private void northIndia() {
			System.out.println("State Details:");
			System.out.println("North India");
		}
		
//	 Method Creation2
		private void southIndia() {
			System.out.println("South India");
		}
		
//	Main Method Creation
		public static void main(String[] args) {
			
//	 Object Creation
			StateDetails s = new StateDetails();
			
//	Method Calling using Object
		s.tamilLanguage();
		s.englishLanguage();
		s.hindiLanguage();
		s.northIndia();	
		s.southIndia();
		}
}
