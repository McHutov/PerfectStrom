package Module2.lesson3;

public class Builder extends Employee implements Strongman {
    public Builder(String name, int age) {
        super(name, age);
    }

    public void build(){
        System.out.println("Builds");
    }

    @Override
    public void workInfo() {
        System.out.println("I'am a builder!");
    }

    @Override
    public void drug() {
        System.out.println("Drugs");
    }
}
