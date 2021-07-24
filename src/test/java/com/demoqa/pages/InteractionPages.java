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
 

 
 

public class InteractionPages  extends  BrowserFactory  {

	By InteractionpageNavigate = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/span/div");
	By Sortable = By.xpath("//*[@id=\"item-0\"]/span");
	By Resizable = By.xpath("//*[@id=\"item-1\"]/span");
	By Selectable = By.xpath("//*[@id=\"item-2\"]/span");
	By Dropable = By.xpath("//*[@id=\"item-3\"]/span");
	By Dragbale = By.xpath("//*[@id=\"item-4\"]/span");

     @Test
	public void InteractionpageNavigate() {
    	 	 
 		
		driver.findElement(By.xpath("//h5[text()='Interactions']")).click();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,400)");
	     
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Sortable']"));
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
	public void Sortable() {
	   
	  
	   int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Selectable']"));
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
	public void Resizable() {
    	
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,400)");
    	int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Resizable']"));
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
    public void Selectable() {
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,400)");
		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Droppable']"));
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
	public void Dropable() {
    	
    	int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[5]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Dragabble']"));
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
