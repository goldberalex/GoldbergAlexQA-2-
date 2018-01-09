import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CardDeletionTest extends TestBase{
    @Test
    public void cardDeletionTest(){
        //int before = wd.findElements(By.).size();
        selectCard();
        clickButtonArchive();
        //int after = wd.findElements(By.xpath()).size();
        //Assert.assertEquals(after, before-1);

    }

    public void clickButtonArchive() {
        wd.findElement(By.xpath()).click();
    }

    public void selectCard() {
        wd.findElement(By.xpath("//div[@id('board')]/div[3]/div[1]/div[2]/a[1]/span[1]")).click();
    }
}

