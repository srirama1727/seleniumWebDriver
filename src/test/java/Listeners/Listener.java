package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
		public void onStart(ITestContext context) {
			System.out.println("Starting test execution");
			System.out.println(context.getName());
		}
		
		public void onFinish(ITestContext context) {
			System.out.println("Finishing test execution");
			
		}
	
	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("STARTED: " + result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("PASSED: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("FAILED: " + result.getName());
	        System.out.println(result.getThrowable());
	        // Here you can add screenshot code in Selenium
	        //System.out.println("Screenshot captured for: " + result.getName());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        System.out.println("SKIPPED: " + result.getName());
	    }

}
