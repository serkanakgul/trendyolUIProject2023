package driverFactory;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> webdriver = new ThreadLocal<>();
    private static DriverManager instance = null;

    private DriverManager() {

    }

    public static DriverManager getInstance() {
        if (instance == null) {
            return new DriverManager();
        }
        return instance;

    }


    public WebDriver getDriver() {
        return webdriver.get();
    }

    public void setDriver(WebDriver driver) {
        webdriver.set(driver);
    }
}
