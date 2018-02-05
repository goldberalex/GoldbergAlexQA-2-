package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CreatContactTest extends TestBase {

    @Test
    public void CreatContactTest() {
        app.goTo().goAddressbook();
        List<ContactData> before = app.contacts().getContactList();
        //int before = app.getContactHelper().getContactCout();//посчитали группы до добавления
        app.contacts().initContactCreation();
        app.contacts().fillContactForm(new ContactData()
                .wihtFirstname("Alex2")
                .wihtLastname("Gold2")
                .wihtNickname("GoldbergAlex2")
                .wihtCompany("F2")
                .wihtHome("BR2")
                .wihtAddress("BR2")
                .wihBirthday("1"));//выпадающие списки
        app.contacts().submitContactCreation();
        List<ContactData> after=app.contacts().getContactList();
        //int after = app.getContactHelper().getContactCout();
        //Assert.assertEquals(after, before+1);
        Assert.assertEquals(after.size(), before.size()+1);

    }
}
