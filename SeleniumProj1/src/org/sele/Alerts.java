package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {
	public static void main(String[] args) throws AWTException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//button[@onclick ='alertbox()']"));	
		btn.click();
		
		Alert alert = driver.switchTo().alert();
		
		String a1 = alert.getText();
		System.out.println(a1);
		alert.accept();
	
			}

}

