package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo {
	
	@Test
	@Parameters("browser")
	public void launchBrowser(String browser) {
	    if(browser.equals("chrome")) {
	        System.out.println("Launching Chrome");
	    }

	    else if(browser.equals("edge")) {
	        System.out.println("Launching Edge");
	    }
	}

}
