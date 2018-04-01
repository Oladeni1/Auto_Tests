package com.CarTransplantlogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 30/03/2017.
 */
public class StepDefn {

    WebDriver driver = null;

    //WebDriverWait wait = new WebDriverWait(driver, 1000);//

   @Given("^I enter valid olatundeoladeni@yahoo\\.com and ILatunde$")
    public void i_enter_valid_olatundeoladeni_yahoo_com_and_ILatunde() throws Throwable {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\SELENIUM_JAR\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://auctions.car-transplants.co.uk/");
        driver.findElement(By.id("username")).sendKeys("olatundeoladeni@yahoo.com");
        driver.manage().window().maximize();
        driver. manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.id("password")).sendKeys("1Latunde");

    }
  @When("^I press login button$")
    public void i_press_login_button() throws Throwable {
        driver.findElement(By.className("main_header_login_submit")).click();

    }
    @Then("^I should see header logo$")
    public void i_should_see_header_logo() throws Throwable {
        driver.findElement(By.id("ct_header"));
        //driver.quit();
    }
}





















