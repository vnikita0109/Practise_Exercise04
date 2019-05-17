package PractiseCycle04;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndPrint {
    public String sortAndPrint(String yourChoice)
    {
        char[] array=yourChoice.toCharArray();                      //saving string to character array
        Arrays.sort(array);                                         //sorting the character array
        String myChoice=new String(array);
        System.out.println("Your input when sorted : "+myChoice);       //displaying the new sorted array
        return myChoice;
    }
}
