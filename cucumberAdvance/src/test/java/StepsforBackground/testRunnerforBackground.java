package StepsforBackground;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



	@RunWith(Cucumber.class)
	@CucumberOptions(features="src/test/resources/Features/backGroundDemo.feature",glue={"xyz"},
	monochrome=true,
	plugin = {"pretty","html:Reports1/htmlReport/html",
	"json:Reports/JsonReport/Cucumber.json",
	"junit:Reports/junitReport/report.xml"})

public class testRunnerforBackground {

}
