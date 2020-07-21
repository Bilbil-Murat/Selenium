package stepsDefs;

import driver_manager.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.ControlGroupPage;

 public class Control_Group_Defs {

     ControlGroupPage controlGroupPage = new ControlGroupPage(Drivers.getDriver());

     @Given("I validate header")
     public void i_validate_Header() {
//         controlGroupPage = new ControlGroupPage(Drivers.getDriver());
         Assert.assertEquals(controlGroupPage.headerText(), "Controlgroup");
         System.out.println(" Completed I validate header ");
     }

     @Given("^I click (\\w+) arrow (\\d+) times$")
     public void i_click_arrow(String btn, int times) {
         for (int i = 0; i < times; i++) {
             if (btn.equals("up")) {
                 controlGroupPage.clickUp();
             } else {
                 controlGroupPage.clickdown();
             }
         }
     }

     @Given("^I validate that number of cars is (\\d+)$")
     public void i_validate_cars(int numCars) {
         Assert.assertEquals(String.valueOf(numCars), controlGroupPage.getNumCars());
         System.out.println("completed I validate number of cars as " + numCars);
     }
 }

