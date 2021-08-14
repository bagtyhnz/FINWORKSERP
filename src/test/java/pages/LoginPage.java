package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


    public class LoginPage {

        public LoginPage(){
            PageFactory.initElements(Driver.get(), this);
        }

        @FindBy(id="login")
        public WebElement username;


        @FindBy(id="password")
        public WebElement password;

        @FindBy(xpath="//button[@class='btn btn-primary']")
        public WebElement login;


        public void login(String userNameStr, String passwordStr) {
            username.sendKeys(userNameStr);
            password.sendKeys(passwordStr);
            login.click();
            // verification that we logged
        }

    }



