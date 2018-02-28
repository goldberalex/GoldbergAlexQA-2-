package tests;

import model.GroupData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CreatGroupTest extends TestBase {

    @DataProvider
    public Iterator<Object[]> validGroups() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/group.csv")));

        String line = reader.readLine();
        while (line!=null){
            String[] split= line.split(";");
            list.add(new Object[] {new GroupData()
                    .wihtName(split [0])
                    .wihtHeader(split[1])
                    .wihtFooter(split[2])});
            line = reader.readLine();
        }
        return  list.iterator();
    }

    @Test (dataProvider = "validGroups")
    public void GreatGroupTest(GroupData group) {
        app.goTo().goToGroupsPage();//20. нужно прописать геттер getNavigationHeleper().
        List<GroupData> before = app.groups().getGroupList();
        //int before = app.groups().getGroupCout();//посчитали группы до добавления
        app.groups().iniGroupCreation();
        app.groups().fillGreoupForm(group);
        //вместо "header" поставили null нужно в HelperBese в метод type вписать:
        // if(text!=null){
        //    wd.findElement(locator).clear();
        //    wd.findElement(locator).sendKeys(text);
        //        }
        app.groups().submitGroupCreation();
        app.groups().returnToGropsPage();
        List<GroupData> after = app.groups().getGroupList();
        //int after = app.groups().getGroupCout();//посчитали группы после добавления
        Assert.assertEquals(after.size(), before.size()+1);


    }
}
