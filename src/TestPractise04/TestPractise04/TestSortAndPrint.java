package TestPractise04;

import PractiseCycle04.SortAndPrint;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestSortAndPrint {

    SortAndPrint sp;

    @Before
    public  void setUp(){
        //arrange
        sp=new SortAndPrint();

    }
    @Test
    public void sortAndPrintTest(){
        String str="maano ki ye sapna hai";
        String expected="    aaaaaehiikmnnopsy";
        String result=sp.sortAndPrint(str);
        assertEquals(expected,result);
    }
    @Test
    public void sortAndPrintTestFailure(){
        String str="maano ki ye sapna hai";
        String expected="    aaaaehiikmnnopsy";
        String result=sp.sortAndPrint(str);
        assertNotEquals(expected,result);
    }
    @After
    public void tearDown()
    {
        sp=null;
    }
}
