package Module2.lesson3;

public class ProgramTask31{
    public static void main(String args[])
    {
        Builder builder = new Builder("Bob", 17);
        Doctor doctor = new Doctor("Tot", 18);
        Programmer programmer = new Programmer("Dod", 19);

        builder.build();
        builder.drug();
        builder.workInfo();

        doctor.heal();
        doctor.think();
        doctor.workInfo();

        programmer.programming();
        programmer.think();
        programmer.workInfo();

        /*
        Can an abstract class be instantiated? Сannot be instantiated
        Is it possible to define a constructor for an abstract class? Yes
        Can there be a non-abstract method in an abstract class? Yes
        Can there be abstract and non-abstract methods in an abstract class? Yes
        Can there be an abstract method in a non-abstract class? No
        Can a non-abstract method be overridden? Yes
        Are all methods of an interface abstract? Yes
        Is it possible to create an interface without a method? Yes
        What is the difference between an abstract class and an interface?
        Although interfaces are like abstract classes,
        they provide the additional ability to implement multiple
        interfaces in a single class. In contrast, a class can only inherit
        from one superclass (abstract or non-abstract).
         */
    }
}
