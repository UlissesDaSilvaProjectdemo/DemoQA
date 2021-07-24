package com.bdddemoqa.utilities;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Ulisses Da Silva\\eclipse-workspace\\cucumberTest\\src\\test\\java\\com\\cucumberdemoqa\\features",
 glue={"com.demoqa.steps"},
 plugin= {"pretty",
		 "json:target/Myreports/reports.json",
		 "junit:target/Myreports/reports.xml",
		 "html:target/Myreports/htmlrepots"	 
	  }
  )
 

class TestRunner {

}
