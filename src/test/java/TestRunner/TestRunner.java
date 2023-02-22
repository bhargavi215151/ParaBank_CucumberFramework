package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith((Cucumber.class))


@CucumberOptions(features ="src/test/resources/Features", monochrome = true ,glue = {"StepDefinitions"},
plugin = { "pretty", "html:target/reports.html",
		"json:target/reports/cucumber.json",
		"junit:target/reports/cucumber.xml"}
       )


public class TestRunner {
	
}
