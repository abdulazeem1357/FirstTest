package test_runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"features"},
        glue = "step_definations", dryRun = false, monochrome = true,
        plugin = {"pretty", "html:target/html-test-output.html",
        "json:target/cucumber.json",
        "junit:target/cucumber.xml" })
public class firstRunner {
}