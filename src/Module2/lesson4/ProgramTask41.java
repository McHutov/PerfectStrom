package Module2.lesson4;

public class ProgramTask41 {
    public static void main(String args[])
    {
        Test test = new Test();
        test.setA(5);
        test.setB(6);

        System.out.println(test.getA());
        System.out.println(test.getB());
    }
}

class Test
{
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
