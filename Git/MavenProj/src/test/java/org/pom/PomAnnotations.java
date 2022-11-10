package org.pom;

import org.junit.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PomAnnotations extends BaseClass {
	
//	Constructor Declaration	
	public PomAnnotations() {
	 PageFactory.initElements(driver, this);	
		
	}

	@FindBys({@FindBy(id="email"), @FindBy(xpath="//input[@id='email']")})
	private WebElement userName;
	
	@FindAll({@FindBy(id="pass"), @FindBy(xpath="//input[@id='email']")})
	private WebElement password;
	
//	RightClick -> Source -> Getters and Shutters
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	
	

}
