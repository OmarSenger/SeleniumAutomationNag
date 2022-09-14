package TestCase;

import base.BaseTest;
import data.ExcelReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LessonPage;
import pages.LessonsResultPage;
import pages.WorkSheetPage;

import java.io.IOException;


public class TestCase extends BaseTest {

    @DataProvider(name="ExcelData")
    public Object[][] data() throws IOException
    {
        // get data from Excel Reader class
        ExcelReader ER = new ExcelReader();
        return ER.getExcelData();
    }

    @Test(dataProvider = "ExcelData")
    public void testRunner(String lessonName , String lessonListNo){
            LessonsResultPage lessonsResultPage = homePage.searchingForLesson(lessonName);
            LessonPage lessonPage = lessonsResultPage.chooseLesson(lessonListNo);
           WorkSheetPage workSheetPage = lessonPage.workSheetPageAccess();
            workSheetPage.questionsNumber();
    }
}
