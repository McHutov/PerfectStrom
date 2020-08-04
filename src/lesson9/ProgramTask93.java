package lesson9;

import java.util.Scanner;

public class ProgramTask93
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str;
        String nstr;

        for(int i = 0; i < 2; i++)
        {
            System.out.println("Enter any word that have even number quantity letter: ");
            str = s.nextLine();
            nstr = str.substring(0 , str.length() / 2);

            System.out.println(nstr);
        }

    }
}
