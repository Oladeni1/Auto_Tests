package com.MoT;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by user on 18/03/2017.
 */
public class StepDefn {


    WebDriver driver = null;

    @Given("^I am on hmrc home page$")
    public void i_am_on_hmrc_home_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\SELENIUM_JAR\\chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("https://www.gov.uk/check-mot-status");

    }

    @Given("^I navigate to mot page$")
    public void i_navigate_to_mot_page() throws Throwable {

    }

    @Given("^I click on mot link$")
    public void i_click_on_mot_link() throws Throwable {
        driver.findElement(By.className("button")).click();

    }

    @Given("^I enter car details$")
    public void i_enter_car_details() throws Throwable {
        driver.findElement(By.id("Vrm")).sendKeys("VA54HKE");
        driver.findElement(By.id("Make")).sendKeys("Toyota");

    }

    @When("^I click submit button$")
    public void i_click_submit_button() throws Throwable {
        driver.findElement(By.id("Search")).click();

    }

    @Then("^I should see the car details displayed$")
    public void i_should_see_the_car_details_displayed() throws Throwable {
        //driver.quit();
    }

}
