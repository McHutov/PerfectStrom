package Module2.lesson8.Task3;

public class Main {
    public static void main(String[] args) {
        String password = "Lp!%l1";
        System.out.println(password.matches("(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*]{6,}"));
    }
}
