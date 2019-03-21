package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
WebDriver ldriver;

public AddCustomerPage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}

@FindBy(how=How.XPATH,using="html/body/div[3]/div/ul/li[2]/a")
@CacheLookup
WebElement linkAddNewCustomer;

@FindBy(how=How.NAME,using="name")
@CacheLookup
WebElement customername;

@FindBy(how=How.NAME,using="rad1")
@CacheLookup
WebElement gender;

@FindBy(how=How.NAME,using="dob")
@CacheLookup
WebElement dateofbirth;
@FindBy(how=How.NAME,using="addr")
@CacheLookup
WebElement address;
@FindBy(how=How.NAME,using="city")
@CacheLookup
WebElement city;
@FindBy(how=How.NAME,using="state")
@CacheLookup
WebElement state;

@FindBy(how=How.NAME,using="pinno")
@CacheLookup
WebElement pin;
@FindBy(how=How.NAME,using="telephoneno")
@CacheLookup
WebElement mobilenumber;
@FindBy(how=How.NAME,using="emailid")
@CacheLookup
WebElement email;

@FindBy(how=How.NAME,using="password")
@CacheLookup
WebElement password;


@FindBy(how=How.NAME,using="sub")
@CacheLookup
WebElement submitbutton;


public void clickoncustomerlink()
{
	linkAddNewCustomer.click();
}

public void entercustomername(String uname)
{
	customername.sendKeys(uname);
}

public void selectgender()
{
	gender.click();
}

public void enterdateofbirthday(String bday)
{
	dateofbirth.sendKeys(bday);
}

public void enteraddress(String useraddress)
{
	address.sendKeys(useraddress);
}

public void entercity(String usercity)
{
	city.sendKeys(usercity);
}
public void enterstate(String userstate)
{
	state.sendKeys(userstate);
}
public void enterpin(String userpin)
{
	pin.sendKeys(userpin);
}

public void entermobilenumber(String usermobilenumber)
{
	mobilenumber.sendKeys(usermobilenumber);
}

public void enterpassword(String userpassword)
{
	password.sendKeys(userpassword);
}

public void enteremailaddress(String useremail)
{
	email.sendKeys(useremail);
}

public void entersubmitbutton(String usersubmitbutton)
{
	submitbutton.sendKeys(usersubmitbutton);
}

public void clicksubmitbutton()
{
	submitbutton.click();
}
}
