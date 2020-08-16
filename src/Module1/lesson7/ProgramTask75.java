package Module1.lesson7;

import java.util.Scanner;

public class ProgramTask75
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a;
        int sum = 0;
        do
        {
            a = s.nextInt();
            sum+=a;
        }while(a != 0);
        System.out.println(sum);
    }
}
