package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void validate() {
		String s1 = "OpenCart";
		String s2 = "OpenShop";
		
		Assert.assertEquals(s1,s2);
	}
}
