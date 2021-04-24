package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class PolskyTest extends BaseTest{
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: Польский язык")
    @Step("Verify page: Польский язык")
    @Test
    public static void PolskyCourse(){
        SignInPage.signInSite("Jeep0600@gmail.com", "i2277768");
        CoursesPage.enterCourse3();
    }
}