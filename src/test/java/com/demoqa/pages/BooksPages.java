package com.demoqa.pages;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.bdddemoqa.utilities.BrowserFactory;

 




public class BooksPages extends  BrowserFactory  {	


	By Search=By.xpath("//*[@id=\"searchBox\"]");
	By GetTittle=By.xpath("//*[@id=\"item-2\"]/span");
	By GetImage=By.xpath("//*[@id=\"item-3\"]");
	By getAuthor=By.xpath("//*[@id=\"item-4\"]/span");
	By getpublisher = By.xpath("//*[@id=\"searchBox\"]");
	By getRows = By.xpath("//*[@id=\\\"searchBox\"]");
	By bookicon = By.xpath("//*[text()=\"Book Store Application\"]");

 



	@Test
	public void Login() {
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 

		//navigate_to_form
	     driver.findElement(bookicon).click();
        
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");	 

		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Login']"));

			WebElement client = elements.get(x);
			client.click();		 

			
			 
		}
		
		 
	}
	
	
	@Test
	 public  void  Login_UserName() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Login']"));

			WebElement client = elements.get(x);
			client.click();		 
		 
		 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Test");
			
		}
	}
	
	@Test
	 public  void  Login_Password() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Login']"));

			WebElement client = elements.get(x);
			client.click();	
			
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Test");
			
		}
	}
	 
	
	@Test
	 public void login_clickBtn() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Login']"));

			WebElement client = elements.get(x);
			client.click();		 
	}
		 driver.findElement(By.xpath("//*[@id=\"login\"]")).click(); //btn
	      
	 }
	
	@Test
    public void Login_Register_to_NewStore() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Login']"));

			WebElement client = elements.get(x);
			client.click();		 
	}
		driver.findElement(By.xpath("//*[@id=\"newUser\"]")).click(); //NewUSer_Btn
    	
    }
	
	
	

	@Test
	public void BookStore() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Book Store']"));

			WebElement client = elements.get(x);
			client.click();	
			
			
			driver.findElement(By.xpath("//*[@id=\"searchBox\"]")).sendKeys("searchBook");
			
			driver.findElement(By.xpath("//*[@id=\"basic-addon2\"]/span/svg")).click();

		}
		 
	}

	@Test
	public void Profile() {

		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Profile']"));

			WebElement client = elements.get(x);
			client.click();		
			
			String tittle = driver.getTitle();
			System.out.println(tittle);
			
			
			
			driver.findElement(By.xpath("//*[@id=\"notLoggin-label\"]/a[1]")).click(); //loginBtn_btn
		    driver.navigate().back();
		    driver.findElement(By.xpath("//*[@id=\"notLoggin-label\"]/a[2]")).click(); //newRegister_btn

		}

	}
	@Test
	public void BookStoreAPI() {


		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[6]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  


		//click on Browser Windonws_btn  == //span[text()='']Browser Windows
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Book Store API"));

			WebElement client = elements.get(x);
			client.click();		 	 
		}



	}

}
