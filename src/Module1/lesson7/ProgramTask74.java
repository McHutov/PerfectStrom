package Module1.lesson7;

import java.util.Scanner;

public class ProgramTask74
{
    public static void main(String args[])
    {
        int index = 1;
        for(int k = 6; k >= 0; k--)
        {
        for(int i = 0; i <= 13; i++)
        {
            System.out.print(" ");
            if(i == k)
            {
                for(int h = 0; h < index;h++)
                {
                    System.out.print("*");
                }
                index+=2;
            }
        }
            System.out.println();
        }
    }
}
