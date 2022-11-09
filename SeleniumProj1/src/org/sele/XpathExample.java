package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
//		WebElement txtUser = driver.findElement(By.xpath("//input[@data-testid='royal_email']"));
//		txtUser.sendKeys("greens");
//		
//		WebElement pwd = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
//		pwd.sendKeys("pass@123");
//		
//		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
//		login.click();
		
		boolean logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(logo==true)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo not displayed");
		}
		
	}

}
