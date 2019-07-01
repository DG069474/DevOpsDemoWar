package pal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private static WebDriver driver;

    @BeforeClass
    public static void openBrowser(){

        if(System.getProperty("webdriver.chrome.driver") != null)
            driver = new ChromeDriver();
        else
            throw new RuntimeException("Unknown web driver specified.");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void closeBrowser(){
        driver.quit();
    }

    @Test()
    public void browserInitTest() {
        driver.get("http://www.google.com/");

        Assert.assertEquals(driver.getTitle(),"Google");
    }
}
