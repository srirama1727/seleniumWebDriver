package Project;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ApplicationKeywords {
	
	public SoftAssert softAssert;
	public ExtentTest test;
	//public boolean criticalFailureOccurred = false;
	
	public ApplicationKeywords() {
		softAssert = new SoftAssert();
	}
	
	//reporting function
		public void log(String msg) {
			System.out.println(msg);
			test.log(Status.INFO, msg);
		}
		
		//for reporting a failure
		public void reportFailure(String failureMsg, boolean stopOnFailure) {
			System.out.println("reportFailure Method");
			System.out.println(failureMsg);
			test.log(Status.FAIL, failureMsg); //writes a failure in extent reports
			softAssert.fail(failureMsg); //writes a failure in TestNG
			if(stopOnFailure) {
			//criticalFailureOccurred = true;
			Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");
			softAssert.assertAll(); //reports all the failures
			}
		}
		
		public void assertAll() {	
		   // if(!criticalFailureOccurred) {
		        softAssert.assertAll();
		    //}
		}
		
		public void setReport(ExtentTest test) {
			this.test = test;
		}
		
		public void assertTrue() {
			softAssert.assertTrue(true);
		}
		

	
}
