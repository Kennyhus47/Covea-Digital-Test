package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Application_Form.feature", 
glue= {"StepDefinitions"},
//tags={"@login or smoke and regression and not sanity"}
monochrome= true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/report.json",
		"json:target/cucumber.json",
		"html:target/HtmlReports"}
		)
public class TestRunner {

}
