package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest() {
        app.goTo().goToGroupsPage();//21. нужно прописать геттер getNavigationHeleper().
        if (!app.groups().isThereAGroup()) {
            app.groups().createGroup(new GroupData()
                    .wihtName("name")
                    .wihtHeader("g")
                    .wihtFooter("footer"));
        }
        List<GroupData> before = app.groups().getGroupList();
        //int before = app.groups().getGroupCout();
        app.groups().selecGroupByIndex(before.size() - 1);
        //выделяем строчку wd.findElements(By.name("selected[]")).size();
        // далее ctrl->alt-> называем этот метод getGroupCout, он спросит применить к остальным?,
        // нажимаем кнопку ОК и далее метод что появится ниже перетаскиваем его в ApplicationManager
        //  app.getGroupHelper().selectGroup(); //закоментили потому что уже есть selecGroupByIndex
        app.groups().clickButtonDeleteGroup();
        app.groups().returnToGropsPage();
        List<GroupData> after = app.groups().getGroupList();
        //int after = app.groups().getGroupCout();
        //Assert.assertEquals(after, before-1);
        Assert.assertEquals(after.size(), before.size() - 1);

        before.remove(before.size() - 1);
        for (int i = 0; i < before.size(); i++) {
            Assert.assertEquals(before.get(i), after.get(i));
        }

    }
}
