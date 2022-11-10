package org.junit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClassInstagram {

		static WebDriver driver;
		public static void browserLaunch(String url) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
		}

//		Method1
		
		public WebElement findUserName(String name) {
		
			WebElement element = driver.findElement(By.name(name));
			return element;
				}

//		Method2
		public void sendValues(WebElement element,String data) 
		{
		element.sendKeys(data);
		}
		
//		Method3
		public WebElement findPassword(String name) {
			
			WebElement password = driver.findElement(By.name(name));
			return password;
		}
		
//		Method4
		public void sendPassword(WebElement password, String data) {
			password.sendKeys(data);

		}
		
//		Method5
//		public WebElement login(String name) {
//			
//			WebElement login = driver.findElement(By.name(name));
//			return login;
//		}
//		
}
