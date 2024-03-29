
package org.testng.example;

import org.testng.annotations.Test;

@Test
public class TestNG {

	@Test(priority = 2, description = "Learning Test NG ",groups = { "fast" })
	public void test2() {
		System.out.println("Test case : 2 ");
	}

	@Test(priority = 3,groups = { "fast" })
	public void helloTest() {
		System.out.println("Test case : 3");
	}

	@Test(priority = 4,groups = { "fast" })
	public void firstTest() {
		System.out.print("Test case : 1");
	}

	@Test(priority = 1, description = "Learning Test NG 2",groups = { "slow" })
	public void myTest() {
		System.out.println("Test case : 4 ");
	}
	
	 
	 @Test(groups = { "fast" })
	 public void aFastTest() {
	   System.out.println("Fast test");
	 }
	 
	 @Test(groups = { "slow" })
	 public void aSlowTest() {
	    System.out.println("Slow test");
	 }

}
