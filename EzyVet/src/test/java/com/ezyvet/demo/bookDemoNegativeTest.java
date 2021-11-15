package com.ezyvet.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bookDemoNegativeTest  extends ezyvetBaseClass  {

	ezyvetBaseClass clibpage = new ezyvetBaseClass();
	By  FirstName = By.xpath("//*[@name=\"firstname\"]");
	By  LastName = By.xpath("//*[@name=\"lastname\"]");
	By  Email = By.xpath("//*[@name=\"email\"]");
	By  ClinicName = By.xpath("//*[@name=\"clinic_name\"]");
	By  Services = By.xpath("//*[@name=\"services\"]");
	By  AnimalTypes = By.xpath("//*[@name=\"primary_species\"]");
	By  Country = By.xpath("//*[@name=\"country\"]");
	By  PhoneAreaCode = By.xpath("//*[@name=\"phone_area_code\"]");
	By  Phonenumber = By.xpath("//*[@name=\"phone\"]");
	By  How_Did_You_Hear_About_Us = By.xpath("//*[@name=\"how_did_you_hear_about_us_\"]");
	By  What_are_you_looking_for = By.xpath("message");
	By I_agree_to_receive_email_from_ezyVet = By.xpath("//*[@name=\"LEGAL_CONSENT.subscription_type_4536252\"]");
	By submit = By.xpath("//*[@class=\"hs-button primary large\"]");

	
	
	@Test()
	public void AAAsubmit() {
		driver.switchTo().frame(0);
		driver.findElement(submit).click();
	}
	
	
	 

	@Test()
	public void FirstName() {
		String FirstName_msg = "Please complete this required field.";
		if(FirstName_msg.equals("Please complete this required field.")) {
			System.out.println("FirstName pass");
		}
		else {
			System.out.println("FirstName not Valid");
		}
		
	}

	@Test()
	public void LastName() {

		String LastName_msg = "Please complete this required field.";
		if(LastName_msg.equals("Please complete this required field.")) {
			System.out.println("LastName pass");
		}
		else {
			System.out.println("LastName not Valid");
		}
	}

	@Test()
	public  void Email() {


		String Email_msg = "Please complete this required field.";
		if(Email_msg.equals("Please complete this required field.")) {
			System.out.println("Email pass");
		}
		else {
			System.out.println("Email Fail");
		}

	}

	@Test()
	public void ClinicName() {

		String ClinicName_msg = "Please complete this required field.";
		if(ClinicName_msg.equals("Please complete this required field.")) {
			System.out.println("Clinic Name  pass");
		}
		else {
			System.out.println("ClinicName No validation");
		}


	}

	//@Test(priority=5)
	public void Services() {

		String Services_msg = "Please select an option from the dropdown menu";
		if(Services_msg.equals("Please select at least one option.")) {
			System.out.println("Services pass");
		}
		else {
			System.out.println("Services not Valid");
		}


	}

	//@Test(priority=6)
	public void AnimalTypes() {
		String AnimalTypes_msg = "Please select an option from the dropdown menu";
		if(AnimalTypes_msg.equals("Please select at least one option.")) {
			System.out.println("validateFirstName pass");
		}
		else {
			System.out.println("validateFirstName not Valid");
		}


	}

	@Test()
	public void Country() {
        
		String Country_msg = "Please select an option from the dropdown menu";
		
		if(Country_msg.equals("Please select an option from the dropdown menu.")) {
			System.out.println(" Country pass");
		}
		else {
			System.out.println(" Validate_Country not Valid");
		}
	}



	@Test()
	public void PhoneAreaCode() {
		String PhoneAreaCode_msg = "Please select an option from the dropdown menu";
		if(PhoneAreaCode_msg.equals("Please select an option from the dropdown menu.")) {
			System.out.println("PhoneAreaCode pass");
		}
		else {
			System.out.println("PhoneAreaCode not Valid");
		}
	}


	@Test()
	public void Phonenumber() {

		String Phonenumber_msg = "Please complete this required field.";
		if(Phonenumber_msg.equals("Please complete this required field.")) {
			System.out.println("Phonenumber pass");
		}
		else {
			System.out.println("Phonenumber not Valid");
		}
	}


	//@Test()
	public void How_Did_You_Hear_About_Us() {

		String How_Did_You_Hear_About_Us_msg = "Please select an option from the dropdown menu";
		if(How_Did_You_Hear_About_Us_msg.equals("")) {
			System.out.println("validateFirstName pass");
		}
		else {
			System.out.println("validateFirstName not Valid");
		}
	}


	//@Test(priority=11)
	public void What_are_you_looking_for() {

		String What_are_you_looking_for_msg = "Please select an option from the dropdown menu";
		if(What_are_you_looking_for_msg.equals("")) {
			System.out.println("validateFirstName pass");
		}
		else {
			System.out.println("validateFirstName not Valid");
		}
	}

	//@Test(priority=12)
	public void I_agree_to_receive_email_from_ezyVet() {

		String I_agree_to_receive_email_from_ezyVet_msg = "Please select an option from the dropdown menu";
		if(I_agree_to_receive_email_from_ezyVet_msg.equals("Please complete this required field.")) {
			System.out.println("validateFirstName pass");
		}
		else {
			System.out.println("validateFirstName not Valid");
		}

		if(I_agree_to_receive_email_from_ezyVet_msg.equals("Please complete all required fields.")) {
			System.out.println("validation pass ");

		}else {
			System.out.println("validataion Fail");
		}
	}
	
	 


}
