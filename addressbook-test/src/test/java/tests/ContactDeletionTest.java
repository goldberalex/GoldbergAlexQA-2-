package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactDeletionTest extends TestBase{
    @Test//(enabled = false)//(enabled = false) означает что этот тест не запускать
   public void contactDeletionTest(){
        int before = app.getContactHelper().getContactCout();
        //выделяем строчку wd.findElements(By.name("selected[]")).size();
        // далее ctrl->alt-> называем этот метод getContactCoutDeletion, он спросит применить к остальным?,
        // нажимаем кнопку ОК и далее метод что появится ниже перетаскиваем его в ApplicationManager
        app.getContactHelper().selectContact();
        app.getContactHelper().clickButtonDeleteContact();
        //app.getContactHelper().confirmAlert(); //Alert нужен если в selectContact() будет click(By.name("selected[]"));
        int after = app.getContactHelper().getContactCout();
        Assert.assertEquals(after, before-1);
    }


}
