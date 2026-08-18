package ExtentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	//I. Since all these things should happen before test execution, this code is placed in onStart()
	public void onStart(ITestContext context) {
		
		//1. Configured UI of the report using ExtentSparkReporter class
		//Where we want to store the reports
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		
		sparkReporter.config().setDocumentTitle("Automation Report");//Title of the report
		sparkReporter.config().setReportName("Functional Testing");//Name of the report
		sparkReporter.config().setTheme(Theme.DARK);//theme of the report
		
		//2. Populating common info in the report using ExtentReports class
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("ComputerName", "localHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Siri");
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	//II. Once the template is ready, rest of the things will be placed in the report based on test status
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName()); //creates new entry in the report
		test.log(Status.PASS,"Testcase PASSED is: "+ result.getName()); //update P/F/S status
	}
	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName()); 
		test.log(Status.FAIL,"Testcase FAILED is: "+ result.getName());
		test.log(Status.FAIL,"Testcase FAILED because: "+ result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName()); 
		test.log(Status.SKIP,"Testcase SKIPPED is: "+ result.getName()); 
	}
	
	public void onFinish(ITestContext context){
		//what ever we have created above will be written in the report finally
		extent.flush();
	}
	
}
