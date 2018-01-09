package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest(){
        app.goToGroupsPage();
        int before = app.getGroupCoutDeletion();
        app.selectGroup();
        app.clickButtonDeleteGroup();
        app.returnToGropsPage();
        int after = app.getGroupCoutDeletion();
        Assert.assertEquals(after, before-1);
    }


}
