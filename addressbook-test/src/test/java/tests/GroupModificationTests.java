package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModify() {
        app.goTo().goToGroupsPage();
        List<GroupData> before = app.groups().getGroupList();
        if(!app.groups().isThereAGroup()){
            app.groups().createGroup(new GroupData()
                    .wihtName("name")
                    .wihtHeader("g")
                    .wihtFooter("footer"));
        }
        //app.groups().selectGroup();
        app.groups().selecGroupByIndex(before.size()-1);
        app.groups().initGroupModification();//это клик на кнопку Edit group

        GroupData group = new GroupData()
                .wihtId(before.get(before.size()-1).getId())
                .wihtName("name");

        app.groups().fillGreoupForm(group);
        app.groups().confirmGroupModification();//это клик на кнопку Update;
        app.groups().returnToGropsPage();
        List<GroupData> after = app.groups().getGroupList();

        Assert.assertEquals(before.size(), after.size());
        before.remove(before.size()-1);
        before.add(group);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(before));
    }
}
