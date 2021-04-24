package uiProject.Pages;

import uiProject.Driver.Driver;
import io.qameta.allure.Step;
import org.openqa.selenium.*;
import org.testng.Assert;
import java.util.Iterator;
import java.util.Set;
import static uiProject.Locators.Locators.*;

public class BasePages {

    private static WebDriver getDriver() {
        return Driver.getDriver();
    }

    protected static WebElement initElement(By by){
        return getDriver().findElement(by);
    }

    @Step("Entering the site" )
    public static void get(){
        getDriver().get("https://stepik.org/catalog");

    }
    @Step("Closing driver")
    public static void closeDriver(){
        getDriver().quit();
    }


    @Step("Check the child window")
    public static void switchTo() {
        getDriver().findElement(By.cssSelector("li.navbar__menu-item:nth-child(3) > a:nth-child(1)")).click();

        String MainWindow = getDriver().getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = getDriver().getWindowHandles();
        Iterator<String> i1 =  s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow = i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {

                // Switching to Child window
                getDriver().switchTo().window(ChildWindow);
                boolean dispStatus = initElement(CREATE_COURSE).isDisplayed();
                Assert.assertTrue(dispStatus);

                // Closing the Child Window.
                getDriver().close();
            }
        }
        // Switching to Parent window i.e Main Window.
        getDriver().switchTo().window(MainWindow);
    }
}



