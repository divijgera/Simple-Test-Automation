package src.test.Step_Definitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features",
        glue = {"src/test/Step_Definitions"})
public class TestRunner {
}
