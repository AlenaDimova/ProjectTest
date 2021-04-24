package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class FacebookTest extends BaseTest {
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: Facebook page")
    @Step("Verify page: Facebook page")
    @Test
    public static void FacebookEntering() {
        SignInPage.byFacebook();
    }
}