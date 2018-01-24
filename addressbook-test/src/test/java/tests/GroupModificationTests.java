package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
    @Test
    public void testGroupModify() {
        app.goTo().goToGroupsPage();
        if(!app.groups().isThereAGroup()){
            app.groups().createGroup(new GroupData()
                    .wihtName("name")
                    .wihtHeader("g")
                    .wihtFooter("footer"));
        }
        app.groups().selectGroup();
        app.groups().initGroupModification();//это клик на кнопку Edit group
        app.groups().fillGreoupForm(new GroupData()
                .wihtName("name")
                .wihtHeader("g")
                .wihtFooter("footer"));
        app.groups().confirmGroupModification();//это клик на кнопку Update;
        app.groups().returnToGropsPage();
    }
}
