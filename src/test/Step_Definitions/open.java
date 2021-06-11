package src.test.Step_Definitions;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;

public class open {
    @Given("user is on airtel page")
    public void user_is_on_airtel_page(){
        System.out.println("Given - Step");
//        throw new io.cucumber.java.PendingException();
    }

    @When("user enters his number")
    public void user_enters_his_number(){
        System.out.println("When - Step");
//        throw new io.cucumber.java.PendingException();
    }

    @Then("user is taken to the recharge page")
    public void user_is_taken_to_the_recharge_page(){
        System.out.println("Then - Step");
//        throw new io.cucumber.java.PendingException();
    }
}
