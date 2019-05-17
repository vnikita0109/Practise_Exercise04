package PractiseCycle04;

import java.util.Scanner;

public class CountOccurance {

    public int chkOccurance(String sample)
    {

        System.out.println(sample);
        System.out.println("Original length is:"+sample.length());
        System.out.println("Length without A is:"+sample.replace("a","").length());
        int occuranceOfA= sample.length()- sample.replaceAll("a","").length();
        System.out.println("Occurance of charachter a is:"+occuranceOfA);
        return  occuranceOfA;
    }
}
