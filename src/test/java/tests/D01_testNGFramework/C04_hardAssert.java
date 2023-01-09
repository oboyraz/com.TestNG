package tests.D01_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_hardAssert {

    @Test
    public void test01(){
        Assert.assertTrue(6>4);
        System.out.println("after first assertion");
        Assert.assertTrue(6>14);
        System.out.println("after second assertion");
        Assert.assertEquals(6,6);
        System.out.println("after third assertion");
    }
}
