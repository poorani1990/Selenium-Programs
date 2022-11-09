package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DdSelectMultiple {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("cars"));
		
//	Creating object for Select and get the size of the dropdown
		Select obj = new Select(ele);
		
////	Multiple Select
//		obj.selectByIndex(1);
//		obj.selectByValue("audi");
//		obj.selectByVisibleText("Saab");
		
//	To select all the options from the dropdown and print the text
		List<WebElement> options = obj.getOptions();
		for(WebElement element:options)
		{
			String text = element.getText();
			System.out.println(text);
		
		}


	
	
	
	}
			}



