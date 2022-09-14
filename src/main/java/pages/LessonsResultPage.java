package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonsResultPage {

    // Constructor
    private WebDriver driver;
    public LessonsResultPage(WebDriver driver){
        this.driver = driver ;
    }
    //Actions
    public LessonPage chooseLesson(String lessonNumber){
        driver.findElement(By.xpath("/html/body/div/div[1]/div/div/main/div[3]/ul/li["+lessonNumber+"]/div/a")).click();
        return new LessonPage(driver);
    }
}
