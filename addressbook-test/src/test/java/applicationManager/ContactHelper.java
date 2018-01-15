package applicationManager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBese {
    public ContactHelper(WebDriver wd) {
        super(wd);//мы даем ссылку из класса public class ContactHelper extends HelperBese в ручную
    }
    public int getContactCout() {
        return wd.findElements(By.xpath("//*[@title='Details']")).size();
    }

    public void initContactCreation() {
        click(By.xpath("//*[@href='edit.php']"));
    }
    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getAlex());
        type(By.name("lastname"),contactData.getGoldber());
        type(By.name("nickname"),contactData.getGoldberalex());
        type(By.name("company"),contactData.getF());
        type(By.name("address"),contactData.getBearSheva());
        type(By.name("home"),contactData.getBearSheba());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void selectContact() {
        click(By.name("selected[]"));
    }
    public void clickButtonDeleteContact() {
        click(By.xpath("//*[@value='Delete']"));
    }
    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }
}
