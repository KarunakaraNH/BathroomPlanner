package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\nhkar\\IdeaProjects\\BathrromPlanner\\src\\test\\java\\Feature",
        glue="stepDefinitions",
        dryRun = false)
public class TestRunner {

}