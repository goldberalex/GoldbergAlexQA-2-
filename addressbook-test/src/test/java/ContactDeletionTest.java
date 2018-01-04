import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest(){
        selectContact();
        clickButtonDelete();
        confirmAlert();
    }
    public void confirmAlert() {
        wd.switchTo().alert().accept();
    }
}
