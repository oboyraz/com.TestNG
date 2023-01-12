package tests.D05_CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.CrossDriver;
import utilities.TestBaseCross;

public class C1_AmazonSearch extends TestBaseCross {

    @Test
    public void test01(){
        driver.get(ConfigReader.getProperty("amazonUrl"));

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella" + Keys.ENTER);

        WebElement resultTextElement = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String actResultText = resultTextElement.getText();
        String expData = "Nutella";

        Assert.assertTrue(actResultText.contains(expData));
        driver.quit();
    }
}
