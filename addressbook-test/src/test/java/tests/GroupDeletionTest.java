package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest(){
        app.getNavigationHeleper().goToGroupsPage();//21. нужно прописать геттер getNavigationHeleper().
        int before = app.getGroupHelper().getGroupCout();
        //выделяем строчку wd.findElements(By.name("selected[]")).size();
        // далее ctrl->alt-> называем этот метод getGroupCout, он спросит применить к остальным?,
        // нажимаем кнопку ОК и далее метод что появится ниже перетаскиваем его в ApplicationManager
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().clickButtonDeleteGroup();
        app.getGroupHelper().returnToGropsPage();
        int after = app.getGroupHelper().getGroupCout();
        Assert.assertEquals(after, before-1);
    }


}
