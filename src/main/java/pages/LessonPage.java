package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonPage {

    private WebDriver driver;

    public LessonPage(WebDriver driver) {

        this.driver = driver;
    }

    // Locators
    private By workSheetSection = By.className("question-preview");


    //Actions
        public WorkSheetPage workSheetPageAccess(){
            driver.findElement(workSheetSection).click();
            return new WorkSheetPage(driver);
        }
}
