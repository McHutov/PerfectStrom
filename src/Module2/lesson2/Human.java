package Module2.lesson2;

public class Human
{
    String name;

    Human(String name)
    {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int result;
        result = 31 * name.length() + (name != null ? name.hashCode() : 0);
        return result;
    }
}
