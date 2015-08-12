package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.GoogleSeachPage;
import setup.Setup;

import static org.junit.Assert.assertTrue;

/**
 * Created by ad on 22.06.2015.
 */
public class SearchInGoogleTest {

    public static final String iPhone = "iPhone";
    public static final String VALUE = "value";
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = Setup.getDriver();
    }

    @Test
    public void searchInGoogle() {

        GoogleSeachPage page = PageFactory.initElements(driver, GoogleSeachPage.class);
        page.search(iPhone);

    }
    private void assertSmth(GoogleSeachPage page) {
        assertTrue(driver.getTitle().contains("Интернет-магазин бытовой техники 5ok"));

    }
    @After
    public void tearDown() {
        driver.close();
    }
}
