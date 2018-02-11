import org.testng.annotations.Test;

public class TaggerMethodsTest {
    @Test(groups = {"postive", "broken"})
    public void test1(){
        System.out.println("broken test2");
    }
    @Test(groups = "postive")
    public void test2(){
        System.out.println("positive test2");
    }
    @Test(groups = "negative")
    public void test3(){
        System.out.println("negative test1");
    }
}
