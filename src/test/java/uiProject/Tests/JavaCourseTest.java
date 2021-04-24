package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.*;
import org.testng.annotations.Test;


public class JavaCourseTest extends BaseTest{
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: Java. Базовый курс")
    @Step("Verify page: Java. Базовый курс")
    @Test
    public static void javaCourse(){
        SignInPage.signInSite("Jeep0600@gmail.com","i2277768");
        CoursesPage.enterCourse1();
    }
}
