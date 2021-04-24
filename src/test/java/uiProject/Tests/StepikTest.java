package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class StepikTest extends BaseTest{
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify Logo presence on Home Page")
    @Step("Verify Logo presence ")
    @Test
    public void SuccessfulEnter(){
        SignInPage.signInSite("jeep0600@gmail.com","i2277768");
        SignInPage.atPage();
    }
}
