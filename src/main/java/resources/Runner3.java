package resources;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features={"featurefiles"},tags={"@loginmultipledata"},glue={"stepdefinitions"},monochrome=true,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/login.html","pretty", "html:target/cucumber-reports"})
public class Runner3 extends AbstractTestNGCucumberTests{

}


