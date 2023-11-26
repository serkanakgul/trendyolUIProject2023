package base;

import driverFactory.DriverManager;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriverWait wait;

    public void clickElement(By by) {
        DriverManager.getInstance().getDriver().findElement(by).click();
    }

    public void sendKeys(By by, String keys) {
        DriverManager.getInstance().getDriver().findElement(by).sendKeys(keys);
    }

    public void waitBySecond(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public void scrollDownToElement(By selector) {
        WebElement element = DriverManager.getInstance().getDriver().findElement(selector);
        ((JavascriptExecutor) DriverManager.getInstance().getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDownToElement(WebElement element) {
        ((JavascriptExecutor) DriverManager.getInstance().getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDown() throws InterruptedException {
        Actions actions = new Actions(DriverManager.getInstance().getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        waitBySecond(5);
        actions.sendKeys(Keys.PAGE_UP).build().perform();
        waitBySecond(5);
    }

    public void waitUntilVisible(By by) {
        wait=new WebDriverWait(DriverManager.getInstance().getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public boolean checkIfContainsTexts(By by,String text){
        Boolean elementText=DriverManager.getInstance().getDriver().findElement(by).getText().contains(text);
        return elementText;
    }
}
