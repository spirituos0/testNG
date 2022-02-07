package TestNG.A_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_TestAnnotation {

    @Test // each test should have at least 1 assertion (validation), otherwise, it's not a test
    public void test1() {

        String expectedURL = "https://techno.study/";

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        String actualURL = driver.getCurrentUrl();

        // we check if actual URL equals expected URL:
        Assert.assertEquals(actualURL, expectedURL);

        driver.quit();

    }

    @Test
    public void test2() {

        String expectedURL = "https://techno.study/";

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        WebElement sdetCourseLink = driver.findElement(By.xpath("//a[text()='SDET course']"));
        sdetCourseLink.click();

        String actualURL = driver.getCurrentUrl();

        driver.quit();

        Assert.assertEquals(actualURL, expectedURL);

    }

    @Test
    public void test3() {

        String expectedURL = "https://techno.study/";

        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study/");

        WebElement mobileDevCourseLink = driver.findElement(By.xpath("//a[text()='Mobile Dev course']"));
        mobileDevCourseLink.click();

        String actualURL = driver.getCurrentUrl();

        driver.quit();

        Assert.assertEquals(actualURL, expectedURL);


    }

}
