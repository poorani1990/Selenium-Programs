package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions action=new Actions(driver);
		
		//	To perform Rightclick
		action.contextClick(gmail).perform();
	}

}
