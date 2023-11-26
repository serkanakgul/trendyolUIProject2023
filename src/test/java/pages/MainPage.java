package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class MainPage extends BasePage {
    private static By MODALCLOSEBUTTON=By.id("Rating-Review");
    private static By SEARCHINPUT=By.xpath("//input[@class='V8wbcUhU']");
    private static By SEARCHBUTTON=By.xpath("//i[@class='cyrzo7gC']");

    public void closeModal(){
        waitUntilVisible(MODALCLOSEBUTTON);
        clickElement(MODALCLOSEBUTTON);
    }

    public void typeToSearchBox(String text){
        waitUntilVisible(SEARCHINPUT);
        sendKeys(SEARCHINPUT,text);
    }

    public void clickSearchButton(){
        clickElement(SEARCHBUTTON);
    }



}
