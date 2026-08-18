package Assertions;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups = "smoke")
    public void login() {
        System.out.println("Login test");
    }

    @Test(groups = "smoke")
    public void search() {
        System.out.println("Search test");
    }

    @Test(groups = "regression")
    public void payment() {
        System.out.println("Payment test");
    }

}
