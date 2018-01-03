import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreatGroupTest extends TestBase {

    @Test
    public void GreatGroupTest() {
        goToGroupsPage ();
        iniGroupCreation ();
        fillGreoupForm ();
        submitGroupCreation ();
        returnToGropsPage ();
    }

}
