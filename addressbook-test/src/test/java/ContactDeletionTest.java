import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest (){
        openaddress();
        login("admin", "secret");
        goToContactPage();
        selectContact ();
        clickButtonDelete ();
    }

    public void clickButtonDelete() {
        wd.findElement(By.linkText("Delete")).click();
    }

    public void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }
}
