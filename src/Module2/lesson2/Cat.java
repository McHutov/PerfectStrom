package Module2.lesson2;

public class Cat
{
    private String name;
    private  int age;
    private Breed breed;

    public Cat(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}

enum Breed
{
    SIAMESE,NEBELUNG,BIRMAN;
}

