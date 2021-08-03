package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

 

@RunWith(Cucumber.class)
@CucumberOptions(
 features=".//com.demoqa.features/demoqaForm.feature",
 glue={"com.demoqa.steps"},
 dryRun=true,
 plugin= {"pretty",
		 "html:test-output",
		 "json:target/Myreports/reports.json",
		 "junit:target/Myreports/reports.xml",
		 "html:target/Myreports/htmlrepots"	 
	  }
  )
 

class TestRunner {

}
