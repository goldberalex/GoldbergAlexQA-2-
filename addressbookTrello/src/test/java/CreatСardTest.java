
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatСardTest extends TestBase {

    @Test
    public void creatСard() {
        //int before = wd.findElements(By.xpath().size();
        creatСardNew("Tema");
        returnToProject();
        //int after = wd.findElements(By.xpath()).size();
        //Assert.assertEquals(after, before+1);

    }

}
