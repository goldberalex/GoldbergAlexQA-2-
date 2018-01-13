package tests;

import model.ContactData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatContactTest extends TestBase {

    @Test
    public void CreatContactTest() {
        int before = app.getContactHelper().getContactCout();//посчитали группы до добавления
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("Alex", "Goldber", "Goldberalex", "F", "BearSheva", "BearSheba"));
        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCout();
        Assert.assertEquals(after, before+1);

    }
}
