package org.poly.methodoverloading;

public class CompanyDetails{

	private void companyInfo() {
	System.out.println("Company Info: " );
		
	}
	
	private void companyInfo(String name) {
		System.out.println("Company Name: "+name );
			
		}
	
	private void companyInfo(int code) {
		System.out.println("Company Code: "+code );
			
		}
	
	private void companyInfo(String state, String location) {
		System.out.println("Company State:" + state+"\nCompany location: "+location);
			
		}
	
	public static void main(String[] args) {
		CompanyDetails co =new CompanyDetails();
		co.companyInfo("HCL");
		co.companyInfo(101);
		co.companyInfo("Tamil Nadu","Chennai");
		
		

	}
}
