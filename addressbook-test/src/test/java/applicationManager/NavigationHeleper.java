package applicationManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// 10. копируем конструктор из GroupHelper:
//       FirefoxDriver wd;
//       public GroupHelper(FirefoxDriver wd) {меняем GroupHelper на NavigationHeleper
//          super(wd);
//    }
    public class NavigationHeleper extends HelperBese {//18. пишем extends HelperBese
//19. и в этой строке нужно удалить вэб драйвер: FirefoxDriver wd;
        public NavigationHeleper(WebDriver wd) {

            super(wd);//17. мы ссылку this.wd=wd; меняем на-> super(wd);
        }

        public void goToGroupsPage() {//14. это перенесли из ApplicationManager
            if(isElementPresent(By.tagName("h1"))&& wd.findElement(By.tagName("h1")).getText().equals("Groups")
                    && isElementPresent(By.name("new"))){
                return;
            }
            click(By.xpath("//*[@href='group.php']"));
        }
    }
//это класс делаем простым добавлением