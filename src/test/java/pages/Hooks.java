package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProviders.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends ProjectReusableMethods{ 
	
	@Before
	public void preCondition(Scenario sc) throws AWTException
	{	
		
			configFileReader = new ConfigFileReader();
		
			String brw, browser = configFileReader.getbrowser();
			String url = configFileReader.getApplicationUrl();
			String uid = configFileReader.getApplicationUid();
			String pwd = configFileReader.getApplicationPwd();
			
				switch (browser.toUpperCase())
				{
					case "CHROME": {
							ChromeOptions options = new ChromeOptions();
							options.addArguments("--disable-notifications");
							options.addArguments("--disable-extensions");
						//	options.addArguments("--incognito");
							
						    WebDriverManager.chromedriver().setup();
							driver = new ChromeDriver(options);
							brw = "Chrome";
						
							break;
						}
					case "FIREFOX": {
						WebDriverManager.firefoxdriver().setup();
							driver = new FirefoxDriver(); 
							brw = "Firefox";
							break;
					}
			
					case "IE": {
							WebDriverManager.iedriver().setup();
							driver = new InternetExplorerDriver(); 
							brw = "IE";
							break;
					}
			
					case "EDGE": {
							WebDriverManager.edgedriver().setup();
							driver = new EdgeDriver();	
							brw = "Edge";
							break;
					}
			
					default : {
							
							ChromeOptions options = new ChromeOptions();
							options.addArguments("--disable-notifications");
							options.addArguments("--disable-extensions");
						//	options.addArguments("--incognito");
							
						    WebDriverManager.chromedriver().setup();
							driver = new ChromeDriver(options);
							
							brw = "Chrome";
							break;
						}
				}		
				
			System.out.println(brw+" is intialized and launched successfully");
			
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			
			driver.get(url);
			driver.manage().window().maximize();
		
			action = new Actions(driver);
			executor = (JavascriptExecutor)driver;
			robot = new Robot();

			//Enter SF login uid
			driver.findElementById("username").clear();
			driver.findElementById("username").sendKeys(uid);
			
			//Enter SF login password
			driver.findElementById("password").clear();
			driver.findElementById("password").sendKeys(pwd);
			
			//Click login button
			driver.findElementById("Login").click();

			//Wait for the Home screen to load.
			try {Thread.sleep(10000);} catch (InterruptedException e) {e.printStackTrace();}
		
	}
	
	@After	
	public void postCondition(Scenario sc)
	{
		browser_closeActiveBrowser();
		browser_closeAllBrowsers();
				
	}
}
