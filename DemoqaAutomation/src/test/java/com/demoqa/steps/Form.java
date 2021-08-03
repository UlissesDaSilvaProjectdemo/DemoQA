package com.demoqa.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.bdddemoqa.utilities.BrowserFactory;
import com.demoqa.pages.FormPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Form {
	
	 FormPages formpg = new FormPages();
	
	 

@Given("The user  arrived into the form page")
public void the_user_arrived_into_the_form_page() throws InterruptedException {
	formpg.setBrowserFactory();
	formpg.urlnaviagtetoForm();
         
}

@When("The user enter   {string} and {string}")
public void the_user_enter_and(String name, String last_name) throws IOException, InterruptedException {
	 formpg.name(name,last_name);
     
}

@And("The user  enter  {string}")
public void the_user_enter(String email) {
	formpg.Email(email);
  
}

@And("The user  enter  Gender")
public void the_user_enter_gender() {
	formpg.Gender();
}

@Given("The  enter a phone {string}")
public void the_enter_a_phone (String phone) {
	formpg.phone(phone);
	
     
}

@And("The  enter  DOB")
public void the_enter_dob() {
	formpg.Date_of_Birth();
}

@And("The  enter {string}")
public void the_enter(String subject) {
	
	formpg.Subjects(subject);
    
}

@And("The user enter Hobbies")
public void the_user_enter_hobbies() {
	formpg.Hobbies();
}

@And("The user upload a picture")
public void the_user_upload_a_picture() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
 
@And("The uer update current address")
public void the_uer_update_current_address() {
	formpg.Current_Address();
}


@And("the user seleect state and city")
public void the_user_seleect_state_and_city(String state, String city) throws IOException {
	formpg.State_and_City(state,city);
}

@Then("the user submit the form.")
public void the_user_submit_the_form() {
   System.out.println("form");
    throw new io.cucumber.java.PendingException();
}

@Given("The user enter ([^\"]*)<name1> and ([^\"]*)<last_name1>")
public void the_user_enter_name1_and_last_name1() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("The user  enter ([^\"]*) email1@gmail.com")
public void the_user_enter_email1_gmail_com() {
 System.out.println("email");
    throw new io.cucumber.java.PendingException();
}

@And("The  enter  {int}")
public void the_enter(Integer int1) {
    System.out.println("phone_number");
    throw new io.cucumber.java.PendingException();
}

@And("The user enter   name2 and last_name2")
public void the_user_enter_name2_and_last_name2() {
   System.out.println("name last name2");
    throw new io.cucumber.java.PendingException();
}

@And("The user  enter ([^\"]*) email2@gmail.com")
public void the_user_enter_email2_gmail_com() {
   System.out.println("email");
    throw new io.cucumber.java.PendingException();
}

@And("The user enter  ([^\"]*)  name3 and ([^\"]*)last_name3")
public void the_user_enter_name3_and_last_name3() {
   System.out.println("name lastname3");
    throw new io.cucumber.java.PendingException();
}

@And("The user enter  ([^\"]*) name4 and ([^\"]*)last_name4")
public void the_user_enter_name4_and_last_name4() {
    System.out.println("name lastname4");
    throw new io.cucumber.java.PendingException();
}

@Then("The user enter ([^\"]*)  name5 and ([^\"]*) last_name5")
public void the_user_enter_name5_and_last_name5() {
   System.out.println("name lastname5");
    throw new io.cucumber.java.PendingException();
}



}
