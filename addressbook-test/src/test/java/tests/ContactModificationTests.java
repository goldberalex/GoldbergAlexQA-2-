package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModify(){
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactForm(new ContactData(null, "Goldber", "Goldberalex", "F", "BearSheva", "BearSheba"));
        app.getContactHelper().confirmContactModification();
    }
}
