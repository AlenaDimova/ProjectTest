package uiProject.Pages;

import io.qameta.allure.Step;
import org.testng.Assert;
import static uiProject.Locators.Locators.*;

public class CatalogPage extends BasePages {

    public static void getMyCourses() {
        initElement(MY_COURSE).click();
    }

    public static void atCourses(){
        boolean dispStatus=initElement(COURSE1).isDisplayed();
        Assert.assertEquals(dispStatus, true);
    }
    @Step("Page of courses")
    public static void enterMyCourses(){
        getMyCourses();
        atCourses();
    }

    public static void clickRating() {
        initElement(RATING).click();
    }
    public static void ratingOfUsers() {
        Assert.assertEquals(initElement(KHOWLEDGE_RATING).getText(),"Рейтинг пользователей");
    }
    @Step("Check Rating" )
    public static void checkRating() {
        getMyCourses();
        clickRating();
        ratingOfUsers();
    }
}
