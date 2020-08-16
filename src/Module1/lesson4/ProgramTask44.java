package Module1.lesson4;

public class ProgramTask44
{
    public static void main(String args[])
    {
        int a = 3;
        int b = 5;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        a = 5;
        System.out.println("=========");
        System.out.println(a > b);
        System.out.println(a < b);  // since a isn't small b the result is equal to false
        System.out.println(a >= b); // if a is bigger or equals to b the result returns true,
                                    // since a equals to b result is equal to true
        System.out.println(a <= b);
        System.out.println(a == b); // since a is equal to b the result is equal to true
        System.out.println(a != b); // since a is not equal to b the result is equal to false

        //What data type does the comparison operator return? It returs data type boolean
        boolean result = a != b;

        System.out.println("The result of boolean:" + result);
    }
}
