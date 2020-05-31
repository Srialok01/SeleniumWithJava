package com.seleniumjavaFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;

	
	public LoginPage(WebDriver rdriver) 
	{
		 ldriver = rdriver;
		 PageFactory.initElements(rdriver, this);
		
	}
	 
	 @FindBy(name="uid") WebElement UserName;	 
	 @FindBy(name="password") @CacheLookup WebElement Password ;	 
	 @FindBy(name="btnLogin") @CacheLookup WebElement LoginBtn ;
	 
	 
	 public void EnterUserName(String username)
	 {
		 UserName.sendKeys(username);
	 }
	 
	public void EnterPassword (String password) 
	{
		Password.sendKeys(password);
	}

	public void ClickOnLoginBtn() 
	{
		LoginBtn.click();
	}
	
}
