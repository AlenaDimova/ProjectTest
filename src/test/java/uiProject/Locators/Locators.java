package uiProject.Locators;

import uiProject.Pages.BasePages;
import org.openqa.selenium.By;

public class Locators {

    public  final static By SIGN_IN =  By.cssSelector("[href='/catalog?auth=login']");
    public  final static By ENTER_EMAIL = By.cssSelector("[name='login']");
    public  final static By ENTER_PASSWORD = By.cssSelector("[name='password']");
    public  final static By ENTER_BUTTON = By.xpath("//*[@id=\"login_form\"]/button");
    public final static By LOGIN_IMG = By.cssSelector(".navbar__profile-img");

    public final static By FORGOT = By.cssSelector(".sign-form__sub");
    public final static By REMEMBER = By.id("reset_form");

    public final static By VK_SIGN_IN = By.cssSelector(".btn-vk > img:nth-child(1)");
    public final static By FACEBOOK_SIGN_IN = By.cssSelector(".btn-facebook > img:nth-child(1)");
    public final static By GOOGLE_SIGN_IN = By.cssSelector(".btn-google > img:nth-child(1)");
    public final static By GITHUB_SIGN_IN = By.cssSelector(".btn-github > img:nth-child(1)");
    public final static By VK_LOGO = By.cssSelector(".oauth_logo");//.oauth_logo
    public final static By FACEBOOK_LOGO = By.cssSelector(".fb_logo");
    public final static By GOOGLE_LOGO = By.cssSelector(".L5wZDc");
    public final static By GITHUB_LOGO = By.cssSelector("div.CircleBadge--medium:nth-child(3) > svg:nth-child(1)");

    public final static By MY_COURSE = By.cssSelector("[href='/users/335568284/learn?auth=login']");
    public final static By MY_COURSES = By.xpath("/html/body/div[1]/div[2]/main/div/div[2]/div/div[1]/ul/li[3]");

    public final static By COURSE1 = By.cssSelector("[href='/course/187?auth=login']");
    public final static By JAVA = By.cssSelector(".course-nav__title");
    public final static By COURSE2 = By.cssSelector("[href='/course/58514?auth=login']");
    public final static By LEGASOFT_JAVA = By.cssSelector(".course-nav__title");

    public final static By WHAT_IS = By.cssSelector(".lesson-widget__title-text");
    public final static By TITLE = By.cssSelector(".top-tools__lesson-name");

    public final static By COURSE3 = By.cssSelector("[href='/course/24913?auth=login']");
    public final static By POLSKY = By.cssSelector(".course-nav__title");

    public final static By RATING = By.cssSelector("[href='/leaders/knowledge?auth=login']");
    public final static By KHOWLEDGE_RATING = By.cssSelector(".anypage-title");

    public final static By TEACHING_BUTTON = By.cssSelector("li.navbar__menu-item:nth-child(3) > a:nth-child(1)");
    public final static By CREATE_COURSE = By.cssSelector(".tn-elem__2401433761602934914149");










}
