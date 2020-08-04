package lesson9;

import java.util.Scanner;

public class ProgramTask94
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = "Dastan";
        String strR = reverse(str);

        System.out.println(strR);
    }

    static String reverse(String str)
    {
        StringBuilder strb = new StringBuilder();
        for(int i = str.length() -1; i >= 0; i--)
        {
            strb.append(str.charAt(i));
        }

        return strb.toString();
    }
}
