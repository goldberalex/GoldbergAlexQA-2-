package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreatContactTest extends TestBase {
    @DataProvider
    public Iterator<Object[]> validContacts() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contact.csv")));
        String line = reader.readLine();
        while (line!=null){
            String[] split= line.split(";");
            list.add(new Object[] {new ContactData()
                    .wihtFirstname(split[0])
                    .wihtLastname(split[1])
                    .wihtNickname(split[2])
                    .wihtCompany(split[3])
                    .wihtAddress(split[4])
                    .wihtHome(split[5])});
            line = reader.readLine();
        }
        return  list.iterator();
    }

        @Test(dataProvider = "validContacts")
    public void CreatContactTest(ContactData contact) {
        app.goTo().goAddressbook();
        List<ContactData> before = app.contacts().getContactList();
        //int before = app.getContactHelper().getContactCout();//посчитали группы до добавления
        app.contacts().initContactCreation();
        app.contacts().fillContactForm(contact);//выпадающие списки
        app.contacts().submitContactCreation();
        List<ContactData> after=app.contacts().getContactList();
        //int after = app.getContactHelper().getContactCout();
        //Assert.assertEquals(after, before+1);
        Assert.assertEquals(after.size(), before.size()+1);

    }
    @Test
    public void CreatContactTestwithPhoto() {
        app.goTo().goAddressbook();
        List<ContactData> before = app.contacts().getContactList();
        //int before = app.getContactHelper().getContactCout();//посчитали группы до добавления
        app.contacts().initContactCreation();
        File photo = new File("src/test/resources/photo.jpg");
        app.contacts().fillContactForm(new ContactData()
                .wihtFirstname("test1")
                .wihtLastname("Test1")
                .wihtPhoto(photo));
        app.contacts().submitContactCreation();
        List<ContactData> after=app.contacts().getContactList();
        //int after = app.getContactHelper().getContactCout();
        //Assert.assertEquals(after, before+1);
        Assert.assertEquals(after.size(), before.size()+1);

    }
}
