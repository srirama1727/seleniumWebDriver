package selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTestCase {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("form#login_form input#email")).sendKeys("kamakshi@gmail.com");
		driver.findElement(By.cssSelector("form#login_form input#pass")).sendKeys("welcome123");
		driver.findElement(By.cssSelector("form#login_form input[value='Log in']")).click();
		System.out.println(driver.getTitle());
		driver.quit();
		
		/*WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");*/
	}

}
