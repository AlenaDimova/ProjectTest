package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class TeachingTest extends BaseTest {
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify Teaching Page")
    @Step("Verify Teaching Page")
    @Test
    public static void creatingOwnCourse(){
        SignInPage.signInSite("jeep0600@gmail.com","i2277768");
        BasePages.switchTo();
    }
}
