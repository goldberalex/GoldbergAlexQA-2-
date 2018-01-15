package applicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBese {
    WebDriver wd;

    public HelperBese(WebDriver wd) {
        this.wd=wd;
    }

    public void type(By locator, String text) {
        click(locator);//ctrl+alt+P и везде в скобках прописать locator
        if(text!=null){
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {//чтобы создать этот метод нужно выделить любую строчку
        // с click на конце и нажать Refactor->Extract->Parameter Object
        wd.findElement(locator).click();
    }
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
