package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\15105\\eclipse-workspace\\Cucumber\\features\\Leads.feature",
                 glue= {"com.training.steps"},
                 plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
                		             "json:target/cucumber-reports/cucumber.json"}
                 //tags= "@TC05"
                 
                  	)



public class Runner {
	
	
	

}

//tags= "@Opportunities"