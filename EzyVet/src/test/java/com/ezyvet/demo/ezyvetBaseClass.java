package com.ezyvet.demo;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.bdddemoqa.utilities.RedConfig;
import com.demoqa.pages.FormPages;
import com.demoqa.steps.Form;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ezyvetBaseClass{

	RedConfig config = new RedConfig();

	public  WebDriver driver;
	public  WebElement element;
	public  WebElement wait;	
	public Logger Logger; 
	public Form form;
	public FormPages formpg;
	 

	 
	//@Parameters({"browser"})
	@BeforeTest
	public void setBrowserFactory( ) throws InterruptedException{


		String Browser = "Chrome";
		if(Browser.equals("Chrome")) {
			
			 

			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\DemoqaAutomation\\driver\\chromedriver.exe");
			
//			ChromeOptions opt = new ChromeOptions();
//			opt.setHeadless(true);
//			opt.addArguments("--headless");
			
			driver = new ChromeDriver();
			String tittle = driver.getTitle();
			System.out.println(tittle);
			//Assert.assertEquals("Book a demo | ezyVet", tittle);
			//Logger.info("log navigate to browser ");
		}



		


		else if(Browser.equals("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			String tittle = driver.getTitle();
			System.out.println(tittle);
			//Assert.assertEquals("ToolsQA", tittle);
		}


		else if(Browser.equals("IE")) {

			WebDriverManager.edgedriver().setup();
			//System.setProperty("webdriver.ie.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			String tittle = driver.getTitle();
			System.out.println(tittle);
			//Assert.assertEquals("ToolsQA", tittle);
		}


		driver.get("https://www.ezyvet.com/demo");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

          

	} 

        
	

	@AfterTest
	public void quitbrowser() {
		driver.quit();
	}



	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}





	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}

	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}


	public void calibratePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)");	  
	}


	public void waitExpectedCondition() {
		 
		
	WebDriverWait wait = new WebDriverWait(driver, 35);
	WebElement option1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	}
}






