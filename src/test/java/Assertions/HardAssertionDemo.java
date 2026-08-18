package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionDemo {

	@Test
    public void testLogin() {

	    System.out.println("Step 1");

	    Assert.assertTrue(true);

	    System.out.println("Step 2");

	    Assert.assertEquals("A", "B");

	    System.out.println("Step 3");
    }
}