package org.testng;

import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;


public class ParallelExecution extends BaseClass{
	
	
	@Test
		public void Test1() {
		
			System.out.println("ClassA Test1");
		}

		@Test
		public void Test2() {
			System.out.println("ClassA Test2");
		}

		@Test
		public void Test3() {
			System.out.println("ClassA Test3");
		}

		@Test
		public void Test4() {
			System.out.println("ClassA Test4");
		}

		}
