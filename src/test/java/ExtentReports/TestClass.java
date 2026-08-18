package ExtentReports;

import org.testng.Assert;
import org.testng.annotations.Test;

//@Listeners(Listener.class)
public class TestClass {
	
	@Test(priority=1)
	public void m1() {
		System.out.println("Passing TC");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void m2() {
		System.out.println("Failing TC");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "m2")
	public void m3() {
		System.out.println("Skipping TC");
	}
	

}
