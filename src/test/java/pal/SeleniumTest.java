package pal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private static WebDriver driver;

    @Test()
    public void browserInitTest() {
            System.setProperty("webdriver.chrome.driver","C:/DevOps/applications/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        Assert.assertEquals(driver.getTitle(),"Palindrome Check");
        driver.close()
        driver.quit();
    }
        @Test()
    public void PalindromeWebPageTestKayak() {
            System.setProperty("webdriver.chrome.driver","C:/DevOps/applications/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        WebElement text = driver.findElement(By.name("word"));
        text.sendKeys("Kayak");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        String bodyText = driver.findElement(By.tagName("body")).getText();
        assertTrue(bodyText.contains("Kayak is a Palindrome!"));
        driver.close();
        driver.quit();
    }
}
