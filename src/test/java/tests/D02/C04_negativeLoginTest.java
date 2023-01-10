package tests.D02;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C04_negativeLoginTest {

    // wrong email, correct password
    // correct email, wrong password
    // wrong email, wrong password

    QualitydemyPage qualitydemyPage = new QualitydemyPage();
    @Test
    public void wrongEmailTest(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys("poyraz@adana.com");
        qualitydemyPage.passwordArea.sendKeys("31488081");
        qualitydemyPage.submitLoginButton.click();
        Assert.assertTrue(qualitydemyPage.emailArea.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void wrongPasswordTest(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordArea.sendKeys("123456");
        qualitydemyPage.submitLoginButton.click();
        Assert.assertTrue(qualitydemyPage.emailArea.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void wrongPasswordAndEmailTest(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys("poyraz@adana.com");
        qualitydemyPage.passwordArea.sendKeys("123456");
        qualitydemyPage.submitLoginButton.click();
        Assert.assertTrue(qualitydemyPage.emailArea.isDisplayed());
        Driver.closeDriver();
    }
}
