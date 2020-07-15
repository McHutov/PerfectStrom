package lesson3;

public class ProgramTask39
{
    public static void main(String args[])
    {
        int x = 100;
        Example example = new Example(2,5);
        // the main difference is that we can transmit any values with which we can work
        System.out.println(example.mult());
        // also we can call methods that belong to our class

        /*
        Answer 1: In stack we can store primitive types and also references to the object;
        Answer 2: Approximate sizes Wrapper classes:
        Integer - 16 bytes
        Long -24 bytes
        Double 24 bytes
        Boolean-16 bytes
         */
    }
}

class Example
{
    private int a;
    private int b;
    Example(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public int mult()
    {
        return a * b;
    }
}
