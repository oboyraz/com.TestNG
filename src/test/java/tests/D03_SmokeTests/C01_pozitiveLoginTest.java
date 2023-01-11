package tests.D03_SmokeTests;

import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_pozitiveLoginTest {
    @Test
    public void pozitiveLoginTest(){

        //go qualitydemy main page

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys(ConfigReader.getProperty("qdValidUsername"));
        qualitydemyPage.passwordArea.sendKeys(ConfigReader.getProperty("qdValidPassword"));

        qualitydemyPage.submitLoginButton.click();
        ReusableMethods.delay(2);

        Assert.assertTrue(qualitydemyPage.successLogin.isDisplayed());

        Driver.closeDriver();


    }
}
