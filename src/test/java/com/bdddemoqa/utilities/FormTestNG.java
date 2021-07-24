package com.bdddemoqa.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public  class FormTestNG  extends  BrowserFactory {
 
	By first_name = By.xpath("//*[@id=\"firstName\"]");
	By last_name = By.xpath("//*[@id=\"lastName\"]");
	By Email = By.xpath("//*[@id=\"userEmail\"]"); 
	By GenderMale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label");
	By GenderFemale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label");
	By GenderOthers = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[3]/label");
	By Mobile = By.xpath("//*[@id=\"userNumber\"]");
	By Subject = By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]");
	By HobbiesSport = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label");
	By HobbiesReading = By.xpath( "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label");
	By HobbiesMusic = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label");	
	By Picture = By.id("uploadPicture");
	By Calendar = By.xpath("//*[@id=\"dateOfBirthInput\"]");
	By Address = By.xpath("//*[@id=\"currentAddress\"]");
	By city = By.xpath("//*[@id=\"state\"]/div/div[2]/div");
	By Submit = By.xpath("//*[@id=\"submit\"]");
	
	 
	 
	@Test
	public void firstName() {
		driver.findElement(first_name).sendKeys("user");
		 
	}

	@Test
	public void secondName() {
		driver.findElement(last_name).sendKeys("username");
	}


	@Test
	public  void email() {
		driver.findElement(Email).sendKeys("usra@gmail.com");
	}

	@Test
	public void mobile() {
		driver.findElement(Mobile).sendKeys("20209876789");
	}


	@Test
	public void subject() {

		driver.findElement(Subject).click();
	}
	
	
	@Test
     public void calendar() {
	driver.findElement(Calendar).click();

	List<WebElement> element = driver.findElements(By.xpath("//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[1]"));
	for(int i=0; i < element.size();i++) {

		WebElement add = element.get(i);

		String innerhtml = add.getAttribute("innerHTML");
		if(innerhtml.contains("25")) {
			add.click();
		}

	}
}


	@Test
	public void currentAdress() {
		driver.findElement(Address).sendKeys("test");
	}


	@Test
	public void gender() {
		WebElement radio = driver.findElement(GenderMale);
		radio.click();

		if(radio.isSelected()) {


			System.out.println("radio button is toggle On");

		}else {
			System.out.println("Radion button is toggle Off");
		}

		 
		WebElement radio2 = driver.findElement(GenderFemale);
		radio2.click();

		if(radio2.isSelected()) {


			System.out.println("radio button is toggle On");

		}else {
			System.out.println("Radion button is toggle Off");
		}
	 
	 
		WebElement radio3 = driver.findElement(GenderOthers);
		radio3.click();

		if(radio3.isSelected()) {


			System.out.println("radio button is toggle On");

		}else {
			System.out.println("Radion button is toggle Off");
		}

	}


	@Test
	public  void hobbies() {

		WebElement radio1 = driver.findElement(HobbiesSport);
		radio1.click();

		if(radio1.isSelected()) {


			System.out.println("radio button is toggle On");

		}else {
			System.out.println("Radion button is toggle Off");
		}

		WebElement radio2 = driver.findElement(HobbiesReading);
		radio2.click();

       if(radio2.isSelected()) {
			System.out.println("radio button is toggle On");

		}else {
			System.out.println("Radion button is toggle Off");
		}

		WebElement radio3 = driver.findElement(HobbiesMusic);
		radio3.click();

		if(radio3.isSelected()) {


			System.out.println("radio button is toggle On");

		}else {
			System.out.println("Radion button is toggle Off");
		}
	}

	@Test
	public void city() {


		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,400)");	 



		List<WebElement> element = driver.findElements(city);
		for(int i=0; i < element.size();i++) {

			WebElement add = element.get(i);


			String innerhtml = add.getAttribute("innerHTML");
			if(innerhtml.contains("Haryana")) {

				add.click();
			}

		}
	}


	@Test
	public void pictureUpload() {
		driver.findElement(Picture).sendKeys("C:\\Users\\Ulisses Da Silva\\Desktop\\Test automation.docx");
		 
		
		 
	}
 
	 

	@Test
	public void submit() {
		 
		    JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1900)");
			
			 
		List<WebElement> element = driver.findElements(Submit);
		for(int i=0; i < element.size();i++) {
			WebElement add = element.get(i);
			String innerhtml = add.getAttribute("innerHTML");
			if(innerhtml.contains("Submit")) {
				add.click();
			}
			 

		}

	}


}



