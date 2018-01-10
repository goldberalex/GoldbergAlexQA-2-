package tests1;

import model1.CardData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatСardTest extends TestBase {

    @Test
    public void creatСard() {
        int before = app.getCardCoutDeletion();
        app.creatСardNew(new CardData("Tema"));
        app.returnToProject();
        int after = app.getCardCoutDeletion();
        Assert.assertEquals(after, before+1);


    }
}
