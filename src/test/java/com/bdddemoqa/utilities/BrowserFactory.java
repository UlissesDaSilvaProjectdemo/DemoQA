package com.bdddemoqa.utilities;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserFactory{
	
	RedConfig config = new RedConfig();
	 
	public  WebDriver driver;
	public  WebElement element;
	public  WebElement wait;	
	public Logger Logger;
	
	//public String baseurl=readconfig.baseUrl();
	//public String username=readconfig.username();
	//public String password=readconfig.password();
	
	
	
	
	
 
    


	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setBrowserFactory() throws InterruptedException{
		
		 
		String Browser = "Chrome";
		if(Browser.equals("Chrome")) {

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\DemoqaAutomation\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			String tittle = driver.getTitle();
			System.out.println(tittle);
			//Assert.assertEquals("ToolsQA", tittle);
			//Logger.info("log navigate to browser ");
		}
		 
	     
	      


		else if(Browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			String tittle = driver.getTitle();
			System.out.println(tittle);
			//Assert.assertEquals("ToolsQA", tittle);
		}


		else if(Browser.equals("IE")) {


			System.setProperty("webdriver.ie.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			String tittle = driver.getTitle();
			System.out.println(tittle);
			//Assert.assertEquals("ToolsQA", tittle);
		}

	
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
//		// Switching to Alert        
//        Alert alert = driver.switchTo().alert();		
//        		
//        // Capturing alert message.    
//        String alertMessage= driver.switchTo().alert().getText();		
//        		
//        // Displaying alert message		
//        System.out.println(alertMessage);	
//        Thread.sleep(5000);
//        		
//        // Accepting alert		
//        alert.accept();		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]")).click();	 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div")).click();


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
	

}






