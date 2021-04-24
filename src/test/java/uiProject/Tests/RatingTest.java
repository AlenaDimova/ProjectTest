package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class RatingTest extends BaseTest {
    @Severity(SeverityLevel.MINOR)
    @Description("Verify Rating Form")
    @Step("Verify Rating Form")
    @Test
    public static void usersRating() {
        SignInPage.signInSite("Jeep0600@gmail.com", "i2277768");
        CatalogPage.getMyCourses();
        CatalogPage.checkRating();
    }
}
