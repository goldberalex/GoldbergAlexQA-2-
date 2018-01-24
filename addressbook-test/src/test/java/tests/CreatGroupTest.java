package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatGroupTest extends TestBase {

    @Test
    public void GreatGroupTest() {
        app.goTo().goToGroupsPage();//20. нужно прописать геттер getNavigationHeleper().
        int before = app.groups().getGroupCout();//посчитали группы до добавления
        app.groups().iniGroupCreation();
        app.groups().fillGreoupForm(new GroupData()
                .wihtName("name")
                .wihtHeader("g")
                .wihtFooter("footer"));
        //вместо "header" поставили null нужно в HelperBese в метод type вписать:
        // if(text!=null){
        //    wd.findElement(locator).clear();
        //    wd.findElement(locator).sendKeys(text);
        //        }
        app.groups().submitGroupCreation();
        app.groups().returnToGropsPage();
        int after = app.groups().getGroupCout();//посчитали группы после добавления
        Assert.assertEquals(after, before+1);

    }
}
