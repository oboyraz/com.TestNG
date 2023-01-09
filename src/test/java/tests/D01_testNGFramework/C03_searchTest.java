package tests.D01_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_searchTest {
    @Test(groups = {"minireg1", "minireg2","smoke"})
    public void test01(){
        ReusableMethods.delay(3);

        Driver.getDriver().get("https://www.amazon.com");
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);
        String expData = "Nutella";
        String actData = amazonPage.searchResultElement.getText();

        Assert.assertTrue(actData.contains(expData));
        Driver.closeDriver();
    }
}
