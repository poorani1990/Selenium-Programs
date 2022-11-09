package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DdOptionsnGetText {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.id("Skills"));
		
//	Creating object for Select and get the size of the dropdown
		Select obj = new Select(ele);
//		List<WebElement> options = obj.getOptions();
//		
//		int size = options.size();
//		System.out.println(size);
		
//	To get particular option text from the dropdown
		
		List<WebElement> options = obj.getOptions();
		WebElement element = options.get(10);
		String text = element.getText();
		System.out.println(text);
//		
//	To get all the options text from dropdown
//		List<WebElement> options = obj.getOptions();
//		for(int i=0; i<options.size();i++)
//		{
//			WebElement element = options.get(i);
//			String text = element.getText();
//			System.out.println(text);
//		}
		}
			}



