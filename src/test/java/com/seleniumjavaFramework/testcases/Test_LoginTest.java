package com.seleniumjavaFramework.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.seleniumjavaFramework.pageObjects.LoginPage;

public class Test_LoginTest extends BaseClass {
	 
	@Test
	public void loginTest() throws Exception
	{
		
		driver.get(baseUrl);
		logger.info("Opened Url");
		LoginPage lp = new LoginPage(driver);
		logger.info("Enter Username");
		lp.EnterUserName(Username);
		lp.EnterPassword(Password);
		lp.ClickOnLoginBtn();
		
		System.out.println("The title of page is :"+driver.getTitle());
		
		if (driver.getTitle().equals("GTPL Bank Manager HomePage")) {
			
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	

}
