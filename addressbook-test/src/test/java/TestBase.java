import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void openaddress() {
        wd.get("http://localhost/addressbook/");
    }

    public void login(String admin, String secret) {
        wd.findElement(By.name("user")).click();
        wd.findElement(By.name("user")).clear();
        wd.findElement(By.name("user")).sendKeys(admin);
        wd.findElement(By.name("pass")).click();
        wd.findElement(By.name("pass")).clear();
        wd.findElement(By.name("pass")).sendKeys(secret);
        wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
        // wd.findElement(By.xpath("//form[@name='LoginForm']/input[3]")).click();
    }

    public void  goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void fillGreoupForm(String name, String header, String footer) {
        wd.findElement(By.name("group_name")).click();
        wd.findElement(By.name("group_name")).clear();
        wd.findElement(By.name("group_name")).sendKeys(name);
        wd.findElement(By.name("group_header")).click();
        wd.findElement(By.name("group_header")).clear();
        wd.findElement(By.name("group_header")).sendKeys(header);
        wd.findElement(By.name("group_footer")).click();
        wd.findElement(By.name("group_footer")).clear();
        wd.findElement(By.name("group_footer")).sendKeys(footer);
    }

    public void  iniGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void  fillGreoupForm() {
        fillGreoupForm("name", "header", "footer");
    }

    public void  submitGroupCreation () {
        wd.findElement(By.name("submit")).click();
    }

    public void  returnToGropsPage (){
        wd.findElement(By.linkText("group page")).click();
    }

    public void  goToContactPage () {
        wd.findElement(By.linkText("add new")).click();
    }

    public void  fillContactForm () {
        fillContactForm("Alex", "Goldber", "Goldberalex", "F", "BearSheva", "BearSheba");
    }

    public void  submitContactCreation () {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }

    public void fillContactForm(String alex, String goldber, String goldberalex, String f, String bearSheva, String bearSheba) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(alex);
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(goldber);
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(goldberalex);
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(f);
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(bearSheva);
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys("0584044035");
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys("0584044036");
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys("goldbergalex1981@gmail.com");
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(bearSheba);
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys("1981");
    }
}
