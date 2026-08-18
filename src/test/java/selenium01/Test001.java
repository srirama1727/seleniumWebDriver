package selenium01;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test001 {
	
	@BeforeTest
	public void login() {
		System.out.println("Before Test of Test001");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}

}
