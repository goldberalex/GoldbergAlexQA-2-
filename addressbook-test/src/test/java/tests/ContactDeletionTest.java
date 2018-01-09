package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest(){
        int before = app.getContactCoutDeletion();
        app.selectContact();
        app.clickButtonDelete();
        app.confirmAlert();
        int after = app.getContactCoutDeletion();
        Assert.assertEquals(after, before-1);
    }


}
