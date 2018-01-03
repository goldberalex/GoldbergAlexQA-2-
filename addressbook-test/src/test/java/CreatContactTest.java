import org.testng.annotations.Test;

import org.openqa.selenium.*;

public class CreatContactTest extends TestBase {

    @Test
    public void CreatContactTest() {
        goToContactPage ();
        iniContactCreation ();
        fillContactForm ();
        submitContactCreation ();

    }


}
