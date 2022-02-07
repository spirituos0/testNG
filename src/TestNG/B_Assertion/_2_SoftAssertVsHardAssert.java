package TestNG.B_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _2_SoftAssertVsHardAssert {

    // Hard Assert: when assertion fails, execution stops:
    @Test
    public void hardAssert() {
        System.out.println("Before Assertion");
        Assert.fail();
        System.out.println("After Assertion");
        // <- not printed, because test is failed and execution stopped after assertion failure
    }

    // Soft Assert : test continues even after failure
    @Test
    public void softAssert() {
        System.out.println("Before Assertion");
        SoftAssert sf = new SoftAssert();
        sf.fail();
        System.out.println("After Assertion");

        sf.assertAll(); // will check every assertion and throw an exception if there is a failure

    }
}
