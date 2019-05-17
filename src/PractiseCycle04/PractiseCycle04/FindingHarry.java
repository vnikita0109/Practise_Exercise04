package PractiseCycle04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingHarry {

    public boolean isHarrythere(String str)
    {
        boolean result=true;
        System.out.println("This is Harry");
        Pattern pattern=Pattern.compile("Harry");
        Matcher m=pattern.matcher(str);

        if (m.find()) {
            result=true;
        }
        else {
            result=false;
        }
        System.out.println("Is Harry there?");
        return result;
    }
}
