package TestNG.B_Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class _3_Buttons_Task1 {

    @Test
    public void clickMeButtonTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons/");

        WebElement clickMeBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeBtn.click();

        WebElement dynamicClickMsg = driver.findElement(By.id("dynamicClickMessage"));

        String actual = dynamicClickMsg.getText();
        String expected = "You have done a dynamic click";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

    @Test
    public void rightClickMeButtonTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons/");

        Actions actions = new Actions(driver);

        WebElement rightClickMeBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickMeBtn).perform();

        WebElement rightClickMsg = driver.findElement(By.id("rightClickMessage"));

        String actual = rightClickMsg.getText();
        String expected = "You have done a right click";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

    @Test
    public void doubleClickMeButtonTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/spirituos0/Desktop/IT course/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/buttons/");

        Actions actions = new Actions(driver);

        WebElement doubleClickMeBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.contextClick(doubleClickMeBtn).perform();

        WebElement doubleClickMsg = driver.findElement(By.id("doubleClickMessage"));

        String actual = doubleClickMsg.getText();
        String expected = "You have done a double click";

        Assert.assertEquals(actual, expected);

        driver.quit();

    }

}
