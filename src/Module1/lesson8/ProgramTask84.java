package Module1.lesson8;

public class ProgramTask84
{
    public static void main(String args[])
    {
        rec(5);
    }

    static void rec(int a)
    {
        if (a == -1)
        {
            return;
        }
        rec(a-1);
        System.out.println(a);
    }

    /*
    1.What does recursion compare to?
    ?
    2.What error can the careless use of recursion cause?
        Stack overflow
     */
}
