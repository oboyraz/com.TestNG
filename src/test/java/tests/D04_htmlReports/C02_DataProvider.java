package tests.D04_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {

    @DataProvider
    public static Object[][] AmazonSearchWords() {

        Object[][] amazonSearchWordsArray = {{"Nutella"}, {"Java"}, {"Apple"}, {"Samsung"}};
        return amazonSearchWordsArray; // Returns a two-fold object array
    }

    @Test(dataProvider = "AmazonSearchWords")
    public void searchTest(String searchWord){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(searchWord + Keys.ENTER);
        String actData = amazonPage.searchResultElement.getText();

        Assert.assertTrue(actData.contains(searchWord));
        Driver.closeDriver();
    }
}
