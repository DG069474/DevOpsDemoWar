package pal;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private static WebDriver driver;

    @Test()
    public void browserInitTest() {
        
            driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localhost:8083/DevOpsDemo/");

        Assert.assertEquals(driver.getTitle(),"Palindrome Check");
        driver.quit();
    }
}
