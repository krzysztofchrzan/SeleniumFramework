package test;

import objects.SearchPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class SearchTest {
    WebDriver driver;
    SearchPage searchPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver106.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        searchPage = new SearchPage(driver);
    }

    @Test()
    public void execution(){
        driver.get("http://www.google.com");

        searchPage.buttonConsent().click();
        searchPage.textboxSearch().sendKeys(searchPage.getSearchText());
        searchPage.buttonSearch().click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
