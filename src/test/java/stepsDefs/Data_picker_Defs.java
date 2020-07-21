package stepsDefs;

import driver_manager.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.DatepickerPage;
import pageObjects.JQUERY_HOME_Page;

public class Data_picker_Defs {

    @When("I validate date selection")
    public void date_selection(){
        WebDriver driver = Drivers.getDriver();
        DatepickerPage datepickerPage = new DatepickerPage(driver);
        System.out.println("inside date selection");
        datepickerPage.clickDatePick();
        datepickerPage.getAllDates("15");
    }
}
