package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
    WebDriver driver;
    private WebElement element = null;

    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement buttonConsent(){
        element = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        return element;
    }

    public WebElement textboxSearch(){
        element = driver.findElement(By.name("q") );
        return element;
    }

    public WebElement buttonSearch(){
        element = driver.findElement(By.xpath("//div[4]//input[@aria-label=\"Szukaj w Google\"]"));
        return element;
    }

    public String getSearchText(){
        return "page object model automation framework";
    }

}
