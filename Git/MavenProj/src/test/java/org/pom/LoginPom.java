package org.pom;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPom extends BaseClass {
	
//	Constructor Declaration	
	public LoginPom() {
	 PageFactory.initElements(driver, this);	
		
	}
	
//	POM Annotations	
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement password;
	
	//	RightClick -> Source -> Getters and Shutters
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	
	

}
