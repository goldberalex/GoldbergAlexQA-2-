package tests1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CardDeletionTest extends TestBase{
    @Test
    public void cardDeletionTest(){
        //int before = wd.findElements(By.).size(); ?????? Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
        app.selectCard();
        app.clickButtonArchive();
        //int after = wd.findElements(By.xpath()).size(); ?????? Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
        //Assert.assertEquals(after, before-1);

    }
}

