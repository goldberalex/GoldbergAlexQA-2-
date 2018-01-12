package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatGroupTest extends TestBase {

    @Test
    public void GreatGroupTest() {
        app.getNavigationHeleper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupCout();//посчитали группы до добавления
        iniGroupCreation();
        app.getGroupHelper().fillGreoupForm(new GroupData("name", "header", "footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGropsPage();
        int after = app.getGroupHelper().getGroupCout();//посчитали группы после добавления
        Assert.assertEquals(after, before+1);

    }



}
