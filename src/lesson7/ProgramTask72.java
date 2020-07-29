package lesson7;

import java.util.Scanner;

public class ProgramTask72
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        a = (int)Math.sqrt(a);
        int i = 1;
        while(i <= a)
        {
            System.out.println((i*i) + " ");
            i++;
        }
    }
}
