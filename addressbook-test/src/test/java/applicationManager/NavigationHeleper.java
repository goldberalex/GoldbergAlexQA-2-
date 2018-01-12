package applicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


    public class NavigationHeleper extends HelperBese {

        public NavigationHeleper(FirefoxDriver wd) {
            super(wd);
        }
        public void goToGroupsPage() {
            click(By.xpath("//*[@href='group.php']"));
        }
    }
