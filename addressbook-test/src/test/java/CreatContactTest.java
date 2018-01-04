import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class CreatContactTest extends TestBase {

    @Test
    public void CreatContactTest() {
        initContactCreation();
        fillContactForm();  
        submitContactCreation();

    }


}
