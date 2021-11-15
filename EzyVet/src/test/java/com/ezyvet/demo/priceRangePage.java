package com.ezyvet.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class priceRangePage extends ezyvetBaseClass {

	By nivagitetoPricePage = By.xpath("");
	By changePriceRage = By.xpath("");
	By BookDemoBtn = By.xpath("//*[@id=\"top\"]/div[1]/div[2]/div[2]/div[2]/div/div/div/div/a");

	public priceRangePage(WebDriver driver){
		this.driver=driver;
	}
	
	@Test
	public void nivagitetoPricePage() {

		WebElement  element_02 = driver.findElement(By.xpath(""));
		Actions act= new Actions(driver);
		act.moveToElement(element_02 ).moveToElement(element_02).click().build().perform();


	}

    @Test
	public void changePriceRage() {
		
		WebElement min_slider = driver.findElement(By.xpath(""));		 
		Actions act= new Actions(driver);
		act.dragAndDropBy(min_slider ,100,0).build().perform();

	}


    @Test    
	public void BookDemoBtn() {
     
	}



}
