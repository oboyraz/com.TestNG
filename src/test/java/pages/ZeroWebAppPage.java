package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroWebAppPage {

    public ZeroWebAppPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id="signin_button")
    public WebElement signInButton;

    @FindBy(id = "user_login")
    public WebElement loginText;

    @FindBy(id="user_password")
    public WebElement passwordText;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement signInSubmitButton;

    @FindBy(id = "onlineBankingMenu")
    public WebElement onlineBanking;

    @FindBy(id = "pay_bills_link")
    public WebElement payBills;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement currencyDropDown;
}
