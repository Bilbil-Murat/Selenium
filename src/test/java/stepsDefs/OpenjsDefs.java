package stepsDefs;

import driver_manager.AutomationContext;
import driver_manager.Drivers;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.OpenJSPage;

public class OpenjsDefs {
    AutomationContext context;
     OpenJSPage openJSPage =new OpenJSPage(Drivers.getDriver());
    public OpenjsDefs(AutomationContext context){
        this.context=context;

    }
    @And("^I read proporty (\\w+)$")
    public void i_Read_Proporties(String key){
        context.getScenarioMgr().getScenario().log(key+": property value  = "+context.getProportiesReader().getPropertyValue(key));
    }
    @And("^I set (\\w+)to \"(.*)\"$")
    public void i_set_login_details(String fiel,String valueKey) throws InterruptedException {
        openJSPage.setValue(fiel,context.getProportiesReader().getPropertyValue(valueKey));
        Thread.sleep(5000);

    }
}

