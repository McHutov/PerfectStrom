package Module2.lesson4;

public class ProgramTask42
{
    public static void main(String args[])
    {
        Test2 t1 = new Test2();
        Test2 t2 = new Test2();
        Test2 t3 = new Test2();
        Test2 t4 = new Test2();

        System.out.println(Test2.count);
    }
}

class Test2
{
    static int count = 0;
    Test2()
    {
        count++;
    }
}
