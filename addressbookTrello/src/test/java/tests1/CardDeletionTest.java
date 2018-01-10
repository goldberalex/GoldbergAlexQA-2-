package tests1;

import org.testng.annotations.Test;

public class CardDeletionTest extends TestBase{
    @Test
    public void cardDeletionTest(){
        //int before = wd.findElements(By.).size(); Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
        selectCard();
        clickButtonArchive();
        //int after = wd.findElements(By.xpath()).size(); Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
        //Assert.assertEquals(after, before-1);

    }

    public void clickButtonArchive() {
       // wd.findElement(By.xpath()).click(); Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
    }

    public void selectCard() {
       // wd.findElement(By.xpath("//div[@id('board')]/div[3]/div[1]/div[2]/a[1]/span[1]")).click();//Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
    }
}

