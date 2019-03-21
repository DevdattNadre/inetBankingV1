package com.inetbanking.testCases;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readconfig=new ReadConfig();
//	public String baseURL="http://demo.guru99.com/V4/";
//	public String userName="mngr182552";
//	public String password="qajepEr";
	
	public String baseURL=readconfig.getApplicationURL();
	public String userName=readconfig.getusername();
	public String password=readconfig.getpassword();
	
	public static WebDriver driver;
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"//Drivers//chromedriver.exe");
	
//		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
//		driver=new ChromeDriver();
	
	if(br.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		driver=new ChromeDriver();
	}
	
	else if(br.equals("firefox")){
		System.setProperty("webdriver.chrome.driver",readconfig.getfirefoxpath());
		driver=new FirefoxDriver();
	}
	
	else if(br.equals("ie")){
		System.setProperty("webdriver.chrome.driver",readconfig.getiepath());
		driver=new InternetExplorerDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseURL);
	 logger=Logger.getLogger("ebanking");
	PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		try {
			FileUtils.copyFile(source, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Screenshot taken");
	}
}