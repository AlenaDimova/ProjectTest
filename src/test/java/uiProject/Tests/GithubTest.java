package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class GithubTest extends BaseTest{
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: Github page")
    @Step("Verify page: Github page")
    @Test
    public static void githubEntering() {
        SignInPage.byGithub();
    }
}
