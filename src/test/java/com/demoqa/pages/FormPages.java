package com.demoqa.pages;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bdddemoqa.utilities.BrowserFactory;

public class FormPages extends  BrowserFactory {

	By Name = By.xpath("//*[@id=\"firstName\"]");
	By Email = By.xpath("//*[@id=\"userEmail\"]");
	By Gender = By.xpath(" //*[@id=\"genterWrapper\"]/div[2]/div[1]/label");
	By Date_of_Birth =By.xpath("//*[@id=\"dateOfBirthInput\"]");
	By Subjects=By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]");
	By Hobbies=By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label");
	By Picture=By.xpath("//*[@id=\"uploadPicture\"]");
	By Current_Address = By.xpath("//span[text()='Practice Form']");
	By State_and_City = By.xpath("//*[@id=\"state\"]/div/div[1]");
	By Submit_button = By.xpath("//span[text()='Practice Form']");

	@Test()
	public void urlnaviagtetoForm() {
		//navigate_to_form
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  

		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]")).click();	
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		//click on TextBox == //span[text()='Practice Form']
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Practice Form']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	@Test
	public void name() throws IOException, InterruptedException {
		
	 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[1]")).click();	
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		 
//		//click on TextBox == //span[text()='Practice Form']
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Practice Form']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(1000);
		} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		
		 
		driver.findElement(Name).sendKeys("test");


	}
	
	@Test
	public void Email() {
		//wait until element visible 
		driver.findElement(Email).sendKeys("test");

	}
	@Test
	public void Gender() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 

		WebElement radio1 = driver.findElement(Gender);					
		//Radio Button1 is selected		
		radio1.click();			
		System.out.println("Radio Button Option 1 Selected");					


		// Selecting CheckBox		
		WebElement option1 = driver.findElement(Gender);							

		// This will Toggle the Check box 		
		option1.click();			

		// Check whether the Check box is toggled on 		
		if (option1.isSelected()) {					
			System.out.println("Checkbox is Toggled On");					

		} else {			
			System.out.println("Checkbox is Toggled Off");					
		}		

	}		





	@Test
	public void Date_of_Birth() {
		driver.findElement(Date_of_Birth).sendKeys("10,09,1976");
	}





	//@Test
	public void Subjects() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"subjectsContainer\"]/div")));
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div")).sendKeys("test");

	} 


	@Test
	public void Hobbies() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")));
		WebElement option1= driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));

		// Selecting CheckBox	


		// This will Toggle the Check box 		
		option1.click();			

		// Check whether the Check box is toggled on 		
		if (option1.isSelected()) {					
			System.out.println("Checkbox is Toggled On");					

		} else {			
			System.out.println("Checkbox is Toggled Off");					
		}			
	}


	@Test
	public void Picture() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"uploadPicture\"]")));
		driver.findElement(By.xpath("//*[@id=\"uploadPicture\"]")).sendKeys("C:\\Users\\Ulisses Da Silva\\Downloads\\20210708_095059.jpg");

	}




	@Test
	public void Current_Address() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"currentAddress\"]")));
		driver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("Test");
	}


	@Test
	public void State_and_City() throws IOException {

		//wait until element visible 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 


		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"state\"]/div/div[1]")));
		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"));
	}
}




