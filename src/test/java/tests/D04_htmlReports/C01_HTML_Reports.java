package tests.D04_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class C01_HTML_Reports extends TestBaseReport {

    @Test
    public void test01(){

        extentTest= extentReports.createTest("Nutella Test", "users can search Nutella");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("went to amazon homepage");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);
        extentTest.info("typed nutella in the search box and searched");
        String actData = amazonPage.searchResultElement.getText();
        String expData = "Nutella";
        extentTest.info("search results saved");

        Assert.assertTrue(actData.contains(expData));
        extentTest.pass("search results tested to contain \"Nutella\"");
    }
}
