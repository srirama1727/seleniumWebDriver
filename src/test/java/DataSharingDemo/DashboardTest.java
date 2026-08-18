package DataSharingDemo;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DashboardTest {
    @Test
    public void dashboard(ITestContext context) {

        // Retrieve token
        String token = (String) context.getAttribute("token");

        System.out.println("Received Token: " + token);
    }
}
