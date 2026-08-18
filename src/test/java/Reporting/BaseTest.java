package Reporting;

import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class BaseTest {
	
	SoftAssert sa;
	
	@BeforeTest
	public void init() {
		sa = new SoftAssert();
	}

}
