package lesson5;

public class ProgramTask53
{
    public static void main(String args[])
    {
        int a = 34;
        int b = 2;
        int c = 78;
        int max = a;

        if(max < b)
        {
            max = b;
        }
        if(max < c)
        {
            max = c;
        }

        System.out.println("Max value: " + max);
    }
}
