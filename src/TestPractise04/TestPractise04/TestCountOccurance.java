package TestPractise04;

import PractiseCycle04.CountOccurance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCountOccurance {
    CountOccurance c=new CountOccurance();

    @Test
    public void occuranceCountTest()
    {
        String sample="What's in a name?";
        int expected=3;
        int result=c.chkOccurance(sample);
        assertEquals(expected,result);
    }
    @Test
    public void noanyoccuranceCountTest()
    {
        String sample="Where is it?";
        int expected=0;
        int result=c.chkOccurance(sample);
        assertEquals(expected,result);
    }

}
