package com.seleniumjavaFramework.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception E)
		{
			System.out.println("Exception is : "+ E.getMessage());
		}
	}
	
	public String getAppURL() {
		String url = pro.getProperty("baseUrl");
		return url;
	}

	
	public String getUsername() {
		String username = pro.getProperty("Username");
		return username;
	}

	public String getPassword() {
		String password = pro.getProperty("Password");
		return password;
	}
	
	public String getChromepath() {
		String chromepath = pro.getProperty("chromepath");
		return chromepath;
	}
}
