package uiProject.Services;

import uiProject.Driver.Driver;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot {
    @Attachment(value = "Page screenshot", type = "image/png")
    public static byte[] saveScreenShot(){
        return ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

}
