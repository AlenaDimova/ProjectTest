package uiProject.Driver;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Driver {

    private final static Logger LOG = LogManager.getRootLogger();
    private static WebDriver driver = getDriver();

    public static WebDriver getDriver() {
        return (driver == null) ? driver = init() : driver;
    }

    private static WebDriver init() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        LOG.info("Driver initialization");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}