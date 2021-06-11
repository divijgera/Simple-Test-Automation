package src.test.Step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SearchSteps {
    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("1-Browser is open");
    }
    @And("user is on google")
    public void user_is_on_google() {
        System.out.println("2-User is on Google");

    }
    @When("user enters airtel in search box")
    public void user_enters_airtel_in_search_box() {
        System.out.println("3-User Enters Airtel in Search Box");

    }
    @And("hits enter")
    public void hits_enter() {
        System.out.println("4-User hits Enter");

    }
    @Then("user is navigated to the results")
    public void user_is_navigated_to_the_results() {
        System.out.println("5-User is navigated to the results");

    }
}
