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
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getTitle(),"Palindrome Check");
        driver.close();
        
    }
        @Test()
    public void PalindromeWebPageTestKayak() {
        this.setup();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement text = driver.findElement(By.name("word"));
        text.sendKeys("Kayak");
        WebElement submit = driver.findElement(By.name("submit"));
        submit.click();
        String bodyText = driver.findElement(By.tagName("body")).getText();
        assertTrue(bodyText.contains("Kayak is a Palindrome!"));
        driver.close();
        
    }
        @Test()
    public void TestSpoonerismLink() {
            this.setup();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement link = driver.findElement(By.linkText("convert to spoonerism?"));
        link.click();
        assertEquals(driver.getTitle(), "Spoonerism Converter");
        driver.close();
        
    }
            @Test()
    public void TestSpoonerismLinkExtended() {
            this.setup();

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
        
    }
}
        @AfterClass 
    public static void exit() {
          driver.quit();
    }
}
