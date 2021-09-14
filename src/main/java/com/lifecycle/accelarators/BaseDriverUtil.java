package com.lifecycle.accelarators;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.lifecycle.locators.Locators;
import com.lifecycle.reporting.Reporting;

public class BaseDriverUtil {
	public static ReadProperties rp = new ReadProperties();
	public static String url1 = rp.readProperties().getProperty("url");
	public static String QUTQA = rp.readProperties().getProperty("QUTQA");
	public static String QUTDEV = rp.readProperties().getProperty("QUTDEV");
	public static String QUTUAT = rp.readProperties().getProperty("QUTUAT");
	public static String MurdochQA = rp.readProperties().getProperty("MurdochQA");
	public static String MurdochQADash = rp.readProperties().getProperty("MurdochQADash");
	public static String MurdochDev = rp.readProperties().getProperty("MurdochDev");
	public static String MurdochUAT = rp.readProperties().getProperty("MurdochUAT");
	public static String MonashQA = rp.readProperties().getProperty("MonashQA");
	public static String MonashDev = rp.readProperties().getProperty("MonashDev");
	public static String UOWQA = rp.readProperties().getProperty("UOWQA");
	public static String UOWDev = rp.readProperties().getProperty("UOWDev");
	public static String UOWUAT = rp.readProperties().getProperty("UOWUAT");
	public static String Temp = rp.readProperties().getProperty("Temp");
	public static String username = rp.readProperties().getProperty("username");
	public static String password = rp.readProperties().getProperty("password");
	private static Logger logger = Logger.getLogger(BaseDriverUtil.class.getName());

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	//added by Rishu
	public static String SystemOS = System.getProperty("os.name").toLowerCase(); //To identify what is the OS of the system and select the drivers(Mac or Windows) based on that
	public static String MacChromeDriverPath = "/Drivers/DriversForMac/Chrome/chromedriver" ;
	public static String WinChromeDriverPath = "/Drivers/chromedriverfor76/chromedriver.exe" ;


	/**
	 * Launches the browser based on the given values in the app.properties
	 * 
	 * This method will launch the browser and URL based on the values provided in
	 * the properties file
	 * 
	 * @param browsername specify "chrome" or "ie"
	 * @param url         specify www.google.com
	 * @author Aakash
	 * @return
	 * @throws Exception
	 */
/*	@BeforeMethod(alwaysRun = true)
	@Parameters(value = { "SeleniumGrid", "environment", "platform" })
	public synchronized WebDriver launchBrowser(@Optional("false") boolean seleniumGrid,
			@Optional("blank") String environment, @Optional("windows") String platform) {
		rp = new ReadProperties();

		if (environment.equals("blank")) {
			environment = rp.readProperties().getProperty("browser");
		}

		if (seleniumGrid) {
			TLDriverFactory.setDriver(environment, platform);
			driver = TLDriverFactory.getDriver();
			return driver;
		}

		if (environment.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/Drivers/geckodriver-v0.21.0-win64/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			return driver;
		}

		if (environment.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/Drivers/chromedriver_win32/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			return driver;
		}

		if (environment.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver",
					System.getProperty("user.dir") + "/Drivers/operadriver_win64/operadriver.exe");
			driver = new OperaDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			return driver;
		}

		if (environment.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "/Drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			return driver;
		}
		return null;

	}*/
	
	@BeforeTest(alwaysRun = true)
	@Parameters(value = { "SeleniumGrid", "environment", "platform", "url" })
	public synchronized WebDriver launchBrowser(@Optional("false") boolean seleniumGrid,
			@Optional("blank") String environment, @Optional("windows") String platform, @Optional("url") String url) {
		rp = new ReadProperties();

		if (environment.equals("blank")) {
			environment = rp.readProperties().getProperty("browser");
		}

		if (seleniumGrid) {
			TLDriverFactory.setDriver(environment, platform);
			driver = TLDriverFactory.getDriver();
			return driver;
		}	
		if (environment.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir") + "/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			//driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			 switch (url) {
				case "QUTQA": 
				    launchUrl(QUTQA, driver);
				break;
				case "QUTDev": 
					launchUrl(QUTDEV, driver);
					break;
				case "QUTUAT": 
				    launchUrl(QUTUAT, driver);
				    break;
				case "MurdochQA": 
					launchUrl(MurdochQA, driver);
					break;	
				case "MurdochDev": 
					launchUrl(MurdochDev, driver);
					break;	
				case "MurdochUAT": 
					launchUrl(MurdochUAT, driver);
					break;	
				case "MonashQA": 
					launchUrl(MonashQA, driver);
					break;
				case "UOWQA": 
					launchUrl(UOWQA, driver);
					break;
				case "UOWDev": 
					launchUrl(UOWDev, driver);
					break;
				case "UOWUAT": 
					launchUrl(UOWUAT, driver);
					break;
				case "url" :
					launchUrl(url1, driver);
				}
			return driver;
		}


