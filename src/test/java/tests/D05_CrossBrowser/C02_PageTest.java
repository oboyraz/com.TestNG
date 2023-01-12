package tests.D05_CrossBrowser;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseCross;

public class C02_PageTest extends TestBaseCross {

    @Test
    public void test01(){

        driver.get("https://www.amazon.com");

        String actUrl = driver.getCurrentUrl();
        String expData = "amazon";
        Assert.assertTrue(actUrl.contains(expData));

    }
}
