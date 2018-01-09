package tests;

import model.ContactData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatContactTest extends TestBase {

    @Test
    public void CreatContactTest() {
        int before = app.getContactCout();//посчитали группы до добавления
        app.initContactCreation();
        app.fillContactForm(new ContactData("Alex", "Goldber", "Goldberalex", "F", "BearSheva", "BearSheba"));
        app.submitContactCreation();
        int after = app.getContactCout();
        Assert.assertEquals(after, before+1);

    }
}
