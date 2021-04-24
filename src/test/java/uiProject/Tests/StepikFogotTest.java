package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class StepikFogotTest extends BaseTest {
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify Reset Form")
    @Step("Verify Reset Form")
    @Test
    public static void rememberOfPass() {
        SignInPage.rememberPassword();
    }

}
