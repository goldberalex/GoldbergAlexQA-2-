package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ContactDeletionTest extends TestBase{
    @Test
   public void contactDeletionTest(){
        int before = wd.findElements(By.xpath("//*[@value='icons/status_online.png']")).size();
        selectContact();
        clickButtonDelete();
        confirmAlert();
        int after = wd.findElements(By.xpath("//*[@value='icons/status_online.png']")).size();
        Assert.assertEquals(after, before-1);
    }
}
