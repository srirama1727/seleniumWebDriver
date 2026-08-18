package ProjectNew;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class TestClass2 extends BaseTest{
	
	@Test
	public void m3() {
		System.out.println("m3 method");
		String s1 = "abc";
		String s2 = "abc";
		if(!s1.equalsIgnoreCase(s2)) {
			app.reportFailure("Strings not equal", false);
		}
		else {
		app.assertTrue();
		test.log(Status.PASS,"m3() is passed");
		}
		app.assertAll();
	}
	
	@Test
	public void m4() {
		String s1 = "abc";
		String s2 = "abc";
		if(!s1.equalsIgnoreCase(s2)) {
			app.reportFailure("Strings not equal", false);
		}
		else {
		app.assertTrue();
		test.log(Status.PASS,"m4() is passed");
		}
		app.assertAll();
	}
	

}
