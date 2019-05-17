package TestPractise04;

import PractiseCycle04.MultiOccurance;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TestMultiOccurance {
    MultiOccurance multi;

    @Before
    public void setUp()
    {
        //arrange
        multi=new MultiOccurance();

        System.out.println("Inside Before");

    }
    @Test
    public void testMultiMatch(){
        String str = "kim Seokjin kim Namjoon kim Taehyoung";
        String[] expected={"Found at 0-3","Found at 12-15","Found at 24-27"};
        String[] result=multi.checkMultiMatches("kim",str);
        assertArrayEquals(expected,result);
    }
    @Test
    public void testMultiMatchNotfound(){
        String str = "Min Yoongi Jung Hoseok Park Jimin Jeon Jungguk";
        String[] expected=null;
        String[] result=multi.checkMultiMatches("kim",str);
        assertArrayEquals(expected,result);
    }
    @After
    public void tearDown()
    {
        //arrange
        multi=null;

        System.out.println("Inside After");

    }

}
