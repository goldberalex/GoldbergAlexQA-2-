import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreatGroupTest extends TestBase {

    @Test
    public void CreatGroupTest() {
        //openaddress
        openaddress();
        //login
        login("admin", "secret");
        //goToGroupsPage
        wd.findElement(By.linkText("groups")).click();
        //iniGroupCreation
        wd.findElement(By.name("new")).click();
        //fillGreoupForm
        fillGreoupForm("name", "header", "footer");
        //submitGroupCreation
        wd.findElement(By.name("submit")).click();
        //returnToGropsPage
        wd.findElement(By.linkText("group page")).click();
    }

}
