package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
	Properties pro;
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	
	public String getusername()
	{
		String username=pro.getProperty("userName");
		return username;
	}
	
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getchromepath()
	{
		String chromebrowser=pro.getProperty("chromepath");
		return chromebrowser;
	}
	
	public String getiepath()
	{
		String iebrowser=pro.getProperty("iepath");
		return iebrowser;
	}
	
	public String getfirefoxpath()
	{
		String firefoxbrowser=pro.getProperty("firefoxpath");
		return firefoxbrowser;
	}
}
