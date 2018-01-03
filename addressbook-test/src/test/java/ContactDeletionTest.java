import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest (){
        goToContactPage();
        selectContact ();
        clickButtonDelete ();
    }

    public void clickButtonDelete() {
       // wd.switchTo()
    }

    public void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }
}
