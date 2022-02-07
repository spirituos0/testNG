package TestNG.B_Assertion;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class _1_Assertions {

    @Test
    public void assertEquals() {
        String expected = "Hello";
        String actual = "Hello";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void assertEquals2() {
        String expected = "Hello";
        String actual = "hello";

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result!");
    }

    @Test
    public void assertEquals3() {
        String[] expected = {"Hello", "twenty"};
        String[] actual = {"twenty", "Hello"};

        // same values, different order : FAIL
        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result!");
    }

    @Test
    public void assertEqualsNoOrder() {
        String[] expected = {"Hello", "twenty"};
        String[] actual = {"twenty", "Hello"};

        // same values, but different order : PASS
        Assert.assertEqualsNoOrder(actual, expected, "Actual result should be equal to Expected result, order does not matter!");
    }

    @Test
    public void assertSame() {
        String[] expected = {"TechnoStudy"};
        String[] actual = {"TechnoStudy"};

        // FAIL
        Assert.assertSame(actual, expected, "Actual and Expected should point to the same object");
        // assertSame() checks if the object is the same or not.
        // objects are different, even tho values are the same

    }

    @Test
    public void assertSame2() {
        String[] expected = {"TechnoStudy"};
        String[] actual = expected;

        // reference to the same object: PASS
        Assert.assertSame(actual, expected, "Actual and Expected should point to the same object");

    }

    @Test
    public void assertNotSame() {
        String[] expected = {"TechnoStudy"};
        String[] actual = expected;

        // pointing to 2 different object with the same value: PASS
        Assert.assertNotSame(actual, expected, "Actual and Expected should NOT point to the same object");
    }

    @Test
    public void assertNotSame2() {
        String[] expected = {"Hello"};
        String[] actual = expected;

        // pointing to the same object: FAIL
        Assert.assertNotSame(actual, expected, "Actual and Expected should NOT point to the same object");
    }

    @Test
    public void assertNotNull() {
        String nullString = null;

        // object is null : FAIL
        Assert.assertNotNull(nullString, "Object should NOT be null");
    }

    @Test
    public void assertNotNull2() {
        String notNullString = "TestNG";

        // object is not null : PASS
        Assert.assertNotNull(notNullString, "Object should NOT be null");
    }

    // method to create random boolean value for the next tests:
    public boolean isDataAvailable() {
        Random rnd = new Random();
        return rnd.nextBoolean();
    }

    @Test
    public void assertTrue() {
        boolean actual = isDataAvailable();

        // if boolean is true, then PASS; if False - FAIL
        Assert.assertTrue(actual, "Test passes if boolean is True");
    }

    @Test
    public void assertFalse() {
        boolean actual = isDataAvailable();

        // if boolean is False, then PASS; if True - FAIL
        Assert.assertFalse(actual, "Test passes if boolean is False");
    }

    @Test
    public void assertFail() {
        if (!isDataAvailable()) {
            Assert.fail();
        }
    }

    @Test
    public void assertFail2() {
        try {
            // try to find element
        } catch (NoSuchElementException ex) {
            Assert.fail("test failed, because Selenium cannot find an element");
        }
    }
}
