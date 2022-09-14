package base;
import data.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import pages.*;

import java.io.IOException;

public class BaseTest {
    private WebDriver driver ;
    protected HomePage homePage ;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.nagwa.com/ar/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("العربية")).click();
        driver.findElement(By.xpath("//a[@href='https://www.nagwa.com/en/']")).click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
