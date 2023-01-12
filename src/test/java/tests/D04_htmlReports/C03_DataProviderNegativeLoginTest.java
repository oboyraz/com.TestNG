package tests.D04_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderNegativeLoginTest {

    @DataProvider
    public static Object[][] qualityDemyNegativeLoginTest() {

        Object[][] wrongUsernamePasswordArray = {{"A11","A12345"},{"B11","B12345"},{"C11","C12345"},{"D11","D12345"}};
        return wrongUsernamePasswordArray;
    }

    @Test(dataProvider = "qualityDemyNegativeLoginTest") //dataProvider=> test metodlarının çoklu veri setleri ile çalışmasını sağlar.
    public void negativeLoginTest(String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage = new QualitydemyPage();
        qualitydemyPage.loginButton.click();
        qualitydemyPage.emailArea.sendKeys(username);
        qualitydemyPage.passwordArea.sendKeys(password);
        qualitydemyPage.submitLoginButton.click();

        Assert.assertTrue(qualitydemyPage.emailArea.isDisplayed());
        Driver.closeDriver();
    }
}
