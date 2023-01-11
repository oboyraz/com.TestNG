package tests.D03_SmokeTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_negativeLoginTest {
    // wrong email, correct password
    // correct email, wrong password
    // wrong email, wrong password

    QualitydemyPage qualitydemyPage = new QualitydemyPage();

    @Test
    public void wrongEmailTest(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys(ConfigReader.getProperty("qdInvalidUsername"));
        qualitydemyPage.passwordArea.sendKeys(ConfigReader.getProperty("qdValidPassword"));
        qualitydemyPage.submitLoginButton.click();
        Assert.assertTrue(qualitydemyPage.emailArea.isDisplayed());
        Driver.quitDriver();
    }

    @Test
    public void wrongPasswordTest(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys(ConfigReader.getProperty(("qdValidUsername")));
        qualitydemyPage.passwordArea.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));
        qualitydemyPage.submitLoginButton.click();
        Assert.assertTrue(qualitydemyPage.emailArea.isDisplayed());
        Driver.quitDriver();
    }

    @Test
    public void wrongEmailWrongPasswordTest(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys(ConfigReader.getProperty(("qdInvalidUsername")));
        qualitydemyPage.passwordArea.sendKeys(ConfigReader.getProperty("qdInvalidPassword"));
        qualitydemyPage.submitLoginButton.click();
        Assert.assertTrue(qualitydemyPage.emailArea.isDisplayed());
        Driver.quitDriver();
    }
}
