package Module2.lesson3;

public class Doctor extends Employee implements Intellectual{

    public Doctor(String name, int age) {
        super(name, age);
    }

    public void heal(){
        System.out.println("Heals");
    }
    @Override
    public void workInfo() {
        System.out.println("I'am a doctor!");
    }

    @Override
    public void think() {
        System.out.println("Thinks");
    }
}
