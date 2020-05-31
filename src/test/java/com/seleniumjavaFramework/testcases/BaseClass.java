package com.seleniumjavaFramework.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.seleniumjavaFramework.utilites.ReadConfig;


public class BaseClass	 {

	
   public static Logger logger = LogManager.getLogger(BaseClass.class);
   
    ReadConfig readconfig = new ReadConfig();
        
	public String baseUrl = readconfig.getAppURL();
	public String Username = readconfig.getUsername();
	public String Password = readconfig.getPassword();
	public static WebDriver driver ;
	
	
	
	@BeforeMethod
	public void setUp() {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // To suppress renderer warning
	System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
	driver = new ChromeDriver();
	
	}



	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
