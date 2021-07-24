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
 




public class ElementPages extends  BrowserFactory{
	By ElementpPgeNavigate = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div");
	By Textbox = By.xpath("//*[@id=\"item-3\"]/span");
	By Textbox_Full_Name = By.xpath("//*[@id=\"userName\"]");
	By Textbox_Email = By.xpath("//*[@id=\"userEmail\"]");
	By Textbox_Current_Address = By.xpath("//*[@id=\"currentAddress\"]");
	By Textbox_Permanet_Address = By.xpath("//*[@id=\"permanentAddress\"]");



	By CheckBox = By.xpath("//*[@id=\"item-3\"]/span");
	By RadioButton = By.xpath("//*[@id=\"item-2\"]");
	By WebTable = By.xpath("//*[@id=\"item-3\"]/span");
	By Button = By.xpath("//*[@id=\"item-4\"]/span");
	By Links = By.xpath("//*[@id=\"item-4\"]/span");
	By BrokenLink = By. xpath("//*[@id=\"item-6\"]/span");
	By UploadDowload = By.xpath("//*[@id=\"item-7\"]/span");
	By DynamicProperty = By.xpath("//*[@id=\"item-8\"]/span");

	@Test
	public void ElementpPgeNavigate() {

		driver.findElement(By.xpath("//h5[text()='Elements']")).click();	
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Text Box']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}





	@Test
	public void Textbox() {


		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Check Box']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	

		driver.findElement(Textbox_Full_Name).sendKeys("test");  
		driver.findElement(Textbox_Email).sendKeys("test");
		driver.findElement(Textbox_Current_Address).sendKeys("test");
		driver.findElement(Textbox_Permanet_Address).sendKeys("test");
	}
	@Test
	public void CheckBox() {
		 
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='WorkSpace']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	 
		
		
		int boxCount= driver.findElements(By.xpath("//*[@id=\"tree-node\"]/ol")).size();
		System.out.println("Amount of elements: " + boxCount);

		 
		for (int x = 0; x < boxCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Check Box']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	 


      
	}

	@Test
	public void RadioButton() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Radio Button']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void WebTable() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  

		
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Buttons']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void Button() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Web Tables']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void Links() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  

		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Links']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void BrokenLink() {
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  

		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Broken Links - Images']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void UploadDowload() {

		 
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  

		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Upload and Download']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	}
	@Test
	public void DynamicProperty() {

		 
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	  
		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Dynamic Properties']"));
			WebElement client = elements.get(x);
			client.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	    
	} 

}