package src.test.Step_Definitions;

import io.cucumber.core.backend.CucumberBackendException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class open {
    WebDriver driver = null;
    @Given("user is on airtel page")
    public void user_is_on_airtel_page() throws InterruptedException {
        System.out.println("Given - Step");
//        throw new io.cucumber.java.PendingException();
        System.setProperty("webdriver.chrome.driver",
                "src/test/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://www.airtel.in");
        Thread.sleep(3000);
    }

    @When("user enters his number")
    public void user_enters_his_number() throws InterruptedException {
        System.out.println("When - Step");
//        throw new io.cucumber.java.PendingException();
        boolean popup = driver.findElement(By.xpath("//*[@class='moe-popup-container']")).isDisplayed();
        if(popup){
            System.out.println("Pop-up Closed");
            driver.findElement(By.xpath("//*[@class='moe-btn moe-btn-block']")).click();
            Thread.sleep(3000);
        }
        driver.findElement(By.id("quickRechargeInput")).sendKeys("9999999999");
        Thread.sleep(3000);
    }

    @Then("user is taken to the recharge page")
    public void user_is_taken_to_the_recharge_page(){
        System.out.println("Then - Step");
//        throw new io.cucumber.java.PendingException();
        boolean res = driver.getPageSource().contains("Let’s Get Your");
        if (res){
            System.out.println("Success");
        }
        driver.close();
        driver.quit();
    }
}
