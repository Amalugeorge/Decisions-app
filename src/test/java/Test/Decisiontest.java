package Test;

import org.testng.annotations.Test;

import Page.Decisionloginpage;

public class Decisiontest extends Baseclass {
@Test
public void decisiontst()
{
	Decisionloginpage ob = new Decisionloginpage(driver);
	ob.credentials("vivek@abacies.com", "12345");
	ob.login();
	//ob.dashboard("2023");
}
}
