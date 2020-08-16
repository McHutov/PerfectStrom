package Module2.lesson1;

import java.util.Date;

public class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void meditation()
    {
        Date d = new Date();
        System.out.println("I think - it means I exist. " + this.name + d.toString());
    }
}
