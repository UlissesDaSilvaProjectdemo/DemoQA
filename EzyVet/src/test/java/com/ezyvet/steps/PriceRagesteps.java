package com.ezyvet.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.ezyvet.demo.ezyvetBaseClass;
import com.ezyvet.demo.priceRangePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PriceRagesteps extends ezyvetBaseClass {
	
	  public WebDriver driver;
	  public priceRangePage priceRange;
	
	@Given("the user navigate to the price page")
	public void the_user_navigate_to_the_price_page() {
	    
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	     driver.get("https://www.ezyvet.com/demo");
		 priceRange=new priceRangePage(driver);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		 String title =driver.getTitle();
		 System.out.println(title);
		 //org.testng.Assert.assertEquals(title,driver.getTitle());
		 
		 String pageTitle = driver.getTitle();
		 System.out.println(pageTitle);
	
	}
	
	

	@When("the user change the price rang")
	public void the_user_change_the_price_rang() {

	
	}
	 

	@Then("user should see a new price displayed")
	public void user_should_see_a_new_price_displayed() {
	     
	}

 
}
