package tests.D01_testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C02_searchTest {

    @Test
    public void searchTest(){
        Driver.getDriver().get("https://www.amazon.com");

        WebElement searchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella" + Keys.ENTER);
        WebElement searchBoxElement = Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expData = "Nutella";
        String actData = searchBoxElement.getText();

        Assert.assertTrue(actData.contains(expData));
        Driver.closeDriver();
    }
}
