package Module2.lesson1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class ProgramTask11
{
    public static void main(String args[])
    {
        Person person = new Person("Deckard Cain", 68);
        person.meditation();

        Person owner = new Person("Stepan", 30);
        Cat cat = new Cat("Murzik",5,Breed.NEBELUNG,owner );
        System.out.println(cat);

        Person []people = new Person[6];
        people[0] = new Person("Deckart Cain", 33);
        people[1] = new Person("Van Helsing", 17);
        people[2] = new Person("Gannibal", 85);
        people[3] = new Person("Altair", 25);
        people[4] = new Person("Sam", 36);
        people[5] = new Person("Dastan Makhutov", 18);

        Arrays.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sortin by name: ");
        System.out.println(Arrays.toString(people));
        System.out.println();
        System.out.println("Sortin by age: ");
        Arrays.sort(people,Comparator.comparing(Person::getAge));
        System.out.println(Arrays.toString(people));
    }
}


