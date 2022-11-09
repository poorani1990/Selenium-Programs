package org.company;

public class CompanyInfo {

private void companyName() {

	System.out.println("Company Name: CTS");
}
private void companyId() {

	System.out.println("Company id: 101");
}
private void companyAddress() {

	System.out.println("Company Address: Perungudi");
}
public static void main(String[] args) {
	CompanyInfo c = new CompanyInfo();
	c.companyName();
	c.companyId();
	c.companyAddress();
}

}
