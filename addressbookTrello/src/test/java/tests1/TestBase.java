package tests1;

import application1.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
    protected final ApplicationManager app = new ApplicationManager();//что бы поменять наследование на делигирование - это мы делаем:ставим курсор на TestBase->Refactor->Extract->Replace Inheritance with Delegation
//что бы поменать насзвание переменной везде нужно->Shift+F6
    @BeforeClass
    public void setUp() throws Exception {//когда поднимаем в ApplicationManager мы setUp() не отмечаем галочкой он должен остаться здесь
        app.start();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }//отвечает за стоп, останавливает браузер
//когда поднимаем в ApplicationManager мы tearDown() не отмечаем галочкой он должен остаться здесь
}
