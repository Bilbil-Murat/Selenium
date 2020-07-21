package stepsDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class Practice_Steps {


    @When("^I read parameter \"(.*)\"$")
    public void i_read_parameter(String parameter) {
        System.out.println("parameter is : " + parameter);
    }

    @When("^I login with \"(.*)\" id and \"(.*)\" password$")
    public void multi_parameters(String userId, String password) {
        System.out.println("user id is : " + userId);
        System.out.println("password is : " + password);
    }

    @When("^I signup with user name \"(.*)\" and email \"([^\"]*)\"$")
    public void multi_parameters_N2(String name, String email) {
        System.out.println("name is:" + name);
        System.out.println("email is:" + email);
    }

    @When("^I login with (\\w+) id and (\\w+)password$")
    public void i_login_word_parameters(String id, String password) {
        System.out.println("Id id : "+id);
        System.out.println("Password is :"+password);
    }

    @When("^I pass intiger (\\d+)$")
    public void i_pass_intiger(int int1) {
        System.out.println("int parameter : " + int1);
    }

    @When("^I pass double value (\\d+.\\d+)$")
    public void doubleparameter(double parameter) {
        System.out.println("Double  parameter  is: " + parameter);
    }

    @When("^I selected (Fast|Faster|Medium|Slow|Slower) from the speed drop down$")
    public void limitedparameters(String parameter) {
        System.out.println("limited param is:" + parameter);
    }


    @When("^I fill (\\w+) form$")
    public void read_map(String formType, Map<String, String> parameters) {
        System.out.println("\r\nForm type: " + formType);
        for (Map.Entry<String,String> parameter : parameters.entrySet()) {
            System.out.println("key: " + parameter.getKey() + "\t\t\t\t\t\t\t\t\t\tValue : " + parameter.getValue());
        }
    }

    @When("^I fill all forms$")
    public void fill_all_forms(DataTable ps) {
        List<Map<String, String>> list = ps.asMaps(String.class, String.class);
        for (Map<String, String> eachMap : list) {
            System.out.println("\r\n");
            for (Map.Entry<String, String> entry : eachMap.entrySet()) {
                System.out.println("key: " + entry.getKey() + ";\t\tvalue :" + entry.getValue());
            }
        }
    }

    @When("^I fill all forms (\\w+)$")
    public void i_fill_all_forms_browser(String browser, DataTable ps) {
        List<Map<String, String>> list = ps.asMaps(String.class, String.class);
        System.out.println("Browser :" + browser);
        for (Map<String, String> eachMap : list) {
            for (Map.Entry<String, String> entry : eachMap.entrySet()) {
                System.out.println("key: " + entry.getKey() + ";\t\t\t\tvalue :" + entry.getValue());
            }
        }
    }
}






