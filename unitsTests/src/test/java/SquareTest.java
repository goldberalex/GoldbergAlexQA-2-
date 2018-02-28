import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {//площадь квадрата
    @Test
    public void testSquareArea(){
        Square s = new Square(7);
        Assert.assertEquals(49,s.area());
    }
}
