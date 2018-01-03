import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest (){
        goToContactPage();
        selectContact ();

    }

    private void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }
}
