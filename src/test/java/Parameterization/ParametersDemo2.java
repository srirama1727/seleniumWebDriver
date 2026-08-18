package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersDemo2 {
	
	@Test
	@Parameters("browser")
	public void launchBrowser(String br) {
		
		switch(br){
		case "Chrome" : System.out.println("Launching chrome"); break;
		case "Edge" : System.out.println("Launching edge"); break;
		case "Firefox" : System.out.println("Launching Firefox"); break;
		default: System.out.println("Invalid browser"); return;
		}
	}

}
