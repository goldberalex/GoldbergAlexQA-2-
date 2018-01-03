import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest (){
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
