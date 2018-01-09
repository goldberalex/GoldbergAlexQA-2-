import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CardDeletionTest extends TestBase{
    @Test
    public void cardDeletionTest(){
        selectCard();
        clickButtonArchive();

    }

    public void clickButtonArchive() {
    }

    public void selectCard() {
        wd.findElement(By.xpath("//div[@id('board')]/div[3]/div[1]/div[2]/a[1]/span[1]")).click();
    }
}

