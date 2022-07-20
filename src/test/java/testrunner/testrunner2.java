package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//J-UNIT
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src//test//resources//Features",
//glue= {"stepdefinition"})
//public class testrunner1 {
//
//}

//TESTNG
@CucumberOptions(features="src//test//resources//Features",
glue= {"stepdefinition"},
plugin = {"pretty","html:target/html_report002.html",
		"json:target/json_reports/json_report.json",
		"junit:target/junit_reports/junit_report.xml"}, strict=true)

public class testrunner2 extends AbstractTestNGCucumberTests{

}

