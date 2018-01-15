package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModify() {
        app.getNavigationHeleper().goToGroupsPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();//это клик на кнопку Edit group
        app.getGroupHelper().fillGreoupForm(new GroupData("name", null, "footer"));
        app.getGroupHelper().confirmGroupModification();//это клик на кнопку Update;
        app.getGroupHelper().returnToGropsPage();
    }
}
