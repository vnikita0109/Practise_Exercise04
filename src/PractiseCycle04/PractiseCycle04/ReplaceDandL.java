package PractiseCycle04;

import java.util.Scanner;

public class ReplaceDandL {
    public String replaceLetter(String str){

        String temp1=str.replaceAll("d","f");           //firstly replacing 'd' by 'f'
        String newstr=temp1.replaceAll("l","t");        //then replacing 'l' by t
        System.out.println("your new string is :"+newstr);                  //displaying the result

        return newstr;
    }

}
