package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Adding2Test {

@BeforeSuite
private void tc_1() {
	System.out.println("ClassA tc_1@@BeforeSuite");

}

@AfterSuite
private void tc_2() {
	System.out.println("ClassA tc_2@AfterSuite");

}

@BeforeTest
private void tc_3() {
	System.out.println("ClassA tc_3@BeforeTest");

}

@AfterTest
private void tc_4() {
	System.out.println("ClassA tc_4@AfterTest");

}

@BeforeClass
private void tc_5() {
	System.out.println("ClassA tc_5@BeforeClass");

}


@AfterClass
private void tc_6() {
	System.out.println("ClassA tc_6@AfterClass");

}

@Test
private void tc_7() {
	System.out.println("ClassA tc_7@Test");
}

@Test
private void tc_8() {
	System.out.println("ClassA tc_8@Test");
}
@BeforeMethod
private void tc_10() {
	System.out.println("ClassA tc_10@BeforeMethod");

}

@AfterMethod
private void tc_9() {
	System.out.println("ClassA tc_9@AfterMethod");

}
}
