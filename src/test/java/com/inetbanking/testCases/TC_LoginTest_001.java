package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass {

	
	@Test
	public void LoginTest()
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		
		logger.info("User Name is entered");
		lp.setPassword(password);
		
		logger.info("password is entered");
		lp.clickSubmit();
		
		if(driver.getTitle().equalsIgnoreCase("Guru99 Bank Home Page"))
		{
			Assert.assertTrue(true);
			logger.info("Test case is Passed");
		}
		else
		{
			
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("Test case is Failed");
		}
	}
}
