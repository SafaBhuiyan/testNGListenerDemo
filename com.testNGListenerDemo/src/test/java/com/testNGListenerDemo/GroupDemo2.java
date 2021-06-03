package com.testNGListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDemo2 {
	
	
	@Test(priority=1, groups= {"Smoke"})
	public void test1() {
		System.out.println("This is class-2 and test-1");
	}
	@Test(priority=2, groups= {"Regression"}, dependsOnMethods={"test4"})
	public void test2() {
		System.out.println("This is class-2 and test-2");
	}

	@Test(priority=3, groups= {"Sanity", "windows.Regression"})
	public void test3() {
		System.out.println("This is class-2 and test-3");
	}
	
	@Test(priority=4, groups= {"Sanity", "Regression"})
	public void test4() {
		System.out.println("This is class-2 and test-4");
		Assert.assertEquals(2, 3);
	}


}
