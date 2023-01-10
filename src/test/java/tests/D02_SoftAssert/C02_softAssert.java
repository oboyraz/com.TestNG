package tests.D02_SoftAssert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.ZeroWebAppPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.*;

public class C02_softAssert {

    @Test
    public void test01(){
        Driver.getDriver().get("http://zero.webappsecurity.com/");

        ZeroWebAppPage zeroWebAppPage = new ZeroWebAppPage();
        zeroWebAppPage.signInButton.click();
        zeroWebAppPage.loginText.sendKeys("username");
        zeroWebAppPage.passwordText.sendKeys("password");
        zeroWebAppPage.signInSubmitButton.click();
        Driver.getDriver().navigate().back();
        zeroWebAppPage.onlineBanking.click();
        zeroWebAppPage.payBills.click();
        zeroWebAppPage.purchaseForeignCurrency.click();

        Select select = new Select(zeroWebAppPage.currencyDropDown);
        select.selectByVisibleText("Eurozone (euro)");

        SoftAssert softAssert = new SoftAssert();
        String actDropDownSelect = select.getFirstSelectedOption().getText();
        String expDropDownSelect = "Eurozone (euro)";

        softAssert.assertEquals(actDropDownSelect,expDropDownSelect,"eurozone selection test failed");

        List<WebElement> optionsElementList = select.getOptions();

        List<String> actOptionsListStr = new ArrayList<>();
        for (WebElement each:optionsElementList) {
            actOptionsListStr.add(each.getText());
        }

        String[] arr={"Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"};
        List<String> expectedOptions = Arrays.asList(arr);

        Collections.sort(actOptionsListStr);
        Collections.sort(expectedOptions);

        softAssert.assertEquals(expectedOptions,actOptionsListStr);

        ReusableMethods.delay(3);
        softAssert.assertAll();
        Driver.closeDriver();

    }
}
