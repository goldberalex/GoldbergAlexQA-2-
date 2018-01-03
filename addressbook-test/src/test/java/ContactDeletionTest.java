import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest (){
        goToContactPage();
        selectContact ();
        clickButtonDelete ();
        confirmAlert();
    }
    private void confirmAlert() {
        wd.switchTo().alert().accept();
    }
}
