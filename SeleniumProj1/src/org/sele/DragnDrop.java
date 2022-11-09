package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragnDrop {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().window().maximize();

//		Locating with Text
		WebElement src = driver.findElement(By.xpath("(//a [@class ='button button-orange'])[5]"));
		
//		Thread.sleep(3000);
//		
		WebElement dest = driver.findElement(By.xpath("(//li[@class ='placeholder'])[1]"));
//		
//		Creating object for actions class
		Actions action = new Actions(driver);
		
//	To perform Drag and Drop
	action.dragAndDrop(src, dest).perform();

		
	
	}

}
