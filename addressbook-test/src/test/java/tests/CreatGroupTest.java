package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatGroupTest extends TestBase {

    @Test
    public void GreatGroupTest() {
        app.getNavigationHeleper().goToGroupsPage();//20. нужно прописать геттер getNavigationHeleper().
        int before = app.getGroupHelper().getGroupCout();//посчитали группы до добавления
        app.getGroupHelper().iniGroupCreation();
        app.getGroupHelper().fillGreoupForm(new GroupData("name", null, "footer"));
        //вместо "header" поставили null нужно в HelperBese в метод type вписать:
        // if(text!=null){
        //    wd.findElement(locator).clear();
        //    wd.findElement(locator).sendKeys(text);
        //        }
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGropsPage();
        int after = app.getGroupHelper().getGroupCout();//посчитали группы после добавления
        Assert.assertEquals(after, before+1);

    }
}
