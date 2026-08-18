package Project;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class BaseTest {
	
	public ApplicationKeywords app;
	public ExtentReports rep;
	public ExtentTest test;

	@BeforeTest
	public void BeforeTest(ITestContext con) {
		System.out.println("------Before Test-----");
		app = new ApplicationKeywords();
		con.setAttribute("app", app);
		rep = ExtentManager.getReports();
		test = rep.createTest(con.getCurrentXmlTest().getName());
		app.setReport(test);
		System.out.println("Starting test: "+con.getCurrentXmlTest().getName());
		test.log(Status.INFO,"Starting test: "+con.getCurrentXmlTest().getName() );
		con.setAttribute("rep",rep);
		con.setAttribute("test",test);
	}
	
	@BeforeMethod
	public void BeforeMethod(ITestContext con) {
		System.out.println("------Before Method--------------");
		test = (ExtentTest)con.getAttribute("test");
		String criticalFailure = (String)con.getAttribute("criticalFailure");
		if(criticalFailure != null && criticalFailure.equals("Y")) {
			test.log(Status.SKIP, "Critical failure in previous tests");
			//skip in TestNG
			throw new SkipException("Critical failure in previous tests");
		}
		app = (ApplicationKeywords)con.getAttribute("app");
		app.softAssert = new SoftAssert();
		rep = (ExtentReports)con.getAttribute("rep");
	}
	
	/*@AfterMethod
	public void afterMethod(ITestContext con) {

	    app = (ApplicationKeywords) con.getAttribute("app");

	    if (!app.criticalFailureOccurred) {
	        app.assertAll();
	    }
	}*/
	
	@AfterTest
	public void quit(ITestContext con) {
		System.out.println("-----After Test-----");
		rep = (ExtentReports)con.getAttribute("rep");
		if(rep !=null) {
			rep.flush();
		}
 
	}
	

}
