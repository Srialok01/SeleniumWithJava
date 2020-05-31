package com.seleniumjavaFramework.testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.seleniumjavaFramework.utilites.ReadConfig;


public class BaseClass	 {

	
   public static Logger logger = LogManager.getLogger(BaseClass.class);
   
    ReadConfig readconfig = new ReadConfig();
        
	public String baseUrl = readconfig.getAppURL();
	public String Username = readconfig.getUsername();
	public String Password = readconfig.getPassword();
	public static WebDriver driver ;
	
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
		if (br.equalsIgnoreCase("chrome"))
		{
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); // To suppress renderer warning
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			driver = new ChromeDriver();
		}
		
		else if (br.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver",readconfig.getChromepath());
			driver = new FirefoxDriver();
		}
		
	 
		
		
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
