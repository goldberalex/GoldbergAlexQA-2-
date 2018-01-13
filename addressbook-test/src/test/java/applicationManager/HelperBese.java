package applicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBese {

    FirefoxDriver wd;

    public HelperBese(FirefoxDriver wd) {
        this.wd=wd;
    }

    public void type(By locator, String text) {
        click(locator);//ctrl+alt+P и везде в скобках прописать locator
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {//чтобы создать этот метод нужно выделить любую строчку
        // с click на конце и нажать Refactor->Extract->Parameter Object
        wd.findElement(locator).click();
    }
}
