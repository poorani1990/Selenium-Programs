package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("Skills"));
		
//	Creating object for Select
		Select obj = new Select(ele);
		
		
//	Select by index
//		obj.selectByIndex(10);
		
//	Select by value
//	obj.selectByValue("Android");
		
//	Select by text
		obj.selectByVisibleText("Data Analytics");
			
		
			}

}

