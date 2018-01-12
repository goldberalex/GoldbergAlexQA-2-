package tests;

import applicationManager.ApplicationManager;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class TestBase {// это мы делаем Refactor+Extract+Replace Inheritance with Delegation

    protected ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws Exception {
        app.start();
    }

    public void iniGroupCreation() {
        app.getGroupHelper().click(By.name("new"));
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
