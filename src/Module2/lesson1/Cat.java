package Module2.lesson1;

public class Cat
{
    String name;
    int age;
    Breed breed;
    Person owner;

    public Cat(String name, int age, Breed breed, Person owner) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                ", owner=" + owner +
                '}';
    }
}

enum Breed
{
    SIAMESE,NEBELUNG,BIRMAN;
}

