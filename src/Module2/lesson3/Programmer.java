package Module2.lesson3;

public class Programmer extends Employee implements Intellectual{
    public Programmer(String name, int age) {
        super(name, age);
    }

    public void programming(){
        System.out.println("Programming");
    }
    @Override
    public void workInfo() {
        System.out.println("I'am a programmer!");
    }

    @Override
    public void think() {
        System.out.println("Thinks");
    }
}
