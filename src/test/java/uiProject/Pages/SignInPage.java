package uiProject.Pages;

import io.qameta.allure.Step;
import org.testng.Assert;
import static uiProject.Locators.Locators.*;

public class SignInPage extends BasePages {
    public static void signIn(){
        initElement(SIGN_IN).click();
    }

    public static void getEmail(String email) {
        initElement(ENTER_EMAIL).sendKeys(email);
    }

    public static void getPassword(String pass) {
        initElement(ENTER_PASSWORD).sendKeys(pass);
    }

    public static void getSgnIn() {
        initElement(ENTER_BUTTON).click();
    }

    public static void atPage(){
        Assert.assertTrue(initElement(LOGIN_IMG).isDisplayed());
    }

    @Step("Sign in site")
    public static void signInSite(String email,String pass){
        signIn();
        getEmail(email);
        getPassword(pass);
        getSgnIn();
    }

    public static void vkClick() {
        initElement(VK_SIGN_IN).click();
    }

    public static void vkVerify() {
        boolean dispStatus=initElement(VK_LOGO).isDisplayed();
        Assert.assertTrue(dispStatus);
    }
    @Step("Sign in site by VK")
    public static void byVk() {
        signIn();
        vkClick();
        vkVerify();
    }

    public static void facebookClick() {
        initElement(FACEBOOK_SIGN_IN).click();
    }

    public static void facebookVerify() {
        boolean dispStatus=initElement(FACEBOOK_LOGO).isDisplayed();
        Assert.assertTrue(dispStatus);
    }
    @Step("Sign in site by Facebook")
    public static void byFacebook() {
        signIn();
        facebookClick();
        facebookVerify();
    }

    public static void googleClick() {
        initElement(GOOGLE_SIGN_IN).click();
    }

    public static void googleVerify() {
        boolean dispStatus=initElement(GOOGLE_LOGO).isDisplayed();
        Assert.assertTrue(dispStatus);
    }
    @Step("Sign in site by Google")
    public static void byGoogle() {
        signIn();
        googleClick();
        googleVerify();
    }

    public static void githubClick() {
        initElement(GITHUB_SIGN_IN).click();
    }

    public static void githubVerify() {
        boolean dispStatus=initElement(GITHUB_LOGO).isDisplayed();
        Assert.assertTrue(dispStatus);
    }
    @Step("Sign in site by Github")
    public static void byGithub() {
        signIn();
        githubClick();
        githubVerify();
    }

    public static void forgotPass() {
        initElement(FORGOT).click();
    }

    public static void rememberPass() {
        boolean dispStatus=initElement(REMEMBER).isDisplayed();
        Assert.assertTrue(dispStatus);
    }

    @Step("Remember password")
    public static void rememberPassword() {
        signIn();
        forgotPass();
        rememberPass();
    }
}