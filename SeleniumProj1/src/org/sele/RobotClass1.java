package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass1 {
	public static void main(String[] args) throws AWTException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		
		Actions action=new Actions(driver);
		
//	To perform Rightclick
		action.contextClick(gmail).perform();
		
//	Robot class
		Robot robot = new Robot();
		
////	To Press Down
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		
////	To Press Enter
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
// For loop to avoid using keypress for multiple times
		
		for (int i = 1;i<=2; i++) {
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		
//	Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
