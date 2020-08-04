package lesson8;

public class ProgramTask82
{
    public static void main(String args[])
    {
        System.out.println(method1(5));
        System.out.println(method1(0));
        System.out.println(method2(5));
        System.out.println(method2(0));
        method3(5);
        method3(0);
    }

    static boolean method1(int a)
    {
        if( a > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static String method2(int a)
    {
        if(method1(a))
        {
            return "Number is greater then zero";
        }
        else
        {
            return "number is zero or less";
        }
    }

    static void method3(int x)
    {
        System.out.println(method2(x)+ " and equal to " + x);
    }
}
