package Module1.lesson4;

public class ProgramTask47
{
    public static void main(String args[])
    {
        int a = 10;     // 0000 1010 || 0001 0100 || 0000 0101 ||
        int b = a << 1;
        int c = b >> 2;
        int d = c >>> 1;
        a = -192;
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a >>> 2);

        /*
        1.Why did the number become large and positive?
            zero, regardless of its original value, is inserted in the
            place of the most significant bit, because of this, number become large and positive.
        2.What is the difference between the operator (>>>) and (>>)?
        As shown above, on each execution, the operator (>>) automatically fills the high-order
        bit with its previous content. As a result, the sign of the value is preserved. In these (>>>)
        cases, a zero shift is required to the position of the most significant bit, regardless of its
        original value. This is called a sign-insensitive right shift, when a zero is always inserted at the
        most significant bit position.
         */

        //11000000
    }
}
