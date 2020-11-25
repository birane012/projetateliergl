package testUnitaires;

import implementation.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TestUnit {
    Calculator cal=new Calculator();

    @Test
    public void testSumResAttenduEgal5(){
        int sum=cal.sum(5, 0);
        Assert.assertTrue(sum==5);
    }

    @Test
    public void testMinusResAttenduEgal2(){
        int dif=cal.minus(3, 1);
        Assert.assertFalse(dif!=2);
    }

    @Test
    public void testDivideResAttenduEgal3(){
        int q=cal.divide(9, 3);
        Assert.assertEquals(q, 3);
    }
    @Test(expected=ArithmeticException.class)
    public void testDivideArithmeticExceptionAttenduEgal() throws ArithmeticException{
        int q=cal.divide(9, 0); //Cette ligne doit declancher une exception de type  ArithmeticException
    }

    @Test
    public void testMultiplyResAttenduEgal10(){
        int mul=cal.multiply(5, 2);
        Assert.assertEquals(mul, 10);
    }

    @Test
    public void testMinResAttenduEgal2(){
        int min=cal.min(5, 2);
        Assert.assertTrue(min==2);
    }

    @Test
    public void testMaxResAttenduEgal5(){
        int max=cal.max(5, 2);
        Assert.assertFalse(max!=5);
    }

    int [] list= {-1,-5,2,5,8,15};
    @Test
    public void testMinElementResAttenduEgal/*-5*/(){
        int minElmt=cal.minElement(list);
        Assert.assertFalse(minElmt!=-5);
    }
    @Test
    public void testMaxElementResAttenduEgal15(){
        int maxElmt=cal.maxElement(list);
        Assert.assertTrue(maxElmt==15);
    }
}
