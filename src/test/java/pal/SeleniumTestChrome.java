package pal;

import java.util.ArrayList;
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

public class SeleniumTestChrome {

    private static WebDriver driver;

    @Test()
    public void browserInitTest() {
            System.setProperty("webdriver.chrome.driver","C:/DevOps/applications/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        Assert.assertEquals(driver.getTitle(),"Palindrome Check");
        driver.close();
        driver.quit();
    }
        @Test()
    public void PalindromeWebPageTestKayak() {
            System.setProperty("webdriver.chrome.driver","C:/DevOps/applications/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");
        //System.out.println("Step 1: Entering Kayak into text field");
        WebElement text = driver.findElement(By.name("word"));
        text.sendKeys("Kayak");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        String bodyText = driver.findElement(By.tagName("body")).getText();
        assertTrue(bodyText.contains("Kayak is a Palindrome!"));
        driver.close();
        driver.quit();
    }
        @Test()
    public void TestSpoonerismLink() {
            System.setProperty("webdriver.chrome.driver","C:/DevOps/applications/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        WebElement link = driver.findElement(By.linkText("convert to spoonerism?"));
        link.click();
        assertEquals(driver.getTitle(), "Spoonerism Converter");
        driver.close();
        driver.quit();
    }
        @Test()
    public void TestSpoonerismLinkExtended() {
            System.setProperty("webdriver.chrome.driver","C:/DevOps/applications/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        WebElement link = driver.findElement(By.linkText("convert to spoonerism?"));
        link.click();
        WebElement word1 = driver.findElement(By.name("word1"));
        WebElement word2 = driver.findElement(By.name("word2"));
        word1.sendKeys("burning");
        word2.sendKeys("rubber");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        String bodyText = driver.findElement(By.tagName("body")).getText();                                       
        assertTrue(bodyText ,bodyText.contains("the spoonerism is: rurning bubber"));
        driver.close();
        driver.quit();
    }
}
