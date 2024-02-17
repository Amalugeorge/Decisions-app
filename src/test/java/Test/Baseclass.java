package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public WebDriver driver;
	@BeforeClass
	public void browser()
		{
			driver=new ChromeDriver();
			driver.get("http://decisions-staging.s3-website-us-east-1.amazonaws.com/login");
			driver.manage().window().maximize();
			
		}
}
