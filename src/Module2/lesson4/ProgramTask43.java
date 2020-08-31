package Module2.lesson4;

import javax.sound.sampled.Line;

public class ProgramTask43
{
    public static void main(String args[])
    {
        Lion l = new Lion();
        Lion l2 = new Lion();
        l2.name = "Leopard";
        l.specialMethod(l2);

        System.out.println(l.name);
    }
}

class Lion
{
    String name;

    void specialMethod(Lion l)
    {
        name = l.name;
    }
}

/**
 *4.What would be displayed in the console?
 * 5
 * 6
 *5.What would be displayed in the console?
 *  There will be compile error since variable avg initializes inside
 *  of if-else
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