package element.Invetigaro.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksBaseClass{

	 

	public  WebDriver driver;
	public  WebElement element;
	public  WebElement wait;	
	public Logger Logger; 
	 
	By submit = By.xpath("//*[@class=\"hs-button primary large\"]");
	 
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void setBrowserFactory() throws InterruptedException{


		String Browser = "Chrome";
		if(Browser.equals("Chrome")) {

			
			  

			WebDriverManager.chromedriver().setup();
			//.setProperty("webdriver.chrome.driver","C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\DemoQATest\\DemoqaAutomation\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals("Book a demo | ezyVet", title);
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
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

		 

	} 


    // @Test
	 public void switchIframe() {
		 driver.switchTo().frame(0);
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


}






