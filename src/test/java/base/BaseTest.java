package base;

import driverFactory.DriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest extends BasePage{

    public WebDriver driver;


    @Before
    public void setUpDriver() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().getPageLoadTimeout();
        DriverManager.getInstance().setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
