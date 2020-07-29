package lesson7;

public class ProgramTask73
{
    public static void main(String args[])
    {
        int a[] = {10,20,15,17,24,35};
        int mul = 1;
        for (int x: a )
        {
            mul*=x;
        }
        System.out.println(mul);
    }
}
