package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		
		List<WebElement> ele = driver.findElements(By.tagName("iframe"));
		int size = ele.size();
		System.out.println(size);
		
		driver.switchTo().frame(0);
		WebElement input = driver.findElement(By.tagName("input"));
		input.sendKeys("Sam");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().parentFrame();
		input.clear();
		input.sendKeys("Saadvi");
		
		
	}

}
