package com.mm.qa.Util;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.mm.qa.Util.TestUtil;

//import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\MassMutual Java\\MMUIAutomation\\src\\test\\java\\com\\mm\\qa\\config\\config.properties");
			prop.load(fis);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "src//test//resources//drivers//chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "src//test//resources//drivers//geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		else if(browserName.equals("ie")){
			System.setProperty("webdriver.ie.driver", "src//test//resources//drivers//IEDriverServer.exe");	
			driver = new FirefoxDriver(); 
		}
		
		
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	public static void closeABrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
