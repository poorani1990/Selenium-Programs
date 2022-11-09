package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.greenstechnologys.com/");

		driver.manage().window().maximize();

//		Locating with Text
		WebElement course = driver.findElement(By.xpath("//a[text() = 'COURSES']"));
	
//	Creating object for action class
		Actions actions = new Actions(driver);
		
//	Mouse Over action
		actions.moveToElement(course).perform();
		
		WebElement oracle = driver.findElement(By.xpath("//span[text() ='Oracle Training ']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(oracle).perform();
		
	
	}

}
