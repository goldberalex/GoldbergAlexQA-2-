package applicationManager;

import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBese {//15. создаем GroupHelper->extends HelperBese и создаем новый метод
//16. и отправляем методы type, click на верх и вэб драйвер

    public GroupHelper(WebDriver wd) {
        super(wd);//9. мы даем ссылку из класса public class GroupHelper extends HelperBese в ручную
    }

    public int getGroupCout() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void iniGroupCreation() {
       click(By.name("new"));
    }

    public void fillGreoupForm(GroupData groupData) {
        type(By.name("group_name"),groupData.getName());
        type(By.name("group_header"),groupData.getHeader());
        type(By.name("group_footer"),groupData.getFooter());
    }

    public void submitGroupCreation() {
        click(By.name("submit"));
    }

    public void returnToGropsPage() {
        click(By.xpath("//*[@href='group.php']"));
    }

    public void clickButtonDeleteGroup() {//удаление группы
        click(By.name("delete"));
    }

    public void selectGroup() {
        click(By.name("selected[]"));
    }

    public void initGroupModification() {
        click(By.name("edit"));
    }

    public void confirmGroupModification() {
        click(By.name("update"));
    }
}
