package com.ezyvet.demo;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class bookDemoPage extends ezyvetBaseClass{
	By  FirstName = By.xpath("//*[@name=\"firstname\"]");
	By  LastName = By.xpath("//*[@name=\"lastname\"]");
	By  Email = By.xpath("//*[@name=\"email\"]");
	By  ClinicName = By.xpath("//*[@name=\"clinic_name\"]");
	By  Services = By.xpath("//*[@name=\"services\"]");
	By  AnimalTypes = By.xpath(" //*[@id=\"primary_species0-701165c0-3800-4822-88f1-ce132a8a7426\"]");
	By  Country = By.xpath("//*[@name=\"country\"]");
	By  PhoneAreaCode = By.xpath("//*[@name=\"phone_area_code\"]");
	By  Phonenumber = By.xpath("//*[@name=\"phone\"]");
	By  How_Did_You_Hear_About_Us = By.xpath("//*[@name=\"how_did_you_hear_about_us_\"]");
	By  What_are_you_looking_for = By.id("message-701165c0-3800-4822-88f1-ce132a8a7426");
	By  I_agree_to_receive_email_from_ezyVet = By.xpath("//*[@name=\"LEGAL_CONSENT.subscription_type_4536252\"]");
	By  submit = By.xpath("//*[@class=\"hs-button primary large\"]");

	By  pricing = By.cssSelector("#body-nav > div > div.mobile_menu_container > div:nth-child(3) > a");
	By  price_slider = By.cssSelector("#js-rangeslider-0 > div.rangeslider__handle]");
	By  verify_price = By.id("rangeValue");
	By  hover_price_link = By.cssSelector("#top > div.site-wrap > div.push-wrap > header > div > div > div:nth-child(2) > div > ul > li:nth-child(1) > a");
	 
	
	public WebDriver driver;
	public bookDemoPage(WebDriver driver ){  	
		this.driver=driver;  	
	}




	@Test
	public void FirstName(String FirstName1) {   	
		driver.findElement(FirstName).sendKeys("test");

	} 

	@Test  
	public void LastName(String LastName1 ) { 
		driver.findElement(LastName).sendKeys("test");
	}

	@Test
	public  void Email(String St_Emails) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.findElement(Email).sendKeys("test");

		String email_Validatation = "Email must be formatted correctly.";	
		if(email_Validatation.equalsIgnoreCase("email_Validatation")) {
			System.out.println("Email validataio rule = true");
		}else 
		{
			System.out.println("Validataio rule = false");
		}
	}

	@Test
	public void ClinicName(String st_Clinic_name){


		WebElement textField =  driver.findElement(ClinicName);
		textField.clear();
		textField.sendKeys("test");

		String text;

		do{

			text=textField.getAttribute("value");
			if(text.equals("test")){

				textField.sendKeys(Keys.ENTER);
				break;

			}


		}while(!text.isEmpty());

	}

	@Test
	public void staffCountDetails() {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"staff_count\"]")));
		Select select_staff = new Select (driver.findElement(By.xpath("//*[@name=\"staff_count\"]")));
		//String value = "10-19";
		//select_staff.selectByIndex(0);
		//select_staff.selectByValue(value);
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

		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);	

		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Boarding']")));
		element.click();

		//calling animal type 
		WebDriverWait animaltype = new WebDriverWait(driver, 100000);
		WebElement animaltype1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"primary_species0-701165c0-3800-4822-88f1-ce132a8a7426\"]")));
		animaltype1.click();


	}



	@Test()
	public void AnimalTypes() {
		driver.switchTo().frame(0);	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
 
	}

	@Test
	public void Country() {
		sychronizedriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-100)");
		driver.switchTo().frame(0);	
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"country\"]")));

		Select select = new Select(driver.findElement(By.id("country-701165c0-3800-4822-88f1-ce132a8a7426")));
		select.selectByVisibleText("New Zealand");

	}



	@Test
	public void PhoneAreaCode() {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"phone_area_code\"]")));

		Select select = new Select(driver.findElement(By.xpath("//*[@name=\"phone_area_code\"]")));
		select.selectByVisibleText("(USA/CA) +1");

	}


	@Test
	public void Phonenumber(String stphoneNumber) {

		driver.findElement(Phonenumber ).sendKeys("020937474");
	}


	@Test
	public void How_Did_You_Hear_About_Us() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("how_did_you_hear_about_us_-701165c0-3800-4822-88f1-ce132a8a7426")));
		Select select = new Select(driver.findElement(By.id("how_did_you_hear_about_us_-701165c0-3800-4822-88f1-ce132a8a7426")));
		select.selectByVisibleText("Email/Newsletter");

	}


	@Test
	public void What_are_you_looking_for() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message-701165c0-3800-4822-88f1-ce132a8a7426")));
		element.sendKeys("test this element please");


	}

	@Test
	public void I_agree_to_receive_email_from_ezyVet() {
		driver.findElement(I_agree_to_receive_email_from_ezyVet).click();
	}

	@Test
	public void Submit() {
		driver.findElement(submit).click();
		driver.quit();
	}


	//price option
	@Test
	public void pricing() {   	
		driver.findElement(hover_price_link).click();
		driver.findElement(By.xpath("//*[@id=\"productMenu\"]/div[1]/div/div/div[1]/div/ul/li[2]/a")).click();
		
 
		
		

	} 

	@Test  
	public void price_slider() { 
		 WebElement slider =driver.findElement(price_slider);
		 int width=slider.getSize().getWidth();
		 Actions move = new Actions(driver);
		 move.dragAndDropBy(slider, ((width*25)/100), 0).build().perform();
		 System.out.println("Slider moved");
		
		
	}

	 
	@Test  
	public void verify_price() { 
		WebElement verify_price = driver.findElement(price_slider);
		if(verify_price.equals(verify_price)) {
			System.out.println("assertion pass");
			
		}else {
		 System.out.println("assertion fail");
		}
	}



	public  void sychronizedriver() {
		driver.manage().timeouts().implicitlyWait(45,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
		driver.get("https://www.ezyvet.com/demo");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,000)");

	}




}
