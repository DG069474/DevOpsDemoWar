package pal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class SeleniumTestFirefox {

    private static WebDriver driver;
    
    public void setup(){
     System.setProperty("webdriver.gecko.driver","C:/DevOps/applications/firefoxdriver_win64/geckodriver.exe");
     driver = new FirefoxDriver();
    }
    
    @Test()
    public void browserInitTest() {
            System.setProperty("webdriver.gecko.driver","C:/DevOps/applications/firefoxdriver_win64/geckodriver.exe");
            driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        Assert.assertEquals(driver.getTitle(),"Palindrome Check");
        driver.close();
        driver.quit();
    }
        @Test()
    public void PalindromeWebPageTestKayak() {
        this.setup();

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
        @Test()
    public void TestSpoonerismLink() {
            this.setup();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        WebElement link = driver.findElement(By.linkText("convert to spoonerism?"));
        link.click();
        assertEquals(driver.getTitle(), "Spoonerism Converter");
        driver.close();
        driver.quit();
    }
}
