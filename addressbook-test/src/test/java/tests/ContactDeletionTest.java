package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class ContactDeletionTest extends TestBase{
    @Test//(enabled = false)//(enabled = false) означает что этот тест не запускать
   public void contactDeletionTest(){
        if (!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData()
                    .wihtFirstname("Alex2")
                    .wihtLastname("Gold2")
                    .wihtNickname("GoldbergAlex2")
                    .wihtCompany("F2")
                    .wihtHome("BR2")
                    .wihtAddress("BR2"));
        }
        List<ContactData> before = app.getContactHelper().getContactList();
        //int before = app.getContactHelper().getContactCout();
        app.getContactHelper().selecContactByIndex(before.size()-1);
        //выделяем строчку wd.findElements(By.name("selected[]")).size();
        // далее ctrl->alt-> называем этот метод getContactCoutDeletion, он спросит применить к остальным?,
        // нажимаем кнопку ОК и далее метод что появится ниже перетаскиваем его в ApplicationManager
        //app.getContactHelper().selectContact();
        app.getContactHelper().clickButtonDeleteContact();
        //app.getContactHelper().confirmAlert(); //Alert нужен если в selectContact() будет click(By.name("selected[]"));
       List<ContactData> after = app.getContactHelper().getContactList();
        //int after = app.getContactHelper().getContactCout();
        Assert.assertEquals(after.size(), before.size()-1);

        before.remove(before.size()-1);
        for (int i=0; i < before.size(); i++){
            Assert.assertEquals(before.get(i),after.get(i));
        }
    }
}