		if (environment.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			switch(url) {
			case "QUTQA": 
			    launchUrl(QUTQA, driver);
			break;
			case "QUTDev": 
				launchUrl(QUTDEV, driver);
				break;
			case "QUTUAT": 
			    launchUrl(QUTUAT, driver);
			    break;
			case "MurdochQA": 
				launchUrl(MurdochQA, driver);
				break;	
			case "MurdochDev": 
				launchUrl(MurdochDev, driver);
				break;	
			case "MurdochUAT": 
				launchUrl(MurdochUAT, driver);
				break;	
			case "MonashQA": 
				launchUrl(MonashQA, driver);
				break;
			case "MonashDev": 
				launchUrl(MonashDev, driver);
				break;
			case "UOWQA": 
				launchUrl(UOWQA, driver);
				break;
			case "UOWDev": 
				launchUrl(UOWDev, driver);
				break;
			case "UOWUAT": 
				launchUrl(UOWUAT, driver);
				break;
			case "url" :
				launchUrl(url1, driver);
			}
			return driver;
		}

		if (environment.equalsIgnoreCase("chrome")) {
			
			//added by Rishu
			//To select the drivers(Mac or Windows)
			if(SystemOS.contains("mac")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + MacChromeDriverPath);
			}
			if (SystemOS.contains("win")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + WinChromeDriverPath);
			}
			
			/* Rishu commented code written by Aakash
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/Drivers/chromedriverfor76/chromedriver.exe");
			*/
			/*
			 * ChromeOptions chromeOptions = new ChromeOptions();
			 * chromeOptions.setProxy(proxy) = null;
			 */
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			
			switch(url) {
			case "QUTQA": 
			    launchUrl(QUTQA, driver);
			break;
			case "QUTDev": 
				launchUrl(QUTDEV, driver);
				break;
			case "QUTUAT": 
			    launchUrl(QUTUAT, driver);
			    break;
			case "MurdochQA": 
				launchUrl(MurdochQA, driver);
				break;	
			case "MurdochDev": 
				launchUrl(MurdochDev, driver);
				break;	
			case "MurdochUAT": 
				launchUrl(MurdochUAT, driver);
				break;	
			case "MonashQA": 
				launchUrl(MonashQA, driver);
				break;
			case "MonashDev": 
				launchUrl(MonashDev, driver);
				break;
			case "UOWQA": 
				launchUrl(UOWQA, driver);
				break;
			case "UOWDev": 
				launchUrl(UOWDev, driver);
				break;
			case "UOWUAT": 
				launchUrl(UOWUAT, driver);
				break;
			case "Temp": 
				launchUrl(Temp, driver);
				break;
			case "url" :
				launchUrl(url1, driver);
			}
			return driver;
		}

		if (environment.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver",
					System.getProperty("user.dir") + "/Drivers/operadriver_win64/operadriver.exe");
			driver = new OperaDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			switch(url) {
			case "QUTQA": 
			    launchUrl(QUTQA, driver);
			break;
			case "QUTDev": 
				launchUrl(QUTDEV, driver);
				break;
			case "QUTUAT": 
			    launchUrl(QUTUAT, driver);
			    break;
			case "MurdochQA": 
				launchUrl(MurdochQA, driver);
				break;	
			case "MurdochDev": 
				launchUrl(MurdochDev, driver);
				break;	
			case "MurdochUAT": 
				launchUrl(MurdochUAT, driver);
				break;	
			case "MonashQA": 
				launchUrl(MonashQA, driver);
				break;
			case "MonashDev": 
				launchUrl(MonashDev, driver);
				break;
			case "UOWQA": 
				launchUrl(UOWQA, driver);
				break;
			case "UOWDev": 
				launchUrl(UOWDev, driver);
				break;
			case "UOWUAT": 
				launchUrl(UOWUAT, driver);
				break;
			case "url" :
				launchUrl(url1, driver);
			}
			return driver;
		}

		if (environment.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "/Drivers/MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			logger.info("Instance of " + environment + "Browser succesfully launched");
			switch(url) {
			case "QUTQA": 
			    launchUrl(QUTQA, driver);
			break;
			case "QUTDev": 
				launchUrl(QUTDEV, driver);
				break;
			case "QUTUAT": 
			    launchUrl(QUTUAT, driver);
			    break;
			case "MurdochQA": 
				launchUrl(MurdochQA, driver);
				break;	
			case "MurdochDev": 
				launchUrl(MurdochDev, driver);
				break;	
			case "MurdochUAT": 
				launchUrl(MurdochUAT, driver);
				break;	
			case "MonashQA": 
				launchUrl(MonashQA, driver);
				break;
			case "MonashDev": 
				launchUrl(MonashDev, driver);
				break;
			case "UOWQA": 
				launchUrl(UOWQA, driver);
				break;
			case "UOWDev": 
				launchUrl(UOWDev, driver);
				break;
			case "UOWUAT": 
				launchUrl(UOWUAT, driver);
				break;
			case "url" :
				launchUrl(url1, driver);
			}
			return driver;
		}
		return null;

	}

	/**
	 * Close the Browser
	 * 
	 * @throws InterruptedException
	 */

	@AfterClass(alwaysRun = false)
	@Parameters(value = { "SeleniumGrid" })
	public void closeBrowser(@Optional("false") boolean seleniumGrid) {

		if (driver != null) {
			driver.quit();
		}
	}
	
	
	public void setup(WebDriver driver) throws IOException, AWTException {
/*		String Bannertext = " ";
		
		try {
	
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleContains("ServiceNow"));
		 Bannertext = driver.findElement(Locators.HomePage.BANNERTEXT).getText();
			Reporting.logResults(driver, "Pass", "Launch Courseloop", "courseLoop URL for " +Bannertext+ " was succesfully launched");
			logger.info("launch url successfully passed");
		} catch (Exception e) {
			Reporting.logResults(driver, "Fail", "Launch Courseloop", "courseLoop URL for " + Bannertext + " Failed to launch");
			e.printStackTrace();
		}*/
		
	//	try {
			
			/*
			 * WebDriverWait wait = new WebDriverWait(driver, 5);
			 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.
			 * HomePage.IFRAME)));
			 */
			
		
			
/*	        Boolean iframe = driver.findElement(Locators.HomePage.IFRAME).isDisplayed();
	        System.out.println(iframe);
			if(iframe== true) {
				driver.switchTo().frame("gsft_main");
			}
			else 
			{
			// Do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		try {
			
		
			if (  ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[@id='gsft_main']")) != null)  {
				driver.switchTo().frame("gsft_main");		
			}
			
			else {  
				}
			
		} catch (Exception e) {
			Reporting.logResults(driver, "Alert", "is element present", "unable to locate element");
	
		}
		
		
		try {
			driver.findElement(Locators.HomePage.USERNAME).clear();
			driver.findElement(Locators.HomePage.USERNAME).sendKeys(username);
			driver.findElement(Locators.HomePage.PASSWORD).clear();
			driver.findElement(Locators.HomePage.PASSWORD).sendKeys(password);
			driver.findElement(Locators.HomePage.LOGIN_BTN).click();
			Reporting.logResults(driver, "Pass", "Login Functionality", "Login to courseLoop was succesfull");
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults(driver, "Fail", "Login Functionality", "Unable to login to courseLoop");
		}
		
	
	}

/*	public void setup(WebDriver driver) throws IOException, AWTException {
		String Bannertext = " ";
		
		try {
			launchUrl(url, driver);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleContains("ServiceNow"));
		 Bannertext = driver.findElement(Locators.HomePage.BANNERTEXT).getText();
			Reporting.logResults(driver, "Pass", "Launch Courseloop", "courseLoop URL for " +Bannertext+ " was succesfully launched");
			logger.info("launch url successfully passed");
		} catch (Exception e) {
			Reporting.logResults(driver, "Fail", "Launch Courseloop", "courseLoop URL for " + Bannertext + " Failed to launch");
			e.printStackTrace();
		}
		
		try {
	        Boolean iframe = driver.findElement(Locators.HomePage.IFRAME).isDisplayed();
			if(iframe= true) {
				driver.switchTo().frame("gsft_main");
			}
			else 
			{
				// do nothing
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			driver.findElement(Locators.HomePage.USERNAME).sendKeys(username);
			driver.findElement(Locators.HomePage.PASSWORD).sendKeys(password);
			driver.findElement(Locators.HomePage.LOGIN_BTN).click();
			Reporting.logResults(driver, "Pass", "Login Functionality", "Login to courseLoop was succesfull");
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults(driver, "Fail", "Login Functionality", "Unable to login to courseLoop");
		}
	}*/

	public static void launchUrl(String url, WebDriver driver) {

		try {
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (NullPointerException e) {
			e.getMessage();

		}
	}
}
