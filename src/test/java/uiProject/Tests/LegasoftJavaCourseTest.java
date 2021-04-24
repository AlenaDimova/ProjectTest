package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;


public class LegasoftJavaCourseTest extends BaseTest{
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: Legasoft Java")
    @Step("Verify page: Legasoft Java")
    @Test
    public static void legasoftJavaCourse(){
        SignInPage.signInSite("Jeep0600@gmail.com", "i2277768");
        CoursesPage.enterCourse2();
    }
}