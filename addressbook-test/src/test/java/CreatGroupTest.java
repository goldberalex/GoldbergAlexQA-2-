import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreatGroupTest extends TestBase {

    @Test
    public void GreatGroupTest() {
        openaddress();
        login("admin", "secret");
        goToGroupsPage ();
        iniGroupCreation ();
        fillGreoupForm ();
        submitGroupCreation ();
        returnToGropsPage ();
    }

}
