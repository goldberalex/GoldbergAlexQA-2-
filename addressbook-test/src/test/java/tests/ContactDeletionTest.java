package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest(){
        int before = app.getContactCoutDeletion();
        //выделяем строчку wd.findElements(By.name("selected[]")).size();
        // далее ctrl->alt-> называем этот метод getContactCoutDeletion, он спросит применить к остальным?,
        // нажимаем кнопку ОК и далее метод что появится ниже перетаскиваем его в ApplicationManager
        app.selectContact();
        app.clickButtonDelete();
        app.confirmAlert();
        int after = app.getContactCoutDeletion();
        Assert.assertEquals(after, before-1);
    }


}
