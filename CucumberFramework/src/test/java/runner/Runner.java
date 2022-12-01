package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//pretty- to give colors
// ~ negation sign it will not execute 
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"json:target/cucumber-report.json","pretty"},
		features= {"features"},
		glue= {"stepDefination"}
		//tags= "~@login"
		
)
public class Runner {

}
