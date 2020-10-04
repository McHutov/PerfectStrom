package Module2.lesson9;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Tomas", 32);
        Programmer.Stack stack = new Programmer.Stack(new String[]{"Java", "Spring", "Kotlin", "Postgresql", "Conspiracy theory"});

        System.out.println(programmer.analysis(stack));
    }
}
