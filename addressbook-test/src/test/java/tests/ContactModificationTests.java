package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModify(){
        if (!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData().wihtAlex("Alex2")
                    .wihtGoldber("Gold2")
                    .wihtGoldberalex("GoldbergAlex2")
                    .wihtF("F2")
                    .wihtBearSheba("BR2")
                    .wihtBearSheva("BR2"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactForm(new ContactData().wihtAlex("Alex2")
                .wihtGoldber("Gold2")
                .wihtGoldberalex("GoldbergAlex2")
                .wihtF("F2")
                .wihtBearSheba("BR2")
                .wihtBearSheva("BR2"));
        app.getContactHelper().confirmContactModification();
    }
}
