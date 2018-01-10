package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest(){
        app.goToGroupsPage();
        int before = app.getGroupCoutDeletion();
        //выделяем строчку wd.findElements(By.name("selected[]")).size();
        // далее ctrl->alt-> называем этот метод getGroupCout, он спросит применить к остальным?,
        // нажимаем кнопку ОК и далее метод что появится ниже перетаскиваем его в ApplicationManager
        app.selectGroup();
        app.clickButtonDeleteGroup();
        app.returnToGropsPage();
        int after = app.getGroupCoutDeletion();
        Assert.assertEquals(after, before-1);
    }


}
