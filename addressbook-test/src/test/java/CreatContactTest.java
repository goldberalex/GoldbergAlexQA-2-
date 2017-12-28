import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreatContactTest extends TestBase {

    @Test
    public void CreatContactTest() {
        //openaddress
        openaddress();
        //login
        login("admin", "secret");
        //goToContactPage
        wd.findElement(By.linkText("add new")).click();
        //fillContactForm
        fillContactForm("Alex", "Goldber", "Goldberalex", "F", "BearSheva", "BearSheba");
        //submitGroupCreation
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }


}
