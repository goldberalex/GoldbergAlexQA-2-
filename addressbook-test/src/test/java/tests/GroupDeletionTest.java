package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest(){
        app.getNavigationHeleper().goToGroupsPage();//21. нужно прописать геттер getNavigationHeleper().
        if(!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("edit", null, "footer"));
        }
        int before = app.getGroupHelper().getGroupCout();
        app.getGroupHelper().selecGroupByIndex(before-1);
        //выделяем строчку wd.findElements(By.name("selected[]")).size();
        // далее ctrl->alt-> называем этот метод getGroupCout, он спросит применить к остальным?,
        // нажимаем кнопку ОК и далее метод что появится ниже перетаскиваем его в ApplicationManager
      //  app.getGroupHelper().selectGroup(); //закоментили потому что уже есть selecGroupByIndex
        app.getGroupHelper().clickButtonDeleteGroup();
        app.getGroupHelper().returnToGropsPage();
        int after = app.getGroupHelper().getGroupCout();
        Assert.assertEquals(after, before-1);
    }


}
