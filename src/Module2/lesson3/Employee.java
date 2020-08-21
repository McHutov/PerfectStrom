package Module2.lesson3;

public abstract class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void speak()
    {
        System.out.println("Hi, my name is " + name + " I'm " + age + " years old.");
    }

    public abstract void workInfo();
}
