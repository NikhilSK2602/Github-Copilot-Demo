package tests;

import base.BaseTest;
import pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {
    //test method to search for multiple products and take screenshots

    @Test
    public void testSearchMultipleProducts() {
        HomePage home = new HomePage(driver);
        // Search for iPhone
        home.searchProduct("iPhone 15");
        Assert.assertTrue(home.verifyResultsDisplayed(), "Search results for iPhone not displayed!");
        home.takeScreenshot("iphone15-results.png");
        // Search for TV
        home.searchProduct("Samsung TV");
        Assert.assertTrue(home.verifyResultsDisplayed(), "Search results for TV not displayed!");
        home.takeScreenshot("samsungtv-results.png");
    }
}
