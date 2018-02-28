import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTeast {
    @Test
    public void testEquation(){
        Equation e = new Equation(1,1,1);
        Assert.assertEquals(e.rootNumber(),0);
    }
    @Test
    public void test2Equation(){
        Equation e = new Equation(8,1,1);
        Assert.assertEquals(e.rootNumber(),0);
    }
}
