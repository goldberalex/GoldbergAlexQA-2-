package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest(){
        goToGroupsPage();
        int before = wd.findElements(By.name("selected[]")).size();
        selectGroup();
        clickButtonDeleteGroup();
        returnToGropsPage();
        int after = wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(after, before-1);
    }



}
