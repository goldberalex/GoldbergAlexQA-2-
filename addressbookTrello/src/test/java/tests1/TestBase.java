package tests1;

import model1.CardData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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
        click(By.cssSelector("span.header-logo-default"));
        click(By.xpath("//ul[@class='boards-page-board-section-list']//span[.='Проект 1']"));
    }

    public void creatСardNew(CardData cardData) {
        click(By.xpath("//div[@id='board']/div[3]/div/div[1]/div[2]/a/span"));
        click(By.cssSelector("a.js-add-card"));
        wd.findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).clear();//,это переменная text "Тема"
        wd.findElement(By.cssSelector("textarea.list-card-composer-textarea.js-card-title")).sendKeys(cardData.getText());
        click(By.xpath("//div[@class='card-composer']/div[2]/div[1]/input"));
    }

    public void goToProject() {
        click(By.xpath("//ul[@class='boards-page-board-section-list']//span[.='Проект 1']"));
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void login(String UserName, String password) {
        type(By.id("user"), UserName);
        type(By.id("password"), password);
        click(By.id("login"));
    }

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void openloginpage() {
        click(By.linkText("Log In"));
    }

    public void openaddress() {
        wd.get("https://trello.com/");
    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }
}
