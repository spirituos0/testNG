package TestNG.C_XML;

import org.testng.annotations.Test;

public class _04_SecondGroupClass {

    @Test(groups = "Regression", priority = 1)
    public void Test1() {
        System.out.println("Test 1");
    }

    @Test(groups = "SmokeTest", priority = 2)
    public void Test2() {
        System.out.println("Test 2");
    }

    @Test(groups = "Regression", priority = 3)
    public void Test3() {
        System.out.println("Test 3");
    }

    @Test(groups = "SmokeTest", priority = 4)
    public void Test4() {
        System.out.println("Test 4");
    }

    @Test(groups = {"Regression", "SmokeTest"})
    public void Test5() {
        System.out.println("Test 5");
    }

    @Test
    public void Test6() {
        System.out.println("This test is NOT in any group");
    }
}

