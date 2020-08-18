package Module2.lesson2;

public class ProgramTask21
{
    public static void main(String args[])
    {
        Cat cat = new Cat("Murzik",5, Breed.BIRMAN );
        Cat cat1 = new Cat("Tuzik",6, Breed.NEBELUNG );
        Cat cat2 = new Cat("Kuzik",7, Breed.SIAMESE);

        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);

        Human human = new Human("Tony");
        System.out.println(human.hashCode());

        Dog dog1 = new Dog("Sobaka");
        Dog dog2 = new Dog("Sobaka");

        System.out.println(dog1.equals(dog2));

        /*
            How many items will be scrapped after line 7?
            Object a = new Integer(100);  // Line1
            Object b = new Long(100);     // Line2
            Object c = new String("100"); // Line3
            a = null;                     // Line4
            a = c;                        // Line5
            c = b;                        // Line6
            b = a;                        // Line7

            1 item will be will be scrapped;
         */

    }
}
