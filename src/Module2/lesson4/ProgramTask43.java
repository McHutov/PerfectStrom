package Module2.lesson4;

public class ProgramTask43
{
    public static void main(String args[])
    {
        Lion l = new Lion();
        l.specialMethod("Leopard");

        System.out.println(l.name);
    }
}

class Lion
{
    String name;

    void specialMethod(String n)
    {
        name = n;
    }
}

/**
 *4.What would be displayed in the console?
 *It will not compile
 *
 *5.What would be displayed in the console?
 *There is no main class, respectively  the program will not start
 *
 *6.What would be displayed in the console?
 * String2
 * String5
 * String6
 * String3
 * String4
 * String7
 * String1
 *
 */