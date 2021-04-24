package uiProject.Listener;

import Services.ScreenShot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITListener implements ITestListener{
    private final static Logger LOG = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult result) {
        LOG.info(result.getName()+" test case started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ScreenShot.saveScreenShot();
        LOG.info(result.getName()+" test case passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShot.saveScreenShot();
        LOG.info(result.getName()+" test case failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        LOG.info(result.getName()+" test case skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
