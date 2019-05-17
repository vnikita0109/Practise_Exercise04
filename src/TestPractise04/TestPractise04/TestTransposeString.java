package TestPractise04;

import PractiseCycle04.TransposeString;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestTransposeString {
    TransposeString tr;
    @Before
    public void setUp()
    {
        //arrange
        tr=new TransposeString();

        System.out.println("Inside Before");

    }
    @Test
    public void transposingTest()
    {
        String str="a quick brown fox jumps over the lazy dog";
        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String result=tr.trans(str);
        assertEquals(expected,result);
    }
    @Test
    public void transposingEmptyTest()
    {
        String str="";
        String expected="";
        String result=tr.trans(str);
        assertNotEquals(expected,result);
    }
    @Test
    public void transposingTestFailure()
    {
        String str="a quick brown fox jumps over the lazy dog";
        String expected="a kciuq nworb xof spmuj revo eht yzal";
        String result=tr.trans(str);
        assertNotEquals(expected,result);
    }
    @After
    public void tearDown()
    {
        //arrange
        tr=null;

        System.out.println("Inside After");

    }
}
