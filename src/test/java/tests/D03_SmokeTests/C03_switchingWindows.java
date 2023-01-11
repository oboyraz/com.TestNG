package tests.D03_SmokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_switchingWindows {

    @Test
    public void test01(){
        // go to https://the-internet.herokuapp.com/iframe
        // click selenium link
        // switching to window which title is =>"Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro"
        // Validate to "Elemental Selenium" text in page.

        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();
        ReusableMethods.switchToWindow("Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro");

        WebElement elementalText = Driver.getDriver().findElement(By.tagName("h1"));
        String expData = "Elemental Selenium";
        String actData = elementalText.getText();

        Assert.assertEquals(actData,expData);

        Driver.quitDriver();

    }
}
