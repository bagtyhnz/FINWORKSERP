package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LogoutStepDefs {

    //here is my comment from github to make a change in you source code. chose what you want do do wit it
    @Given("the Sales Manager is logged in")
    public void the_Sales_Manager_is_logged_in() {

        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login(ConfigurationReader.get("sales_manager_username"),ConfigurationReader.get("salesmanager_password"));
    }

    @When("the user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
       BrowserUtils.waitForPageToLoad(3);
       new DashboardPage().logOut();
    }

    @Then("the user should be logged out")
    public void the_user_should_be_logged_out() {
        BrowserUtils.waitFor(1);
        Assert.assertEquals("Login | Best solution for startups",Driver.get().getTitle());
    }

    @Given("the Point of Sales Manager is logged in")
    public void the_Point_of_Sales_Manager_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login(ConfigurationReader.get("pos_manager_username"),ConfigurationReader.get("pos_manager_password"));
        BrowserUtils.waitFor(5);
    }

    @Given("the Inventory Manager is logged in")
    public void the_Inventory_Manager_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login(ConfigurationReader.get("inventory_manager_username"),ConfigurationReader.get("inventory_manager_password"));
        BrowserUtils.waitFor(5);
    }

    @Given("the Expenses Manager is logged in")
    public void the_Expenses_Manager_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login(ConfigurationReader.get("expenses_manager_username"),ConfigurationReader.get("expenses_manager_password"));
        BrowserUtils.waitFor(5);
    }

    @Given("the Manufacturing User is logged in")
    public void the_Manufacturing_User_is_logged_in() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
        new LoginPage().login(ConfigurationReader.get("manufacturing_user_username"),ConfigurationReader.get("manufacturing_user_password"));
        BrowserUtils.waitFor(5);
    }

}
