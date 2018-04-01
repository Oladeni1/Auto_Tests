package com.RobertKennedy.RobertKennedy;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

/**
 * Created by user on 22/03/2017.
 */
public class StepDefn {

    WebDriver driver = null;

    Thread thread;

    @Given("^I am on robert kennedy landing page$")
    public void i_am_on_robert_kennedy_landing_page() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\SELENIUM_JAR\\chromedriver.exe");
        driver = new ChromeDriver();
       driver.get("https://campus.college.ch");
       driver.manage().window().maximize();
      System.out.println("This is the page Title "+driver.getTitle());
    }

    @Given("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String arg1, String arg2) throws Throwable {
        driver.findElement(By.id("name")).sendKeys(arg1);
        thread.sleep(100);
        driver.findElement(By.id("pass")).sendKeys(arg2);
    }

    @Given("^I click login button$")
    public void i_click_login_button() throws Throwable {
        thread.sleep(100);
        driver.findElement(By.className("submit")).click();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see(String arg1) throws Throwable {
        thread.sleep(1000);
        driver.quit();
    }

}




