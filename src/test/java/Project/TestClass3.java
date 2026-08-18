package Project;

import org.testng.annotations.Test;

public class TestClass3 extends BaseTest{
	
	@Test
	public void m5() {
		String s1 = "abc";
		String s2 = "def";
		if(!s1.equalsIgnoreCase(s2)) {
			app.reportFailure("Strings not equal", false);
		}
		else {
		app.softAssert.assertTrue(true);
		}
		app.reportFailure("Qty mismatch", false);
		app.assertAll();
	}
	
	@Test
	public void m6() {
		
		String s1 = "abc";
		String s2 = "def";
		if(!s1.equalsIgnoreCase(s2)) {
			app.reportFailure("Strings not equal", true);
		}
		else {
			app.softAssert.assertTrue(true);
		}
		app.reportFailure("Qty mismatch", false);
		app.assertAll();
		
	}
	

}
