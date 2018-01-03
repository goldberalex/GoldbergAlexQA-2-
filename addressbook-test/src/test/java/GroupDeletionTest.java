
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    @Test
    public void GroupDeletionTest (){
        goToGroupsPage();
        selectGroup ();
        clickButtonDeleteGroup ();
        returnGroup ();



    }
    public void returnGroup() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void clickButtonDeleteGroup() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }


}
