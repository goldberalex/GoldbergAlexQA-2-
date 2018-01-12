package applicationManager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public GroupHelper groupHelper;
    public NavigationHeleper navigationHeleper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openaddress();
        groupHelper = new GroupHelper(wd);
        navigationHeleper = new NavigationHeleper(wd);
        login("admin", "secret");
    }

    public void openaddress() {
        wd.get("http://localhost/addressbook/");
    }

    public void login(String userName, String password) {
        groupHelper.type(By.name("user"), userName);//для того что бы создать type метод нужно выфделить метод и нажать ctrl+alt+M и назвать его
        groupHelper.type(By.name("pass"), password);
        groupHelper.click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

    public void initContactCreation() {
        groupHelper.click(By.xpath("//*[@href='edit.php']"));
    }


    public void submitContactCreation() {
        groupHelper.submitGroupCreation();
    }

    public void stop() {
        wd.quit();
    }

    public void fillContactForm(ContactData contactData) {
        groupHelper.type(By.name("firstname"),contactData.getAlex());
        groupHelper.type(By.name("lastname"),contactData.getGoldber());
        groupHelper.type(By.name("nickname"),contactData.getGoldberalex());
        groupHelper.type(By.name("company"),contactData.getF());
        groupHelper.type(By.name("address"),contactData.getBearSheva());
        groupHelper.type(By.name("home"),contactData.getBearSheba());
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }

    public void clickButtonDelete() {
        groupHelper.click(By.xpath("//*[@value='Delete']"));
    }

    public void selectContact() {
        groupHelper.selectGroup();
    }
    public int getContactCout() {
        return wd.findElements(By.xpath("//*[@title='Details']")).size();
    }

    public int getContactCoutDeletion() {
        return wd.findElements(By.xpath("//*[@title='Details']")).size();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHeleper getNavigationHeleper() {
        return navigationHeleper;
    }
}
