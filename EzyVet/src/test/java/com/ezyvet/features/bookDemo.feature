Feature: The user woudl like to book a Demo in the application

  Scenario: The user want to make a book on the ezyvet page
  
    Given The user navigate to the Book a Demo form page
    When The user enter First Name "First Name"
    And The user enter Last Name "Last Name"
    And The user enter Email "Email"
    And The user enter Clinic Name "Clinic Name*"
    And The user enter Staff count details
    And The user enter chose a Service 
    And The user  choose a Extra Service
    And The user choose a Anymal Type
    And The user enter a country
    And The user enter a Phone Area Code
    And The user enter a Phone number "Phone number*"
    And The user select a choice in the How did you hear about us? drop down
    And The user writer a message
    And The user I agree to receive email and phone communications from ezyVet
    Then The user submit the application form.

    
    Scenario: The user would like to update the price range
    Given the user arrived in the price page 
    When the user change the price range 
    And  the  application should change the price 
    Then  the user should see a change in the price 
    
    