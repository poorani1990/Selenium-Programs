package org.pom;

import org.junit.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class normalLogin extends BaseClass
{

	public static void main(String[] args) {
		browserLaunch("https://www.facebook.com/");
		// Creating object reference
		LoginPom a = new LoginPom();
		
		WebElement userName = a.getUserName();
		userName.sendKeys("Bala");
		
		WebElement password = a.getPassword();
		password.sendKeys("pass1");
		
		driver.navigate().refresh();
		
		userName.sendKeys("Bala2");
		password.sendKeys("pass2");
	}
}
