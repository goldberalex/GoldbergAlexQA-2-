package tests1;

import model1.CardData;
import org.testng.annotations.Test;

public class CreatСardTest extends TestBase {

    @Test
    public void creatСard() {
        //int before = wd.findElements(By.xpath().size();//Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
        creatСardNew(new CardData("Tema"));
        returnToProject();
        //int after = wd.findElements(By.xpath()).size();//Лена я не знаю как прописасть здесь что ему искать, по какому параметру?
        //Assert.assertEquals(after, before+1);

    }

}
