package Parameterization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
	
	@BeforeClass
	public void bc() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void ac() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void bm() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("after method");
	}
	
	//1. Create DataProvider
    @DataProvider(name = "loginData")
    public Object[][] getData() {

        Object[][] login = {

            {"admin", "admin123"},
            {"tom", "tom123"},
            {"john", "john123"}
        };
        
        return login;
    }

    //2. Use it in Test Method
    @Test(dataProvider = "loginData")
    public void loginTest(String user, String pass) {

        System.out.println(user + " : " + pass);
    }
	
}
