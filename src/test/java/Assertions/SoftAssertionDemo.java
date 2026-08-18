package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo {
	
	SoftAssert soft = new SoftAssert();
	
	@Test
	public void testLogin() {

	    //SoftAssert soft = new SoftAssert();

	    System.out.println("Step 1");

	    soft.assertEquals("A", "B");

	    System.out.println("Step 2");

	    soft.assertTrue(true);
	    
	    System.out.println("Step 3");
	    
	    soft.assertFalse(true);

	    System.out.println("Step 4");

	    soft.assertAll();
	}
	
}
