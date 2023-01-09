package tests.D01_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_NGTest_DependsOn {

    @Test(priority = 5)
    public void firstTest(){
        System.out.println("first test");
        Assert.assertTrue(5>9);
    }

    @Test(dependsOnMethods = "firstTest")
    public void secondTest(){
        System.out.println("second test");
    }

    @Test(dependsOnMethods = "secondTest")
    public void thirdTest(){
        System.out.println("third test");
    }
}
