package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreatGroupTest extends TestBase {

    @Test
    public void GreatGroupTest() {
        app.goToGroupsPage();
        int before = app.getGroupCout();//посчитали группы до добавления
        iniGroupCreation();
        app.fillGreoupForm(new GroupData("name", "header", "footer"));
        app.submitGroupCreation();
        app.returnToGropsPage();
        int after = app.getGroupCout();//посчитали группы после добавления
        Assert.assertEquals(after, before+1);

    }



}
