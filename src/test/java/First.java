
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class First extends TestBese {
    //extends TestBese нужен для создания TestBese, далее нажимаем alt+энтер и выбираем создать TestBese, далее ставим везде галочки, кроме второго


    @Test
    public void First() {
        openGoogle();
        typeAnyThing();
    }

}
