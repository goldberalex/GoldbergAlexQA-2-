package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModify(){
        List<ContactData> before = app.contacts().getContactList();
        if (!app.contacts().isThereAContact()){
            app.contacts().createContact(new ContactData().wihtFirstname("Alex2")
                    .wihtLastname("Gold2")
                    .wihtNickname("GoldbergAlex2")
                    .wihtCompany("F2")
                    .wihtHome("BR2")
                    .wihtAddress("BR2")
                    .wihtGroup("name"));
        }
        app.contacts().selecContactByIndex(before.size()-1);
        ContactData contact = new ContactData()
                .wihtId(before.get(before.size()-1).getId())
                .wihtFirstname("Alex2")
                .wihtLastname("Gold2")
                .wihtGroup("name");
        //app.contacts().selectContact();
        app.contacts().fillContactForm(contact);
        app.contacts().confirmContactModification();

        List<ContactData> after = app.contacts().getContactList();
        Assert.assertEquals(before.size(), after.size());
        before.add(contact);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(before));
    }
}
