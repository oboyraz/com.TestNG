package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualitydemyPage {

    public QualitydemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginButton;

    @FindBy(id = "login-email")
    public WebElement emailArea;

    @FindBy(id = "login-password")
    public WebElement passwordArea;

    @FindBy(xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement submitLoginButton;

    @FindBy(linkText = "My courses")
    public WebElement successLogin;
}
