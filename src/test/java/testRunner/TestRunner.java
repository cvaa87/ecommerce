package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features",
        glue= {"StepDefinitions"},
        monochrome=true,
       dryRun=false,
       strict=true,
       format= {"pretty","html:test-output","json:json.output/cucumber.json","junit:junit_xml/cucumber.xml"}
        )
public class TestRunner {

}
