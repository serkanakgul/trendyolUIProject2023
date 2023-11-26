package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class SearchResultPage extends BasePage {
    private static By SEARCHRESULTTEXT=By.xpath("//div[@class='dscrptn dscrptn-V2']");

    public boolean checkIfSearchResulTrue(String text){
        waitUntilVisible(SEARCHRESULTTEXT);
        return checkIfContainsTexts(SEARCHRESULTTEXT,text);
    }
}
