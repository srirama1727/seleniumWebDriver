package selenium01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderofExecution {
	
	@BeforeSuite
	public void beforeSuite() {

	    System.out.println("Suite Start");
	}

	@BeforeTest
	public void beforeTest() {

	    System.out.println("Test Start");
	}

	@BeforeClass
	public void beforeClass() {

	    System.out.println("Class Start");
	}

	@BeforeMethod
	public void beforeMethod() {

	    System.out.println("Method Start");
	}

	@Test
	public void login() {

	    System.out.println("Login Test");
	}

	@AfterMethod
	public void afterMethod() {

	    System.out.println("Method End");
	}

	@AfterClass
	public void afterClass() {

	    System.out.println("Class End");
	}

	@AfterTest
	public void afterTest() {

	    System.out.println("Test End");
	}

	@AfterSuite
	public void afterSuite() {

	    System.out.println("Suite End");
	}

}
