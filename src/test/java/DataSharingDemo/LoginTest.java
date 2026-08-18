package DataSharingDemo;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void login(ITestContext context) {

        String token = "ABC123TOKEN";

        // Store token in context
        context.setAttribute("token", token);

        System.out.println("Token stored successfully");
    }
}
