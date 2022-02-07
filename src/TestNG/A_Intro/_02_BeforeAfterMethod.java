package TestNG.A_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _02_BeforeAfterMethod {

    WebDriver driver;

    @BeforeMethod // will get executed before each @Test
    public void beforeEachTest() {

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        driver = new ChromeDriver();

        driver.get("https://techno.study/");
    }

    @AfterMethod // will get executed before each @Test
    public void afterEachTest() {

        driver.quit();
    }

    @Test
    public void test1() {

        String expectedURL = "https://techno.study/";

        String actualURL = driver.getCurrentUrl();

        // we check if actual URL equals expected URL:
        Assert.assertEquals(actualURL, expectedURL);

    }

    @Test
    public void test2() {

        String expectedURL = "https://techno.study/";

        WebElement sdetCourseLink = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseLink.click();

        String actualURL = driver.getCurrentUrl();

        Assert.assertEquals(actualURL, expectedURL);
    }

}
