package tests1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CardDeletionTest extends TestBase{
    @Test
    public void cardDeletionTest(){
        int before = app.getCardCout();
        app.selectCard();
        app.clickButtonArchive();
        app.clickButtonDelete();
        int after = app.getCardCout();
        Assert.assertEquals(after, before-1);

    }

}

