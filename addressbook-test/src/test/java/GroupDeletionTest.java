
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest(){
        goToGroupsPage();
        selectGroup ();
        clickButtonDeleteGroup ();
        returnToGropsPage();
    }



}
