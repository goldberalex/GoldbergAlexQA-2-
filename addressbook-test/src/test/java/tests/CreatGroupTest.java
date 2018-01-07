package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreatGroupTest extends TestBase {

    @Test
    public void GreatGroupTest() {
        goToGroupsPage();
        int before = wd.findElements(By.name("selected[]")).size();//посчитали группы до добавления
        iniGroupCreation();
        fillGreoupForm(new GroupData("name", "header", "footer"));
        submitGroupCreation();
        returnToGropsPage();
        int after = wd.findElements(By.name("selected[]")).size();//посчитали группы после добавления
        Assert.assertEquals(after, before+1);

    }

}
