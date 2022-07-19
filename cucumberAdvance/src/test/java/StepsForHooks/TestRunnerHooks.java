package StepsForHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/hookInBDD.feature",glue={"StepsForHooks"},
	monochrome=true,
	plugin = {"pretty","html:Reports/htmlReport/html",
	"json:Reports/JsonReport/Cucumber.json",
	"junit:Reports/junitReport/report.xml"})
	public class TestRunnerHooks {

		
	}

