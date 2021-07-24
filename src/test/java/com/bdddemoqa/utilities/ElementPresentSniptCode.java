package com.bdddemoqa.utilities;

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

public class ElementPresentSniptCode extends  BrowserFactory{
	
	
	     void elementPresent() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		WebElement element = driver.findElement(By.xpath("")); 
		element.click();


		WebElement ele = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);


		WebDriverWait t = new WebDriverWait(driver, 3000); 
		t.until(ExpectedConditions.visibilityOf(element));  
		t.until(ExpectedConditions.elementToBeClickable(element));


		List<WebElement> element1 = driver.findElements(By.xpath("//*[@id=\"item-1\"]/span"));
		for(int i=0; i < element1.size();i++) {

			WebElement add = element1.get(i);

			String innerhtml = add.getAttribute("innerHTML");
			if(innerhtml.contains("Alerts")) {
				add.click();
			}
		}

		WebElement Locator =driver.findElement(By.xpath("")); 
		element.click(); 
		//compare the actual title with the expected title
		if(Locator.equals(""))
		{
			System.out.println( "Test Passed") ;
		}
		else {
			System.out.println( "Test Failed" );
		}

		new FluentWait<WebDriver>(driver)							
		.withTimeout(30, TimeUnit.SECONDS) 			
		.pollingEvery(5, TimeUnit.SECONDS) 			
		.ignoring(NoSuchElementException.class);}
	}


