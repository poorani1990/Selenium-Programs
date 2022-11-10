package org.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotations extends BaseClass{

	@BeforeClass
	
	public static void test1() {
		browserLaunch("https://www.facebook.com/");
		System.out.println("Annotations @Before Class");
	}
	
	@Before
	public void test2() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println("Annotations @Before");
	}

	@Test
	public void test3() {
		findUserName("email").sendKeys("hello");
		findPassword("pass").sendKeys("hello@123");
		login("login").click();
	}
	@After
	public void test4() {
		long endtime = System.currentTimeMillis();
		System.out.println(endtime);
		System.out.println("Annotations @After");
	}

	@AfterClass
	public static void test5() {
//		driver.close();
		System.out.println("Annotations @AfterClass");
		
	}
}
	


