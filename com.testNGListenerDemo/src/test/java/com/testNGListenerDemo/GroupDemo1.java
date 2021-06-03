package com.testNGListenerDemo;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(TestNGListener.class)
public class GroupDemo1 {
	
	
	@Test(priority=1, groups= {"Smoke", "windows.Sanity"})
	public void test1() {
		System.out.println("This is class-1 and test-1");
	}
	@Test(priority=2, groups= {"Regression"})
	public void test2() {
		System.out.println("This is class-1 and test-2");
		Assert.assertEquals(5, 3);
	}

	@Test(priority=3, groups= {"Sanity", "Smoke"}, dependsOnMethods={"test2"})
	public void test3() {
		System.out.println("This is class-1 and test-3");
	}
	
	@Test(priority=4, groups= {"Sanity", "Regression"})
	public void test4() {
		System.out.println("This is class-1 and test-4");
	}
	

}
