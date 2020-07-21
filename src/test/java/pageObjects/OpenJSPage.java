package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenJSPage {

    public OpenJSPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    public  void setValue(String filed,String value){
        if(filed.equals("email")){
            email.sendKeys(value);
        }else {
            password.sendKeys(value);
        }
    }
}
