
package org.testng.example;

import org.testng.annotations.Test;

@Test
public class TestNG2 {

	@Test(priority = 2, description = "Learning Test NG ")
	public void test2() {
		System.out.print("Test case : 2 ");
	}

	@Test(priority = 3)
	public void helloTest() {
		System.out.print("Test case : 3");
	}

	@Test(priority = 4)
	public void firstTest() {
		System.out.print("Test case : 1");
	}

	@Test(priority = 1, description = "Learning Test NG 2")
	public void myTest() {
		System.out.print("Test case : 4 ");
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
