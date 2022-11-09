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

public class AlertSendKeys {
	public static void main(String[] args) throws AWTException, InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text() ='Alert with Textbox ']")).click();	
				
		WebElement prompt = driver.findElement(By.xpath("//button[text() ='click the button to demonstrate the prompt box ']"));
		prompt.click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
	
		
		alert.sendKeys("Poorani");
//		String attribute = prompt.getAttribute("value");
//		System.out.println(attribute);
//		
	
//		alert.accept();
//		alert.dismiss();
	
			}

}

