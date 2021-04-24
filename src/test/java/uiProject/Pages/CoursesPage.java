package uiProject.Pages;

import io.qameta.allure.Step;
import org.testng.Assert;
import static uiProject.Locators.Locators.*;

public class CoursesPage extends BasePages {

    @Step("Entering the first course")
    public static void enterCourse1(){
        CatalogPage.getMyCourses();
        course1();
        atLesson();
    }

    public static void course1() {
        initElement(COURSE1).click();
    }

    public static void atLesson() {
        //Assert.assertEquals(initElement(WHAT_IS).getText(), "1.1 Что такое Java, откуда она взялась и зачем нужна");
        boolean dispStatus=initElement(WHAT_IS).isDisplayed();
        Assert.assertTrue(dispStatus);
    }

    public static void course2 (){
        initElement(COURSE2).click();
    }

    public static void atCourse2(){
        Assert.assertEquals(initElement(LEGASOFT_JAVA).getText(),"Legasoft Java");
    }

    @Step("Entering the second course")
    public static void enterCourse2(){
        CatalogPage.getMyCourses();
        course2();
        atCourse2();
    }

    public static void course3(){
        initElement(COURSE3).click();
    }

    public static void atCourse3(){
        Assert.assertEquals(initElement(POLSKY).getText(),"Польский язык. Основы (А1). Быстрое обучение чтению");
    }

    @Step("Entering the third course")
    public static void enterCourse3(){
        CatalogPage.getMyCourses();
        course3();
        atCourse3();
    }

}


