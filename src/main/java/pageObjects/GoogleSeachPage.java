package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import setup.Setup;

/**
 * Created by ad on 22.06.2015.
 */
public class GoogleSeachPage {

    public static final String shop = "http://www.5ok.com.ua/";
    private WebDriver driver;

    @FindBy(id="txtSearch")
    WebElement searchField;

    @FindBy(xpath="html/body/div[3]/div[4]/noindex/div/form/input[3]")
    WebElement searchButton;


    public void search(String s) {
        driver = Setup.getDriver();
        driver.get(shop);

        searchField.sendKeys(s);
        searchButton.submit();
    }

    public WebElement getSearchField() {
        return searchField;
    }
}
