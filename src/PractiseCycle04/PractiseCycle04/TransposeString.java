package PractiseCycle04;

public class TransposeString {
    public String trans(String input)
    {

        String[] a=input.split(" ");
        String output="";
        for(int i=0;i<a.length;i++)
        {
            output="";
            for (int j=a[i].length()-1;j>=0;j--)
            {
               output=output+a[i].charAt(j);            //reversing the string by characters
            }
            a[i]=output;
        }

        String output1="";
        for (int i=0;i<a.length;i++)
        {
            output1=output1+a[i]+" ";               //save the string in new string
        }
        System.out.println(output1.trim());
        return output1.trim();                      //for omitting the front and rear end spaces
    }
}
