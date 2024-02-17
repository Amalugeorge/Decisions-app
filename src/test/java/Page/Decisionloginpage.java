package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Decisionloginpage {
WebDriver driver;
By dnemail=By.xpath("//input[@id='login-email']");
By dnpswrd=By.id("login-password");
By dnvisibilityeyeicon=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[2]/div/span");
By dnrememberme=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div[3]/div/label");
By dnlogin=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/button");
By dnforgotpswrd=By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div[1]/a");

By addnt = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[5]/div/div/div/div/div/div[2]/button");
By slctusr = By.xpath("//*[@id=\"users\"]/div/div[1]/div[1]");
By fltrbydte = By.xpath("//*[@id=\"range-picker\"]");
By filterbymonth = By.xpath("/html/body/div[2]/div[1]/div/div/select");
By filterbydateyear = By.xpath("/html/body/div[5]/div[1]/div/div/div/input");
By filterbydatearrow = By.xpath("/html/body/div[5]/div[1]/span[2]/svg");
By filterbydtedates = By.xpath("/html/body/div[5]/div[2]/div/div[2]/div");
By activetasks = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[2]/a/div/div/div/div[1]/p");
By activetskback = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/a");
By overduetsks = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[3]/a/div/div");
By overduetskback = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div[1]/a");
By activeprojects = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[2]/div[4]/a/div/div/div/div[1]/p");
By activeprojback = By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div[1]/a");
By scrnmode = By.xpath("//*[@id=\"root\"]/div[1]/div[1]/ul[2]/div/li/a/div/label");
public Decisionloginpage(WebDriver driver)
{
	this.driver=driver;
}
public void credentials(String email,String pswrd)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(dnemail).sendKeys(email);
	driver.findElement(dnpswrd).sendKeys(pswrd);
	driver.findElement(dnvisibilityeyeicon).click();
	driver.findElement(dnrememberme).click();
	
}
public void login()
{
	driver.findElement(dnlogin).click();
}
//public void 
public void dashboardprjcts() {
	driver.findElement(activetasks).click();
	System.out.println("activetasks is working");
	driver.findElement(activetskback).click();
	System.out.println("activetskback is working");
	driver.findElement(overduetsks).click();
	System.out.println("overduetsks is working");
	driver.findElement(overduetskback).click();
	System.out.println("overduetskback is working");
	driver.findElement(activeprojects).click();
	System.out.println("activeprojects is working");
	driver.findElement(activeprojback).click();
	System.out.println("activeprojback is working");
	driver.findElement(scrnmode).click();
	driver.findElement(scrnmode).click();
	
}
	public void addnote() {
	driver.findElement(addnt).click();

	
	


	}
}
	


	


