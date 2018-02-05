package applicationManager;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBese {

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element : elements){
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("value"));
            String lastname = element.findElement(By.xpath(".//td[2]")).getText();
            String firstName = element.findElement(By.xpath(".//td[3]")).getText();

            contacts.add(new ContactData().wihtId(id).wihtFirstname(firstName).wihtLastname(lastname));
        }
        return contacts;
    }

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
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("nickname"),contactData.getNickname());
        type(By.name("company"),contactData.getCompany());
        type(By.name("address"),contactData.getAddress());
        type(By.name("home"),contactData.getHome());
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirthday());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void selectContact() {
        //click(By.name("selected[]"));
        click(By.xpath("//*[@title='Edit']"));
    }

    public void selecContactByIndex(int index) {
        wd.findElements(By.xpath("//*[@title='Edit']")).get(index).click();
    }

    public void clickButtonDeleteContact() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public void confirmContactModification() {
        click(By.name("update"));
    }
    //public void confirmAlert() {//Alert нужен если в selectContact() будет click(By.name("selected[]"));
    //wd.switchTo().alert().accept();
    // }

    public boolean isThereAContact() {
        return isElementPresent(By.xpath("//*[@title='Edit']"));

    }

    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
    }
}
