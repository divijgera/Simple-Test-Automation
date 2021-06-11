package src.test.Step_Definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class SearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("1-Browser is open");
        System.setProperty("webdriver.chrome.driver",
                "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @And("user is on google")
    public void user_is_on_google() {
        System.out.println("2-User is on Google");
        driver.navigate().to("https://google.com");
    }
    @When("user enters airtel in search box")
    public void user_enters_airtel_in_search_box() throws InterruptedException {
        System.out.println("3-User Enters Airtel in Search Box");
        driver.findElement(By.name("q")).sendKeys("airtel");
        Thread.sleep(3000);
    }
    @And("hits enter")
    public void hits_enter() throws InterruptedException {
        System.out.println("4-User hits Enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    @Then("user is navigated to the results")
    public void user_is_navigated_to_the_results() {
        System.out.println("5-User is navigated to the results");
        boolean result = driver.getPageSource().contains("Prepaid Recharge");
        if (result) System.out.println("Successful Search");
        driver.close();
        driver.quit();
    }
}
