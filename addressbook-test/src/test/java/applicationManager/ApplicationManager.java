package applicationManager;

import model.ContactData;
import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
     FirefoxDriver wd;

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
        login("admin", "secret");
    }
    public int getGroupCout() {
        return wd.findElements(By.name("selected[]")).size();
    }
    public int getGroupCoutDeletion() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void openaddress() {
        wd.get("http://localhost/addressbook/");
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);//для того что бы создать type метод нужно выфделить метод и нажать ctrl+alt+M и назвать его
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }

    public void type(By locator, String text) {
        click(locator);//ctrl+alt+P и везде в скобках прописать locator
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void goToGroupsPage() {
        click(By.xpath("//*[@href='group.php']"));//кнопка groups
    }

    public void click(By locator) {//чтобы создать этот метод нужно выделить любую строчку с click на конце и нажать Refactor->Extract->Parameter Object
        wd.findElement(locator).click();
    }

    public void fillGreoupForm(GroupData groupData) {
        type(By.name("group_name"),groupData.getName());
        type(By.name("group_header"),groupData.getHeader());
        type(By.name("group_footer"),groupData.getFooter());
    }


    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void returnToGropsPage() {
        click(By.xpath("//*[@href='group.php']"));
    }

    public void clickButtonDeleteGroup() {//удаление группы
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initContactCreation() {
        click(By.xpath("//*[@href='edit.php']"));
    }


    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void stop() {
        wd.quit();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getAlex());
        type(By.name("lastname"),contactData.getGoldber());
        type(By.name("nickname"),contactData.getGoldberalex());
        type(By.name("company"),contactData.getF());
        type(By.name("address"),contactData.getBearSheva());
        type(By.name("home"),contactData.getBearSheba());
    }

    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }

    public void clickButtonDelete() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
    public int getContactCout() {
        return wd.findElements(By.xpath("//*[@title='Details']")).size();
    }
    public int getContactCoutDeletion() {
        return wd.findElements(By.xpath("//*[@title='Details']")).size();
    }
}
