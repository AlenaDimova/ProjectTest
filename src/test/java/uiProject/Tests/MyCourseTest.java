package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;


public class MyCourseTest extends BaseTest{
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: All courses")
    @Step("Verify page: All courses")
    @Test
    public void enterMyCourse(){
        SignInPage.signInSite("jeep0600@gmail.com","i2277768");
        CatalogPage.enterMyCourses();
        }
}
