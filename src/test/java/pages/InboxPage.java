package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InboxPage {
    public InboxPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className="oe_topbar_name")
    public WebElement accountMenu;


    @FindBy(linkText="Log out")
    public WebElement logoutBtn;


    public void logout() {
        accountMenu.click();
       logoutBtn.click();
        // verification that we logged out
    }

}
