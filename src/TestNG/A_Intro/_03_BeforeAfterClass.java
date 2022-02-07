package TestNG.A_Intro;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_BeforeAfterClass {

    @BeforeClass // will get executed ONCE before all the @Tests are executed
    public void beforeAllTests() {
        System.out.println("Do something before running any Test");
    }

    @AfterClass // will get executed ONCE after all @Tests are completed
    public void afterAllTests() {
        System.out.println("Do something after all tests are executed");
    }
    @Test
    public void test1() {
        System.out.println("Running Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Running Test 2");
    }

}
