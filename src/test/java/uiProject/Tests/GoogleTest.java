package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: Google page")
    @Step("Verify page: Google page")
    @Test
    public static void googleEntering() {
        SignInPage.byGoogle();
    }

}
