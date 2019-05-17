package PractiseCycle04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiOccurance {
    public  String[] checkMultiMatches(String name,String input)
    {
        Pattern pattern=Pattern.compile(name);
        Matcher matcher=pattern.matcher(input);
        int x=0;
        int count=0;
        while(matcher.find()) {                                                                 //increasing counter whenever match is found
            count++;
        }
        if(count==0) {
            return null;
        }
        else {
            String[] finalResult = new String[count];
            matcher = pattern.matcher(input);
            while (matcher.find()) {                                                        //when match is found
                finalResult[x] = "Found at " + matcher.start() + "-" + matcher.end();
                x++;
            }
            for (int i = 0; i < finalResult.length; i++) {                                    //to display the result
                System.out.println(finalResult[i]);
            }
            return finalResult;
        }
    }
}