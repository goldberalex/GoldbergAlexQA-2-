package applicationManager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {//1.Наследует GroupHelper (сначала создали помошника GroupHelper, потом делегировавали и теперь ApplicationManager уже на родитель он наследник)
    FirefoxDriver wd;//5.Копируем ссылку (FirefoxDriver wd;)
    // из GroupHelper и вставляем ее на место где она была в public class ApplicationManager {}
//groupHelper объявляем здесь
    public GroupHelper groupHelper;//8. а public GroupHelper groupHelper; мы переписываем в ручную, на то что сейчас
    public NavigationHeleper navigationHeleper;//11.обявляем, даем сылку на него
    public ContactHelper contactHelper;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
//2.Второй шаг все методы отвечающие групы поднимаем в GroupHelper, кроме goToGroupsPage(), ее мы отправим в NavigationHeleper
//3. Меняем наследование на делегирование: это мы делаем Refactor+Extract+Replace Inheritance with Delegation
// и здесь нужно !обязательно поставить галочку Generate getter
    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        //6.перед всеми (wd)появится переуменная groupHelper !Эта переменная не нужна, ее нужно удалить везде где она появилась перед wb
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        openaddress();
        //а здесь мы groupHelper иницилизируем
        groupHelper = new GroupHelper(wd);//7.эту строчку мы создаем путем копирования из public GroupHelper groupHelper;
      //8. когда (wd) подчеурнется красным кликаем на него правой кнопкой мыши и предложено будет создать конструктор
        // нажимает энтер и конструктор появится в GroupHelper
        navigationHeleper = new NavigationHeleper(wd);//12. Инициализируем NavigationHeleper прописываем в ручную
        contactHelper = new ContactHelper(wd);
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

    public void stop() {
        wd.quit();
    }

    //13. формируем конструктор Generate->Getter->navigationHeleper:NavigationHeleper
    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHeleper getNavigationHeleper() {
        return navigationHeleper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
