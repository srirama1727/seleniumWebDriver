package Listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(Listener.class)
public class TestClass {
	
	@Test
	public void m1() {
		System.out.println("Passing TC");
		Assert.assertTrue(true);
	}
	
	@Test
	public void m2() {
		System.out.println("Failing TC");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "m2")
	public void m3() {
		System.out.println("Skipping TC");
	}
	

}
