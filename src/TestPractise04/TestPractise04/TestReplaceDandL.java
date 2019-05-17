package TestPractise04;

import PractiseCycle04.ReplaceDandL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestReplaceDandL {
    ReplaceDandL r;

    @Before
    public void setUp()
    {
        //arrange
        r=new ReplaceDandL();
        System.out.println("Before");
    }
    @Test
    public void replaceTest()
    {
        String str="daily dry";
        String expected="faity fry";
        String result=r.replaceLetter(str);
        assertEquals(expected,result);
    }

    @Test
    public void replaceNotDoneTest()
    {
        String str="hii";
        String expected="hii";
        String result=r.replaceLetter(str);
        assertEquals(expected,result);
    }
    @Test
    public void replaceTestFailure()
    {
        String str="daily dry";
        String expected="daily try";
        String result=r.replaceLetter(str);
        assertNotEquals(expected,result);
    }
    @After
    public void tearDown()
    {
        //arrange
        r=null;
        System.out.println("After");
    }
}
