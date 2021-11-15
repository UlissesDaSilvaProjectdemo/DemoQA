package EzyvetTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ezyvet.demo.ezyvetBaseClass;
 
public class ezyvetDemoTestNG extends ezyvetBaseClass{
	
	By  FirstName = By. xpath("//*[@name=\"firstname\"]");
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
 
    
	
	public ezyvetDemoTestNG(){
		this.driver=driver;
	}
	
	
	
	
	
	
//    @FindBy(xpath="/*[@name=\"firstname\"]")
//	private static WebElement ubs_text_username;
//
//	@FindBy(name=" textpassword ")
//	private static WebElement text_password;
//	
//	
//	
//	 public static void pass() {
//		 text_password.click();
//	 } 
//	
//	 public static void passtxtname() {
//		 ubs_text_username.click();
//	 }
	 
	 
	@Test
	public void FirstName(String FirstName1) {
		
	//driver.switchTo().frame(0);	   	
    driver.findElement(FirstName).sendKeys(FirstName1);
     
	} 

	@Test  
	public void LastName(String LastName1 ) {  
		driver.findElement(LastName).sendKeys(LastName1);
	}

	@Test
	public  void Email() {
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
	public void ClinicName( ){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
      
		
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

	 
		
		try{
			WebDriverWait wait = new WebDriverWait(driver, 1000);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name=\"staff_count\"]")));
			Select select_staff = new Select (driver.findElement(By.xpath("//*[@name=\"staff_count\"]")));
			//String value = "10-19";
			//select_staff.selectByIndex(0);
			//select_staff.selectByValue(value);
			select_staff.selectByVisibleText("10-19");
	          
	         System.out.println("First print statement in try block");
	     	}
		 
		     catch(Exception e){
		        System.out.println("****************Services-Warning: exception*************************");
		     }
		   System.out.println("Services-Out of try-catch block...");
		   

		

	}


	@Test
	public void Services() throws NoSuchSessionException {
		
		//driver.switchTo().frame(0);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
			try{
				WebDriverWait wait = new WebDriverWait(driver, 15);
				WebElement option1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"services1-701165c0-3800-4822-88f1-ce132a8a7426\"]")));	
				option1.click();
		          
		         System.out.println("**********Services-First print statement in try block***********************");
			}
		     catch(Exception e){
		        System.out.println("****************Services-Warning: exception*************************");
		     }
		   System.out.println("Services-Out of try-catch block...");
		   
		   
			try{
				WebDriverWait wait = new WebDriverWait(driver, 15);
				WebElement option1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"services1-701165c0-3800-4822-88f1-ce132a8a7426\"]")));	
				option1.click();   
		         System.out.println("First print statement in try block");
		     }
		     
		     catch(Exception e){
		        System.out.println("Warning: Some Other exception");
		     }
		   System.out.println("Out of try-catch block...elemenct clickable");
		   
		   
		   
		   
		  }

	@Test
	public void extraServices() {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Boarding']")));
		  
		
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
		driver.switchTo().frame(0);
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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Select select = new Select(driver.findElement(By.xpath("//*[@name=\"phone_area_code\"]")));
		select.selectByVisibleText("(USA/CA) +1");
		driver.findElement( PhoneAreaCode).sendKeys("44+89876654");;
	}


	@Test
	public void Phonenumber( ) {

		driver.findElement(Phonenumber ).sendKeys ("909876655");
	}


	@Test
	public void How_Did_You_Hear_About_Us() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		
		
		
		Select select = new Select(driver.findElement(By.xpath("//*[@name=\"how_did_you_hear_about_us_\"]")));
		select.selectByVisibleText("Email/Newsletter");

	}


	@Test
	public void What_are_you_looking_for() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(400,000)");
		
		 
		try{
			driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.SECONDS);
			WebDriverWait wait = new WebDriverWait(driver, 10000);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"message-701165c0-3800-4822-88f1-ce132a8a7426\"]")));
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("document.getElementById('elementID').setAttribute('value', 'new value for element')");
			
	          
	         System.out.println("**********Services-First print statement in try block***********************");
	     }
	     catch(ArithmeticException e){
	        System.out.println("***************Services-Warning: ArithmeticException**************************");
	     }
	     catch(ArrayIndexOutOfBoundsException e){
	        System.out.println("**************Services-Warning: ArrayIndexOutOfBoundsException****************");
	     }
	     catch(Exception e){
	        System.out.println("****************Services-Warning: Some Other exception*************************");
	     }
	   System.out.println("Services-Out of try-catch block...");
	}

	@Test
	public void I_agree_to_receive_email_from_ezyVet() {
		driver.findElement(I_agree_to_receive_email_from_ezyVet).click();
	}
	
	public void the_user_enter_Fname_Lname_email(String Fname, String Lname, String email) {
		 driver.findElements(FirstName); driver.findElements(LastName); driver.findElement(Email);
		  
	}

	@Test
	public void Submit() {
		driver.findElement(submit).click();
		driver.quit();
	}
	
	

}
