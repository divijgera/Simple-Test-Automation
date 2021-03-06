package src.test.Step_Definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features",
        glue = {"src/test/Step_Definitions"},
monochrome = true,
plugin = {"pretty","junit:target/JUnitReport/junit_report.xml",
"json:target/JSONReport/json_report.json",
"html:target/HTMLReport/html_report.html"})

public class TestRunner {
}
