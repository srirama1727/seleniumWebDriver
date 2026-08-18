package ProjectNew;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class TestClass1 extends BaseTest{
	
	@Test
	public void m1() {
		String s1 = "abc";
		String s2 = "abc";
		if(!s1.equalsIgnoreCase(s2)) {
			app.reportFailure("Strings not equal", false);
		}
		else {
		app.assertTrue();
		test.log(Status.PASS,"m1() is passed");
		}
		app.assertAll();
	}
	
	@Test
	public void m2() {
		String s1 = "abc";
		String s2 = "abc";
		if(!s1.equalsIgnoreCase(s2)) {
			app.reportFailure("Strings not equal", false);
		}
		else {
		app.assertTrue();
		test.log(Status.PASS,"m2() is passed");
		}
		app.assertAll();
	}
}
