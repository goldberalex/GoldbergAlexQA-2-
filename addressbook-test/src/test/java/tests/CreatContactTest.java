package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatContactTest extends TestBase {

    @Test
    public void CreatContactTest(String userName) {
        int before = wd.findElements(By.name("//*[@value='icons/status_online.png']")).size();//посчитали группы до добавления
        initContactCreation();
        fillContactForm(userName);
        submitContactCreation();
        int after = wd.findElements(By.xpath("//*[@value='icons/status_online.png']")).size();
        Assert.assertEquals(after, before+1);

    }


}
