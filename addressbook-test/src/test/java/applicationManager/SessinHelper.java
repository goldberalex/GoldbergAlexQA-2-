package applicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessinHelper extends HelperBese {
    public SessinHelper(WebDriver wd) {
        super(wd);
    }
    public void openaddress(String url) {

        wd.get(url);
    }

    public void login(String userName, String password) {
        type(By.name("user"), userName);//для того что бы создать type метод нужно выфделить метод и нажать ctrl+alt+M и назвать его
        type(By.name("pass"), password);
        click(By.xpath("//form[@id='LoginForm']/input[3]"));
    }
}
