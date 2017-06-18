package test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.PrintUtils;
import testRunner.BaseRunner;

public class HomePageTestcase extends BaseRunner 

{

	@Test
	public void forgetPasswordLink()
	{
		PrintUtils.logMessage("Inside ForgetPassword testcase");
		webdriverGenarics.click(driver, "id","12344");
		if(webdriverGenarics.getTitle(driver).equals("forgetLinke"))

			//	  if(10==12)
				  {
					  PrintUtils.logMessage("testcase Passed");
				  }else
				  {
					  PrintUtils.logError("Testcase failed");
					  Assert.fail();
				  }

			PrintUtils.logMessage("Testcase ends");

	}
	
	@Test
	public void verifyFriendPageTitle()
	{
		PrintUtils.logMessage("Inside verifyFriendPageTitle testcase");
		
		if(webdriverGenarics.getTitle(driver).equals("forgetLinke"))

			//	  if(10==12)
				  {
					  PrintUtils.logMessage("testcase Passed");
				  }else
				  {
					  PrintUtils.logError("Testcase failed");
					  Assert.fail();
				  }

			PrintUtils.logMessage("Testcase ends");

	}
}
