package org.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SuitcaseB {
	
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

	

}
