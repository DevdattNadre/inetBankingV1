package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AdCustomer_003 extends BaseClass{

	
	@Test
	public void addnewcustomer() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(2000);
		
		AddCustomerPage acp=new AddCustomerPage(driver);
		
		acp.clickoncustomerlink();
		acp.entercustomername("abcdv");
		acp.selectgender();
		acp.enterdateofbirthday("30-10-1989");
		acp.enteraddress("pqrst");
		acp.entercity("pune");
		acp.enterstate("Maharashtra");
		acp.enterpin("783233");
		acp.entermobilenumber("5467564238");
		
		
		acp.enteremailaddress("abcd@gmail.com");
		//acp.entersubmitbutton(usersubmitbutton);
		
		
		String email=randomstring()+"gmail.com";
		acp.enteremailaddress(email);
		acp.enterpassword("ahsab");
		acp.clicksubmitbutton();
		
		boolean result=driver.getPageSource().contains("Customer Registered Successfully!!!");
	if(result==true)
		{
		Assert.assertTrue(true);
		}
	else
	{
		captureScreen(driver,"AddCustomerPage");
		Assert.assertTrue(false);
	}
	}
	
	public String randomstring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	public static String randomnum()
	{
		String generatenumber=RandomStringUtils.randomNumeric(4);
		return(generatenumber);
	}
}
