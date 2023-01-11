package tests.D02_SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C03_positiveLoginTest {

    @Test(groups = "smoke")
    public void test01(){
        Driver.getDriver().get("https://www.qualitydemy.com");

        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys("user_1106147@login.com");

        qualitydemyPage.passwordArea.sendKeys("31488081");

        qualitydemyPage.submitLoginButton.click();

        Assert.assertTrue(qualitydemyPage.successLogin.isDisplayed());

        Driver.closeDriver();

    }
}
