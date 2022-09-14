package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class WorkSheetPage {

    // Constructor
    private WebDriver driver;
    public WorkSheetPage(WebDriver driver){
        this.driver = driver ;
    }

    // Locators
        private By numberOfQuestions = By.tagName("b");
    //Actions
        public void questionsNumber(){
            List<WebElement> questions = driver.findElements(numberOfQuestions);
            System.out.println("Number of questions in the chosen lesson : "+questions.size());
        }
}
