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


public class WidgedPages extends  BrowserFactory {

	By WidgedtsNaviagetioin = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/span/div/div[1]");
	By Accordian = By.xpath("//*[@id=\"item-4\"]/span");
	By Autocomplete = By.xpath("//*[@id=\"item-1\"]");
	By Datapicker = By.xpath("//*[@id=\"item-2\"]");
	By Slider = By.xpath("//*[@id=\"item-3\"]/span");
	By ProgressBar = By.xpath("//*[@id=\"item-4\"]");
	By Tabs = By.xpath("//*[@id=\"item-5\"]");
	By Tooltips =  By.xpath("//*[@id=\"item-6\"]/span");
	By Menu = By.xpath("//*[@id=\"item-7\"]//*[@id=\"item-6\"]/span");
	By SelectMenu = By.xpath("//*[@id=\"item-8\"]/span");


	@Test
	public void WidgedtsNaviagetioin_accoridan() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");	 

		driver.findElement(By.xpath("//h5[text()='Widgets']")).click();



		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);



		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {

			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Accordian']"));
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
	public void AutoComplete() {


		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Auto Complete']"));
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
	public void Autocomplete() {

		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Autocomplete']"));
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
	public void Datapicker() {

		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);



		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Datapicker']"));
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
	public void Slider() {

		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Slider']"));
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
	public void ProgressBar() {

		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);

		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='ProgressBar']"));
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
	public void Tabs() {


		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);



		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Tabs']"));
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
	public void Tooltips() {



		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()=' Tool Tips']"));
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
	public void Menu() {


		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Menu']"));
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
	public void SelectMenu() {



		int elementsCount= driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[4]/div/ul")).size();
		System.out.println("Amount of elements: " + elementsCount);


		//click on TextBox
		for (int x = 0; x < elementsCount; x++) {
			List<WebElement> elements = driver.findElements(By.xpath("//span[text()='Select Menu']"));
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
