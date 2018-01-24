package applicationManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {//1.Наследует GroupHelper (сначала создали помошника GroupHelper, потом делегировавали и теперь ApplicationManager уже на родитель он наследник)
    WebDriver wd;//5.Копируем ссылку (FirefoxDriver wd;)
    // из GroupHelper и вставляем ее на место где она была в public class ApplicationManager {}
//groupHelper объявляем здесь
    public GroupHelper groupHelper;//8. а public GroupHelper groupHelper; мы переписываем в ручную, на то что сейчас
    public NavigationHeleper navigationHeleper;//11.обявляем, даем сылку на него
    public ContactHelper contactHelper;
    public SessinHelper sessinHelper;
    private String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    //2.Второй шаг все методы отвечающие групы поднимаем в GroupHelper, кроме goToGroupsPage(), ее мы отправим в NavigationHeleper
//3. Меняем наследование на делегирование: это мы делаем Refactor+Extract+Replace Inheritance with Delegation
// и здесь нужно !обязательно поставить галочку Generate getter
    public void start() {
        //String browser = BrowserType.FIREFOX; мы его вызывали что бы построить всю систему, теперь вместо его работает конструктор public ApplicationManager(String browser) {this.browser = browser;}
        if(browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else
            if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
            }else
                if (browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }

        //6.перед всеми (wd)появится переуменная groupHelper !Эта переменная не нужна, ее нужно удалить везде где она появилась перед wb

        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        sessinHelper = new SessinHelper(wd);
        sessinHelper.openaddress("http://localhost/addressbook/");

        //а здесь мы groupHelper иницилизируем
        groupHelper = new GroupHelper(wd);//7.эту строчку мы создаем путем копирования из public GroupHelper groupHelper;
      //8. когда (wd) подчеурнется красным кликаем на него правой кнопкой мыши и предложено будет создать конструктор
        // нажимает энтер и конструктор появится в GroupHelper
        navigationHeleper = new NavigationHeleper(wd);//12. Инициализируем NavigationHeleper прописываем в ручную
        contactHelper = new ContactHelper(wd);
        sessinHelper.login("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    //13. формируем конструктор Generate->Getter->navigationHeleper:NavigationHeleper
    public GroupHelper groups() {
        return groupHelper;
    }

    public NavigationHeleper goTo() {
        return navigationHeleper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public SessinHelper getSessinHelper() {
        return sessinHelper;
    }
}

