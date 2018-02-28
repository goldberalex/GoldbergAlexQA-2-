package tests;

import applicationManager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public abstract class TestBase {// это мы делаем Refactor+Extract+Replace Inheritance with Delegation

    protected static ApplicationManager app = new ApplicationManager(BrowserType.CHROME);

    Logger logger = LoggerFactory.getLogger(TestBase.class);
    @BeforeSuite
    public void setUp() throws Exception {
        app.start();
    }
    @BeforeMethod
    public void logTestStart(Method m, Object[]p){
        logger.info("Start test " + m.getName());
    }
    @AfterMethod(alwaysRun = true)
    public void logTestStart(Method m){
        logger.info("Stop test " + m.getName());

    }
    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}
