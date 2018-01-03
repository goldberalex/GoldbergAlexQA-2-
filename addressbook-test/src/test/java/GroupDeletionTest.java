

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    @Test
    public void groupDeletionTest (){
        goToGroupsPage();
        selectGroup ();
        clickButtonDeleteGroup ();
        //returnGroup ();



    }

   // private void returnGroup() {
   //     wd.findElement(By.)
    //}

    private void clickButtonDeleteGroup() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }


}
