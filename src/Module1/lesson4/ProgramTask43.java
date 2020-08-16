package Module1.lesson4;

public class ProgramTask43
{
    public static void main(String args[])
    {
        int a = 0;
        int b = 5;
        a++;
        b--;
        System.out.println(a);
        System.out.println(b);
        a = --b;
        /*
        It's pre - decrement, here, first of all, b is decreased by one, and then b embezzles to a
         */
        System.out.println(a);
        System.out.println(b);
        a = b--;
        /*
        It's post - decrement, here, firstly, b embezzles to a, after that b is decreased by one
         */
        System.out.println(a);
        System.out.println(b);

        /*
        ++x pre-increment
        x++ post-increment
        --x pre-decrement
        x-- post-decrement
         */


    }
}
