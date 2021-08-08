package com.ezyvet.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bookDemoPage extends ezyvetBaseClass{
	

	By  FirstName = By.xpath("//*[@id=\"firstname-701165c0-3800-4822-88f1-ce132a8a7426\"]");
	By  LastName = By.xpath("//*[@name=\"lastname\"]");
	By  Email = By.xpath("//*[@name=\"email\"]");
	By  ClinicName = By.xpath("//*[@name=\"clinic_name\"]");
	By  Services = By.xpath("//*[@name=\"services\"]");
	By  AnimalTypes = By.xpath(" //*[@id=\"primary_species0-701165c0-3800-4822-88f1-ce132a8a7426\"]");
	By  Country = By.xpath("//*[@name=\"country\"]");
	By  PhoneAreaCode = By.xpath("//*[@name=\"phone_area_code\"]");
	By  Phonenumber = By.xpath("//*[@name=\"phone\"]");
	By  How_Did_You_Hear_About_Us = By.xpath("//*[@name=\"how_did_you_hear_about_us_\"]");
	By  What_are_you_looking_for = By.xpath("//*[@name=\"message\"]");
	By  I_agree_to_receive_email_from_ezyVet = By.xpath("//*[@name=\"LEGAL_CONSENT.subscription_type_4536252\"]");
	By  submit = By.xpath("//*[@class=\"hs-button primary large\"]");
	
	public WebDriver driver; 
	public bookDemoPage( WebDriver driver){
	this.driver=driver;
	}
	
   
	@Test
	public void FirstName(String First_Name) {
		driver.switchTo().frame(0);
		driver.findElement(FirstName).sendKeys(First_Name);
	 
	} 

	@Test
	public void LastName(String Last_Name) { 
		driver.findElement(LastName).sendKeys(Last_Name);
	}

	@Test
	public  void Email(String Emails) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(Email).sendKeys(Emails);
	}

	@Test
	public void ClinicName(String Clinic_Name) {
		 
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,400)");
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"clinic_name\"]")));
		element.sendKeys(Clinic_Name);
		 
	}
	
	   @Test
	   public void staffCountDetails() {
		 
		Select select_staff = new Select (driver.findElement(By.xpath("//*[@name=\"staff_count\"]")));
		String value = "10-19";
		select_staff.selectByIndex(0);
		select_staff.selectByValue(value);

		select_staff.selectByVisibleText("10-19");
		
 
	   }
	

	@Test
	public void Services() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"services1-701165c0-3800-4822-88f1-ce132a8a7426\"]"));
        option1.click();			
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
		 
	}

	
	
	@Test
	public void extraServices() {
 
		WebElement option1=driver.findElement(By.xpath("//*[text()='Boarding']"));
		 
        option1.click();			
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
		 
	}
		
	

	@Test()
	public void AnimalTypes() {
		//driver.switchTo().frame(0);
		  
		WebElement option1 = driver.findElement(By.xpath("//*[@id=\"primary_species0-701165c0-3800-4822-88f1-ce132a8a7426\"]"));
								
        option1.click();			
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         
		 
	}

	@Test
	public void Country() {
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		Select select = new Select(driver.findElement(By.xpath("//*[@name=\"country\"]")));
		select.selectByVisibleText("New Zealand");
		 
	}



	@Test
	public void PhoneAreaCode() {
		Select select = new Select(driver.findElement(By.xpath("//*[@name=\"phone_area_code\"]")));
		select.selectByVisibleText("(USA/CA) +1");
		driver.findElement(PhoneAreaCode).sendKeys("44+");;
	}


	@Test
	public void Phonenumber(String phoneNumber) {
		 
		driver.findElement(Phonenumber).sendKeys(phoneNumber);
	}


	@Test
	public void How_Did_You_Hear_About_Us() {
		Select select = new Select(driver.findElement(By.xpath("//*[@name=\"how_did_you_hear_about_us_\"]")));
		select.selectByVisibleText("Email/Newsletter");
		
	}


	@Test
	public void What_are_you_looking_for(String  text) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,000)");
		driver.findElement(What_are_you_looking_for).sendKeys(text);
	}

	@Test
	public void I_agree_to_receive_email_from_ezyVet(String text) {
		driver.findElement(I_agree_to_receive_email_from_ezyVet).sendKeys(text);
	}

	//@Test
	public void Submit() {
		driver.findElement(submit).click();
	}

}
