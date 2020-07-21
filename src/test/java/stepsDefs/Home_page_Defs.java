package stepsDefs;

import driver_manager.Drivers;
import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pageObjects.DatepickerPage;
import pageObjects.JQUERY_HOME_Page;

public class Home_page_Defs {
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)

    WebDriver driver;
    // String baseUrl;//--->move to Before Hook
    JQUERY_HOME_Page jquery_home_page;
    DatepickerPage datepickerPage;


    @Given("I am on the jquery homepage")
    public void i_am_on_the_jquery_homepage() {
        System.out.println("I am on the jquery home page");
        // baseUrl="https://jqueryui.com/";// moved before  HOOK
        driver = Drivers.getDriver();
        jquery_home_page = new JQUERY_HOME_Page(driver);
        datepickerPage = new DatepickerPage(driver);
        // driver.manage().window().maximize();---->Moved to @Before hook
        // driver.get(baseUrl);---->Moved to @Before hook
        String actualText = driver.getCurrentUrl();
        String expectedText = "https://jqueryui.com/";
        Assertions.assertEquals(expectedText, actualText);
    }

    @When("I click on controlgroup")
    public void i_click_on_controlgroup() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(" When I click on controlgroup");
        jquery_home_page.clickCtrlGroup();

    }

    @Then("I land on the controlgroup page")
    public void i_land_on_the_controlgroup_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Then I land  on controlgroup page");
        Assertions.assertEquals( "https://jqueryui.com/controlgroup/", driver.getCurrentUrl());

    }

    @When("I click on datepicker")
    public void i_click_on_date_picker() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside  when I  click datapicker");
        jquery_home_page.clickDatePicker();
    }

    @Then("I land on the datepicker page")
    public void i_land_on_the_date_picker_page() {
        System.out.println("inside then I land on the  date picker page");
    }

    @When("I click on checkboxradio")
    public void i_click_on_checkboxradio() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("inside when  checkbox radio clicking");
        jquery_home_page.clickCheckboxRadio();
    }

    @But("I land on the checkboxradio page")
    public void i_land_checkboxradio_page() {
        System.out.println("inside then I land on the   checkbox radio landing page");
        Assertions.assertEquals("https://jqueryui.com/checkboxradio/", driver.getCurrentUrl());

    }

    @And("I switch to demo-frame")
    public void switch_demo_frame() {
        System.out.println("switching to demo frame");
        jquery_home_page.switchFrame();
    }
}





