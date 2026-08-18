package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo3 {
	
	//1. Create DataProvider
    @DataProvider(name = "loginData",indices = {0,1})
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
