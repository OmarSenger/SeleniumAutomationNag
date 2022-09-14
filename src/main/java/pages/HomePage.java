package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    // Constructor
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver ;
    }

    // Locators
    private By searchButton = By.className("search");
    private By searchField = By.id("txt_search_query");
    private By submitButton = By.id("btn_global_search");

    // Actions
    public LessonsResultPage searchingForLesson(String lessonName){
        driver.findElement(searchButton).click();
        driver.findElement(searchField).sendKeys(lessonName);
        driver.findElement(submitButton).click();
        return new LessonsResultPage(driver);
    }
}
