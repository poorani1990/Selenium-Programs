package org.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class AnnotationsFlipkart extends BaseClass {
	
	@BeforeClass	
	public static void test1() {
		browserLaunch("https://www.flipkart.com/");
		System.out.println("Annotations @BeforeClass");
	}

	@Before	
	public void test2() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println("Annotations @Before");
	}
	
	
	@Test
	public void test3() throws InterruptedException {
		Thread.sleep(3000);
		userName("(//input[@type='text'])[2]").sendKeys("Bala");
		findPwd("//input[@type='password']").sendKeys("bala@123");
		submitButton("(//button[@type='submit'])[2]").click();
		System.out.println("Annotations @Test");

	}
	
	
	@After	
	public void test4() {
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		System.out.println("Annotations @After");
	}
	
	@AfterClass
	public static void test5() {
	//	driver.close();
		System.out.println("Annotations @AfterClass");
	}
	
}
