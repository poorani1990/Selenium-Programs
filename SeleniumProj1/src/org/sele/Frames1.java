package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Frames1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.manage().window().maximize();
		
//	To enter into Frames 
		List<WebElement> frame1 = driver.findElements(By.tagName("iframe"));

//	TO find the size of the frame
		int size = frame1.size();
		System.out.println(size);

//	To switch into the first frame
		driver.switchTo().frame(0);
		
		WebElement txtbox = driver.findElement(By.tagName("input"));
		txtbox.sendKeys("Sam");
		
//	Switch into next frame inside the frame0
		
		driver.switchTo().frame("frame3");
		
		driver.findElement(By.id("a")).click();
		
//	To move to the next frame, comeout from the default frame
		driver.switchTo().defaultContent();
		
//	Moving to next frame
		driver.switchTo().frame("frame2");
		
//	Select the value from the dropdown
		WebElement dd = driver.findElement(By.id("animals"));
		Select ele = new Select(dd);
		ele.selectByIndex(2);
	
		
	
	}
}
