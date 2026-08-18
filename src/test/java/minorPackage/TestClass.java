package minorPackage;

import org.testng.ITestContext;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass {
	
	SoftAssert ast = new SoftAssert();
	
	@Test
	public void m1(ITestContext con) {
		ast.fail("Failed TC");
		
		String s = (String) con.getAttribute("myname");
		System.out.println("value of s is "+s);
		
		ast.assertAll();
	}

}
