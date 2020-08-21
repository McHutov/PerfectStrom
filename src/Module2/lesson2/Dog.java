package Module2.lesson2;

public class Dog
{
    private String name;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!( this instanceof Dog)) return false;

        Dog dog = (Dog) o;

        return name != null ? name.equals(dog.name) : dog.name == null;
    }


}
