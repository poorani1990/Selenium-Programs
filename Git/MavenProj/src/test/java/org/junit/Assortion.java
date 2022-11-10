package org.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assortion {
	
	@Test
	public void Test1() {
		System.out.println("ClassB Test1");
	}

	@Test
	public void Test2() {
		System.out.println("ClassB Test2");
	}
	
	@Ignore
	@Test
	public void Test3() {
		System.out.println("ClassB Test3");
	}

	@Test
	public void Test4() {
		System.out.println("ClassB Test4");
	}

	@Test
	public void Test5() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("bala");
		
		String attribute = findElement.getAttribute("value");
		
		Assert.assertTrue(attribute.equals("bala"));
		Assert.assertEquals("ba", attribute);
		Assert.assertEquals("ClassB test5", "ba", attribute);
		
		System.out.println("ClassB Test5");
	
		
	}

}
