package Test;

import org.testng.annotations.Test;

import Page.Decisionforgotpswrd;

public class Decisionfrgtpswdtest extends Baseclass{
	@Test
	public void tstfrgtpswd()
	{
		Decisionforgotpswrd ob = new Decisionforgotpswrd(driver);
		ob.forgotpswd("abc@gmail.com");
	}

}
