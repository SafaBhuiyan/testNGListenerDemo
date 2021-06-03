package com.testNGListenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("This is On Test  Start Method: "+ result.getName());
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("This is On Test Success: "+ result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This is On Test Failure: "+ result.getName());
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("This is On Test Skipped: "+ result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("This is On Start Test Class: "+"----->>>>>>>"+ context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is On Finish Test Class: "+"----->>>>>>>"+ context.getName());

	}

}
