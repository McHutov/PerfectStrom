package Module1.lesson4;

public class ProgramTask45
{
    public static void main(String Args[])
    {
        boolean bOne = true;
        boolean bTwo = false;
        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(!bOne);
        System.out.println(!bTwo);
        System.out.println(bOne^bTwo);
        System.out.println(bOne & bTwo);
        System.out.println(bOne | bTwo);

        bTwo = true;

        System.out.println("===========");
        System.out.println(bOne && bTwo);
        System.out.println(bOne || bTwo);
        System.out.println(!bOne);
        System.out.println(!bTwo);
        System.out.println(bOne^bTwo);
        System.out.println(bOne & bTwo);
        System.out.println(bOne | bTwo);

        System.out.println("========");
        System.out.println(true || false);
        System.out.println(false && true);
        System.out.println(!true || 1 >= 0);
        //System.out.println(false && 5);
        System.out.println(true && !false);
        System.out.println(true ^! true);
        System.out.println(1 >= 1 || false);
        //System.out.println(true && 5-5);

        /*
        1)What type do logical operators return? boolean
        2)What is the difference between the logical operator NOT (!) And the rest? Operation NOT(!) is unary operation
        3)What's the difference between shorthand and regular boolean operators?
        Firstly, we can use regular operators not only with boolean data type also we can use it with integers. On the
        other hand, shorthand operators do not consider the situation if the first expression is true, then the second
        is not considered, or if first situation is equal to false, then the second situation is not considered.


        a. true || false    - true
        b. false && true    - false
        c. !true || 1 >= 0  - true
        d. false && 5       - mistake
        e. true && !false   - true
        f. true ^! true     - true
        i. 1> = 1 || false  - true
        g. true && 5 - 5    - misitake

       */

    }
}
