package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOnMethodsDemo {
	
	@Test
    public void login() {
        Assert.fail();
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct() {
        System.out.println("Searching product");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void checkout() {
        System.out.println("Checkout completed");
    }

}
