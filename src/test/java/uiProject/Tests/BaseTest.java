package uiProject.Tests;

import uiProject.Listener.ITListener;
import uiProject.Pages.BasePages;
import org.testng.annotations.*;

@Listeners (ITListener.class)
public class BaseTest {
    @BeforeTest
    public static void initialisation(){
        BasePages.get();
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        BasePages.closeDriver();
    }
}
