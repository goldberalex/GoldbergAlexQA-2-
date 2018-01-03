

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {
    @Test
    public void groupDeletionTest (){
        goToGroupsPage();
        selectGroup ();
        clickButto ();
        //returnGroup ();



    }

   // private void returnGroup() {
   //     wd.findElement(By.name())
    //}

    private void clickButto() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }


}
