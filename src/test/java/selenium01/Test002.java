package selenium01;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test002 {
	
	@BeforeTest
	public void db() {
		System.out.println("Before Test of Test002");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}

}
