package org.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationsInstagram extends BaseClassInstagram {
	
	@BeforeClass	
	public static void test1() {
		browserLaunch("https://www.instagram.com/accounts/login/");
		System.out.println("Annotations @BeforeClass");
	}

	@Before	
	public void test2() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println("Annotations @Before");
	}
	
	
	@Test
	public void test3() {
		findUserName("username").sendKeys("Bala");
		findPassword("password").sendKeys("bala@123");
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
