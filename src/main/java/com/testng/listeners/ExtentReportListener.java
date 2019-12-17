package com.testng.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ExtentReportListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("The name of the test is starting ..."+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the test is passed ..."+result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("The name of the test is faillure ..."+result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the test is skipped ..."+result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		Reporter.log("The name of the test is started...."+context.getName(), true);
	}

	public void onFinish(ITestContext context) {
		Reporter.log("The name of the test is finished...."+context.getName(), true);
	}

}
