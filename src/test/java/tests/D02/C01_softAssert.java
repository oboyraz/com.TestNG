package tests.D02;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_softAssert {

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");

        SoftAssert softAssert = new SoftAssert();

        String expUrl = "amazon";
        String actUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertTrue(actUrl.contains(expUrl));

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);


        String actSearchResult = amazonPage.searchResultElement.getText();
        softAssert.assertTrue(actSearchResult.contains("Nutella"));

        amazonPage.searchBox.clear();
        amazonPage.searchBox.sendKeys("Java" + Keys.ENTER);

        ReusableMethods.delay(3);

        // 1-48 of over 7,000 results for "Java"

        String searchResultText = amazonPage.searchResultElement.getText();
        String[] resultArr = searchResultText.split(" ");

        String javaResultNumber = resultArr[3]; // 6,000
        javaResultNumber = javaResultNumber.replaceAll("\\W","");
        int resultNumber = Integer.parseInt(javaResultNumber);

        softAssert.assertTrue(resultNumber>1000);
        softAssert.assertAll();
        Driver.closeDriver();
    }
}
