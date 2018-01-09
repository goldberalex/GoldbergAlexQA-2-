import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openaddress();
        openloginpage();
        login("goldbergalex1981@gmail.com", "171981zx");
        goToProject();
    }

    public void returnToProject() {
        wd.findElement(By.cssSelector("span.header-logo-default")).click();
        wd.findElement(By.xpath("//ul[@class='boards-page-board-section-list']//span[.='Проект 1']")).click();
    }

    public void creatСardNew(String text) {
        wd.findElement(By.xpath("//div[@id='board']/div[3]/div/div[1]/div[2]/a/span")).click();
        wd.findElement(By.cssSelector("a.js-add-card")).click();
        wd.findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();
        wd.findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys(text);
        wd.findElement(By.xpath("//div[@class='card-composer']/div[2]/div[1]/input")).click();
    }

    public void goToProject() {
        wd.findElement(By.xpath("//ul[@class='boards-page-board-section-list']//span[.='Проект 1']")).click();
    }

    public void login(String UserName, String password) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(UserName);
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(password);
        wd.findElement(By.id("login")).click();
    }

    public void openloginpage() {
        wd.findElement(By.linkText("Log In")).click();
    }

    public void openaddress() {
        wd.get("https://trello.com/");
    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }
}
