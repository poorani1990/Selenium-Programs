package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass3KeyDownShiftSendkeys {
	public static void main(String[] args) throws AWTException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtuser = driver.findElement(By.id("email"));
		Actions actions = new Actions(driver);
		
// shift -Down, values, shift - up
		actions.keyDown(Keys.SHIFT).sendKeys(txtuser, "welcome").keyUp(Keys.SHIFT).perform();
		
		

	}

}
