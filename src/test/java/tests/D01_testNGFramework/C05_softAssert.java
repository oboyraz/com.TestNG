package tests.D01_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_softAssert {

    @Test(groups = {"minireg1","smoke"})
    public void test01(){
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(6,6);
        System.out.println("after first assertion");
        softAssert.assertTrue(5>3);
        System.out.println("after second assertion");
        softAssert.assertFalse(3>5);
        System.out.println("after third assertion");

        softAssert.assertAll(); // report
        System.out.println("after all assert");
    }
}
