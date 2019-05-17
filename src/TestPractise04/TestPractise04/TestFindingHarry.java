package TestPractise04;

import PractiseCycle04.FindingHarry;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFindingHarry {
    FindingHarry harry;

    @Before
    public void setUp()
    {
        //arrange
       harry= new FindingHarry();
        System.out.println("Inside before");
    }
    @Test
    public void findHarryTest(){
        String str="This is Harry";
        boolean expected=true;
        boolean result=harry.isHarrythere(str);
        assertEquals(expected,result);
    }
    @Test
    public void findHarryFailureTest(){
        String str="This is Ryan";
        boolean expected=false;
        boolean result=harry.isHarrythere(str);
        assertEquals(expected,result);
    }
    @After
    public void tearDown()
    {
        //arrange
        harry=null;
        System.out.println("Inside after");
    }
}
