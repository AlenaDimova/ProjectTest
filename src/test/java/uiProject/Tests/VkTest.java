package uiProject.Tests;

import uiProject.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class VkTest extends BaseTest{
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify page: Vk")
    @Step("Verify page: Vk")
    @Test
    public static void vkEntering() {
        SignInPage.byVk();
    }
}
