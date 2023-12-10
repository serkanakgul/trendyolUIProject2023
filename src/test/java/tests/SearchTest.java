package tests;

import base.BasePage;
import base.BaseTest;
import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.junit.Test;
import pages.MainPage;
import pages.SearchResultPage;

public class SearchTest extends BaseTest {
    MainPage mainPage = new MainPage();
    SearchResultPage searchResultPage =new SearchResultPage();

    @Test
    public void searchInputControl() throws InterruptedException {
        mainPage.closeModal();
        mainPage.typeToSearchBox("ayakkabı");
        mainPage.clickSearchButton();
        Assert.assertTrue("Expected text is not contained",searchResultPage.checkIfSearchResulTrue("ayakkabı"));

    }
}
